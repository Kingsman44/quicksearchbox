package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.an */
/* compiled from: PG */
final class C78041an extends C78034ag {

    /* renamed from: a */
    private final Optional f214983a;

    /* renamed from: b */
    private final Optional f214984b;

    /* renamed from: c */
    private final Optional f214985c;

    /* renamed from: d */
    private final Optional f214986d;

    /* renamed from: e */
    private final C58485gu f214987e;

    /* renamed from: f */
    private final boolean f214988f;

    /* renamed from: g */
    private final boolean f214989g;

    /* renamed from: h */
    private final boolean f214990h;

    /* renamed from: i */
    private final Optional f214991i;

    public C78041an(Optional optional, Optional optional2, Optional optional3, Optional optional4, C58485gu guVar, boolean z, boolean z2, boolean z3, Optional optional5) {
        this.f214983a = optional;
        this.f214984b = optional2;
        this.f214985c = optional3;
        this.f214986d = optional4;
        this.f214987e = guVar;
        this.f214988f = z;
        this.f214989g = z2;
        this.f214990h = z3;
        this.f214991i = optional5;
    }

    /* renamed from: a */
    public final C58485gu mo72995a() {
        return this.f214987e;
    }

    /* renamed from: b */
    public final Optional mo72996b() {
        return this.f214983a;
    }

    /* renamed from: c */
    public final Optional mo72997c() {
        return this.f214985c;
    }

    /* renamed from: d */
    public final Optional mo72998d() {
        return this.f214984b;
    }

    /* renamed from: e */
    public final Optional mo72999e() {
        return this.f214991i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C78034ag) {
            C78034ag agVar = (C78034ag) obj;
            return this.f214983a.equals(agVar.mo72996b()) && this.f214984b.equals(agVar.mo72998d()) && this.f214985c.equals(agVar.mo72997c()) && this.f214986d.equals(agVar.mo73000f()) && C58597ky.m90218i(this.f214987e, agVar.mo72995a()) && this.f214988f == agVar.mo73001g() && this.f214989g == agVar.mo73003i() && this.f214990h == agVar.mo73002h() && this.f214991i.equals(agVar.mo72999e());
        }
    }

    /* renamed from: f */
    public final Optional mo73000f() {
        return this.f214986d;
    }

    /* renamed from: g */
    public final boolean mo73001g() {
        return this.f214988f;
    }

    /* renamed from: h */
    public final boolean mo73002h() {
        return this.f214990h;
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((((((((((((this.f214983a.hashCode() ^ 1000003) * 1000003) ^ this.f214984b.hashCode()) * 1000003) ^ this.f214985c.hashCode()) * 1000003) ^ this.f214986d.hashCode()) * 1000003) ^ this.f214987e.hashCode()) * 1000003) ^ (true != this.f214988f ? 1237 : 1231)) * 1000003) ^ (true != this.f214989g ? 1237 : 1231)) * 1000003;
        if (true == this.f214990h) {
            i = 1231;
        }
        return ((hashCode ^ i) * 1000003) ^ this.f214991i.hashCode();
    }

    /* renamed from: i */
    public final boolean mo73003i() {
        return this.f214989g;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f214983a);
        String valueOf2 = String.valueOf(this.f214984b);
        String valueOf3 = String.valueOf(this.f214985c);
        String valueOf4 = String.valueOf(this.f214986d);
        String obj = this.f214987e.toString();
        boolean z = this.f214988f;
        boolean z2 = this.f214989g;
        boolean z3 = this.f214990h;
        String valueOf5 = String.valueOf(this.f214991i);
        return "AnswerViewModel{cardHeading=" + valueOf + ", contentView=" + valueOf2 + ", contentFragment=" + valueOf3 + ", onActivityFinish=" + valueOf4 + ", suggestions=" + obj + ", cardHeadingVisible=" + z + ", showKeyboard=" + z2 + ", safeForLockScreen=" + z3 + ", dataFreshness=" + valueOf5 + "}";
    }
}
