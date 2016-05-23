using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace DemoJenkins_NetClient
{
    public partial class Form1 : Form
    {
        public Form1()
        {
            InitializeComponent();
        }

        private void button1_Click(object sender, EventArgs e)
        {
            DemoJenkins_JavaServer.CalculadoraWSClient ws = new DemoJenkins_JavaServer.CalculadoraWSClient();
            
            int a = Convert.ToInt32(textBox1.Text);
            int b = Convert.ToInt32(textBox3.Text);
            int suma = ws.Suma(a, b);
            textBox2.Text = suma.ToString();
        }
    }
}
