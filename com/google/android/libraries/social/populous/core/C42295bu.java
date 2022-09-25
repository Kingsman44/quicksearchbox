package com.google.android.libraries.social.populous.core;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.social.populous.core.bu */
/* compiled from: PG */
public final class C42295bu {

    /* renamed from: a */
    public static final List f110920a = new ArrayList();

    /* renamed from: b */
    public static final C42295bu f110921b = new C42295bu("rankContactsUsingFieldLevelSignals");

    /* renamed from: c */
    public static final C42295bu f110922c = new C42295bu("emptyQueryCache");

    /* renamed from: d */
    public final int f110923d;

    /* renamed from: e */
    public final String f110924e;

    static {
        new C42295bu("firstDummyExperiment");
        new C42295bu("secondDummyExperiment");
        new C42295bu("requestMaskIncludeContainers");
    }

    private C42295bu(String str) {
        List list = f110920a;
        this.f110923d = list.size();
        this.f110924e = str;
        list.add(this);
    }
}
