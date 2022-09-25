package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.p10513a;

import com.google.android.apps.search.googleapp.stampviewer.p10487a.C139306a;
import com.google.android.apps.search.googleapp.stampviewer.p10487a.C139307b;
import com.google.android.apps.search.googleapp.stampviewer.p10487a.C139308c;
import com.google.android.apps.search.googleapp.stampviewer.p10487a.C139309d;
import com.google.android.apps.search.googleapp.stampviewer.p10487a.C139310e;
import com.google.android.apps.search.googleapp.stampviewer.p10487a.C139312g;
import com.google.android.apps.search.googleapp.stampviewer.p10487a.C139313h;
import com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.C139641a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.d */
/* compiled from: PG */
final class C139645d implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Optional f379617a;

    /* renamed from: b */
    final /* synthetic */ C139646e f379618b;

    public C139645d(C139646e eVar, Optional optional) {
        this.f379618b = eVar;
        this.f379617a = optional;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C59052c) ((C59052c) ((C59052c) C139646e.f379619a.mo56225c()).mo56382g(th)).mo56372aa(41395)).mo56386p("Error reading education history");
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Map map = (Map) obj;
        C139313h hVar = this.f379618b.f379620b;
        C46459k.m82829b(hVar.f378899a.mo46039a(new C139312g((Map) Collection.EL.stream(map.entrySet()).filter(C139306a.f378892a).collect(Collectors.toMap(C139307b.f378893a, C139308c.f378894a, C139309d.f378895a, C139310e.f378896a))), hVar.f378900b), "Failed to write education history to storage", new Object[0]);
        try {
            JSONObject jSONObject = new JSONObject();
            JSONArray jSONArray = new JSONArray();
            jSONObject.put("screens", jSONArray);
            for (Map.Entry entry : map.entrySet()) {
                jSONArray.put(new JSONObject().put("screen", entry.getKey()).put("show", entry.getValue()));
            }
            ((C139641a) this.f379617a.get()).mo115136c(jSONObject);
        } catch (JSONException e) {
            ((C59052c) ((C59052c) ((C59052c) C139646e.f379619a.mo56225c()).mo56382g(e)).mo56372aa(41396)).mo56386p("Failed to build response to runtime");
        }
    }
}
