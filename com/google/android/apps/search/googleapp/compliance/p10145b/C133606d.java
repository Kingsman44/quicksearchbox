package com.google.android.apps.search.googleapp.compliance.p10145b;

import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.googleapp.compliance.b.d */
/* compiled from: PG */
public final /* synthetic */ class C133606d implements C58817ah {
    public final Object apply(Object obj) {
        C133614l lVar = C133614l.HINT_UNSPECIFIED;
        int ordinal = ((C133614l) obj).ordinal();
        if (ordinal == 1) {
            return Optional.m71637of(Integer.valueOf(R.string.googleapp_compliance_encrypted_search_box_hint_text_1));
        }
        if (ordinal == 3) {
            return Optional.m71637of(Integer.valueOf(R.string.googleapp_compliance_encrypted_search_box_hint_text_2));
        }
        if (ordinal != 5) {
            return Optional.empty();
        }
        return Optional.m71637of(Integer.valueOf(R.string.googleapp_compliance_encrypted_search_box_hint_text_3));
    }
}
