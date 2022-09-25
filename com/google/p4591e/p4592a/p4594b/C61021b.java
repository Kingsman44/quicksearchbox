package com.google.p4591e.p4592a.p4594b;

import com.google.p4591e.p4592a.p4603d.C61051e;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;

/* renamed from: com.google.e.a.b.b */
/* compiled from: PG */
public abstract class C61021b {
    /* renamed from: a */
    public abstract C61028c mo57539a(OutputStream outputStream, Charset charset);

    /* renamed from: b */
    public abstract C61029d mo57540b(InputStream inputStream);

    /* renamed from: c */
    public abstract C61029d mo57541c(String str);

    /* renamed from: d */
    public final String mo57573d(Object obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        C61028c a = mo57539a(byteArrayOutputStream, C61051e.f165290a);
        a.mo57578b(false, obj);
        a.mo57543a();
        return byteArrayOutputStream.toString("UTF-8");
    }
}
