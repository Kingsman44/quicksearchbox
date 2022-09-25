package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.staticplugins.bisto.p7488f.C95299e;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.lz */
/* compiled from: PG */
public final class C96392lz implements Runnable {

    /* renamed from: a */
    public static final C59071e f269669a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.lz");

    /* renamed from: b */
    private final C89496ch f269670b;

    /* renamed from: c */
    private final C95299e f269671c;

    /* renamed from: d */
    private final String f269672d;

    /* renamed from: e */
    private final C22871g f269673e;

    public C96392lz(C89496ch chVar, C95299e eVar, C96094ay ayVar, C22871g gVar) {
        this.f269670b = chVar;
        this.f269671c = eVar;
        String str = ayVar.f269039a;
        str.getClass();
        this.f269672d = str;
        this.f269673e = gVar;
    }

    public final void run() {
        C60870cx p = this.f269670b.mo83410p(this.f269672d, C96389lw.f269666a, 15000);
        C22871g gVar = this.f269673e;
        C95299e eVar = this.f269671c;
        Objects.requireNonNull(eVar);
        new C90873ag(p, gVar, "update-model-id", new C96390lx(eVar)).mo85223a(C96391ly.f269668a);
    }
}
