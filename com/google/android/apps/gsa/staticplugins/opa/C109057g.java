package com.google.android.apps.gsa.staticplugins.opa;

import android.content.DialogInterface;
import android.content.Intent;
import com.google.android.apps.gsa.notificationlistener.C83395k;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.g */
/* compiled from: PG */
final class C109057g implements DialogInterface.OnClickListener {

    /* renamed from: a */
    final /* synthetic */ C109138h f303604a;

    public C109057g(C109138h hVar) {
        this.f303604a = hVar;
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        C83395k.m132733d(this.f303604a.f303911f);
        Intent c = C83395k.m132732c(this.f303604a.f303911f);
        if (c != null) {
            this.f303604a.f303907b.mo65089a(c);
        } else {
            ((C59052c) ((C59052c) C109138h.f303906a.mo56226d()).mo56372aa(22552)).mo56386p("Fails to get notification permission intent.");
        }
        dialogInterface.dismiss();
    }
}
