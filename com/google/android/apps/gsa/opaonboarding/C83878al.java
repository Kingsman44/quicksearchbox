package com.google.android.apps.gsa.opaonboarding;

import android.os.Bundle;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.apps.gsa.opaonboarding.al */
/* compiled from: PG */
public final /* synthetic */ class C83878al implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C83878al f228525a = new C83878al();

    private /* synthetic */ C83878al() {
    }

    public final Object apply(Object obj) {
        C83908bn bnVar = (C83908bn) obj;
        Bundle bundle = new Bundle();
        bundle.putInt("unicorn_config:unicorn_mode", bnVar.mo77320a());
        bundle.putString("unicorn_config:parent_user_id", bnVar.mo77324e());
        bundle.putString("unicorn_config:parent_account_name", bnVar.mo77323d());
        bundle.putString("unicorn_config:child_account_name", bnVar.mo77321b());
        bundle.putString("unicorn_config:child_user_id", bnVar.mo77322c());
        return bundle;
    }
}
