package com.google.android.libraries.search.p2904c.p2942m.p2943a;

import com.google.android.libraries.search.p2904c.C37360ay;
import com.google.android.libraries.search.p2904c.C37401bf;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37453cb;
import com.google.android.libraries.search.p2904c.C37454cc;
import com.google.android.libraries.search.p2904c.C37512ds;
import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37565ef;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.m.a.ac */
/* compiled from: PG */
public final class C37830ac implements C37402bg {

    /* renamed from: a */
    final /* synthetic */ C37519dz f100358a;

    /* renamed from: b */
    final /* synthetic */ C37512ds f100359b;

    public C37830ac(C37519dz dzVar, C37512ds dsVar) {
        this.f100358a = dzVar;
        this.f100359b = dsVar;
    }

    /* renamed from: a */
    public final C37401bf mo20354a() {
        return new C37839al(this.f100359b, C37565ef.FAILED_START_LISTENING);
    }

    /* renamed from: b */
    public final C60870cx mo20355b() {
        return C60856cj.m92900i(C37360ay.f99224l);
    }

    /* renamed from: c */
    public final C60870cx mo20356c() {
        C37453cb cbVar = (C37453cb) C37454cc.f99428c.createBuilder();
        cbVar.copyOnWrite();
        C37454cc ccVar = (C37454cc) cbVar.instance;
        ccVar.f99430a |= 1;
        ccVar.f99431b = -1;
        return C60856cj.m92900i((C37454cc) cbVar.build());
    }

    /* renamed from: d */
    public final C60870cx mo20357d() {
        return C60856cj.m92900i(new C37829ab(this));
    }

    /* renamed from: e */
    public final /* bridge */ /* synthetic */ Object mo20358e() {
        return new C37839al(this.f100359b, C37565ef.FAILED_START_LISTENING);
    }
}
