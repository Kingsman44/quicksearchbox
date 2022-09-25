package androidx.core.app;

import android.app.Activity;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;

/* renamed from: androidx.core.app.a */
/* compiled from: PG */
public final class C1783a {
    /* renamed from: a */
    public static void m4902a(Activity activity) {
        activity.finishAffinity();
    }

    /* renamed from: b */
    public static void m4903b(Activity activity, Intent intent, int i, Bundle bundle) {
        activity.startActivityForResult(intent, i, bundle);
    }

    /* renamed from: c */
    public static void m4904c(Activity activity, IntentSender intentSender, int i, Intent intent, int i2, int i3, int i4, Bundle bundle) {
        activity.startIntentSenderForResult(intentSender, i, intent, i2, i3, i4, bundle);
    }
}
