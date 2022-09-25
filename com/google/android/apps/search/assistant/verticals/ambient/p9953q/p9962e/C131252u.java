package com.google.android.apps.search.assistant.verticals.ambient.p9953q.p9962e;

import com.google.android.apps.search.assistant.verticals.ambient.p9915e.C130603a;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.search.assistant.verticals.ambient.q.e.u */
/* compiled from: PG */
public final class C131252u {

    /* renamed from: a */
    private final C58974d f358902a;

    public C131252u(C130603a aVar) {
        this.f358902a = aVar.mo109740b(this);
    }

    /* renamed from: a */
    public final C58495hd mo110137a(String str) {
        if (C58837ba.m90859h(str)) {
            return C58729pv.f156485a;
        }
        C58490gz gzVar = new C58490gz(4);
        String[] split = str.split("#", -1);
        int length = split.length;
        if ((length & 1) == 0) {
            for (int i = 0; i < split.length - 1; i += 2) {
                gzVar.mo55429h(split[i], split[i + 1]);
            }
            return gzVar.mo55427f(false);
        }
        ((C58970a) ((C58970a) this.f358902a.mo56225c()).mo56372aa(39098)).mo56387q("Uneven number of entries: %d", length);
        return C58729pv.f156485a;
    }
}
