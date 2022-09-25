package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.am.h.dg;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3897e.p3921j.C52374pj;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.ce */
/* compiled from: PG */
public final /* synthetic */ class C77060ce implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77089dg f212676a;

    /* renamed from: b */
    public final /* synthetic */ long f212677b;

    /* renamed from: c */
    public final /* synthetic */ Optional f212678c;

    /* renamed from: d */
    public final /* synthetic */ Optional f212679d;

    /* renamed from: e */
    public final /* synthetic */ af f212680e;

    public /* synthetic */ C77060ce(C77089dg dgVar, long j, Optional optional, Optional optional2, af afVar) {
        this.f212676a = dgVar;
        this.f212677b = j;
        this.f212678c = optional;
        this.f212679d = optional2;
        this.f212680e = afVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C77089dg dgVar = this.f212676a;
        long j = this.f212677b;
        Optional optional = this.f212678c;
        Optional optional2 = this.f212679d;
        af afVar = this.f212680e;
        Optional optional3 = (Optional) obj;
        if (optional3.isPresent()) {
            return C60922j.m93044g(dgVar.f212752f.mo28209i(afVar.i(j), "[NGA] PersonContactHelper.create", new dg(optional, optional2, afVar, (C52374pj) optional3.get())), C77065cj.f212693a, C60826bg.f164896a);
        }
        return C60856cj.m92900i(Optional.empty());
    }
}
