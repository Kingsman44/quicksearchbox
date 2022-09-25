package com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a.p10293a;

import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a.C135799b;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a.C135800c;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a.C135801d;
import com.google.android.apps.search.googleapp.googleappbrowser.feature.p10291g.p10292a.C135802e;
import com.google.android.libraries.appactions.serviceengine.api.C147874g;
import com.google.android.libraries.search.p2871b.p2895i.C37259h;
import com.google.android.libraries.web.p3343a.C43220a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.feature.g.a.a.k */
/* compiled from: PG */
public final class C135798k {

    /* renamed from: a */
    public static final C59071e f369889a = C59071e.m91332i("com.google.android.apps.search.googleapp.googleappbrowser.feature.g.a.a.k");

    /* renamed from: f */
    private static final Pattern f369890f = Pattern.compile("https??://schema.org/??");

    /* renamed from: b */
    public final C43220a f369891b;

    /* renamed from: c */
    public final boolean f369892c;

    /* renamed from: d */
    public final C60888db f369893d;

    /* renamed from: e */
    public final C147874g f369894e;

    public C135798k(C43220a aVar, boolean z, C60888db dbVar, C147874g gVar) {
        this.f369891b = aVar;
        this.f369892c = z;
        this.f369893d = dbVar;
        this.f369894e = gVar;
    }

    /* renamed from: a */
    public static C135802e m220342a(String str, JSONObject jSONObject, boolean z) {
        C58485gu guVar;
        C135799b bVar = (C135799b) C135802e.f369899e.createBuilder();
        bVar.copyOnWrite();
        C135802e eVar = (C135802e) bVar.instance;
        str.getClass();
        eVar.f369901a |= 1;
        eVar.f369902b = str;
        bVar.copyOnWrite();
        C135802e eVar2 = (C135802e) bVar.instance;
        eVar2.f369901a |= 2;
        eVar2.f369903c = true;
        if (z) {
            JSONArray jSONArray = jSONObject.getJSONArray("recipeIngredient");
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < jSONArray.length(); i++) {
                C135800c cVar = (C135800c) C135801d.f369895c.createBuilder();
                String string = jSONArray.getString(i);
                cVar.copyOnWrite();
                C135801d dVar = (C135801d) cVar.instance;
                string.getClass();
                dVar.f369897a |= 1;
                dVar.f369898b = string;
                arrayList.add((C135801d) cVar.build());
            }
            guVar = C58485gu.m89842j(arrayList);
        } else {
            guVar = C58485gu.m89845m();
        }
        bVar.copyOnWrite();
        C135802e eVar3 = (C135802e) bVar.instance;
        C62971cq cqVar = eVar3.f369904d;
        if (!cqVar.mo58948c()) {
            eVar3.f369904d = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) guVar, (List) eVar3.f369904d);
        return (C135802e) bVar.build();
    }

    /* renamed from: b */
    public static C135802e m220343b(String str, JSONArray jSONArray, boolean z) {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject jSONObject = jSONArray.getJSONObject(i);
            if (m220344c(jSONObject)) {
                return m220342a(str, jSONObject, z);
            }
        }
        return C135802e.f369899e;
    }

    /* renamed from: c */
    public static boolean m220344c(JSONObject jSONObject) {
        if (jSONObject.has("@context") && jSONObject.has("@type")) {
            String e = m220345e(jSONObject, "@context");
            String e2 = m220345e(jSONObject, "@type");
            if (!f369890f.matcher(e).matches() || !e2.contains("recipe")) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static String m220345e(JSONObject jSONObject, String str) {
        return jSONObject.getString(str).toLowerCase(Locale.getDefault());
    }

    /* renamed from: d */
    public final void mo112562d(C37259h hVar, C62722b bVar) {
        C147874g gVar = this.f369894e;
        if (gVar != null) {
            gVar.mo111400b(hVar, bVar);
        }
    }
}
