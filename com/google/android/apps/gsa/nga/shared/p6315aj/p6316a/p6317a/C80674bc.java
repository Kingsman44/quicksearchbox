package com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a;

import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6318b.C80831aj;

/* renamed from: com.google.android.apps.gsa.nga.shared.aj.a.a.bc */
/* compiled from: PG */
public final class C80674bc extends C80732dg {

    /* renamed from: a */
    public String f221494a;

    /* renamed from: b */
    public String f221495b;

    /* renamed from: c */
    public String f221496c;

    /* renamed from: d */
    public int f221497d;

    /* renamed from: e */
    private C80831aj f221498e;

    /* renamed from: a */
    public final C80734di mo74535a() {
        if (this.f221494a != null && this.f221495b != null && this.f221498e != null && this.f221497d != 0 && this.f221496c != null) {
            return new C80675bd(this.f221494a, this.f221495b, this.f221498e, this.f221497d, this.f221496c);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f221494a == null) {
            sb.append(" text");
        }
        if (this.f221495b == null) {
            sb.append(" subText");
        }
        if (this.f221498e == null) {
            sb.append(" clickAction");
        }
        if (this.f221497d == 0) {
            sb.append(" type");
        }
        if (this.f221496c == null) {
            sb.append(" imageUrl");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo74536b(C80831aj ajVar) {
        if (ajVar != null) {
            this.f221498e = ajVar;
            return;
        }
        throw new NullPointerException("Null clickAction");
    }

    /* renamed from: c */
    public final void mo74537c(String str) {
        if (str != null) {
            this.f221494a = str;
            return;
        }
        throw new NullPointerException("Null text");
    }
}
