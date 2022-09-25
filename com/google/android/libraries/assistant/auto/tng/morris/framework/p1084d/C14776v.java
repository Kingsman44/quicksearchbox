package com.google.android.libraries.assistant.auto.tng.morris.framework.p1084d;

import com.google.android.libraries.assistant.auto.tng.morris.framework.C14988j;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14352ga;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14353gb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.d.v */
/* compiled from: PG */
public final class C14776v {
    /* renamed from: a */
    public static final void m31110a(Optional optional, C14352ga gaVar) {
        if (!optional.isEmpty()) {
            C14988j jVar = (C14988j) optional.get();
            int d = jVar.mo21619d();
            int i = d - 1;
            if (d == 0) {
                throw null;
            } else if (i == 0) {
                C14496lj b = jVar.mo21617b();
                gaVar.copyOnWrite();
                C14353gb gbVar = C14353gb.f43433d;
                ((C14353gb) gaVar.instance).f43436b = b.getNumber();
            } else if (i == 1) {
                C14496lj b2 = jVar.mo21617b();
                gaVar.copyOnWrite();
                C14353gb gbVar2 = C14353gb.f43433d;
                ((C14353gb) gaVar.instance).f43437c = b2.getNumber();
            } else if (i == 2) {
                C14496lj b3 = jVar.mo21617b();
                gaVar.copyOnWrite();
                C14353gb gbVar3 = C14353gb.f43433d;
                ((C14353gb) gaVar.instance).f43435a = b3.getNumber();
            }
        }
    }
}
