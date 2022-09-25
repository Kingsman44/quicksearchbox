package com.google.android.apps.gsa.monet.dialog;

import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.monet.MonetActivity;
import com.google.android.apps.gsa.p5846e.C74504a;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(BlockUtils.java:564)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(ExtractFieldInit.java:245)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(ExtractFieldInit.java:126)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(ExtractFieldInit.java:46)
    */
/* compiled from: PG */
public class DialogMonetActivity extends MonetActivity {
    /* JADX WARNING: type inference failed for: r1v0, types: [com.google.android.apps.gsa.monet.MonetActivity, com.google.android.apps.gsa.monet.dialog.DialogMonetActivity, android.support.v7.app.p] */
    public final void onCreate(Bundle bundle) {
        C74504a.m120462a(f.u);
        mo1329q();
        DialogMonetActivity.super.onCreate(bundle);
        getWindow().setFlags(1024, 1024);
    }
}
