package com.google.android.apps.gsa.staticplugins.opa;

import com.google.android.apps.gsa.staticplugins.opa.inproducthelp.ChatUiHelpController;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.android.libraries.material.featurehighlight.C28521c;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ev */
/* compiled from: PG */
final class C109009ev extends C28521c {

    /* renamed from: a */
    final /* synthetic */ C109040fj f303122a;

    public C109009ev(C109040fj fjVar) {
        this.f303122a = fjVar;
    }

    /* renamed from: a */
    public final void mo34066a(String str) {
        ChatUiHelpController chatUiHelpController;
        if (str != null && (chatUiHelpController = this.f303122a.f303460y) != null) {
            if (!chatUiHelpController.f304451l || !str.equals("PROMO_MIC_OPEN")) {
                this.f303122a.f303460y.mo97749e();
            } else {
                this.f303122a.f303460y.mo97750f(3);
            }
        }
    }

    /* renamed from: b */
    public final void mo34067b(String str) {
        ChatUiHelpController chatUiHelpController;
        if (str != null && (chatUiHelpController = this.f303122a.f303460y) != null) {
            Set a = chatUiHelpController.mo97745a();
            a.add(str);
            chatUiHelpController.f304441b.edit().putStringSet("chat_ui_help_promos_shown", a).apply();
            if (chatUiHelpController.f304447h.containsKey(str)) {
                chatUiHelpController.f304442c.mo100721a(chatUiHelpController.f304453n, chatUiHelpController.f304452m, C28285c.m52875b(C28293k.m52908e(C28295m.m52915a(chatUiHelpController.f304440a.findViewById(R.id.opa_top_level)), C28293k.m52908e(new C28292j(((Integer) chatUiHelpController.f304447h.get(str)).intValue()), new C28293k[0])), 472));
            }
            if (str.equals("PROMO_MIC_OPEN")) {
                C109040fj fjVar = this.f303122a;
                if (fjVar.f303460y.f304451l) {
                    fjVar.mo97503bM();
                } else {
                    fjVar.f303238X.mo96125X();
                }
            } else {
                this.f303122a.f303238X.mo96115N(true);
            }
        }
    }
}
