package com.google.android.libraries.lens.view.flags;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.flags.c */
/* compiled from: PG */
public final /* synthetic */ class C26245c implements C26256n {

    /* renamed from: a */
    public static final /* synthetic */ C26245c f71381a = new C26245c();

    private /* synthetic */ C26245c() {
    }

    /* renamed from: a */
    public final Map.Entry mo31466a(Bundle bundle, String str) {
        return new AbstractMap.SimpleEntry(Integer.valueOf(Integer.parseInt(str)), Boolean.valueOf(bundle.getBoolean(str)));
    }
}
