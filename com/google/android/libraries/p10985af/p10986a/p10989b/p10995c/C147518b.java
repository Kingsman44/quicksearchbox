package com.google.android.libraries.p10985af.p10986a.p10989b.p10995c;

import android.content.Context;
import com.google.android.libraries.p10985af.p10986a.p10987a.p10988a.C147479b;
import com.google.android.libraries.p10985af.p10986a.p10989b.p10994b.C147490a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.af.a.b.c.b */
/* compiled from: PG */
public final class C147518b extends C147546t {

    /* renamed from: a */
    public Context f398145a;

    /* renamed from: b */
    public Executor f398146b;

    /* renamed from: c */
    public C58817ah f398147c;

    /* renamed from: d */
    public String f398148d;

    /* renamed from: e */
    public C42813k f398149e;

    /* renamed from: f */
    public C21370a f398150f;

    /* renamed from: g */
    public C147490a f398151g;

    /* renamed from: h */
    public C147479b f398152h;

    /* renamed from: i */
    public C147545s f398153i;

    /* renamed from: a */
    public final Context mo124274a() {
        Context context = this.f398145a;
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Property \"context\" has not been set");
    }

    /* renamed from: b */
    public final C58833ax mo124275b() {
        String str = this.f398148d;
        return str == null ? C58836b.f156633a : C58833ax.m90834k(str);
    }

    /* renamed from: c */
    public final void mo124276c(C21370a aVar) {
        if (aVar != null) {
            this.f398150f = aVar;
            return;
        }
        throw new NullPointerException("Null clock");
    }

    /* renamed from: d */
    public final void mo124277d(C42813k kVar) {
        if (kVar != null) {
            this.f398149e = kVar;
            return;
        }
        throw new NullPointerException("Null fileStorage");
    }

    /* renamed from: e */
    public final void mo124278e(Executor executor) {
        if (executor != null) {
            this.f398146b = executor;
            return;
        }
        throw new NullPointerException("Null ioExecutor");
    }
}
