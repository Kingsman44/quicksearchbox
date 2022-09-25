package com.google.android.gms.analytics.internal;

import android.content.ComponentName;
import android.os.Parcel;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.analytics.C142764q;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.p10781d.C143860a;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.gms.analytics.internal.q */
/* compiled from: PG */
public final class C142747q extends C142737g {

    /* renamed from: a */
    public final C142746p f387364a = new C142746p(this);

    /* renamed from: b */
    public C142719ap f387365b;

    /* renamed from: c */
    private final C142711ah f387366c;

    /* renamed from: d */
    private final C142729az f387367d = new C142729az();

    protected C142747q(C142740j jVar) {
        super(jVar);
        this.f387366c = new C142743m(this, jVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo117488a() {
    }

    /* renamed from: b */
    public final void mo117555b() {
        C142764q.m231686b();
        mo117537k();
        try {
            C143860a.m233845a().mo119311b(this.f387328e.f387334b, this.f387364a);
        } catch (IllegalArgumentException | IllegalStateException unused) {
        }
        if (this.f387365b != null) {
            this.f387365b = null;
            this.f387328e.mo117544d().mo117535g();
        }
    }

    /* renamed from: c */
    public final void mo117556c() {
        C142764q.m231686b();
        if (mo117559f()) {
            super.mo117536i(2, "Inactivity, disconnecting from device AnalyticsService", (Object) null, (Object) null, (Object) null);
            mo117555b();
        }
    }

    /* renamed from: d */
    public final void mo117557d(ComponentName componentName) {
        C142764q.m231686b();
        if (this.f387365b != null) {
            this.f387365b = null;
            super.mo117536i(2, "Disconnected from device AnalyticsService", componentName, (Object) null, (Object) null);
            this.f387328e.mo117544d().mo117535g();
        }
    }

    /* renamed from: e */
    public final void mo117558e() {
        this.f387367d.f387316a = SystemClock.elapsedRealtime();
        C142711ah ahVar = this.f387366c;
        C142708ae aeVar = this.f387328e.f387336d;
        ahVar.mo117501d(((Long) C142715al.f387279z.mo117506a()).longValue());
    }

    /* renamed from: f */
    public final boolean mo117559f() {
        C142764q.m231686b();
        mo117537k();
        return this.f387365b != null;
    }

    /* renamed from: g */
    public final boolean mo117560g(C142718ao aoVar) {
        String str;
        C143919bh.m233958a(aoVar);
        C142764q.m231686b();
        mo117537k();
        C142719ap apVar = this.f387365b;
        if (apVar == null) {
            return false;
        }
        if (aoVar.f387292f) {
            C142708ae aeVar = this.f387328e.f387336d;
            str = C142708ae.m231548f();
        } else {
            C142708ae aeVar2 = this.f387328e.f387336d;
            str = C142708ae.m231550h();
        }
        List emptyList = Collections.emptyList();
        try {
            Map map = aoVar.f387287a;
            long j = aoVar.f387290d;
            Parcel gA = apVar.mo17260gA();
            gA.writeMap(map);
            gA.writeLong(j);
            gA.writeString(str);
            gA.writeTypedList(emptyList);
            apVar.mo17262he(1, gA);
            mo117558e();
            return true;
        } catch (RemoteException unused) {
            super.mo117536i(2, "Failed to send hits to AnalyticsService", (Object) null, (Object) null, (Object) null);
            return false;
        }
    }
}
