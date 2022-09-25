package com.google.android.apps.search.googleapp.search.suggest.sources.p10459a;

import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138036a;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138047d;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138048e;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138052i;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138055l;
import com.google.android.apps.search.googleapp.search.suggest.p10452d.C138076c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.apd;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.a.w */
/* compiled from: PG */
public final class C138493w implements C138048e {

    /* renamed from: a */
    public final C21370a f376719a;

    /* renamed from: b */
    public final C138076c f376720b;

    /* renamed from: c */
    public final C138055l f376721c;

    /* renamed from: d */
    public final C138052i f376722d;

    public C138493w(C21370a aVar, C138076c cVar, C138055l lVar, C138052i iVar) {
        this.f376719a = aVar;
        this.f376720b = cVar;
        this.f376721c = lVar;
        this.f376722d = iVar;
    }

    /* renamed from: a */
    public final void mo114093a() {
        this.f376722d.mo114099c();
    }

    /* renamed from: b */
    public final /* synthetic */ void mo114094b(C138047d dVar) {
    }

    /* renamed from: c */
    public final void mo114095c(amt amt) {
        C138036a aVar = (C138036a) this.f376722d.mo114097a();
        String str = aVar.f375594c;
        amt.copyOnWrite();
        apd apd = (apd) amt.instance;
        apd apd2 = apd.f159555aA;
        apd.f159610b |= 512;
        apd.f159568L = str;
        int i = aVar.f375593b;
        amt.copyOnWrite();
        apd apd3 = (apd) amt.instance;
        apd3.f159610b |= 64;
        apd3.f159565I = i;
        int i2 = aVar.f375592a;
        amt.copyOnWrite();
        apd apd4 = (apd) amt.instance;
        apd4.f159610b |= 128;
        apd4.f159566J = i2;
    }
}
