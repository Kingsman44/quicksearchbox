package com.google.p4486ci.p4487a;

import java.io.InputStream;

/* renamed from: com.google.ci.a.f */
/* compiled from: PG */
public final class C58101f {

    /* renamed from: a */
    public final int f155302a;

    /* renamed from: b */
    public final C58100e f155303b;

    /* renamed from: c */
    public final InputStream f155304c;

    public C58101f(int i, C58100e eVar, InputStream inputStream) {
        this.f155302a = i;
        this.f155303b = eVar;
        this.f155304c = inputStream;
    }

    /* renamed from: a */
    public final String mo54656a() {
        String str;
        String a = this.f155303b.mo54650a("X-GUploader-UploadID");
        int i = this.f155302a;
        String valueOf = String.valueOf(this.f155303b);
        if (a == null) {
            str = "\n No upload id.";
        } else {
            str = "\n Upload id: ".concat(a);
        }
        return "HttpResponse:\n   " + i + "  " + valueOf + str;
    }
}
