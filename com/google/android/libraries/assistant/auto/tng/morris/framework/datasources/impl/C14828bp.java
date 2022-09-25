package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.ComponentName;
import android.content.Context;
import android.media.session.MediaController;
import android.support.p031v4.media.session.C0320v;
import android.support.p031v4.media.session.MediaSessionCompat;
import androidx.p104d.p105a.C2169h;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15382j;
import com.google.android.libraries.assistant.p1589r.p1590a.p1591a.p1592a.p1593a.C19125a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bp */
/* compiled from: PG */
public final class C14828bp {

    /* renamed from: a */
    public static final C59071e f44655a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.bp");

    /* renamed from: b */
    public final Context f44656b;

    /* renamed from: c */
    public final C60888db f44657c;

    /* renamed from: d */
    public final C15382j f44658d;

    /* renamed from: e */
    public final C86124t f44659e;

    /* renamed from: f */
    final ConcurrentHashMap f44660f = new ConcurrentHashMap();

    /* renamed from: g */
    private final Optional f44661g;

    public C14828bp(Context context, C60888db dbVar, C15382j jVar, C86124t tVar, Optional optional) {
        this.f44656b = context;
        this.f44657c = dbVar;
        this.f44658d = jVar;
        this.f44659e = tVar;
        this.f44661g = optional;
    }

    /* renamed from: a */
    public final C0320v mo21760a(MediaController mediaController) {
        if (this.f44661g.isPresent()) {
            return ((C19125a) this.f44661g.get()).mo24287a();
        }
        return new C0320v(this.f44656b, MediaSessionCompat.Token.fromToken(mediaController.getSessionToken()));
    }

    /* renamed from: b */
    public final C60870cx mo21761b(ComponentName componentName) {
        if (this.f44660f.containsKey(componentName)) {
            return C60856cj.m92900i(((C14827bo) this.f44660f.get(componentName)).f44652d);
        }
        C58976aa aaVar = C58975e.f156826a;
        return C2169h.m6027a(new C14822bj(this, componentName));
    }
}
