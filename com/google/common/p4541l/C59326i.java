package com.google.common.p4541l;

import com.google.common.base.C58838bb;
import java.io.IOException;

/* renamed from: com.google.common.l.i */
/* compiled from: PG */
public abstract class C59326i {

    /* renamed from: d */
    public static final C59326i f157516d = new C59322e("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* renamed from: e */
    public static final C59326i f157517e = new C59322e("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* renamed from: f */
    public static final C59326i f157518f = new C59325h("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* renamed from: g */
    public static final C59326i f157519g = new C59321d(new C59320c("base16()", "0123456789ABCDEF".toCharArray()));

    static {
        new C59325h("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');
    }

    /* renamed from: a */
    public abstract int mo56821a(byte[] bArr, CharSequence charSequence);

    /* renamed from: c */
    public abstract void mo56823c(Appendable appendable, byte[] bArr, int i);

    /* renamed from: d */
    public abstract int mo56824d(int i);

    /* renamed from: e */
    public abstract C59326i mo56825e();

    /* renamed from: f */
    public abstract C59326i mo56826f();

    /* renamed from: g */
    public abstract C59326i mo56827g();

    /* renamed from: h */
    public CharSequence mo56828h(CharSequence charSequence) {
        throw null;
    }

    /* renamed from: i */
    public abstract boolean mo56829i(CharSequence charSequence);

    /* renamed from: k */
    public final byte[] mo56836k(CharSequence charSequence) {
        try {
            CharSequence h = mo56828h(charSequence);
            int m = mo56830m(h.length());
            byte[] bArr = new byte[m];
            int a = mo56821a(bArr, h);
            if (a == m) {
                return bArr;
            }
            byte[] bArr2 = new byte[a];
            System.arraycopy(bArr, 0, bArr2, 0, a);
            return bArr2;
        } catch (C59323f e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: l */
    public final String mo56837l(byte[] bArr, int i) {
        C58838bb.m90882q(0, i, bArr.length);
        StringBuilder sb = new StringBuilder(mo56824d(i));
        try {
            mo56823c(sb, bArr, i);
            return sb.toString();
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: m */
    public abstract int mo56830m(int i);
}
