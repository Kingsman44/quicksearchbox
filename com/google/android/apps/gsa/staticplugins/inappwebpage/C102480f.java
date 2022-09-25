package com.google.android.apps.gsa.staticplugins.inappwebpage;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86268w;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.p6968aa.C89033bd;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60826bg;
import dagger.C68214a;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.inappwebpage.f */
/* compiled from: PG */
public final class C102480f {

    /* renamed from: a */
    public final Executor f286021a = C60826bg.f164896a;

    /* renamed from: b */
    public final C90931ca f286022b;

    /* renamed from: c */
    public final C86124t f286023c;

    /* renamed from: d */
    public final C85923cq f286024d;

    /* renamed from: e */
    public final C85929cw f286025e;

    /* renamed from: f */
    public final C86268w f286026f;

    /* renamed from: g */
    public final C68214a f286027g;

    /* renamed from: h */
    public final Context f286028h;

    public C102480f(C90931ca caVar, C86124t tVar, C85923cq cqVar, C85929cw cwVar, C86268w wVar, C68214a aVar, Context context) {
        this.f286022b = caVar;
        this.f286023c = tVar;
        this.f286024d = cqVar;
        this.f286025e = cwVar;
        this.f286026f = wVar;
        this.f286027g = aVar;
        this.f286028h = context;
    }

    /* renamed from: a */
    public static final C87504b m169938a(Uri uri, String str, C58881cr crVar) {
        C89033bd a = C89033bd.m144788a(str);
        if (a == null) {
            a = C89033bd.m144788a("text/html; charset=utf-8");
        }
        return new C87504b(new UriRequest(uri, (Map) null, (Map) null, (byte[]) null), a, crVar);
    }
}
