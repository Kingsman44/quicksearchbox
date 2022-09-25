package com.google.android.libraries.assistant.auto.tng.morris.framework.p1084d;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14988j;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14229bm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14230bn;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14542nb;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.d.n */
/* compiled from: PG */
public final class C14768n {
    /* renamed from: a */
    public static final void m31100a(Optional optional, C14229bm bmVar) {
        if (!optional.isEmpty()) {
            C14988j jVar = (C14988j) optional.get();
            C14542nb nbVar = C14542nb.UNKNOWN_TYPE;
            int d = jVar.mo21619d();
            int i = d - 1;
            if (d == 0) {
                throw null;
            } else if (i == 0) {
                C14496lj b = jVar.mo21617b();
                bmVar.copyOnWrite();
                C14230bn bnVar = C14230bn.f43058k;
                ((C14230bn) bmVar.instance).f43069j = b.getNumber();
            } else if (i == 1) {
                C14496lj b2 = jVar.mo21617b();
                bmVar.copyOnWrite();
                C14230bn bnVar2 = C14230bn.f43058k;
                ((C14230bn) bmVar.instance).f43067h = b2.getNumber();
            } else if (i == 2) {
                C14496lj b3 = jVar.mo21617b();
                bmVar.copyOnWrite();
                C14230bn bnVar3 = C14230bn.f43058k;
                ((C14230bn) bmVar.instance).f43066g = b3.getNumber();
            } else if (i == 3) {
                C14496lj b4 = jVar.mo21617b();
                bmVar.copyOnWrite();
                C14230bn bnVar4 = C14230bn.f43058k;
                ((C14230bn) bmVar.instance).f43068i = b4.getNumber();
            }
        }
    }
}
