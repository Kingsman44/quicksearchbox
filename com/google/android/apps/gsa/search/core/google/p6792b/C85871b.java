package com.google.android.apps.gsa.search.core.google.p6792b;

import android.text.Html;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.search.core.google.b.b */
/* compiled from: PG */
public final class C85871b {

    /* renamed from: a */
    public static final C59071e f232182a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.b.b");

    /* renamed from: b */
    public final C21370a f232183b;

    /* renamed from: c */
    public final C85929cw f232184c;

    /* renamed from: d */
    public final C68214a f232185d;

    public C85871b(C21370a aVar, C85929cw cwVar, C68214a aVar2) {
        this.f232183b = aVar;
        this.f232184c = cwVar;
        this.f232185d = aVar2;
    }

    /* renamed from: a */
    public static String m137971a(JSONObject jSONObject, String str, boolean z) {
        try {
            String string = jSONObject.getString(str);
            return z ? m137972b(string) : string;
        } catch (JSONException e) {
            ((C59052c) ((C59052c) ((C59052c) f232182a.mo56226d()).mo56382g(e)).mo56372aa(8011)).mo56386p("Couldn't get string value from extras");
            return null;
        }
    }

    /* renamed from: b */
    public static String m137972b(String str) {
        return Html.fromHtml(str, 0).toString();
    }
}
