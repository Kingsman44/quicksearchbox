package com.google.android.apps.search.podcasts.p10550b.p10555e;

import androidx.p060c.C0984n;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97885ak;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97899ay;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97902ba;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10585m.p10587b.C140646b;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58847bk;
import com.google.protos.p4757ac.p4758a.C63112k;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.HashSet;
import java.util.Set;

/* renamed from: com.google.android.apps.search.podcasts.b.e.y */
/* compiled from: PG */
final class C140083y {

    /* renamed from: a */
    public final C140075q f380682a;

    /* renamed from: b */
    public final C21370a f380683b;

    /* renamed from: c */
    public final boolean f380684c;

    /* renamed from: d */
    final C0984n f380685d = new C0984n(0);

    /* renamed from: e */
    public int f380686e = 0;

    /* renamed from: f */
    public long f380687f = 0;

    /* renamed from: g */
    public int f380688g = 0;

    /* renamed from: h */
    public long f380689h;

    public C140083y(C97902ba baVar, C21370a aVar, boolean z) {
        this.f380682a = new C140075q(baVar.f273354b);
        this.f380683b = aVar;
        this.f380684c = z;
        this.f380689h = baVar.f273356d;
        for (C97899ay ayVar : baVar.f273355c) {
            this.f380685d.put(ayVar.f273349c, new HashSet(ayVar.f273348b));
        }
    }

    /* renamed from: b */
    public static void m227732b(C0984n nVar, String str, Object obj) {
        if (!nVar.containsKey(str)) {
            nVar.put(str, obj);
        }
    }

    /* renamed from: a */
    public final C140074p mo115430a(String str, C58833ax axVar) {
        if (!this.f380682a.f380669a.containsKey(str)) {
            this.f380682a.f380669a.put(str, new C140074p());
        }
        C63112k kVar = (C63112k) C63113l.f170365p.createBuilder();
        C58847bk bkVar = (C58847bk) axVar;
        String str2 = ((C63113l) bkVar.f156646a).f170373g;
        kVar.copyOnWrite();
        C63113l lVar = (C63113l) kVar.instance;
        str2.getClass();
        lVar.f170367a |= 64;
        lVar.f170373g = str2;
        String str3 = ((C63113l) bkVar.f156646a).f170375i;
        kVar.copyOnWrite();
        C63113l lVar2 = (C63113l) kVar.instance;
        str3.getClass();
        lVar2.f170367a |= 512;
        lVar2.f170375i = str3;
        String str4 = ((C63113l) bkVar.f156646a).f170368b;
        kVar.copyOnWrite();
        C63113l lVar3 = (C63113l) kVar.instance;
        str4.getClass();
        lVar3.f170367a |= 1;
        lVar3.f170368b = str4;
        ((C140074p) this.f380682a.f380669a.get(str)).f380667b = (C63113l) kVar.build();
        return (C140074p) this.f380682a.f380669a.get(str);
    }

    /* renamed from: c */
    public final void mo115431c(C97885ak akVar, C140641b bVar) {
        C140646b bVar2 = bVar.f381974a;
        if (bVar2 == null) {
            bVar2 = C140646b.f381993r;
        }
        String str = bVar2.f382001g;
        String str2 = akVar.f273308b;
        C63112k kVar = (C63112k) C63113l.f170365p.createBuilder();
        kVar.copyOnWrite();
        C63113l lVar = (C63113l) kVar.instance;
        str.getClass();
        lVar.f170367a |= 512;
        lVar.f170375i = str;
        C140646b bVar3 = bVar.f381974a;
        if (bVar3 == null) {
            bVar3 = C140646b.f381993r;
        }
        String str3 = bVar3.f381995a;
        kVar.copyOnWrite();
        C63113l lVar2 = (C63113l) kVar.instance;
        str3.getClass();
        lVar2.f170367a |= 64;
        lVar2.f170373g = str3;
        C140646b bVar4 = bVar.f381974a;
        if (bVar4 == null) {
            bVar4 = C140646b.f381993r;
        }
        String str4 = bVar4.f381996b;
        kVar.copyOnWrite();
        C63113l lVar3 = (C63113l) kVar.instance;
        str4.getClass();
        lVar3.f170367a |= 1;
        lVar3.f170368b = str4;
        mo115430a(str, C58833ax.m90834k((C63113l) kVar.build())).f380666a.put(str2, akVar);
        m227732b(this.f380685d, str, new HashSet());
        ((Set) this.f380685d.get(str)).add(str2);
    }
}
