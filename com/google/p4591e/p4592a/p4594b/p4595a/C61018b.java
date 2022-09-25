package com.google.p4591e.p4592a.p4594b.p4595a;

import com.google.p386ak.p394d.C8385a;
import com.google.p386ak.p394d.C8387c;
import com.google.p4591e.p4592a.p4594b.C61021b;
import com.google.p4591e.p4592a.p4594b.C61028c;
import com.google.p4591e.p4592a.p4594b.C61029d;
import com.google.p4591e.p4592a.p4603d.C61051e;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringReader;
import java.nio.charset.Charset;

/* renamed from: com.google.e.a.b.a.b */
/* compiled from: PG */
public final class C61018b extends C61021b {
    /* renamed from: a */
    public final C61028c mo57539a(OutputStream outputStream, Charset charset) {
        return new C61019c(new C8387c(new OutputStreamWriter(outputStream, charset)));
    }

    /* renamed from: b */
    public final C61029d mo57540b(InputStream inputStream) {
        return mo57542e(new InputStreamReader(inputStream, C61051e.f165290a));
    }

    /* renamed from: c */
    public final C61029d mo57541c(String str) {
        return mo57542e(new StringReader(str));
    }

    /* renamed from: e */
    public final C61029d mo57542e(Reader reader) {
        return new C61020d(this, new C8385a(reader));
    }
}
