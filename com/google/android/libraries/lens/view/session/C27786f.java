package com.google.android.libraries.lens.view.session;

import android.graphics.PointF;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.lens.view.session.f */
/* compiled from: PG */
final class C27786f extends C27772bh {

    /* renamed from: a */
    public final PointF f75802a;

    /* renamed from: b */
    public final C24231w f75803b;

    /* renamed from: c */
    public final boolean f75804c;

    /* renamed from: d */
    public final C58485gu f75805d;

    public C27786f(PointF pointF, C24231w wVar, boolean z, C58485gu guVar) {
        this.f75802a = pointF;
        this.f75803b = wVar;
        this.f75804c = z;
        this.f75805d = guVar;
    }

    /* renamed from: a */
    public final PointF mo33271a() {
        return this.f75802a;
    }

    /* renamed from: b */
    public final C27771bg mo33272b() {
        return new C27785e(this);
    }

    /* renamed from: c */
    public final C24231w mo33256c() {
        return this.f75803b;
    }

    /* renamed from: d */
    public final boolean mo33257d() {
        return this.f75804c;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27772bh) {
            C27772bh bhVar = (C27772bh) obj;
            return this.f75802a.equals(bhVar.mo33271a()) && this.f75803b.equals(bhVar.mo33256c()) && this.f75804c == bhVar.mo33257d() && C58597ky.m90218i(this.f75805d, bhVar.mo33259f());
        }
    }

    /* renamed from: f */
    public final C58485gu mo33259f() {
        return this.f75805d;
    }

    public final int hashCode() {
        return ((((((this.f75802a.hashCode() ^ 1000003) * 1000003) ^ this.f75803b.hashCode()) * 1000003) ^ (true != this.f75804c ? 1237 : 1231)) * 1000003) ^ this.f75805d.hashCode();
    }

    public final String toString() {
        String obj = this.f75802a.toString();
        String obj2 = this.f75803b.toString();
        boolean z = this.f75804c;
        String obj3 = this.f75805d.toString();
        return "PointSelection{point=" + obj + ", interactionOrigin=" + obj2 + ", isFrozenImageSelection=" + z + ", tappedObjects=" + obj3 + "}";
    }
}
