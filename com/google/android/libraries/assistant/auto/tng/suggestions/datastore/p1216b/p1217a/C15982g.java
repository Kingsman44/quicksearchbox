package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.p1217a;

import android.content.Context;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.C15975a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.C15986b;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.b.a.g */
/* compiled from: PG */
public final class C15982g implements C15975a {

    /* renamed from: a */
    private final Context f47390a;

    public C15982g(Context context) {
        this.f47390a = context;
    }

    /* renamed from: a */
    public final String mo22642a(C16090ap apVar, C16327aa aaVar, boolean z, int i, String str) {
        C58976aa aaVar2 = C58975e.f156826a;
        if (z) {
            return str;
        }
        C16327aa aaVar3 = C16327aa.UNKNOWN_ACTION_TYPE;
        int ordinal = aaVar.ordinal();
        if (ordinal == 19) {
            return C15986b.m32805a(this.f47390a, R.drawable.morris_ds_readmsgs).toString();
        }
        if (ordinal == 23) {
            return C15986b.m32805a(this.f47390a, R.drawable.morris_ds_promo_focus).toString();
        }
        if (ordinal != 31) {
            return str;
        }
        return C15986b.m32805a(this.f47390a, R.drawable.morris_onboarding_notification_popup).toString();
    }
}
