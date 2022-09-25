package com.google.android.apps.gsa.staticplugins.searchwidget;

import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.google.C85966dl;
import com.google.android.apps.gsa.search.core.google.p6796f.C85981c;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6519al.p6676cv.C85225a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.net.MalformedURLException;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.f */
/* compiled from: PG */
public final class C117275f {

    /* renamed from: a */
    public final C86338r f325550a;

    /* renamed from: b */
    public final C86124t f325551b;

    /* renamed from: c */
    public final C22871g f325552c;

    /* renamed from: d */
    public final C85225a f325553d;

    /* renamed from: e */
    public Uri f325554e = null;

    /* renamed from: f */
    private final C85929cw f325555f;

    /* renamed from: g */
    private final C68214a f325556g;

    /* renamed from: h */
    private final C84466a f325557h;

    public C117275f(C86338r rVar, C86124t tVar, C85929cw cwVar, C84466a aVar, C68214a aVar2, C22871g gVar, C85225a aVar3) {
        this.f325550a = rVar;
        this.f325551b = tVar;
        this.f325555f = cwVar;
        this.f325557h = aVar;
        this.f325556g = aVar2;
        this.f325552c = gVar;
        this.f325553d = aVar3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final C60870cx mo103227a() {
        if (!this.f325550a.contains("search_widget_doodle_url") && !this.f325550a.contains("search_widget_doodle_alt_text") && !this.f325550a.contains("search_widget_doodle_image")) {
            return C118826c.f331423b;
        }
        C86337q b = this.f325550a.mo80076b();
        b.mo80075j("search_widget_doodle_url");
        b.mo80075j("search_widget_doodle_image");
        b.mo80075j("search_widget_doodle_alt_text");
        b.apply();
        return this.f325553d.mo78806d();
    }

    /* renamed from: b */
    public final C60870cx mo103228b() {
        try {
            C85929cw cwVar = this.f325555f;
            C85981c h = cwVar.mo79568h(cwVar.mo79564d(cwVar.mo79568h(cwVar.mo79563b(false)).f232493a, "/async/ddljson"));
            h.mo79638d("client", cwVar.f232330f.mo79758x(C89985ax.f246686aM));
            h.mo79641g();
            if (cwVar.f232328d.getResources().getConfiguration().getLayoutDirection() == 1) {
                h.mo79638d("rtl", "1");
            }
            if (cwVar.f232330f.mo79746e(C89985ax.f246687aN)) {
                h.mo79638d("data_push_epoch", "2000000002");
            }
            UriRequest b = cwVar.mo79566f(h).mo79626b((C85966dl) null);
            Uri uri = b.f236331a;
            this.f325554e = uri;
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(uri.toString());
            c.mo82991c(b.mo81502a());
            c.f241245k = 19;
            C89020ar a = c.mo82989a();
            return this.f325552c.mo28209i(((C87242k) this.f325556g.mo27525b()).mo80852a(this.f325557h.mo78026b("RefreshDoodleDataTask", C118575h.GRAPH_REFRESH_WIDGET_DOODLE, C118575h.GRAPH_REFRESH_WIDGET_DOODLE), C89066v.f241382a, new C89018ap(a, C89009ag.f241207b)), "processDoodleDataResponse", C117274e.f325549a);
        } catch (MalformedURLException e) {
            return C60856cj.m92899h(e);
        }
    }

    /* renamed from: c */
    public final C60870cx mo103229c(String str, String str2) {
        try {
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(str);
            c.f241245k = 19;
            C89020ar a = c.mo82989a();
            return this.f325552c.mo28210j(((C87242k) this.f325556g.mo27525b()).mo80852a(this.f325557h.mo78026b("DownloadWidgetDoodleImage", C118575h.GRAPH_REFRESH_WIDGET_DOODLE, C118575h.GRAPH_REFRESH_WIDGET_DOODLE), C89066v.f241382a, new C89018ap(a, C89009ag.f241207b)), "processDoodleImage", new C117263d(this, str2, str));
        } catch (MalformedURLException e) {
            return C60856cj.m92899h(e);
        }
    }
}
