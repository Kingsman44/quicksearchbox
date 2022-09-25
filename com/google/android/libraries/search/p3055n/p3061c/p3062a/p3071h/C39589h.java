package com.google.android.libraries.search.p3055n.p3061c.p3062a.p3071h;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;

/* renamed from: com.google.android.libraries.search.n.c.a.h.h */
/* compiled from: PG */
public final class C39589h extends C39537ab {

    /* renamed from: a */
    private String f104217a;

    /* renamed from: b */
    private C58833ax f104218b;

    /* renamed from: c */
    private C58833ax f104219c;

    /* renamed from: d */
    private int f104220d;

    /* renamed from: e */
    private byte f104221e;

    public C39589h() {
        C58836b bVar = C58836b.f156633a;
        this.f104218b = bVar;
        this.f104219c = bVar;
    }

    /* renamed from: a */
    public final C39538ac mo41885a() {
        String str;
        if (this.f104221e == 1 && (str = this.f104217a) != null) {
            return new C39590i(str, this.f104218b, this.f104219c, this.f104220d);
        }
        StringBuilder sb = new StringBuilder();
        if (this.f104217a == null) {
            sb.append(" locale");
        }
        if (this.f104221e == 0) {
            sb.append(" fixedGainMultiplier");
        }
        throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
    }

    /* renamed from: b */
    public final void mo41886b(int i) {
        this.f104220d = i;
        this.f104221e = 1;
    }

    /* renamed from: c */
    public final void mo41887c(C58833ax axVar) {
        if (axVar != null) {
            this.f104218b = axVar;
            return;
        }
        throw new NullPointerException("Null hotwordModel");
    }

    /* renamed from: d */
    public final void mo41888d(String str) {
        if (str != null) {
            this.f104217a = str;
            return;
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: e */
    public final void mo41889e(C58833ax axVar) {
        if (axVar != null) {
            this.f104219c = axVar;
            return;
        }
        throw new NullPointerException("Null speakerIdModel");
    }
}
