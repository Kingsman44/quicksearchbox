package com.google.android.apps.gsa.staticplugins.p7391an.p7400g;

import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.google.C85854al;
import com.google.android.apps.gsa.search.core.google.C85857ao;
import com.google.android.apps.gsa.search.core.google.C85902by;
import com.google.android.apps.gsa.search.core.google.C85908cb;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.C85963di;
import com.google.android.apps.gsa.search.core.google.C85966dl;
import com.google.android.apps.gsa.search.core.google.C86074p;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6805i.C86127w;
import com.google.android.apps.gsa.search.core.p6812m.C86180b;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.core.preferences.C86341u;
import com.google.android.apps.gsa.search.core.preferences.C86346z;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89037bh;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.search.doodle.DoodleData;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90880an;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import dagger.C68214a;
import java.net.MalformedURLException;
import java.util.concurrent.ExecutionException;

/* renamed from: com.google.android.apps.gsa.staticplugins.an.g.f */
/* compiled from: PG */
final class C94022f extends C90880an {

    /* renamed from: a */
    private static final C59071e f262642a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.an.g.f");

    /* renamed from: b */
    private final C86338r f262643b;

    /* renamed from: c */
    private final C85929cw f262644c;

    /* renamed from: d */
    private final C68214a f262645d;

    /* renamed from: e */
    private final C87242k f262646e;

    /* renamed from: f */
    private final C86180b f262647f;

    /* renamed from: g */
    private final C84466a f262648g;

    public C94022f(C86127w wVar, C85929cw cwVar, C68214a aVar, C84466a aVar2, C87242k kVar, C86180b bVar) {
        super("RefreshDoodle", 1, 12);
        this.f262643b = wVar.f232790a.mo79722a();
        this.f262644c = cwVar;
        this.f262645d = aVar;
        this.f262648g = aVar2;
        this.f262646e = kVar;
        this.f262647f = bVar;
    }

    /* renamed from: b */
    public final C58833ax call() {
        DoodleData doodleData;
        C90748e.m148224b();
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long currentTimeMillis = System.currentTimeMillis();
            doodleData = null;
            if (!((C89037bh) this.f262645d.mo27525b()).mo27385k()) {
                C86341u uVar = new C86341u((C86346z) this.f262643b);
                long j = elapsedRealtime + 900000;
                uVar.mo80085k("doodle_update_time", Long.valueOf(j));
                uVar.mo80086l(false);
                C85929cw cwVar = this.f262644c;
                C85981c h = cwVar.mo79568h(cwVar.mo79564d(cwVar.mo79568h(cwVar.mo79563b(false)).f232493a, "/async/ddljson"));
                h.mo79641g();
                h.mo79638d("client", ((C85908cb) cwVar.f232336l.mo27525b()).mo79534a());
                h.mo79638d("hl", ((C85854al) cwVar.f232343s.mo27525b()).mo79488a());
                ((C85902by) cwVar.f232339o.mo27525b()).mo79530g(h);
                ((C85857ao) cwVar.f232337m.mo27525b()).mo79490c(h);
                C86074p pVar = (C86074p) cwVar.f232335k.mo27525b();
                pVar.mo79715c(h, true, false, pVar.mo79714b());
                String string = cwVar.f232333i.getString("launcher", BuildConfig.FLAVOR);
                if (!TextUtils.isEmpty(string)) {
                    h.mo79637c(h.f232497e, "X-Launcher-Type", string);
                }
                ((C85963di) cwVar.f232342r.mo27525b()).mo79491a(h);
                UriRequest b = cwVar.mo79566f(h).mo79626b((C85966dl) null);
                Uri uri = b.f236331a;
                C89019aq c = C89020ar.m144758c();
                c.mo82994f(uri.toString());
                c.mo82991c(b.mo81502a());
                c.f241244j = true;
                c.f241245k = 19;
                byte[] f = ((C89057m) C90877ak.m148472f(this.f262646e.mo80852a(this.f262648g.mo78025a("RefreshDoodleConfigTask", 349, 11), C89066v.f241382a, new C89018ap(c.mo82989a(), C89009ag.f241207b)))).mo83036f();
                C86180b bVar = this.f262647f;
                DoodleData a = (f == null || f.length <= 0) ? null : bVar.mo79816a(uri, f);
                C86341u uVar2 = new C86341u((C86346z) bVar.f232876a);
                uVar2.mo80085k("doodle_update_time", Long.valueOf(j));
                if (a != null) {
                    uVar2.mo80068c("doodle_bytes", f);
                    uVar2.mo80073h("doodle_uri", uri.toString());
                    uVar2.mo80085k("doodle_expiration_time", Long.valueOf(currentTimeMillis + a.f252951q));
                } else {
                    uVar2.mo80075j("doodle_bytes");
                    uVar2.mo80075j("doodle_uri");
                    uVar2.mo80075j("doodle_expiration_time");
                }
                uVar2.mo80086l(false);
                doodleData = a;
            }
        } catch (C89013ak | C90457d | InterruptedException | MalformedURLException | ExecutionException e) {
            if (!(e instanceof MalformedURLException)) {
                if (!(e instanceof ExecutionException)) {
                    ((C59052c) ((C59052c) ((C59052c) f262642a.mo56225c()).mo56382g(e)).mo56372aa(19428)).mo56386p("Error downloading doodle.");
                }
            }
            ((C59052c) ((C59052c) ((C59052c) f262642a.mo56226d()).mo56382g(e)).mo56372aa(19427)).mo56386p("Error downloading doodle.");
            int i = C90755l.f253831a;
        } catch (Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) f262642a.mo56226d()).mo56382g(th)).mo56372aa(19426)).mo56386p("Error fetching doodle config");
            int i2 = C90755l.f253831a;
            return C58836b.f156633a;
        }
        return C58833ax.m90833j(doodleData);
    }
}
