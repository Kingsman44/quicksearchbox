package com.google.android.libraries.lens.view.p2178x;

import android.os.Trace;
import com.google.android.libraries.lens.view.gleam.C26441a;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import java.util.List;

/* renamed from: com.google.android.libraries.lens.view.x.f */
/* compiled from: PG */
public final /* synthetic */ class C28212f implements C28208b {

    /* renamed from: a */
    public static final /* synthetic */ C28212f f76823a = new C28212f();

    private /* synthetic */ C28212f() {
    }

    /* renamed from: a */
    public final void mo33722a(int i, List list, List list2, C58480gp gpVar, C58480gp gpVar2) {
        Trace.beginSection("thinkingGleamsGenerateSingleParticleInTheirBox");
        C58801sm G = ((C58485gu) list2).listIterator(0);
        while (G.hasNext()) {
            C26441a aVar = (C26441a) G.next();
            C25349y a = C25349y.m46667a(aVar.f71963a.f68848i);
            if (a == null) {
                a = C25349y.UNRECOGNIZED;
            }
            if (a == C25349y.THINKING_GLEAM && aVar.mo31656f().isEmpty()) {
                gpVar.mo55395g(aVar.mo31655e());
            }
        }
        Trace.endSection();
    }
}
