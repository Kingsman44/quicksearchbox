package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import android.content.Context;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4449cd.p4456g.C57974a;
import com.google.p4449cd.p4456g.C57981b;
import com.google.speech.recognizer.p5233a.C67451at;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.l */
/* compiled from: PG */
public final class C12128l implements C57981b {

    /* renamed from: a */
    public static final C59071e f38770a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.l");

    /* renamed from: b */
    public final C57981b f38771b;

    /* renamed from: c */
    private final Executor f38772c;

    /* renamed from: d */
    private final C67451at f38773d;

    /* renamed from: e */
    private final int f38774e;

    /* renamed from: f */
    private final int f38775f;

    /* renamed from: g */
    private final Context f38776g;

    /* renamed from: h */
    private final Executor f38777h;

    public C12128l(C57981b bVar, C67451at atVar, int i, int i2, Executor executor, Executor executor2, Context context) {
        this.f38772c = executor;
        this.f38771b = bVar;
        this.f38773d = atVar;
        this.f38774e = i;
        this.f38775f = i2;
        this.f38776g = context;
        this.f38777h = executor2;
    }

    /* renamed from: jJ */
    public final C60870cx mo20440jJ(C57974a aVar) {
        C12127k kVar = new C12127k(aVar, this.f38773d, this.f38774e, this.f38775f, this.f38776g, this.f38772c, this.f38777h);
        C60870cx a = kVar.f38765c.mo20426a();
        C12118b bVar = new C12118b(this, kVar);
        C46459k.m82829b(C60922j.m93045h(a, C47810es.m84966f(bVar), this.f38772c), "AudioEncoderSource: streaming failed", new Object[0]);
        return kVar.f38766d;
    }

    /* renamed from: jK */
    public final void mo20388jK() {
        this.f38771b.mo20388jK();
    }
}
