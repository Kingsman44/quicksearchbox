package com.google.android.apps.gsa.plugins.nativeresults.canvas.worker;

import android.net.Uri;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89041bl;
import com.google.android.apps.gsa.shared.p6968aa.C89042bm;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import java.net.MalformedURLException;
import java.nio.charset.Charset;
import java.nio.charset.UnsupportedCharsetException;
import java.util.Map;
import p3186j$.nio.charset.StandardCharsets;

/* renamed from: com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.m */
/* compiled from: PG */
public final class C84138m extends C84143r {

    /* renamed from: a */
    public static final C59071e f229089a = C59071e.m91332i("com.google.android.apps.gsa.plugins.nativeresults.canvas.worker.m");

    /* renamed from: b */
    private static final C89042bm f229090b = new C89041bl(new int[]{200, 204, 302, 301});

    /* renamed from: c */
    private final C22871g f229091c;

    /* renamed from: d */
    private final C89012aj f229092d;

    /* renamed from: e */
    private final C84150y f229093e;

    /* renamed from: f */
    private final C85923cq f229094f;

    public C84138m(C22871g gVar, C89012aj ajVar, C84150y yVar, C85923cq cqVar) {
        this.f229091c = gVar;
        this.f229092d = ajVar;
        this.f229093e = yVar;
        this.f229094f = cqVar;
    }

    /* renamed from: a */
    public static ParcelableFetcherResponse m134089a() {
        ParcelableFetcherResponse parcelableFetcherResponse = new ParcelableFetcherResponse();
        parcelableFetcherResponse.f57759c = false;
        return parcelableFetcherResponse;
    }

    /* renamed from: d */
    public static Charset m134090d(C89057m mVar) {
        String a = mVar.mo82999g().mo83000a("Content-Encoding", (String) null);
        if (a != null) {
            try {
                return Charset.forName(a);
            } catch (UnsupportedCharsetException unused) {
                C59104x d = f229089a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "CrossProcessFetcher");
                ((C59052c) ((C59052c) d).mo56372aa(7061)).mo56386p("Received unsupported encoding error, defaulting to ISO_8859_1");
            }
        }
        return StandardCharsets.ISO_8859_1;
    }

    /* renamed from: e */
    public static void m134091e(C84147v vVar, ParcelableFetcherResponse parcelableFetcherResponse) {
        try {
            vVar.mo77529a(parcelableFetcherResponse);
        } catch (RemoteException e) {
            C59104x c = f229089a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "CrossProcessFetcher");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(7062)).mo56386p("Executing IFetcherCallback failed.");
        }
    }

    /* renamed from: b */
    public final String mo77574b() {
        return this.f229094f.mo83211i();
    }

    /* renamed from: c */
    public final String mo77575c() {
        return this.f229094f.mo83212j();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo77576f(Uri uri, boolean z, Map map, int i, C84147v vVar) {
        try {
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(uri.toString());
            c.f241245k = 13;
            c.f241239e = z;
            c.f241250p = f229090b;
            if (map != null) {
                for (Map.Entry entry : map.entrySet()) {
                    c.mo82990b((String) entry.getKey(), (String) entry.getValue());
                }
            }
            C60856cj.m92911t(this.f229092d.mo27495f(c.mo82989a(), C89009ag.f241207b, this.f229092d.mo27510b(C89066v.f241382a)), new C84137l(vVar), C60826bg.f164896a);
        } catch (MalformedURLException e) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("exception", e);
            try {
                this.f229093e.mo77566d(i, 458754, bundle, (byte[]) null);
            } catch (RemoteException e2) {
                C59104x c2 = f229089a.mo56225c();
                c2.mo56378ag(C58975e.f156826a, "CrossProcessFetcher");
                ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(7063)).mo56386p("RemoteException while logging error event: ");
            }
            m134091e(vVar, m134089a());
        }
    }

    /* renamed from: g */
    public final void mo77577g(int i, C84147v vVar, Uri uri, boolean z, Map map) {
        this.f229091c.mo28212l("ComponentView fetch", new C84136k(this, uri, z, map, i, vVar));
    }
}
