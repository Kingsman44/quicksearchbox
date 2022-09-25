package com.google.android.libraries.micore.learning.training.nflrunner;

import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.android.libraries.micore.learning.p2258a.C29700j;
import com.google.android.libraries.micore.learning.training.C29727c;
import com.google.android.libraries.micore.learning.training.nativeshared.C29742n;
import com.google.android.libraries.micore.learning.training.nativeshared.NativeLogManager;
import com.google.android.libraries.micore.learning.training.util.C29758c;
import com.google.android.libraries.micore.learning.training.util.C29759d;
import com.google.android.libraries.micore.learning.training.util.C29761f;
import com.google.common.p4552o.p4554b.p4555a.C59628h;
import com.google.fcp.client.C61091d;
import com.google.fcp.client.http.C61102k;
import java.io.Closeable;
import java.io.File;
import java.util.concurrent.ExecutorService;

/* compiled from: PG */
public class NativeLCRunnerWrapper implements Closeable {

    /* renamed from: a */
    public final C29719k f80551a;

    /* renamed from: b */
    public final NativeLogManager f80552b;

    /* renamed from: c */
    public final C144573b f80553c;

    /* renamed from: d */
    public final C29758c f80554d;

    /* renamed from: e */
    public final String f80555e;

    /* renamed from: f */
    public final C29700j f80556f;

    /* renamed from: g */
    public final C61091d f80557g;

    /* renamed from: h */
    public final C144827n f80558h;

    /* renamed from: i */
    public final C29761f f80559i;

    /* renamed from: j */
    public final C29759d f80560j;

    /* renamed from: k */
    public final C59628h f80561k;

    /* renamed from: l */
    public final File f80562l;

    /* renamed from: m */
    public final File f80563m;

    /* renamed from: n */
    public final C29727c f80564n;

    /* renamed from: o */
    public final ExecutorService f80565o;

    /* renamed from: p */
    public final C61102k f80566p;

    /* renamed from: q */
    public final C29754l f80567q;

    /* renamed from: r */
    public final byte[] f80568r;

    public NativeLCRunnerWrapper(C29719k kVar, C29758c cVar, String str, C29700j jVar, C61091d dVar, C144827n nVar, C29761f fVar, C29759d dVar2, C59628h hVar, C144573b bVar, C29727c cVar2, File file, File file2, ExecutorService executorService, C61102k kVar2, C29754l lVar, byte[] bArr) {
        this.f80551a = kVar;
        this.f80557g = dVar;
        this.f80552b = new C29742n(nVar, str, hVar, dVar);
        this.f80554d = cVar;
        this.f80555e = str;
        this.f80556f = jVar;
        this.f80558h = nVar;
        this.f80559i = fVar;
        this.f80560j = dVar2;
        this.f80561k = hVar;
        this.f80553c = bVar;
        this.f80564n = cVar2;
        this.f80562l = file;
        this.f80563m = file2;
        this.f80565o = executorService;
        this.f80566p = kVar2;
        this.f80567q = lVar;
        this.f80568r = bArr;
    }

    public static native void runNative(NativeFLRunnerDeps nativeFLRunnerDeps, String str, NativeLogManager nativeLogManager, byte[] bArr, String str2, String str3, String str4, String str5);

    public final void close() {
    }
}
