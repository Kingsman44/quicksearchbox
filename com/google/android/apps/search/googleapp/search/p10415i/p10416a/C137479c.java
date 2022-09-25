package com.google.android.apps.search.googleapp.search.p10415i.p10416a;

import android.net.Uri;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.search.googleapp.search.p10415i.C137515q;
import com.google.android.apps.search.googleapp.search.p10415i.C137516r;
import com.google.android.apps.search.googleapp.search.p10415i.C137517s;
import com.google.android.apps.search.googleapp.search.p10415i.C137518t;
import com.google.apps.tiktok.cache.C46407v;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C63088z;
import java.io.InputStream;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.search.googleapp.search.i.a.c */
/* compiled from: PG */
public final class C137479c {

    /* renamed from: b */
    private static final C58974d f373926b = C58974d.m91136j();

    /* renamed from: a */
    public final C46407v f373927a;

    public C137479c(C46407v vVar) {
        this.f373927a = vVar;
    }

    /* renamed from: a */
    public final C58833ax mo113773a(Uri uri) {
        String uri2 = uri.toString();
        C46407v vVar = this.f373927a;
        C137515q qVar = (C137515q) C137516r.f374025c.createBuilder();
        qVar.copyOnWrite();
        C137516r rVar = (C137516r) qVar.instance;
        uri2.getClass();
        rVar.f374027a |= 1;
        rVar.f374028b = uri2;
        try {
            return ((C58833ax) C60856cj.m92909r(vVar.mo50345e((C137516r) qVar.build()))).mo56106b(C137477a.f373922a);
        } catch (ExecutionException e) {
            ((C58970a) ((C58970a) ((C58970a) f373926b.mo56226d()).mo56382g(e)).mo56372aa(41006)).mo56389s("Got an Exception while trying to get a matching result for URI %s.", uri2);
            return C58836b.f156633a;
        }
    }

    /* renamed from: b */
    public final InputStream mo113774b(Uri uri, InputStream inputStream) {
        if (inputStream == null) {
            return null;
        }
        return new C137478b(this, inputStream, uri, C63088z.m96151w(C89885b.HTTP_VALUE));
    }

    /* renamed from: c */
    public final void mo113775c(Uri uri, C63088z zVar) {
        C46407v vVar = this.f373927a;
        C137515q qVar = (C137515q) C137516r.f374025c.createBuilder();
        String uri2 = uri.toString();
        qVar.copyOnWrite();
        C137516r rVar = (C137516r) qVar.instance;
        uri2.getClass();
        rVar.f374027a |= 1;
        rVar.f374028b = uri2;
        C137517s sVar = (C137517s) C137518t.f374029c.createBuilder();
        sVar.copyOnWrite();
        C137518t tVar = (C137518t) sVar.instance;
        zVar.getClass();
        tVar.f374031a |= 1;
        tVar.f374032b = zVar;
        vVar.mo50346f((C137516r) qVar.build(), C60856cj.m92900i((C137518t) sVar.build()));
    }
}
