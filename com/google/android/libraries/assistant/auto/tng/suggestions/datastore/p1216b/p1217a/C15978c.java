package com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.p1217a;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.p1216b.C15975a;
import com.google.android.libraries.assistant.auto.tng.suggestions.datastore.room.C16090ap;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1263k.C16327aa;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.auto.tng.suggestions.datastore.b.a.c */
/* compiled from: PG */
public final class C15978c implements C15975a {

    /* renamed from: a */
    static final C58495hd f47384a = C58495hd.m89903q("call_missed_red_icon", Integer.valueOf(R.drawable.call_missed_red_icon), "quantum_gm_ic_phone_alt_vd_24", Integer.valueOf(R.drawable.quantum_gm_ic_phone_alt_vd_24), "quantum_gm_ic_textsms_vd_24", Integer.valueOf(R.drawable.quantum_gm_ic_textsms_vd_24), "quantum_gm_ic_share_eta_gm_grey500_48", Integer.valueOf(R.drawable.quantum_gm_ic_share_eta_gm_grey500_48));

    /* renamed from: c */
    public static final /* synthetic */ int f47385c = 0;

    /* renamed from: b */
    public final Context f47386b;

    public C15978c(Context context) {
        this.f47386b = context;
    }

    /* renamed from: a */
    public final String mo22642a(C16090ap apVar, C16327aa aaVar, boolean z, int i, String str) {
        C58976aa aaVar2 = C58975e.f156826a;
        return !TextUtils.isEmpty(str) ? (String) Collection.EL.stream(f47384a.entrySet()).filter(new C15976a(str)).findFirst().map(new C15977b(this)).orElse(str) : str;
    }
}
