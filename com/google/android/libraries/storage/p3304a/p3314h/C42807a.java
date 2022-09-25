package com.google.android.libraries.storage.p3304a.p3314h;

import android.net.Uri;
import com.google.android.libraries.storage.p3304a.p3313g.C42804g;
import com.google.android.libraries.storage.p3304a.p3313g.C42805h;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.zip.DeflaterOutputStream;
import java.util.zip.InflaterInputStream;

/* renamed from: com.google.android.libraries.storage.a.h.a */
/* compiled from: PG */
public final class C42807a implements C42805h {
    /* renamed from: a */
    public final InputStream mo45879a(Uri uri, InputStream inputStream) {
        return new InflaterInputStream(inputStream);
    }

    /* renamed from: b */
    public final OutputStream mo45880b(Uri uri, OutputStream outputStream) {
        return new DeflaterOutputStream(outputStream);
    }

    /* renamed from: c */
    public final String mo45881c() {
        return "compress";
    }

    /* renamed from: d */
    public final /* synthetic */ OutputStream mo45882d(OutputStream outputStream) {
        return C42804g.m75613a(this, outputStream);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo45883e() {
    }

    /* renamed from: f */
    public final /* synthetic */ void mo45884f() {
    }
}
