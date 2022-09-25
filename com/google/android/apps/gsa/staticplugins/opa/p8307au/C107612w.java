package com.google.android.apps.gsa.staticplugins.opa.p8307au;

import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123762cb;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123766cf;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123768ch;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123770cj;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;
import java.util.Map;
import p3186j$.util.Collection;
import p3186j$.util.function.Function;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.au.w */
/* compiled from: PG */
public final /* synthetic */ class C107612w implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C107614y f299370a;

    public /* synthetic */ C107612w(C107614y yVar) {
        this.f299370a = yVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C58833ax axVar;
        C58833ax axVar2;
        C107614y yVar = this.f299370a;
        C58833ax axVar3 = (C58833ax) obj;
        ArrayList arrayList = new ArrayList();
        if (axVar3.mo56113h()) {
            Map map = (Map) Collection.EL.stream(((C123770cj) axVar3.mo56107c()).f341901a).collect(Collectors.toMap(C107613x.f299371a, Function.CC.identity()));
            C123768ch chVar = (C123768ch) map.get(C123762cb.AGGREGATE);
            if (chVar == null || chVar.f341897b.isEmpty()) {
                C58976aa aaVar = C58975e.f156826a;
                axVar = C58836b.f156633a;
            } else {
                axVar = C58833ax.m90834k(yVar.mo96069a((C123766cf) chVar.f341897b.get(0), R.string.rich_input_call_top_contact, yVar.f299372a));
            }
            if (axVar.mo56113h()) {
                arrayList.add((C107608s) axVar.mo56107c());
            }
            C123768ch chVar2 = (C123768ch) map.get(C123762cb.AGGREGATE);
            if (chVar2 == null || chVar2.f341897b.isEmpty()) {
                C58976aa aaVar2 = C58975e.f156826a;
                axVar2 = C58836b.f156633a;
            } else {
                axVar2 = C58833ax.m90834k(yVar.mo96069a((C123766cf) chVar2.f341897b.get(0), R.string.rich_input_message_top_contact, yVar.f299373b));
            }
            if (axVar2.mo56113h()) {
                arrayList.add((C107608s) axVar2.mo56107c());
            }
        }
        return arrayList;
    }
}
