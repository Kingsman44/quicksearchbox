package com.google.android.apps.gsa.p8839t.p8847h;

import com.google.android.libraries.assistant.pcp.p1573k.C18913ab;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60856cj;

/* renamed from: com.google.android.apps.gsa.t.h.ae */
/* compiled from: PG */
public final /* synthetic */ class C118385ae implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C118426bs f328611a;

    /* renamed from: b */
    public final /* synthetic */ C53306j f328612b;

    public /* synthetic */ C118385ae(C118426bs bsVar, C53306j jVar) {
        this.f328611a = bsVar;
        this.f328612b = jVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C118426bs bsVar = this.f328611a;
        C53306j jVar = this.f328612b;
        C58833ax axVar = (C58833ax) obj;
        if (axVar == null || !axVar.mo56113h()) {
            ((C58970a) ((C58970a) bsVar.f328686g.mo56224b()).mo56372aa(6977)).mo56386p("#attachCallbackToUpdateOnDeviceMediaInCache() On device media recommendations NULL or absent.");
            return C60856cj.m92899h(new Throwable("#attachCallbackToUpdateOnDeviceMediaInCache() On device media recommendations NULL or absent."));
        }
        return C118443s.m196634b((C18913ab) axVar.mo56107c(), bsVar.f328697r, 2, bsVar.f328699t, bsVar.f328694o, jVar == C53306j.AMBIENT_ASSISTANT);
    }
}
