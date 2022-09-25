package com.google.android.libraries.assistant.auto.jumpboost.gearhead.p673a.p674a;

import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p882c.p884b.C13054p;
import com.google.android.libraries.assistant.auto.tng.p1101o.p1102a.C15479e;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.base.C58817ah;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.a.a.ab */
/* compiled from: PG */
final class C11480ab implements C58817ah {

    /* renamed from: a */
    final /* synthetic */ C11485ag f37285a;

    public C11480ab(C11485ag agVar) {
        this.f37285a = agVar;
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        Throwable th = (Throwable) obj;
        C69664n.m101061g(th, "throwable");
        this.f37285a.f37311e.mo20154g(C13054p.IDLE);
        this.f37285a.f37311e.mo20152e(false);
        this.f37285a.f37309c.mo22352b(C37179a.f97616dc.mo40815i(C15479e.m32211a(th)));
        C46459k.m82829b(this.f37285a.f37313g.mo20024a(), "Error ending assistant session", new Object[0]);
        throw th;
    }
}
