package com.google.android.libraries.lens.view.session;

import android.graphics.RectF;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.lens.view.session.h */
/* compiled from: PG */
final class C27788h extends C27774bj {

    /* renamed from: a */
    public final RectF f75812a;

    /* renamed from: b */
    public final C24231w f75813b;

    /* renamed from: c */
    public final boolean f75814c;

    /* renamed from: d */
    public final C58485gu f75815d;

    /* renamed from: e */
    public final int f75816e;

    public C27788h(RectF rectF, C24231w wVar, boolean z, C58485gu guVar, int i) {
        this.f75812a = rectF;
        this.f75813b = wVar;
        this.f75814c = z;
        this.f75815d = guVar;
        this.f75816e = i;
    }

    /* renamed from: a */
    public final RectF mo33280a() {
        return this.f75812a;
    }

    /* renamed from: b */
    public final C27773bi mo33281b() {
        return new C27787g(this);
    }

    /* renamed from: c */
    public final C24231w mo33256c() {
        return this.f75813b;
    }

    /* renamed from: d */
    public final boolean mo33257d() {
        return this.f75814c;
    }

    /* renamed from: e */
    public final int mo33258e() {
        return this.f75816e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27774bj) {
            C27774bj bjVar = (C27774bj) obj;
            return this.f75812a.equals(bjVar.mo33280a()) && this.f75813b.equals(bjVar.mo33256c()) && this.f75814c == bjVar.mo33257d() && C58597ky.m90218i(this.f75815d, bjVar.mo33259f()) && this.f75816e == bjVar.mo33258e();
        }
    }

    /* renamed from: f */
    public final C58485gu mo33259f() {
        return this.f75815d;
    }

    public final int hashCode() {
        return ((((((((this.f75812a.hashCode() ^ 1000003) * 1000003) ^ this.f75813b.hashCode()) * 1000003) ^ (true != this.f75814c ? 1237 : 1231)) * 1000003) ^ this.f75815d.hashCode()) * 1000003) ^ this.f75816e;
    }

    public final String toString() {
        String obj = this.f75812a.toString();
        String obj2 = this.f75813b.toString();
        boolean z = this.f75814c;
        String obj3 = this.f75815d.toString();
        String num = Integer.toString(this.f75816e - 1);
        return "RegionSearchSelection{box=" + obj + ", interactionOrigin=" + obj2 + ", isFrozenImageSelection=" + z + ", tappedObjects=" + obj3 + ", autoTextSelectionMode=" + num + "}";
    }
}
