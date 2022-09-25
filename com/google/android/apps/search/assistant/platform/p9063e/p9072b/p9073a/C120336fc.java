package com.google.android.apps.search.assistant.platform.p9063e.p9072b.p9073a;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119891j;
import com.google.android.apps.search.assistant.platform.p9080f.p9082b.C120511h;
import com.google.android.libraries.search.assistant.p2513e.p2514a.C32567d;
import com.google.android.libraries.search.p2904c.C37611fw;
import com.google.android.libraries.search.p2904c.C37612fx;
import com.google.android.libraries.search.p2904c.p2990z.p2991a.C38289e;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.search.assistant.platform.e.b.a.fc */
/* compiled from: PG */
public final /* synthetic */ class C120336fc implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C120342fi f334794a;

    /* renamed from: b */
    public final /* synthetic */ Consumer f334795b;

    public /* synthetic */ C120336fc(C120342fi fiVar, Consumer consumer) {
        this.f334794a = fiVar;
        this.f334795b = consumer;
    }

    public final C60870cx apply(Object obj) {
        C60870cx cxVar;
        C120342fi fiVar = this.f334794a;
        Consumer consumer = this.f334795b;
        C120511h hVar = (C120511h) obj;
        C38289e eVar = fiVar.f334816k;
        C37611fw fwVar = (C37611fw) C37612fx.f99944d.createBuilder();
        int b = hVar.mo104768a().mo104781b();
        fwVar.copyOnWrite();
        C37612fx fxVar = (C37612fx) fwVar.instance;
        fxVar.f99946a |= 1;
        fxVar.f99947b = b;
        int a = hVar.mo104768a().mo104780a();
        fwVar.copyOnWrite();
        C37612fx fxVar2 = (C37612fx) fwVar.instance;
        fxVar2.f99946a |= 2;
        fxVar2.f99948c = a;
        fiVar.f334815j = eVar.mo41359a((C37612fx) fwVar.build());
        C119891j jVar = C119891j.DEFAULT_AUDIO_ENCODING;
        int ordinal = fiVar.f334811f.ordinal();
        if (ordinal == 0 || ordinal == 1) {
            cxVar = hVar.mo104770c(new C120331ey(fiVar, consumer));
        } else if (ordinal != 2) {
            cxVar = C60856cj.m92899h(new IllegalArgumentException("invalid encoding"));
        } else {
            cxVar = fiVar.f334810e.mo38148a(fiVar.f334814i.mo66631a(new C32567d(hVar.mo104768a().mo104781b(), hVar.mo104768a().mo104780a())), new C120332ez(fiVar, hVar), new C120334fa(fiVar, consumer));
        }
        return C47633f.m84733g(cxVar).mo51515h(new C120337fd(consumer), fiVar.f334808c);
    }
}
