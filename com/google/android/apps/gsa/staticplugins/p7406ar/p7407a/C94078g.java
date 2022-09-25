package com.google.android.apps.gsa.staticplugins.p7406ar.p7407a;

import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.net.MalformedURLException;

/* renamed from: com.google.android.apps.gsa.staticplugins.ar.a.g */
/* compiled from: PG */
public final class C94078g {
    /* renamed from: a */
    static C89018ap m155278a(UriRequest uriRequest, int i, long j) {
        m155279b(1084, j);
        try {
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(uriRequest.f236331a.toString());
            c.mo82991c(uriRequest.mo81502a());
            c.f241239e = true;
            c.f241245k = i;
            c.f241244j = true;
            return new C89018ap(c.mo82989a(), C89009ag.f241207b);
        } catch (MalformedURLException e) {
            throw new C90457d((Throwable) e, (int) C89885b.HTTP_MALFORMED_URL_VALUE);
        }
    }

    /* renamed from: b */
    public static void m155279b(int i, long j) {
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164252g |= 268435456;
        ufVar2.f164192bt = j;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }
}
