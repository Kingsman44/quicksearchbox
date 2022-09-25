package com.google.android.libraries.storage.p3315b;

import com.google.common.base.C58838bb;
import java.util.concurrent.Callable;

/* renamed from: com.google.android.libraries.storage.b.o */
/* compiled from: PG */
final class C42860o implements Callable {

    /* renamed from: a */
    volatile boolean f112157a;

    /* renamed from: b */
    final /* synthetic */ C42844bc f112158b;

    /* renamed from: c */
    final /* synthetic */ C42847bf f112159c;

    /* renamed from: d */
    final /* synthetic */ C42862q f112160d;

    public C42860o(C42862q qVar, C42844bc bcVar, C42847bf bfVar) {
        this.f112160d = qVar;
        this.f112158b = bcVar;
        this.f112159c = bfVar;
    }

    public final Object call() {
        C58838bb.m90884s(!this.f112160d.f112162a.inTransaction(), "Thread is already in a transaction! This should never happen, or this will be treated as a nested transaction.");
        this.f112160d.f112162a.beginTransactionWithListener(new C42859n(this));
        try {
            this.f112157a = true;
            Object a = this.f112158b.mo45922a(this.f112159c);
            C42847bf.m75694g();
            this.f112160d.f112162a.setTransactionSuccessful();
            this.f112157a = false;
            return a;
        } finally {
            this.f112160d.f112162a.endTransaction();
        }
    }
}
