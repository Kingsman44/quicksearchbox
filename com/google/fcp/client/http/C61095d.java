package com.google.fcp.client.http;

import com.google.android.libraries.micore.learning.training.nflrunner.C29749g;
import com.google.fcp.client.C61091d;
import com.google.fcp.client.http.HttpClientForNative;

/* renamed from: com.google.fcp.client.http.d */
/* compiled from: PG */
public final class C61095d extends HttpClientForNative {

    /* renamed from: a */
    public final C29749g f165391a;

    /* renamed from: b */
    private final C61091d f165392b;

    public C61095d(C61091d dVar, C29749g gVar) {
        this.f165392b = dVar;
        this.f165391a = gVar;
    }

    public final void close() {
    }

    public final /* bridge */ /* synthetic */ HttpClientForNative.HttpRequestHandle enqueueRequest(byte[] bArr) {
        return (C61104m) this.f165392b.mo57645a(new C61093b(this, bArr));
    }

    public final byte[] performRequests(Object[] objArr) {
        return (byte[]) this.f165392b.mo57645a(new C61092a(objArr));
    }
}
