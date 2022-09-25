package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l.p8564h;

import android.content.Context;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.p7130s.p7133b.C90479a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.h.b */
/* compiled from: PG */
public final class C112600b implements C90991b {

    /* renamed from: a */
    public static final C59071e f312198a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.l.h.b");

    /* renamed from: b */
    public final Context f312199b;

    /* renamed from: c */
    public final Map f312200c = new HashMap();

    /* renamed from: d */
    private final C90479a f312201d;

    /* renamed from: e */
    private final C86124t f312202e;

    public C112600b(Context context, C90479a aVar, C86124t tVar) {
        this.f312199b = context;
        this.f312201d = aVar;
        this.f312202e = tVar;
    }

    /* renamed from: a */
    public final void mo99591a(C80012i iVar) {
        if (mo99592b()) {
            synchronized (this) {
                this.f312200c.put(iVar.f219562b, iVar);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo99592b() {
        return this.f312201d.mo84227b() && this.f312202e.mo79746e(C90063do.f249603ge);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        if (mo99592b()) {
            synchronized (this) {
                fVar.mo85279c("TapasModelRequest").mo85276a(C90752i.m148231e(this.f312200c));
            }
        }
    }
}
