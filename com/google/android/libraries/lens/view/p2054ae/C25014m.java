package com.google.android.libraries.lens.view.p2054ae;

import androidx.p104d.p105a.C2164c;
import androidx.p104d.p105a.C2166e;
import com.google.android.libraries.lens.view.p2096f.C25804g;
import com.google.android.libraries.lens.view.p2096f.C25805h;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.p4017at.p4056g.p4057a.p4058a.C54040cu;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.ae.m */
/* compiled from: PG */
public final /* synthetic */ class C25014m implements C2166e {

    /* renamed from: a */
    public final /* synthetic */ C25021t f68211a;

    /* renamed from: b */
    public final /* synthetic */ C54040cu f68212b;

    public /* synthetic */ C25014m(C25021t tVar, C54040cu cuVar) {
        this.f68211a = tVar;
        this.f68212b = cuVar;
    }

    /* renamed from: a */
    public final Object mo3781a(C2164c cVar) {
        C25021t tVar = this.f68211a;
        C54040cu cuVar = this.f68212b;
        Executor executor = tVar.f68225c;
        ((C25804g) executor).f70106a.execute(C47810es.m84977q(new C25805h(C47810es.m84977q(new C25017p(tVar, cuVar, cVar)))));
        return "getTranslation";
    }
}
