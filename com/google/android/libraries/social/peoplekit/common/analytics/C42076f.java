package com.google.android.libraries.social.peoplekit.common.analytics;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.social.p3260a.C41901a;
import com.google.android.libraries.social.p3260a.p3263b.C41903a;
import com.google.android.libraries.social.p3260a.p3264c.C41904a;
import com.google.android.libraries.social.p3260a.p3264c.C41907d;
import com.google.android.libraries.social.p3260a.p3265d.C41908a;
import com.google.android.libraries.social.p3269d.p3270a.C41937l;
import com.google.android.libraries.social.peoplekit.configs.PeopleKitConfig;
import com.google.p4420by.p4421a.p4422a.C57867d;
import com.google.p4420by.p4421a.p4422a.C57868e;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import p5602o.p5607c.p5608a.p5609a.C71903b;
import p5602o.p5607c.p5608a.p5609a.C71904c;
import p5602o.p5607c.p5608a.p5609a.C71913l;

/* renamed from: com.google.android.libraries.social.peoplekit.common.analytics.f */
/* compiled from: PG */
public final class C42076f implements C42075e {

    /* renamed from: a */
    String f109980a;

    /* renamed from: b */
    C71904c f109981b;

    /* renamed from: c */
    final Map f109982c = new HashMap();

    /* renamed from: d */
    private final Context f109983d;

    /* renamed from: e */
    private final Map f109984e = new HashMap();

    /* renamed from: f */
    private final C42074d f109985f;

    /* renamed from: g */
    private final C41904a f109986g;

    /* renamed from: h */
    private int f109987h;

    /* renamed from: i */
    private int f109988i;

    public C42076f(C41904a aVar, Context context, C42074d dVar) {
        this.f109986g = aVar;
        this.f109983d = context;
        this.f109985f = dVar;
    }

    /* renamed from: j */
    private final void m73655j(C41901a aVar) {
        if (this.f109986g != null && this.f109983d != null && !TextUtils.isEmpty(this.f109980a)) {
            Set<C41907d> a = this.f109986g.mo44363a();
            long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos();
            aVar.mo44359a();
            if (Log.isLoggable("AnalyticsLogger", 3)) {
                Log.d("AnalyticsLogger", aVar.toString());
            }
            new Bundle();
            for (C41907d b : a) {
                b.mo44365b();
            }
            boolean z = false;
            for (C41907d a2 : a) {
                z |= a2.mo44364a(aVar);
            }
            if (!z && Log.isLoggable("AnalyticsLogger", 3)) {
                Log.d("AnalyticsLogger", String.format(Locale.US, "Event not handled: %s", new Object[]{aVar.toString()}));
            }
            long elapsedRealtimeNanos2 = SystemClock.elapsedRealtimeNanos() - elapsedRealtimeNanos;
            if (Log.isLoggable("AnalyticsLatency", 3)) {
                Log.d("AnalyticsLatency", String.format(Locale.US, "Latency: %dns", new Object[]{Long.valueOf(elapsedRealtimeNanos2)}));
            }
        }
    }

    /* renamed from: a */
    public final Stopwatch mo44575a(String str) {
        Stopwatch stopwatch = (Stopwatch) this.f109982c.get(str);
        if (stopwatch != null) {
            return stopwatch;
        }
        Stopwatch stopwatch2 = new Stopwatch();
        this.f109982c.put(str, stopwatch2);
        return stopwatch2;
    }

    /* renamed from: b */
    public final void mo44576b(C71913l lVar) {
        m73655j(new C42077g(this.f109980a, lVar, this.f109981b));
    }

    /* renamed from: c */
    public final void mo44577c(int i, PeopleKitVisualElementPath peopleKitVisualElementPath) {
        C41903a aVar = new C41903a(i, peopleKitVisualElementPath.f109973a);
        aVar.f109307c = this.f109980a;
        boolean z = false;
        C41908a aVar2 = (C41908a) peopleKitVisualElementPath.f109973a.f109314a.get(0);
        if (!this.f109984e.containsKey(aVar2.f109313a)) {
            HashSet hashSet = new HashSet();
            hashSet.add(Integer.valueOf(i));
            this.f109984e.put(aVar2.f109313a, hashSet);
        } else {
            Integer valueOf = Integer.valueOf(i);
            if (!((Set) this.f109984e.get(aVar2.f109313a)).contains(valueOf)) {
                ((Set) this.f109984e.get(aVar2.f109313a)).add(valueOf);
            }
            C42078h hVar = new C42078h(this.f109980a, aVar, this.f109981b, z);
            m73655j(aVar);
            m73655j(hVar);
        }
        z = true;
        C42078h hVar2 = new C42078h(this.f109980a, aVar, this.f109981b, z);
        m73655j(aVar);
        m73655j(hVar2);
    }

    /* renamed from: d */
    public final void mo44578d() {
        this.f109984e.clear();
    }

    /* renamed from: e */
    public final int mo44579e() {
        return this.f109988i;
    }

    /* renamed from: f */
    public final int mo44580f() {
        return this.f109987h;
    }

    /* renamed from: g */
    public final void mo44581g(PeopleKitConfig peopleKitConfig, int i) {
        String str;
        String str2 = "0";
        this.f109980a = peopleKitConfig.mo44758c();
        try {
            str = this.f109983d.getPackageManager().getPackageInfo(this.f109983d.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            str = str2;
        }
        if (true != TextUtils.isEmpty(str)) {
            str2 = str;
        }
        int j = peopleKitConfig.mo44765j();
        C41937l b = peopleKitConfig.mo44757b();
        C57867d dVar = (C57867d) C57868e.f154587c.createBuilder();
        int a = C42071a.m73638a(j);
        dVar.copyOnWrite();
        C57868e eVar = (C57868e) dVar.instance;
        eVar.f154590b = a - 1;
        eVar.f154589a |= 2;
        C57868e eVar2 = (C57868e) dVar.build();
        C71903b bVar = (C71903b) C71904c.f191501h.createBuilder();
        bVar.copyOnWrite();
        C71904c cVar = (C71904c) bVar.instance;
        eVar2.getClass();
        cVar.f191506d = eVar2;
        cVar.f191503a |= 4;
        bVar.copyOnWrite();
        C71904c cVar2 = (C71904c) bVar.instance;
        int i2 = j - 1;
        if (j != 0) {
            cVar2.f191504b = i2;
            cVar2.f191503a |= 1;
            if (b == null) {
                b = C41937l.UNKNOWN;
            }
            bVar.copyOnWrite();
            C71904c cVar3 = (C71904c) bVar.instance;
            cVar3.f191505c = b.f109467ap;
            cVar3.f191503a |= 2;
            bVar.copyOnWrite();
            C71904c cVar4 = (C71904c) bVar.instance;
            cVar4.f191509g = 2;
            cVar4.f191503a |= 32;
            bVar.copyOnWrite();
            C71904c cVar5 = (C71904c) bVar.instance;
            str2.getClass();
            cVar5.f191503a |= 8;
            cVar5.f191507e = str2;
            bVar.copyOnWrite();
            C71904c cVar6 = (C71904c) bVar.instance;
            cVar6.f191503a |= 16;
            cVar6.f191508f = 475194430;
            this.f109981b = (C71904c) bVar.build();
            this.f109987h = 1;
            this.f109988i = 1;
            C42074d dVar2 = this.f109985f;
            if (dVar2 != null) {
                dVar2.f109978b = new C143658k(dVar2.f109977a, "SENDKIT", this.f109980a);
                return;
            }
            return;
        }
        throw null;
    }

    /* renamed from: h */
    public final void mo44582h(int i) {
        this.f109988i = i;
    }

    /* renamed from: i */
    public final void mo44583i() {
        this.f109987h = 3;
    }
}
