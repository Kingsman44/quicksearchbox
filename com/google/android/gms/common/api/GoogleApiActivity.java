package com.google.android.gms.common.api;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.C143875g;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.internal.C143767bo;
import com.google.android.gms.common.internal.C143919bh;

/* compiled from: PG */
public class GoogleApiActivity extends Activity implements DialogInterface.OnCancelListener {

    /* renamed from: a */
    protected int f389612a = 0;

    /* renamed from: a */
    public static Intent m233460a(Context context, PendingIntent pendingIntent, int i, boolean z) {
        Intent intent = new Intent(context, GoogleApiActivity.class);
        intent.putExtra("pending_intent", pendingIntent);
        intent.putExtra("failing_client_id", i);
        intent.putExtra("notify_manager", z);
        return intent;
    }

    /* renamed from: b */
    private final void m233461b() {
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            Log.e("GoogleApiActivity", "Activity started without extras");
            finish();
            return;
        }
        PendingIntent pendingIntent = (PendingIntent) extras.get("pending_intent");
        Integer num = (Integer) extras.get("error_code");
        if (pendingIntent == null && num == null) {
            Log.e("GoogleApiActivity", "Activity started without resolution");
            finish();
        } else if (pendingIntent != null) {
            try {
                startIntentSenderForResult(pendingIntent.getIntentSender(), 1, (Intent) null, 0, 0, 0);
                this.f389612a = 1;
            } catch (ActivityNotFoundException e) {
                if (extras.getBoolean("notify_manager", true)) {
                    C143767bo.m233633c(this).mo119210f(new ConnectionResult(1, 22, (PendingIntent) null, (String) null), getIntent().getIntExtra("failing_client_id", -1));
                } else {
                    String str = "Activity not found while launching " + pendingIntent.toString() + ".";
                    if (Build.FINGERPRINT.contains("generic")) {
                        str = str.concat(" This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store.");
                    }
                    Log.e("GoogleApiActivity", str, e);
                }
                this.f389612a = 1;
                finish();
            } catch (IntentSender.SendIntentException e2) {
                Log.e("GoogleApiActivity", "Failed to launch pendingIntent", e2);
                finish();
            }
        } else {
            C143919bh.m233958a(num);
            C143875g.f389987a.mo119361i(this, num.intValue(), 2, this);
            this.f389612a = 1;
        }
    }

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1) {
            boolean booleanExtra = getIntent().getBooleanExtra("notify_manager", true);
            this.f389612a = 0;
            setResult(i2, intent);
            if (booleanExtra) {
                C143767bo c = C143767bo.m233633c(this);
                if (i2 == -1) {
                    c.mo119211g();
                } else if (i2 == 0) {
                    c.mo119210f(new ConnectionResult(1, 13, (PendingIntent) null, (String) null), getIntent().getIntExtra("failing_client_id", -1));
                }
            }
        } else if (i == 2) {
            this.f389612a = 0;
            setResult(i2, intent);
        }
        finish();
    }

    public final void onCancel(DialogInterface dialogInterface) {
        this.f389612a = 0;
        setResult(0);
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null) {
            this.f389612a = bundle.getInt("resolution");
        }
        if (this.f389612a != 1) {
            m233461b();
        }
    }

    /* access modifiers changed from: protected */
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.putInt("resolution", this.f389612a);
        super.onSaveInstanceState(bundle);
    }
}
