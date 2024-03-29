package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a;

import android.os.Build;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.immersivecanvas.p9842a.p9843a.C129704a;
import com.google.android.libraries.assistant.p1363c.p1386e.p1387a.C17235c;
import com.google.assistant.p3897e.p3910e.p3911a.C51188c;
import com.google.assistant.p3897e.p3910e.p3911a.C51189d;
import com.google.assistant.p3897e.p3917i.p3918a.C51303cs;
import com.google.assistant.p3897e.p3917i.p3918a.C51334dw;
import com.google.assistant.p3897e.p3917i.p3918a.C51567mm;
import com.google.assistant.p3897e.p3917i.p3918a.C51568mn;
import com.google.assistant.p3897e.p3921j.C52079el;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52090ew;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52228jz;
import com.google.assistant.p3897e.p3921j.C52230ka;
import com.google.assistant.p3897e.p3921j.C52231kb;
import com.google.assistant.p3897e.p3921j.C52232kc;
import com.google.assistant.p3897e.p3921j.C52427ri;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.assistant.p3897e.p3921j.alb;
import com.google.protobuf.C63088z;
import com.google.speech.p5208h.C66598bx;
import com.google.speech.p5208h.C66599by;
import com.google.speech.p5208h.C66606cd;
import com.google.speech.p5208h.C66607ce;
import com.google.speech.p5208h.C66629d;
import com.google.speech.p5208h.C66660e;
import com.google.speech.p5208h.C66672f;
import com.google.speech.p5208h.C66677k;
import com.google.speech.p5208h.C66678l;
import com.google.speech.p5224k.p5225a.C67239q;
import com.google.speech.p5224k.p5225a.C67240r;
import com.google.speech.p5224k.p5225a.C67242t;
import com.google.speech.p5224k.p5225a.C67243u;
import com.google.speech.p5224k.p5225a.C67244v;
import com.google.speech.recognizer.p5233a.C67451at;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.immersivecanvas.a.j */
/* compiled from: PG */
final class C129727j implements C17235c {

    /* renamed from: a */
    final /* synthetic */ C129728k f355984a;

    public C129727j(C129728k kVar) {
        this.f355984a = kVar;
    }

    /* renamed from: a */
    public final void mo23244a(C66606cd cdVar) {
        cdVar.copyOnWrite();
        C66607ce ceVar = (C66607ce) cdVar.instance;
        C66607ce ceVar2 = C66607ce.f181191f;
        ceVar.f181193a |= 1;
        ceVar.f181194b = "assistant-storybooks";
        C66598bx bxVar = (C66598bx) C66599by.f181159p.createBuilder();
        bxVar.copyOnWrite();
        C66599by byVar = (C66599by) bxVar.instance;
        byVar.f181162a |= 4;
        byVar.f181167f = "Android";
        String str = Build.DISPLAY;
        bxVar.copyOnWrite();
        C66599by byVar2 = (C66599by) bxVar.instance;
        str.getClass();
        byVar2.f181162a |= 8;
        byVar2.f181168g = str;
        String str2 = Build.MODEL;
        bxVar.copyOnWrite();
        C66599by byVar3 = (C66599by) bxVar.instance;
        str2.getClass();
        byVar3.f181162a |= 64;
        byVar3.f181171j = str2;
        bxVar.copyOnWrite();
        C66599by byVar4 = (C66599by) bxVar.instance;
        byVar4.f181162a |= 16;
        byVar4.f181169h = "continuous-match-mode";
        cdVar.mo58885m(C66599by.f181160q, (C66599by) bxVar.build());
        C129728k kVar = this.f355984a;
        C51567mm mmVar = (C51567mm) C51568mn.f134404c.createBuilder();
        alb alb = kVar.f355988d;
        mmVar.copyOnWrite();
        C51568mn mnVar = (C51568mn) mmVar.instance;
        alb.getClass();
        mnVar.f134407b = alb;
        mnVar.f134406a |= 1;
        C52228jz jzVar = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar.copyOnWrite();
        C52230ka kaVar = (C52230ka) jzVar.instance;
        kaVar.f137059a |= 1;
        kaVar.f137060b = "assistant.api.params.StorybooksParams";
        C63088z byteString = ((C51568mn) mmVar.build()).toByteString();
        jzVar.copyOnWrite();
        C52230ka kaVar2 = (C52230ka) jzVar.instance;
        byteString.getClass();
        kaVar2.f137059a |= 2;
        kaVar2.f137061c = byteString;
        C52230ka kaVar3 = (C52230ka) jzVar.build();
        C52090ew ewVar = (C52090ew) C52091ex.f136710b.createBuilder();
        C52231kb kbVar = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar.copyOnWrite();
        C52232kc kcVar = (C52232kc) kbVar.instance;
        kcVar.f137064a |= 1;
        kcVar.f137065b = "storybooks";
        kbVar.copyOnWrite();
        C52232kc kcVar2 = (C52232kc) kbVar.instance;
        kaVar3.getClass();
        kcVar2.f137066c = kaVar3;
        kcVar2.f137064a |= 2;
        ewVar.mo53792e((C52232kc) kbVar.build());
        C52079el elVar = (C52079el) C52081en.f136679i.createBuilder();
        C52091ex exVar = (C52091ex) ewVar.build();
        elVar.copyOnWrite();
        C52081en enVar = (C52081en) elVar.instance;
        exVar.getClass();
        enVar.f136685e = exVar;
        enVar.f136681a |= 16;
        C52081en enVar2 = (C52081en) elVar.build();
        C66660e eVar = (C66660e) C66672f.f181366c.createBuilder();
        eVar.copyOnWrite();
        C66672f fVar = (C66672f) eVar.instance;
        enVar2.getClass();
        fVar.f181370b = enVar2;
        fVar.f181369a |= 2;
        cdVar.mo58885m(C66672f.f181367d, (C66672f) eVar.build());
        C67239q qVar = (C67239q) C67244v.f182771s.createBuilder();
        qVar.copyOnWrite();
        C67244v vVar = (C67244v) qVar.instance;
        vVar.f182774a |= 8;
        vVar.f182779f = true;
        qVar.copyOnWrite();
        C67244v vVar2 = (C67244v) qVar.instance;
        vVar2.f182774a |= 33554432;
        vVar2.f182786m = false;
        qVar.copyOnWrite();
        C67244v vVar3 = (C67244v) qVar.instance;
        vVar3.f182774a |= 1024;
        vVar3.f182782i = 0;
        qVar.copyOnWrite();
        C67244v vVar4 = (C67244v) qVar.instance;
        vVar4.f182774a |= C89885b.S3REQUEST_VALUE;
        vVar4.f182784k = true;
        qVar.copyOnWrite();
        C67244v vVar5 = (C67244v) qVar.instance;
        vVar5.f182774a |= C89885b.HTTP_VALUE;
        vVar5.f182785l = true;
        C67240r rVar = (C67240r) C67243u.f182767c.createBuilder();
        C67242t tVar = C67242t.NO_PREAMBLE;
        rVar.copyOnWrite();
        C67243u uVar = (C67243u) rVar.instance;
        uVar.f182770b = tVar.f182766u;
        uVar.f182769a |= 1;
        C67243u uVar2 = (C67243u) rVar.build();
        qVar.copyOnWrite();
        C67244v vVar6 = (C67244v) qVar.instance;
        uVar2.getClass();
        vVar6.f182787n = uVar2;
        vVar6.f182774a |= 536870912;
        qVar.copyOnWrite();
        C67244v vVar7 = (C67244v) qVar.instance;
        vVar7.f182775b |= 8;
        vVar7.f182789p = false;
        qVar.copyOnWrite();
        C67244v vVar8 = (C67244v) qVar.instance;
        vVar8.f182775b |= 128;
        vVar8.f182791r = false;
        cdVar.mo58885m(C67244v.f182772t, (C67244v) qVar.build());
        C66677k kVar2 = (C66677k) C66678l.f181384f.createBuilder();
        C67451at atVar = C67451at.LINEAR16;
        kVar2.copyOnWrite();
        C66678l lVar = (C66678l) kVar2.instance;
        lVar.f181389b = atVar.f183321p;
        lVar.f181388a |= 1;
        int i = C129704a.f355938a.f99228c;
        kVar2.copyOnWrite();
        C66678l lVar2 = (C66678l) kVar2.instance;
        lVar2.f181388a |= 2;
        lVar2.f181390c = (float) i;
        int i2 = C129704a.f355938a.f99229d;
        kVar2.copyOnWrite();
        C66678l lVar3 = (C66678l) kVar2.instance;
        lVar3.f181388a |= 4;
        lVar3.f181391d = i2;
        cdVar.mo58885m(C66678l.f181385g, (C66678l) kVar2.build());
        C51303cs csVar = (C51303cs) C51334dw.f133658ab.createBuilder();
        C52427ri riVar = (C52427ri) C52428rj.f137558m.createBuilder();
        riVar.copyOnWrite();
        C52428rj rjVar = (C52428rj) riVar.instance;
        rjVar.f137560a |= 8;
        rjVar.f137563d = "tng-client-intance";
        csVar.copyOnWrite();
        C51334dw dwVar = (C51334dw) csVar.instance;
        C52428rj rjVar2 = (C52428rj) riVar.build();
        rjVar2.getClass();
        dwVar.f133696j = rjVar2;
        dwVar.f133685a |= 256;
        C52228jz jzVar2 = (C52228jz) C52230ka.f137057d.createBuilder();
        jzVar2.copyOnWrite();
        C52230ka kaVar4 = (C52230ka) jzVar2.instance;
        kaVar4.f137059a |= 1;
        kaVar4.f137060b = "assistant.api.params.DeviceProperties";
        C63088z byteString2 = ((C51334dw) csVar.build()).toByteString();
        jzVar2.copyOnWrite();
        C52230ka kaVar5 = (C52230ka) jzVar2.instance;
        byteString2.getClass();
        kaVar5.f137059a |= 2;
        kaVar5.f137061c = byteString2;
        C52230ka kaVar6 = (C52230ka) jzVar2.build();
        C52090ew ewVar2 = (C52090ew) C52091ex.f136710b.createBuilder();
        C52231kb kbVar2 = (C52231kb) C52232kc.f137062d.createBuilder();
        kbVar2.copyOnWrite();
        C52232kc kcVar3 = (C52232kc) kbVar2.instance;
        kcVar3.f137064a = 1 | kcVar3.f137064a;
        kcVar3.f137065b = "asst.device.properties";
        kbVar2.copyOnWrite();
        C52232kc kcVar4 = (C52232kc) kbVar2.instance;
        kaVar6.getClass();
        kcVar4.f137066c = kaVar6;
        kcVar4.f137064a |= 2;
        ewVar2.mo53792e((C52232kc) kbVar2.build());
        C52079el elVar2 = (C52079el) C52081en.f136679i.createBuilder();
        C52091ex exVar2 = (C52091ex) ewVar2.build();
        elVar2.copyOnWrite();
        C52081en enVar3 = (C52081en) elVar2.instance;
        exVar2.getClass();
        enVar3.f136685e = exVar2;
        enVar3.f136681a |= 16;
        C52081en enVar4 = (C52081en) elVar2.build();
        C51188c cVar = (C51188c) C51189d.f133247h.createBuilder();
        cVar.copyOnWrite();
        C51189d dVar = (C51189d) cVar.instance;
        enVar4.getClass();
        dVar.f133255g = enVar4;
        dVar.f133249a |= 64;
        cdVar.mo58885m(C66629d.f181274a, (C51189d) cVar.build());
    }
}
