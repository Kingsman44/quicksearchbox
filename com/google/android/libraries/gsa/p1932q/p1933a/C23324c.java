package com.google.android.libraries.gsa.p1932q.p1933a;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import com.google.android.apps.gsa.staticplugins.opa.appintegration.C107344n;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.io.UnsupportedEncodingException;
import java.util.Arrays;

/* renamed from: com.google.android.libraries.gsa.q.a.c */
/* compiled from: PG */
public final class C23324c {

    /* renamed from: a */
    public static final C59071e f63825a = C59071e.m91332i("com.google.android.libraries.gsa.q.a.c");

    /* renamed from: b */
    public static final byte[] f63826b = m43757h("0\u0005Ç0\u0003¯ \u0003\u0002\u0001\u0002\u0002\u0015\u0000aèµä\u000eXBBÛ\u0013v&DýÛÁÀ0\r\u0006\t*H÷\r\u0001\u0001\u000b\u0005\u00000t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0\u001e\u0017\r190327235413Z\u0017\r490327235413Z0t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0\u0002\"0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0002\u000f\u00000\u0002\n\u0002\u0002\u0001\u0000¤iPÚDF=®\u0001x\u0016s\u0012Á\u001a\fí6\u0012¾Û`zÄÍ1t.\\Õ\u0006±\u0014ÎÍOIìµ\u0019¢\u001e(øp~¦(\u0015\u0012ðß\u0012Ã@ÐYÈMõÎ;­%:º;¾=Ë\u0002k[´Yõ&\u001d\u001aW5W%£§\n\u0010G6ªr~2þÓâ?:·n¦]QØúÎ÷ÿs\u001d\u0018x&übÏ²\nPn¼PÿäJ\\Ó:W=×¾4*\u0016N6eU\u001c÷1\u00047\u0002uµ¿y¬Ä\u0012½OäDÈH\u0016£­ÛQ¢#éèýG¿ê)èöÓ¯j:I\u0005ð¤þ½Mr}\bfxü\u0007Ø<x\"\u0005¾e;\u000eÜ\f<âLÇÅÁ\u0002¾®=ra$È#ÜÂËÐ¾\u0015\tË¿û\u0016ArmÎ£ü:A¬oqà!1{\nrîq\u0012E(þUIJW|l¿Î\u0017ªg\u001f\r³\rîJÌ\u0010}\u0018\u0012=\u000fm{»­ze¶ÅIEð¢Ãbþ`Y0eMVØ#et}ÑÆ3øñ4Ç|É5\u0007\"U¦µ2Ô9ËkÆa\u000báô\u000f¶'FåÕw\rÄ\n¾=¢â9ZÕ\u0006¢¥sýçÜU'\u0016\u0017Íl»özh\u001b0§ÆÌU$¥Ôî\nxJ Ñ­eèl3{\t¡à HÙêÊ\u0010~ç¥\u0019f\u0016Jô\u0013\tL\u00151\u0002ÆÌ\\Þ\u001c:UÒÄëø#ùo@¿Î§\u000bf\r~X\u0005CK\u000b³)emàìo\u0004\u001aÂ¾áf2¶POµ\u0002\u0003\u0001\u0000\u0001£P0N0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014utÙ\u001ea|>\u0017ý4ü1±ÒaJB0\u001f\u0006\u0003U\u001d#\u0004\u00180\u0016\u0014utÙ\u001ea|>\u0017ý4ü1±ÒaJB0\r\u0006\t*H÷\r\u0001\u0001\u000b\u0005\u0000\u0003\u0002\u0001\u0000<ÉÀCex\u0006\u001eÔvnPvü\u0004.ANa½ÉI\u0000ôçÀ2\u001f\u0001\u0014ÀpÏå°1¿\u0012÷K\u001a}û4å¾ë$ÏjD,¢KMEãÓ}jçÏà\u0003\u0013Ò\u000b\u0013F\u000475\u0002.ZÂÕT3\n½IÏtCÿoªÐÿ©|\u0004äÖ\u00125ÚìZMHf;\u0000\u0005zôo\u0018ÿ9Ë¬çkã¶Ú\u0014nJT\u0018ö}Ñ8 \u001b¢eÛWË·\\óÊó¯\u001cqH\u0006\u001980c\u0002«6òÓ$\\«8³¡`;q 1½¥\u0017d\rµ\u001dr\u000e+\u0001¬Å\u0006èLÊ[ñwS\\_k¼h\u0018[²gÿ71p\u0015/\u001c\u001c\u001diý0u:Í9´\u001fóÝ/|;]û\r`òE'ùÿ*ºúëDjª\u001bêìgRä*®æ\u0013bªÅ¦Ö68o±úr\u00003Ö\"º9\u0016ÂpY\\êý¢8ôîBï5KíI\u0006cho3<T[Aö`a¸røÆ\n,g?~§xO\u000bèµK$ áÈû\u0017âuÇã1îõ\u000e\rß¤\u0001Óã¤Ã~\u001b/¼°õJ®7\b&\u0007\u0017Í\nÉ}\u0007 P»Â¨zLN(Éá8\u000b\r±^Î\tÐÌéu2\tA#N%·WvÈr4îßÒâ\u0018ë°}Öz)Ä>õÂ-Ncìé}W+\\[®-®\u001dÿÓ`q·¢<Ü´Å)\fä\u001fW\u0003\rMú®àyº/_ÊZCò¡³Óê3áÔ3ñ");

    /* renamed from: c */
    public static final byte[] f63827c = m43757h("0\u0005ù0\u0003á \u0003\u0002\u0001\u0002\u0002\u0015\u0000ÅSPÎÍc8\u001aF¶Ïo>>;°<¹\\0\r\u0006\t*H÷\r\u0001\u0001\u000b\u0005\u000001\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1(0&\u0006\u0003U\u0004\u0003\f\u001fcom_google_android_carassistant0\u001e\u0017\r190327235416Z\u0017\r490327235416Z01\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1(0&\u0006\u0003U\u0004\u0003\f\u001fcom_google_android_carassistant0\u0002\"0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0002\u000f\u00000\u0002\n\u0002\u0002\u0001\u0000²\u001e®7^JZ1ÀâvÍË\tÔÑ³¨Á'\br\u0019X\u000fYãÁOfXÑK@Î\\^T!fâôÒMP[È\u001b\bé\u001dò\bq\u0011¥J±üEDìÓæª-÷\u0017¶É,Ï\u0003¬\u000bp¤ìSBs\u001aY\u0005mÞ4èY%ù\\}©Ö4w<d\u0011\u0006\u000b­»\u0014+?¯Z\u0007ßbÂâ19pÙ/Z+¯ñ\\pßÓ¢q¹\\O2ÓÕøkyY\u0006\u000eÚª`\u001cA2áÞC´µCE\u0011\u0012¶ÿ\u0014òO]cEÁÄjg¾ÂP\u000bR&y0º\u0010\u0017.\u001cb¡ BìRÌ<×\b´VfÔÎµñÜ\u0006·ð\u0011AÒRÌXL3xµ\u001d¶Õâ\u0006bÃvü@f ;]Ñòó¡÷3ì\b\u000b²Xz#7{7#\u0012e\u0002Ï¨÷½OaÜ,\"ªZä\u001aÑ¼/M´6Â²\u0000ÔÄLÃa\u0010Åñqô­±Â\u000e89s¦{ãõÄ½ZÝ8­zWÃYÇú=\u001d,C\u0013×\u001e7@¸\u0017ÊæëIxBù\u0005Ë¨\u0016êt?Ùn3$W%¦°OÑ¹«\u000b\u0003á§'®ÅWn«W7V@zV¶R¯\u000eAð2õcæó\">1¼ý(çÝ\t¿¶n\u0007òÊ`;2at \u001c!@gÊZ\u0000¥{vÔ¸rúM\u000fÛ¹§ÿ\bÒ\u0015xnè\u000bFUBÝÑò1IS\u0005©Ä·¡\u001a!Ù$v»ë·CéÆ¿?\u0002\u0003\u0001\u0000\u0001£P0N0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014óúÀuD¦X\u0002¡áÿÈaÃ¥Þê³Å0\u001f\u0006\u0003U\u001d#\u0004\u00180\u0016\u0014óúÀuD¦X\u0002¡áÿÈaÃ¥Þê³Å0\r\u0006\t*H÷\r\u0001\u0001\u000b\u0005\u0000\u0003\u0002\u0001\u00006Ã\u001cÉGfÚÏà-);&Ýãå¶NêºÂtá½V÷ëGÑ\u001cÜÒ0²Ú2=pãæÊ9ÐCL¬\u0012ÎÇ\b`Q>/ßßÍ\u0005ðÛBë±\u000bfÊj¼ï¯q¶ûv\u001eÙá%Ü\n\u0003µÔ;¥ÙäÜ+Þ\tL¯-*èºÞøRRlgV¬\u000eËìµXÏ§fI\u0010 ©{-ÁñI@ùÑIÞZO^>,»\u000fnÆjd@\u0017º>;YR²«¬;\u0010£½U_\u0003Z`\u0014N%\u00108Ë\t'°Tõd&\u0003xñ\u000fýHW¥\t×±\bó\u0002A¹FæW\u001f\u0011ÏL6ÈKþWÜëíÕ\\³kWø\u0000tD¨Ý·Ìº6ð`ØåO+T$\u0019NS¸r\u0012áÞpEV,q|*LèôÇ¨)'H·ñá\u0012\u0012²Ê-ñß\u0001\u0016¨\f(9lFÑ +2Ù\u0014%5Ú¯\u0015ZÈ¥¬Ã·l,È>y,$Ð\u001aÓ&÷G|VrVs\u001b?ôÃèç£\u0003X\u000bAäÈä§®4sÉú¶ò_]ûû¸Çòº\"e\fÆÈ\u0019æf±ü-¯>©*:\u0007ÁvL;QWn¿#ÁÍà+\u0011\"}\u0010l\u0016\u0003¸\u001dzhjÔìp71\\üíÆ`dð#þT@ñîûù\u00156|~Âp}ÉÉ<×çaóº\u0015\fêk{Ç\u0014\u001cåggc¼¬Ød_æ·\u0004DjÄ!\u0005zëZ\u0005¡^9½\u0005ùÂ°");

    /* renamed from: d */
    public static final byte[] f63828d = m43757h("0\u0005È0\u0003° \u0003\u0002\u0001\u0002\u0002\u0014;YZ1*\u000b93@¢¥\u0016è\u001f\u0016g\u001c0\r\u0006\t*H÷\r\u0001\u0001\u000b\u0005\u00000t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0 \u0017\r200505225816Z\u0018\u000f20500505225816Z0t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0\u0002\"0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0002\u000f\u00000\u0002\n\u0002\u0002\u0001\u0000ªì\u0002e\u0012\u0012çVìÐøe$7\u001e­í~N¾¦ì<n;ßÈ£¥V\u0012\u0003U£eøöQî%\u001fv¿Bt~ÀàPÖqã³¯ï¤\u0014»\fV\u000b®òÖÄP³mè]ø©\u0016¥â\b7]TSï H\u0012ºÖ\u0006ð÷ß\u0017zn,Iù\u001cx5¼Å'}\u00125\u0015nz\u0012©q±>kbÀt\u000e\u0001µ©ý£ßK¡~\tEÎ!AóCÓD¶\u001f ÊMùh31ÂIa£Þ\b6\b·+¢ØòPT}×ÚÎ?\u001fj7`$|Ü\u0002Ý¹Ú&È\u001cX\u0005d­\u000eý\t¸Û8±lÁ4P\"µ\u0007@ìµÏ\u000bXP­UÝÅo¦¤\u000fÁ¤\u0013À\u001aìèW¾®ÃùæÝl°\n,dºüÏ\u001f/ÛºZîæÎ\u001b\u000f\u0005Z/*Ç.Qêk ØuýÊø{\u0007Wð-nj\u00135ÇØÅóY\u001aê*}ÞÕ°@AÈýDæ/\u00110\u000eEÙ\r\\Ö¦­öwÓç\u001b\u0004_¶× :p\u0000EÒÏæ\u00004A¢Tf¬ò1\u0005g*Øn\u001f\u0005¡¢\t£\u000b¤Õ7§0\u0017g`lãP\u0006½sÅ&ÃH)y\u0003xÜ\u0001´¢áÛ\u0002\u001dªo[²~\u0017%lÜân\u0005ø§ù\u0017\u001bR\u0011®oç\t¤Uyê§a÷PdfÀº»¶ý¨¹oÒ\u001f<E\u001e¥öæ{ÿ\u0007£X\u001aÉX'Æ\u0019ÁQÐ¥·á9Ù±×G³ôÀ.ý;®l\u0005\f\"}\u0015é^\u0012Ëê£\u0002\u0002\u0003\u0001\u0000\u0001£P0N0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014m9Ù\u001d\b<±\u00028Uty8¸Í:0\u001f\u0006\u0003U\u001d#\u0004\u00180\u0016\u0014m9Ù\u001d\b<±\u00028Uty8¸Í:0\r\u0006\t*H÷\r\u0001\u0001\u000b\u0005\u0000\u0003\u0002\u0001\u0000m¸\bJºîB÷\b\u0010Õé8\u0015«ÓÖo÷+2û\u0011Çd_,ClE\n\u0005èòkö\u0005þ¢\r\u001dFï}8¸*ôQP¯C\u0001Ïj­\bz\u0012Ð?¯;«Ï\u0000ls%ý­\\t'GÃÐ yeç£\u0005Æh®²ïU¢&Nb²ÊëyN\"}¢%Eu­Qz\u000bÛ®-»\u0011ï¿ÄæÒ\u0017âàÅ¹ÌtY\u0017\u0011Çå\u0016.\u0003±Z4%\u001e¸ðÍxbfËâzCën9¶ç_\u0003u^d²xzéîà\u0012QGãÉ×\\\u0001aö4Xªt¾üaÈ\u0006\u0004,¸(D\u001b\u000b=Ø%+Ä³À(ÝKg\";\u001dÐ±Îø&ÿÿTúÚ+ø~pß)Áúó,iÿ®äÒÏT'cõîúè¥\nrù¦tM3ñ$E4ëè\bKYõÐ;j7¸Ä®3×ªp,+ìWô#ÀÙ±zÀa> Ã`\fÖ`r\u00175¬¾Ë8·dzQ\u0012\u001b7*Ô8ôs\u000bÉCBÍ@\u001cm\b=úùTïÌØÞ \u00004Å\bxG?\u0011¶i?Õ×;ieñøó\u0011oã)\u0002ÑUÔy·\u0013®\u0018ôëðDÞ©')\u0007iÂ\u001f\u0002Ä²ª¦\u0007Mh\u001d×j£Ü\fJmóZ¤:j/ d3\u0013à\"G\u0016\u0019ºÌ\u0014Úq+Ì[År\u0006ZÜx¿@°Ã´Þ|/¡B_ô\u0007YÃgòñíý\tjÉïH<\u00112¹ø´:×Xì:CH¡ý((G\u0002\u0010µ");

    /* renamed from: e */
    public static final byte[] f63829e = m43757h("0\u0006\u00070\u0003ï \u0003\u0002\u0001\u0002\u0002\u0015\u0000âj%ýM\u000b¨æÿ\u0006lÃÌ\u0007fÛºöï0\r\u0006\t*H÷\r\u0001\u0001\u000b\u0005\u000001\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1.0,\u0006\u0003U\u0004\u0003\f%com_google_android_wearable_assistant0 \u0017\r200505225815Z\u0018\u000f20500505225815Z01\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1.0,\u0006\u0003U\u0004\u0003\f%com_google_android_wearable_assistant0\u0002\"0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0002\u000f\u00000\u0002\n\u0002\u0002\u0001\u0000]ª.ÐXF$:ËÿyÜm\tß\u0005\u0017ëÊ±õÛöSùÁ'­Ù\u0003\u0007«%ÐEnö°¹ãYæ'­åÊ¡¨þT\u0006\"]QÙs°SÓ\u001c¼¶`L·-öÐ6­SBï`WT\u001d²&\u0013Cæ\u001f&ÞñÝt.\u0017\u0005ãÒ0råbï\u0018Nà+\rS\u0017Ò¬îß\u0000ÎãÂKãc2±j\u0004þ4F =|çíg+/¥ñ°ußk ¿OAÓ¸\u0012~ ûb½2ºÕó\"Öjù\u0006sËJ¶~·\u000eF`)Fµ8øålÔ¦xæm\n\b[¦\u000b*m%¬YScÖ\tf Û<H3|\u001fzI¬røm:\u0000\r\u0011Q\u000b*ø\rð\r\u0018\u0010ù¡áaÂ\u0002<GÏ\u0003¬\t\u001fä\u000eöÎîLcÕ\u0004Ì\u0000\u001cåpÖoÈT#Âw¸e\u001aàîl>¤3Ybô'/²´.òòG5Ñ¸uNs9àó\u0003ú?Á\u000f\u0014ùO¦âÒ¦ZôqQÄ$ñ\u001d\u001bq½\ne0G¨\tdµ\t=\u0017m\u0010]DMGÄê÷w*w->?¿éÍ\"Ñ.øÀ Äªhó¬\u000eæ\u0013%ë­J°Þì«[t¿0eôôø;ZîI¼ñ8ìþ\u0012&ñæ\u0013\u0016\u0000ÆÂç~¦§¶ÃÈ|p§SùÛ[4\u001aÜß9Á½<¶\u0017_<=ß¬\u001f\bÄ8f×Ú#f\u0011}iI\u0013êW [|õµ\u001b\u0005clD«\u000bê\u0013&\u0003Û¡ÿÜ»\u00180D9\u0002\u0003\u0001\u0000\u0001£P0N0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014[¶ªºþ©5¬Z®F2: |Ó\u00150\u001f\u0006\u0003U\u001d#\u0004\u00180\u0016\u0014[¶ªºþ©5¬Z®F2: |Ó\u00150\r\u0006\t*H÷\r\u0001\u0001\u000b\u0005\u0000\u0003\u0002\u0001\u0000vî3\u000e$Ær o´bÅq2ÑUn\u0010 yXæ9¾±¸aXÆ¡Ã­ìE?Ê±+öî\u000eN\u000bnåÎ\u0000L\u001ba\fNË\u0016á\u0006£\u0002'M\u0001z¸\u0011\u001a÷ÏY>Y>j7\u0018@D;iò5\u0004\\F\u0012ç\u0003÷Ý\u000e\u0010ñkz¶\u0005)çãuû½á@c\u0012µµX0\u0015Óô*ÆyÏ\b;6ú³àÍ\u000eçàr1ÀFEEbå\u0000ËR)£IJ{®\u0019\u001bú(°\rTÇ¸¶\u0014Ü\u0006ÕèÍQ;¸\u000e{]ó-\u0000Åx#ì÷ªTÎlW¹ß ve#çQÎÅb^ôGY9ú'm:Aý8¼ìV9b, \u0007L©òÄÂ\u0007åÑ×\fÂhM\bÛkÓK/²,ÑÏUJÎc*Êú<3k\u0006âXìZ\r6R+VA Á[tÀUçm­»qæX\u000fý+<,°Ð\u001eë\u000f\u001a10]´P3¶ÒÚÄ¶0\"N\u0010¼\u0016\u0018ÉÀ\u0018w¸|Iõ-éº¸\u0010Í?ì½\\á¬oºÁÂr¼|Ý+#¿^ØèrÖ¿÷\fé\u0001Ð&¡ç@ªcßÉõúF\\iZ¡Ù4ÄYh3 \"\u0004Ý\tO \u000ez¼Á T¶i~ãvÍ,¾\u0018X=;ÂûTúö%²¢\u0003S\u0002/]\nñXX}ähC/q-£Ãþa\u0010E $îkÐuÃh¯\td\b\u0012\u0004E¢}=aNâ\u0003\u0007\u001b\u0006P\u001cü");

    /* renamed from: l */
    private static final byte[] f63830l = m43757h("0\u0004C0\u0003+ \u0003\u0002\u0001\u0002\u0002\t\u0000ÂàFdJ00\r\u0006\t*H÷\r\u0001\u0001\u0004\u0005\u00000t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0\u001e\u0017\r080821231334Z\u0017\r360107231334Z0t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android0\u0001 0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0001\r\u00000\u0001\b\u0002\u0001\u0001\u0000«V.\u0000Ø;¢\b®\no\u0012N)Ú\u0011ò«VÐXâÌ©\u0013\u0003é·TÓrö@§\u001b\u001dË\u0013\tgbNFV§wj\u0019=²å¿·$©\u001ew\u0018\u000ejG¤;3Ù`w\u00181EÌß{.XftÉáV[\u001fLjYU¿òQ¦=«ùÅ\\'\"\"Rèuäø\u0015Jd_qhÀ±¿Æ\u0012ê¿xWi»4ªyÜ~.¢vL®\u0007ØÁqT×î_d¥\u001aD¦\u0002ÂI\u0005AWÜ\u0002Í_\\\u000eUûï\u0019ûã'ð±Q\u0016Å o\u0019ÑõÄÛÂÖ¹?hÌ)yÇ\u000e\u0018«k;ÕÛU*\u000e;LßXûíÁº5à\u0003Á´±\rÒD¨î$ÿý38r«R!^Ú°ü\r\u000b\u0014[j¡y\u0002\u0001\u0003£Ù0Ö0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014Ç}Â!\u0017V%Óßkãä×¥0¦\u0006\u0003U\u001d#\u00040\u0014Ç}Â!\u0017V%Óßkãä×¥¡x¤v0t1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android\t\u0000ÂàFdJ00\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\r\u0006\t*H÷\r\u0001\u0001\u0004\u0005\u0000\u0003\u0001\u0001\u0000mÒRÎï0,6\nªÎÏòÌ©\u0004»]z\u0016aø®F²B\u0004ÐÿJhÇí\u001aS\u001eÄYZb<æ\u0007c±g)zzãW\u0012Ä\u0007ò\bðË\u0010)\u0012M{\u0010b\u0019ÀÊ>³ù­_¸qï&âñmDÈÙ l²ð\u0005»?âËD~s\u0010v­E³?`\tê\u0019Áaæ&Aª'\u001dýR(ÅÅ]ÛE'XÖaöÌ\fÌ·5.BLÄ6\\R52÷2Q7Y<JãAôÛAíÚ\r\u000b\u0010q§Ä@ðþ \u001c¶'ÊgCiÐ½/Ù\u0011ÿ\u0006Í¿,ú\u0010Ü\u000f:ãWbHÇïÆLqD\u0017B÷\u0005ÉÞW:õ[9\r×ý¹A1]_u0\u0011&ÿb\u0014\u0010Ài0");

    /* renamed from: m */
    private static final byte[] f63831m = m43757h("0\u0002R0\u0001»\u0002\u0004I4~0\r\u0006\t*H÷\r\u0001\u0001\u0004\u0005\u00000p1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u000b0\t\u0006\u0003U\u0004\b\u0013\u0002CA1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle, Inc1\u00140\u0012\u0006\u0003U\u0004\u000b\u0013\u000bGoogle, Inc1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Unknown0\u001e\u0017\r081202020758Z\u0017\r360419020758Z0p1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u000b0\t\u0006\u0003U\u0004\b\u0013\u0002CA1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\u0013\u000bGoogle, Inc1\u00140\u0012\u0006\u0003U\u0004\u000b\u0013\u000bGoogle, Inc1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Unknown00\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u00000\u0002\u0000H\u0003\u0019ù±G&8N\u0004SÑ\u000b¿Ç{%\u0004¤± |LlDº¼\u0000­Æa\u000f¦¶«-¨\u000e3òîñk&£ö¸[úÊû¾³ôÉO~\"§àë§\\í=Ò)úseô\u0015\u0016AZ©Áa}ÕÎ\u0019ºè »Øü\u0017©´½&@Q!ªÛwÞ´\u0000\u00138\u0014\u0018.Å\"üX\r\u0002\u0003\u0001\u0000\u00010\r\u0006\t*H÷\r\u0001\u0001\u0004\u0005\u0000\u0003\u0000@fÖ1ÚCÝÐaÒ&às¹Ä¹øµä¾<¾P\u001eß\u001co©YÀÎ`\\OÒ¬m\u001cÎÞ Glº±èò :ÿw\u0017­e-Ì\u0007\bÑ!m¨DWY&IàéÓÄ»Lõ¡±ÔüA¼¹XOdæ_A\r\u0005)ý[h\u0014\u001d\nÑÛ\u0011Ë*\r÷ê\f±-³¤");

    /* renamed from: n */
    private static final byte[] f63832n = m43757h("0\u0004¨0\u0003 \u0003\u0002\u0001\u0002\u0002\t\u0000Õ¸l}ÓNõ0\r\u0006\t*H÷\r\u0001\u0001\u0004\u0005\u000001\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*H÷\r\u0001\t\u0001\u0016\u0013android@android.com0\u001e\u0017\r080415233656Z\u0017\r350901233656Z01\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*H÷\r\u0001\t\u0001\u0016\u0013android@android.com0\u0001 0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0001\r\u00000\u0001\b\u0002\u0001\u0001\u0000ÖÎ.\b\n¿â1MÑ³ÏÓ\u0018\\´=3ú\ftá½¶ÑÛ\u0013ö,\\9ßVøF=e¾ÀóÊBk\u0007Å¨íZ9ÁgçkÉ¹'K\u000b\"\u0000\u0019©)\u0015årÅm*0\u001b£oÅü\u0011:ÖËt5¡m#«}úîáeäß\u001f\n½§\nQlN\u0005\u0011Ê|\fU\u0017[ÃuùHÅj®\b¤O¦¤Ý}¿,\n5\"­\u0006¸Ì\u0018^±Uyîøm\b\u000b\u001daÀù¯±ÂëÑ\u0007êE«Ûh£Ç^TÇlSÔ\u000b\u0012\u001dç»Ó\u000eb\f\u0018áªaÛ¼Ý<d_/UóÔÃuì@p©?qQØ6pÁj\u001a¾^òÑ\u0018á¸®ó)ðf¿láD¬èm\u001c\u001b\u000f\u0002\u0001\u0003£ü0ù0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014\u001cÅ¾LC<a:\u0015°L¼\u0003òOà²0É\u0006\u0003U\u001d#\u0004Á0¾\u0014\u001cÅ¾LC<a:\u0015°L¼\u0003òOà²¡¤01\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\u0013\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\u0013\rMountain View1\u00100\u000e\u0006\u0003U\u0004\n\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u000b\u0013\u0007Android1\u00100\u000e\u0006\u0003U\u0004\u0003\u0013\u0007Android1\"0 \u0006\t*H÷\r\u0001\t\u0001\u0016\u0013android@android.com\t\u0000Õ¸l}ÓNõ0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\r\u0006\t*H÷\r\u0001\u0001\u0004\u0005\u0000\u0003\u0001\u0001\u0000\u0019Ó\fñ\u0005ûx?L\r}Ò##=@zÏÎ\u0000\b\u001d[×ÆéÖí k\u000e\u0011 \u0006Al¢D\u0013ÒkJ àõ$ÊÒ»\\nL¡\u0001j\u0015n¡ì]ÉZ^:\u0001\u00006ôHÕ\u0010¿.\u001eag:;åm¯\u000bw±Â)ãÂUãèL]#ïº\tËñ; +NZ\"É2cHJ#Òü)ú\u00199u3¯Øª\u0016\u000fBÂÐ\u0016>fCéÁ/ Á33[Àÿk\"ÞÑ­DB)¥9©Nï­«ÐeÎÒK>QåÝ{fx{ï\u0012þû¤Ä#ûOøÌIL\u0002ðõ\u0005\u0016\u0012ÿe)9>FêÅ»!òwÁQª_*¦'Ñè§\n¶\u00035iÞ;¿ÿ|©Ú>\u0012Cö\u000b");

    /* renamed from: o */
    private static final byte[] f63833o = m43757h("0\u0003½0\u0002¥ \u0003\u0002\u0001\u0002\u0002\t\u0000¯\u0018\u001f3Èf\u0015_0\r\u0006\t*H÷\r\u0001\u0001\u0005\u0005\u00000u1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\f\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\f\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\f\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\f\u0007Android1\u00110\u000f\u0006\u0003U\u0004\u0003\f\btvsearch0\u001e\u0017\r140715161615Z\u0017\r411130161615Z0u1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\f\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\f\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\f\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\f\u0007Android1\u00110\u000f\u0006\u0003U\u0004\u0003\f\btvsearch0\u0001\"0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0001\u000f\u00000\u0001\n\u0002\u0001\u0001\u0000¸þUÞq5ö\u001c\f±\u0012ÊèìuPûÖü\u0002Å¾w®ÉÈÔ5\u0006\u001fõ 2«åHyÉuÚi [æ\u0005ß3\u000ek?\u0001ôªUï\u001bËï \u0010:RSÂdGî©|\u0012\u0010\\nípÐ\u0001\u0019>5è\u0005ÅÍcÃ{s)§Ð¦ëj-×ØD1\u0005ôEFò¯¾«Æ¼_P¢^±bsv§Ì\u0015ñ^\u0012UGú\u0011\u001bm¬J\u000bÕL~ÅïsÀL\u001bP7j³1u-\u0001-\u000b\f\u001dJÛ*\nÏpÐNó\u0012g\u001aôm®åtI\u0006ö¯\u0002¤rK»½lÌÞaô=}ðWà\u0019;É9á­â¼\u0000º·¸,ùä\u0015_ãmÞÃániãÔ¬8!¦9ðÎá®\u0017\u0002\u0003\u0001\u0000\u0001£P0N0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014öóðP\u001aX\u0015²RÍët!²£âC0\u001f\u0006\u0003U\u001d#\u0004\u00180\u0016\u0014öóðP\u001aX\u0015²RÍët!²£âC0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\r\u0006\t*H÷\r\u0001\u0001\u0005\u0005\u0000\u0003\u0001\u0001\u0000¬ç¶\"RIÛ©\t\u0015oësuºèZ\u001a¾\u0001ë¯\u000b<Ê_¬%ÙA¦`êk,h4\néiô\u0001hf}\u0015\u0014©LkÑ\u001fzz6^\u0001×º\u001c\u0012\t\u0000\u0010=:J2\u0006¸À¢K:rÎ²Ä\u001duþØ&Zë\u00000Ñ\tÚóßi2-E\u0019Ú¢Ö]¶!2èÉ7z\u0013§x,uÕ\u0017ú)\\GW%\u0012Éj½Ý®e\u001cGÚí\u0012«\nßs\u0010eñ\\yáVÛÀB 11yµ¥ð/×°´­ÿw\u0004\u0019¯=+YçÒ ,GöÓG|=\u0001Ø¡uÃDvÙÇyÈÜäöà7//À\"Ô°gj§.\u0005\u001be\u000e\u000f7ìú©P5[J#WÂ");

    /* renamed from: p */
    private static final byte[] f63834p = m43757h("0\u0003½0\u0002¥ \u0003\u0002\u0001\u0002\u0002\t\u0000ôn-Ó0\r\u0006\t*H÷\r\u0001\u0001\u0005\u0005\u00000u1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\f\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\f\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\f\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\f\u0007Android1\u00110\u000f\u0006\u0003U\u0004\u0003\f\btvsearch0\u001e\u0017\r140715161554Z\u0017\r411130161554Z0u1\u000b0\t\u0006\u0003U\u0004\u0006\u0013\u0002US1\u00130\u0011\u0006\u0003U\u0004\b\f\nCalifornia1\u00160\u0014\u0006\u0003U\u0004\u0007\f\rMountain View1\u00140\u0012\u0006\u0003U\u0004\n\f\u000bGoogle Inc.1\u00100\u000e\u0006\u0003U\u0004\u000b\f\u0007Android1\u00110\u000f\u0006\u0003U\u0004\u0003\f\btvsearch0\u0001\"0\r\u0006\t*H÷\r\u0001\u0001\u0001\u0005\u0000\u0003\u0001\u000f\u00000\u0001\n\u0002\u0001\u0001\u0000ãi\u0017Ù¸q\u001bTãFt\nÝp,¢©§\u001f~\u0004\u0002ÕPÏõ\u001f\u0000UyH\tîÿ«?Cñ1u]âóænl\u0005\u0003gòã^¬kÞÎ1ûoÈëÓÌ\u001b\u0004%Ù\u0018Ôã8Là]´^¹µÐÕ¬lv#&\u001e½«¿ªv\u0015¸úêª.Ov\u0018>Çqd'ÆÁÏÚ{ù}i´_\u001cõÊÇÏ_!Ð÷cÉM{½^µóÜ_\u0004æ¼>Ü}òª±é,É}g$\u0010¯ü\u001e8dÿ\u0011,å¾j\u001e±2.»}¿â\t\u0019ÓÚh\rSû)U¾%0Nà~\tNþÀÀþkVP¸â>%#Ñ;]ùKåN\u0012\n¯Q¼ýX)¨pp£uº{ðÕ§\u0002\u0003\u0001\u0000\u0001£P0N0\u001d\u0006\u0003U\u001d\u000e\u0004\u0016\u0004\u0014\u001dÉqßóDh[0îEÒeðÀ<Ö0\u001f\u0006\u0003U\u001d#\u0004\u00180\u0016\u0014\u001dÉqßóDh[0îEÒeðÀ<Ö0\f\u0006\u0003U\u001d\u0013\u0004\u00050\u0003\u0001\u0001ÿ0\r\u0006\t*H÷\r\u0001\u0001\u0005\u0005\u0000\u0003\u0001\u0001\u0000\u0001áÿ\u0003õ/T~\u0014ÆcÍ7\u0012W¬\u0006\u001c©\u000bö=4ùçÞv\u0007§{6²[bÃð³\u001e©©Õ\u000b:[·\u0014)Cnê.ìWÕ)DuÐp.#\u0002|>\b\u0010Òi¬ü\u0012ò\u0006\u0011¤äR~ñ\u0007&»0É\u0015ë×¤xù\u0018çR¶uZ0Qg°±!ãº\u000b%ZC­b´Ìw\u0000¦B\u0018:\f\u0007m÷\u000eµ\u0006\u0015Ë$Ð\u0001\n£\nóSÎ\bêËC¹úçzG¹¿ÁÃ/DÉ\u0005O#ñzâ'JÏ\u0016ég¨¶þu®&\\~\u001cê\u0019\u000fu\u0019òL\u0000ß^×\u0004C\u0002gãs>¬x·óñÚ£$lJ\u0018Ò[ÇjJUR\u0015TåóKµtþùÜ -mkµ\u0010eå;");

    /* renamed from: f */
    Messenger f63835f = null;

    /* renamed from: g */
    final Messenger f63836g = new Messenger(new C23322a(this));

    /* renamed from: h */
    public final C23323b f63837h;

    /* renamed from: i */
    public final Context f63838i;

    /* renamed from: j */
    public volatile boolean f63839j;

    /* renamed from: k */
    public C107344n f63840k;

    public C23324c(Context context) {
        this.f63838i = context;
        this.f63837h = new C23323b(this);
    }

    /* renamed from: a */
    public static PackageInfo m43752a(Context context, String str) {
        if (context != null) {
            try {
                return context.getPackageManager().getPackageInfo(str, 64);
            } catch (PackageManager.NameNotFoundException unused) {
                ((C59052c) ((C59052c) f63825a.mo56226d()).mo56372aa(48653)).mo56389s("Package %s not found.", str);
            }
        }
        return null;
    }

    /* renamed from: b */
    public static void m43753b() {
        C58838bb.m90883r(Looper.getMainLooper().getThread() == Thread.currentThread());
    }

    /* renamed from: e */
    public static boolean m43754e(Context context) {
        return m43755f(context, "com.google.android.katniss", 9000055, f63833o, f63834p);
    }

    /* renamed from: f */
    public static boolean m43755f(Context context, String str, int i, byte[]... bArr) {
        PackageInfo a = m43752a(context, str);
        if (a == null) {
            ((C59052c) ((C59052c) f63825a.mo56226d()).mo56372aa(48656)).mo56389s("No %s found", str);
            return false;
        } else if (a.versionCode < i) {
            ((C59052c) ((C59052c) f63825a.mo56226d()).mo56372aa(48658)).mo56389s("%s too old for ssb", str);
            return false;
        } else {
            if (a.signatures.length == 1) {
                byte[] byteArray = a.signatures[0].toByteArray();
                for (byte[] equals : bArr) {
                    if (Arrays.equals(equals, byteArray)) {
                        return true;
                    }
                }
            }
            ((C59052c) ((C59052c) f63825a.mo56226d()).mo56372aa(48657)).mo56389s("%s is not Google", str);
            return false;
        }
    }

    /* renamed from: g */
    public static boolean m43756g(Context context) {
        return m43755f(context, "com.google.android.googlequicksearchbox", 300400000, f63830l, f63831m, f63832n);
    }

    /* renamed from: h */
    private static byte[] m43757h(String str) {
        try {
            return str.getBytes("ISO-8859-1");
        } catch (UnsupportedEncodingException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: c */
    public final void mo28820c(Message message) {
        message.getData().putString("ssb_service:ssb_package_name", this.f63838i.getPackageName());
        this.f63835f.send(message);
    }

    /* renamed from: d */
    public final boolean mo28821d() {
        return this.f63835f != null;
    }
}
