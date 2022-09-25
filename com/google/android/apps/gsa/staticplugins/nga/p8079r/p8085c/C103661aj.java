package com.google.android.apps.gsa.staticplugins.nga.p8079r.p8085c;

import android.content.pm.PackageManager;
import com.google.android.apps.gsa.nga.shared.p6307af.C80600k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80579m;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80580n;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80581o;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80588v;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80589w;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89126b;
import com.google.android.apps.gsa.shared.p6976ag.p6980d.C89128d;
import com.google.assistant.p3745ab.C48305dd;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.r.c.aj */
/* compiled from: PG */
public final /* synthetic */ class C103661aj implements Function {

    /* renamed from: a */
    public final /* synthetic */ C103669ar f288744a;

    public /* synthetic */ C103661aj(C103669ar arVar) {
        this.f288744a = arVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C80590x xVar;
        C103669ar arVar = this.f288744a;
        C89128d dVar = (C89128d) obj;
        C89126b a = dVar.mo83100a();
        C89126b bVar = C89126b.BISTO;
        int ordinal = a.ordinal();
        if (ordinal == 0) {
            xVar = C80590x.BISTO;
        } else if (ordinal == 1) {
            xVar = C80590x.BISTO_LOW_PRIORITY;
        } else if (ordinal == 2) {
            xVar = C80590x.CONVERSATION_STARTER;
        } else {
            throw new AssertionError("Unexpected chip type: ".concat(String.valueOf(String.valueOf(a))));
        }
        arVar.f288757d.getResources();
        C80581o e = C80600k.m128230e(xVar, C80580n.INVOCATION, dVar.mo83101b(), (PackageManager) arVar.f288756c.mo27525b(), arVar.f288758e);
        if (dVar.mo83102c().isEmpty()) {
            return e;
        }
        C80579m mVar = (C80579m) e.toBuilder();
        C80589w wVar = ((C80581o) mVar.instance).f221194d;
        if (wVar == null) {
            wVar = C80589w.f221220i;
        }
        C80588v vVar = (C80588v) wVar.toBuilder();
        C48305dd ddVar = (C48305dd) dVar.mo83102c().get();
        vVar.copyOnWrite();
        ddVar.getClass();
        ((C80589w) vVar.instance).f221229h = ddVar;
        mVar.copyOnWrite();
        C80589w wVar2 = (C80589w) vVar.build();
        wVar2.getClass();
        ((C80581o) mVar.instance).f221194d = wVar2;
        return (C80581o) mVar.build();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
