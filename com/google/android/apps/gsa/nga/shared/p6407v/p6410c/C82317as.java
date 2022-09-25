package com.google.android.apps.gsa.nga.shared.p6407v.p6410c;

/* renamed from: com.google.android.apps.gsa.nga.shared.v.c.as */
/* compiled from: PG */
public final class C82317as extends C82546je {

    /* renamed from: a */
    public String f224864a;

    /* renamed from: b */
    public String f224865b;

    /* renamed from: c */
    public String f224866c;

    /* renamed from: d */
    private boolean f224867d;

    /* renamed from: e */
    private byte f224868e;

    /* renamed from: a */
    public final C82547jf mo75675a() {
        String str;
        String str2;
        String str3;
        if (this.f224868e == 3 && (str = this.f224864a) != null && (str2 = this.f224865b) != null && (str3 = this.f224866c) != null) {
            return new C82318at(str, str2, str3, this.f224867d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f224864a == null) {
            sb.append(" token");
        }
        if (this.f224865b == null) {
            sb.append(" speechRecognizer");
        }
        if (this.f224866c == null) {
            sb.append(" sessionType");
        }
        if ((this.f224868e & 1) == 0) {
            sb.append(" isContinuousMode");
        }
        if ((this.f224868e & 2) == 0) {
            sb.append(" onDeviceEnabled");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo75676b() {
        this.f224868e = (byte) (this.f224868e | 1);
    }

    /* renamed from: c */
    public final void mo75677c(boolean z) {
        this.f224867d = z;
        this.f224868e = (byte) (this.f224868e | 2);
    }
}
