package com.google.android.libraries.onegoogle.accountmanagement;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: com.google.android.libraries.onegoogle.accountmanagement.h */
/* compiled from: PG */
public class C30279h extends Activity {

    /* renamed from: a */
    private boolean f81875a;

    /* renamed from: a */
    private final void m56317a(Bundle bundle) {
        this.f81875a = bundle.getBoolean("isAddActivityStarted");
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 9) {
            C30280i.f81876a.mo35793a(false);
        }
        finish();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C30280i.f81876a.mo35793a(true);
        if (bundle != null) {
            m56317a(bundle);
        }
        if (!this.f81875a) {
            Intent intent = new Intent("android.settings.ADD_ACCOUNT_SETTINGS");
            intent.putExtra("account_types", new String[]{"com.google"});
            startActivityForResult(intent, 9);
            this.f81875a = true;
        }
    }

    /* access modifiers changed from: protected */
    public final void onRestoreInstanceState(Bundle bundle) {
        super.onRestoreInstanceState(bundle);
        m56317a(bundle);
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("isAddActivityStarted", this.f81875a);
    }
}
