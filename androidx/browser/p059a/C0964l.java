package androidx.browser.p059a;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.core.content.C1845a;

/* renamed from: androidx.browser.a.l */
/* compiled from: PG */
public final class C0964l {

    /* renamed from: a */
    public final Intent f3074a;

    /* renamed from: b */
    public final Bundle f3075b;

    public C0964l(Intent intent, Bundle bundle) {
        this.f3074a = intent;
        this.f3075b = bundle;
    }

    /* renamed from: a */
    public final void mo3590a(Context context, Uri uri) {
        this.f3074a.setData(uri);
        C1845a.m5059b(context, this.f3074a, this.f3075b);
    }
}
