package com.google.android.libraries.abuse.reporting;

import com.google.p335a.p336a.C6579a;
import com.google.p335a.p336a.C6580b;
import com.google.p335a.p336a.C6593o;
import com.google.p335a.p336a.C6594p;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.google.android.libraries.abuse.reporting.at */
/* compiled from: PG */
final class C146731at {
    /* renamed from: a */
    static List m239086a(JSONArray jSONArray) {
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    C6593o oVar = (C6593o) C6594p.f19600j.createBuilder();
                    String optString = optJSONObject.optString("optionName");
                    if (!optString.isEmpty()) {
                        oVar.copyOnWrite();
                        C6594p pVar = (C6594p) oVar.instance;
                        optString.getClass();
                        pVar.f19602a |= 8;
                        pVar.f19608g = optString;
                    }
                    String optString2 = optJSONObject.optString("optionText");
                    if (!optString2.isEmpty()) {
                        oVar.copyOnWrite();
                        C6594p pVar2 = (C6594p) oVar.instance;
                        optString2.getClass();
                        pVar2.f19602a |= 16;
                        pVar2.f19609h = optString2;
                    }
                    if (optJSONObject.has("noReport")) {
                        boolean optBoolean = optJSONObject.optBoolean("noReport");
                        oVar.copyOnWrite();
                        C6594p pVar3 = (C6594p) oVar.instance;
                        pVar3.f19602a |= 4;
                        pVar3.f19606e = optBoolean;
                    }
                    String optString3 = optJSONObject.optString("headerText");
                    if (!optString3.isEmpty()) {
                        oVar.copyOnWrite();
                        C6594p pVar4 = (C6594p) oVar.instance;
                        optString3.getClass();
                        pVar4.f19602a |= 32;
                        pVar4.f19610i = optString3;
                    }
                    JSONArray optJSONArray = optJSONObject.optJSONArray("additionalActions");
                    if (optJSONArray != null) {
                        for (int i2 = 0; i2 < optJSONArray.length(); i2++) {
                            String optString4 = optJSONArray.optString(i2);
                            if (!optString4.isEmpty()) {
                                oVar.copyOnWrite();
                                C6594p pVar5 = (C6594p) oVar.instance;
                                optString4.getClass();
                                C62971cq cqVar = pVar5.f19605d;
                                if (!cqVar.mo58948c()) {
                                    pVar5.f19605d = C62942bv.mutableCopy(cqVar);
                                }
                                pVar5.f19605d.add(optString4);
                            }
                        }
                    }
                    JSONObject optJSONObject2 = optJSONObject.optJSONObject("abuseType");
                    if (optJSONObject2 != null) {
                        C6579a aVar = (C6579a) C6580b.f19567c.createBuilder();
                        int optInt = optJSONObject2.optInt("idInt");
                        aVar.copyOnWrite();
                        C6580b bVar = (C6580b) aVar.instance;
                        bVar.f19569a |= 1;
                        bVar.f19570b = optInt;
                        oVar.copyOnWrite();
                        C6594p pVar6 = (C6594p) oVar.instance;
                        C6580b bVar2 = (C6580b) aVar.build();
                        bVar2.getClass();
                        pVar6.f19603b = bVar2;
                        pVar6.f19602a |= 1;
                    }
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subtypes");
                    if (optJSONArray2 != null) {
                        List a = m239086a(optJSONArray2);
                        oVar.copyOnWrite();
                        C6594p pVar7 = (C6594p) oVar.instance;
                        C62971cq cqVar2 = pVar7.f19607f;
                        if (!cqVar2.mo58948c()) {
                            pVar7.f19607f = C62942bv.mutableCopy(cqVar2);
                        }
                        C62947c.addAll((Iterable) a, (List) pVar7.f19607f);
                    }
                    String optString5 = optJSONObject.optString("messageName");
                    if (!optString5.isEmpty()) {
                        oVar.copyOnWrite();
                        C6594p pVar8 = (C6594p) oVar.instance;
                        optString5.getClass();
                        pVar8.f19602a |= 2;
                        pVar8.f19604c = optString5;
                    }
                    arrayList.add((C6594p) oVar.build());
                }
            }
        }
        return arrayList;
    }
}
