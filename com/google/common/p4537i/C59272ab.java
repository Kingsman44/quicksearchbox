package com.google.common.p4537i;

import com.google.common.base.C58838bb;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.google.common.i.ab */
/* compiled from: PG */
final class C59272ab extends C59277b implements Serializable {

    /* renamed from: a */
    private final MessageDigest f157387a;

    /* renamed from: b */
    private final int f157388b;

    /* renamed from: c */
    private final boolean f157389c;

    /* renamed from: d */
    private final String f157390d = "Hashing.sha256()";

    public C59272ab(String str, int i) {
        MessageDigest f = m92027f(str);
        this.f157387a = f;
        int digestLength = f.getDigestLength();
        boolean z = false;
        if (i >= 4 && i <= digestLength) {
            z = true;
        }
        C58838bb.m90875j(z, "bytes (%s) must be >= 4 and < %s", i, digestLength);
        this.f157388b = i;
        this.f157389c = m92028g(f);
    }

    /* renamed from: f */
    private static MessageDigest m92027f(String str) {
        try {
            return MessageDigest.getInstance(str);
        } catch (NoSuchAlgorithmException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: g */
    private static boolean m92028g(MessageDigest messageDigest) {
        try {
            messageDigest.clone();
            return true;
        } catch (CloneNotSupportedException unused) {
            return false;
        }
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }

    /* renamed from: e */
    public final C59291p mo56748e() {
        if (this.f157389c) {
            try {
                return new C59301z((MessageDigest) this.f157387a.clone(), this.f157388b);
            } catch (CloneNotSupportedException unused) {
            }
        }
        return new C59301z(m92027f(this.f157387a.getAlgorithm()), this.f157388b);
    }

    public final String toString() {
        return this.f157390d;
    }

    /* access modifiers changed from: package-private */
    public Object writeReplace() {
        return new C59271aa(this.f157387a.getAlgorithm(), this.f157388b);
    }

    public C59272ab() {
        MessageDigest f = m92027f("SHA-256");
        this.f157387a = f;
        this.f157388b = f.getDigestLength();
        this.f157389c = m92028g(f);
    }
}
