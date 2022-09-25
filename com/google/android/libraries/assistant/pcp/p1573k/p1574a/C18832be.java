package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import android.support.p031v4.media.C0282s;
import android.support.p031v4.media.MediaBrowserCompat;
import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.p9330a.C123706d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.DesugarCollections;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.be */
/* compiled from: PG */
public final class C18832be {

    /* renamed from: a */
    public static final C59071e f53038a = C59071e.m91332i("com.google.android.libraries.assistant.pcp.k.a.be");

    /* renamed from: b */
    public final MediaBrowserCompat f53039b;

    /* renamed from: c */
    public final ComponentName f53040c;

    /* renamed from: d */
    public final C58485gu f53041d;

    /* renamed from: e */
    public final C60888db f53042e;

    /* renamed from: f */
    public final Map f53043f;

    /* renamed from: g */
    public final ConcurrentHashMap f53044g;

    /* renamed from: h */
    public final ConcurrentHashMap f53045h;

    /* renamed from: i */
    final ConcurrentHashMap f53046i;

    /* renamed from: j */
    public final Duration f53047j;

    /* renamed from: k */
    public final boolean f53048k;

    /* renamed from: l */
    public final long f53049l;

    /* renamed from: m */
    public final boolean f53050m;

    /* renamed from: n */
    public Optional f53051n;

    /* renamed from: o */
    public Optional f53052o;

    /* renamed from: p */
    public Optional f53053p;

    /* renamed from: q */
    public C60870cx f53054q;

    /* renamed from: r */
    public Optional f53055r;

    public C18832be(MediaBrowserCompat mediaBrowserCompat, ComponentName componentName, C58485gu guVar, C60888db dbVar, Duration duration, Duration duration2, C58485gu guVar2, boolean z, long j) {
        this.f53039b = mediaBrowserCompat;
        this.f53040c = componentName;
        this.f53041d = guVar;
        this.f53042e = dbVar;
        boolean z2 = true;
        this.f53047j = true == componentName.getPackageName().equals("com.spotify.music") ? duration2 : duration;
        this.f53050m = (!guVar2.contains(componentName.getPackageName()) || guVar.isEmpty()) ? false : z2;
        this.f53048k = z;
        this.f53049l = j;
        this.f53043f = DesugarCollections.synchronizedMap(new LinkedHashMap());
        this.f53044g = new ConcurrentHashMap();
        this.f53045h = new ConcurrentHashMap();
        this.f53046i = new ConcurrentHashMap();
        this.f53051n = Optional.empty();
        this.f53052o = Optional.empty();
        this.f53053p = Optional.empty();
        this.f53054q = C60856cj.m92899h(new IllegalStateException("Result future accessed before startSubscriptions called."));
        this.f53055r = Optional.empty();
    }

    /* renamed from: a */
    public final C0282s mo24184a(C2164c cVar) {
        return new C18888dg(new C18829bb(this, cVar));
    }

    /* renamed from: b */
    public final void mo24185b(C2164c cVar) {
        if (this.f53046i.isEmpty()) {
            ((C59052c) ((C59052c) f53038a.mo56224b()).mo56372aa(47442)).mo56389s("No more folders to subscribe or all folders returned for %s", this.f53040c);
            mo24189f(cVar, 17, "on device media item subscription callbacks all returned.");
        }
    }

    /* renamed from: c */
    public final void mo24186c(String str) {
        try {
            this.f53039b.mo804h(str);
        } catch (RuntimeException e) {
            ((C59052c) ((C59052c) ((C59052c) f53038a.mo56225c()).mo56382g(e)).mo56372aa(47445)).mo56389s("#tryUnsubscribe() Failed to unsubscribe from %s", str);
        }
    }

    /* renamed from: d */
    public final void mo24187d() {
        Collection.EL.stream(this.f53046i.keySet()).forEach(new C18824ax(this));
        this.f53046i.clear();
    }

    /* renamed from: e */
    public final boolean mo24188e() {
        if (!this.f53054q.isDone()) {
            return !this.f53043f.isEmpty();
        }
        try {
            return !((C18831bd) C60856cj.m92909r(this.f53054q)).mo24179d().isEmpty();
        } catch (ExecutionException unused) {
        }
    }

    /* renamed from: f */
    public final void mo24189f(C2164c cVar, int i, String str) {
        ((C59052c) ((C59052c) f53038a.mo56224b()).mo56372aa(47441)).mo56360M("Event log: app package name/class name %s - # of media items in result: {%d} - status code/error message %s/%s", this.f53040c, Integer.valueOf(this.f53043f.size()), C123706d.m203074a(i), str);
        cVar.mo5437b(C18831bd.m36258f(C58495hd.m89898l(this.f53043f), C58495hd.m89898l(this.f53044g), C58495hd.m89898l(this.f53045h), this.f53051n, i, str));
        mo24187d();
    }
}
