package com.google.android.apps.search.googleapp.searchwidget.p10479c;

import android.text.TextUtils;
import com.google.android.apps.search.googleapp.searchwidget.C139135z;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C62910ar;
import java.util.List;
import java.util.Random;

/* renamed from: com.google.android.apps.search.googleapp.searchwidget.c.bf */
/* compiled from: PG */
public final class C138963bf {

    /* renamed from: a */
    public static final C59071e f377919a = C59071e.m91332i("com.google.android.apps.search.googleapp.searchwidget.c.bf");

    /* renamed from: b */
    public final C138990v f377920b;

    /* renamed from: c */
    public final C138932ab f377921c;

    /* renamed from: d */
    public final C138970bm f377922d;

    /* renamed from: e */
    public final C139135z f377923e;

    /* renamed from: f */
    public final C42876ab f377924f;

    /* renamed from: g */
    public final C60887da f377925g;

    /* renamed from: h */
    public final C60887da f377926h;

    /* renamed from: i */
    public final C138977i f377927i;

    /* renamed from: j */
    public final boolean f377928j;

    /* renamed from: k */
    public final C62910ar f377929k;

    /* renamed from: l */
    public final C62910ar f377930l;

    /* renamed from: m */
    public final Random f377931m = new Random();

    /* renamed from: n */
    private final C138994z f377932n;

    public C138963bf(C138932ab abVar, C138977i iVar, C138990v vVar, C138994z zVar, C138970bm bmVar, C139135z zVar2, C42876ab abVar2, C60887da daVar, C60887da daVar2, C62910ar arVar, C62910ar arVar2, boolean z) {
        this.f377921c = abVar;
        this.f377932n = zVar;
        this.f377927i = iVar;
        this.f377925g = daVar;
        this.f377926h = daVar2;
        this.f377923e = zVar2;
        this.f377922d = bmVar;
        this.f377929k = arVar2;
        this.f377930l = arVar;
        this.f377924f = abVar2;
        this.f377928j = z;
        this.f377920b = vVar;
    }

    /* renamed from: a */
    public final C60870cx mo114642a() {
        C60870cx a = this.f377932n.mo114649a(TextUtils.concat(new CharSequence[]{"https://www.google.com", "/async/ddlsch"}).toString(), C138991w.f377993a);
        C138955ay ayVar = new C138955ay(this);
        Class<Throwable> cls = Throwable.class;
        C60870cx h = C60846c.m92879h(a, cls, C47810es.m84966f(ayVar), this.f377926h);
        C60931s f = C47810es.m84966f(new C138945ao(this));
        return C60922j.m93045h(h, C47810es.m84966f(f), this.f377925g);
    }

    /* renamed from: b */
    public final C60870cx mo114643b(List list) {
        C60870cx a = this.f377922d.mo114645a();
        C60931s f = C47810es.m84966f(new C138942al(this, list));
        C60870cx h = C60922j.m93045h(a, C47810es.m84966f(f), this.f377926h);
        C60931s f2 = C47810es.m84966f(new C138951au(this));
        return C60922j.m93045h(h, C47810es.m84966f(f2), this.f377925g);
    }
}
