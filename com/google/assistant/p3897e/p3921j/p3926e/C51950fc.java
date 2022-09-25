package com.google.assistant.p3897e.p3921j.p3926e;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.assistant.e.j.e.fc */
/* compiled from: PG */
public enum C51950fc implements C62957cd {
    FORM_UI_THEME_DEFAULT(0),
    FORM_UI_THEME_IRIS_GLANCEABILITY(1);
    

    /* renamed from: c */
    public final int f136309c;

    private C51950fc(int i) {
        this.f136309c = i;
    }

    /* renamed from: a */
    public static C51950fc m86447a(int i) {
        if (i == 0) {
            return FORM_UI_THEME_DEFAULT;
        }
        if (i != 1) {
            return null;
        }
        return FORM_UI_THEME_IRIS_GLANCEABILITY;
    }

    /* renamed from: b */
    public static C62959cf m86448b() {
        return C51949fb.f136305a;
    }

    public final int getNumber() {
        return this.f136309c;
    }

    public final String toString() {
        return Integer.toString(this.f136309c);
    }
}
