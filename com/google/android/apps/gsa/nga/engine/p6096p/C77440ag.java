package com.google.android.apps.gsa.nga.engine.p6096p;

import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82359cg;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82360ch;
import com.google.common.p4526f.p4527a.C58974d;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.nga.engine.p.ag */
/* compiled from: PG */
public final class C77440ag {

    /* renamed from: a */
    public static final C58974d f213467a = C58974d.m91136j();

    /* renamed from: b */
    public final C68214a f213468b;

    /* renamed from: c */
    private final C83305i f213469c;

    public C77440ag(C83305i iVar, C68214a aVar) {
        this.f213469c = iVar;
        this.f213468b = aVar;
    }

    /* renamed from: a */
    public final void mo72571a(String str) {
        this.f213469c.mo75579d(new C82359cg("NGA_GELLER_ASSISTANT_HISTORY_WRITE_COUNT", str));
    }

    /* renamed from: b */
    public final void mo72572b(int i) {
        this.f213469c.mo75579d(new C82360ch("NGA_GELLER_FOOTPRINTS_WRITE_COUNT", i));
    }
}
