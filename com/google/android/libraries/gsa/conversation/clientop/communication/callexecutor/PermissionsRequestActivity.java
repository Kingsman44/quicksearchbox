package com.google.android.libraries.gsa.conversation.clientop.communication.callexecutor;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.ResultReceiver;
import androidx.core.app.C1820g;

/* compiled from: PG */
public class PermissionsRequestActivity extends Activity {

    /* renamed from: a */
    private ResultReceiver f61922a = null;

    /* access modifiers changed from: protected */
    public final void onActivityResult(int i, int i2, Intent intent) {
        Bundle bundle = new Bundle();
        bundle.putParcelable("android.intent.extra.INTENT", intent);
        ResultReceiver resultReceiver = this.f61922a;
        if (resultReceiver != null) {
            resultReceiver.send(i2, bundle);
        }
        finish();
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f61922a = (ResultReceiver) getIntent().getParcelableExtra("receiver");
        String[] stringArrayExtra = getIntent().getStringArrayExtra("permissions");
        if (stringArrayExtra != null) {
            C1820g.m4991a(this, stringArrayExtra, 1);
        } else {
            finish();
        }
    }

    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        Bundle bundle = new Bundle();
        bundle.putStringArray("permissions", strArr);
        bundle.putIntArray("permissions-grants", iArr);
        ResultReceiver resultReceiver = this.f61922a;
        if (resultReceiver != null) {
            resultReceiver.send(0, bundle);
        }
        finish();
    }
}
