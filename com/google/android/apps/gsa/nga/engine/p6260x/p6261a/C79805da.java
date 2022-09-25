package com.google.android.apps.gsa.nga.engine.p6260x.p6261a;

import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.apps.gsa.nga.engine.p5964av.C75077bo;
import com.google.android.apps.gsa.nga.engine.p5964av.C75155d;
import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82418el;

/* renamed from: com.google.android.apps.gsa.nga.engine.x.a.da */
/* compiled from: PG */
public final class C79805da implements C75155d {

    /* renamed from: a */
    private final C83305i f218797a;

    public C79805da(C83305i iVar) {
        this.f218797a = iVar;
    }

    /* renamed from: a */
    public final void mo71137a(C75077bo boVar, C75077bo boVar2) {
        String name = boVar2.mo71458b().name();
        if (name != null) {
            String name2 = boVar.mo71458b().name();
            if (name2 != null) {
                String name3 = boVar.mo71460d().name();
                if (name3 != null) {
                    this.f218797a.mo75579d(new C82418el("NGA_RELIABILITY_START", name, name2, name3));
                    return;
                }
                throw new NullPointerException("Null triggerType");
            }
            throw new NullPointerException("Null state");
        }
        throw new NullPointerException("Null previousState");
    }

    /* renamed from: b */
    public final /* synthetic */ void mo71138b(bl blVar) {
    }
}
