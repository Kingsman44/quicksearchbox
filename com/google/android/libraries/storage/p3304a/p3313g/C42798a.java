package com.google.android.libraries.storage.p3304a.p3313g;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.p3307c.C42768u;
import java.io.File;
import java.io.OutputStream;

/* renamed from: com.google.android.libraries.storage.a.g.a */
/* compiled from: PG */
public final /* synthetic */ class C42798a {
    /* renamed from: a */
    public static File m75570a(C42799b bVar, Uri uri) {
        String i = bVar.mo45815i();
        String valueOf = String.valueOf(uri);
        throw new C42768u("Cannot convert uri to file " + i + " " + valueOf);
    }

    /* renamed from: b */
    public static Iterable m75571b(C42799b bVar) {
        throw new C42768u("children not supported by ".concat(String.valueOf(bVar.mo45815i())));
    }

    /* renamed from: c */
    public static void m75572c(C42799b bVar) {
        throw new C42768u("createDirectory not supported by ".concat(String.valueOf(bVar.mo45815i())));
    }

    /* renamed from: d */
    public static void m75573d(C42799b bVar) {
        throw new C42768u("deleteDirectory not supported by ".concat(String.valueOf(bVar.mo45815i())));
    }

    /* renamed from: e */
    public static long m75574e(C42799b bVar) {
        throw new C42768u("fileSize not supported by ".concat(String.valueOf(bVar.mo45815i())));
    }

    /* renamed from: f */
    public static OutputStream m75575f(C42799b bVar) {
        throw new C42768u("openForAppend not supported by ".concat(String.valueOf(bVar.mo45815i())));
    }
}
