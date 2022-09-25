package com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.p10513a;

import com.google.android.apps.search.googleapp.stampviewer.p10487a.C139311f;
import com.google.android.apps.search.googleapp.stampviewer.p10487a.C139313h;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60922j;
import java.util.HashSet;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.e */
/* compiled from: PG */
public final class C139646e implements C139642a {

    /* renamed from: a */
    public static final C59071e f379619a = C59071e.m91332i("com.google.android.apps.search.googleapp.stampviewer.webview.postmessage.a.e");

    /* renamed from: b */
    public final C139313h f379620b;

    public C139646e(C139313h hVar) {
        this.f379620b = hVar;
    }

    /* renamed from: a */
    public final int mo115138a() {
        return R.id.googleapp_stamp_viewer_education_message_handler;
    }

    /* renamed from: b */
    public final String mo115139b() {
        return "canShowScreens";
    }

    /* renamed from: c */
    public final void mo115140c(JSONObject jSONObject, boolean z, Optional optional) {
        if (!z || optional.isEmpty()) {
            ((C59052c) ((C59052c) f379619a.mo56226d()).mo56372aa(41397)).mo56386p("Cannot send response");
            return;
        }
        try {
            HashSet hashSet = new HashSet();
            JSONArray jSONArray = jSONObject.getJSONArray("screens");
            int i = 0;
            while (i < jSONArray.length()) {
                String string = jSONArray.getJSONObject(i).getString("screen");
                if (string.isEmpty()) {
                    throw new IllegalArgumentException("Message payload contains empty screen");
                } else if (!hashSet.contains(string)) {
                    hashSet.add(string);
                    i++;
                } else {
                    throw new IllegalArgumentException("Message payload contains duplicate screens");
                }
            }
            C139313h hVar = this.f379620b;
            C60856cj.m92911t(C60922j.m93044g(hVar.f378899a.mo46042d(), C47810es.m84963c(new C139311f(hashSet)), hVar.f378900b), C47810es.m84974n(new C139645d(this, optional)), C60826bg.f164896a);
        } catch (IllegalArgumentException | JSONException e) {
            ((C59052c) ((C59052c) ((C59052c) f379619a.mo56225c()).mo56382g(e)).mo56372aa(41398)).mo56386p("Error accessing screens from payload");
        }
    }

    /* renamed from: d */
    public final /* synthetic */ boolean mo115141d() {
        return true;
    }
}
