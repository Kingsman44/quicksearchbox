package com.google.android.apps.gsa.staticplugins.bubble.mvc.p7600d;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.mvc.d.a */
/* compiled from: PG */
public final class C97078a extends C97095j {

    /* renamed from: a */
    public String f271266a;

    /* renamed from: b */
    public String f271267b;

    /* renamed from: c */
    public String f271268c;

    /* renamed from: d */
    public byte f271269d;

    /* renamed from: e */
    private int f271270e;

    /* renamed from: a */
    public final C97096k mo90446a() {
        String str;
        String str2;
        String str3;
        if (this.f271269d == 3 && (str = this.f271266a) != null && (str2 = this.f271267b) != null && (str3 = this.f271268c) != null) {
            return new C97086b(str, str2, str3, this.f271270e);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f271266a == null) {
            sb.append(" singleBubbleTitle");
        }
        if (this.f271267b == null) {
            sb.append(" multipleBubblesTitle");
        }
        if (this.f271268c == null) {
            sb.append(" contextText");
        }
        if ((this.f271269d & 1) == 0) {
            sb.append(" smallIcon");
        }
        if ((this.f271269d & 2) == 0) {
            sb.append(" dismissBubbleAction");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo90447b(String str) {
        if (str != null) {
            this.f271268c = str;
            return;
        }
        throw new NullPointerException("Null contextText");
    }

    /* renamed from: c */
    public final void mo90448c(String str) {
        if (str != null) {
            this.f271266a = str;
            return;
        }
        throw new NullPointerException("Null singleBubbleTitle");
    }

    /* renamed from: d */
    public final void mo90449d(int i) {
        this.f271270e = i;
        this.f271269d = (byte) (this.f271269d | 1);
    }
}
