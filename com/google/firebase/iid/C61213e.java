package com.google.firebase.iid;

import com.google.android.gms.tasks.C146005aa;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;

/* renamed from: com.google.firebase.iid.e */
/* compiled from: PG */
public final /* synthetic */ class C61213e implements C146005aa {

    /* renamed from: a */
    public final /* synthetic */ FirebaseInstanceId f165588a;

    /* renamed from: b */
    public final /* synthetic */ String f165589b;

    /* renamed from: c */
    public final /* synthetic */ String f165590c;

    public /* synthetic */ C61213e(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f165588a = firebaseInstanceId;
        this.f165589b = str;
        this.f165590c = str2;
    }

    /* renamed from: a */
    public final C146006ab mo37394a(Object obj) {
        FirebaseInstanceId firebaseInstanceId = this.f165588a;
        String str = (String) obj;
        FirebaseInstanceId.f165566a.mo57797c(firebaseInstanceId.mo57778d(), this.f165589b, this.f165590c, str, firebaseInstanceId.f165572e.mo57791c());
        return C146021aq.m237850d(new C61219k(str));
    }
}
