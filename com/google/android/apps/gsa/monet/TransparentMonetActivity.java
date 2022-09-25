package com.google.android.apps.gsa.monet;

import android.os.Bundle;
import com.google.android.apps.gsa.e.f;
import com.google.android.apps.gsa.p5846e.C74504a;

/*  JADX ERROR: NullPointerException in pass: ExtractFieldInit
    java.lang.NullPointerException
    	at jadx.core.utils.BlockUtils.isAllBlocksEmpty(BlockUtils.java:564)
    	at jadx.core.dex.visitors.ExtractFieldInit.getConstructorsList(ExtractFieldInit.java:245)
    	at jadx.core.dex.visitors.ExtractFieldInit.moveCommonFieldsInit(ExtractFieldInit.java:126)
    	at jadx.core.dex.visitors.ExtractFieldInit.visit(ExtractFieldInit.java:46)
    */
/* compiled from: PG */
public class TransparentMonetActivity extends MonetActivity {
    public final void finish() {
        TransparentMonetActivity.super.finish();
        overridePendingTransition(0, 0);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        C74504a.m120462a(f.q);
        TransparentMonetActivity.super.onCreate(bundle);
    }
}
