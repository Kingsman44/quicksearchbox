package com.google.android.apps.gsa.assistant.settings.features.p534ab;

import android.accounts.Account;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.p031v4.app.C0167am;
import android.text.TextUtils;
import android.widget.Toast;
import com.google.android.apps.gsa.assistant.settings.shared.h;
import com.google.android.apps.gsa.assistant.shared.n.k;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3861at.add;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.ab.a */
/* compiled from: PG */
final class C9787a extends k {

    /* renamed from: a */
    final /* synthetic */ C9789b f33765a;

    public C9787a(C9789b bVar) {
        this.f33765a = bVar;
    }

    /* renamed from: c */
    public final void mo18037go(act act) {
        String str;
        Account a;
        String str2;
        Context baseContext;
        PackageManager packageManager;
        C9789b bVar = this.f33765a;
        if (bVar.isAdded()) {
            C0167am activity = bVar.getActivity();
            if ((act.f128894a & 1024) != 0) {
                add add = act.f128904k;
                if (add == null) {
                    add = add.f129026b;
                }
                str = add.f129028a;
            } else {
                str = null;
            }
            if (str == null || TextUtils.isEmpty(str)) {
                Toast.makeText(activity.getApplicationContext(), R.string.assistant_settings_no_shopping_list, 0).show();
                return;
            }
            C58976aa aaVar = C58975e.f156826a;
            Uri parse = Uri.parse(str);
            Intent intent = new Intent("android.intent.action.VIEW", parse);
            if (!(!parse.getHost().equals("keep.google.com") || (baseContext = activity.getBaseContext()) == null || (packageManager = baseContext.getPackageManager()) == null)) {
                try {
                    if (packageManager.getPackageInfo("com.google.android.keep", 1).versionCode > 2101) {
                        intent.setPackage("com.google.android.keep");
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            h hVar = this.f33765a.f33768c;
            if (!(hVar == null || (a = hVar.a()) == null || (str2 = a.name) == null || str2.isEmpty())) {
                intent.putExtra("authAccount", str2);
                intent.putExtra("account", str2);
                intent.putExtra("android.intent.extra.EMAIL", C58597ky.m90212c(str2));
            }
            try {
                this.f33765a.startActivityForResult(intent, 1);
            } catch (ActivityNotFoundException e) {
                C59104x c = C9789b.f33766a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ShoppingListSF");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(933)).mo56389s("no activity found to handle %s", parse);
                Toast.makeText(activity, R.string.assistant_settings_list_generic_error, 0).show();
            }
        }
    }

    /* renamed from: gn */
    public final void mo18036gn(Throwable th) {
        C58976aa aaVar = C58975e.f156826a;
    }
}
