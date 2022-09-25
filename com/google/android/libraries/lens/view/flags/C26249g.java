package com.google.android.libraries.lens.view.flags;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.flags.g */
/* compiled from: PG */
public final /* synthetic */ class C26249g implements C26256n {

    /* renamed from: a */
    public static final /* synthetic */ C26249g f71385a = new C26249g();

    private /* synthetic */ C26249g() {
    }

    /* renamed from: a */
    public final Map.Entry mo31466a(Bundle bundle, String str) {
        return new AbstractMap.SimpleEntry(Integer.valueOf(Integer.parseInt(str)), Double.valueOf(bundle.getDouble(str)));
    }
}
