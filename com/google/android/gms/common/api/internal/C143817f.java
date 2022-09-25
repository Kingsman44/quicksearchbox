package com.google.android.gms.common.api.internal;

import com.google.android.gms.common.Feature;
import com.google.android.gms.tasks.C146010af;

/* renamed from: com.google.android.gms.common.api.internal.f */
/* compiled from: PG */
public final class C143817f extends C143752b {

    /* renamed from: b */
    public final C143782cc f389874b;

    public C143817f(C143782cc ccVar, C146010af afVar) {
        super(4, afVar);
        this.f389874b = ccVar;
    }

    /* renamed from: a */
    public final boolean mo119122a(C143763bk bkVar) {
        C143792cm cmVar = (C143792cm) bkVar.f389751e.get(this.f389874b);
        return cmVar != null && cmVar.f389825a.f389823c;
    }

    /* renamed from: b */
    public final Feature[] mo119123b(C143763bk bkVar) {
        C143792cm cmVar = (C143792cm) bkVar.f389751e.get(this.f389874b);
        if (cmVar == null) {
            return null;
        }
        return cmVar.f389825a.f389822b;
    }

    /* renamed from: c */
    public final void mo119168c(C143763bk bkVar) {
        C143792cm cmVar = (C143792cm) bkVar.f389751e.remove(this.f389874b);
        if (cmVar != null) {
            cmVar.f389826b.mo119254a(bkVar.f389748b, this.f389721a);
            C143784ce ceVar = cmVar.f389825a.f389821a;
            ceVar.f389805a = null;
            ceVar.f389806b = null;
            return;
        }
        this.f389721a.f394698a.mo122510x(false);
    }

    /* renamed from: g */
    public final /* bridge */ /* synthetic */ void mo119172g(C143729ad adVar, boolean z) {
    }
}
