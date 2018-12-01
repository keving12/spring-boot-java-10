import com.kg.formulaone.impl.ChampionshipServiceImpl
import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class ChampionshipServiceSpec extends Specification {

    def championshipService = new ChampionshipServiceImpl()

    def "should return #driver and #constructor when year is #year"() {
        when:
        def result = championshipService.winners(year)

        then:
        result.driver == driver
        result.constructor == constructor

        where:

        driver                  | constructor       | year
        'Michael Schumacher'    | 'Ferrari'         | 2000
        'Michael Schumacher'    | 'Ferrari'         | 2001
        'Michael Schumacher'    | 'Ferrari'         | 2002
        'Michael Schumacher'    | 'Ferrari'         | 2003
        'Michael Schumacher'    | 'Ferrari'         | 2004
        'Fernando Alonso'       | 'Renault'         | 2005
        'Fernando Alonso'       | 'Renault'         | 2006
        'Kimi Raikkonen'        | 'Ferrari'         | 2007
        'Lewis Hamilton'        | 'Ferrari'         | 2008
        'Jenson Button'         | 'Brawn GP'        | 2009
        'Sebastian Vettel'      | 'Red Bull'        | 2010
        'Sebastian Vettel'      | 'Red Bull'        | 2011
        'Sebastian Vettel'      | 'Red Bull'        | 2012
        'Sebastian Vettel'      | 'Red Bull'        | 2013
        'Lewis Hamilton'        | 'Mercedes'        | 2014
        'Lewis Hamilton'        | 'Mercedes'        | 2015
        'Nico Rosberg'          | 'Mercedes'        | 2016
        'Lewis Hamilton'        | 'Mercedes'        | 2017
        'Lewis Hamilton'        | 'Mercedes'        | 2018
        'Unknown'               | 'Unknown'         | 2019
    }
}
