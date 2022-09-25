package com.google.android.apps.gsa.staticplugins.opa.tapas.shared;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import androidx.lifecycle.C2332ag;

/* compiled from: PG */
public final class LiveDataResultReceiver extends ResultReceiver {

    /* renamed from: a */
    public final C2332ag f313590a = new C2332ag();

    public LiveDataResultReceiver() {
        super((Handler) null);
    }

    /* access modifiers changed from: protected */
    public final void onReceiveResult(int i, Bundle bundle) {
        this.f313590a.mo5706i(new C113292bq(i));
    }
}
