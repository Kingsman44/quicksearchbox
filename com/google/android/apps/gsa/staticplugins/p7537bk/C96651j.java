package com.google.android.apps.gsa.staticplugins.p7537bk;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6566aw.C84753a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.net.MalformedURLException;

/* renamed from: com.google.android.apps.gsa.staticplugins.bk.j */
/* compiled from: PG */
public final class C96651j extends C86734a implements C84753a {

    /* renamed from: a */
    public static final C59071e f270396a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bk.j");

    /* renamed from: b */
    public final Context f270397b;

    /* renamed from: c */
    public final C21370a f270398c;

    /* renamed from: f */
    public final C68214a f270399f;

    /* renamed from: g */
    public final C68214a f270400g;

    /* renamed from: h */
    protected long f270401h = -1;

    /* renamed from: i */
    private final C22871g f270402i;

    /* renamed from: j */
    private final C22871g f270403j;

    /* renamed from: k */
    private final C84466a f270404k;

    public C96651j(Context context, C21370a aVar, C22871g gVar, C22871g gVar2, C68214a aVar2, C68214a aVar3, C84466a aVar4) {
        super(C118575h.WORKER_NETWORK_IMAGE_LOADER, "networkimageloader");
        this.f270397b = context;
        this.f270398c = aVar;
        this.f270402i = gVar;
        this.f270403j = gVar2;
        this.f270399f = aVar2;
        this.f270400g = aVar3;
        this.f270404k = aVar4;
    }

    /* renamed from: c */
    public static final Uri m160157c(Uri uri) {
        return Uri.parse(uri.getQueryParameter("url"));
    }

    /* renamed from: e */
    public static final C89020ar m160158e(Uri uri, int i) {
        try {
            C89019aq a = C89020ar.m144756a();
            a.mo82994f(uri.toString());
            a.f241244j = true;
            a.f241245k = i;
            return a.mo82989a();
        } catch (MalformedURLException e) {
            C59104x d = f270396a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "NetworkImageLoaderWork");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e)).mo56372aa(20756)).mo56389s("Failed to load %s", uri);
            int i2 = C90755l.f253831a;
            return null;
        }
    }

    /* renamed from: f */
    public static final int m160159f(Uri uri) {
        String queryParameter = uri.getQueryParameter("tag");
        if (queryParameter != null) {
            return Integer.parseInt(queryParameter);
        }
        return 18;
    }

    /* renamed from: a */
    public final C60870cx mo78461a(Uri uri, boolean z) {
        try {
            C89356b a = this.f270404k.mo78025a("NetworkImageLoaderWorker", 522, 517);
            if (!z) {
                return this.f270403j.mo28201a("Fetch and save image to disk", new C96649h(this, uri, a));
            }
            return this.f270402i.mo28201a("Fetch image in memory", new C96650i(this, uri, a));
        } catch (NullPointerException e) {
            C59104x c = f270396a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NetworkImageLoaderWork");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(20757)).mo56389s("Error fetching file: %s", uri);
            throw e;
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
