package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.p9280a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122390ai;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122392ak;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122396ao;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122397ap;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122448cm;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122547c;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9279b.C122548d;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import p5488io.grpc.p5533i.C70862aj;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.b.a.az */
/* compiled from: PG */
public final /* synthetic */ class C122499az implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C122501ba f339587a;

    /* renamed from: b */
    public final /* synthetic */ C122397ap f339588b;

    public /* synthetic */ C122499az(C122501ba baVar, C122397ap apVar) {
        this.f339587a = baVar;
        this.f339588b = apVar;
    }

    public final void run() {
        C122392ak akVar;
        C122390ai aiVar;
        C122390ai aiVar2;
        C122390ai aiVar3;
        C122501ba baVar = this.f339587a;
        C122397ap apVar = this.f339588b;
        int i = apVar.f339332c;
        Map map = baVar.f339595b;
        Integer valueOf = Integer.valueOf(i);
        C122503bc bcVar = (C122503bc) map.get(valueOf);
        if (bcVar == null) {
            C59104x c = C122504bd.f339601a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ODNLUFFSvcCnctnImpl");
            ((C59052c) ((C59052c) c).mo56372aa(34788)).mo56387q("Received response for unknown request: %d", i);
            return;
        }
        if (apVar.f339330a != 2) {
            baVar.f339595b.remove(valueOf);
            C59104x b = C122504bd.f339601a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ODNLUFFSvcCnctnImpl");
            ((C59052c) ((C59052c) b).mo56372aa(34787)).mo56395y("Unregistering request %d due to status %s", i, C122396ao.m201856a(apVar.f339330a));
        }
        C70862aj ajVar = bcVar.f339599a;
        C122396ao aoVar = C122396ao.PART;
        int ordinal = C122396ao.m201856a(apVar.f339330a).ordinal();
        if (ordinal == 0) {
            if (apVar.f339330a == 2) {
                akVar = (C122392ak) apVar.f339331b;
            } else {
                akVar = C122392ak.f339309c;
            }
            ajVar.mo20123c(akVar);
        } else if (ordinal == 1) {
            ajVar.mo20121a();
        } else if (ordinal == 2) {
            if (apVar.f339330a == 4) {
                aiVar = (C122390ai) apVar.f339331b;
            } else {
                aiVar = C122390ai.f339304d;
            }
            String str = aiVar.f339307b;
            int i2 = apVar.f339330a;
            if (i2 == 4) {
                aiVar2 = (C122390ai) apVar.f339331b;
            } else {
                aiVar2 = C122390ai.f339304d;
            }
            String str2 = aiVar2.f339306a;
            if (i2 == 4) {
                aiVar3 = (C122390ai) apVar.f339331b;
            } else {
                aiVar3 = C122390ai.f339304d;
            }
            C122448cm cmVar = aiVar3.f339308c;
            if (cmVar == null) {
                cmVar = C122448cm.f339454i;
            }
            ajVar.mo20122b(new C122547c(str, str2, cmVar));
        } else if (ordinal == 3) {
            ajVar.mo20122b(new C122548d());
        } else if (ordinal == 4) {
            ajVar.mo20122b(new C122547c("PAYLOAD_NOT_SET", "Response payload not set", C122448cm.f339454i));
        }
    }
}
