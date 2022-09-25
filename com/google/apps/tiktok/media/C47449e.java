package com.google.apps.tiktok.media;

import android.content.ComponentCallbacks2;
import com.bumptech.glide.C5514ad;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.apps.tiktok.media.e */
/* compiled from: PG */
public final class C47449e {

    /* renamed from: a */
    public volatile C5514ad f123218a;

    /* renamed from: b */
    public int f123219b;

    /* renamed from: c */
    public final ComponentCallbacks2 f123220c = new C47448d(this);

    /* renamed from: d */
    private final C69464a f123221d;

    /* renamed from: e */
    private final C47450f f123222e;

    /* renamed from: f */
    private final boolean f123223f;

    /* renamed from: g */
    private final Object f123224g = new Object();

    public C47449e(C69464a aVar, C47450f fVar, boolean z) {
        this.f123221d = aVar;
        this.f123222e = fVar;
        this.f123223f = z;
    }

    /* renamed from: a */
    public final C5514ad mo51286a() {
        if (this.f123223f) {
            C19559g.m37304c();
        }
        if (this.f123218a == null) {
            synchronized (this.f123224g) {
                if (this.f123218a == null) {
                    this.f123218a = (C5514ad) this.f123221d.mo17428b();
                    this.f123222e.mo51270a(this);
                }
            }
        }
        return this.f123218a;
    }
}
