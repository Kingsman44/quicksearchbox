package android.support.p031v4.app;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.p046a.C0809b;

/* renamed from: android.support.v4.app.bj */
/* compiled from: PG */
final class C0191bj extends C0809b {
    /* renamed from: a */
    public final /* synthetic */ Intent mo613a(Context context, Object obj) {
        Bundle bundleExtra;
        IntentSenderRequest intentSenderRequest = (IntentSenderRequest) obj;
        Intent intent = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
        Intent intent2 = intentSenderRequest.f2770b;
        if (!(intent2 == null || (bundleExtra = intent2.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) == null)) {
            intent.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
            intent2.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            if (intent2.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                intentSenderRequest = new IntentSenderRequest(intentSenderRequest.f2769a, (Intent) null, intentSenderRequest.f2771c, intentSenderRequest.f2772d);
            }
        }
        intent.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", intentSenderRequest);
        if (FragmentManager.m246Z(2)) {
            new StringBuilder("CreateIntent created the following intent: ").append(intent);
            Log.v("FragmentManager", "CreateIntent created the following intent: ".concat(intent.toString()));
        }
        return intent;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo614b(int i, Intent intent) {
        return new ActivityResult(i, intent);
    }
}
