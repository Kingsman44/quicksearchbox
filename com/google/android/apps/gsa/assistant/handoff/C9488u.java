package com.google.android.apps.gsa.assistant.handoff;

import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4541l.C59326i;

/* renamed from: com.google.android.apps.gsa.assistant.handoff.u */
/* compiled from: PG */
public final class C9488u {

    /* renamed from: a */
    private final C90021c f32929a;

    public C9488u(C90021c cVar) {
        this.f32929a = cVar;
    }

    /* renamed from: b */
    static C58833ax m24024b(String str) {
        try {
            return C58833ax.m90834k(C59326i.f157517e.mo56836k(str));
        } catch (IllegalArgumentException unused) {
            return C58836b.f156633a;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final int mo17712a() {
        return this.f32929a.mo79746e(C90014bt.f247581jp) ? 0 : 1;
    }
}
