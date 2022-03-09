package com.qurannnappp.quran.ui;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.qurannnappp.quran.ui.pages.*;
import com.qurannnappp.quran.R;
import com.qurannnappp.quran.ui.pages.*;

public class SecondActivity extends AppCompatActivity {
    /**
     * The number of pages (wizard steps) to show in this demo.
     */
    private static final int NUM_PAGES = 604 ;

    /**
     * The pager widget, which handles animation and allows swiping horizontally to access previous
     * and next wizard steps.
     */
    private ViewPager2 viewPager;

    /**
     * The pager adapter, which provides the pages to the view pager widget.
     */
    private FragmentStateAdapter pagerAdapter;
    private int numbundle;
    private static final String TAG = "secondActivity";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        numbundle = getIntent().getIntExtra("key",0);

        ActionBar actionBar = this.getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);


        viewPager = findViewById(R.id.pager);
        pagerAdapter = new ScreenSlidePagerAdapter(this);



    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_items_2, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()){
            case R.id.page1:
                viewPager.setCurrentItem(0,false);
                break;
            case R.id.page2:
                viewPager.setCurrentItem(1,false);
                break;
            case R.id.page3:
                viewPager.setCurrentItem(2,false);
                break;
            case R.id.page4:
                viewPager.setCurrentItem(3,false);
                break;
            case R.id.page5:
                viewPager.setCurrentItem(4,false);
                break;
            case R.id.page6:
                viewPager.setCurrentItem(5,false);
                break;
            case R.id.page7:
                viewPager.setCurrentItem(6,false);
                break;
            case R.id.page8:
                viewPager.setCurrentItem(7,false);
                break;
            case R.id.page9:
                viewPager.setCurrentItem(8,false);
                break;
            case R.id.page10:
                viewPager.setCurrentItem(9,false);
                break;
            case R.id.page11:
                viewPager.setCurrentItem(10,false);
                break;
            case R.id.page12:
                viewPager.setCurrentItem(11,false);
                break;
            case R.id.page13:
                viewPager.setCurrentItem(12,false);
                break;
            case R.id.page14:
                viewPager.setCurrentItem(13,false);
                break;
            case R.id.page15:
                viewPager.setCurrentItem(14,false);
                break;
            case R.id.page16:
                viewPager.setCurrentItem(15,false);
                break;
            case R.id.page17:
                viewPager.setCurrentItem(16,false);
                break;
            case R.id.page18:
                viewPager.setCurrentItem(17,false);
                break;
            case R.id.page19:
                viewPager.setCurrentItem(18,false);
                break;
            case R.id.page20:
                viewPager.setCurrentItem(19,false);
                break;
            case R.id.page21:
                viewPager.setCurrentItem(20,false);
                break;
            case R.id.page22:
                viewPager.setCurrentItem(21,false);
                break;
            case R.id.page23:
                viewPager.setCurrentItem(22,false);
                break;
            case R.id.page24:
                viewPager.setCurrentItem(23,false);
                break;
            case R.id.page25:
                viewPager.setCurrentItem(24,false);
                break;
            case R.id.page26:
                viewPager.setCurrentItem(25,false);
                break;
            case R.id.page27:
                viewPager.setCurrentItem(26,false);
                break;
            case R.id.page28:
                viewPager.setCurrentItem(27,false);
                break;
            case R.id.page29:
                viewPager.setCurrentItem(28,false);
                break;
            case R.id.page30:
                viewPager.setCurrentItem(29,false);
                break;
            case R.id.page31:
                viewPager.setCurrentItem(30,false);
                break;
            case R.id.page32:
                viewPager.setCurrentItem(31,false);
                break;
            case R.id.page33:
                viewPager.setCurrentItem(32,false);
                break;
            case R.id.page34:
                viewPager.setCurrentItem(33,false);
                break;
            case R.id.page35:
                viewPager.setCurrentItem(34,false);
                break;
            case R.id.page36:
                viewPager.setCurrentItem(35,false);
                break;
            case R.id.page37:
                viewPager.setCurrentItem(36,false);
                break;
            case R.id.page38:
                viewPager.setCurrentItem(37,false);
                break;
            case R.id.page39:
                viewPager.setCurrentItem(38,false);
                break;
            case R.id.page40:
                viewPager.setCurrentItem(39,false);
                break;
            case R.id.page41:
                viewPager.setCurrentItem(40,false);
                break;
            case R.id.page42:
                viewPager.setCurrentItem(41,false);
                break;
            case R.id.page43:
                viewPager.setCurrentItem(42,false);
                break;
            case R.id.page44:
                viewPager.setCurrentItem(43,false);
                break;
            case R.id.page45:
                viewPager.setCurrentItem(44,false);
                break;
            case R.id.page46:
                viewPager.setCurrentItem(45,false);
                break;
            case R.id.page47:
                viewPager.setCurrentItem(46,false);
                break;
            case R.id.page48:
                viewPager.setCurrentItem(47,false);
                break;
            case R.id.page49:
                viewPager.setCurrentItem(48,false);
                break;
            case R.id.page50:
                viewPager.setCurrentItem(49,false);
                break;
            case R.id.page51:
                viewPager.setCurrentItem(50,false);
                break;
            case R.id.page52:
                viewPager.setCurrentItem(51,false);
                break;
            case R.id.page53:
                viewPager.setCurrentItem(52,false);
                break;
            case R.id.page54:
                viewPager.setCurrentItem(53,false);
                break;
            case R.id.page55:
                viewPager.setCurrentItem(54,false);
                break;
            case R.id.page56:
                viewPager.setCurrentItem(55,false);
                break;
            case R.id.page57:
                viewPager.setCurrentItem(56,false);
                break;
            case R.id.page58:
                viewPager.setCurrentItem(57,false);
                break;
            case R.id.page59:
                viewPager.setCurrentItem(58,false);
                break;
            case R.id.page60:
                viewPager.setCurrentItem(59,false);
                break;
            case R.id.page61:
                viewPager.setCurrentItem(60,false);
                break;
            case R.id.page62:
                viewPager.setCurrentItem(61,false);
                break;
            case R.id.page63:
                viewPager.setCurrentItem(62,false);
                break;
            case R.id.page64:
                viewPager.setCurrentItem(63,false);
                break;
            case R.id.page65:
                viewPager.setCurrentItem(64,false);
                break;
            case R.id.page66:
                viewPager.setCurrentItem(65,false);
                break;
            case R.id.page67:
                viewPager.setCurrentItem(66,false);
                break;
            case R.id.page68:
                viewPager.setCurrentItem(67,false);
                break;
            case R.id.page69:
                viewPager.setCurrentItem(68,false);
                break;
            case R.id.page70:
                viewPager.setCurrentItem(69,false);
                break;
            case R.id.page71:
                viewPager.setCurrentItem(70,false);
                break;
            case R.id.page72:
                viewPager.setCurrentItem(71,false);
                break;
            case R.id.page73:
                viewPager.setCurrentItem(72,false);
                break;
            case R.id.page74:
                viewPager.setCurrentItem(73,false);
                break;
            case R.id.page75:
                viewPager.setCurrentItem(74,false);
                break;
            case R.id.page76:
                viewPager.setCurrentItem(75,false);
                break;
            case R.id.page77:
                viewPager.setCurrentItem(76,false);
                break;
            case R.id.page78:
                viewPager.setCurrentItem(77,false);
                break;
            case R.id.page79:
                viewPager.setCurrentItem(78,false);
                break;
            case R.id.page80:
                viewPager.setCurrentItem(79,false);
                break;
            case R.id.page81:
                viewPager.setCurrentItem(80,false);
                break;
            case R.id.page82:
                viewPager.setCurrentItem(81,false);
                break;
            case R.id.page83:
                viewPager.setCurrentItem(82,false);
                break;
            case R.id.page84:
                viewPager.setCurrentItem(83,false);
                break;
            case R.id.page85:
                viewPager.setCurrentItem(84,false);
                break;
            case R.id.page86:
                viewPager.setCurrentItem(85,false);
                break;
            case R.id.page87:
                viewPager.setCurrentItem(86,false);
                break;
            case R.id.page88:
                viewPager.setCurrentItem(87,false);
                break;
            case R.id.page89:
                viewPager.setCurrentItem(88,false);
                break;
            case R.id.page90:
                viewPager.setCurrentItem(89,false);
                break;
            case R.id.page91:
                viewPager.setCurrentItem(90,false);
                break;
            case R.id.page92:
                viewPager.setCurrentItem(91,false);
                break;
            case R.id.page93:
                viewPager.setCurrentItem(92,false);
                break;
            case R.id.page94:
                viewPager.setCurrentItem(93,false);
                break;
            case R.id.page95:
                viewPager.setCurrentItem(94,false);
                break;
            case R.id.page96:
                viewPager.setCurrentItem(95,false);
                break;
            case R.id.page97:
                viewPager.setCurrentItem(96,false);
                break;
            case R.id.page98:
                viewPager.setCurrentItem(97,false);
                break;
            case R.id.page99:
                viewPager.setCurrentItem(98,false);
                break;
            case R.id.page100:
                viewPager.setCurrentItem(99,false);
                break;
            case R.id.page101:
                viewPager.setCurrentItem(100,false);
                break;
            case R.id.page102:
                viewPager.setCurrentItem(101,false);
                break;
            case R.id.page103:
                viewPager.setCurrentItem(102,false);
                break;
            case R.id.page104:
                viewPager.setCurrentItem(103,false);
                break;
            case R.id.page105:
                viewPager.setCurrentItem(104,false);
                break;
            case R.id.page106:
                viewPager.setCurrentItem(105,false);
                break;
            case R.id.page107:
                viewPager.setCurrentItem(106,false);
                break;
            case R.id.page108:
                viewPager.setCurrentItem(107,false);
                break;
            case R.id.page109:
                viewPager.setCurrentItem(108,false);
                break;
            case R.id.page110:
                viewPager.setCurrentItem(109,false);
                break;
            case R.id.page111:
                viewPager.setCurrentItem(110,false);
                break;
            case R.id.page112:
                viewPager.setCurrentItem(111,false);
                break;
            case R.id.page113:
                viewPager.setCurrentItem(112,false);
                break;
            case R.id.page114:
                viewPager.setCurrentItem(113,false);
                break;
            case R.id.page115:
                viewPager.setCurrentItem(114,false);
                break;
            case R.id.page116:
                viewPager.setCurrentItem(115,false);
                break;
            case R.id.page117:
                viewPager.setCurrentItem(116,false);
                break;
            case R.id.page118:
                viewPager.setCurrentItem(117,false);
                break;
            case R.id.page119:
                viewPager.setCurrentItem(118,false);
                break;
            case R.id.page120:
                viewPager.setCurrentItem(119,false);
                break;
            case R.id.page121:
                viewPager.setCurrentItem(120,false);
                break;
            case R.id.page122:
                viewPager.setCurrentItem(121,false);
                break;
            case R.id.page123:
                viewPager.setCurrentItem(122,false);
                break;
            case R.id.page124:
                viewPager.setCurrentItem(123,false);
                break;
            case R.id.page125:
                viewPager.setCurrentItem(124,false);
                break;
            case R.id.page126:
                viewPager.setCurrentItem(125,false);
                break;
            case R.id.page127:
                viewPager.setCurrentItem(126,false);
                break;
            case R.id.page128:
                viewPager.setCurrentItem(127,false);
                break;
            case R.id.page129:
                viewPager.setCurrentItem(128,false);
                break;
            case R.id.page130:
                viewPager.setCurrentItem(129,false);
                break;
            case R.id.page131:
                viewPager.setCurrentItem(130,false);
                break;
            case R.id.page132:
                viewPager.setCurrentItem(131,false);
                break;
            case R.id.page133:
                viewPager.setCurrentItem(132,false);
                break;
            case R.id.page134:
                viewPager.setCurrentItem(133,false);
                break;
            case R.id.page135:
                viewPager.setCurrentItem(134,false);
                break;
            case R.id.page136:
                viewPager.setCurrentItem(135,false);
                break;
            case R.id.page137:
                viewPager.setCurrentItem(136,false);
                break;
            case R.id.page138:
                viewPager.setCurrentItem(137,false);
                break;
            case R.id.page139:
                viewPager.setCurrentItem(138,false);
                break;
            case R.id.page140:
                viewPager.setCurrentItem(139,false);
                break;
            case R.id.page141:
                viewPager.setCurrentItem(140,false);
                break;
            case R.id.page142:
                viewPager.setCurrentItem(141,false);
                break;
            case R.id.page143:
                viewPager.setCurrentItem(142,false);
                break;
            case R.id.page144:
                viewPager.setCurrentItem(143,false);
                break;
            case R.id.page145:
                viewPager.setCurrentItem(144,false);
                break;
            case R.id.page146:
                viewPager.setCurrentItem(145,false);
                break;
            case R.id.page147:
                viewPager.setCurrentItem(146,false);
                break;
            case R.id.page148:
                viewPager.setCurrentItem(147,false);
                break;
            case R.id.page149:
                viewPager.setCurrentItem(148,false);
                break;
            case R.id.page150:
                viewPager.setCurrentItem(149,false);
                break;
            case R.id.page151:
                viewPager.setCurrentItem(150,false);
                break;
            case R.id.page152:
                viewPager.setCurrentItem(151,false);
                break;
            case R.id.page153:
                viewPager.setCurrentItem(152,false);
                break;
            case R.id.page154:
                viewPager.setCurrentItem(153,false);
                break;
            case R.id.page155:
                viewPager.setCurrentItem(154,false);
                break;
            case R.id.page156:
                viewPager.setCurrentItem(155,false);
                break;
            case R.id.page157:
                viewPager.setCurrentItem(156,false);
                break;
            case R.id.page158:
                viewPager.setCurrentItem(157,false);
                break;
            case R.id.page159:
                viewPager.setCurrentItem(158,false);
                break;
            case R.id.page160:
                viewPager.setCurrentItem(159,false);
                break;
            case R.id.page161:
                viewPager.setCurrentItem(160,false);
                break;
            case R.id.page162:
                viewPager.setCurrentItem(161,false);
                break;
            case R.id.page163:
                viewPager.setCurrentItem(162,false);
                break;
            case R.id.page164:
                viewPager.setCurrentItem(163,false);
                break;
            case R.id.page165:
                viewPager.setCurrentItem(164,false);
                break;
            case R.id.page166:
                viewPager.setCurrentItem(165,false);
                break;
            case R.id.page167:
                viewPager.setCurrentItem(166,false);
                break;
            case R.id.page168:
                viewPager.setCurrentItem(167,false);
                break;
            case R.id.page169:
                viewPager.setCurrentItem(168,false);
                break;
            case R.id.page170:
                viewPager.setCurrentItem(169,false);
                break;
            case R.id.page171:
                viewPager.setCurrentItem(170,false);
                break;
            case R.id.page172:
                viewPager.setCurrentItem(171,false);
                break;
            case R.id.page173:
                viewPager.setCurrentItem(172,false);
                break;
            case R.id.page174:
                viewPager.setCurrentItem(173,false);
                break;
            case R.id.page175:
                viewPager.setCurrentItem(174,false);
                break;
            case R.id.page176:
                viewPager.setCurrentItem(175,false);
                break;
            case R.id.page177:
                viewPager.setCurrentItem(176,false);
                break;
            case R.id.page178:
                viewPager.setCurrentItem(177,false);
                break;
            case R.id.page179:
                viewPager.setCurrentItem(178,false);
                break;
            case R.id.page180:
                viewPager.setCurrentItem(179,false);
                break;
            case R.id.page181:
                viewPager.setCurrentItem(180,false);
                break;
            case R.id.page182:
                viewPager.setCurrentItem(181,false);
                break;
            case R.id.page183:
                viewPager.setCurrentItem(182,false);
                break;
            case R.id.page184:
                viewPager.setCurrentItem(183,false);
                break;
            case R.id.page185:
                viewPager.setCurrentItem(184,false);
                break;
            case R.id.page186:
                viewPager.setCurrentItem(185,false);
                break;
            case R.id.page187:
                viewPager.setCurrentItem(186,false);
                break;
            case R.id.page188:
                viewPager.setCurrentItem(187,false);
                break;
            case R.id.page189:
                viewPager.setCurrentItem(188,false);
                break;
            case R.id.page190:
                viewPager.setCurrentItem(189,false);
                break;
            case R.id.page191:
                viewPager.setCurrentItem(190,false);
                break;
            case R.id.page192:
                viewPager.setCurrentItem(191,false);
                break;
            case R.id.page193:
                viewPager.setCurrentItem(192,false);
                break;
            case R.id.page194:
                viewPager.setCurrentItem(193,false);
                break;
            case R.id.page195:
                viewPager.setCurrentItem(194,false);
                break;
            case R.id.page196:
                viewPager.setCurrentItem(195,false);
                break;
            case R.id.page197:
                viewPager.setCurrentItem(196,false);
                break;
            case R.id.page198:
                viewPager.setCurrentItem(197,false);
                break;
            case R.id.page199:
                viewPager.setCurrentItem(198,false);
                break;
            case R.id.page200:
                viewPager.setCurrentItem(199,false);
                break;
            case R.id.page201:
                viewPager.setCurrentItem(200,false);
                break;
            case R.id.page202:
                viewPager.setCurrentItem(201,false);
                break;
            case R.id.page203:
                viewPager.setCurrentItem(202,false);
                break;
            case R.id.page204:
                viewPager.setCurrentItem(203,false);
                break;
            case R.id.page205:
                viewPager.setCurrentItem(204,false);
                break;
            case R.id.page206:
                viewPager.setCurrentItem(205,false);
                break;
            case R.id.page207:
                viewPager.setCurrentItem(206,false);
                break;
            case R.id.page208:
                viewPager.setCurrentItem(207,false);
                break;
            case R.id.page209:
                viewPager.setCurrentItem(208,false);
                break;
            case R.id.page210:
                viewPager.setCurrentItem(209,false);
                break;
            case R.id.page211:
                viewPager.setCurrentItem(210,false);
                break;
            case R.id.page212:
                viewPager.setCurrentItem(211,false);
                break;
            case R.id.page213:
                viewPager.setCurrentItem(212,false);
                break;
            case R.id.page214:
                viewPager.setCurrentItem(213,false);
                break;
            case R.id.page215:
                viewPager.setCurrentItem(214,false);
                break;
            case R.id.page216:
                viewPager.setCurrentItem(215,false);
                break;
            case R.id.page217:
                viewPager.setCurrentItem(216,false);
                break;
            case R.id.page218:
                viewPager.setCurrentItem(217,false);
                break;
            case R.id.page219:
                viewPager.setCurrentItem(218,false);
                break;
            case R.id.page220:
                viewPager.setCurrentItem(219,false);
                break;
            case R.id.page221:
                viewPager.setCurrentItem(220,false);
                break;
            case R.id.page222:
                viewPager.setCurrentItem(221,false);
                break;
            case R.id.page223:
                viewPager.setCurrentItem(222,false);
                break;
            case R.id.page224:
                viewPager.setCurrentItem(223,false);
                break;
            case R.id.page225:
                viewPager.setCurrentItem(224,false);
                break;
            case R.id.page226:
                viewPager.setCurrentItem(225,false);
                break;
            case R.id.page227:
                viewPager.setCurrentItem(226,false);
                break;
            case R.id.page228:
                viewPager.setCurrentItem(227,false);
                break;
            case R.id.page229:
                viewPager.setCurrentItem(228,false);
                break;
            case R.id.page230:
                viewPager.setCurrentItem(229,false);
                break;
            case R.id.page231:
                viewPager.setCurrentItem(230,false);
                break;
            case R.id.page232:
                viewPager.setCurrentItem(231,false);
                break;
            case R.id.page233:
                viewPager.setCurrentItem(232,false);
                break;
            case R.id.page234:
                viewPager.setCurrentItem(233,false);
                break;
            case R.id.page235:
                viewPager.setCurrentItem(234,false);
                break;
            case R.id.page236:
                viewPager.setCurrentItem(235,false);
                break;
            case R.id.page237:
                viewPager.setCurrentItem(236,false);
                break;
            case R.id.page238:
                viewPager.setCurrentItem(237,false);
                break;
            case R.id.page239:
                viewPager.setCurrentItem(238,false);
                break;
            case R.id.page240:
                viewPager.setCurrentItem(239,false);
                break;
            case R.id.page241:
                viewPager.setCurrentItem(240,false);
                break;
            case R.id.page242:
                viewPager.setCurrentItem(241,false);
                break;
            case R.id.page243:
                viewPager.setCurrentItem(242,false);
                break;
            case R.id.page244:
                viewPager.setCurrentItem(243,false);
                break;
            case R.id.page245:
                viewPager.setCurrentItem(244,false);
                break;
            case R.id.page246:
                viewPager.setCurrentItem(245,false);
                break;
            case R.id.page247:
                viewPager.setCurrentItem(246,false);
                break;
            case R.id.page248:
                viewPager.setCurrentItem(247,false);
                break;
            case R.id.page249:
                viewPager.setCurrentItem(248,false);
                break;
            case R.id.page250:
                viewPager.setCurrentItem(249,false);
                break;
            case R.id.page251:
                viewPager.setCurrentItem(250,false);
                break;
            case R.id.page252:
                viewPager.setCurrentItem(251,false);
                break;
            case R.id.page253:
                viewPager.setCurrentItem(252,false);
                break;
            case R.id.page254:
                viewPager.setCurrentItem(253,false);
                break;
            case R.id.page255:
                viewPager.setCurrentItem(254,false);
                break;
            case R.id.page256:
                viewPager.setCurrentItem(255,false);
                break;
            case R.id.page257:
                viewPager.setCurrentItem(256,false);
                break;
            case R.id.page258:
                viewPager.setCurrentItem(257,false);
                break;
            case R.id.page259:
                viewPager.setCurrentItem(258,false);
                break;
            case R.id.page260:
                viewPager.setCurrentItem(259,false);
                break;
            case R.id.page261:
                viewPager.setCurrentItem(260,false);
                break;
            case R.id.page262:
                viewPager.setCurrentItem(261,false);
                break;
            case R.id.page263:
                viewPager.setCurrentItem(262,false);
                break;
            case R.id.page264:
                viewPager.setCurrentItem(263,false);
                break;
            case R.id.page265:
                viewPager.setCurrentItem(264,false);
                break;
            case R.id.page266:
                viewPager.setCurrentItem(265,false);
                break;
            case R.id.page267:
                viewPager.setCurrentItem(266,false);
                break;
            case R.id.page268:
                viewPager.setCurrentItem(267,false);
                break;
            case R.id.page269:
                viewPager.setCurrentItem(268,false);
                break;
            case R.id.page270:
                viewPager.setCurrentItem(269,false);
                break;
            case R.id.page271:
                viewPager.setCurrentItem(270,false);
                break;
            case R.id.page272:
                viewPager.setCurrentItem(271,false);
                break;
            case R.id.page273:
                viewPager.setCurrentItem(272,false);
                break;
            case R.id.page274:
                viewPager.setCurrentItem(273,false);
                break;
            case R.id.page275:
                viewPager.setCurrentItem(274,false);
                break;
            case R.id.page276:
                viewPager.setCurrentItem(275,false);
                break;
            case R.id.page277:
                viewPager.setCurrentItem(276,false);
                break;
            case R.id.page278:
                viewPager.setCurrentItem(277,false);
                break;
            case R.id.page279:
                viewPager.setCurrentItem(278,false);
                break;
            case R.id.page280:
                viewPager.setCurrentItem(279,false);
                break;
            case R.id.page281:
                viewPager.setCurrentItem(280,false);
                break;
            case R.id.page282:
                viewPager.setCurrentItem(281,false);
                break;
            case R.id.page283:
                viewPager.setCurrentItem(282,false);
                break;
            case R.id.page284:
                viewPager.setCurrentItem(283,false);
                break;
            case R.id.page285:
                viewPager.setCurrentItem(284,false);
                break;
            case R.id.page286:
                viewPager.setCurrentItem(285,false);
                break;
            case R.id.page287:
                viewPager.setCurrentItem(286,false);
                break;
            case R.id.page288:
                viewPager.setCurrentItem(287,false);
                break;
            case R.id.page289:
                viewPager.setCurrentItem(288,false);
                break;
            case R.id.page290:
                viewPager.setCurrentItem(289,false);
                break;
            case R.id.page291:
                viewPager.setCurrentItem(290,false);
                break;
            case R.id.page292:
                viewPager.setCurrentItem(291,false);
                break;
            case R.id.page293:
                viewPager.setCurrentItem(292,false);
                break;
            case R.id.page294:
                viewPager.setCurrentItem(293,false);
                break;
            case R.id.page295:
                viewPager.setCurrentItem(294,false);
                break;
            case R.id.page296:
                viewPager.setCurrentItem(295,false);
                break;
            case R.id.page297:
                viewPager.setCurrentItem(296,false);
                break;
            case R.id.page298:
                viewPager.setCurrentItem(297,false);
                break;
            case R.id.page299:
                viewPager.setCurrentItem(298,false);
                break;
            case R.id.page300:
                viewPager.setCurrentItem(299,false);
                break;
            case R.id.page301:
                viewPager.setCurrentItem(300,false);
                break;
            case R.id.page302:
                viewPager.setCurrentItem(301,false);
                break;
            case R.id.page303:
                viewPager.setCurrentItem(302,false);
                break;
            case R.id.page304:
                viewPager.setCurrentItem(303,false);
                break;
            case R.id.page305:
                viewPager.setCurrentItem(304,false);
                break;
            case R.id.page306:
                viewPager.setCurrentItem(305,false);
                break;
            case R.id.page307:
                viewPager.setCurrentItem(306,false);
                break;
            case R.id.page308:
                viewPager.setCurrentItem(307,false);
                break;
            case R.id.page309:
                viewPager.setCurrentItem(308,false);
                break;
            case R.id.page310:
                viewPager.setCurrentItem(309,false);
                break;
            case R.id.page311:
                viewPager.setCurrentItem(310,false);
                break;
            case R.id.page312:
                viewPager.setCurrentItem(311,false);
                break;
            case R.id.page313:
                viewPager.setCurrentItem(312,false);
                break;
            case R.id.page314:
                viewPager.setCurrentItem(313,false);
                break;
            case R.id.page315:
                viewPager.setCurrentItem(314,false);
                break;
            case R.id.page316:
                viewPager.setCurrentItem(315,false);
                break;
            case R.id.page317:
                viewPager.setCurrentItem(316,false);
                break;
            case R.id.page318:
                viewPager.setCurrentItem(317,false);
                break;
            case R.id.page319:
                viewPager.setCurrentItem(318,false);
                break;
            case R.id.page320:
                viewPager.setCurrentItem(319,false);
                break;
            case R.id.page321:
                viewPager.setCurrentItem(320,false);
                break;
            case R.id.page322:
                viewPager.setCurrentItem(321,false);
                break;
            case R.id.page323:
                viewPager.setCurrentItem(322,false);
                break;
            case R.id.page324:
                viewPager.setCurrentItem(323,false);
                break;
            case R.id.page325:
                viewPager.setCurrentItem(324,false);
                break;
            case R.id.page326:
                viewPager.setCurrentItem(325,false);
                break;
            case R.id.page327:
                viewPager.setCurrentItem(326,false);
                break;
            case R.id.page328:
                viewPager.setCurrentItem(327,false);
                break;
            case R.id.page329:
                viewPager.setCurrentItem(328,false);
                break;
            case R.id.page330:
                viewPager.setCurrentItem(329,false);
                break;
            case R.id.page331:
                viewPager.setCurrentItem(330,false);
                break;
            case R.id.page332:
                viewPager.setCurrentItem(331,false);
                break;
            case R.id.page333:
                viewPager.setCurrentItem(332,false);
                break;
            case R.id.page334:
                viewPager.setCurrentItem(333,false);
                break;
            case R.id.page335:
                viewPager.setCurrentItem(334,false);
                break;
            case R.id.page336:
                viewPager.setCurrentItem(335,false);
                break;
            case R.id.page337:
                viewPager.setCurrentItem(336,false);
                break;
            case R.id.page338:
                viewPager.setCurrentItem(337,false);
                break;
            case R.id.page339:
                viewPager.setCurrentItem(338,false);
                break;
            case R.id.page340:
                viewPager.setCurrentItem(339,false);
                break;
            case R.id.page341:
                viewPager.setCurrentItem(340,false);
                break;
            case R.id.page342:
                viewPager.setCurrentItem(341,false);
                break;
            case R.id.page343:
                viewPager.setCurrentItem(342,false);
                break;
            case R.id.page344:
                viewPager.setCurrentItem(343,false);
                break;
            case R.id.page345:
                viewPager.setCurrentItem(344,false);
                break;
            case R.id.page346:
                viewPager.setCurrentItem(345,false);
                break;
            case R.id.page347:
                viewPager.setCurrentItem(346,false);
                break;
            case R.id.page348:
                viewPager.setCurrentItem(347,false);
                break;
            case R.id.page349:
                viewPager.setCurrentItem(348,false);
                break;
            case R.id.page350:
                viewPager.setCurrentItem(349,false);
                break;
            case R.id.page351:
                viewPager.setCurrentItem(350,false);
                break;
            case R.id.page352:
                viewPager.setCurrentItem(351,false);
                break;
            case R.id.page353:
                viewPager.setCurrentItem(352,false);
                break;
            case R.id.page354:
                viewPager.setCurrentItem(353,false);
                break;
            case R.id.page355:
                viewPager.setCurrentItem(354,false);
                break;
            case R.id.page356:
                viewPager.setCurrentItem(355,false);
                break;
            case R.id.page357:
                viewPager.setCurrentItem(356,false);
                break;
            case R.id.page358:
                viewPager.setCurrentItem(357,false);
                break;
            case R.id.page359:
                viewPager.setCurrentItem(358,false);
                break;
            case R.id.page360:
                viewPager.setCurrentItem(359,false);
                break;
            case R.id.page361:
                viewPager.setCurrentItem(360,false);
                break;
            case R.id.page362:
                viewPager.setCurrentItem(361,false);
                break;
            case R.id.page363:
                viewPager.setCurrentItem(362,false);
                break;
            case R.id.page364:
                viewPager.setCurrentItem(363,false);
                break;
            case R.id.page365:
                viewPager.setCurrentItem(364,false);
                break;
            case R.id.page366:
                viewPager.setCurrentItem(365,false);
                break;
            case R.id.page367:
                viewPager.setCurrentItem(366,false);
                break;
            case R.id.page368:
                viewPager.setCurrentItem(367,false);
                break;
            case R.id.page369:
                viewPager.setCurrentItem(368,false);
                break;
            case R.id.page370:
                viewPager.setCurrentItem(369,false);
                break;
            case R.id.page371:
                viewPager.setCurrentItem(370,false);
                break;
            case R.id.page372:
                viewPager.setCurrentItem(371,false);
                break;
            case R.id.page373:
                viewPager.setCurrentItem(372,false);
                break;
            case R.id.page374:
                viewPager.setCurrentItem(373,false);
                break;
            case R.id.page375:
                viewPager.setCurrentItem(374,false);
                break;
            case R.id.page376:
                viewPager.setCurrentItem(375,false);
                break;
            case R.id.page377:
                viewPager.setCurrentItem(376,false);
                break;
            case R.id.page378:
                viewPager.setCurrentItem(377,false);
                break;
            case R.id.page379:
                viewPager.setCurrentItem(378,false);
                break;
            case R.id.page380:
                viewPager.setCurrentItem(379,false);
                break;
            case R.id.page381:
                viewPager.setCurrentItem(380,false);
                break;
            case R.id.page382:
                viewPager.setCurrentItem(381,false);
                break;
            case R.id.page383:
                viewPager.setCurrentItem(382,false);
                break;
            case R.id.page384:
                viewPager.setCurrentItem(383,false);
                break;
            case R.id.page385:
                viewPager.setCurrentItem(384,false);
                break;
            case R.id.page386:
                viewPager.setCurrentItem(385,false);
                break;
            case R.id.page387:
                viewPager.setCurrentItem(386,false);
                break;
            case R.id.page388:
                viewPager.setCurrentItem(387,false);
                break;
            case R.id.page389:
                viewPager.setCurrentItem(388,false);
                break;
            case R.id.page390:
                viewPager.setCurrentItem(389,false);
                break;
            case R.id.page391:
                viewPager.setCurrentItem(390,false);
                break;
            case R.id.page392:
                viewPager.setCurrentItem(391,false);
                break;
            case R.id.page393:
                viewPager.setCurrentItem(392,false);
                break;
            case R.id.page394:
                viewPager.setCurrentItem(393,false);
                break;
            case R.id.page395:
                viewPager.setCurrentItem(394,false);
                break;
            case R.id.page396:
                viewPager.setCurrentItem(395,false);
                break;
            case R.id.page397:
                viewPager.setCurrentItem(396,false);
                break;
            case R.id.page398:
                viewPager.setCurrentItem(397,false);
                break;
            case R.id.page399:
                viewPager.setCurrentItem(398,false);
                break;
            case R.id.page400:
                viewPager.setCurrentItem(399,false);
                break;
            case R.id.page401:
                viewPager.setCurrentItem(400,false);
                break;
            case R.id.page402:
                viewPager.setCurrentItem(401,false);
                break;
            case R.id.page403:
                viewPager.setCurrentItem(402,false);
                break;
            case R.id.page404:
                viewPager.setCurrentItem(403,false);
                break;
            case R.id.page405:
                viewPager.setCurrentItem(404,false);
                break;
            case R.id.page406:
                viewPager.setCurrentItem(405,false);
                break;
            case R.id.page407:
                viewPager.setCurrentItem(406,false);
                break;
            case R.id.page408:
                viewPager.setCurrentItem(407,false);
                break;
            case R.id.page409:
                viewPager.setCurrentItem(408,false);
                break;
            case R.id.page410:
                viewPager.setCurrentItem(409,false);
                break;
            case R.id.page411:
                viewPager.setCurrentItem(410,false);
                break;
            case R.id.page412:
                viewPager.setCurrentItem(411,false);
                break;
            case R.id.page413:
                viewPager.setCurrentItem(412,false);
                break;
            case R.id.page414:
                viewPager.setCurrentItem(413,false);
                break;
            case R.id.page415:
                viewPager.setCurrentItem(414,false);
                break;
            case R.id.page416:
                viewPager.setCurrentItem(415,false);
                break;
            case R.id.page417:
                viewPager.setCurrentItem(416,false);
                break;
            case R.id.page418:
                viewPager.setCurrentItem(417,false);
                break;
            case R.id.page419:
                viewPager.setCurrentItem(418,false);
                break;
            case R.id.page420:
                viewPager.setCurrentItem(419,false);
                break;
            case R.id.page421:
                viewPager.setCurrentItem(420,false);
                break;
            case R.id.page422:
                viewPager.setCurrentItem(421,false);
                break;
            case R.id.page423:
                viewPager.setCurrentItem(422,false);
                break;
            case R.id.page424:
                viewPager.setCurrentItem(423,false);
                break;
            case R.id.page425:
                viewPager.setCurrentItem(424,false);
                break;
            case R.id.page426:
                viewPager.setCurrentItem(425,false);
                break;
            case R.id.page427:
                viewPager.setCurrentItem(426,false);
                break;
            case R.id.page428:
                viewPager.setCurrentItem(427,false);
                break;
            case R.id.page429:
                viewPager.setCurrentItem(428,false);
                break;
            case R.id.page430:
                viewPager.setCurrentItem(429,false);
                break;
            case R.id.page431:
                viewPager.setCurrentItem(430,false);
                break;
            case R.id.page432:
                viewPager.setCurrentItem(431,false);
                break;
            case R.id.page433:
                viewPager.setCurrentItem(432,false);
                break;
            case R.id.page434:
                viewPager.setCurrentItem(433,false);
                break;
            case R.id.page435:
                viewPager.setCurrentItem(434,false);
                break;
            case R.id.page436:
                viewPager.setCurrentItem(435,false);
                break;
            case R.id.page437:
                viewPager.setCurrentItem(436,false);
                break;
            case R.id.page438:
                viewPager.setCurrentItem(437,false);
                break;
            case R.id.page439:
                viewPager.setCurrentItem(438,false);
                break;
            case R.id.page440:
                viewPager.setCurrentItem(439,false);
                break;
            case R.id.page441:
                viewPager.setCurrentItem(440,false);
                break;
            case R.id.page442:
                viewPager.setCurrentItem(441,false);
                break;
            case R.id.page443:
                viewPager.setCurrentItem(442,false);
                break;
            case R.id.page444:
                viewPager.setCurrentItem(443,false);
                break;
            case R.id.page445:
                viewPager.setCurrentItem(444,false);
                break;
            case R.id.page446:
                viewPager.setCurrentItem(445,false);
                break;
            case R.id.page447:
                viewPager.setCurrentItem(446,false);
                break;
            case R.id.page448:
                viewPager.setCurrentItem(447,false);
                break;
            case R.id.page449:
                viewPager.setCurrentItem(448,false);
                break;
            case R.id.page450:
                viewPager.setCurrentItem(449,false);
                break;
            case R.id.page451:
                viewPager.setCurrentItem(450,false);
                break;
            case R.id.page452:
                viewPager.setCurrentItem(451,false);
                break;
            case R.id.page453:
                viewPager.setCurrentItem(452,false);
                break;
            case R.id.page454:
                viewPager.setCurrentItem(453,false);
                break;
            case R.id.page455:
                viewPager.setCurrentItem(454,false);
                break;
            case R.id.page456:
                viewPager.setCurrentItem(455,false);
                break;
            case R.id.page457:
                viewPager.setCurrentItem(456,false);
                break;
            case R.id.page458:
                viewPager.setCurrentItem(457,false);
                break;
            case R.id.page459:
                viewPager.setCurrentItem(458,false);
                break;
            case R.id.page460:
                viewPager.setCurrentItem(459,false);
                break;
            case R.id.page461:
                viewPager.setCurrentItem(460,false);
                break;
            case R.id.page462:
                viewPager.setCurrentItem(461,false);
                break;
            case R.id.page463:
                viewPager.setCurrentItem(462,false);
                break;
            case R.id.page464:
                viewPager.setCurrentItem(463,false);
                break;
            case R.id.page465:
                viewPager.setCurrentItem(464,false);
                break;
            case R.id.page466:
                viewPager.setCurrentItem(465,false);
                break;
            case R.id.page467:
                viewPager.setCurrentItem(466,false);
                break;
            case R.id.page468:
                viewPager.setCurrentItem(467,false);
                break;
            case R.id.page469:
                viewPager.setCurrentItem(468,false);
                break;
            case R.id.page470:
                viewPager.setCurrentItem(469,false);
                break;
            case R.id.page471:
                viewPager.setCurrentItem(470,false);
                break;
            case R.id.page472:
                viewPager.setCurrentItem(471,false);
                break;
            case R.id.page473:
                viewPager.setCurrentItem(472,false);
                break;
            case R.id.page474:
                viewPager.setCurrentItem(473,false);
                break;
            case R.id.page475:
                viewPager.setCurrentItem(474,false);
                break;
            case R.id.page476:
                viewPager.setCurrentItem(475,false);
                break;
            case R.id.page477:
                viewPager.setCurrentItem(476,false);
                break;
            case R.id.page478:
                viewPager.setCurrentItem(477,false);
                break;
            case R.id.page479:
                viewPager.setCurrentItem(478,false);
                break;
            case R.id.page480:
                viewPager.setCurrentItem(479,false);
                break;
            case R.id.page481:
                viewPager.setCurrentItem(480,false);
                break;
            case R.id.page482:
                viewPager.setCurrentItem(481,false);
                break;
            case R.id.page483:
                viewPager.setCurrentItem(482,false);
                break;
            case R.id.page484:
                viewPager.setCurrentItem(483,false);
                break;
            case R.id.page485:
                viewPager.setCurrentItem(484,false);
                break;
            case R.id.page486:
                viewPager.setCurrentItem(485,false);
                break;
            case R.id.page487:
                viewPager.setCurrentItem(486,false);
                break;
            case R.id.page488:
                viewPager.setCurrentItem(487,false);
                break;
            case R.id.page489:
                viewPager.setCurrentItem(488,false);
                break;
            case R.id.page490:
                viewPager.setCurrentItem(489,false);
                break;
            case R.id.page491:
                viewPager.setCurrentItem(490,false);
                break;
            case R.id.page492:
                viewPager.setCurrentItem(491,false);
                break;
            case R.id.page493:
                viewPager.setCurrentItem(492,false);
                break;
            case R.id.page494:
                viewPager.setCurrentItem(493,false);
                break;
            case R.id.page495:
                viewPager.setCurrentItem(494,false);
                break;
            case R.id.page496:
                viewPager.setCurrentItem(495,false);
                break;
            case R.id.page497:
                viewPager.setCurrentItem(496,false);
                break;
            case R.id.page498:
                viewPager.setCurrentItem(497,false);
                break;
            case R.id.page499:
                viewPager.setCurrentItem(498,false);
                break;
            case R.id.page500:
                viewPager.setCurrentItem(499,false);
                break;
            case R.id.page501:
                viewPager.setCurrentItem(500,false);
                break;
            case R.id.page502:
                viewPager.setCurrentItem(501,false);
                break;
            case R.id.page503:
                viewPager.setCurrentItem(502,false);
                break;
            case R.id.page504:
                viewPager.setCurrentItem(503,false);
                break;
            case R.id.page505:
                viewPager.setCurrentItem(504,false);
                break;
            case R.id.page506:
                viewPager.setCurrentItem(505,false);
                break;
            case R.id.page507:
                viewPager.setCurrentItem(506,false);
                break;
            case R.id.page508:
                viewPager.setCurrentItem(507,false);
                break;
            case R.id.page509:
                viewPager.setCurrentItem(508,false);
                break;
            case R.id.page510:
                viewPager.setCurrentItem(509,false);
                break;
            case R.id.page511:
                viewPager.setCurrentItem(510,false);
                break;
            case R.id.page512:
                viewPager.setCurrentItem(511,false);
                break;
            case R.id.page513:
                viewPager.setCurrentItem(512,false);
                break;
            case R.id.page514:
                viewPager.setCurrentItem(513,false);
                break;
            case R.id.page515:
                viewPager.setCurrentItem(514,false);
                break;
            case R.id.page516:
                viewPager.setCurrentItem(515,false);
                break;
            case R.id.page517:
                viewPager.setCurrentItem(516,false);
                break;
            case R.id.page518:
                viewPager.setCurrentItem(517,false);
                break;
            case R.id.page519:
                viewPager.setCurrentItem(518,false);
                break;
            case R.id.page520:
                viewPager.setCurrentItem(519,false);
                break;
            case R.id.page521:
                viewPager.setCurrentItem(520,false);
                break;
            case R.id.page522:
                viewPager.setCurrentItem(521,false);
                break;
            case R.id.page523:
                viewPager.setCurrentItem(522,false);
                break;
            case R.id.page524:
                viewPager.setCurrentItem(523,false);
                break;
            case R.id.page525:
                viewPager.setCurrentItem(524,false);
                break;
            case R.id.page526:
                viewPager.setCurrentItem(525,false);
                break;
            case R.id.page527:
                viewPager.setCurrentItem(526,false);
                break;
            case R.id.page528:
                viewPager.setCurrentItem(527,false);
                break;
            case R.id.page529:
                viewPager.setCurrentItem(528,false);
                break;
            case R.id.page530:
                viewPager.setCurrentItem(529,false);
                break;
            case R.id.page531:
                viewPager.setCurrentItem(530,false);
                break;
            case R.id.page532:
                viewPager.setCurrentItem(531,false);
                break;
            case R.id.page533:
                viewPager.setCurrentItem(532,false);
                break;
            case R.id.page534:
                viewPager.setCurrentItem(533,false);
                break;
            case R.id.page535:
                viewPager.setCurrentItem(534,false);
                break;
            case R.id.page536:
                viewPager.setCurrentItem(535,false);
                break;
            case R.id.page537:
                viewPager.setCurrentItem(536,false);
                break;
            case R.id.page538:
                viewPager.setCurrentItem(537,false);
                break;
            case R.id.page539:
                viewPager.setCurrentItem(538,false);
                break;
            case R.id.page540:
                viewPager.setCurrentItem(539,false);
                break;
            case R.id.page541:
                viewPager.setCurrentItem(540,false);
                break;
            case R.id.page542:
                viewPager.setCurrentItem(541,false);
                break;
            case R.id.page543:
                viewPager.setCurrentItem(542,false);
                break;
            case R.id.page544:
                viewPager.setCurrentItem(543,false);
                break;
            case R.id.page545:
                viewPager.setCurrentItem(544,false);
                break;
            case R.id.page546:
                viewPager.setCurrentItem(545,false);
                break;
            case R.id.page547:
                viewPager.setCurrentItem(546,false);
                break;
            case R.id.page548:
                viewPager.setCurrentItem(547,false);
                break;
            case R.id.page549:
                viewPager.setCurrentItem(548,false);
                break;
            case R.id.page550:
                viewPager.setCurrentItem(549,false);
                break;
            case R.id.page551:
                viewPager.setCurrentItem(550,false);
                break;
            case R.id.page552:
                viewPager.setCurrentItem(551,false);
                break;
            case R.id.page553:
                viewPager.setCurrentItem(552,false);
                break;
            case R.id.page554:
                viewPager.setCurrentItem(553,false);
                break;
            case R.id.page555:
                viewPager.setCurrentItem(554,false);
                break;
            case R.id.page556:
                viewPager.setCurrentItem(555,false);
                break;
            case R.id.page557:
                viewPager.setCurrentItem(556,false);
                break;
            case R.id.page558:
                viewPager.setCurrentItem(557,false);
                break;
            case R.id.page559:
                viewPager.setCurrentItem(558,false);
                break;
            case R.id.page560:
                viewPager.setCurrentItem(559,false);
                break;
            case R.id.page561:
                viewPager.setCurrentItem(560,false);
                break;
            case R.id.page562:
                viewPager.setCurrentItem(561,false);
                break;
            case R.id.page563:
                viewPager.setCurrentItem(562,false);
                break;
            case R.id.page564:
                viewPager.setCurrentItem(563,false);
                break;
            case R.id.page565:
                viewPager.setCurrentItem(564,false);
                break;
            case R.id.page566:
                viewPager.setCurrentItem(565,false);
                break;
            case R.id.page567:
                viewPager.setCurrentItem(566,false);
                break;
            case R.id.page568:
                viewPager.setCurrentItem(567,false);
                break;
            case R.id.page569:
                viewPager.setCurrentItem(568,false);
                break;
            case R.id.page570:
                viewPager.setCurrentItem(569,false);
                break;
            case R.id.page571:
                viewPager.setCurrentItem(570,false);
                break;
            case R.id.page572:
                viewPager.setCurrentItem(571,false);
                break;
            case R.id.page573:
                viewPager.setCurrentItem(572,false);
                break;
            case R.id.page574:
                viewPager.setCurrentItem(573,false);
                break;
            case R.id.page575:
                viewPager.setCurrentItem(574,false);
                break;
            case R.id.page576:
                viewPager.setCurrentItem(575,false);
                break;
            case R.id.page577:
                viewPager.setCurrentItem(576,false);
                break;
            case R.id.page578:
                viewPager.setCurrentItem(577,false);
                break;
            case R.id.page579:
                viewPager.setCurrentItem(578,false);
                break;
            case R.id.page580:
                viewPager.setCurrentItem(579,false);
                break;
            case R.id.page581:
                viewPager.setCurrentItem(580,false);
                break;
            case R.id.page582:
                viewPager.setCurrentItem(581,false);
                break;
            case R.id.page583:
                viewPager.setCurrentItem(582,false);
                break;
            case R.id.page584:
                viewPager.setCurrentItem(583,false);
                break;
            case R.id.page585:
                viewPager.setCurrentItem(584,false);
                break;
            case R.id.page586:
                viewPager.setCurrentItem(585,false);
                break;
            case R.id.page587:
                viewPager.setCurrentItem(586,false);
                break;
            case R.id.page588:
                viewPager.setCurrentItem(587,false);
                break;
            case R.id.page589:
                viewPager.setCurrentItem(588,false);
                break;
            case R.id.page590:
                viewPager.setCurrentItem(589,false);
                break;
            case R.id.page591:
                viewPager.setCurrentItem(590,false);
                break;
            case R.id.page592:
                viewPager.setCurrentItem(591,false);
                break;
            case R.id.page593:
                viewPager.setCurrentItem(592,false);
                break;
            case R.id.page594:
                viewPager.setCurrentItem(593,false);
                break;
            case R.id.page595:
                viewPager.setCurrentItem(594,false);
                break;
            case R.id.page596:
                viewPager.setCurrentItem(595,false);
                break;
            case R.id.page597:
                viewPager.setCurrentItem(596,false);
                break;
            case R.id.page598:
                viewPager.setCurrentItem(597,false);
                break;
            case R.id.page599:
                viewPager.setCurrentItem(598,false);
                break;
            case R.id.page600:
                viewPager.setCurrentItem(599,false);
                break;
            case R.id.page601:
                viewPager.setCurrentItem(600,false);
                break;
            case R.id.page602:
                viewPager.setCurrentItem(601,false);
                break;
            case R.id.page603:
                viewPager.setCurrentItem(602,false);
                break;
            case R.id.page604:
                viewPager.setCurrentItem(603,false);
                break;


        }


        return super.onOptionsItemSelected(item);
    }

    @Override
    protected void onResume() {
        super.onResume();
        viewPager.postDelayed(new Runnable() {
            @Override
            public void run() {

                viewPager.setAdapter(pagerAdapter);
                viewPager.setCurrentItem(numbundle,false);
            }
        },100);
    }

    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }

    private class ScreenSlidePagerAdapter extends FragmentStateAdapter {
        public ScreenSlidePagerAdapter(SecondActivity fa) {
            super(fa);
        }

        @Override
        public Fragment createFragment(int position) {
            switch (position){
                case 0 : return new FragmentViewPages();

                case 1 : return new FragmentViewPages2();
                case 2 : return new FragmentViewPages3();
                case 3 : return new FragmentViewPages4();
                case 4 : return new FragmentViewPages5();
                case 5 : return new FragmentViewPages6();
                case 6 : return new FragmentViewPages7();
                case 7 : return new FragmentViewPages8();
                case 8 : return new FragmentViewPages9();
                case 9 : return new FragmentViewPages10();
                case 10 : return new FragmentViewPages11();
                case 11 : return new FragmentViewPages12();
                case 12 : return new FragmentViewPages13();
                case 13 : return new FragmentViewPages14();
                case 14 : return new FragmentViewPages15();
                case 15 : return new FragmentViewPages16();
                case 16 : return new FragmentViewPages17();
                case 17 : return new FragmentViewPages18();
                case 18 : return new FragmentViewPages19();
                case 19 : return new FragmentViewPages20();
                case 20 : return new FragmentViewPages21();
                case 21 : return new FragmentViewPages22();
                case 22 : return new FragmentViewPages23();
                case 23 : return new FragmentViewPages24();
                case 24 : return new FragmentViewPages25();
                case 25 : return new FragmentViewPages26();
                case 26 : return new FragmentViewPages27();
                case 27 : return new FragmentViewPages28();
                case 28 : return new FragmentViewPages29();
                case 29 : return new FragmentViewPages30();
                case 30 : return new FragmentViewPages31();
                case 31 : return new FragmentViewPages32();
                case 32 : return new FragmentViewPages33();
                case 33 : return new FragmentViewPages34();
                case 34 : return new FragmentViewPages35();
                case 35 : return new FragmentViewPages36();
                case 36 : return new FragmentViewPages37();
                case 37 : return new FragmentViewPages38();
                case 38 : return new FragmentViewPages39();
                case 39 : return new FragmentViewPages40();
                case 40 : return new FragmentViewPages41();
                case 41 : return new FragmentViewPages42();
                case 42 : return new FragmentViewPages43();
                case 43 : return new FragmentViewPages44();
                case 44 : return new FragmentViewPages45();
                case 45 : return new FragmentViewPages46();
                case 46 : return new FragmentViewPages47();
                case 47 : return new FragmentViewPages48();
                case 48 : return new FragmentViewPages49();
                case 49 : return new FragmentViewPages50();
                case 50 : return new FragmentViewPages51();
                case 51 : return new FragmentViewPages52();
                case 52 : return new FragmentViewPages53();
                case 53 : return new FragmentViewPages54();
                case 54 : return new FragmentViewPages55();
                case 55 : return new FragmentViewPages56();
                case 56 : return new FragmentViewPages57();
                case 57 : return new FragmentViewPages58();
                case 58 : return new FragmentViewPages59();
                case 59 : return new FragmentViewPages60();
                case 60 : return new FragmentViewPages61();
                case 61 : return new FragmentViewPages62();
                case 62 : return new FragmentViewPages63();
                case 63 : return new FragmentViewPages64();
                case 64 : return new FragmentViewPages65();
                case 65 : return new FragmentViewPages66();
                case 66 : return new FragmentViewPages67();
                case 67 : return new FragmentViewPages68();
                case 68 : return new FragmentViewPages69();
                case 69 : return new FragmentViewPages70();
                case 70 : return new FragmentViewPages71();
                case 71 : return new FragmentViewPages72();
                case 72 : return new FragmentViewPages73();
                case 73 : return new FragmentViewPages74();
                case 74 : return new FragmentViewPages75();
                case 75 : return new FragmentViewPages76();
                case 76 : return new FragmentViewPages77();
                case 77 : return new FragmentViewPages78();
                case 78 : return new FragmentViewPages79();
                case 79 : return new FragmentViewPages80();
                case 80 : return new FragmentViewPages81();
                case 81 : return new FragmentViewPages82();
                case 82 : return new FragmentViewPages83();
                case 83 : return new FragmentViewPages84();
                case 84 : return new FragmentViewPages85();
                case 85 : return new FragmentViewPages86();
                case 86 : return new FragmentViewPages87();
                case 87 : return new FragmentViewPages88();
                case 88 : return new FragmentViewPages89();
                case 89 : return new FragmentViewPages90();
                case 90 : return new FragmentViewPages91();
                case 91 : return new FragmentViewPages92();
                case 92 : return new FragmentViewPages93();
                case 93 : return new FragmentViewPages94();
                case 94 : return new FragmentViewPages95();
                case 95 : return new FragmentViewPages96();
                case 96 : return new FragmentViewPages97();
                case 97 : return new FragmentViewPages98();
                case 98 : return new FragmentViewPages99();
                case 99 : return new FragmentViewPages100();
                case 100 : return new FragmentViewPages101();
                case 101 : return new FragmentViewPages102();
                case 102 : return new FragmentViewPages103();
                case 103 : return new FragmentViewPages104();
                case 104 : return new FragmentViewPages105();
                case 105 : return new FragmentViewPages106();
                case 106 : return new FragmentViewPages107();
                case 107 : return new FragmentViewPages108();
                case 108 : return new FragmentViewPages109();
                case 109 : return new FragmentViewPages110();
                case 110 : return new FragmentViewPages111();
                case 111 : return new FragmentViewPages112();
                case 112 : return new FragmentViewPages113();
                case 113 : return new FragmentViewPages114();
                case 114 : return new FragmentViewPages115();
                case 115 : return new FragmentViewPages116();
                case 116 : return new FragmentViewPages117();
                case 117 : return new FragmentViewPages118();
                case 118 : return new FragmentViewPages119();
                case 119 : return new FragmentViewPages120();
                case 120 : return new FragmentViewPages121();
                case 121 : return new FragmentViewPages122();
                case 122 : return new FragmentViewPages123();
                case 123 : return new FragmentViewPages124();
                case 124 : return new FragmentViewPages125();
                case 125 : return new FragmentViewPages126();
                case 126 : return new FragmentViewPages127();
                case 127 : return new FragmentViewPages128();
                case 128 : return new FragmentViewPages129();
                case 129 : return new FragmentViewPages130();
                case 130 : return new FragmentViewPages131();
                case 131 : return new FragmentViewPages132();
                case 132 : return new FragmentViewPages133();
                case 133 : return new FragmentViewPages134();
                case 134 : return new FragmentViewPages135();
                case 135 : return new FragmentViewPages136();
                case 136 : return new FragmentViewPages137();
                case 137 : return new FragmentViewPages138();
                case 138 : return new FragmentViewPages139();
                case 139 : return new FragmentViewPages140();
                case 140 : return new FragmentViewPages141();
                case 141 : return new FragmentViewPages142();
                case 142 : return new FragmentViewPages143();
                case 143 : return new FragmentViewPages144();
                case 144 : return new FragmentViewPages145();
                case 145 : return new FragmentViewPages146();
                case 146 : return new FragmentViewPages147();
                case 147 : return new FragmentViewPages148();
                case 148 : return new FragmentViewPages149();
                case 149 : return new FragmentViewPages150();
                case 150 : return new FragmentViewPages151();
                case 151 : return new FragmentViewPages152();
                case 152 : return new FragmentViewPages153();
                case 153 : return new FragmentViewPages154();
                case 154 : return new FragmentViewPages155();
                case 155 : return new FragmentViewPages156();
                case 156 : return new FragmentViewPages157();
                case 157 : return new FragmentViewPages158();
                case 158 : return new FragmentViewPages159();
                case 159 : return new FragmentViewPages160();
                case 160 : return new FragmentViewPages161();
                case 161 : return new FragmentViewPages162();
                case 162 : return new FragmentViewPages163();
                case 163 : return new FragmentViewPages164();
                case 164 : return new FragmentViewPages165();
                case 165 : return new FragmentViewPages166();
                case 166 : return new FragmentViewPages167();
                case 167 : return new FragmentViewPages168();
                case 168 : return new FragmentViewPages169();
                case 169 : return new FragmentViewPages170();
                case 170 : return new FragmentViewPages171();
                case 171 : return new FragmentViewPages172();
                case 172 : return new FragmentViewPages173();
                case 173 : return new FragmentViewPages174();
                case 174 : return new FragmentViewPages175();
                case 175 : return new FragmentViewPages176();
                case 176 : return new FragmentViewPages177();
                case 177 : return new FragmentViewPages178();
                case 178 : return new FragmentViewPages179();
                case 179 : return new FragmentViewPages180();
                case 180 : return new FragmentViewPages181();
                case 181 : return new FragmentViewPages182();
                case 182 : return new FragmentViewPages183();
                case 183 : return new FragmentViewPages184();
                case 184 : return new FragmentViewPages185();
                case 185 : return new FragmentViewPages186();
                case 186 : return new FragmentViewPages187();
                case 187 : return new FragmentViewPages188();
                case 188 : return new FragmentViewPages189();
                case 189 : return new FragmentViewPages190();
                case 190 : return new FragmentViewPages191();
                case 191 : return new FragmentViewPages192();
                case 192 : return new FragmentViewPages193();
                case 193 : return new FragmentViewPages194();
                case 194 : return new FragmentViewPages195();
                case 195 : return new FragmentViewPages196();
                case 196 : return new FragmentViewPages197();
                case 197 : return new FragmentViewPages198();
                case 198 : return new FragmentViewPages199();
                case 199 : return new FragmentViewPages200();
                case 200 : return new FragmentViewPages201();
                case 201 : return new FragmentViewPages202();
                case 202 : return new FragmentViewPages203();
                case 203 : return new FragmentViewPages204();
                case 204 : return new FragmentViewPages205();
                case 205 : return new FragmentViewPages206();
                case 206 : return new FragmentViewPages207();
                case 207 : return new FragmentViewPages208();
                case 208 : return new FragmentViewPages209();
                case 209 : return new FragmentViewPages210();
                case 210 : return new FragmentViewPages211();
                case 211 : return new FragmentViewPages212();
                case 212 : return new FragmentViewPages213();
                case 213 : return new FragmentViewPages214();
                case 214 : return new FragmentViewPages215();
                case 215 : return new FragmentViewPages216();
                case 216 : return new FragmentViewPages217();
                case 217 : return new FragmentViewPages218();
                case 218 : return new FragmentViewPages219();
                case 219 : return new FragmentViewPages220();
                case 220 : return new FragmentViewPages221();
                case 221 : return new FragmentViewPages222();
                case 222 : return new FragmentViewPages223();
                case 223 : return new FragmentViewPages224();
                case 224 : return new FragmentViewPages225();
                case 225 : return new FragmentViewPages226();
                case 226 : return new FragmentViewPages227();
                case 227 : return new FragmentViewPages228();
                case 228 : return new FragmentViewPages229();
                case 229 : return new FragmentViewPages230();
                case 230 : return new FragmentViewPages231();
                case 231 : return new FragmentViewPages232();
                case 232 : return new FragmentViewPages233();
                case 233 : return new FragmentViewPages234();
                case 234 : return new FragmentViewPages235();
                case 235 : return new FragmentViewPages236();
                case 236 : return new FragmentViewPages237();
                case 237 : return new FragmentViewPages238();
                case 238 : return new FragmentViewPages239();
                case 239 : return new FragmentViewPages240();
                case 240 : return new FragmentViewPages241();
                case 241 : return new FragmentViewPages242();
                case 242 : return new FragmentViewPages243();
                case 243 : return new FragmentViewPages244();
                case 244 : return new FragmentViewPages245();
                case 245 : return new FragmentViewPages246();
                case 246 : return new FragmentViewPages247();
                case 247 : return new FragmentViewPages248();
                case 248 : return new FragmentViewPages249();
                case 249 : return new FragmentViewPages250();
                case 250 : return new FragmentViewPages251();
                case 251 : return new FragmentViewPages252();
                case 252 : return new FragmentViewPages253();
                case 253 : return new FragmentViewPages254();
                case 254 : return new FragmentViewPages255();
                case 255 : return new FragmentViewPages256();
                case 256 : return new FragmentViewPages257();
                case 257 : return new FragmentViewPages258();
                case 258 : return new FragmentViewPages259();
                case 259 : return new FragmentViewPages260();
                case 260 : return new FragmentViewPages261();
                case 261 : return new FragmentViewPages262();
                case 262 : return new FragmentViewPages263();
                case 263 : return new FragmentViewPages264();
                case 264 : return new FragmentViewPages265();
                case 265 : return new FragmentViewPages266();
                case 266 : return new FragmentViewPages267();
                case 267 : return new FragmentViewPages268();
                case 268 : return new FragmentViewPages269();
                case 269 : return new FragmentViewPages270();
                case 270 : return new FragmentViewPages271();
                case 271 : return new FragmentViewPages272();
                case 272 : return new FragmentViewPages273();
                case 273 : return new FragmentViewPages274();
                case 274 : return new FragmentViewPages275();
                case 275 : return new FragmentViewPages276();
                case 276 : return new FragmentViewPages277();
                case 277 : return new FragmentViewPages278();
                case 278 : return new FragmentViewPages279();
                case 279 : return new FragmentViewPages280();
                case 280 : return new FragmentViewPages281();
                case 281 : return new FragmentViewPages282();
                case 282 : return new FragmentViewPages283();
                case 283 : return new FragmentViewPages284();
                case 284 : return new FragmentViewPages285();
                case 285 : return new FragmentViewPages286();
                case 286 : return new FragmentViewPages287();
                case 287 : return new FragmentViewPages288();
                case 288 : return new FragmentViewPages289();
                case 289 : return new FragmentViewPages290();
                case 290 : return new FragmentViewPages291();
                case 291 : return new FragmentViewPages292();
                case 292 : return new FragmentViewPages293();
                case 293 : return new FragmentViewPages294();
                case 294 : return new FragmentViewPages295();
                case 295 : return new FragmentViewPages296();
                case 296 : return new FragmentViewPages297();
                case 297 : return new FragmentViewPages298();
                case 298 : return new FragmentViewPages299();
                case 299 : return new FragmentViewPages300();
                case 300 : return new FragmentViewPages301();
                case 301 : return new FragmentViewPages302();
                case 302 : return new FragmentViewPages303();
                case 303 : return new FragmentViewPages304();
                case 304 : return new FragmentViewPages305();
                case 305 : return new FragmentViewPages306();
                case 306 : return new FragmentViewPages307();
                case 307 : return new FragmentViewPages308();
                case 308 : return new FragmentViewPages309();
                case 309 : return new FragmentViewPages310();
                case 310 : return new FragmentViewPages311();
                case 311 : return new FragmentViewPages312();
                case 312 : return new FragmentViewPages313();
                case 313 : return new FragmentViewPages314();
                case 314 : return new FragmentViewPages315();
                case 315 : return new FragmentViewPages316();
                case 316 : return new FragmentViewPages317();
                case 317 : return new FragmentViewPages318();
                case 318 : return new FragmentViewPages319();
                case 319 : return new FragmentViewPages320();
                case 320 : return new FragmentViewPages321();
                case 321 : return new FragmentViewPages322();
                case 322 : return new FragmentViewPages323();
                case 323 : return new FragmentViewPages324();
                case 324 : return new FragmentViewPages325();
                case 325 : return new FragmentViewPages326();
                case 326 : return new FragmentViewPages327();
                case 327 : return new FragmentViewPages328();
                case 328 : return new FragmentViewPages329();
                case 329 : return new FragmentViewPages330();
                case 330 : return new FragmentViewPages331();
                case 331 : return new FragmentViewPages332();
                case 332 : return new FragmentViewPages333();
                case 333 : return new FragmentViewPages334();
                case 334 : return new FragmentViewPages335();
                case 335 : return new FragmentViewPages336();
                case 336 : return new FragmentViewPages337();
                case 337 : return new FragmentViewPages338();
                case 338 : return new FragmentViewPages339();
                case 339 : return new FragmentViewPages340();
                case 340 : return new FragmentViewPages341();
                case 341 : return new FragmentViewPages342();
                case 342 : return new FragmentViewPages343();
                case 343 : return new FragmentViewPages344();
                case 344 : return new FragmentViewPages345();
                case 345 : return new FragmentViewPages346();
                case 346 : return new FragmentViewPages347();
                case 347 : return new FragmentViewPages348();
                case 348 : return new FragmentViewPages349();
                case 349 : return new FragmentViewPages350();
                case 350 : return new FragmentViewPages351();
                case 351 : return new FragmentViewPages352();
                case 352 : return new FragmentViewPages353();
                case 353 : return new FragmentViewPages354();
                case 354 : return new FragmentViewPages355();
                case 355 : return new FragmentViewPages356();
                case 356 : return new FragmentViewPages357();
                case 357 : return new FragmentViewPages358();
                case 358 : return new FragmentViewPages359();
                case 359 : return new FragmentViewPages360();
                case 360 : return new FragmentViewPages361();
                case 361 : return new FragmentViewPages362();
                case 362 : return new FragmentViewPages363();
                case 363 : return new FragmentViewPages364();
                case 364 : return new FragmentViewPages365();
                case 365 : return new FragmentViewPages366();
                case 366 : return new FragmentViewPages367();
                case 367 : return new FragmentViewPages368();
                case 368 : return new FragmentViewPages369();
                case 369 : return new FragmentViewPages370();
                case 370 : return new FragmentViewPages371();
                case 371 : return new FragmentViewPages372();
                case 372 : return new FragmentViewPages373();
                case 373 : return new FragmentViewPages374();
                case 374 : return new FragmentViewPages375();
                case 375 : return new FragmentViewPages376();
                case 376 : return new FragmentViewPages377();
                case 377 : return new FragmentViewPages378();
                case 378 : return new FragmentViewPages379();
                case 379 : return new FragmentViewPages380();
                case 380 : return new FragmentViewPages381();
                case 381 : return new FragmentViewPages382();
                case 382 : return new FragmentViewPages383();
                case 383 : return new FragmentViewPages384();
                case 384 : return new FragmentViewPages385();
                case 385 : return new FragmentViewPages386();
                case 386 : return new FragmentViewPages387();
                case 387 : return new FragmentViewPages388();
                case 388 : return new FragmentViewPages389();
                case 389 : return new FragmentViewPages390();
                case 390 : return new FragmentViewPages391();
                case 391 : return new FragmentViewPages392();
                case 392 : return new FragmentViewPages393();
                case 393 : return new FragmentViewPages394();
                case 394 : return new FragmentViewPages395();
                case 395 : return new FragmentViewPages396();
                case 396 : return new FragmentViewPages397();
                case 397 : return new FragmentViewPages398();
                case 398 : return new FragmentViewPages399();
                case 399 : return new FragmentViewPages400();
                case 400 : return new FragmentViewPages401();
                case 401 : return new FragmentViewPages402();
                case 402 : return new FragmentViewPages403();
                case 403 : return new FragmentViewPages404();
                case 404 : return new FragmentViewPages405();
                case 405 : return new FragmentViewPages406();
                case 406 : return new FragmentViewPages407();
                case 407 : return new FragmentViewPages408();
                case 408 : return new FragmentViewPages409();
                case 409 : return new FragmentViewPages410();
                case 410 : return new FragmentViewPages411();
                case 411 : return new FragmentViewPages412();
                case 412 : return new FragmentViewPages413();
                case 413 : return new FragmentViewPages414();
                case 414 : return new FragmentViewPages415();
                case 415 : return new FragmentViewPages416();
                case 416 : return new FragmentViewPages417();
                case 417 : return new FragmentViewPages418();
                case 418 : return new FragmentViewPages419();
                case 419 : return new FragmentViewPages420();
                case 420 : return new FragmentViewPages421();
                case 421 : return new FragmentViewPages422();
                case 422 : return new FragmentViewPages423();
                case 423 : return new FragmentViewPages424();
                case 424 : return new FragmentViewPages425();
                case 425 : return new FragmentViewPages426();
                case 426 : return new FragmentViewPages427();
                case 427 : return new FragmentViewPages428();
                case 428 : return new FragmentViewPages429();
                case 429 : return new FragmentViewPages430();
                case 430 : return new FragmentViewPages431();
                case 431 : return new FragmentViewPages432();
                case 432 : return new FragmentViewPages433();
                case 433 : return new FragmentViewPages434();
                case 434 : return new FragmentViewPages435();
                case 435 : return new FragmentViewPages436();
                case 436 : return new FragmentViewPages437();
                case 437 : return new FragmentViewPages438();
                case 438 : return new FragmentViewPages439();
                case 439 : return new FragmentViewPages440();
                case 440 : return new FragmentViewPages441();
                case 441 : return new FragmentViewPages442();
                case 442 : return new FragmentViewPages443();
                case 443 : return new FragmentViewPages444();
                case 444 : return new FragmentViewPages445();
                case 445 : return new FragmentViewPages446();
                case 446 : return new FragmentViewPages447();
                case 447 : return new FragmentViewPages448();
                case 448 : return new FragmentViewPages449();
                case 449 : return new FragmentViewPages450();
                case 450 : return new FragmentViewPages451();
                case 451 : return new FragmentViewPages452();
                case 452 : return new FragmentViewPages453();
                case 453 : return new FragmentViewPages454();
                case 454 : return new FragmentViewPages455();
                case 455 : return new FragmentViewPages456();
                case 456 : return new FragmentViewPages457();
                case 457 : return new FragmentViewPages458();
                case 458 : return new FragmentViewPages459();
                case 459 : return new FragmentViewPages460();
                case 460 : return new FragmentViewPages461();
                case 461 : return new FragmentViewPages462();
                case 462 : return new FragmentViewPages463();
                case 463 : return new FragmentViewPages464();
                case 464 : return new FragmentViewPages465();
                case 465 : return new FragmentViewPages466();
                case 466 : return new FragmentViewPages467();
                case 467 : return new FragmentViewPages468();
                case 468 : return new FragmentViewPages469();
                case 469 : return new FragmentViewPages470();
                case 470 : return new FragmentViewPages471();
                case 471 : return new FragmentViewPages472();
                case 472 : return new FragmentViewPages473();
                case 473 : return new FragmentViewPages474();
                case 474 : return new FragmentViewPages475();
                case 475 : return new FragmentViewPages476();
                case 476 : return new FragmentViewPages477();
                case 477 : return new FragmentViewPages478();
                case 478 : return new FragmentViewPages479();
                case 479 : return new FragmentViewPages480();
                case 480 : return new FragmentViewPages481();
                case 481 : return new FragmentViewPages482();
                case 482 : return new FragmentViewPages483();
                case 483 : return new FragmentViewPages484();
                case 484 : return new FragmentViewPages485();
                case 485 : return new FragmentViewPages486();
                case 486 : return new FragmentViewPages487();
                case 487 : return new FragmentViewPages488();
                case 488 : return new FragmentViewPages489();
                case 489 : return new FragmentViewPages490();
                case 490 : return new FragmentViewPages491();
                case 491 : return new FragmentViewPages492();
                case 492 : return new FragmentViewPages493();
                case 493 : return new FragmentViewPages494();
                case 494 : return new FragmentViewPages495();
                case 495 : return new FragmentViewPages496();
                case 496 : return new FragmentViewPages497();
                case 497 : return new FragmentViewPages498();
                case 498 : return new FragmentViewPages499();
                case 499 : return new FragmentViewPages500();
                case 500 : return new FragmentViewPages501();
                case 501 : return new FragmentViewPages502();
                case 502 : return new FragmentViewPages503();
                case 503 : return new FragmentViewPages504();
                case 504 : return new FragmentViewPages505();
                case 505 : return new FragmentViewPages506();
                case 506 : return new FragmentViewPages507();
                case 507 : return new FragmentViewPages508();
                case 508 : return new FragmentViewPages509();
                case 509 : return new FragmentViewPages510();
                case 510 : return new FragmentViewPages511();
                case 511 : return new FragmentViewPages512();
                case 512 : return new FragmentViewPages513();
                case 513 : return new FragmentViewPages514();
                case 514 : return new FragmentViewPages515();
                case 515 : return new FragmentViewPages516();
                case 516 : return new FragmentViewPages517();
                case 517 : return new FragmentViewPages518();
                case 518 : return new FragmentViewPages519();
                case 519 : return new FragmentViewPages520();
                case 520 : return new FragmentViewPages521();
                case 521 : return new FragmentViewPages522();
                case 522 : return new FragmentViewPages523();
                case 523 : return new FragmentViewPages524();
                case 524 : return new FragmentViewPages525();
                case 525 : return new FragmentViewPages526();
                case 526 : return new FragmentViewPages527();
                case 527 : return new FragmentViewPages528();
                case 528 : return new FragmentViewPages529();
                case 529 : return new FragmentViewPages530();
                case 530 : return new FragmentViewPages531();
                case 531 : return new FragmentViewPages532();
                case 532 : return new FragmentViewPages533();
                case 533 : return new FragmentViewPages534();
                case 534 : return new FragmentViewPages535();
                case 535 : return new FragmentViewPages536();
                case 536 : return new FragmentViewPages537();
                case 537 : return new FragmentViewPages538();
                case 538 : return new FragmentViewPages539();
                case 539 : return new FragmentViewPages540();
                case 540 : return new FragmentViewPages541();
                case 541 : return new FragmentViewPages542();
                case 542 : return new FragmentViewPages543();
                case 543 : return new FragmentViewPages544();
                case 544 : return new FragmentViewPages545();
                case 545 : return new FragmentViewPages546();
                case 546 : return new FragmentViewPages547();
                case 547 : return new FragmentViewPages548();
                case 548 : return new FragmentViewPages549();
                case 549 : return new FragmentViewPages550();
                case 550 : return new FragmentViewPages551();
                case 551 : return new FragmentViewPages552();
                case 552 : return new FragmentViewPages553();
                case 553 : return new FragmentViewPages554();
                case 554 : return new FragmentViewPages555();
                case 555 : return new FragmentViewPages556();
                case 556 : return new FragmentViewPages557();
                case 557 : return new FragmentViewPages558();
                case 558 : return new FragmentViewPages559();
                case 559 : return new FragmentViewPages560();
                case 560 : return new FragmentViewPages561();
                case 561 : return new FragmentViewPages562();
                case 562 : return new FragmentViewPages563();
                case 563 : return new FragmentViewPages564();
                case 564 : return new FragmentViewPages565();
                case 565 : return new FragmentViewPages566();
                case 566 : return new FragmentViewPages567();
                case 567 : return new FragmentViewPages568();
                case 568 : return new FragmentViewPages569();
                case 569 : return new FragmentViewPages570();
                case 570 : return new FragmentViewPages571();
                case 571 : return new FragmentViewPages572();
                case 572 : return new FragmentViewPages573();
                case 573 : return new FragmentViewPages574();
                case 574 : return new FragmentViewPages575();
                case 575 : return new FragmentViewPages576();
                case 576 : return new FragmentViewPages577();
                case 577 : return new FragmentViewPages578();
                case 578 : return new FragmentViewPages579();
                case 579 : return new FragmentViewPages580();
                case 580 : return new FragmentViewPages581();
                case 581 : return new FragmentViewPages582();
                case 582 : return new FragmentViewPages583();
                case 583 : return new FragmentViewPages584();
                case 584 : return new FragmentViewPages585();
                case 585 : return new FragmentViewPages586();
                case 586 : return new FragmentViewPages587();
                case 587 : return new FragmentViewPages588();
                case 588 : return new FragmentViewPages589();
                case 589 : return new FragmentViewPages590();
                case 590 : return new FragmentViewPages591();
                case 591 : return new FragmentViewPages592();
                case 592 : return new FragmentViewPages593();
                case 593 : return new FragmentViewPages594();
                case 594 : return new FragmentViewPages595();
                case 595 : return new FragmentViewPages596();
                case 596 : return new FragmentViewPages597();
                case 597 : return new FragmentViewPages598();
                case 598 : return new FragmentViewPages599();
                case 599 : return new FragmentViewPages600();
                case 600 : return new FragmentViewPages601();
                case 601 : return new FragmentViewPages602();
                case 602 : return new FragmentViewPages603();
                case 603 : return new FragmentViewPages604();
                default: return null;
            }

        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }
}