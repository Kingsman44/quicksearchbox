package com.google.android.apps.search.googleapp.search.suggest.sources.icing;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138036a;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138047d;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138048e;
import com.google.android.apps.search.googleapp.search.suggest.p10449b.C138052i;
import com.google.common.p4552o.amt;
import com.google.common.p4552o.apd;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.sources.icing.d */
/* compiled from: PG */
public final class C138532d implements C138048e {

    /* renamed from: a */
    public final C138052i f376788a;

    public C138532d(C138052i iVar) {
        this.f376788a = iVar;
    }

    /* renamed from: a */
    public final void mo114093a() {
        this.f376788a.mo114099c();
    }

    /* renamed from: b */
    public final /* synthetic */ void mo114094b(C138047d dVar) {
    }

    /* renamed from: c */
    public final void mo114095c(amt amt) {
        C138036a aVar = (C138036a) this.f376788a.mo114097a();
        int i = aVar.f375593b;
        amt.copyOnWrite();
        apd apd = (apd) amt.instance;
        apd apd2 = apd.f159555aA;
        apd.f159610b |= C89885b.NOW_VALUE;
        apd.f159580X = i;
        int i2 = aVar.f375592a;
        amt.copyOnWrite();
        apd apd3 = (apd) amt.instance;
        apd3.f159610b |= 4194304;
        apd3.f159581Y = i2;
        String str = aVar.f375594c;
        amt.copyOnWrite();
        apd apd4 = (apd) amt.instance;
        apd4.f159610b |= 8388608;
        apd4.f159582Z = str;
    }
}
