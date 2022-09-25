package com.google.android.apps.gsa.staticplugins.opa.util;

import android.accounts.AccountsException;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.shared.p6930h.C87558a;
import com.google.android.apps.gsa.search.shared.p6930h.C87559b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.b */
/* compiled from: PG */
public final class C113784b implements C87559b {

    /* renamed from: a */
    private static final C59071e f315119a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.util.b");

    /* renamed from: b */
    private final C86054o f315120b;

    /* renamed from: c */
    private final C113872d f315121c;

    /* renamed from: d */
    private AlertDialog f315122d;

    public C113784b(C86054o oVar, C113872d dVar) {
        this.f315120b = oVar;
        this.f315121c = dVar;
    }

    /* renamed from: a */
    public final void mo81680a() {
        AlertDialog alertDialog = this.f315122d;
        if (alertDialog != null && alertDialog.isShowing()) {
            this.f315122d.dismiss();
        }
    }

    /* renamed from: b */
    public final void mo81681b(Activity activity, C87558a aVar) {
        int length;
        String F = this.f315120b.mo79659F();
        String[] s = this.f315120b.mo79685s();
        int length2 = s.length + 1;
        String[] strArr = new String[length2];
        int i = 0;
        int i2 = -1;
        while (true) {
            length = s.length;
            if (i >= length) {
                break;
            }
            if (true == s[i].equals(F)) {
                i2 = i;
            }
            strArr[i] = s[i];
            i++;
        }
        strArr[length] = activity.getResources().getString(R.string.select_google_account_add_account);
        C113745a aVar2 = new C113745a(this, i2, strArr, activity, aVar);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setTitle(R.string.select_google_account);
        builder.setNegativeButton(R.string.cancel, (DialogInterface.OnClickListener) null);
        if (length2 > 1) {
            builder.setSingleChoiceItems(strArr, i2, aVar2);
        } else {
            builder.setItems(strArr, aVar2);
        }
        AlertDialog create = builder.create();
        this.f315122d = create;
        create.getWindow().setFlags(2, 2);
        this.f315122d.getWindow().setDimAmount(0.6f);
        this.f315122d.show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo100623c(int i, String[] strArr, Activity activity, C87558a aVar, DialogInterface dialogInterface, int i2) {
        if (i2 == i) {
            dialogInterface.dismiss();
        } else if (i2 == strArr.length - 1) {
            dialogInterface.dismiss();
            C113872d dVar = this.f315121c;
            C113811c cVar = new C113811c(dVar, aVar);
            C90476a aVar2 = C91018d.f254254a;
            dVar.f315292b.addAccount("com.google", (String) null, (String[]) null, (Bundle) null, activity, cVar, (Handler) null);
        } else {
            String str = strArr[i2];
            dialogInterface.dismiss();
            try {
                this.f315120b.mo79686t(str);
            } catch (AccountsException e) {
                C59104x d = f315119a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "Opa.AccountPicker");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(28379)).mo56386p("Exception when setting new account");
            }
            aVar.mo81679a();
        }
    }
}
