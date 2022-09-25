package com.google.android.apps.gsa.assistant.settings.features.p550ai.p552b;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.assistant.settings.shared.p5792c.C73740a;
import com.google.android.libraries.search.assistant.proactive.C36333n;
import com.google.android.libraries.search.assistant.proactive.C36337r;
import com.google.android.libraries.search.assistant.proactive.C36366t;
import com.google.android.libraries.search.assistant.proactive.C36371y;
import com.google.android.libraries.search.assistant.proactive.p2775g.C36275ad;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ai.b.b */
/* compiled from: PG */
public final class C10092b implements C73740a {

    /* renamed from: a */
    private final C36337r f34374a;

    public C10092b(C36337r rVar) {
        this.f34374a = rVar;
    }

    /* renamed from: a */
    public final String mo18002a() {
        return "notificationOsChannelJavascriptInterface";
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18003b() {
    }

    @JavascriptInterface
    public String getOsDisabledCategoryInfo() {
        C36371y yVar = (C36371y) this.f34374a;
        C60870cx f = ((C36275ad) yVar.f94981c.mo27525b()).mo40081f();
        C36366t tVar = new C36366t(yVar);
        C36333n nVar = (C36333n) C60856cj.m92910s(C60922j.m93044g(f, C47810es.m84963c(tVar), yVar.f94982d));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("appDisabled", nVar.f94884a);
        if (nVar.f94884a) {
            return jSONObject.toString();
        }
        JSONArray jSONArray = new JSONArray();
        for (Integer put : nVar.f94885b) {
            jSONArray.put(put);
        }
        jSONObject.put("disabledGroups", jSONArray);
        JSONArray jSONArray2 = new JSONArray();
        for (Integer put2 : nVar.f94886c) {
            jSONArray2.put(put2);
        }
        jSONObject.put("disabledCategories", jSONArray2);
        return jSONObject.toString();
    }
}
