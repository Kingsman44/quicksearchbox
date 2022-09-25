package com.google.android.libraries.search.assistant.p2716p.p2723c.p2724a.p2725a;

import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.p9278a.C122468w;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122862g;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122863h;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122864i;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.p9289e.C122865j;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123085a;
import com.google.android.apps.search.assistant.platform.ondevice.fulfillment.server.pop.C123166f;
import com.google.android.apps.search.assistant.platform.ondevice.p9257a.p9260c.p9262b.C122117b;
import com.google.android.libraries.assistant.gallium.framework.C18237e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p4152bb.p4153a.C55089fl;
import com.google.p4152bb.p4153a.C55093fp;
import com.google.protobuf.C62963cj;
import com.google.protos.p5127o.p5128a.C65625f;
import com.google.protos.p5127o.p5128a.C65632m;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.search.assistant.p.c.a.a.at */
/* compiled from: PG */
public final /* synthetic */ class C34946at implements C65632m {

    /* renamed from: a */
    public final /* synthetic */ C34947au f92619a;

    /* renamed from: b */
    public final /* synthetic */ C123166f f92620b;

    /* renamed from: c */
    public final /* synthetic */ C122117b f92621c;

    public /* synthetic */ C34946at(C34947au auVar, C123166f fVar, C122117b bVar) {
        this.f92619a = auVar;
        this.f92620b = fVar;
        this.f92621c = bVar;
    }

    /* renamed from: b */
    public final C60870cx mo39645b(C18237e eVar, C65625f fVar) {
        JSONObject jSONObject;
        C55093fp fpVar;
        C34947au auVar = this.f92619a;
        C123166f fVar2 = this.f92620b;
        C122117b bVar = this.f92621c;
        C59052c cVar = (C59052c) ((C123085a) fVar2).f340676b.mo105764c().mo56372aa(51212);
        String str = "ContactLookupRequest";
        try {
            if (fVar.f178335b == 5) {
                jSONObject = new JSONObject().put("is_top", true);
            } else {
                JSONObject jSONObject2 = new JSONObject();
                if (fVar.f178335b == 1) {
                    fpVar = (C55093fp) fVar.f178336c;
                } else {
                    fpVar = C55093fp.f144965l;
                }
                C55089fl flVar = fpVar.f144970d;
                if (flVar == null) {
                    flVar = C55089fl.f144954j;
                }
                JSONArray jSONArray = new JSONArray();
                Collection.EL.forEach(flVar.f144957b, new C122862g(jSONArray));
                JSONArray jSONArray2 = new JSONArray();
                Collection.EL.forEach(flVar.f144958c, new C122863h(jSONArray2));
                JSONArray jSONArray3 = new JSONArray();
                Collection.EL.forEach(new C62963cj(flVar.f144960e, C55089fl.f144953f), new C122864i(jSONArray3));
                jSONObject = jSONObject2.put("query", new JSONObject().put("names", jSONArray).put("verbose", jSONArray2).put("methods", jSONArray3));
            }
            str = C122865j.m202184a(jSONObject, str);
        } catch (JSONException unused) {
        }
        cVar.mo56389s("Contact request %s", str);
        if (auVar.f92622a) {
            C60870cx b = auVar.f92623b.mo39645b(eVar, fVar);
            C34944ar arVar = new C34944ar(fVar2);
            return C60922j.m93044g(b, C47810es.m84963c(arVar), C60826bg.f164896a);
        }
        C60870cx a = bVar.mo105538a(C122468w.f339525a, fVar);
        C34945as asVar = new C34945as(fVar2);
        return C60922j.m93044g(a, C47810es.m84963c(asVar), C60826bg.f164896a);
    }
}
