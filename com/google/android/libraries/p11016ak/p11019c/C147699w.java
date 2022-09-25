package com.google.android.libraries.p11016ak.p11019c;

import com.google.android.libraries.p11016ak.p11019c.p11020a.C147643g;
import java.util.List;
import p5285d.p5290b.p5291a.p5292a.C68149al;
import p5285d.p5290b.p5291a.p5292a.C68150am;
import p5285d.p5290b.p5291a.p5292a.C68158au;
import p5285d.p5290b.p5291a.p5292a.C68200m;

/* renamed from: com.google.android.libraries.ak.c.w */
/* compiled from: PG */
public final /* synthetic */ class C147699w implements C147643g {

    /* renamed from: a */
    public final /* synthetic */ C147701y f398604a;

    /* renamed from: b */
    public final /* synthetic */ int f398605b;

    public /* synthetic */ C147699w(C147701y yVar, int i) {
        this.f398604a = yVar;
        this.f398605b = i;
    }

    /* renamed from: a */
    public final List mo124389a() {
        C68150am amVar;
        C147701y yVar = this.f398604a;
        C68200m b = yVar.f398609c.mo124384b(this.f398605b);
        C68158au auVar = b.f184548e;
        if (auVar == null) {
            auVar = C68158au.f184441d;
        }
        if (auVar.f184443a == 1) {
            amVar = (C68150am) auVar.f184444b;
        } else {
            amVar = C68150am.f184434c;
        }
        C147645b bVar = (C147645b) C147679c.f398547d.createBuilder();
        C68149al alVar = (C68149al) C68150am.f184434c.createBuilder();
        int i = amVar.f184436a;
        alVar.copyOnWrite();
        ((C68150am) alVar.instance).f184436a = i;
        int i2 = amVar.f184437b;
        alVar.copyOnWrite();
        ((C68150am) alVar.instance).f184437b = i2;
        bVar.copyOnWrite();
        C68150am amVar2 = (C68150am) alVar.build();
        amVar2.getClass();
        ((C147679c) bVar.instance).f398549a = amVar2;
        String str = yVar.f398610d.f184517c;
        bVar.copyOnWrite();
        str.getClass();
        ((C147679c) bVar.instance).f398551c = str;
        C147691o oVar = new C147691o((C147679c) bVar.build());
        C68158au auVar2 = b.f184548e;
        yVar.f398608b.mo124382c(b, oVar, "text", "audio");
        return oVar.mo124420e();
    }
}
