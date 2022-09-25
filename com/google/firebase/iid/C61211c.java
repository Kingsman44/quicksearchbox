package com.google.firebase.iid;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.gms.tasks.C146025e;

/* renamed from: com.google.firebase.iid.c */
/* compiled from: PG */
public final /* synthetic */ class C61211c implements C146025e {

    /* renamed from: a */
    public final /* synthetic */ FirebaseInstanceId f165580a;

    /* renamed from: b */
    public final /* synthetic */ String f165581b;

    /* renamed from: c */
    public final /* synthetic */ String f165582c;

    public /* synthetic */ C61211c(FirebaseInstanceId firebaseInstanceId, String str, String str2) {
        this.f165580a = firebaseInstanceId;
        this.f165581b = str;
        this.f165582c = str2;
    }

    /* renamed from: a */
    public final Object mo37294a(C146006ab abVar) {
        FirebaseInstanceId firebaseInstanceId = this.f165580a;
        String str = this.f165581b;
        String str2 = this.f165582c;
        String c = firebaseInstanceId.mo57777c();
        C61227s b = firebaseInstanceId.mo57776b(str, str2);
        if (!firebaseInstanceId.mo57784l(b)) {
            return C146021aq.m237850d(new C61219k(b.f165617b));
        }
        return firebaseInstanceId.f165574g.mo57793a(str, str2, new C61212d(firebaseInstanceId, c, str, str2, b));
    }
}
