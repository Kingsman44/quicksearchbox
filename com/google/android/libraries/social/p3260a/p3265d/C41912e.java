package com.google.android.libraries.social.p3260a.p3265d;

import java.util.List;

/* renamed from: com.google.android.libraries.social.a.d.e */
/* compiled from: PG */
public final class C41912e {
    /* renamed from: a */
    public static String m73437a(List list) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            if (i > 0) {
                sb.append("->");
            }
            sb.append(((C41908a) list.get(i)).f109313a.f109315a);
        }
        sb.append(" (leaf->root)");
        return sb.toString();
    }
}
