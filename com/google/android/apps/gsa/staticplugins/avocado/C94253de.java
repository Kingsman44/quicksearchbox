package com.google.android.apps.gsa.staticplugins.avocado;

import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.base.C58839bc;
import com.google.common.p4526f.C59052c;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.de */
/* compiled from: PG */
final class C94253de implements C58839bc {

    /* renamed from: a */
    final /* synthetic */ C83917d f263374a;

    /* renamed from: b */
    final /* synthetic */ C94256dh f263375b;

    public C94253de(C94256dh dhVar, C83917d dVar) {
        this.f263375b = dhVar;
        this.f263374a = dVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo5941a(Object obj) {
        C89057m mVar = (C89057m) obj;
        ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14360)).mo56386p("#shouldStillRetryToVerifyAccountLinked");
        boolean z = true;
        if (mVar == null) {
            ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56372aa(14363)).mo56386p("httpResponse is null. Will retry ");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(mVar.mo83035e());
                if (jSONObject.has("ready") && jSONObject.getBoolean("ready")) {
                    z = false;
                }
            } catch (C89013ak | C90457d | JSONException e) {
                ((C59052c) ((C59052c) ((C59052c) C94256dh.f263378a.mo56225c()).mo56382g(e)).mo56372aa(14362)).mo56386p("Exception when parsing response for verify account linked. Will retry.");
            }
        }
        ((C59052c) ((C59052c) C94256dh.f263378a.mo56224b()).mo56372aa(14290)).mo56389s("Predicate should retry is %b", Boolean.valueOf(z));
        this.f263375b.f263407v.put(this.f263374a.f228555b, Boolean.valueOf(!z));
        return z;
    }
}
