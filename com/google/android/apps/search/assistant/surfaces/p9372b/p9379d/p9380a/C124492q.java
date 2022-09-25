package com.google.android.apps.search.assistant.surfaces.p9372b.p9379d.p9380a;

import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.surfaces.b.d.a.q */
/* compiled from: PG */
public final /* synthetic */ class C124492q implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C124437ah f343539a;

    public /* synthetic */ C124492q(C124437ah ahVar) {
        this.f343539a = ahVar;
    }

    public final void accept(Object obj) {
        C124437ah ahVar = this.f343539a;
        C124476bs bsVar = (C124476bs) obj;
        C124476bs bsVar2 = C124476bs.UNKNOWN_STATE;
        C124477bt btVar = C124477bt.UNKNOWN_REQUEST;
        int ordinal = bsVar.ordinal();
        if (ordinal == 0) {
            ahVar.mo106422h(new C124434ae(ahVar));
            C58976aa aaVar = C58975e.f156826a;
        } else if (ordinal == 1) {
        } else {
            if (ordinal == 2) {
                ahVar.mo106422h(new C124434ae(ahVar));
                return;
            }
            int number = bsVar.getNumber();
            throw new IllegalStateException("Connection state unrecognized =" + number);
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
