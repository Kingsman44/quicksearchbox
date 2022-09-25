package com.google.android.libraries.assistant.auto.tng.suggestions.p1264l.p1267b.p1269b;

import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.p9338h.C124032d;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16170n;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15777d;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1168a.p1171b.C15783j;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16364bk;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16389y;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1264l.p1267b.C16392a;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3994s.p3995a.C53445od;
import com.google.assistant.p3994s.p3995a.C53446oe;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4535g.C59203do;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p3186j$.nio.charset.StandardCharsets;
import p3186j$.util.Comparator;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.l.b.b.g */
/* compiled from: PG */
public final class C16402g implements C16392a {

    /* renamed from: a */
    private static final C59071e f48265a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.suggestions.l.b.b.g");

    /* renamed from: b */
    private final C21370a f48266b;

    /* renamed from: c */
    private final C16398c f48267c;

    /* renamed from: d */
    private final C124032d f48268d;

    /* renamed from: e */
    private final C69464a f48269e;

    public C16402g(C21370a aVar, Context context, C124032d dVar, C69464a aVar2) {
        C58833ax axVar;
        this.f48266b = aVar;
        InputStream openRawResource = context.getResources().openRawResource(R.raw.heuristic_weights);
        try {
            byte[] bArr = new byte[openRawResource.available()];
            openRawResource.read(bArr);
            openRawResource.close();
            axVar = C58833ax.m90834k(new JSONObject(new String(bArr, StandardCharsets.UTF_8)));
        } catch (IOException | JSONException e) {
            C59104x c = f48265a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "SuggestionRanker");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(46710)).mo56386p("Failed to create JSONObject from input stream.");
            axVar = C58836b.f156633a;
        }
        JSONObject jSONObject = (JSONObject) axVar.mo56109e(new JSONObject());
        C58490gz gzVar = new C58490gz(4);
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("preloaded_on_device_weight_contextual_vertical_x_drive_status");
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONArray jSONArray2 = jSONArray.getJSONArray(i);
                for (int i2 = 0; i2 < jSONArray2.length(); i2++) {
                    gzVar.mo55429h(C16398c.m33363g(i, i2), Float.valueOf((float) jSONArray2.getDouble(i2)));
                }
            }
        } catch (JSONException e2) {
            C59104x c2 = C16399d.f48262a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "SuggestionRanker");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(46709)).mo56386p("json exception, return partial sparse matrix.");
        }
        C58495hd f = gzVar.mo55427f(false);
        HashSet hashSet = new HashSet();
        C58800sl lA = f.keySet().iterator();
        while (lA.hasNext()) {
            hashSet.add(Integer.valueOf(((Integer) lA.next()).intValue() / 100));
        }
        float optDouble = (float) jSONObject.optDouble("ctr_weight", C59203do.f157270a);
        float optDouble2 = (float) jSONObject.optDouble("last_shown_weight", C59203do.f157270a);
        float optDouble3 = (float) jSONObject.optDouble("last_shown_limit_ms", C59203do.f157270a);
        C58528ij F = C58528ij.m90006F(hashSet);
        if (F != null) {
            this.f48267c = new C16396a(f, optDouble, optDouble2, optDouble3, F, (float) jSONObject.optDouble("bundle_weight", C59203do.f157270a));
            this.f48268d = dVar;
            this.f48269e = aVar2;
            return;
        }
        throw new NullPointerException("Null verticalSet");
    }

    /* renamed from: a */
    public final List mo22894a(List list, C15777d dVar) {
        float f;
        int i;
        float f2;
        ArrayList arrayList = new ArrayList(list);
        HashMap hashMap = new HashMap();
        C58495hd l = dVar.mo22556l();
        if (l != null) {
            long b = this.f48266b.mo26870b();
            C16396a aVar = (C16396a) this.f48267c;
            C16397b bVar = new C16397b(aVar.f48252b, aVar.f48253c, aVar.f48254d, b, l);
            C15783j jVar = (C15783j) this.f48269e.mo17428b();
            jVar.f47018a = C58833ax.m90833j(dVar);
            float f3 = ((C16396a) this.f48267c).f48256f;
            C16389y a = C16389y.m33345a(((C16364bk) dVar.mo22554j().mo56109e(C16364bk.f48168g)).f48171b);
            if (a == null) {
                a = C16389y.DRIVE_STATUS_UNKNOWN;
            }
            C58485gu k = dVar.mo22555k();
            C16398c cVar = this.f48267c;
            Iterator it = k.iterator();
            float f4 = 1.0f;
            while (true) {
                f = 0.0f;
                if (!it.hasNext()) {
                    break;
                }
                f4 = Math.max(f4, ((Float) ((C16396a) cVar).f48251a.getOrDefault(C16398c.m33363g(((C16170n) it.next()).mo22747b().f48088m, a.f48241f), Float.valueOf(0.0f))).floatValue());
            }
            C16396a aVar2 = (C16396a) this.f48267c;
            C58800sl lA = aVar2.f48255e.iterator();
            int i2 = 0;
            while (true) {
                i = 1;
                if (!lA.hasNext()) {
                    break;
                }
                if (((Float) aVar2.f48251a.getOrDefault(C16398c.m33363g(((Integer) lA.next()).intValue(), a.f48241f), Float.valueOf(0.0f))).floatValue() <= 0.0f) {
                    i = 0;
                }
                i2 += i;
            }
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                C16170n nVar = (C16170n) arrayList.get(i3);
                float floatValue = C16406k.m33374a(nVar, bVar).floatValue();
                C53446oe oeVar = nVar.mo22747b().f48087l;
                if (oeVar == null) {
                    oeVar = C53446oe.f140277b;
                }
                for (C53445od odVar : oeVar.f140279a) {
                    int i4 = size;
                    C16397b bVar2 = bVar;
                    if ((odVar.f140274a & i) != 0) {
                        C124032d dVar2 = this.f48268d;
                        C48952az azVar = odVar.f140275b;
                        if (azVar == null) {
                            azVar = C48952az.f126657c;
                        }
                        if (dVar2.mo106244a(azVar, jVar)) {
                            f = Math.max(f, (float) odVar.f140276c);
                        }
                    }
                    bVar = bVar2;
                    size = i4;
                    i = 1;
                }
                int i5 = size;
                C16397b bVar3 = bVar;
                float f5 = f * f3;
                float floatValue2 = ((Float) ((C16396a) this.f48267c).f48251a.getOrDefault(C16398c.m33363g(nVar.mo22747b().f48088m, a.f48241f), Float.valueOf(0.0f))).floatValue();
                if (floatValue2 <= 0.0f || i2 <= 0) {
                    f2 = 0.0f;
                } else {
                    float f6 = (float) i2;
                    f2 = (((floatValue2 + f6) - f4) % f6) + 1.0f;
                }
                hashMap.put(nVar, Float.valueOf(floatValue + f5 + f2));
                i3++;
                bVar = bVar3;
                size = i5;
                f = 0.0f;
                i = 1;
            }
            C58976aa aaVar = C58975e.f156826a;
            Collections.sort(arrayList, Comparator.CC.comparing(new C16400e(hashMap), C16401f.f48264a));
            return arrayList;
        }
        throw new NullPointerException("Null candidateSuggestionMetricsMap");
    }
}
