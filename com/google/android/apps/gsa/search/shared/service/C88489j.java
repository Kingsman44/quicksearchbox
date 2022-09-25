package com.google.android.apps.gsa.search.shared.service;

import android.os.Parcelable;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87740bv;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.common.base.C58838bb;
import com.google.protobuf.C62917ay;

/* renamed from: com.google.android.apps.gsa.search.shared.service.j */
/* compiled from: PG */
public final class C88489j {

    /* renamed from: a */
    private final C87740bv f239205a;

    /* renamed from: b */
    private Parcelable f239206b;

    /* renamed from: c */
    private boolean f239207c;

    public C88489j(C87739bu buVar) {
        C87740bv bvVar = (C87740bv) C87741bw.f237477c.createBuilder();
        bvVar.copyOnWrite();
        C87741bw bwVar = (C87741bw) bvVar.instance;
        bwVar.f237480b = buVar.f237476dL;
        bwVar.f237479a |= 1;
        this.f239205a = bvVar;
    }

    /* renamed from: a */
    public final ClientEventData mo82013a() {
        return new ClientEventData((C87741bw) this.f239205a.build(), this.f239206b);
    }

    /* renamed from: b */
    public final void mo82014b(C62917ay ayVar, Object obj) {
        C58838bb.m90884s(!this.f239207c, "Only one extension is allowed.");
        this.f239205a.mo58885m(ayVar, obj);
        this.f239207c = true;
    }

    /* renamed from: c */
    public final void mo82015c(Parcelable parcelable) {
        C58838bb.m90884s(this.f239206b == null, "Only one parcelable is allowed.");
        EventData.m142676c(parcelable);
        this.f239206b = parcelable;
    }

    public C88489j(C87741bw bwVar) {
        this.f239205a = (C87740bv) bwVar.toBuilder();
    }
}
