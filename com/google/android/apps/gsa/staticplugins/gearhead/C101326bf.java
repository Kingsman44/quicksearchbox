package com.google.android.apps.gsa.staticplugins.gearhead;

import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import dagger.C68214a;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.staticplugins.gearhead.bf */
/* compiled from: PG */
public final class C101326bf {

    /* renamed from: a */
    public static final C58495hd f282797a;

    /* renamed from: b */
    public final C68214a f282798b;

    /* renamed from: c */
    public final JSONArray f282799c;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(0, "UNKNOWN");
        gzVar.mo55429h(1, "MEDIA");
        gzVar.mo55429h(2, "NAVIGATION");
        gzVar.mo55429h(3, "OVERVIEW");
        gzVar.mo55429h(4, "PHONE");
        gzVar.mo55429h(5, "OEM");
        f282797a = gzVar.mo55427f(false);
    }

    public C101326bf(C68214a aVar, C58485gu guVar) {
        this.f282798b = aVar;
        this.f282799c = new JSONArray(guVar);
    }

    /* renamed from: a */
    public static void m167617a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }
}
