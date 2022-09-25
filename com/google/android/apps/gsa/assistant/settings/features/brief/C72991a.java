package com.google.android.apps.gsa.assistant.settings.features.brief;

import android.content.Intent;
import androidx.preference.C4024t;
import androidx.preference.Preference;
import com.google.android.apps.gsa.shared.util.p7184t.C91095e;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.brief.a */
/* compiled from: PG */
public final /* synthetic */ class C72991a implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ e f193632a;

    /* renamed from: b */
    public final /* synthetic */ Intent f193633b;

    public /* synthetic */ C72991a(e eVar, Intent intent) {
        this.f193632a = eVar;
        this.f193633b = intent;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        e eVar = this.f193632a;
        Intent intent = this.f193633b;
        C91097g f = eVar.mo17793f();
        if (f == null) {
            return true;
        }
        f.mo65090b(intent, new C91095e());
        return true;
    }
}
