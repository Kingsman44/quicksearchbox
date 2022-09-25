package com.google.android.libraries.assistant.contexttrigger.impl;

import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Intent;
import androidx.core.p094f.C1888a;
import com.google.android.gms.contextmanager.fence.internal.ContextFenceStub;
import com.google.android.libraries.assistant.contexttrigger.C17658d;
import com.google.android.libraries.assistant.contexttrigger.C17693f;
import com.google.android.libraries.assistant.contexttrigger.p1462f.C17707am;
import com.google.android.libraries.p11029ao.p11030a.C147798a;
import com.google.android.libraries.search.p3047m.p3050b.C39226b;
import com.google.android.libraries.search.p3047m.p3054d.C39239a;
import com.google.assistant.p3803ag.p3807b.p3808a.C48900b;
import com.google.assistant.p3803ag.p3807b.p3808a.C48917s;
import com.google.assistant.p3803ag.p3807b.p3808a.C48919u;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4184bj.p4189b.C55893j;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.impl.t */
/* compiled from: PG */
public final /* synthetic */ class C17777t implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C17755af f51039a;

    /* renamed from: b */
    public final /* synthetic */ C55893j f51040b;

    /* renamed from: c */
    public final /* synthetic */ C17693f f51041c;

    public /* synthetic */ C17777t(C17755af afVar, C55893j jVar, C17693f fVar) {
        this.f51039a = afVar;
        this.f51040b = jVar;
        this.f51041c = fVar;
    }

    public final C60870cx apply(Object obj) {
        C17755af afVar = this.f51039a;
        C55893j jVar = this.f51040b;
        C17693f fVar = this.f51041c;
        if (!((C58833ax) obj).mo56113h()) {
            return C60866ct.f164955a;
        }
        ContextFenceStub contextFenceStub = new ContextFenceStub(jVar.toByteArray());
        C17707am amVar = afVar.f50994e;
        Intent intent = new Intent();
        C17658d dVar = amVar.f50906b;
        C48917s sVar = fVar.f50869c;
        if (sVar == null) {
            sVar = C48917s.f126578f;
        }
        C48919u uVar = sVar.f126581b;
        if (uVar == null) {
            uVar = C48919u.f126586g;
        }
        C48900b a = C48900b.m85301a(uVar.f126589b);
        if (a == null) {
            a = C48900b.UNSPECIFIED;
        }
        Intent action = intent.setAction(true != dVar.mo23421a(a) ? "AWARENESS ACTION V1" : "AWARENESS ACTION V2");
        C48917s sVar2 = fVar.f50869c;
        if (sVar2 == null) {
            sVar2 = C48917s.f126578f;
        }
        C48919u uVar2 = sVar2.f126581b;
        if (uVar2 == null) {
            uVar2 = C48919u.f126586g;
        }
        C48900b a2 = C48900b.m85301a(uVar2.f126589b);
        if (a2 == null) {
            a2 = C48900b.UNSPECIFIED;
        }
        if (a2.equals(C48900b.PROACTIVE_API_CLIENT_ACTION)) {
            action.setComponent(new ComponentName(C39239a.m68666a(amVar.f50905a, C39226b.TAG_CLASSIC_ASSISTANT_PROACTIVEAPI), "com.google.android.libraries.assistant.contexttrigger.impl.ContextTriggerBroadcastReceiver_Receiver"));
        } else {
            action.setComponent(new ComponentName(C39239a.m68666a(amVar.f50905a, C39226b.TAG_ASSISTANT_PCP), "com.google.android.libraries.assistant.contexttrigger.impl.ContextTriggerBroadcastReceiver_Receiver"));
        }
        action.addCategory(fVar.f50868b);
        action.putExtra("context_trigger_request", fVar.toByteArray());
        int i = true != C1888a.m5149c() ? 134217728 : 167772160;
        PendingIntent broadcast = PendingIntent.getBroadcast(amVar.f50905a, 0, C147798a.m240896b(action, i, 1), i);
        broadcast.getClass();
        C48917s sVar3 = fVar.f50869c;
        if (sVar3 == null) {
            sVar3 = C48917s.f126578f;
        }
        C48919u uVar3 = sVar3.f126581b;
        if (uVar3 == null) {
            uVar3 = C48919u.f126586g;
        }
        C39226b a3 = C39226b.m68655a(uVar3.f126592e);
        if (a3 == null) {
            a3 = C39226b.TAG_DO_NOT_USE;
        }
        return afVar.f50993d.mo41558a("com.google.android.apps.search.assistant.platform.contexttrigger", fVar.f50868b, contextFenceStub, broadcast, a3);
    }
}
