package com.google.android.apps.gsa.staticplugins.opa.p8364g;

import android.media.AudioManager;
import androidx.p060c.C0984n;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90821bm;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.g.f */
/* compiled from: PG */
public final class C109063f {

    /* renamed from: a */
    public String f303609a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public final Optional f303610b;

    /* renamed from: c */
    public final AudioManager f303611c;

    /* renamed from: d */
    final Object f303612d = new Object();

    /* renamed from: e */
    final C0984n f303613e = new C0984n(0);

    public C109063f(AudioManager audioManager, C90821bm bmVar) {
        bmVar.mo85163a(C109062e.class);
        this.f303611c = audioManager;
        this.f303610b = Optional.m71637of(new C109061d(this));
    }
}
