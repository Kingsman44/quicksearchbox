package com.google.android.apps.gsa.search.shared.actions.modular.arguments;

import android.content.res.Resources;
import android.os.Parcelable;
import com.google.common.base.C58817ah;
import com.google.p4152bb.p4153a.C55133hb;
import com.google.p4152bb.p4153a.C55134hc;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.modular.arguments.b */
/* compiled from: PG */
public final /* synthetic */ class C87438b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ AmbiguousArgument f236215a;

    /* renamed from: b */
    public final /* synthetic */ C55134hc f236216b;

    /* renamed from: c */
    public final /* synthetic */ Resources f236217c;

    public /* synthetic */ C87438b(AmbiguousArgument ambiguousArgument, C55134hc hcVar, Resources resources) {
        this.f236215a = ambiguousArgument;
        this.f236216b = hcVar;
        this.f236217c = resources;
    }

    public final Object apply(Object obj) {
        AmbiguousArgument ambiguousArgument = this.f236215a;
        C55134hc hcVar = this.f236216b;
        Resources resources = this.f236217c;
        Parcelable parcelable = (Parcelable) obj;
        C55133hb a = C55133hb.m87600a(hcVar.f145123c);
        if (a == null) {
            a = C55133hb.NONE;
        }
        return ambiguousArgument.mo81257a(parcelable, a, resources);
    }
}
