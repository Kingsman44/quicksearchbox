package com.google.android.libraries.lens.view.p2159q.p2160a;

import android.content.Context;
import com.google.android.libraries.geller.portable.C21942ah;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.p2246f.C29404a;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29537ar;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29551bd;
import com.google.android.libraries.mdi.download.p2248h.p2250b.C29553bf;
import com.google.android.libraries.search.p3005i.C38422al;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60888db;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.q.a.t */
/* compiled from: PG */
public final class C27573t {

    /* renamed from: a */
    private final Context f75361a;

    /* renamed from: b */
    private final C60888db f75362b;

    /* renamed from: c */
    private final String f75363c;

    /* renamed from: d */
    private final C38422al f75364d;

    /* renamed from: e */
    private final C21942ah f75365e;

    /* renamed from: f */
    private final C29551bd f75366f;

    /* renamed from: g */
    private final C58881cr f75367g;

    /* renamed from: h */
    private final C29553bf f75368h;

    /* renamed from: i */
    private final C28787cb f75369i;

    /* renamed from: j */
    private final C29404a f75370j;

    public C27573t(Context context, C60888db dbVar, C29404a aVar, String str, C38422al alVar, C21942ah ahVar, C29551bd bdVar, C58881cr crVar, C29553bf bfVar, C28787cb cbVar) {
        this.f75361a = context;
        this.f75362b = dbVar;
        this.f75370j = aVar;
        this.f75363c = str;
        this.f75364d = alVar;
        this.f75365e = ahVar;
        this.f75366f = bdVar;
        this.f75367g = crVar;
        this.f75368h = bfVar;
        this.f75369i = cbVar;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C28746bx mo33119a(C65753ak akVar, C58881cr crVar) {
        C29537ar arVar = new C29537ar();
        arVar.f80038a = this.f75361a;
        arVar.f80040c = this.f75362b;
        arVar.f80039b = akVar;
        arVar.f80053p = this.f75370j;
        C38422al alVar = this.f75364d;
        Objects.requireNonNull(alVar);
        arVar.f80041d = new C27572s(alVar);
        arVar.f80050m = this.f75365e;
        arVar.f80047j = this.f75366f;
        arVar.f80048k = this.f75363c;
        arVar.f80049l = this.f75369i;
        arVar.f80042e = this.f75367g;
        arVar.f80046i = this.f75368h;
        crVar.getClass();
        arVar.f80045h = crVar;
        arVar.f80052o = C58833ax.m90834k("lens");
        return arVar.mo34762a();
    }
}
