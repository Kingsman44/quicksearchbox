package com.google.p4715m.p4716a.p4717a.p4718a;

import java.security.cert.X509Certificate;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.m.a.a.a.g */
/* compiled from: PG */
final class C62654g {

    /* renamed from: a */
    public final long f169160a;

    /* renamed from: b */
    public final long f169161b;

    public C62654g() {
        this.f169160a = Long.MIN_VALUE;
        this.f169161b = Long.MAX_VALUE;
    }

    public C62654g(long j, long j2, X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        this.f169160a = Math.max(Math.max(j, TimeUnit.MILLISECONDS.toSeconds(x509Certificate.getNotBefore().getTime())), TimeUnit.MILLISECONDS.toSeconds(x509Certificate2.getNotBefore().getTime()));
        this.f169161b = Math.min(Math.min(j2, TimeUnit.MILLISECONDS.toSeconds(x509Certificate.getNotAfter().getTime())), TimeUnit.MILLISECONDS.toSeconds(x509Certificate2.getNotAfter().getTime()));
    }
}
