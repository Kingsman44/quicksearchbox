package com.facebook.litho;

import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

/* renamed from: com.facebook.litho.m */
/* compiled from: PG */
public final class C6403m {

    /* renamed from: a */
    public final ByteArrayOutputStream f18975a;

    /* renamed from: b */
    public final PrintWriter f18976b;

    /* renamed from: c */
    private int f18977c;

    public C6403m() {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        this.f18975a = byteArrayOutputStream;
        this.f18976b = new PrintWriter(byteArrayOutputStream, false);
    }

    /* renamed from: e */
    private final void m17217e() {
        for (int i = 0; i < this.f18977c; i++) {
            this.f18976b.print("  ");
        }
    }

    /* renamed from: a */
    public final void mo13413a() {
        this.f18977c++;
    }

    /* renamed from: b */
    public final void mo13414b(String str, Object... objArr) {
        m17217e();
        this.f18976b.printf(str, objArr);
        this.f18976b.print(10);
    }

    /* renamed from: c */
    public final void mo13415c(String str) {
        m17217e();
        this.f18976b.println(str);
    }

    /* renamed from: d */
    public final void mo13416d() {
        this.f18977c--;
    }
}
