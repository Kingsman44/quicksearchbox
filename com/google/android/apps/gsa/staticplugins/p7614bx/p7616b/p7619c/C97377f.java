package com.google.android.apps.gsa.staticplugins.p7614bx.p7616b.p7619c;

import android.app.Dialog;
import android.content.Intent;
import android.support.p033v7.app.C0359at;
import android.support.p033v7.app.C0395p;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.android.libraries.onegoogle.accountmenu.AccountMenu;

/* renamed from: com.google.android.apps.gsa.staticplugins.bx.b.c.f */
/* compiled from: PG */
public final /* synthetic */ class C97377f implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C97359ab f271951a;

    public /* synthetic */ C97377f(C97359ab abVar) {
        this.f271951a = abVar;
    }

    public final void run() {
        Dialog dialog;
        C97359ab abVar = this.f271951a;
        if (((Boolean) ((C97369al) abVar.f271888b).f271937h.f63720e).booleanValue() && abVar.f271889c.mo56113h()) {
            if (abVar.f271893g.mo35858i().f81934a.mo35794b().isEmpty()) {
                Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
                intent.putExtra("account_types", new String[]{"com.google"});
                abVar.f271887a.startActivity(intent);
                return;
            }
            AccountMenu.m56332h((C0395p) abVar.f271889c.mo56107c(), abVar.f271893g).mo35798k(-1);
            C0359at e = abVar.mo90661e();
            if (e != null && (dialog = e.getDialog()) != null) {
                dialog.setOnDismissListener(new C97388q(abVar));
            }
        }
    }
}
