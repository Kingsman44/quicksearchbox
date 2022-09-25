package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p746b;

import android.content.Context;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.audio.hearing.common.OggOpusEncoder;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.b.s */
/* compiled from: PG */
final class C12135s implements C12116a {

    /* renamed from: a */
    public final C12133q f38797a;

    /* renamed from: b */
    public final Context f38798b;

    /* renamed from: c */
    public OggOpusEncoder f38799c;

    /* renamed from: d */
    private final Executor f38800d;

    /* renamed from: e */
    private final C12126j f38801e;

    public C12135s(C12133q qVar, C12126j jVar, Context context, Executor executor) {
        this.f38797a = qVar;
        this.f38801e = jVar;
        this.f38798b = context;
        this.f38800d = executor;
    }

    /* renamed from: a */
    public final C60870cx mo20426a() {
        C12134r rVar = new C12134r(this);
        return C60856cj.m92903l(C47810es.m84977q(rVar), this.f38800d);
    }

    /* renamed from: d */
    public final void mo20429d(byte[] bArr) {
        int length = bArr.length;
        if (length != 0) {
            OggOpusEncoder oggOpusEncoder = this.f38799c;
            oggOpusEncoder.getClass();
            byte[] c = oggOpusEncoder.mo54138c(bArr, length);
            if (c.length != 0) {
                this.f38801e.mo20437a(c);
            }
        }
    }

    /* renamed from: b */
    public final void mo20427b() {
        OggOpusEncoder oggOpusEncoder = this.f38799c;
        oggOpusEncoder.getClass();
        oggOpusEncoder.mo54136a();
    }

    /* renamed from: c */
    public final void mo20428c(Throwable th) {
        this.f38799c.getClass();
        this.f38801e.mo20439c(th);
        mo20427b();
    }

    /* renamed from: e */
    public final void mo20430e() {
        OggOpusEncoder oggOpusEncoder = this.f38799c;
        oggOpusEncoder.getClass();
        this.f38801e.mo20437a(oggOpusEncoder.mo54136a());
        this.f38801e.mo20438b();
    }
}
