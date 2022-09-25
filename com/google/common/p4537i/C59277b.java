package com.google.common.p4537i;

import com.google.common.base.C58838bb;
import java.nio.charset.Charset;

/* renamed from: com.google.common.i.b */
/* compiled from: PG */
public abstract class C59277b implements C59290o {
    /* renamed from: a */
    public C59289n mo56759a(CharSequence charSequence, Charset charset) {
        return mo56748e().mo56757i(charSequence, charset).mo56758p();
    }

    /* renamed from: b */
    public C59289n mo56760b(CharSequence charSequence) {
        int length = charSequence.length();
        C59291p c = mo56765c(length + length);
        c.mo56766j(charSequence);
        return c.mo56758p();
    }

    /* renamed from: c */
    public C59291p mo56765c(int i) {
        C58838bb.m90871f(i >= 0, "expectedInputSize must be >= 0 but was %s", i);
        return mo56748e();
    }

    /* renamed from: d */
    public C59289n mo56761d(byte[] bArr, int i) {
        C58838bb.m90882q(0, i, bArr.length);
        C59291p c = mo56765c(i);
        c.mo56743d(bArr, i);
        return c.mo56758p();
    }
}
