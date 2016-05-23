using System;
using System.Collections.Generic;
using System.Text;

namespace DemoJenkins_NetClient.BussLog 
{
    
    public class CalculadoraFacade
    {
        private static DemoJenkins_JavaServer.CalculadoraWSClient ws = null;

        private static void Initialize()
        {
            ws = new DemoJenkins_JavaServer.CalculadoraWSClient();
        }
        public static int Suma(int x, int y)
        {
            Initialize();
            return ws.Suma(x, y);
        }

        public static int Resta(int x, int y)
        {
            Initialize();
            return ws.Resta(x, y);
        }
    }
}
