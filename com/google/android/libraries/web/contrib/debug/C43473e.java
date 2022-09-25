package com.google.android.libraries.web.contrib.debug;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.web.contrib.debug.internal.C43476aa;
import com.google.android.libraries.web.contrib.debug.internal.C43477ab;
import com.google.android.libraries.web.contrib.debug.internal.C43489m;
import com.google.android.libraries.web.contrib.debug.internal.C43502z;
import com.google.apps.tiktok.p3633d.p3634a.C46663a;
import com.google.apps.tiktok.p3633d.p3634a.C46667e;
import com.google.apps.tiktok.p3633d.p3634a.C46669g;
import com.google.common.base.C58838bb;
import com.google.common.base.C58893dc;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58801sm;
import com.google.protobuf.C63088z;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.web.contrib.debug.e */
/* compiled from: PG */
public final class C43473e {

    /* renamed from: a */
    private final C43477ab f113560a;

    public C43473e(C43477ab abVar) {
        this.f113560a = abVar;
    }

    /* renamed from: a */
    public final C46669g mo46556a(C43474f fVar) {
        C58485gu guVar;
        C58485gu n = C58485gu.m89846n(fVar);
        C43477ab abVar = this.f113560a;
        Objects.requireNonNull(abVar);
        C43472d dVar = new C43472d(abVar);
        C46663a aVar = new C46663a();
        aVar.mo50686d(C46667e.TEXT);
        C58838bb.m90869d(!n.isEmpty(), "At least one WebDebugKey must be provided.");
        StringBuilder sb = new StringBuilder();
        C58801sm G = n.listIterator(0);
        while (G.hasNext()) {
            C43474f fVar2 = (C43474f) G.next();
            C43476aa aaVar = (C43476aa) dVar.apply(fVar2);
            if (aaVar == null) {
                guVar = C58485gu.m89845m();
            } else {
                guVar = C58485gu.m89842j(aaVar.f113574c.values());
            }
            if (!guVar.isEmpty()) {
                sb.append(C43489m.m76738a(fVar2));
                C58893dc.m90996a(aaVar);
                int size = guVar.size();
                while (true) {
                    size--;
                    if (size < 0) {
                        break;
                    }
                    C43502z zVar = (C43502z) guVar.get(size);
                    sb.append("  ");
                    Object[] objArr = new Object[2];
                    objArr[0] = String.valueOf(size + 1);
                    objArr[1] = true != zVar.f113610b ? " (dead)" : BuildConfig.FLAVOR;
                    sb.append(String.format("Hierarchy %s%s:\n", objArr));
                    sb.append(C43489m.m76740c(zVar, "  "));
                }
            } else {
                sb.append(String.format("No web debug data found for %s.\n", new Object[]{fVar2.f113567f}));
            }
        }
        aVar.f121916a = C63088z.m96143E(sb.toString());
        aVar.mo50684b(false);
        return aVar.mo50683a();
    }
}
