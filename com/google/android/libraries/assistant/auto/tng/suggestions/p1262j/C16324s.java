package com.google.android.libraries.assistant.auto.tng.suggestions.p1262j;

import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.j.s */
/* compiled from: PG */
public final /* synthetic */ class C16324s implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C16325t f48018a;

    /* renamed from: b */
    public final /* synthetic */ C60870cx f48019b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f48020c;

    public /* synthetic */ C16324s(C16325t tVar, C60870cx cxVar, C60870cx cxVar2) {
        this.f48018a = tVar;
        this.f48019b = cxVar;
        this.f48020c = cxVar2;
    }

    public final Object call() {
        C16325t tVar = this.f48018a;
        C60870cx cxVar = this.f48019b;
        C60870cx cxVar2 = this.f48020c;
        tVar.f48022b.set(Optional.empty());
        boolean booleanValue = ((Boolean) C60856cj.m92909r(cxVar)).booleanValue();
        boolean z = false;
        if (booleanValue && ((Boolean) C60856cj.m92909r(cxVar2)).booleanValue()) {
            z = true;
        }
        return Boolean.valueOf(z);
    }
}
