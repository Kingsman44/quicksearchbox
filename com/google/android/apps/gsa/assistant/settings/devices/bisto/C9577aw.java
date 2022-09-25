package com.google.android.apps.gsa.assistant.settings.devices.bisto;

import android.content.Intent;
import androidx.preference.C4024t;
import androidx.preference.Preference;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* renamed from: com.google.android.apps.gsa.assistant.settings.devices.bisto.aw */
/* compiled from: PG */
public final /* synthetic */ class C9577aw implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ C9619ck f33179a;

    public /* synthetic */ C9577aw(C9619ck ckVar) {
        this.f33179a = ckVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        C9619ck ckVar = this.f33179a;
        Intent intent = preference.f12749u;
        C91097g f = ckVar.mo17793f();
        String str = preference.f12748t;
        if (intent == null || f == null || str == null) {
            return true;
        }
        f.mo65090b(intent, new C9611cc());
        return true;
    }
}
