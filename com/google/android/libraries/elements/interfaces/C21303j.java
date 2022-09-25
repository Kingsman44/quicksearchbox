package com.google.android.libraries.elements.interfaces;

import com.facebook.litho.C6381hf;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.elements.interfaces.j */
/* compiled from: PG */
public final /* synthetic */ class C21303j {
    /* renamed from: a */
    public static Map m40229a(C21305l lVar, C6381hf hfVar) {
        C21251au auVar;
        HashMap hashMap = null;
        if (lVar.mo26263b() && (auVar = (C21251au) hfVar.mo13397c(C21251au.class)) != null) {
            hashMap = new HashMap();
            String str = auVar.f59570a;
            if (str != null) {
                hashMap.put("CellLogId", str);
            }
            String str2 = auVar.f59572c;
            if (str2 != null) {
                hashMap.put("CELL_NODE_ID", str2);
            }
        }
        return hashMap;
    }
}
