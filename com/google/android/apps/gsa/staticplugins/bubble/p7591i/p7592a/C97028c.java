package com.google.android.apps.gsa.staticplugins.bubble.p7591i.p7592a;

import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.staticplugins.bubble.p7591i.C97042e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.C60567ur;
import com.google.common.p4552o.C60570uu;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.net.MalformedURLException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.i.a.c */
/* compiled from: PG */
public final class C97028c extends C86734a implements C97027b {

    /* renamed from: a */
    private static final C59071e f271155a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bubble.i.a.c");

    /* renamed from: b */
    private final C87242k f271156b;

    /* renamed from: c */
    private final C84466a f271157c;

    public C97028c(C84466a aVar, C87242k kVar) {
        super(C118575h.WORKER_BUBBLE, "bubble");
        this.f271157c = aVar;
        this.f271156b = kVar;
    }

    /* renamed from: a */
    public final C60870cx mo90399a(Uri uri) {
        try {
            C89019aq a = C89020ar.m144756a();
            a.mo82994f(uri.toString());
            a.f241245k = 55;
            a.f241244j = true;
            return this.f271156b.mo80852a(mo80351ic(this.f271157c, "DataFetcherWorker", C118575h.GRAPH_BUBBLE_DATA_FETCHER), C89066v.f241382a, new C89018ap(a.mo82989a(), C89009ag.f241207b));
        } catch (MalformedURLException e) {
            ((C59052c) ((C59052c) ((C59052c) f271155a.mo56226d()).mo56382g(e)).mo56372aa(18468)).mo56386p("Cannot perform task with url");
            int i = C90755l.f253831a;
            C60567ur urVar = (C60567ur) C60570uu.f164299i.createBuilder();
            urVar.copyOnWrite();
            C60570uu uuVar = (C60570uu) urVar.instance;
            uuVar.f164302b = 5;
            uuVar.f164301a |= 2;
            C97042e.m160625a(1219, (C60570uu) urVar.build());
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
