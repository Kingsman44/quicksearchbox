package com.google.android.gms.measurement;

import android.os.Bundle;
import android.os.SystemClock;
import androidx.p060c.C0977g;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.util.C144006f;
import com.google.android.gms.measurement.internal.C145301d;
import com.google.android.gms.measurement.internal.C145361ff;
import com.google.android.gms.measurement.internal.C145401gs;
import com.google.android.gms.measurement.internal.C145403gu;
import com.google.android.gms.measurement.internal.C145416hg;
import com.google.android.gms.measurement.internal.C145495ke;
import com.google.android.gms.measurement.internal.C145508x;
import com.google.android.gms.measurement.internal.UserAttributeParcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.measurement.a */
/* compiled from: PG */
final class C145121a extends C145219c {

    /* renamed from: a */
    private final C145361ff f392204a;

    /* renamed from: b */
    private final C145416hg f392205b;

    public C145121a(C145361ff ffVar) {
        C143919bh.m233958a(ffVar);
        this.f392204a = ffVar;
        this.f392205b = ffVar.mo120972j();
    }

    /* renamed from: a */
    public final int mo57672a(String str) {
        this.f392205b.mo121093K(str);
        return 25;
    }

    /* renamed from: b */
    public final long mo57673b() {
        return this.f392204a.mo120977o().mo121285r();
    }

    /* renamed from: c */
    public final String mo57674c() {
        return this.f392205b.mo121094e();
    }

    /* renamed from: d */
    public final String mo57675d() {
        return this.f392205b.mo121095i();
    }

    /* renamed from: e */
    public final String mo57676e() {
        return this.f392205b.mo121096j();
    }

    /* renamed from: f */
    public final String mo57677f() {
        return this.f392205b.mo121094e();
    }

    /* renamed from: g */
    public final List mo57678g(String str, String str2) {
        C145416hg hgVar = this.f392205b;
        C145361ff ffVar = hgVar.f393011w;
        if (hgVar.f393011w.mo120966as().mo120962j()) {
            hgVar.f393011w.mo120965ar().f392795c.mo120894a("Cannot get conditional user properties from analytics worker thread");
            return new ArrayList(0);
        }
        C145508x xVar = hgVar.f393011w.f392936f;
        if (C145508x.m236572a()) {
            hgVar.f393011w.mo120965ar().f392795c.mo120894a("Cannot get conditional user properties from main thread");
            return new ArrayList(0);
        }
        AtomicReference atomicReference = new AtomicReference();
        hgVar.f393011w.mo120966as().mo120956a(atomicReference, 5000, "get conditional user properties", new C145401gs(hgVar, atomicReference, str, str2));
        List list = (List) atomicReference.get();
        if (list != null) {
            return C145495ke.m236483D(list);
        }
        hgVar.f393011w.mo120965ar().f392795c.mo120895b("Timed out waiting for get conditional user properties", (Object) null);
        return new ArrayList();
    }

    /* renamed from: h */
    public final Map mo57679h(String str, String str2, boolean z) {
        C145416hg hgVar = this.f392205b;
        C145361ff ffVar = hgVar.f393011w;
        if (hgVar.f393011w.mo120966as().mo120962j()) {
            hgVar.f393011w.mo120965ar().f392795c.mo120894a("Cannot get user properties from analytics worker thread");
            return Collections.emptyMap();
        }
        C145508x xVar = hgVar.f393011w.f392936f;
        if (C145508x.m236572a()) {
            hgVar.f393011w.mo120965ar().f392795c.mo120894a("Cannot get user properties from main thread");
            return Collections.emptyMap();
        }
        AtomicReference atomicReference = new AtomicReference();
        hgVar.f393011w.mo120966as().mo120956a(atomicReference, 5000, "get user properties", new C145403gu(hgVar, atomicReference, str, str2, z));
        List<UserAttributeParcel> list = (List) atomicReference.get();
        if (list == null) {
            hgVar.f393011w.mo120965ar().f392795c.mo120895b("Timed out waiting for handle get user properties, includeInternal", Boolean.valueOf(z));
            return Collections.emptyMap();
        }
        C0977g gVar = new C0977g(list.size());
        for (UserAttributeParcel userAttributeParcel : list) {
            Object a = userAttributeParcel.mo120761a();
            if (a != null) {
                gVar.put(userAttributeParcel.f392541b, a);
            }
        }
        return gVar;
    }

    /* renamed from: i */
    public final void mo57680i(String str) {
        C145301d b = this.f392204a.mo120967b();
        C144006f fVar = this.f392204a.f392924A;
        b.mo120848a(str, SystemClock.elapsedRealtime());
    }

    /* renamed from: j */
    public final void mo57681j(String str, String str2, Bundle bundle) {
        C145416hg j = this.f392204a.mo120972j();
        C145361ff ffVar = j.f393011w;
        j.mo121091H(str, str2, bundle);
    }

    /* renamed from: k */
    public final void mo57682k(String str) {
        C145301d b = this.f392204a.mo120967b();
        C144006f fVar = this.f392204a.f392924A;
        b.mo120849b(str, SystemClock.elapsedRealtime());
    }

    /* renamed from: l */
    public final void mo57683l(String str, String str2, Bundle bundle) {
        this.f392205b.mo121099m(str, str2, bundle);
    }

    /* renamed from: m */
    public final void mo57684m(Bundle bundle) {
        C145416hg hgVar = this.f392205b;
        C144006f fVar = hgVar.f393011w.f392924A;
        hgVar.mo121108v(bundle, System.currentTimeMillis());
    }
}
