package com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile;

import android.os.Bundle;
import com.google.android.enterprise.connectedapps.C142549ai;
import com.google.android.enterprise.connectedapps.C142551ak;

/* renamed from: com.google.android.apps.search.assistant.verticals.calendar.localcalendar.crossprofile.k */
/* compiled from: PG */
final class C131992k extends C142551ak {

    /* renamed from: a */
    final /* synthetic */ LocalCalendarCrossProfileConnector_Service f360330a;

    /* renamed from: b */
    private final C131993l f360331b = new C131993l();

    public C131992k(LocalCalendarCrossProfileConnector_Service localCalendarCrossProfileConnector_Service) {
        this.f360330a = localCalendarCrossProfileConnector_Service;
    }

    /* renamed from: a */
    public final void mo77085a(long j, int i, int i2, byte[] bArr) {
        C131993l lVar = this.f360331b;
        this.f360330a.getApplicationContext();
        lVar.f360332a.mo117193a(j, i, i2, bArr);
    }

    /* renamed from: b */
    public final byte[] mo77086b(long j, int i, long j2, int i2, byte[] bArr, C142549ai aiVar) {
        return this.f360331b.mo110369a(this.f360330a.getApplicationContext(), j, i, j2, i2, bArr, aiVar);
    }

    /* renamed from: c */
    public final byte[] mo77087c(long j, int i) {
        C131993l lVar = this.f360331b;
        this.f360330a.getApplicationContext();
        return lVar.f360332a.mo117194c(j, i);
    }

    /* renamed from: d */
    public final Bundle mo77088d(long j) {
        C131993l lVar = this.f360331b;
        this.f360330a.getApplicationContext();
        return lVar.f360332a.mo117195d(j);
    }

    /* renamed from: e */
    public final void mo77089e(long j, Bundle bundle) {
        C131993l lVar = this.f360331b;
        this.f360330a.getApplicationContext();
        lVar.f360332a.mo117196e(j, bundle);
    }
}
