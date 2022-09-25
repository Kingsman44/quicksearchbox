package com.google.android.apps.search.googleapp.search.srp.error;

import android.view.View;
import com.google.android.apps.search.googleapp.p10318i.C136216e;
import com.google.android.apps.search.googleapp.p10318i.C136219h;
import com.google.android.libraries.web.contrib.errorpage.C43516d;
import com.google.android.libraries.web.contrib.errorpage.p3373a.C43512b;
import com.google.android.libraries.web.p3353c.C43358c;
import com.google.android.libraries.web.p3353c.C43362g;
import com.google.android.libraries.web.p3353c.C43363h;
import com.google.android.libraries.web.p3353c.C43376u;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.search.srp.error.f */
/* compiled from: PG */
public final /* synthetic */ class C137807f implements C43516d {

    /* renamed from: a */
    public final /* synthetic */ C137811j f374920a;

    public /* synthetic */ C137807f(C137811j jVar) {
        this.f374920a = jVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo46581a() {
    }

    /* renamed from: b */
    public final void mo46582b(C43376u uVar, Optional optional) {
        Optional optional2;
        Object obj;
        C137811j jVar = this.f374920a;
        if (optional.isPresent()) {
            C137824w wVar = C137824w.ERROR_REQUEST_DATA_UNAVAILABLE;
            C136216e eVar = C136216e.GRANT_MIC_PERMISSION;
            C43512b bVar = (C43512b) optional.get();
            C62940bt r5 = C62942bv.checkIsLite(C137825x.f374971a);
            bVar.mo58887l(r5);
            Object l = bVar.f169962ag.mo58854l(r5.f169971d);
            if (l == null) {
                obj = r5.f169969b;
            } else {
                obj = r5.mo58889c(l);
            }
            int ordinal = ((C137824w) obj).ordinal();
            if (ordinal == 0) {
                jVar.mo113974c(Optional.empty(), false);
            } else if (ordinal == 1) {
                C136219h a = jVar.f374926c.mo112846a(12, jVar.f374933j, false);
                if (!a.equals(jVar.f374934k)) {
                    jVar.mo113973b(a);
                    jVar.f374934k = a;
                }
                View view = jVar.f374927d.getView();
                view.getClass();
                view.setVisibility(0);
            } else if (ordinal == 2) {
                C43358c cVar = (C43358c) C43363h.f113275f.createBuilder();
                C43362g gVar = C43362g.CONNECTIVITY;
                cVar.copyOnWrite();
                C43363h hVar = (C43363h) cVar.instance;
                hVar.f113278b = gVar.f113274h;
                hVar.f113277a |= 1;
                jVar.mo113974c(Optional.m71637of((C43363h) cVar.build()), true);
            }
        } else {
            if ((uVar.f113328a & 4) != 0) {
                C43363h hVar2 = uVar.f113331d;
                if (hVar2 == null) {
                    hVar2 = C43363h.f113275f;
                }
                optional2 = Optional.m71637of(hVar2);
            } else {
                optional2 = Optional.empty();
            }
            jVar.mo113974c(optional2, false);
        }
    }
}
