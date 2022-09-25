package androidx.core.content;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;

/* renamed from: androidx.core.content.a */
/* compiled from: PG */
public final class C1845a {
    /* renamed from: a */
    public static void m5058a(Context context, Intent[] intentArr, Bundle bundle) {
        context.startActivities(intentArr, bundle);
    }

    /* renamed from: b */
    public static void m5059b(Context context, Intent intent, Bundle bundle) {
        context.startActivity(intent, bundle);
    }
}
