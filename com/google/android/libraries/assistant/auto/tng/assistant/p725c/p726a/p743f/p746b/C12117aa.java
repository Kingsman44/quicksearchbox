package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.Arrays;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.aa */
/* compiled from: PG */
final class C12117aa implements C12116a {

    /* renamed from: a */
    public static final C59071e f38737a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.aa");

    /* renamed from: b */
    private final C12133q f38738b;

    /* renamed from: c */
    private final byte[] f38739c;

    /* renamed from: d */
    private int f38740d = 0;

    /* renamed from: e */
    private boolean f38741e = false;

    /* renamed from: f */
    private final C12142z f38742f;

    public C12117aa(C12133q qVar, C12126j jVar, Executor executor) {
        this.f38738b = qVar;
        this.f38739c = new byte[qVar.f38792h];
        this.f38742f = new C12142z(qVar, jVar, executor);
    }

    /* renamed from: a */
    public final C60870cx mo20426a() {
        C12142z zVar = this.f38742f;
        Objects.requireNonNull(zVar);
        C12136t tVar = new C12136t(zVar);
        return C60856cj.m92903l(C47810es.m84977q(tVar), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo20427b() {
        this.f38741e = true;
        this.f38742f.mo20452a();
    }

    /* renamed from: c */
    public final void mo20428c(Throwable th) {
        this.f38741e = true;
        this.f38742f.mo20454c(th);
    }

    /* renamed from: d */
    public final void mo20429d(byte[] bArr) {
        if (!this.f38741e) {
            int i = 0;
            while (true) {
                int length = bArr.length;
                if (i < length) {
                    int min = Math.min(this.f38739c.length - this.f38740d, length - i);
                    System.arraycopy(bArr, i, this.f38739c, this.f38740d, min);
                    int i2 = this.f38740d + min;
                    this.f38740d = i2;
                    i += min;
                    if (i2 == this.f38738b.f38792h) {
                        this.f38742f.mo20453b(Arrays.copyOf(this.f38739c, i2), this.f38741e);
                        this.f38740d = 0;
                    }
                } else {
                    return;
                }
            }
        } else {
            ((C59052c) ((C59052c) f38737a.mo56226d()).mo56372aa(44061)).mo56386p("Pushing data after signalling end of input.");
        }
    }

    /* renamed from: e */
    public final void mo20430e() {
        if (!this.f38741e) {
            this.f38741e = true;
            this.f38742f.mo20453b(Arrays.copyOf(this.f38739c, this.f38740d), this.f38741e);
            this.f38740d = 0;
        }
    }
}
