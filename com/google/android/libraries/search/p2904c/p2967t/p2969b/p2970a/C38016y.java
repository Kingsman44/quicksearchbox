package com.google.android.libraries.search.p2904c.p2967t.p2969b.p2970a;

import com.google.android.libraries.search.p2904c.C37519dz;
import com.google.android.libraries.search.p2904c.C37563ed;
import com.google.android.libraries.search.p2904c.p2916e.C37559f;
import com.google.android.libraries.search.p2904c.p2928g.C37619d;
import com.google.android.libraries.search.p2904c.p2942m.p2943a.C37846as;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.search.c.t.b.a.y */
/* compiled from: PG */
public final /* synthetic */ class C38016y implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C38017z f100716a;

    /* renamed from: b */
    public final /* synthetic */ C37619d f100717b;

    public /* synthetic */ C38016y(C38017z zVar, C37619d dVar) {
        this.f100716a = zVar;
        this.f100717b = dVar;
    }

    public final C60870cx apply(Object obj) {
        C38017z zVar = this.f100716a;
        C37619d dVar = this.f100717b;
        C58833ax axVar = (C58833ax) obj;
        if (!axVar.mo56113h()) {
            return C60856cj.m92900i(C37846as.m66797c(C37519dz.FAILED_TO_OPEN_AUDIO_SOURCE));
        }
        dVar.mo41033b((C37559f) axVar.mo56107c());
        C58833ax a = dVar.mo41032a();
        C58833ax b = dVar.f99969h.mo56106b(C38015x.f100715a);
        C37563ed edVar = C37563ed.OPENED;
        return C60856cj.m92900i(C37846as.m66798d(a, b, C37846as.m66804j(edVar), C58833ax.m90834k(zVar.f100720b.f100423b)));
    }
}
