package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p758b.p830c.p831a.p833b.p836c;

import android.app.DirectAction;
import android.os.Bundle;
import com.google.android.libraries.assistant.p1484g.p1490c.p1495b.C18100a;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.b.c.a.b.c.a */
/* compiled from: PG */
public final /* synthetic */ class C12754a implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C12757d f39902a;

    /* renamed from: b */
    public final /* synthetic */ C18100a f39903b;

    public /* synthetic */ C12754a(C12757d dVar, C18100a aVar) {
        this.f39902a = dVar;
        this.f39903b = aVar;
    }

    public final C60870cx apply(Object obj) {
        C12757d dVar = this.f39902a;
        C18100a aVar = this.f39903b;
        Optional findFirst = Collection.EL.stream((C58485gu) obj).filter(new C12756c(aVar.mo23590d())).findFirst();
        if (findFirst.isPresent()) {
            return dVar.f39907a.mo20098c((DirectAction) findFirst.get(), aVar.f51574a);
        }
        return C60856cj.m92900i(new Bundle());
    }
}
