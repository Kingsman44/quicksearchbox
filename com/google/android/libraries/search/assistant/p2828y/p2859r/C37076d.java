package com.google.android.libraries.search.assistant.p2828y.p2859r;

import android.content.Context;
import android.os.BatteryManager;
import com.google.common.p4526f.C59071e;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.y.r.d */
/* compiled from: PG */
public final class C37076d {

    /* renamed from: a */
    public static final C59071e f96571a = C59071e.m91331h();

    /* renamed from: b */
    public final BatteryManager f96572b;

    public C37076d(Context context) {
        C69664n.m101061g(context, "context");
        Object systemService = context.getSystemService("batterymanager");
        C69664n.m101059e(systemService, "null cannot be cast to non-null type android.os.BatteryManager");
        this.f96572b = (BatteryManager) systemService;
    }
}
