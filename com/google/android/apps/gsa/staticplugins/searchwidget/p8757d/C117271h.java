package com.google.android.apps.gsa.staticplugins.searchwidget.p8757d;

import android.content.Context;
import android.net.Uri;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6505af.p6506a.C84466a;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6879v.p6880a.C87242k;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6968aa.C89009ag;
import com.google.android.apps.gsa.shared.p6968aa.C89018ap;
import com.google.android.apps.gsa.shared.p6968aa.C89019aq;
import com.google.android.apps.gsa.shared.p6968aa.C89020ar;
import com.google.android.apps.gsa.shared.p6968aa.C89066v;
import com.google.android.apps.gsa.shared.p6995aq.C89257aa;
import com.google.android.apps.gsa.shared.p7012bb.C89356b;
import com.google.android.apps.gsa.shared.p7066m.C89985ax;
import com.google.android.apps.gsa.shared.p7195y.C91189au;
import com.google.android.apps.search.googleapp.searchwidget.p10480d.C139008h;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59661bo;
import com.google.common.p4552o.C59663bq;
import com.google.common.p4552o.C59687cb;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.net.MalformedURLException;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.d.h */
/* compiled from: PG */
public final class C117271h {

    /* renamed from: a */
    public static final C59071e f325527a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.searchwidget.d.h");

    /* renamed from: b */
    public final C89257aa f325528b;

    /* renamed from: c */
    public final C42876ab f325529c;

    /* renamed from: d */
    public final C42876ab f325530d;

    /* renamed from: e */
    public final C42876ab f325531e;

    /* renamed from: f */
    public final C89859i f325532f;

    /* renamed from: g */
    private final Context f325533g;

    /* renamed from: h */
    private final C91189au f325534h;

    /* renamed from: i */
    private final C22871g f325535i;

    /* renamed from: j */
    private final C87242k f325536j;

    /* renamed from: k */
    private final String f325537k;

    /* renamed from: l */
    private final C84466a f325538l;

    public C117271h(Context context, C86124t tVar, C89257aa aaVar, C91189au auVar, C22871g gVar, C84466a aVar, C87242k kVar, C42876ab abVar, C42876ab abVar2, C42876ab abVar3, C89859i iVar) {
        this.f325533g = context;
        this.f325528b = aaVar;
        this.f325534h = auVar;
        this.f325535i = gVar;
        this.f325538l = aVar;
        this.f325536j = kVar;
        this.f325529c = abVar;
        this.f325530d = abVar2;
        this.f325531e = abVar3;
        this.f325532f = iVar;
        this.f325537k = tVar.mo79758x(C89985ax.f246722e);
    }

    /* renamed from: a */
    public final C60870cx mo103222a(String str) {
        C89356b b = this.f325538l.mo78026b("SearchWidgetProvider", C118575h.SEARCH_WIDGET_PROVIDER_UPDATE, C118575h.SEARCH_WIDGET_PROVIDER_UPDATE);
        try {
            C89859i iVar = this.f325532f;
            C89856f fVar = new C89856f();
            fVar.f246201a = C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_DOWNLOAD_STARTED;
            C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
            C59661bo boVar = (C59661bo) C59663bq.f159984d.createBuilder();
            boVar.copyOnWrite();
            C59663bq bqVar = (C59663bq) boVar.instance;
            bqVar.f159986a |= 1;
            bqVar.f159987b = str;
            C59663bq bqVar2 = (C59663bq) boVar.build();
            ajVar.copyOnWrite();
            C59687cb cbVar = (C59687cb) ajVar.instance;
            bqVar2.getClass();
            cbVar.f160103ao = bqVar2;
            cbVar.f160122c |= 64;
            fVar.f246203c = (C59687cb) ajVar.build();
            iVar.mo74236a(fVar.mo83699a());
            C89019aq c = C89020ar.m144758c();
            c.mo82994f(this.f325537k);
            c.f241245k = 84;
            return C60922j.m93045h(this.f325536j.mo80852a(b, C89066v.f241382a, new C89018ap(c.mo82989a(), C89009ag.f241207b)), new C117264a(this, str), C60826bg.f164896a);
        } catch (MalformedURLException e) {
            C59104x c2 = f325527a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "SelectableWdgtMgr");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e)).mo56372aa(32798)).mo56389s("An error occurred while parsing the URL %s of the search provider proto", this.f325537k);
            this.f325532f.mo83702b(C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_DOWNLOAD_URL_MALFORMED);
            return C60856cj.m92899h(e);
        } catch (RuntimeException e2) {
            C59104x c3 = f325527a.mo56225c();
            c3.mo56378ag(C58975e.f156826a, "SelectableWdgtMgr");
            ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e2)).mo56372aa(32799)).mo56389s("An error occurred while downloading the search provider proto at url %s", this.f325537k);
            this.f325532f.mo83702b(C89849ae.SELECTABLE_SEARCH_WIDGET_PROVIDERS_DOWNLOAD_FAILED);
            return C60856cj.m92899h(e2);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo103223b(C139008h hVar, int i) {
        String str;
        float f = (float) this.f325533g.getResources().getDisplayMetrics().densityDpi;
        Uri uri = null;
        if (f <= 480.0f || (hVar.f378045a & 16) == 0) {
            str = (f <= 320.0f || (hVar.f378045a & 8) == 0) ? (f <= 240.0f || (hVar.f378045a & 4) == 0) ? (f <= 160.0f || (hVar.f378045a & 2) == 0) ? (hVar.f378045a & 1) != 0 ? hVar.f378046b : null : hVar.f378047c : hVar.f378048d : hVar.f378049e;
        } else {
            str = hVar.f378050f;
        }
        if (str != null && !str.isEmpty()) {
            uri = Uri.parse(str);
        }
        mo103224c(C89849ae.SELECTABLE_SEARCH_WIDGET_ICON_DOWNLOAD_STARTED, i);
        if (uri == null) {
            C59104x d = f325527a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "SelectableWdgtMgr");
            ((C59052c) ((C59052c) d).mo56372aa(32800)).mo56386p("Did not find image asset corresponding to url");
            mo103224c(C89849ae.SELECTABLE_SEARCH_WIDGET_ICON_URI_MISSING, i);
            return C60866ct.f164955a;
        }
        return this.f325535i.mo28205e(this.f325535i.mo28210j(this.f325534h.mo85425m(uri, C58836b.f156633a, 85), "downloadSearchWidgetProviderImage", new C117269f(this, uri, i)), "handleDownloadSearchWidgetProviderImageFailure", Throwable.class, new C117270g(this, uri, i));
    }

    /* renamed from: c */
    public final void mo103224c(C89849ae aeVar, int i) {
        C89859i iVar = this.f325532f;
        C89856f fVar = new C89856f();
        fVar.f246201a = aeVar;
        fVar.mo83701c("selectableSearchWidgetIconTypeId", i != 1 ? "TYPE_VOICE_ICON" : "TYPE_SEARCH_ICON");
        iVar.mo74236a(fVar.mo83699a());
    }
}
