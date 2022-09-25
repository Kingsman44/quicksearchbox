package com.google.android.libraries.lens.view.flags;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.flags.h */
/* compiled from: PG */
public final /* synthetic */ class C26250h implements C26256n {

    /* renamed from: a */
    public static final /* synthetic */ C26250h f71386a = new C26250h();

    private /* synthetic */ C26250h() {
    }

    /* renamed from: a */
    public final Map.Entry mo31466a(Bundle bundle, String str) {
        return new AbstractMap.SimpleEntry(Integer.valueOf(Integer.parseInt(str)), Long.valueOf(bundle.getLong(str)));
    }
}
