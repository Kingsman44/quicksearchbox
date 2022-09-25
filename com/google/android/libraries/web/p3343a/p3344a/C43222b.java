package com.google.android.libraries.web.p3343a.p3344a;

import android.webkit.ValueCallback;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.web.p3343a.C43220a;
import com.google.android.libraries.web.shared.p3444d.C44095g;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.web.a.a.b */
/* compiled from: PG */
public final class C43222b implements C43220a {

    /* renamed from: a */
    public final C43220a f112953a;

    /* renamed from: b */
    private final Executor f112954b;

    public C43222b(C44095g gVar, Executor executor) {
        this.f112953a = (C43220a) gVar.mo47064a(C43220a.class);
        this.f112954b = executor;
    }

    /* renamed from: a */
    public final C60870cx mo46275a(ValueCallback valueCallback) {
        if (C19559g.m37305d(Thread.currentThread())) {
            return this.f112953a.mo46275a(valueCallback);
        }
        C43221a aVar = new C43221a(this, valueCallback);
        return C60856cj.m92905n(C47810es.m84965e(aVar), this.f112954b);
    }
}
