package com.google.android.libraries.assistant.auto.tng.media.p1040a.p1046d;

import com.google.android.libraries.assistant.auto.tng.media.p1040a.p1049f.C13976a;
import com.google.assistant.p3897e.p3921j.C52161hm;
import com.google.assistant.p3897e.p3921j.C52162hn;
import com.google.assistant.p3897e.p3921j.C52163ho;
import com.google.assistant.p3897e.p3921j.C52176ia;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.auto.tng.media.a.d.ad */
/* compiled from: PG */
public final /* synthetic */ class C13938ad implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C13946al f42424a;

    /* renamed from: b */
    public final /* synthetic */ C52176ia f42425b;

    /* renamed from: c */
    public final /* synthetic */ boolean f42426c;

    public /* synthetic */ C13938ad(C13946al alVar, C52176ia iaVar, boolean z) {
        this.f42424a = alVar;
        this.f42425b = iaVar;
        this.f42426c = z;
    }

    public final Object apply(Object obj) {
        C13946al alVar = this.f42424a;
        C52176ia iaVar = this.f42425b;
        boolean z = this.f42426c;
        Void voidR = (Void) obj;
        alVar.mo21370f(iaVar);
        Optional empty = Optional.empty();
        C52162hn hnVar = (C52162hn) C52163ho.f136875d.createBuilder();
        hnVar.copyOnWrite();
        C52163ho hoVar = (C52163ho) hnVar.instance;
        hoVar.f136877a |= 2;
        hoVar.f136879c = z;
        C52161hm hmVar = C52161hm.PLAY_FROM_SEARCH;
        hnVar.copyOnWrite();
        C52163ho hoVar2 = (C52163ho) hnVar.instance;
        hoVar2.f136878b = hmVar.f136874g;
        hoVar2.f136877a |= 1;
        return C13976a.m30268c(empty, Optional.m71637of((C52163ho) hnVar.build()), Optional.empty(), Optional.empty(), alVar.f42450e);
    }
}
