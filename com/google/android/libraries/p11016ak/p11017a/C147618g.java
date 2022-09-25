package com.google.android.libraries.p11016ak.p11017a;

import android.os.Build;
import com.google.android.libraries.p11016ak.C147620aa;
import com.google.android.libraries.p11016ak.C147724f;
import p5285d.p5290b.p5291a.p5292a.C68138aa;
import p5285d.p5290b.p5291a.p5292a.C68139ab;
import p5285d.p5290b.p5291a.p5292a.C68164b;
import p5285d.p5290b.p5291a.p5292a.C68165ba;
import p5285d.p5290b.p5291a.p5292a.C68170bf;
import p5285d.p5290b.p5291a.p5292a.C68194g;
import p5285d.p5290b.p5291a.p5292a.C68195h;

/* renamed from: com.google.android.libraries.ak.a.g */
/* compiled from: PG */
public final class C147618g {
    /* renamed from: a */
    public static C68194g m240687a(C147620aa aaVar) {
        C68194g gVar = (C68194g) C68195h.f184523l.createBuilder();
        C68164b bVar = aaVar.f398440e;
        if (bVar == null) {
            bVar = C68164b.f184452b;
        }
        gVar.copyOnWrite();
        bVar.getClass();
        ((C68195h) gVar.instance).f184526b = bVar;
        gVar.copyOnWrite();
        ((C68195h) gVar.instance).f184525a = true;
        gVar.mo60287a(aaVar.f398441f);
        C68170bf a = C68170bf.m98500a(aaVar.f398439d);
        if (a == null) {
            a = C68170bf.UNRECOGNIZED;
        }
        gVar.copyOnWrite();
        ((C68195h) gVar.instance).f184531g = a.getNumber();
        C68165ba baVar = aaVar.f398443h;
        if (baVar == null) {
            baVar = C68165ba.f184455a;
        }
        gVar.copyOnWrite();
        baVar.getClass();
        ((C68195h) gVar.instance).f184532h = baVar;
        int b = C147724f.m240801b(aaVar.f398445j);
        int i = 2;
        if (b != 0 && b == 4) {
            i = 4;
        }
        gVar.copyOnWrite();
        ((C68195h) gVar.instance).f184535k = i - 2;
        return gVar;
    }

    /* renamed from: b */
    public static C68139ab m240688b(C147620aa aaVar) {
        C68138aa aaVar2 = (C68138aa) C68139ab.f184417e.createBuilder();
        String str = aaVar.f398442g;
        aaVar2.copyOnWrite();
        str.getClass();
        ((C68139ab) aaVar2.instance).f184419a = str;
        aaVar2.copyOnWrite();
        ((C68139ab) aaVar2.instance).f184420b = "android.2.0.0";
        int i = Build.VERSION.SDK_INT;
        aaVar2.copyOnWrite();
        ((C68139ab) aaVar2.instance).f184421c = i;
        String str2 = Build.MODEL;
        aaVar2.copyOnWrite();
        str2.getClass();
        ((C68139ab) aaVar2.instance).f184422d = str2;
        return (C68139ab) aaVar2.build();
    }
}
