package com.google.android.apps.gsa.staticplugins.opa.chatui;

import com.google.android.apps.gsa.shared.util.C90735as;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.chatui.x */
/* compiled from: PG */
final class C108489x extends C108320ei {

    /* renamed from: a */
    private final String f301863a;

    /* renamed from: b */
    private final String f301864b;

    /* renamed from: c */
    private final Integer f301865c;

    /* renamed from: d */
    private final C90735as f301866d;

    /* renamed from: e */
    private final Boolean f301867e;

    /* renamed from: f */
    private final Boolean f301868f;

    /* renamed from: g */
    private final C58833ax f301869g;

    /* renamed from: h */
    private final C58833ax f301870h;

    public C108489x(String str, String str2, Integer num, C90735as asVar, Boolean bool, Boolean bool2, C58833ax axVar, C58833ax axVar2) {
        this.f301863a = str;
        this.f301864b = str2;
        this.f301865c = num;
        this.f301866d = asVar;
        this.f301867e = bool;
        this.f301868f = bool2;
        this.f301869g = axVar;
        this.f301870h = axVar2;
    }

    /* renamed from: a */
    public final C90735as mo96690a() {
        return this.f301866d;
    }

    /* renamed from: b */
    public final C58833ax mo96691b() {
        return this.f301870h;
    }

    /* renamed from: c */
    public final C58833ax mo96692c() {
        return this.f301869g;
    }

    /* renamed from: d */
    public final Boolean mo96693d() {
        return null;
    }

    /* renamed from: e */
    public final Boolean mo96694e() {
        return this.f301867e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:31:0x0065, code lost:
        r1 = r4.f301867e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x007a, code lost:
        r1 = r4.f301868f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r5) {
        /*
            r4 = this;
            r0 = 1
            if (r5 != r4) goto L_0x0004
            return r0
        L_0x0004:
            boolean r1 = r5 instanceof com.google.android.apps.gsa.staticplugins.opa.chatui.C108320ei
            r2 = 0
            if (r1 == 0) goto L_0x00a9
            com.google.android.apps.gsa.staticplugins.opa.chatui.ei r5 = (com.google.android.apps.gsa.staticplugins.opa.chatui.C108320ei) r5
            java.lang.String r1 = r4.f301863a
            if (r1 != 0) goto L_0x0016
            java.lang.String r1 = r5.mo96778h()
            if (r1 != 0) goto L_0x00a9
            goto L_0x0020
        L_0x0016:
            java.lang.String r3 = r5.mo96778h()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
        L_0x0020:
            java.lang.String r1 = r4.f301864b
            if (r1 != 0) goto L_0x002b
            java.lang.String r1 = r5.mo96696i()
            if (r1 != 0) goto L_0x00a9
            goto L_0x0035
        L_0x002b:
            java.lang.String r3 = r5.mo96696i()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
        L_0x0035:
            java.lang.Integer r1 = r4.f301865c
            if (r1 != 0) goto L_0x0040
            java.lang.Integer r1 = r5.mo96777g()
            if (r1 != 0) goto L_0x00a9
            goto L_0x004a
        L_0x0040:
            java.lang.Integer r3 = r5.mo96777g()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
        L_0x004a:
            com.google.android.apps.gsa.shared.util.as r1 = r4.f301866d
            if (r1 != 0) goto L_0x0055
            com.google.android.apps.gsa.shared.util.as r1 = r5.mo96690a()
            if (r1 != 0) goto L_0x00a9
            goto L_0x005f
        L_0x0055:
            com.google.android.apps.gsa.shared.util.as r3 = r5.mo96690a()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
        L_0x005f:
            java.lang.Boolean r1 = r5.mo96693d()
            if (r1 != 0) goto L_0x00a9
            java.lang.Boolean r1 = r4.f301867e
            if (r1 != 0) goto L_0x0070
            java.lang.Boolean r1 = r5.mo96694e()
            if (r1 != 0) goto L_0x00a9
            goto L_0x007a
        L_0x0070:
            java.lang.Boolean r3 = r5.mo96694e()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
        L_0x007a:
            java.lang.Boolean r1 = r4.f301868f
            if (r1 != 0) goto L_0x0085
            java.lang.Boolean r1 = r5.mo96695f()
            if (r1 != 0) goto L_0x00a9
            goto L_0x0090
        L_0x0085:
            java.lang.Boolean r3 = r5.mo96695f()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto L_0x0090
            goto L_0x00a9
        L_0x0090:
            com.google.common.base.ax r1 = r4.f301869g
            com.google.common.base.ax r3 = r5.mo96692c()
            boolean r1 = r1.equals(r3)
            if (r1 == 0) goto L_0x00a9
            com.google.common.base.ax r1 = r4.f301870h
            com.google.common.base.ax r5 = r5.mo96691b()
            boolean r5 = r1.equals(r5)
            if (r5 == 0) goto L_0x00a9
            return r0
        L_0x00a9:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.opa.chatui.C108489x.equals(java.lang.Object):boolean");
    }

    /* renamed from: f */
    public final Boolean mo96695f() {
        return this.f301868f;
    }

    /* renamed from: g */
    public final Integer mo96777g() {
        return this.f301865c;
    }

    /* renamed from: h */
    public final String mo96778h() {
        return this.f301863a;
    }

    /* renamed from: i */
    public final String mo96696i() {
        return this.f301864b;
    }

    public final String toString() {
        String str = this.f301863a;
        String str2 = this.f301864b;
        Integer num = this.f301865c;
        String valueOf = String.valueOf(this.f301866d);
        Boolean bool = this.f301867e;
        Boolean bool2 = this.f301868f;
        String valueOf2 = String.valueOf(this.f301869g);
        String valueOf3 = String.valueOf(this.f301870h);
        return "LongClickData{eventId=" + str + ", query=" + str2 + ", sessionType=" + num + ", range=" + valueOf + ", editHintShown=null, userQueryHighlighted=" + bool + ", userQueryInvisible=" + bool2 + ", queryAlternatives=" + valueOf2 + ", highlightUserQueryArgs=" + valueOf3 + "}";
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        String str = this.f301863a;
        int i4 = 0;
        int hashCode = ((str == null ? 0 : str.hashCode()) ^ 1000003) * 1000003;
        String str2 = this.f301864b;
        int hashCode2 = (hashCode ^ (str2 == null ? 0 : str2.hashCode())) * 1000003;
        Integer num = this.f301865c;
        if (num == null) {
            i = 0;
        } else {
            i = num.hashCode();
        }
        int i5 = (hashCode2 ^ i) * 1000003;
        C90735as asVar = this.f301866d;
        if (asVar == null) {
            i2 = 0;
        } else {
            i2 = asVar.hashCode();
        }
        int i6 = (i5 ^ i2) * -721379959;
        Boolean bool = this.f301867e;
        if (bool == null) {
            i3 = 0;
        } else {
            i3 = bool.hashCode();
        }
        int i7 = (i6 ^ i3) * 1000003;
        Boolean bool2 = this.f301868f;
        if (bool2 != null) {
            i4 = bool2.hashCode();
        }
        return ((((i7 ^ i4) * 1000003) ^ this.f301869g.hashCode()) * 1000003) ^ this.f301870h.hashCode();
    }
}
