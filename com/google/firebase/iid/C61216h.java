package com.google.firebase.iid;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146036p;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.firebase.iid.h */
/* compiled from: PG */
public final /* synthetic */ class C61216h implements C146036p {

    /* renamed from: a */
    public final /* synthetic */ CountDownLatch f165594a;

    public /* synthetic */ C61216h(CountDownLatch countDownLatch) {
        this.f165594a = countDownLatch;
    }

    /* renamed from: a */
    public final void mo22590a(C146006ab abVar) {
        CountDownLatch countDownLatch = this.f165594a;
        C61228t tVar = FirebaseInstanceId.f165566a;
        countDownLatch.countDown();
    }
}
