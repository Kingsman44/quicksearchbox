package com.google.android.apps.gsa.assistant.settings.features.p548ah;

import android.accounts.Account;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import com.google.android.apps.gsa.search.shared.inappwebpage.C87574a;
import com.google.android.apps.gsa.shared.util.p7184t.C91097g;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ah.u */
/* compiled from: PG */
final class C10084u extends ClickableSpan {

    /* renamed from: a */
    final /* synthetic */ String f34356a;

    /* renamed from: b */
    final /* synthetic */ C10064ab f34357b;

    public C10084u(C10064ab abVar, String str) {
        this.f34357b = abVar;
        this.f34356a = str;
    }

    public final void onClick(View view) {
        C10064ab abVar = this.f34357b;
        String str = this.f34356a;
        C58976aa aaVar = C58975e.f156826a;
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(str));
        Account a = abVar.f34311i.a();
        if (a != null) {
            String str2 = a.name;
            if (!TextUtils.isEmpty(str2)) {
                intent.putExtra("authAccount", str2);
                intent.putExtra("account", str2);
                intent.putExtra("android.intent.extra.EMAIL", C58597ky.m90212c(str2));
            }
        }
        intent.putExtra("full_screen", true);
        intent.putExtra("hide_status_bar", true);
        intent.putExtra("screen_orientation", true);
        Intent a2 = C87574a.f236603a.mo83277a(intent);
        C91097g f = abVar.mo17793f();
        f.getClass();
        f.mo65090b(a2, C10081r.f34354a);
    }
}
