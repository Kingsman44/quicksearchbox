package com.google.android.libraries.micore.learning.training.nflrunner;

import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.android.libraries.micore.learning.p2258a.C29700j;
import com.google.android.libraries.micore.learning.training.C29727c;
import com.google.android.libraries.micore.learning.training.nativeshared.C29734f;
import com.google.android.libraries.micore.learning.training.util.C29758c;
import com.google.android.libraries.micore.learning.training.util.C29759d;
import com.google.android.libraries.micore.learning.training.util.C29761f;
import com.google.android.libraries.micore.learning.training.util.StatusOr;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.fcp.client.C61091d;
import com.google.fcp.client.http.C61095d;
import com.google.fcp.client.http.C61102k;
import com.google.fcp.client.http.HttpClientForNative;
import com.google.p3728as.p3729a.p3730a.C48030j;
import java.io.Closeable;
import java.io.File;
import java.security.SecureRandom;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.micore.learning.training.nflrunner.m */
/* compiled from: PG */
public final class C29755m implements NativeFLRunnerDeps, Closeable {

    /* renamed from: a */
    public final C29719k f80598a;

    /* renamed from: b */
    public final C29758c f80599b;

    /* renamed from: c */
    public final String f80600c;

    /* renamed from: d */
    public final String f80601d;

    /* renamed from: e */
    public final C29700j f80602e;

    /* renamed from: f */
    public final C144827n f80603f;

    /* renamed from: g */
    public final C29761f f80604g;

    /* renamed from: h */
    public final C29759d f80605h;

    /* renamed from: i */
    public final C29734f f80606i;

    /* renamed from: j */
    public final C61091d f80607j;

    /* renamed from: k */
    public final boolean f80608k;

    /* renamed from: l */
    public final long f80609l;

    /* renamed from: m */
    public final ExecutorService f80610m;

    /* renamed from: n */
    public final C61102k f80611n;

    /* renamed from: o */
    public final C29754l f80612o;

    /* renamed from: p */
    public final Object f80613p = new Object();

    /* renamed from: q */
    public final byte[] f80614q;

    /* renamed from: r */
    public C59628h f80615r;

    /* renamed from: s */
    private final File f80616s;

    /* renamed from: t */
    private final File f80617t;

    public C29755m(C144573b bVar, C29719k kVar, C29758c cVar, String str, String str2, C29700j jVar, C144827n nVar, C29761f fVar, C29759d dVar, C59628h hVar, C29727c cVar2, File file, File file2, C61091d dVar2, boolean z, ExecutorService executorService, C61102k kVar2, C29754l lVar, byte[] bArr) {
        Random random;
        C61091d dVar3 = dVar2;
        this.f80598a = kVar;
        this.f80599b = cVar;
        this.f80600c = str;
        this.f80601d = str2;
        this.f80602e = jVar;
        this.f80603f = nVar;
        this.f80604g = fVar;
        this.f80605h = dVar;
        this.f80615r = hVar;
        this.f80606i = new C29734f(cVar2, dVar3, bVar.mo119981aO());
        this.f80616s = file;
        this.f80617t = file2;
        this.f80607j = dVar3;
        this.f80608k = z;
        this.f80610m = executorService;
        this.f80611n = kVar2;
        this.f80612o = lVar;
        this.f80614q = bArr;
        if (bVar.mo120021bb()) {
            random = new SecureRandom();
        } else {
            random = new Random(System.currentTimeMillis());
        }
        this.f80609l = random.nextLong();
    }

    public final void close() {
        C61091d dVar = this.f80607j;
        C29734f fVar = this.f80606i;
        Objects.requireNonNull(fVar);
        dVar.mo57646b(new C29747e(fVar));
    }

    public final StatusOr createExampleIterator(byte[] bArr) {
        return (StatusOr) this.f80607j.mo57645a(new C29750h(this, bArr, C48030j.f124314b.toByteArray()));
    }

    public final StatusOr createExampleIteratorWithContext(byte[] bArr, byte[] bArr2) {
        return (StatusOr) this.f80607j.mo57645a(new C29750h(this, bArr, bArr2));
    }

    public final HttpClientForNative createHttpClient() {
        return new C61095d(this.f80607j, new C29749g(this));
    }

    public final String getBaseDir() {
        C61091d dVar = this.f80607j;
        File file = this.f80616s;
        Objects.requireNonNull(file);
        return (String) dVar.mo57645a(new C29748f(file));
    }

    public final String getCacheDir() {
        C61091d dVar = this.f80607j;
        File file = this.f80617t;
        Objects.requireNonNull(file);
        return (String) dVar.mo57645a(new C29748f(file));
    }

    public final void publishEvent(byte[] bArr) {
        this.f80607j.mo57646b(new C29751i(this, bArr));
    }

    public final boolean trainingConditionsSatisfied() {
        return ((Boolean) this.f80607j.mo57645a(new C29752j(this))).booleanValue();
    }
}
