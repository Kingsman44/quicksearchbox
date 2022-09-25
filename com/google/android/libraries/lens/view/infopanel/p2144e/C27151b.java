package com.google.android.libraries.lens.view.infopanel.p2144e;

import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58597ky;

/* renamed from: com.google.android.libraries.lens.view.infopanel.e.b */
/* compiled from: PG */
final class C27151b extends C27181w {

    /* renamed from: a */
    private final C58485gu f74185a;

    /* renamed from: b */
    private final C58833ax f74186b;

    /* renamed from: c */
    private final C58833ax f74187c;

    public C27151b(C58485gu guVar, C58833ax axVar, C58833ax axVar2) {
        this.f74185a = guVar;
        this.f74186b = axVar;
        this.f74187c = axVar2;
    }

    /* renamed from: a */
    public final C58833ax mo32583a() {
        return this.f74187c;
    }

    /* renamed from: b */
    public final C58833ax mo32584b() {
        return this.f74186b;
    }

    /* renamed from: c */
    public final C58485gu mo32585c() {
        return this.f74185a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C27181w) {
            C27181w wVar = (C27181w) obj;
            return C58597ky.m90218i(this.f74185a, wVar.mo32585c()) && this.f74186b.equals(wVar.mo32584b()) && this.f74187c.equals(wVar.mo32583a());
        }
    }

    public final int hashCode() {
        return ((((this.f74185a.hashCode() ^ 1000003) * 1000003) ^ 2040732332) * 1000003) ^ 2040732332;
    }

    public final String toString() {
        String obj = this.f74185a.toString();
        return "InfoPanelChipItemConfig{rotatingIconUris=" + obj + ", iconUriOverride=Optional.absent(), displayTextOverride=Optional.absent()}";
    }
}
