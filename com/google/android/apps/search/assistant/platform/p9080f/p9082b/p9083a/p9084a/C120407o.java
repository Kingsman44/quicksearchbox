package com.google.android.apps.search.assistant.platform.p9080f.p9082b.p9083a.p9084a;

import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120514k;
import com.google.android.libraries.search.p2904c.C37321a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60930r;
import com.google.protobuf.C63088z;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.f.b.a.a.o */
/* compiled from: PG */
public final /* synthetic */ class C120407o implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C37321a f334915a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f334916b;

    public /* synthetic */ C120407o(C37321a aVar, Consumer consumer) {
        this.f334915a = aVar;
        this.f334916b = consumer;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C37321a aVar = this.f334915a;
        Consumer consumer = this.f334916b;
        byte[] bArr = new byte[320];
        int i = 0;
        while (true) {
            C58976aa aaVar = C58975e.f156826a;
            int a = aVar.mo40879a(bArr, i, 0, 320);
            if (a < 0) {
                return C60866ct.f164955a;
            }
            consumer.accept(new C120514k(C63088z.m96142D(bArr, 0, a)));
            i += a;
        }
    }
}
