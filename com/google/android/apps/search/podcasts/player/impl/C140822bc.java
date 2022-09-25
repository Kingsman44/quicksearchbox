package com.google.android.apps.search.podcasts.player.impl;

import android.graphics.Bitmap;
import androidx.media3.p174ui.C3647k;
import com.bumptech.glide.p282c.p283a.C5528f;
import com.google.android.p10890h.p10891a.p10892a.C146555j;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.player.impl.bc */
/* compiled from: PG */
public final class C140822bc {

    /* renamed from: a */
    public final C146555j f382437a;

    /* renamed from: b */
    public final C59071e f382438b = C59071e.m91331h();

    /* renamed from: c */
    public String f382439c;

    /* renamed from: d */
    public Bitmap f382440d;

    /* renamed from: e */
    public C3647k f382441e;

    /* renamed from: f */
    public C60870cx f382442f;

    /* renamed from: g */
    private final C47449e f382443g;

    /* renamed from: h */
    private final Executor f382444h;

    public C140822bc(C47449e eVar, Executor executor, C146555j jVar) {
        this.f382443g = eVar;
        this.f382444h = executor;
        this.f382437a = jVar;
    }

    /* renamed from: a */
    public final Bitmap mo115928a(String str) {
        if (C69664n.m101066l(str, this.f382439c)) {
            return this.f382440d;
        }
        return null;
    }

    /* renamed from: b */
    public final void mo115929b(String str) {
        if (!C69664n.m101066l(str, this.f382439c)) {
            mo115930c();
            if (str != null && str.length() != 0) {
                this.f382439c = str;
                C60870cx b = C5528f.m14300b(C5528f.m14299a(this.f382443g.mo51286a().mo11864b().mo12448j(this.f382439c)));
                this.f382442f = b;
                C140821bb bbVar = new C140821bb(this);
                C60856cj.m92911t(b, C47810es.m84974n(bbVar), this.f382444h);
            }
        }
    }

    /* renamed from: c */
    public final void mo115930c() {
        this.f382440d = null;
        this.f382439c = null;
        C60870cx cxVar = this.f382442f;
        if (cxVar != null) {
            cxVar.cancel(true);
        }
        this.f382442f = null;
        this.f382441e = null;
    }
}
