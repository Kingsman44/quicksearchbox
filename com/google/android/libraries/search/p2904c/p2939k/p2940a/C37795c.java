package com.google.android.libraries.search.p2904c.p2939k.p2940a;

import com.google.android.libraries.search.p2904c.C37362b;
import com.google.android.libraries.search.p2904c.C37402bg;
import com.google.android.libraries.search.p2904c.C37403bh;
import com.google.android.libraries.search.p2904c.C37404bi;
import com.google.android.libraries.search.p2904c.C37410bo;
import com.google.android.libraries.search.p2904c.C37462ck;
import com.google.android.libraries.search.p2904c.C37465cn;
import com.google.android.libraries.search.p2904c.C37467cp;
import com.google.android.libraries.search.p2904c.p2942m.C37895i;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.libraries.search.c.k.a.c */
/* compiled from: PG */
public final class C37795c implements C37404bi {

    /* renamed from: a */
    private static final C59071e f100290a = C59071e.m91332i("com.google.android.libraries.search.c.k.a.c");

    /* renamed from: b */
    private final int f100291b;

    /* renamed from: c */
    private final C37895i f100292c;

    /* renamed from: d */
    private final C37794b f100293d;

    /* renamed from: e */
    private final C60870cx f100294e;

    public C37795c(int i, C37895i iVar, C37794b bVar, C60870cx cxVar) {
        this.f100291b = i;
        this.f100292c = iVar;
        this.f100293d = bVar;
        this.f100294e = C60856cj.m92901j(cxVar);
    }

    /* renamed from: a */
    public final C37402bg mo40935a(C37410bo boVar) {
        C59104x b = f100290a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.ARClient");
        ((C59052c) ((C59052c) b).mo56372aa(52791)).mo56387q("#audio# start listening for audio request client(token(%s))", this.f100291b);
        return this.f100292c.mo41109j(this.f100291b, boVar).mo41093b();
    }

    /* renamed from: b */
    public final C37402bg mo40936b(C37410bo boVar, C37362b bVar) {
        C37402bg a = mo40935a(boVar);
        this.f100293d.mo41088a(a.mo20357d(), bVar);
        return a;
    }

    /* renamed from: c */
    public final C37403bh mo40937c(C37462ck ckVar) {
        C59104x b = f100290a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.ARClient");
        C59052c cVar = (C59052c) ((C59052c) b).mo56372aa(52792);
        int i = this.f100291b;
        C37467cp cpVar = ckVar.f99445b;
        if (cpVar == null) {
            cpVar = C37467cp.f99458c;
        }
        cVar.mo56395y("#audio# route audio request client(token(%d)) to(%s)", i, C37465cn.m66491a(cpVar.f99460a).name());
        return this.f100292c.mo41101b(this.f100291b, ckVar);
    }

    /* renamed from: d */
    public final C60870cx mo40938d() {
        C59104x b = f100290a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ALT.ARClient");
        ((C59052c) ((C59052c) b).mo56372aa(52793)).mo56387q("#audio# deactivate audio request client(token(%s))", this.f100291b);
        this.f100292c.mo41115p(this.f100291b);
        return this.f100294e;
    }

    /* renamed from: e */
    public final C60870cx mo40939e() {
        return this.f100294e;
    }
}
