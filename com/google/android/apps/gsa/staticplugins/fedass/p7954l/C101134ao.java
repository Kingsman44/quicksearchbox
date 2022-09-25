package com.google.android.apps.gsa.staticplugins.fedass.p7954l;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.gsa.i.a.c;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;
import com.google.speech.p5228m.C67278ai;
import com.google.speech.p5228m.C67284ao;
import com.google.speech.p5228m.C67300bd;
import com.google.speech.p5228m.C67302bf;
import com.google.speech.p5228m.C67337cn;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.l.ao */
/* compiled from: PG */
public final /* synthetic */ class C101134ao implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ c f282346a;

    public /* synthetic */ C101134ao(c cVar) {
        this.f282346a = cVar;
    }

    public final Object apply(Object obj) {
        c cVar = this.f282346a;
        C67337cn cnVar = (C67337cn) obj;
        try {
            Bundle bundle = new Bundle();
            StringBuilder sb = new StringBuilder();
            sb.append("Policy Config \nVersion Number: ");
            sb.append(cnVar.f183027b);
            sb.append("\n");
            for (C67284ao aoVar : cnVar.f183028c) {
                sb.append("\nFeature Name: ");
                sb.append(aoVar.f182898a);
                sb.append("\nVersion: ");
                sb.append(aoVar.f182899b);
                sb.append("\nPolicy Set Enabled: ");
                C67302bf bfVar = aoVar.f182900c;
                if (bfVar == null) {
                    bfVar = C67302bf.f182938c;
                }
                sb.append(bfVar.f182940a);
                sb.append("\n");
                C67302bf bfVar2 = aoVar.f182900c;
                if (bfVar2 == null) {
                    bfVar2 = C67302bf.f182938c;
                }
                for (C67300bd bdVar : bfVar2.f182941b) {
                    sb.append("\n\tEvent Type: ");
                    int b = C67278ai.m97449b(bdVar.f182933a);
                    if (b == 0) {
                        b = 1;
                    }
                    sb.append(C67278ai.m97448a(b));
                    sb.append("\n\tTTL Hours: ");
                    sb.append(bdVar.f182934b);
                    sb.append("\n\tRate Limit Max Events: ");
                    sb.append(bdVar.f182935c);
                    sb.append("\n\tRate Limit Hours: ");
                    sb.append(bdVar.f182936d);
                    sb.append("\n");
                }
            }
            bundle.putString("sheldon_policy_config", sb.toString());
            cVar.e(bundle);
            cVar.f(true, "getSheldonPolicyConfig(): success");
            return true;
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C101137ar.f282348a.mo56225c()).mo56382g(e)).mo56372aa(19846)).mo56386p("Callback Failed to return from getSheldonPolicyConfig()");
            return false;
        }
    }
}
