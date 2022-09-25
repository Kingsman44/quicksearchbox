package com.google.android.libraries.assistant.soda.p1611f;

import android.content.Context;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60904dr;
import com.google.speech.p5218j.p5222c.C66852c;
import java.util.concurrent.Executor;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.libraries.assistant.soda.f.p */
/* compiled from: PG */
public final class C19336p extends C66852c {

    /* renamed from: a */
    public static final C59071e f54108a = C59071e.m91332i("com.google.android.libraries.assistant.soda.f.p");

    /* renamed from: b */
    public final Context f54109b;

    /* renamed from: c */
    public final C60887da f54110c;

    /* renamed from: d */
    public final Executor f54111d;

    /* renamed from: e */
    public final Optional f54112e;

    public C19336p(Context context, C60887da daVar, Optional optional) {
        this.f54109b = context;
        this.f54110c = daVar;
        this.f54111d = new C60904dr(daVar);
        this.f54112e = optional;
    }

    /* renamed from: b */
    public final C70862aj mo24468b(C70862aj ajVar) {
        return new C19335o(this, ajVar);
    }
}
