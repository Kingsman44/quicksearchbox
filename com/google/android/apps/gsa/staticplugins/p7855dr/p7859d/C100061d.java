package com.google.android.apps.gsa.staticplugins.p7855dr.p7859d;

import android.os.Bundle;
import com.google.android.apps.gsa.shared.p7148ui.C90632ah;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7858c.C100028a;
import com.google.android.apps.gsa.staticplugins.p7855dr.p7858c.C100029b;
import com.google.android.libraries.p1730f.C21370a;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.d.d */
/* compiled from: PG */
final class C100061d extends C90632ah {

    /* renamed from: a */
    private final C100028a f279872a;

    /* renamed from: b */
    private final C21370a f279873b;

    /* renamed from: c */
    private long f279874c = 0;

    /* renamed from: d */
    private int f279875d = 0;

    /* renamed from: e */
    private int f279876e = 0;

    public C100061d(C21370a aVar, C100028a aVar2) {
        this.f279873b = aVar;
        this.f279872a = aVar2;
    }

    /* renamed from: a */
    private final void m165809a(int i) {
        if (i != this.f279876e) {
            C100028a aVar = this.f279872a;
            Bundle bundle = new Bundle();
            bundle.putInt("scrollY", Integer.valueOf(i).intValue());
            ((C100029b) aVar).f279759a.mo28345s("storeScrollPosition_int", "SrpContentEventsDispatcher", bundle);
            this.f279874c = this.f279873b.mo26870b();
            this.f279876e = i;
        }
    }

    /* renamed from: b */
    public final void mo81847b(int i, int i2) {
        int min = Math.min(i, i2);
        this.f279875d = min;
        if (this.f279873b.mo26870b() >= this.f279874c + 160) {
            m165809a(min);
        }
    }

    /* renamed from: f */
    public final void mo84898f() {
        m165809a(this.f279875d);
    }

    /* renamed from: g */
    public final void mo84899g() {
        m165809a(this.f279875d);
    }
}
