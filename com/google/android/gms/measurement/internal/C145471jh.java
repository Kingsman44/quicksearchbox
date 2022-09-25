package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.SystemClock;
import com.google.android.gms.common.util.C144006f;
import p5304e.p5305a.p5306a.p5390n.p5405h.p5406a.C68931y;

/* renamed from: com.google.android.gms.measurement.internal.jh */
/* compiled from: PG */
final class C145471jh {

    /* renamed from: a */
    protected long f393313a;

    /* renamed from: b */
    protected long f393314b;

    /* renamed from: c */
    public final C145231ak f393315c;

    /* renamed from: d */
    final /* synthetic */ C145473jj f393316d;

    public C145471jh(C145473jj jjVar) {
        this.f393316d = jjVar;
        this.f393315c = new C145470jg(this, jjVar.f393011w);
        C144006f fVar = jjVar.f393011w.f392924A;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        this.f393313a = elapsedRealtime;
        this.f393314b = elapsedRealtime;
    }

    /* renamed from: a */
    public final boolean mo121186a(boolean z, boolean z2, long j) {
        this.f393316d.mo120904g();
        this.f393316d.mo120949a();
        if (!C68931y.m99969c() || !this.f393316d.f393011w.f392937g.mo120776m((String) null, C145313dl.f392724ad)) {
            C145336eh ehVar = this.f393316d.f393011w.mo120971g().f392861n;
            C144006f fVar = this.f393316d.f393011w.f392924A;
            ehVar.mo120916b(System.currentTimeMillis());
        } else if (this.f393316d.f393011w.mo120980r()) {
            C145336eh ehVar2 = this.f393316d.f393011w.mo120971g().f392861n;
            C144006f fVar2 = this.f393316d.f393011w.f392924A;
            ehVar2.mo120916b(System.currentTimeMillis());
        }
        long j2 = j - this.f393313a;
        if (z || j2 >= 1000) {
            if (!z2) {
                j2 = j - this.f393314b;
                this.f393314b = j;
            }
            this.f393316d.f393011w.mo120965ar().f392803k.mo120895b("Recording user engagement, ms", Long.valueOf(j2));
            Bundle bundle = new Bundle();
            bundle.putLong("_et", j2);
            C145495ke.m236484F(this.f393316d.f393011w.mo120974l().mo121122i(!this.f393316d.f393011w.f392937g.mo120778o()), bundle, true);
            if (!z2) {
                this.f393316d.f393011w.mo120972j().mo121101o("auto", "_e", bundle);
            }
            this.f393313a = j;
            this.f393315c.mo120829a();
            this.f393315c.mo120831c(3600000);
            return true;
        }
        this.f393316d.f393011w.mo120965ar().f392803k.mo120895b("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j2));
        return false;
    }
}
