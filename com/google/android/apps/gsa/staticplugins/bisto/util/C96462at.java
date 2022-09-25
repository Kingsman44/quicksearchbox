package com.google.android.apps.gsa.staticplugins.bisto.util;

import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124721s;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.Arrays;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.util.at */
/* compiled from: PG */
public final class C96462at {

    /* renamed from: a */
    private static final C59071e f269859a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.util.at");

    /* renamed from: a */
    public static boolean m159831a(String str, String str2, C124721s sVar) {
        int[] b = m159832b(str, sVar);
        int[] b2 = m159832b(str2, sVar);
        int min = Math.min(b.length, b2.length);
        for (int i = 0; i < min; i++) {
            int i2 = b[i];
            int i3 = b2[i];
            if (i2 > i3) {
                return true;
            }
            if (i2 < i3) {
                return false;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static int[] m159832b(String str, C124721s sVar) {
        int length;
        if (C58837ba.m90859h(str)) {
            return new int[0];
        }
        int indexOf = str.indexOf(45);
        String[] split = (indexOf >= 0 ? str.substring(0, indexOf) : str).split("\\.");
        int length2 = split.length;
        if (length2 == 0) {
            return new int[0];
        }
        int[] iArr = new int[length2];
        int i = 0;
        while (true) {
            length = split.length - 1;
            if (i >= length) {
                break;
            }
            try {
                iArr[i] = Integer.parseInt(split[i]);
                i++;
            } catch (NumberFormatException e) {
                C59104x d = f269859a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "OtaUtils");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(17169)).mo56354G("Not a number: %s - %s", split[i], str);
                return new int[0];
            }
        }
        String str2 = split[length];
        int i2 = 0;
        while (true) {
            if (i2 < str2.length()) {
                if (!Character.isDigit(str2.charAt(i2))) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 == 0) {
            int i3 = length2 - 1;
            if (C124721s.BAYWOLF.equals(sVar)) {
                i3 = Math.min(3, i3);
            }
            return Arrays.copyOfRange(iArr, 0, i3);
        }
        if (i2 > 0) {
            str2 = str2.substring(0, i2);
        }
        try {
            iArr[split.length - 1] = Integer.parseInt(str2);
            return (!C124721s.BAYWOLF.equals(sVar) || length2 <= 3) ? iArr : Arrays.copyOfRange(iArr, 0, 3);
        } catch (NumberFormatException unused) {
            C58976aa aaVar = C58975e.f156826a;
            return new int[0];
        }
    }
}
