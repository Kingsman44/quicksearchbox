package com.google.android.libraries.lens.view.flags;

import android.os.Bundle;
import java.util.AbstractMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.lens.view.flags.i */
/* compiled from: PG */
public final /* synthetic */ class C26251i implements C26256n {

    /* renamed from: a */
    public static final /* synthetic */ C26251i f71387a = new C26251i();

    private /* synthetic */ C26251i() {
    }

    /* renamed from: a */
    public final Map.Entry mo31466a(Bundle bundle, String str) {
        Integer valueOf = Integer.valueOf(Integer.parseInt(str));
        String string = bundle.getString(str);
        string.getClass();
        return new AbstractMap.SimpleEntry(valueOf, string);
    }
}
