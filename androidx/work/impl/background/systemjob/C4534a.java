package androidx.work.impl.background.systemjob;

import android.content.ComponentName;
import android.content.Context;
import androidx.work.C4380ad;

/* renamed from: androidx.work.impl.background.systemjob.a */
/* compiled from: PG */
final class C4534a {

    /* renamed from: a */
    public static final String f14342a = C4380ad.m12561i("SystemJobInfoConverter");

    /* renamed from: b */
    public final ComponentName f14343b;

    public C4534a(Context context) {
        this.f14343b = new ComponentName(context.getApplicationContext(), SystemJobService.class);
    }
}
