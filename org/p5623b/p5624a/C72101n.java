package org.p5623b.p5624a;

import java.io.ByteArrayOutputStream;
import java.io.OutputStream;

/* renamed from: org.b.a.n */
/* compiled from: PG */
public abstract class C72101n implements C72092e {
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C72092e)) {
            return false;
        }
        return mo63233g().mo63309r(((C72092e) obj).mo63233g());
    }

    /* renamed from: g */
    public abstract C72108u mo63233g();

    public int hashCode() {
        return mo63233g().hashCode();
    }

    /* renamed from: m */
    public void mo63291m(OutputStream outputStream) {
        new C72106s(outputStream).mo63305i(this);
    }

    /* renamed from: n */
    public void mo63292n(OutputStream outputStream, String str) {
        C72106s.m105614a(outputStream, str).mo63305i(this);
    }

    /* renamed from: o */
    public final byte[] mo63293o() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo63291m(byteArrayOutputStream);
        return byteArrayOutputStream.toByteArray();
    }

    /* renamed from: p */
    public final byte[] mo63294p(String str) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        mo63292n(byteArrayOutputStream, str);
        return byteArrayOutputStream.toByteArray();
    }
}
