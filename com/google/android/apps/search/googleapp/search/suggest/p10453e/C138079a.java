package com.google.android.apps.search.googleapp.search.suggest.p10453e;

import android.text.TextUtils;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.common.p4522b.C58597ky;
import com.google.p395al.p417d.p418a.p421b.C8562o;
import com.google.p395al.p417d.p418a.p421b.C8564q;
import com.google.p4017at.p4060h.p4073d.p4074a.C54228aq;
import com.google.p4017at.p4060h.p4073d.p4074a.C54240d;
import java.util.ArrayList;
import java.util.Locale;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.e.a */
/* compiled from: PG */
public final class C138079a {
    /* renamed from: a */
    public static String m224412a(String str, String str2) {
        char c;
        String str3 = str2;
        StringBuilder sb = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        ArrayList c2 = C58597ky.m90212c(str3.split("[\\s\\_\\.\\/\\'\",]"));
        ArrayList c3 = C58597ky.m90212c(str.split("[\\s\\_\\.\\/\\'\",]"));
        int size = c2.size();
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            String str4 = (String) c2.get(i2);
            if (!TextUtils.isEmpty(str4)) {
                if (str3.charAt(i) != str4.charAt(z ? 1 : 0)) {
                    int i3 = i;
                    while (str3.charAt(i3) != str4.charAt(z)) {
                        i3++;
                    }
                    sb2.append(str3, i, i3);
                    i = i3;
                }
                i += str4.length();
                int i4 = -1;
                char c4 = 0;
                for (int i5 = 0; i5 < c3.size(); i5++) {
                    String str5 = (String) c3.get(i5);
                    if (!TextUtils.isEmpty(str5)) {
                        String lowerCase = str4.toLowerCase(Locale.US);
                        String lowerCase2 = str5.toLowerCase(Locale.US);
                        if (lowerCase.equals(lowerCase2)) {
                            c = 2;
                        } else {
                            c = lowerCase.startsWith(lowerCase2) ? (char) 1 : 0;
                        }
                        if (c > c4) {
                            c4 = c;
                            i4 = i5;
                        }
                    }
                }
                if ((c4 == 0) != z2) {
                    m224414c(sb, sb2.toString(), z2);
                    z = false;
                    sb2.setLength(0);
                } else {
                    z = false;
                }
                if (c4 == 2) {
                    sb2.append(str4);
                    c3.remove(i4);
                    z2 = false;
                } else {
                    if (c4 == 1) {
                        int length = ((String) c3.get(i4)).length();
                        sb2.append(str4, z ? 1 : 0, length);
                        m224414c(sb, sb2.toString(), z);
                        sb2.setLength(z);
                        sb2.append(str4, length, str4.length());
                        c3.remove(i4);
                    } else {
                        sb2.append(str4);
                    }
                    z2 = true;
                }
            }
        }
        m224414c(sb, sb2.toString(), z2);
        if (i < str2.length()) {
            m224414c(sb, str3.substring(i), true);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static boolean m224413b(C138030av avVar) {
        C54228aq aqVar = avVar.f375543g;
        if (aqVar == null) {
            aqVar = C54228aq.f142328w;
        }
        C54240d dVar = aqVar.f142340l;
        if (dVar == null) {
            dVar = C54240d.f142409e;
        }
        if ((dVar.f142411a & 1) == 0) {
            C54228aq aqVar2 = avVar.f375543g;
            if (aqVar2 == null) {
                aqVar2 = C54228aq.f142328w;
            }
            C8564q qVar = aqVar2.f142349u;
            if (qVar == null) {
                qVar = C8564q.f29673c;
            }
            if (C8562o.m23275a(qVar.f29675a).equals(C8562o.ANSWERDATA_NOT_SET)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    private static void m224414c(StringBuilder sb, String str, boolean z) {
        if (!str.isEmpty()) {
            if (z) {
                sb.append("<b>");
            }
            sb.append(str);
            if (z) {
                sb.append("</b>");
            }
        }
    }
}
