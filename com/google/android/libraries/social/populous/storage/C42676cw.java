package com.google.android.libraries.social.populous.storage;

import com.google.common.base.C58890d;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.libraries.social.populous.storage.cw */
/* compiled from: PG */
public final class C42676cw {
    /* renamed from: a */
    public static String m75373a(C58485gu guVar) {
        StringBuilder sb = new StringBuilder();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            String str = (String) guVar.get(i);
            if (sb.length() > 0) {
                sb.append(" ");
            }
            sb.append(C58890d.m90988c(str));
            sb.append("*");
        }
        return sb.toString();
    }
}
