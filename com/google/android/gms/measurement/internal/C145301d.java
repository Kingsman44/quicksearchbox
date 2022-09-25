package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import androidx.p060c.C0977g;
import com.google.android.apps.search.sceneviewer.modelviewer.C141584am;
import java.util.Map;

/* renamed from: com.google.android.gms.measurement.internal.d */
/* compiled from: PG */
public final class C145301d extends C145328e {

    /* renamed from: a */
    public final Map f392675a = new C0977g();

    /* renamed from: b */
    public final Map f392676b = new C0977g();

    /* renamed from: c */
    public long f392677c;

    public C145301d(C145361ff ffVar) {
        super(ffVar);
    }

    /* renamed from: a */
    public final void mo120848a(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f393011w.mo120965ar().f392795c.mo120894a("Ad unit id must be a non-empty string");
        } else {
            this.f393011w.mo120966as().mo120960h(new C145220a(this, str, j));
        }
    }

    /* renamed from: b */
    public final void mo120849b(String str, long j) {
        if (str == null || str.length() == 0) {
            this.f393011w.mo120965ar().f392795c.mo120894a("Ad unit id must be a non-empty string");
        } else {
            this.f393011w.mo120966as().mo120960h(new C145247b(this, str, j));
        }
    }

    /* renamed from: c */
    public final void mo120850c(long j, C145423hn hnVar) {
        if (hnVar == null) {
            this.f393011w.mo120965ar().f392803k.mo120894a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            this.f393011w.mo120965ar().f392803k.mo120895b("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            C145495ke.m236484F(hnVar, bundle, true);
            this.f393011w.mo120972j().mo121101o(C141584am.f384270a, "_xa", bundle);
        }
    }

    /* renamed from: d */
    public final void mo120851d(String str, long j, C145423hn hnVar) {
        if (hnVar == null) {
            this.f393011w.mo120965ar().f392803k.mo120894a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            this.f393011w.mo120965ar().f392803k.mo120895b("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            C145495ke.m236484F(hnVar, bundle, true);
            this.f393011w.mo120972j().mo121101o(C141584am.f384270a, "_xu", bundle);
        }
    }

    /* renamed from: e */
    public final void mo120852e(long j) {
        C145423hn i = this.f393011w.mo120974l().mo121122i(false);
        for (String str : this.f392675a.keySet()) {
            mo120851d(str, j - ((Long) this.f392675a.get(str)).longValue(), i);
        }
        if (!this.f392675a.isEmpty()) {
            mo120850c(j - this.f392677c, i);
        }
        mo120853f(j);
    }

    /* renamed from: f */
    public final void mo120853f(long j) {
        for (String put : this.f392675a.keySet()) {
            this.f392675a.put(put, Long.valueOf(j));
        }
        if (!this.f392675a.isEmpty()) {
            this.f392677c = j;
        }
    }
}
