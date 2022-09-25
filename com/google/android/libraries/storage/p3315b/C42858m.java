package com.google.android.libraries.storage.p3315b;

import android.database.Cursor;
import android.os.CancellationSignal;

/* renamed from: com.google.android.libraries.storage.b.m */
/* compiled from: PG */
final class C42858m extends C42861p {

    /* renamed from: a */
    final /* synthetic */ Object[] f112153a;

    /* renamed from: b */
    final /* synthetic */ String f112154b = "SELECT version FROM version";

    /* renamed from: c */
    final /* synthetic */ C42862q f112155c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C42858m(C42862q qVar, Object[] objArr) {
        super(qVar);
        this.f112155c = qVar;
        this.f112153a = objArr;
    }

    /* renamed from: a */
    public final Cursor mo45908a(CancellationSignal cancellationSignal) {
        this.f112155c.f112165d.mo45898b();
        try {
            return this.f112155c.f112162a.rawQueryWithFactory(new C42843bb(this.f112153a), this.f112154b, (String[]) null, (String) null, cancellationSignal);
        } finally {
            this.f112155c.f112165d.mo45897a();
        }
    }

    /* renamed from: b */
    public final String mo45909b() {
        return this.f112154b;
    }
}
