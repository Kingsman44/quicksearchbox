package com.google.android.libraries.p1969j.p1970a.p1974b;

import android.content.Context;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.common.util.concurrent.C60845bz;

/* renamed from: com.google.android.libraries.j.a.b.p */
/* compiled from: PG */
final class C23966p implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ Context f65531a;

    /* renamed from: b */
    final /* synthetic */ C23971u f65532b;

    public C23966p(C23971u uVar, Context context) {
        this.f65532b = uVar;
        this.f65531a = context;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Context context = this.f65531a;
        Toast.makeText(context, context.getResources().getString(R.string.retryable_error_message), 0).show();
        this.f65532b.f65548c.mo29366b(14);
        this.f65532b.mo29380a(C23968r.WAITING_FOR_USER_DECISION);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        this.f65532b.mo29380a(C23968r.CONSENT_WRITTEN);
    }
}
