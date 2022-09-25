package com.google.android.apps.search.assistant.libraries.p8946b;

import android.accounts.Account;
import android.os.Build;
import com.google.android.apps.gsa.n.b.c;
import com.google.android.libraries.geller.p1814b.C21758b;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protos.p5124m.p5125a.C65599b;
import com.google.protos.p5129p.p5131b.C65753ak;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.libraries.b.q */
/* compiled from: PG */
public final class C119254q implements C21758b {

    /* renamed from: a */
    private final boolean f332563a;

    /* renamed from: b */
    private final boolean f332564b;

    /* renamed from: c */
    private final boolean f332565c;

    /* renamed from: d */
    private final boolean f332566d;

    /* renamed from: e */
    private final boolean f332567e;

    /* renamed from: f */
    private final boolean f332568f;

    /* renamed from: g */
    private final boolean f332569g;

    /* renamed from: h */
    private final boolean f332570h;

    /* renamed from: i */
    private final boolean f332571i;

    /* renamed from: j */
    private final boolean f332572j;

    /* renamed from: k */
    private final boolean f332573k;

    /* renamed from: l */
    private final boolean f332574l;

    /* renamed from: m */
    private final boolean f332575m;

    /* renamed from: n */
    private final boolean f332576n;

    /* renamed from: o */
    private final boolean f332577o;

    /* renamed from: p */
    private final boolean f332578p;

    /* renamed from: q */
    private final boolean f332579q;

    /* renamed from: r */
    private final C58528ij f332580r;

    /* renamed from: s */
    private final C58528ij f332581s;

    /* renamed from: t */
    private final c f332582t;

    public C119254q(boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7, boolean z8, boolean z9, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14, boolean z15, C65599b bVar, C65599b bVar2, boolean z16, boolean z17, c cVar) {
        this.f332563a = z;
        this.f332564b = z2;
        this.f332565c = z3;
        this.f332566d = z4;
        this.f332567e = z5;
        this.f332568f = z6;
        this.f332569g = z7;
        this.f332570h = z8;
        this.f332571i = z9;
        this.f332572j = z10;
        this.f332573k = z11;
        this.f332575m = z12;
        this.f332574l = z13;
        this.f332577o = z14;
        this.f332578p = z15;
        this.f332580r = (C58528ij) Collection.EL.stream(bVar.f178301a).map(C119253p.f332562a).collect(C58370cn.f155947b);
        this.f332581s = (C58528ij) Collection.EL.stream(bVar2.f178301a).map(C119253p.f332562a).collect(C58370cn.f155947b);
        this.f332576n = z16;
        this.f332579q = z17;
        this.f332582t = cVar;
    }

    /* renamed from: a */
    public final C60870cx mo27092a(Account account, C65753ak akVar) {
        return C60856cj.m92900i(true);
    }

    /* renamed from: c */
    public final boolean mo27093c(C65753ak akVar) {
        if (this.f332580r.contains(akVar) || this.f332581s.contains(akVar)) {
            return this.f332582t.b(akVar);
        }
        C65753ak akVar2 = C65753ak.UNKNOWN;
        int ordinal = akVar.ordinal();
        if (ordinal == 18) {
            return this.f332569g;
        }
        if (ordinal == 20) {
            return this.f332570h;
        }
        if (ordinal == 24) {
            return this.f332574l;
        }
        if (ordinal == 26) {
            return this.f332579q;
        }
        if (ordinal == 32) {
            return this.f332578p;
        }
        if (ordinal == 45) {
            return true;
        }
        if (ordinal == 53) {
            return this.f332571i;
        }
        if (ordinal == 89) {
            return Build.VERSION.SDK_INT >= 31 && this.f332563a;
        }
        if (ordinal == 91) {
            return this.f332577o;
        }
        if (ordinal == 112) {
            return this.f332572j;
        }
        if (ordinal == 29) {
            return this.f332567e;
        }
        if (ordinal == 30) {
            return this.f332566d;
        }
        if (ordinal == 128) {
            return this.f332564b;
        }
        if (ordinal == 129) {
            return this.f332573k;
        }
        switch (ordinal) {
            case 13:
                return this.f332568f;
            case 14:
                return this.f332575m;
            case 15:
                return this.f332576n;
            case 16:
                return this.f332565c;
            default:
                return false;
        }
    }
}
