package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import com.facebook.litho.C6411u;
import com.google.android.libraries.elements.interfaces.C21248ar;
import com.google.android.libraries.elements.interfaces.C21256az;
import com.google.android.libraries.elements.interfaces.C21270bm;
import com.google.android.libraries.elements.interfaces.C21310q;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40076p;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40081u;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C40086z;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3143l.C40480q;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.aqr;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protobuf.C62917ay;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.i */
/* compiled from: PG */
public final class C40044i implements C21270bm {

    /* renamed from: a */
    public static final C59071e f105215a = C59071e.m91332i("com.google.android.libraries.search.rendering.xuikit.a.c.i");

    /* renamed from: b */
    public final C40480q f105216b;

    /* renamed from: c */
    public final C40364q f105217c;

    public C40044i(C40480q qVar, C40364q qVar2) {
        this.f105216b = qVar;
        this.f105217c = qVar2;
    }

    /* renamed from: a */
    public final C62917ay mo25837a() {
        return C57696b.f154138m;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo25838b(C6411u uVar, C21319z zVar, String str, Object obj, C21248ar arVar, C21310q qVar) {
        C40027ah ahVar;
        C40076p pVar;
        C57696b bVar = (C57696b) obj;
        C21256az h = zVar.mo26806h();
        Object f = h != null ? h.mo26725f() : null;
        if (f instanceof C40086z) {
            C40086z zVar2 = (C40086z) f;
            ahVar = zVar2.f105307a;
            pVar = zVar2.f105308b;
        } else if (arVar instanceof C40081u) {
            C40081u uVar2 = (C40081u) arVar;
            ahVar = uVar2.f105299b;
            pVar = uVar2.f105300c;
        } else {
            return;
        }
        if (bVar.f154145f) {
            arVar.mo25943q(new C40040e(this, ahVar, bVar));
        }
        if (bVar.f154146g) {
            arVar.mo25941o(new C40041f(this, ahVar, bVar));
        }
        int b = aqr.m92462b(bVar.f154143d);
        if (b != 0 && b == 2) {
            arVar.mo25939m(new C40042g(this, ahVar, bVar));
        }
        if (bVar.f154147h) {
            C40043h hVar = new C40043h(this, pVar.mo42109a(), bVar, zVar);
            arVar.mo25948v(hVar);
            arVar.mo25940n(hVar);
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo25839c(C21248ar arVar) {
        throw null;
    }
}
