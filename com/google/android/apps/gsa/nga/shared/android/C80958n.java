package com.google.android.apps.gsa.nga.shared.android;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.shared.p7066m.C90048d;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;

/* renamed from: com.google.android.apps.gsa.nga.shared.android.n */
/* compiled from: PG */
public final class C80958n extends BroadcastReceiver {

    /* renamed from: a */
    private final C91142g f221951a;

    /* renamed from: b */
    private final C90048d f221952b;

    /* renamed from: c */
    private final C80957m f221953c;

    public C80958n(C80957m mVar, C91142g gVar, C90048d dVar) {
        this.f221953c = mVar;
        this.f221951a = gVar;
        this.f221952b = dVar;
    }

    public final void onReceive(Context context, Intent intent) {
        if (this.f221951a.mo85405j(this.f221952b)) {
            this.f221953c.mo71168a(intent);
        }
    }
}
