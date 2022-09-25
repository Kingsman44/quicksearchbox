package com.google.android.apps.gsa.assistant.settings.features.calls;

import android.content.Intent;
import androidx.preference.C4024t;
import androidx.preference.Preference;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.calls.ac */
/* compiled from: PG */
public final /* synthetic */ class C73006ac implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ aq f193646a;

    /* renamed from: b */
    public final /* synthetic */ Intent f193647b;

    public /* synthetic */ C73006ac(aq aqVar, Intent intent) {
        this.f193646a = aqVar;
        this.f193647b = intent;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        aq aqVar = this.f193646a;
        Intent intent = this.f193647b;
        C91097g f = aqVar.mo17793f();
        if (f == null) {
            return true;
        }
        f.mo65089a(intent);
        return true;
    }
}
