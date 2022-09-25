package com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.p8513k;

import android.content.Context;
import com.google.android.apps.gsa.assistant.shared.p.i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113409et;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.search.assistant.p2786t.p2801d.p2802a.C36619a;
import com.google.assistant.p3781ad.p3789d.p3791b.C48672ag;
import com.google.common.p4522b.C58336bg;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4522b.C58740qf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.k.g */
/* compiled from: PG */
public final class C111550g extends C113409et {

    /* renamed from: a */
    public static final Comparator f310253a = new C58740qf(new C58336bg(C111548e.f310250a, C58701ou.f156429a));

    /* renamed from: b */
    private static final C59071e f310254b = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.datasource.k.g");

    /* renamed from: c */
    private final C22871g f310255c;

    /* renamed from: d */
    private final C68214a f310256d;

    /* renamed from: e */
    private final Context f310257e;

    public C111550g(C22871g gVar, C68214a aVar, Context context) {
        this.f310255c = gVar;
        this.f310256d = aVar;
        this.f310257e = context;
    }

    /* renamed from: a */
    public final C48672ag mo99101a() {
        return C48672ag.NOTIFICATION;
    }

    /* renamed from: c */
    public final C60870cx mo99103c(C113405ep epVar, Map map) {
        C60870cx cxVar;
        C22871g gVar = this.f310255c;
        if (!C36619a.m65148d(this.f310257e)) {
            ((C59052c) ((C59052c) f310254b.mo56226d()).mo56372aa(27269)).mo56386p("Permission to read notifications is not granted");
            cxVar = C60856cj.m92900i(new ArrayList());
        } else {
            cxVar = ((i) this.f310256d.mo27525b()).a();
        }
        return gVar.mo28209i(cxVar, "Process notifications", new C111549f(this, epVar));
    }
}
