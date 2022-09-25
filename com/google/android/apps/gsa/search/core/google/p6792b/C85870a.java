package com.google.android.apps.gsa.search.core.google.p6792b;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.C85974dt;
import com.google.android.apps.gsa.search.core.p6501ad.C84414a;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p10983ae.p10984a.C147476u;
import com.google.android.libraries.searchbox.shared.suggestion.Suggestion;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.gsa.search.core.google.b.a */
/* compiled from: PG */
public final class C85870a implements C85974dt {

    /* renamed from: a */
    private static final C59071e f232179a = C59071e.m91332i("com.google.android.apps.gsa.search.core.google.b.a");

    /* renamed from: b */
    private final C85876g f232180b;

    /* renamed from: c */
    private final C85871b f232181c;

    public C85870a(C85876g gVar, C85871b bVar) {
        this.f232180b = gVar;
        this.f232181c = bVar;
    }

    /* renamed from: a */
    public final String mo79504a() {
        return "complete-server";
    }

    /* renamed from: b */
    public final C84414a mo79505b(String str) {
        JSONArray optJSONArray;
        String str2;
        Uri uri;
        Query aE = Query.f252741b.mo84268aE(str, false);
        if (TextUtils.isEmpty(str)) {
            return new C84414a("complete-server", aE);
        }
        if (this.f232180b.mo79509c(aE, false) != null) {
            try {
                if (!TextUtils.isEmpty((CharSequence) null)) {
                    C85871b bVar = this.f232181c;
                    JSONArray jSONArray = new JSONArray((String) null);
                    String string = jSONArray.getString(0);
                    ArrayList arrayList = new ArrayList();
                    int i = 1;
                    JSONArray jSONArray2 = jSONArray.getJSONArray(1);
                    int i2 = 0;
                    while (i2 < jSONArray2.length()) {
                        try {
                            JSONArray jSONArray3 = jSONArray2.getJSONArray(i2);
                            int optInt = jSONArray3.optInt(i, -1);
                            JSONArray optJSONArray2 = jSONArray3.optJSONArray(2);
                            ArrayList arrayList2 = new ArrayList();
                            int i3 = 0;
                            while (optJSONArray2 != null && i3 < optJSONArray2.length()) {
                                arrayList2.add(Integer.valueOf(optJSONArray2.getInt(i3)));
                                i3++;
                            }
                            if (optInt == -1) {
                                ((C59052c) ((C59052c) C85871b.f232182a.mo56226d()).mo56372aa(8013)).mo56386p("Suggestion missing type. Defaulting to query suggestion.");
                                optInt = 0;
                            }
                            JSONObject jSONObject = jSONArray3.length() > 3 ? jSONArray3.getJSONObject(3) : null;
                            if (optInt == 0) {
                                String b = C85871b.m137972b(jSONArray3.getString(0));
                                Bundle bundle = new Bundle();
                                bundle.putString("query", b);
                                bundle.putString("intentAction", "android.intent.action.WEB_SEARCH");
                                arrayList.add(new Suggestion(b, 0, arrayList2, bundle));
                            } else if (optInt == 5) {
                                String b2 = C85871b.m137972b(jSONArray3.getString(0));
                                if (jSONObject != null) {
                                    String a = C85871b.m137971a(jSONObject, "b", true);
                                    String a2 = C85871b.m137971a(jSONObject, "a", false);
                                    C85929cw cwVar = bVar.f232184c;
                                    String str3 = a;
                                    String c = cwVar.f232329e.mo79764c(R.string.clicked_result_url_path);
                                    String j = cwVar.f232332h.mo83212j();
                                    String i4 = cwVar.f232332h.mo83211i();
                                    if (a2 != null) {
                                        if (a2.startsWith(c)) {
                                            uri = Uri.parse(j + "://" + i4 + a2);
                                        } else if (a2.startsWith("http")) {
                                            uri = Uri.parse(a2);
                                        }
                                        str2 = str3;
                                    }
                                    uri = null;
                                    str2 = str3;
                                } else {
                                    uri = null;
                                    str2 = null;
                                }
                                if (uri == null) {
                                    uri = Uri.parse(URLUtil.guessUrl(b2));
                                }
                                if (str2 == null) {
                                    str2 = b2;
                                }
                                Bundle bundle2 = new Bundle();
                                bundle2.putString("query", uri.toString());
                                bundle2.putString("text2Url", b2);
                                bundle2.putString("intentAction", "android.intent.action.VIEW");
                                bundle2.putString("intentData", uri.toString());
                                arrayList.add(new Suggestion(str2, 5, arrayList2, bundle2));
                            } else {
                                ((C59052c) ((C59052c) C85871b.f232182a.mo56226d()).mo56372aa(8012)).mo56395y("Unknown suggestion type %d: %s", optInt, jSONArray3);
                            }
                        } catch (JSONException e) {
                            ((C59052c) ((C59052c) ((C59052c) C85871b.f232182a.mo56226d()).mo56382g(e)).mo56372aa(8014)).mo56395y("Could not parse suggestion at position %d: %s", i2, jSONArray2);
                        }
                        i2++;
                        i = 1;
                    }
                    C84414a aVar = new C84414a(aE.mo84268aE(string, false), (List) arrayList);
                    JSONObject optJSONObject = jSONArray.optJSONObject(2);
                    if (!(optJSONObject == null || (optJSONArray = optJSONObject.optJSONArray(C147476u.f398081a)) == null)) {
                        int[] iArr = new int[optJSONArray.length()];
                        for (int i5 = 0; i5 < optJSONArray.length(); i5++) {
                            iArr[i5] = optJSONArray.optInt(i5);
                        }
                        C86337q b3 = ((C86338r) bVar.f232185d.mo27525b()).mo80076b();
                        b3.mo80071f("server_experiment_ids", iArr);
                        b3.mo80072g("server_experiment_ids_timestamp", bVar.f232183b.mo26870b());
                        b3.apply();
                    }
                    return aVar;
                }
            } catch (JSONException e2) {
                ((C59052c) ((C59052c) ((C59052c) f232179a.mo56226d()).mo56382g(e2)).mo56372aa(8009)).mo56389s("Error parsing suggestions '%s'", (Object) null);
            }
        }
        return new C84414a("complete-server", aE);
    }
}
