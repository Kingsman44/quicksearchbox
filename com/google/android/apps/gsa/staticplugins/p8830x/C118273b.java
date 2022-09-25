package com.google.android.apps.gsa.staticplugins.p8830x;

import android.content.pm.PackageManager;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6759t.C85598a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60870cx;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.x.b */
/* compiled from: PG */
public final class C118273b extends C86734a implements C85598a {

    /* renamed from: a */
    public static final C59071e f328334a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.x.b");

    /* renamed from: b */
    public final PackageManager f328335b;

    /* renamed from: c */
    public final String f328336c;

    /* renamed from: f */
    public final C69464a f328337f;

    /* renamed from: g */
    private final C22871g f328338g;

    /* renamed from: h */
    private final Object f328339h = new Object();

    /* renamed from: i */
    private C60870cx f328340i;

    public C118273b(C22871g gVar, PackageManager packageManager, String str, C69464a aVar) {
        super(C118575h.WORKER_CERTIFICATE, "certificate");
        this.f328338g = gVar;
        this.f328335b = packageManager;
        this.f328336c = str;
        this.f328337f = aVar;
    }

    /* renamed from: a */
    public final C60870cx mo79089a() {
        C60870cx cxVar;
        synchronized (this.f328339h) {
            if (this.f328340i == null) {
                this.f328340i = this.f328338g.mo28201a("getAndroidCertFingerprint", new C118270a(this));
            }
            cxVar = this.f328340i;
        }
        return cxVar;
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return false;
    }
}
