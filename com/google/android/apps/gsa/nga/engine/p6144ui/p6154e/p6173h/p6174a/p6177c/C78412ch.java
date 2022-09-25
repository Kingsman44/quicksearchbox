package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.p6174a.p6177c;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78532ao;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78535ar;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6173h.C78539av;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78815q;
import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6210s.C78816r;
import p3186j$.util.function.BiFunction;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.h.a.c.ch */
/* compiled from: PG */
public final /* synthetic */ class C78412ch implements BiFunction {

    /* renamed from: a */
    public static final /* synthetic */ C78412ch f215861a = new C78412ch();

    private /* synthetic */ C78412ch() {
    }

    public final /* synthetic */ BiFunction andThen(Function function) {
        return BiFunction.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj, Object obj2) {
        C78245d dVar = (C78245d) obj;
        C78815q qVar = (C78815q) obj2;
        dVar.mo73179a().mo73175h();
        dVar.mo73180b().mo73175h();
        if (C78816r.m126607l(qVar)) {
            return C78418cn.SWITCH_TO_SCREEN_CONTEXT_EXPLANATION_STAGE;
        }
        if (C78816r.m126608m(qVar)) {
            return C78418cn.SWITCH_TO_NEW_INVOCATION_WITH_SPEED_BUMP;
        }
        if (C78816r.m126604i(qVar)) {
            return C78418cn.SWITCH_TO_OAUTH_FIX_STAGE;
        }
        if (!C78816r.m126601f(qVar) || !dVar.mo73185h()) {
            return C78418cn.SWITCH_TO_GONE_STAGE;
        }
        if (C78816r.m126600e(qVar)) {
            return C78418cn.SWITCH_TO_NEW_INVOCATION_WITH_EXPAND_PLATE_STAGE;
        }
        int i = qVar.f216929a;
        if (i == 5) {
            return C78418cn.SWITCH_TO_NOT_LISTENING_STAGE;
        }
        if (i == 4) {
            return C78418cn.DO_NOT_SWITCH_STAGE;
        }
        C78418cn cnVar = C78418cn.SWITCH_TO_TRANSCRIPTION_STAGE;
        C78539av avVar = C78539av.EMPTY;
        C78532ao aoVar = C78532ao.EMPTY;
        C78535ar arVar = C78535ar.EMPTY;
        int h = dVar.mo73180b().mo73175h();
        int i2 = h - 1;
        if (h != 0) {
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 3) {
                        return C78418cn.SWITCH_TO_EXECUTING_STAGE;
                    }
                    if (!dVar.mo73189l()) {
                        return C78418cn.SWITCH_TO_GONE_STAGE;
                    }
                }
            } else if (dVar.mo73181d()) {
                return C78418cn.SWITCH_TO_TRANSCRIPTION_STAGE;
            } else {
                if (!dVar.mo73183f()) {
                    return C78418cn.SWITCH_TO_NEW_INVOCATION_STAGE;
                }
            }
            return C78418cn.DO_NOT_SWITCH_STAGE;
        }
        throw null;
    }
}
