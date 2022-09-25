package com.google.android.apps.gsa.staticplugins.opa.util.calendar;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.C142551ak;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.calendar.a */
/* compiled from: PG */
final class C113813a extends C142551ak {

    /* renamed from: a */
    final /* synthetic */ CalendarCrossProfileConnector_Service f315220a;

    /* renamed from: b */
    private final C113821b f315221b = new C113821b();

    public C113813a(CalendarCrossProfileConnector_Service calendarCrossProfileConnector_Service) {
        this.f315220a = calendarCrossProfileConnector_Service;
    }

    /* renamed from: a */
    public final void mo77085a(long j, int i, int i2, byte[] bArr) {
        C113821b bVar = this.f315221b;
        this.f315220a.getApplicationContext();
        bVar.f315228a.mo117193a(j, i, i2, bArr);
    }

    /* renamed from: b */
    public final byte[] mo77086b(long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        return this.f315221b.mo100677a(this.f315220a.getApplicationContext(), j, i, j2, i2, bArr, aiVar);
    }

    /* renamed from: c */
    public final byte[] mo77087c(long j, int i) {
        C113821b bVar = this.f315221b;
        this.f315220a.getApplicationContext();
        return bVar.f315228a.mo117194c(j, i);
    }

    /* renamed from: d */
    public final Bundle mo77088d(long j) {
        C113821b bVar = this.f315221b;
        this.f315220a.getApplicationContext();
        return bVar.f315228a.mo117195d(j);
    }

    /* renamed from: e */
    public final void mo77089e(long j, Bundle bundle) {
        C113821b bVar = this.f315221b;
        this.f315220a.getApplicationContext();
        bVar.f315228a.mo117196e(j, bundle);
    }
}
