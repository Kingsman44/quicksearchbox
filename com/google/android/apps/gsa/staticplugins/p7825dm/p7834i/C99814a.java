package com.google.android.apps.gsa.staticplugins.p7825dm.p7834i;

import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.p6500ac.C84410n;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.core.p6500ac.C84412p;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.apps.gsa.staticplugins.webview.C118119ai;
import com.google.android.apps.gsa.staticplugins.webview.C118145bh;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.i.a */
/* compiled from: PG */
public final class C99814a {

    /* renamed from: a */
    private static final C59071e f279235a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.dm.i.a");

    /* renamed from: b */
    private final C89688a f279236b;

    /* renamed from: c */
    private final C84411o f279237c;

    /* renamed from: d */
    private final C118145bh f279238d;

    public C99814a(C89688a aVar, C118145bh bhVar, C84411o oVar) {
        this.f279236b = aVar;
        this.f279238d = bhVar;
        this.f279237c = oVar;
    }

    @JavascriptInterface
    public void getDynamicRequestHttpHeaders(String str, String str2) {
        C58495hd hdVar;
        C84410n a = this.f279237c.mo77963a(str, str2, this.f279236b);
        C118119ai aiVar = this.f279238d.f327909a;
        synchronized (aiVar.f327800S) {
            C87504b bVar = aiVar.f327802U;
            if (bVar != null) {
                hdVar = bVar.f236337b.mo81502a();
            } else {
                hdVar = null;
            }
        }
        if (hdVar == null) {
            C59104x c = f279235a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SilkInitializationApi");
            ((C59052c) ((C59052c) c).mo56372aa(32897)).mo56386p("No headers returned");
            a.mo77960b(C84412p.m134717c(C84412p.f229679a));
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (Map.Entry entry : hdVar.entrySet()) {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            }
            a.mo77962d(jSONObject.toString());
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }
}
