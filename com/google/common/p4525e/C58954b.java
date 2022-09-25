package com.google.common.p4525e;

import java.lang.reflect.Array;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.common.e.b */
/* compiled from: PG */
public final class C58954b {

    /* renamed from: b */
    private static final char[][] f156812b = ((char[][]) Array.newInstance(Character.TYPE, new int[]{0, 0}));

    /* renamed from: a */
    public final char[][] f156813a;

    private C58954b(char[][] cArr) {
        this.f156813a = cArr;
    }

    /* renamed from: a */
    public static C58954b m91108a(Map map) {
        char[][] cArr;
        if (map.isEmpty()) {
            cArr = f156812b;
        } else {
            char[][] cArr2 = new char[(((Character) Collections.max(map.keySet())).charValue() + 1)][];
            for (Character ch : map.keySet()) {
                cArr2[ch.charValue()] = ((String) map.get(ch)).toCharArray();
            }
            cArr = cArr2;
        }
        return new C58954b(cArr);
    }
}
