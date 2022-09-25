package com.google.android.play.core.missingsplits;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.play.core.p3529c.C45053a;
import com.google.android.play.core.p3542h.C45195d;

/* compiled from: PG */
public class PlayCoreMissingSplitsActivity extends Activity implements DialogInterface.OnClickListener {
    /* renamed from: a */
    private final String m80487a() {
        return getApplicationInfo().loadLabel(getPackageManager()).toString();
    }

    /* renamed from: b */
    private final void m80488b(String str) {
        try {
            startActivity(new Intent("android.intent.action.VIEW").setData(Uri.parse("market://details?id=" + str + "&referrer=utm_source%3Dplay.core.missingsplits")).setPackage("com.android.vending"));
        } catch (ActivityNotFoundException e) {
            new C45053a(getClass().getName()).mo48885c(e, "Couldn't start missing splits activity for %s", str);
        }
    }

    public final void onClick(DialogInterface dialogInterface, int i) {
        if (i == -1) {
            m80488b(getPackageName());
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        AlertDialog.Builder neutralButton = new AlertDialog.Builder(this).setTitle("Installation failed").setCancelable(false).setNeutralButton("Close", this);
        if (C45195d.m80473a(this)) {
            String a = m80487a();
            neutralButton.setMessage("The app " + a + " is missing required components and must be reinstalled from the Google Play Store.").setPositiveButton("Reinstall", this);
        } else {
            String a2 = m80487a();
            neutralButton.setMessage("The app " + a2 + " is missing required components and must be reinstalled from an official store.");
        }
        neutralButton.create().show();
    }
}
