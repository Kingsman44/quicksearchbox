package com.google.android.gms.measurement.internal;

import android.app.Activity;
import android.os.Bundle;
import android.os.SystemClock;
import com.evernote.android.state.BuildConfig;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import java.util.Map;
import p3186j$.util.Objects;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.gms.measurement.internal.hu */
/* compiled from: PG */
public final class C145430hu extends C145355f {

    /* renamed from: b */
    public volatile C145423hn f393185b;

    /* renamed from: c */
    public volatile C145423hn f393186c;

    /* renamed from: d */
    protected C145423hn f393187d;

    /* renamed from: e */
    public final Map f393188e = new ConcurrentHashMap();

    /* renamed from: f */
    public Activity f393189f;

    /* renamed from: g */
    public volatile boolean f393190g;

    /* renamed from: h */
    public volatile C145423hn f393191h;

    /* renamed from: i */
    public C145423hn f393192i;

    /* renamed from: j */
    public boolean f393193j;

    /* renamed from: k */
    public final Object f393194k = new Object();

    public C145430hu(C145361ff ffVar) {
        super(ffVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final boolean mo120873d() {
        return false;
    }

    /* renamed from: e */
    public final C145423hn mo121121e(Activity activity) {
        C143919bh.m233958a(activity);
        C145423hn hnVar = (C145423hn) this.f393188e.get(activity);
        if (hnVar == null) {
            C145423hn hnVar2 = new C145423hn((String) null, mo121127n(activity.getClass()), this.f393011w.mo120977o().mo121285r());
            this.f393188e.put(activity, hnVar2);
            hnVar = hnVar2;
        }
        return this.f393191h != null ? this.f393191h : hnVar;
    }

    /* renamed from: i */
    public final C145423hn mo121122i(boolean z) {
        mo120949a();
        mo120904g();
        if (!z) {
            return this.f393187d;
        }
        C145423hn hnVar = this.f393187d;
        return hnVar != null ? hnVar : this.f393192i;
    }

    /* renamed from: j */
    public final void mo121123j(Activity activity, C145423hn hnVar, boolean z) {
        C145423hn hnVar2;
        C145423hn hnVar3;
        C145423hn hnVar4 = hnVar;
        if (this.f393185b == null) {
            hnVar2 = this.f393186c;
        } else {
            hnVar2 = this.f393185b;
        }
        C145423hn hnVar5 = hnVar2;
        if (hnVar4.f393163b == null) {
            hnVar3 = new C145423hn(hnVar4.f393162a, activity != null ? mo121127n(activity.getClass()) : null, hnVar4.f393164c, hnVar4.f393166e, hnVar4.f393167f);
        } else {
            hnVar3 = hnVar4;
        }
        this.f393186c = this.f393185b;
        this.f393185b = hnVar3;
        C144006f fVar = this.f393011w.f392924A;
        this.f393011w.mo120966as().mo120960h(new C145425hp(this, hnVar3, hnVar5, SystemClock.elapsedRealtime(), z));
    }

    /* renamed from: k */
    public final void mo121124k(C145423hn hnVar, C145423hn hnVar2, long j, boolean z, Bundle bundle) {
        long j2;
        long j3;
        C145423hn hnVar3 = hnVar;
        C145423hn hnVar4 = hnVar2;
        long j4 = j;
        Bundle bundle2 = bundle;
        mo120904g();
        boolean z2 = false;
        boolean z3 = hnVar4 == null || hnVar4.f393164c != hnVar3.f393164c || !Objects.equals(hnVar4.f393163b, hnVar3.f393163b) || !Objects.equals(hnVar4.f393162a, hnVar3.f393162a);
        if (z && this.f393187d != null) {
            z2 = true;
        }
        if (z3) {
            Bundle bundle3 = bundle2 != null ? new Bundle(bundle2) : new Bundle();
            C145495ke.m236484F(hnVar3, bundle3, true);
            if (hnVar4 != null) {
                String str = hnVar4.f393162a;
                if (str != null) {
                    bundle3.putString("_pn", str);
                }
                String str2 = hnVar4.f393163b;
                if (str2 != null) {
                    bundle3.putString("_pc", str2);
                }
                bundle3.putLong("_pi", hnVar4.f393164c);
            }
            if (z2) {
                C145471jh jhVar = this.f393011w.mo120976n().f393320d;
                long j5 = j4 - jhVar.f393314b;
                jhVar.f393314b = j4;
                if (j5 > 0) {
                    this.f393011w.mo120977o().mo121250E(bundle3, j5);
                }
            }
            if (!this.f393011w.f392937g.mo120778o()) {
                bundle3.putLong("_mst", 1);
            }
            String str3 = true != hnVar3.f393166e ? "auto" : "app";
            C144006f fVar = this.f393011w.f392924A;
            long currentTimeMillis = System.currentTimeMillis();
            if (hnVar3.f393166e) {
                j3 = currentTimeMillis;
                long j6 = hnVar3.f393167f;
                if (j6 != 0) {
                    j2 = j6;
                    this.f393011w.mo120972j().mo121102p(str3, "_vs", j2, bundle3);
                }
            } else {
                j3 = currentTimeMillis;
            }
            j2 = j3;
            this.f393011w.mo120972j().mo121102p(str3, "_vs", j2, bundle3);
        }
        if (z2) {
            mo121126m(this.f393187d, true, j4);
        }
        this.f393187d = hnVar3;
        if (hnVar3.f393166e) {
            this.f393192i = hnVar3;
        }
        this.f393011w.mo120975m().mo121162r(hnVar3);
    }

    /* renamed from: l */
    public final void mo121125l(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (this.f393011w.f392937g.mo120778o() && bundle != null && (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) != null) {
            this.f393188e.put(activity, new C145423hn(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
        }
    }

    /* renamed from: m */
    public final void mo121126m(C145423hn hnVar, boolean z, long j) {
        C145301d b = this.f393011w.mo120967b();
        C144006f fVar = this.f393011w.f392924A;
        b.mo120852e(SystemClock.elapsedRealtime());
        if (this.f393011w.mo120976n().f393320d.mo121186a(hnVar != null && hnVar.f393165d, z, j) && hnVar != null) {
            hnVar.f393165d = false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: n */
    public final String mo121127n(Class cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName == null) {
            return "Activity";
        }
        String[] split = canonicalName.split("\\.");
        int length = split.length;
        String str = length > 0 ? split[length - 1] : BuildConfig.FLAVOR;
        int length2 = str.length();
        C145222ab abVar = this.f393011w.f392937g;
        return length2 > 100 ? str.substring(0, 100) : str;
    }
}
