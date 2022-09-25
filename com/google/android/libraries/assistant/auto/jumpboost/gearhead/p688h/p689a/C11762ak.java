package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p688h.p689a;

import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p5462h.C69685i;
import p5462h.p5463a.C69505av;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.h.a.ak */
/* compiled from: PG */
public final class C11762ak {

    /* renamed from: a */
    public static final Map f37889a = C69505av.m100867i(new C69685i(0, "UNKNOWN"), new C69685i(1, "MEDIA"), new C69685i(2, "NAVIGATION"), new C69685i(3, "OVERVIEW"), new C69685i(4, "PHONE"), new C69685i(5, "OEM"));

    /* renamed from: a */
    public static final void m27432a(JSONObject jSONObject, String str, Object obj) {
        try {
            jSONObject.put(str, obj);
        } catch (JSONException e) {
            throw new AssertionError(e);
        }
    }
}
