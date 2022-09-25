package com.google.android.apps.gsa.search.core.p6500ac;

/* renamed from: com.google.android.apps.gsa.search.core.ac.j */
/* compiled from: PG */
public final class C84406j {
    /* renamed from: a */
    public static String m134709a(String str) {
        StringBuilder sb = new StringBuilder();
        for (char valueOf : str.toCharArray()) {
            Character valueOf2 = Character.valueOf(valueOf);
            char charValue = valueOf2.charValue();
            if (charValue == 9) {
                sb.append("\\t");
            } else if (charValue == 10) {
                sb.append("\\n");
            } else if (charValue == '\"') {
                sb.append("\\\"");
            } else if (charValue == '\'') {
                sb.append("\\'");
            } else if (charValue != '\\') {
                sb.append(valueOf2);
            } else {
                sb.append("\\\\");
            }
        }
        return sb.toString();
    }
}
