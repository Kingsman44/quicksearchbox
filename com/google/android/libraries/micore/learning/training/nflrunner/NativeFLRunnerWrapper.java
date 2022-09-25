package com.google.android.libraries.micore.learning.training.nflrunner;

import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.libraries.micore.learning.base.C29715g;
import com.google.android.libraries.micore.learning.base.C29717i;
import com.google.android.libraries.micore.learning.base.C29719k;
import com.google.android.libraries.micore.learning.p2258a.C29700j;
import com.google.android.libraries.micore.learning.training.C29727c;
import com.google.android.libraries.micore.learning.training.nativeshared.C29742n;
import com.google.android.libraries.micore.learning.training.nativeshared.NativeFiles;
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
public class NativeFLRunnerWrapper implements Closeable {

    /* renamed from: a */
    public final C29719k f80530a;

    /* renamed from: b */
    public final NativeLogManager f80531b;

    /* renamed from: c */
    public final C144573b f80532c;

    /* renamed from: d */
    public final String f80533d;

    /* renamed from: e */
    public final C29715g f80534e;

    /* renamed from: f */
    public final File f80535f;

    /* renamed from: g */
    public final File f80536g;

    /* renamed from: h */
    public final C29717i f80537h;

    /* renamed from: i */
    public final C29758c f80538i;

    /* renamed from: j */
    public final String f80539j;

    /* renamed from: k */
    public final C29700j f80540k;

    /* renamed from: l */
    public final C61091d f80541l;

    /* renamed from: m */
    public final C144827n f80542m;

    /* renamed from: n */
    public final C29761f f80543n;

    /* renamed from: o */
    public final C29759d f80544o;

    /* renamed from: p */
    public final C59628h f80545p;

    /* renamed from: q */
    public final C29727c f80546q;

    /* renamed from: r */
    public final ExecutorService f80547r;

    /* renamed from: s */
    public final C61102k f80548s;

    /* renamed from: t */
    public final C29754l f80549t;

    /* renamed from: u */
    public final byte[] f80550u;

    public NativeFLRunnerWrapper(C29719k kVar, C29758c cVar, String str, C29700j jVar, C61091d dVar, C144827n nVar, C29761f fVar, C29759d dVar2, C59628h hVar, C29715g gVar, C144573b bVar, String str2, C29717i iVar, C29727c cVar2, File file, File file2, ExecutorService executorService, C61102k kVar2, C29754l lVar, byte[] bArr) {
        this.f80530a = kVar;
        this.f80534e = gVar;
        this.f80541l = dVar;
        this.f80531b = new C29742n(nVar, str, hVar, dVar);
        this.f80538i = cVar;
        this.f80539j = str;
        this.f80540k = jVar;
        this.f80542m = nVar;
        this.f80543n = fVar;
        this.f80544o = dVar2;
        this.f80545p = hVar;
        this.f80546q = cVar2;
        this.f80535f = file;
        this.f80536g = file2;
        this.f80532c = bVar;
        this.f80533d = str2;
        this.f80537h = iVar;
        this.f80547r = executorService;
        this.f80548s = kVar2;
        this.f80549t = lVar;
        this.f80550u = bArr;
    }

    public static native byte[] runNative(NativeFLRunnerDeps nativeFLRunnerDeps, String str, NativeFiles nativeFiles, NativeLogManager nativeLogManager, String str2, String str3, String str4, String str5, String str6, String str7, String str8, byte[] bArr, String str9);

    static native byte[] runNativeTensorflowSpecForTesting(NativeFLRunnerDeps nativeFLRunnerDeps, String str, NativeFiles nativeFiles, NativeLogManager nativeLogManager, byte[] bArr, String str2, byte[] bArr2);

    public final void close() {
    }
}
