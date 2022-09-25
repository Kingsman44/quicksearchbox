package com.google.android.apps.gsa.staticplugins.p8163o;

import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.p10890h.p10891a.p10893b.C146575f;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.aj */
/* compiled from: PG */
public final /* synthetic */ class C105799aj implements C146575f {

    /* renamed from: a */
    public final /* synthetic */ C86054o f295152a;

    /* renamed from: b */
    public final /* synthetic */ C89012aj f295153b;

    public /* synthetic */ C105799aj(C86054o oVar, C89012aj ajVar) {
        this.f295152a = oVar;
        this.f295153b = ajVar;
    }

    /* renamed from: a */
    public final int mo95061a(Uri uri, Map map) {
        C86054o oVar = this.f295152a;
        C89012aj ajVar = this.f295153b;
        C89019aq c = C89020ar.m144758c();
        c.f241245k = 65537;
        c.mo82991c(map);
        c.mo82994f(uri.toString());
        c.f241239e = true;
        c.f241244j = true;
        C89020ar.m144761h(60000);
        c.f241247m = 60000;
        C89020ar.m144761h(60000);
        c.f241246l = 60000;
        String D = oVar.mo79657D("oauth2:https://www.googleapis.com/auth/youtube", 3000);
        if (D != null) {
            c.mo82990b("Authorization", "Bearer ".concat(D));
        }
        try {
            return ((C89057m) C90877ak.m148472f(ajVar.mo27495f(c.mo82989a(), C89009ag.f241207b, ajVar.mo27510b(C89066v.f241382a)))).mo82999g().f241279a;
        } catch (C90457d | InterruptedException | ExecutionException e) {
            throw new IOException(e);
        }
    }
}
