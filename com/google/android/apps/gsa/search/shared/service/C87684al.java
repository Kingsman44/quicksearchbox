package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88245un;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88246uo;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62917ay;

/* renamed from: com.google.android.apps.gsa.search.shared.service.al */
/* compiled from: PG */
public final class C87684al {

    /* renamed from: a */
    private final C88245un f237032a;

    /* renamed from: b */
    private Parcelable f237033b;

    /* renamed from: c */
    private boolean f237034c;

    public C87684al(C88244um umVar) {
        C88245un unVar = (C88245un) C88246uo.f238696c.createBuilder();
        unVar.copyOnWrite();
        C88246uo uoVar = (C88246uo) unVar.instance;
        uoVar.f238699b = umVar.f238695cJ;
        uoVar.f238698a |= 1;
        this.f237032a = unVar;
    }

    /* renamed from: a */
    public final ServiceEventData mo81964a() {
        return new ServiceEventData((C88246uo) this.f237032a.build(), this.f237033b);
    }

    /* renamed from: b */
    public final void mo81965b(C62917ay ayVar, Object obj) {
        C58838bb.m90884s(!this.f237034c, "Only one extension is allowed.");
        this.f237032a.mo58885m(ayVar, obj);
        this.f237034c = true;
    }

    /* renamed from: c */
    public final void mo81966c(Parcelable parcelable) {
        C58838bb.m90884s(this.f237033b == null, "Only one parcelable is allowed.");
        EventData.m142676c(parcelable);
        this.f237033b = parcelable;
    }

    public C87684al(C88246uo uoVar) {
        this.f237032a = (C88245un) uoVar.toBuilder();
    }
}
