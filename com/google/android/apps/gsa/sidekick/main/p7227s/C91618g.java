package com.google.android.apps.gsa.sidekick.main.p7227s;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91376f;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.sidekick.main.s.g */
/* compiled from: PG */
public final class C91618g {

    /* renamed from: a */
    public static final C59071e f255536a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.s.g");

    /* renamed from: b */
    public final Object f255537b = new Object();

    /* renamed from: c */
    public final C91617f f255538c;

    /* renamed from: d */
    final C91376f f255539d;

    /* renamed from: e */
    public volatile boolean f255540e;

    /* renamed from: f */
    public C91615d f255541f;

    /* renamed from: g */
    public String f255542g;

    /* renamed from: h */
    private final C90929bz f255543h;

    public C91618g(Context context, C91376f fVar, C90929bz bzVar) {
        this.f255539d = fVar;
        this.f255543h = bzVar;
        this.f255538c = new C91617f(context);
    }

    /* renamed from: a */
    public final void mo86001a(String str) {
        synchronized (this.f255537b) {
            this.f255542g = str;
            if (this.f255541f == null) {
                C91615d dVar = new C91615d(this, str, this.f255543h);
                this.f255541f = dVar;
                dVar.mo85242e(new Void[0]);
            }
        }
    }
}
