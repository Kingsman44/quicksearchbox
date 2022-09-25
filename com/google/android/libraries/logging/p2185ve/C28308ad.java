package com.google.android.libraries.logging.p2185ve;

import android.view.View;
import com.google.android.libraries.logging.p2185ve.p2188c.p2189a.C28317d;
import com.google.android.libraries.logging.p2185ve.p2193e.p2197d.p2198a.C28409a;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.logging.ve.ad */
/* compiled from: PG */
public final /* synthetic */ class C28308ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C28310af f76993a;

    /* renamed from: b */
    public final /* synthetic */ View f76994b;

    public /* synthetic */ C28308ad(C28310af afVar, View view) {
        this.f76993a = afVar;
        this.f76994b = view;
    }

    public final Object apply(Object obj) {
        C28310af afVar = this.f76993a;
        View view = this.f76994b;
        C28439i iVar = (C28439i) obj;
        C28439i a = C28485y.m53234a(view);
        if (a != null) {
            if (!a.mo33888e()) {
                a.mo33887d(iVar);
            } else if (a.mo33889f()) {
                C28317d dVar = afVar.f76996a;
                IllegalStateException illegalStateException = new IllegalStateException("CVE is already impressed and cannot be replaced.");
                C28409a aVar = dVar.f77003b;
                C28409a.m53084a(illegalStateException);
            } else {
                C28317d dVar2 = afVar.f76996a;
                IllegalStateException illegalStateException2 = new IllegalStateException("CVE is already attached and cannot be replaced.");
                C28409a aVar2 = dVar2.f77003b;
                C28409a.m53084a(illegalStateException2);
            }
            return a;
        }
        C28485y.m53236q(view, iVar);
        return iVar;
    }
}
