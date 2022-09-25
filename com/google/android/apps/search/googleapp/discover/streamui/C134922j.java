package com.google.android.apps.search.googleapp.discover.streamui;

import android.os.Bundle;
import androidx.savedstate.C4087c;
import com.google.android.apps.search.googleapp.discover.p10181d.C134228q;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.j */
/* compiled from: PG */
final class C134922j implements C4087c {

    /* renamed from: a */
    final /* synthetic */ RecoverableErrorIntentHandler f367358a;

    public C134922j(RecoverableErrorIntentHandler recoverableErrorIntentHandler) {
        this.f367358a = recoverableErrorIntentHandler;
    }

    /* renamed from: a */
    public final Bundle mo530a() {
        Bundle bundle = new Bundle();
        C134228q qVar = this.f367358a.f366800d;
        if (qVar != null) {
            bundle.putString("intent_in_progress_refresh_reason", qVar.name());
        }
        return bundle;
    }
}
