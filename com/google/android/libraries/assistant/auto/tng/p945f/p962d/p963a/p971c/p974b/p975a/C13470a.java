package com.google.android.libraries.assistant.auto.tng.p945f.p962d.p963a.p971c.p974b.p975a;

import android.content.IntentFilter;
import com.google.knowledge.cerebra.sense.textclassifier.tclib.TextClassifierLib;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.assistant.auto.tng.f.d.a.c.b.a.a */
/* compiled from: PG */
public final /* synthetic */ class C13470a implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C13480k f41327a;

    public /* synthetic */ C13470a(C13480k kVar) {
        this.f41327a = kVar;
    }

    public final Object call() {
        C13480k kVar = this.f41327a;
        kVar.f41342e.registerReceiver(new C13479j(kVar), new IntentFilter("android.car.projection.extra.ACTION_END_PROJECTION"));
        kVar.f41351n = 2;
        return (TextClassifierLib) kVar.f41349l.mo56107c();
    }
}
