package com.google.apps.p3589d.p3590a;

import com.google.apps.p3589d.p3600k.C45941f;

/* renamed from: com.google.apps.d.a.d */
/* compiled from: PG */
public final class C45687d extends C45706w {

    /* renamed from: a */
    public C45941f f120174a;

    /* renamed from: b */
    public C45941f f120175b;

    /* renamed from: c */
    public byte f120176c;

    /* renamed from: d */
    private boolean f120177d;

    /* renamed from: a */
    public final C45707x mo49754a() {
        if (this.f120176c == 3 && this.f120174a != null && this.f120175b != null) {
            return new C45688e(this.f120177d, this.f120174a, this.f120175b);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.f120176c & 1) == 0) {
            sb.append(" autocorrectInvalidInput");
        }
        if ((this.f120176c & 2) == 0) {
            sb.append(" showPlaceholders");
        }
        if (this.f120174a == null) {
            sb.append(" placeholderColor");
        }
        if (this.f120175b == null) {
            sb.append(" defaultColor");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo49755b(boolean z) {
        this.f120177d = z;
        this.f120176c = (byte) (this.f120176c | 2);
    }
}
