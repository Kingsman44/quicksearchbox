package com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122418bj;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122419bk;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122430bv;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122865j;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import org.json.JSONException;
import org.json.JSONObject;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.cx */
/* compiled from: PG */
public final /* synthetic */ class C122790cx implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C122870ea f340132a;

    /* renamed from: b */
    public final /* synthetic */ C122430bv f340133b;

    public /* synthetic */ C122790cx(C122870ea eaVar, C122430bv bvVar) {
        this.f340132a = eaVar;
        this.f340133b = bvVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C122419bk bkVar;
        C122870ea eaVar = this.f340132a;
        C122430bv bvVar = this.f340133b;
        if (bvVar.f339421a == 1) {
            bkVar = (C122419bk) bvVar.f339422b;
        } else {
            bkVar = C122419bk.f339392l;
        }
        C59052c cVar = (C59052c) eaVar.f340302c.mo105764c().mo56372aa(34849);
        String str = "PopRequestParams";
        try {
            JSONObject put = new JSONObject().put("locale", bkVar.f339395b);
            C122418bj a = C122418bj.m201890a(bkVar.f339404k);
            if (a == null) {
                a = C122418bj.UNRECOGNIZED;
            }
            JSONObject put2 = put.put("client", a.name()).put("loggingStreamId", bkVar.f339397d);
            C52091ex exVar = bkVar.f339396c;
            if (exVar == null) {
                exVar = C52091ex.f136710b;
            }
            str = C122865j.m202184a(put2.put("params", C122865j.m202187d(exVar)), str);
        } catch (JSONException unused) {
        }
        cVar.mo56389s("Received fulfillment request PARAMS %s", str);
        if (eaVar.f340312m != null) {
            return C60856cj.m92900i(Status.f186912j.withDescription("Received second Params call."));
        }
        eaVar.f340312m = bkVar;
        eaVar.f340316q = C122854dz.INITIALIZING;
        C60870cx a2 = eaVar.f340304e.mo105754a(bkVar.f339395b);
        C122836dh dhVar = new C122836dh(eaVar, bkVar);
        return C60922j.m93044g(a2, C47810es.m84963c(dhVar), eaVar.f340308i);
    }
}
