package com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.p8258b;

import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.C106596h;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8255e.C107017f;
import com.google.android.libraries.assistant.auto.tng.morris.p1072f.p1074b.C14640a;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.e.b.b */
/* compiled from: PG */
public final /* synthetic */ class C106861b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C106863d f297747a;

    /* renamed from: b */
    public final /* synthetic */ C106596h f297748b;

    public /* synthetic */ C106861b(C106863d dVar, C106596h hVar) {
        this.f297747a = dVar;
        this.f297748b = hVar;
    }

    public final Object apply(Object obj) {
        C106863d dVar = this.f297747a;
        C106596h hVar = this.f297748b;
        if (((C14640a) obj) == C14640a.SMARTSPACE) {
            return C107017f.m177727e(dVar.mo95700e(hVar.f297212g));
        }
        ((C58970a) ((C58970a) dVar.f297751a.mo56224b()).mo56372aa(23329)).mo56386p("#generateSuggestions: Smartspace is not the Morris assignee. Return empty suggestion.");
        return C107017f.m177726d().mo95685a();
    }
}
