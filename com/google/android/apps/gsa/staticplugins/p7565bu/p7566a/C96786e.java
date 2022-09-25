package com.google.android.apps.gsa.staticplugins.p7565bu.p7566a;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90034cm;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.assistant.p1363c.p1371b.p1374b.C17031a;
import com.google.android.libraries.geller.portable.C21942ah;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.p2246f.C29404a;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29537ar;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29551bd;
import com.google.android.libraries.search.p3005i.C38422al;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60888db;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Objects;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.staticplugins.bu.a.e */
/* compiled from: PG */
public final class C96786e {

    /* renamed from: a */
    private final Context f270689a;

    /* renamed from: b */
    private final C38422al f270690b;

    /* renamed from: c */
    private final C21942ah f270691c;

    /* renamed from: d */
    private final C29551bd f270692d;

    /* renamed from: e */
    private final C17031a f270693e;

    /* renamed from: f */
    private final C86124t f270694f;

    /* renamed from: g */
    private final C28787cb f270695g;

    /* renamed from: h */
    private final C29404a f270696h;

    /* renamed from: i */
    private final C96755a f270697i;

    /* renamed from: j */
    private final C96789h f270698j;

    /* renamed from: k */
    private final C90851k f270699k;

    public C96786e(Context context, C90851k kVar, C38422al alVar, C21942ah ahVar, C29404a aVar, C29551bd bdVar, C17031a aVar2, C96755a aVar3, C86124t tVar, C28787cb cbVar, C96789h hVar) {
        this.f270689a = context;
        this.f270699k = kVar;
        this.f270690b = alVar;
        this.f270691c = ahVar;
        this.f270696h = aVar;
        this.f270692d = bdVar;
        this.f270693e = aVar2;
        this.f270697i = aVar3;
        this.f270694f = tVar;
        this.f270695g = cbVar;
        this.f270698j = hVar;
    }

    /* renamed from: a */
    public final C29537ar mo90346a(C65753ak akVar, boolean z, Supplier supplier) {
        C58881cr crVar;
        C60888db a = this.f270699k.mo85208a(String.valueOf(String.valueOf(akVar)).concat("GddFileGroupPopulator"));
        C29537ar arVar = new C29537ar();
        arVar.f80039b = akVar;
        if (z) {
            crVar = this.f270697i;
        } else {
            crVar = this.f270693e;
        }
        arVar.f80042e = crVar;
        arVar.f80038a = this.f270689a;
        arVar.f80040c = a;
        arVar.f80053p = this.f270696h;
        arVar.f80049l = this.f270695g;
        arVar.f80045h = new C96782b(supplier);
        C38422al alVar = this.f270690b;
        Objects.requireNonNull(alVar);
        arVar.f80041d = new C96784c(alVar);
        arVar.f80050m = this.f270691c;
        arVar.f80047j = this.f270692d;
        arVar.f80048k = this.f270694f.mo79758x(C90034cm.f248343I);
        arVar.f80046i = this.f270698j;
        arVar.f80052o = C58833ax.m90834k("assistant");
        return arVar;
    }
}
