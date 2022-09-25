package com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch;

import com.google.protobuf.C62957cd;
import com.google.protobuf.C62959cf;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.plugins.onesearch.at */
/* compiled from: PG */
public enum C138185at implements C62957cd {
    NONE(0),
    DELETE(1),
    REPORT(2),
    LEARN_MORE(3);
    

    /* renamed from: e */
    public final int f375980e;

    private C138185at(int i) {
        this.f375980e = i;
    }

    /* renamed from: a */
    public static C138185at m224562a(int i) {
        if (i == 0) {
            return NONE;
        }
        if (i == 1) {
            return DELETE;
        }
        if (i == 2) {
            return REPORT;
        }
        if (i != 3) {
            return null;
        }
        return LEARN_MORE;
    }

    /* renamed from: b */
    public static C62959cf m224563b() {
        return C138184as.f375974a;
    }

    public final int getNumber() {
        return this.f375980e;
    }

    public final String toString() {
        return Integer.toString(this.f375980e);
    }
}
