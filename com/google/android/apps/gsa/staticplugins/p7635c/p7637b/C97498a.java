package com.google.android.apps.gsa.staticplugins.p7635c.p7637b;

import android.content.Context;
import android.net.Uri;
import android.os.RemoteException;
import android.view.MotionEvent;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6519al.p6729e.C85461a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.libraries.gcoreclient.p1734a.p1735a.p1736a.C21408a;
import com.google.android.libraries.gcoreclient.p1763h.C21526a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.c.b.a */
/* compiled from: PG */
public final class C97498a extends C86734a implements C85461a {

    /* renamed from: a */
    private static final C59071e f272296a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.c.b.a");

    /* renamed from: b */
    private final Context f272297b;

    /* renamed from: c */
    private final String f272298c;

    /* renamed from: f */
    private C21408a f272299f;

    public C97498a(Context context, C68214a aVar) {
        super(C118575h.WORKER_ADSHIELD, "adshieldlite");
        this.f272297b = context;
        this.f272298c = "gsa.a.".concat(String.valueOf(String.valueOf(aVar)));
    }

    /* renamed from: e */
    private final synchronized C21408a m161413e() {
        if (this.f272299f == null) {
            this.f272299f = new C21408a(this.f272298c, this.f272297b);
        }
        return this.f272299f;
    }

    /* renamed from: a */
    public final C60870cx mo78987a(MotionEvent motionEvent) {
        try {
            m161413e().f59883a.mo117451b(motionEvent);
        } catch (Exception e) {
            ((C59052c) ((C59052c) ((C59052c) f272296a.mo56225c()).mo56382g(e)).mo56372aa(13779)).mo56386p("Error adding the touch event to adshield with exception");
        }
        return C118826c.f331423b;
    }

    /* renamed from: c */
    public final C60870cx mo78988c(Uri uri) {
        try {
            C21408a e = m161413e();
            return C60856cj.m92900i(uri.buildUpon().appendQueryParameter(e.f59883a.f387150a.mo117449e(), e.f59883a.mo117450a(this.f272297b, uri.getQueryParameter("ai"))).build());
        } catch (RemoteException | C21526a e2) {
            return C60856cj.m92899h(e2);
        }
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
