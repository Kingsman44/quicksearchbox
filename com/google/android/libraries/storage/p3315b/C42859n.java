package com.google.android.libraries.storage.p3315b;

import android.database.sqlite.SQLiteTransactionListener;

/* renamed from: com.google.android.libraries.storage.b.n */
/* compiled from: PG */
final class C42859n implements SQLiteTransactionListener {

    /* renamed from: a */
    final /* synthetic */ C42860o f112156a;

    public C42859n(C42860o oVar) {
        this.f112156a = oVar;
    }

    public final void onBegin() {
    }

    public final void onCommit() {
    }

    public final void onRollback() {
        if (!this.f112156a.f112157a) {
            throw new C42836av();
        }
    }
}
