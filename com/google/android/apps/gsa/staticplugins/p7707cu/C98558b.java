package com.google.android.apps.gsa.staticplugins.p7707cu;

import com.google.android.apps.gsa.search.shared.service.p6935b.C88197st;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88200sw;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7159c.C90882ap;
import com.google.common.p4526f.C59052c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.cu.b */
/* compiled from: PG */
final class C98558b extends C90882ap {
    public C98558b() {
        super("transform reauth response to eventData", 0);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C89057m mVar = (C89057m) obj;
        C88197st stVar = (C88197st) C88200sw.f238418c.createBuilder();
        try {
            int i = mVar.mo82999g().f241279a;
            if (mVar.mo82999g().mo83003e()) {
                if (new JSONObject(mVar.mo83035e()).getString("encodedRapt").isEmpty()) {
                    ((C59052c) ((C59052c) C98559c.f275275a.mo56225c()).mo56372aa(30871)).mo56386p("Got empty reauthProofToken from Reauth endpoint.");
                    stVar.copyOnWrite();
                    C88200sw swVar = (C88200sw) stVar.instance;
                    swVar.f238421b = 4;
                    swVar.f238420a |= 1;
                } else {
                    stVar.copyOnWrite();
                    C88200sw swVar2 = (C88200sw) stVar.instance;
                    swVar2.f238421b = 1;
                    swVar2.f238420a |= 1;
                }
            } else if (i == 400) {
                stVar.copyOnWrite();
                C88200sw swVar3 = (C88200sw) stVar.instance;
                swVar3.f238421b = 2;
                swVar3.f238420a |= 1;
            } else {
                ((C59052c) ((C59052c) C98559c.f275275a.mo56225c()).mo56372aa(30868)).mo56387q("Error verifying credentials, response: %d", i);
                stVar.copyOnWrite();
                C88200sw swVar4 = (C88200sw) stVar.instance;
                swVar4.f238421b = 4;
                swVar4.f238420a |= 1;
            }
        } catch (C89013ak | C90457d e) {
            ((C59052c) ((C59052c) C98559c.f275275a.mo56225c()).mo56372aa(30869)).mo56395y("Malformed response. Error code: %d, Message: %s", e.mo79843a(), e.getMessage());
            stVar.copyOnWrite();
            C88200sw swVar5 = (C88200sw) stVar.instance;
            swVar5.f238421b = 3;
            swVar5.f238420a |= 1;
        } catch (JSONException e2) {
            ((C59052c) ((C59052c) C98559c.f275275a.mo56225c()).mo56372aa(30870)).mo56389s("Malformed json response, Message: %s", e2.getMessage());
            stVar.copyOnWrite();
            C88200sw swVar6 = (C88200sw) stVar.instance;
            swVar6.f238421b = 4;
            swVar6.f238420a |= 1;
        }
        return (C88200sw) stVar.build();
    }
}
