package com.google.apps.tiktok.account.data.manager;

import android.util.Pair;
import com.google.apps.tiktok.account.data.manager.p3615a.C46222c;
import com.google.common.base.C58817ah;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.apps.tiktok.account.data.manager.r */
/* compiled from: PG */
public final /* synthetic */ class C46310r implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C58817ah f121298a;

    /* renamed from: b */
    public final /* synthetic */ AtomicReference f121299b;

    public /* synthetic */ C46310r(C58817ah ahVar, AtomicReference atomicReference) {
        this.f121298a = ahVar;
        this.f121299b = atomicReference;
    }

    public final Object apply(Object obj) {
        C58817ah ahVar = this.f121298a;
        AtomicReference atomicReference = this.f121299b;
        Pair pair = (Pair) ahVar.apply((C46222c) obj);
        atomicReference.set(pair.first);
        return (C46222c) pair.second;
    }
}
