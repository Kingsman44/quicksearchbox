package androidx.activity;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.p046a.C0808a;
import androidx.activity.result.p046a.C0809b;
import androidx.core.app.C1783a;
import androidx.core.app.C1820g;

/* renamed from: androidx.activity.g */
/* compiled from: PG */
final class C0794g extends ActivityResultRegistry {

    /* renamed from: a */
    final /* synthetic */ ComponentActivity f2740a;

    public C0794g(ComponentActivity componentActivity) {
        this.f2740a = componentActivity;
    }

    /* renamed from: a */
    public final void mo3347a(int i, C0809b bVar, Object obj) {
        Bundle bundle;
        ComponentActivity componentActivity = this.f2740a;
        C0808a c = bVar.mo3368c(componentActivity, obj);
        if (c != null) {
            new Handler(Looper.getMainLooper()).post(new C0792e(this, i, c));
            return;
        }
        Intent a = bVar.mo613a(componentActivity, obj);
        if (a.getExtras() != null && a.getExtras().getClassLoader() == null) {
            a.setExtrasClassLoader(componentActivity.getClassLoader());
        }
        if (a.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            Bundle bundleExtra = a.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            a.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            bundle = bundleExtra;
        } else {
            bundle = null;
        }
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(a.getAction())) {
            String[] stringArrayExtra = a.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            C1820g.m4991a(componentActivity, stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(a.getAction())) {
            IntentSenderRequest intentSenderRequest = (IntentSenderRequest) a.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                C1783a.m4904c(componentActivity, intentSenderRequest.f2769a, i, intentSenderRequest.f2770b, intentSenderRequest.f2771c, intentSenderRequest.f2772d, 0, bundle);
            } catch (IntentSender.SendIntentException e) {
                new Handler(Looper.getMainLooper()).post(new C0793f(this, i, e));
            }
        } else {
            C1783a.m4903b(componentActivity, a, i, bundle);
        }
    }
}
