package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a.p10293a;

import android.webkit.ValueCallback;
import androidx.p104d.p105a.C2164c;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a.C135802e;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.common.p4526f.C59052c;
import com.google.net.p4726a.p4727a.C62722b;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.a.a.i */
/* compiled from: PG */
public final /* synthetic */ class C135796i implements ValueCallback {

    /* renamed from: a */
    public final /* synthetic */ C135798k f369884a;

    /* renamed from: b */
    public final /* synthetic */ C2164c f369885b;

    /* renamed from: c */
    public final /* synthetic */ String f369886c;

    public /* synthetic */ C135796i(C135798k kVar, C2164c cVar, String str) {
        this.f369884a = kVar;
        this.f369885b = cVar;
        this.f369886c = str;
    }

    public final void onReceiveValue(Object obj) {
        C135798k kVar = this.f369884a;
        C2164c cVar = this.f369885b;
        String str = this.f369886c;
        JSONObject jSONObject = (JSONObject) obj;
        boolean z = kVar.f369892c;
        C135802e eVar = C135802e.f369899e;
        try {
            JSONArray optJSONArray = jSONObject.optJSONArray("result");
            if (optJSONArray != null) {
                eVar = C135798k.m220343b(str, optJSONArray, z);
            } else {
                JSONObject jSONObject2 = jSONObject.getJSONObject("result");
                if (jSONObject2.has("@graph")) {
                    eVar = C135798k.m220343b(str, jSONObject2.getJSONArray("@graph"), z);
                } else if (C135798k.m220344c(jSONObject2)) {
                    eVar = C135798k.m220342a(str, jSONObject2, z);
                }
            }
        } catch (JSONException e) {
            ((C59052c) ((C59052c) ((C59052c) C135798k.f369889a.mo56226d()).mo56382g(e)).mo56372aa(40632)).mo56386p("Failed to parse EvaluateJavascriptApi result");
        }
        kVar.mo112562d(C37182a.f98143hD.mo40806d(), Objects.equals(eVar, C135802e.f369899e) ? C62722b.NOT_FOUND : C62722b.OK);
        cVar.mo5437b(eVar);
    }
}
