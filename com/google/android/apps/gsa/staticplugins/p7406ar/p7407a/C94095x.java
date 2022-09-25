package com.google.android.apps.gsa.staticplugins.p7406ar.p7407a;

import android.net.Uri;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import java.net.MalformedURLException;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.a.x */
/* compiled from: PG */
public final class C94095x {
    /* renamed from: a */
    static C89018ap m155300a(Uri uri, int i) {
        try {
            C89019aq d = C89020ar.m144759d();
            d.mo82994f(uri.toString());
            d.f241239e = true;
            d.f241245k = i;
            d.f241244j = true;
            return new C89018ap(d.mo82989a(), C89009ag.f241207b);
        } catch (MalformedURLException e) {
            throw new C90457d((Throwable) e, (int) C89885b.HTTP_MALFORMED_URL_VALUE);
        }
    }
}
