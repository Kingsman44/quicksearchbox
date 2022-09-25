package com.google.common.p4535g;

import java.io.InputStream;

/* renamed from: com.google.common.g.d */
/* compiled from: PG */
public final class C59188d {

    /* renamed from: a */
    public final InputStream f157256a;

    public C59188d(InputStream inputStream) {
        this.f157256a = inputStream;
    }

    /* renamed from: b */
    public static long m91800b(InputStream inputStream) {
        return (((long) C59161c.m91744a(inputStream)) & 255) | ((((long) C59161c.m91744a(inputStream)) & 255) << 8) | ((((long) C59161c.m91744a(inputStream)) & 255) << 16) | ((((long) C59161c.m91744a(inputStream)) & 255) << 24) | ((((long) C59161c.m91744a(inputStream)) & 255) << 32) | ((((long) C59161c.m91744a(inputStream)) & 255) << 40) | ((((long) C59161c.m91744a(inputStream)) & 255) << 48) | ((255 & ((long) C59161c.m91744a(inputStream))) << 56);
    }

    /* renamed from: a */
    public final int mo56561a() {
        return (C59161c.m91744a(this.f157256a) & 255) | ((C59161c.m91744a(this.f157256a) & 255) << 8) | ((C59161c.m91744a(this.f157256a) & 255) << 16) | ((C59161c.m91744a(this.f157256a) & 255) << 24);
    }
}
