package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.p1217a;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.C15975a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.C15986b;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.b.a.i */
/* compiled from: PG */
public final class C15984i implements C15975a {

    /* renamed from: a */
    private final Context f47392a;

    public C15984i(Context context) {
        this.f47392a = context;
    }

    /* renamed from: a */
    public final String mo22642a(C16090ap apVar, C16327aa aaVar, boolean z, int i, String str) {
        C58976aa aaVar2 = C58975e.f156826a;
        if (z) {
            return BuildConfig.FLAVOR;
        }
        C16327aa aaVar3 = C16327aa.UNKNOWN_ACTION_TYPE;
        switch (aaVar.ordinal()) {
            case 1:
            case 2:
            case 5:
                return C15986b.m32805a(this.f47392a, R.drawable.suggestion_smartchip_call_icon).toString();
            case 4:
            case 6:
            case 9:
                return C15986b.m32805a(this.f47392a, R.drawable.suggestion_smartchip_message_icon).toString();
            case 7:
            case 8:
            case 10:
            case 11:
            case 12:
                return C15986b.m32805a(this.f47392a, R.drawable.suggestion_smartchip_navigate_icon).toString();
            default:
                return C15986b.m32805a(this.f47392a, R.drawable.suggestion_smartchip_opa_icon).toString();
        }
    }
}
