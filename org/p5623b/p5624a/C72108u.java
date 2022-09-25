package org.p5623b.p5624a;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: org.b.a.u */
/* compiled from: PG */
public abstract class C72108u extends C72101n {
    /* renamed from: q */
    public static C72108u m105626q(byte[] bArr) {
        C72098k kVar = new C72098k(new ByteArrayInputStream(bArr), bArr.length, false);
        try {
            C72108u d = kVar.mo63286d();
            if (kVar.available() == 0) {
                return d;
            }
            throw new IOException("Extra data detected in stream");
        } catch (ClassCastException unused) {
            throw new IOException("cannot recognise object in stream");
        }
    }

    /* renamed from: a */
    public abstract int mo63217a();

    /* renamed from: b */
    public abstract void mo63218b(C72106s sVar, boolean z);

    /* renamed from: c */
    public abstract boolean mo63219c(C72108u uVar);

    /* renamed from: d */
    public abstract boolean mo63220d();

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C72092e) && mo63219c(((C72092e) obj).mo63233g());
    }

    /* renamed from: f */
    public C72108u mo63228f() {
        return this;
    }

    /* renamed from: g */
    public final C72108u mo63233g() {
        return this;
    }

    /* renamed from: h */
    public C72108u mo63229h() {
        return this;
    }

    /* renamed from: m */
    public final void mo63291m(OutputStream outputStream) {
        mo63218b(new C72106s(outputStream), true);
    }

    /* renamed from: n */
    public final void mo63292n(OutputStream outputStream, String str) {
        C72106s.m105614a(outputStream, str).mo63254j(this, true);
    }

    /* renamed from: r */
    public final boolean mo63309r(C72108u uVar) {
        return this == uVar || mo63219c(uVar);
    }
}
