package com.google.android.apps.gsa.staticplugins.bisto.p7488f;

import com.google.android.apps.search.assistant.surfaces.bisto.p9390c.p9392b.C124548d;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60062jk;
import com.google.common.p4552o.C60063jl;
import com.google.common.p4552o.C60066jo;
import com.google.common.p4552o.C60069jr;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.f.c */
/* compiled from: PG */
public final class C95297c {

    /* renamed from: a */
    public final AtomicBoolean f266637a = new AtomicBoolean(false);

    /* renamed from: b */
    private final C95307m f266638b;

    /* renamed from: c */
    private volatile C95305k f266639c;

    /* renamed from: d */
    private final AtomicBoolean f266640d = new AtomicBoolean(false);

    /* renamed from: e */
    private final AtomicBoolean f266641e = new AtomicBoolean(false);

    public C95297c(C95307m mVar) {
        this.f266638b = mVar;
    }

    /* renamed from: a */
    public final synchronized void mo89225a(C60066jo joVar) {
        joVar.copyOnWrite();
        C60069jr jrVar = (C60069jr) joVar.instance;
        C60069jr jrVar2 = C60069jr.f162379n;
        jrVar.f162382b = 2;
        jrVar.f162381a |= 1;
        C95307m mVar = this.f266638b;
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        boolean z = this.f266641e.get();
        joVar.copyOnWrite();
        C60069jr jrVar3 = (C60069jr) joVar.instance;
        jrVar3.f162381a |= 4096;
        jrVar3.f162392l = z;
        boolean z2 = this.f266637a.get();
        joVar.copyOnWrite();
        C60069jr jrVar4 = (C60069jr) joVar.instance;
        jrVar4.f162381a |= 8192;
        jrVar4.f162393m = z2;
        C60069jr jrVar5 = (C60069jr) joVar.build();
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        jrVar5.getClass();
        nmVar.f163144E = jrVar5;
        nmVar.f163148b |= 8192;
        mVar.mo89244i(nkVar, this.f266639c);
    }

    /* renamed from: b */
    public final synchronized void mo89226b(C60298nk nkVar) {
        this.f266638b.mo89244i(nkVar, this.f266639c);
    }

    /* renamed from: c */
    public final synchronized void mo89227c(C60062jk jkVar) {
        C58976aa aaVar = C58975e.f156826a;
        jkVar.copyOnWrite();
        C60063jl jlVar = (C60063jl) jkVar.instance;
        C60063jl jlVar2 = C60063jl.f162349f;
        jlVar.f162352b = 2;
        jlVar.f162351a |= 1;
        C95307m mVar = this.f266638b;
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        boolean z = this.f266640d.get();
        jkVar.copyOnWrite();
        C60063jl jlVar3 = (C60063jl) jkVar.instance;
        jlVar3.f162351a |= 4;
        jlVar3.f162354d = z;
        boolean z2 = this.f266637a.get();
        jkVar.copyOnWrite();
        C60063jl jlVar4 = (C60063jl) jkVar.instance;
        jlVar4.f162351a |= 8;
        jlVar4.f162355e = z2;
        C60063jl jlVar5 = (C60063jl) jkVar.build();
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        jlVar5.getClass();
        nmVar.f163145F = jlVar5;
        nmVar.f163148b |= 16384;
        mVar.mo89244i(nkVar, this.f266639c);
    }

    /* renamed from: d */
    public final synchronized void mo89228d(C124548d dVar) {
        this.f266639c = new C95305k(dVar.mo106472M(), dVar.mo106475P(), dVar.mo106486a(), dVar.mo106481V(), C124636bb.OPA_ENABLED.equals(dVar.mo106521s()), dVar.mo106478S());
    }

    /* renamed from: e */
    public final void mo89229e(Boolean bool) {
        this.f266641e.set(bool.booleanValue());
    }

    /* renamed from: f */
    public final void mo89230f(Boolean bool) {
        this.f266640d.set(bool.booleanValue());
    }
}
