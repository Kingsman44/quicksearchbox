package com.google.firebase.iid;

import com.google.android.gms.tasks.C146042v;
import com.google.firebase.iid.p4614a.C61208a;

/* renamed from: com.google.firebase.iid.g */
/* compiled from: PG */
public final /* synthetic */ class C61215g implements C146042v {

    /* renamed from: a */
    public final /* synthetic */ FirebaseInstanceId f165592a;

    /* renamed from: b */
    public final /* synthetic */ C61227s f165593b;

    public /* synthetic */ C61215g(FirebaseInstanceId firebaseInstanceId, C61227s sVar) {
        this.f165592a = firebaseInstanceId;
        this.f165593b = sVar;
    }

    /* renamed from: e */
    public final void mo18632e(Object obj) {
        FirebaseInstanceId firebaseInstanceId = this.f165592a;
        C61227s sVar = this.f165593b;
        String str = ((C61219k) obj).f165601a;
        if (sVar == null || !str.equals(sVar.f165617b)) {
            for (C61208a a : firebaseInstanceId.f165575h) {
                a.mo57786a();
            }
        }
    }
}
