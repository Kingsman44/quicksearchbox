package com.google.android.apps.gsa.sidekick.shared.cards;

import android.net.Uri;
import com.google.android.apps.gsa.shared.util.permissions.C91078e;
import com.google.p375ai.p378b.C7642eo;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.j */
/* compiled from: PG */
final class C91695j implements C91078e {

    /* renamed from: a */
    final /* synthetic */ Uri f255782a;

    /* renamed from: b */
    final /* synthetic */ C91702q f255783b;

    public C91695j(C91702q qVar, Uri uri) {
        this.f255783b = qVar;
        this.f255782a = uri;
    }

    /* renamed from: a */
    public final void mo18206a(String[] strArr, int[] iArr) {
        if (!"false".equals(this.f255782a.getQueryParameter("dismiss"))) {
            this.f255783b.f255779b.mo86168g().mo86235c(this.f255783b.f255790c);
        }
        for (int i : iArr) {
            if (i == 0) {
                this.f255783b.f255779b.mo86165e().mo86208b(C7642eo.PERMISSIONS_REQUEST_REFRESH);
                return;
            }
        }
    }
}
