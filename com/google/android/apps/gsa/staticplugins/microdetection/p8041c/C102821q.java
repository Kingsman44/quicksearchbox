package com.google.android.apps.gsa.staticplugins.microdetection.p8041c;

import android.app.DownloadManager;
import android.content.Context;
import android.net.Uri;
import android.webkit.URLUtil;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.hotword.c.z;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6813n.C86183b;
import com.google.android.apps.gsa.search.core.preferences.C86337q;
import com.google.android.apps.gsa.search.core.preferences.C86338r;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.speech.dumper.C90548ak;
import com.google.android.apps.gsa.shared.speech.dumper.EventForDump;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90580b;
import com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f;
import com.google.android.apps.gsa.shared.util.C90725ai;
import com.google.android.apps.gsa.shared.util.C91123v;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90748e;
import com.google.android.apps.gsa.shared.util.permissions.ProxyIntentStarter;
import com.google.android.apps.gsa.speech.hotword.p7283b.C92351a;
import com.google.android.apps.gsa.speech.microdetection.adapter.C92518d;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92489a;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92490b;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92493e;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92494f;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7305b.C92495g;
import com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92509c;
import com.google.android.apps.gsa.tasks.C118472ag;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118522by;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.gsa.tasks.C118561t;
import com.google.android.libraries.mdi.download.C28806cu;
import com.google.android.libraries.mdi.download.C28807cv;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2878f.C37188a;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import dagger.C68214a;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.microdetection.c.q */
/* compiled from: PG */
public final class C102821q implements C118549h, C90991b {

    /* renamed from: a */
    public static final C59071e f287099a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.microdetection.c.q");

    /* renamed from: b */
    public final C86338r f287100b;

    /* renamed from: c */
    public final C68214a f287101c;

    /* renamed from: d */
    public final C68214a f287102d;

    /* renamed from: e */
    public final C68214a f287103e;

    /* renamed from: f */
    public final C68214a f287104f;

    /* renamed from: g */
    public final Context f287105g;

    /* renamed from: h */
    public final C68214a f287106h;

    /* renamed from: i */
    public final C92518d f287107i;

    /* renamed from: j */
    public final ProxyIntentStarter f287108j;

    /* renamed from: k */
    private final C68214a f287109k;

    /* renamed from: l */
    private final C68214a f287110l;

    /* renamed from: m */
    private final C68214a f287111m;

    /* renamed from: n */
    private final C68214a f287112n;

    /* renamed from: o */
    private final C68214a f287113o;

    /* renamed from: p */
    private final C68214a f287114p;

    /* renamed from: q */
    private final C37215b f287115q;

    /* renamed from: r */
    private final C68214a f287116r;

    /* renamed from: s */
    private final C68214a f287117s;

    /* renamed from: t */
    private final C68214a f287118t;

    /* renamed from: u */
    private final C42813k f287119u;

    /* renamed from: v */
    private final z f287120v;

    /* renamed from: w */
    private final C91123v f287121w;

    public C102821q(C68214a aVar, C86338r rVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, Context context, C68214a aVar5, C68214a aVar6, C37215b bVar, C68214a aVar7, C68214a aVar8, C68214a aVar9, C68214a aVar10, C68214a aVar11, C68214a aVar12, C68214a aVar13, C68214a aVar14, C42813k kVar, C91022f fVar, z zVar, C92518d dVar, ProxyIntentStarter proxyIntentStarter, C91123v vVar) {
        this.f287109k = aVar;
        this.f287100b = rVar;
        this.f287110l = aVar2;
        this.f287111m = aVar3;
        this.f287112n = aVar4;
        this.f287105g = context;
        this.f287113o = aVar5;
        this.f287114p = aVar6;
        this.f287115q = bVar;
        this.f287101c = aVar7;
        this.f287116r = aVar8;
        this.f287102d = aVar9;
        this.f287117s = aVar10;
        this.f287118t = aVar11;
        this.f287103e = aVar12;
        this.f287104f = aVar13;
        this.f287106h = aVar14;
        this.f287119u = kVar;
        this.f287120v = zVar;
        this.f287107i = dVar;
        this.f287108j = proxyIntentStarter;
        this.f287121w = vVar;
        fVar.mo85301a(this);
    }

    /* renamed from: k */
    private final synchronized C60870cx m170511k(String str, C90584f fVar, String str2) {
        String str3 = str;
        C90584f fVar2 = fVar;
        synchronized (this) {
            C59071e eVar = f287099a;
            C59104x b = eVar.mo56224b();
            b.mo56378ag(C58975e.f156826a, "ModelDownloadController");
            ((C59052c) ((C59052c) b).mo56372aa(21187)).mo56354G("#maybeDownloadHotwordModelWithMDD with locale: %s, modelType: %s.", str, fVar);
            mo93466f(C89849ae.HOTWORD_MODEL_MDD_QUERIED);
            m170512l(C58836b.f156633a);
            String a = C102826v.m170531a(fVar);
            if ("mdd-".concat(str2).equals(this.f287100b.getString(C90725ai.m148179a(str, a), (String) null))) {
                String a2 = C92509c.m152171a(str, fVar, this.f287105g, (C29409fd) this.f287102d.mo27525b(), this.f287119u, true);
                if (a2.length() == 0) {
                    C59104x c = eVar.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "ModelDownloadController");
                    ((C59052c) ((C59052c) c).mo56372aa(21190)).mo56386p("mdd shared preference exists but the model doesn't!");
                }
                if (a2.length() != 0 || !((C86124t) this.f287101c.mo27525b()).mo79746e(C90082eg.f250081r)) {
                    mo93466f(C89849ae.HOTWORD_MODEL_MDD_DOWNLOAD_AND_INSTALLATION_SKIPPED);
                    C59104x b2 = eVar.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "ModelDownloadController");
                    ((C59052c) ((C59052c) b2).mo56372aa(21188)).mo56386p("Skipping MDD query because model was already downloaded for locale");
                    C60870cx cxVar = C118826c.f331423b;
                    return cxVar;
                }
                C59104x b3 = eVar.mo56224b();
                b3.mo56378ag(C58975e.f156826a, "ModelDownloadController");
                ((C59052c) ((C59052c) b3).mo56372aa(21189)).mo56386p("Don't skip the MDD download even though shared preference exists because model doesn't exist and the flag is true.");
            }
            C60870cx g = C60846c.m92878g(C60922j.m93044g(C60922j.m93045h(((C102810f) this.f287116r.mo27525b()).mo19336b((C29409fd) this.f287102d.mo27525b()), new C102813i(this, str, fVar), C60826bg.f164896a), new C102814j(this, fVar, str, a, str2), (Executor) this.f287117s.mo27525b()), Exception.class, new C102815k(this), (Executor) this.f287117s.mo27525b());
            return g;
        }
    }

    /* renamed from: l */
    private final void m170512l(C58833ax axVar) {
        C28806cu h = C28807cv.m53759h();
        h.mo34460d(true);
        C60856cj.m92911t(C60922j.m93044g(((C29409fd) this.f287102d.mo27525b()).mo34718g(h.mo34462f()), C47810es.m84963c(C102812h.f287084a), (Executor) this.f287118t.mo27525b()), C47810es.m84974n(new C102820p(axVar)), (Executor) this.f287118t.mo27525b());
    }

    /* renamed from: m */
    private final synchronized void m170513m(String str, String str2, C90584f fVar) {
        C89849ae aeVar;
        boolean isValidUrl = URLUtil.isValidUrl(str);
        if (!isValidUrl) {
            mo93466f(C89849ae.HOTWORD_MODEL_LOOKING_IN_ASSETS);
        }
        C59071e eVar = f287099a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ModelDownloadController");
        ((C59052c) ((C59052c) b).mo56372aa(21209)).mo56386p("Handle the downloaded hotword model");
        if (str.equals(this.f287100b.getString(C90725ai.m148179a(str2, "silent_enrollment_hotword_location"), (String) null))) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "ModelDownloadController");
            ((C59052c) ((C59052c) b2).mo56372aa(21212)).mo56386p("the model is already used");
            if (isValidUrl) {
                mo93466f(C89849ae.HOTWORD_MODEL_LEGACY_ALREADY_DOWNLOADED);
                mo93466f(C89849ae.HOTWORD_MODEL_LEGACY_DOWNLOAD_SKIPPED);
                return;
            }
            mo93466f(C89849ae.HOTWORD_MODEL_ASSET_FILE_ALREADY_ENROLLED);
        } else if (mo93468h(str, str2, fVar)) {
            C59104x b3 = eVar.mo56224b();
            b3.mo56378ag(C58975e.f156826a, "ModelDownloadController");
            ((C59052c) ((C59052c) b3).mo56372aa(21211)).mo56389s("process baked model %s", str);
            if (isValidUrl) {
                mo93466f(C89849ae.HOTWORD_MODEL_LEGACY_ALREADY_DOWNLOADED);
                mo93466f(C89849ae.HOTWORD_MODEL_LEGACY_DOWNLOAD_SKIPPED);
            } else {
                mo93466f(C89849ae.HOTWORD_MODEL_ASSET_FILE_ENROLLMENT_STARTED);
            }
            ((C89859i) this.f287114p.mo27525b()).mo83702b(C89849ae.SILENT_ENROLLMENT_START_BAKED_IN_HOTWORD_MODEL);
            ((C118561t) this.f287111m.mo27525b()).mo103754e(C118522by.SPEAKERID_SILENT_ENROLLMENT, C118472ag.f328819i);
            this.f287115q.mo19974a(C37188a.f98369m);
            C60856cj.m92911t(this.f287120v.a(), C47810es.m84974n(new C102816l(this)), (Executor) this.f287117s.mo27525b());
        } else {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ModelDownloadController");
            ((C59052c) ((C59052c) d).mo56372aa(21210)).mo56386p("Model was expected to be present but cannot be found!");
            if (isValidUrl) {
                aeVar = C89849ae.HOTWORD_MODEL_LEGACY_DOWNLOAD_SKIPPED;
            } else {
                aeVar = C89849ae.HOTWORD_MODEL_ASSET_FILE_NOT_FOUND;
            }
            mo93466f(aeVar);
        }
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        Object obj;
        int a;
        C58976aa aaVar = C58975e.f156826a;
        C62940bt r0 = C62942bv.checkIsLite(C92495g.f258128a);
        akVar.mo58887l(r0);
        if (akVar.f169962ag.mo58857o(r0.f169971d)) {
            C62940bt r02 = C62942bv.checkIsLite(C92495g.f258128a);
            akVar.mo58887l(r02);
            Object l = akVar.f169962ag.mo58854l(r02.f169971d);
            if (l == null) {
                obj = r02.f169969b;
            } else {
                obj = r02.mo58889c(l);
            }
            C92494f fVar = (C92494f) obj;
            int i = fVar.f258126c;
            int a2 = C92493e.m152146a(i);
            if ((a2 != 0 && a2 == 2) || ((a = C92493e.m152146a(i)) != 0 && a == 3)) {
                mo93466f(C89849ae.HOTWORD_MODEL_DOWNLOAD_CONFIG_CHANGE_DETECTED);
                String Z = ((C89994f) this.f287109k.mo27525b()).mo83863Z();
                if (!((C89994f) this.f287109k.mo27525b()).mo83834w()) {
                    return mo93463b(C90584f.OK_GOOGLE, Z);
                }
                C90584f fVar2 = C90584f.OK_HEY_GOOGLE;
                if (!((C89994f) this.f287109k.mo27525b()).mo83833v(fVar2, Z)) {
                    C86337q b = this.f287100b.mo80076b();
                    b.mo80067b("download_hotword_model_upgrade", true);
                    b.apply();
                }
                return mo93463b(fVar2, Z);
            } else if ((fVar.f258124a & 4) != 0) {
                mo93466f(C89849ae.HOTWORD_MODEL_DOWNLOAD_REQUEST);
                C90584f a3 = C90584f.m147800a(fVar.f258125b);
                if (a3 == null) {
                    a3 = C90584f.UNKNOWN;
                }
                return mo93463b(a3, fVar.f258127d);
            } else {
                C59104x c = f287099a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "ModelDownloadController");
                ((C59052c) ((C59052c) c).mo56372aa(21193)).mo56386p("locale must be provided!");
                return C118826c.f331423b;
            }
        } else {
            mo93466f(C89849ae.HOTWORD_MODEL_DOWNLOAD_REQUEST_PHONE_LOCALE_ONLY);
            return mo93463b(((C89994f) this.f287109k.mo27525b()).mo83827p(), ((C89994f) this.f287109k.mo27525b()).mo83863Z());
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final synchronized C60870cx mo93463b(C90584f fVar, String str) {
        boolean z;
        C59071e eVar = f287099a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ModelDownloadController");
        ((C59052c) ((C59052c) b).mo56372aa(21194)).mo56354G("requestHotwordModelUpdate modelType-%s modelLocale-%s", fVar, str);
        if (this.f287121w.mo85392d()) {
            C59104x b2 = eVar.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "ModelDownloadController");
            ((C59052c) ((C59052c) b2).mo56372aa(21202)).mo56386p("requestHotwordModelUpdate skipping download because this is a TV device.");
            return C118826c.f331423b;
        }
        String c = mo93464c(fVar, str);
        if (c != null) {
            if (!c.isEmpty()) {
                if (!((C86124t) this.f287101c.mo27525b()).mo79746e(C90082eg.f250020cd)) {
                    C90584f fVar2 = C90584f.UNKNOWN;
                    int ordinal = fVar.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            if (ordinal == 2) {
                                if (mo93470j(c, "last_google_home_hotword_model_downloaded_url", str, C90584f.OK_HEY_GOOGLE)) {
                                    z = mo93469i(C90584f.OK_HEY_GOOGLE, c, str);
                                } else {
                                    mo93466f(C89849ae.HOTWORD_MODEL_LEGACY_DOWNLOAD_SKIPPED);
                                }
                            }
                        } else if (mo93470j(c, "last_hotword_model_downloaded_url", str, C90584f.OK_GOOGLE)) {
                            z = mo93469i(C90584f.OK_GOOGLE, c, str);
                        } else {
                            m170513m(c, str, C90584f.OK_GOOGLE);
                        }
                        if (!z) {
                        }
                        return C118826c.f331423b;
                    }
                    C59104x c2 = eVar.mo56225c();
                    c2.mo56378ag(C58975e.f156826a, "ModelDownloadController");
                    ((C59052c) ((C59052c) c2).mo56372aa(21200)).mo56386p("#requestHotwordModelDownload - skipping due to unknown model type");
                    mo93466f(C89849ae.HOTWORD_MODEL_LEGACY_DOWNLOAD_SKIPPED);
                    C59104x b3 = eVar.mo56224b();
                    b3.mo56378ag(C58975e.f156826a, "ModelDownloadController");
                    ((C59052c) ((C59052c) b3).mo56372aa(21197)).mo56386p("Model download not requested.");
                    mo93465e();
                    return C118826c.f331423b;
                } else if (!URLUtil.isValidUrl(c)) {
                    C59104x b4 = eVar.mo56224b();
                    b4.mo56378ag(C58975e.f156826a, "ModelDownloadController");
                    ((C59052c) ((C59052c) b4).mo56372aa(21201)).mo56386p("MDD hotword model download ignored; looking for model in assets.");
                    m170513m(c, str, fVar);
                    mo93465e();
                    return C118826c.f331423b;
                } else {
                    return m170511k(str, fVar, c);
                }
            }
        }
        C59104x c3 = eVar.mo56225c();
        c3.mo56378ag(C58975e.f156826a, "ModelDownloadController");
        ((C59052c) ((C59052c) c3).mo56372aa(21195)).mo56389s("Invalid hotword model location: location is null or empty: %s", c);
        mo93465e();
        mo93466f(C89849ae.HOTWORD_MODEL_GENERIC_DOWNLOAD_FAILURE);
        return C118826c.f331423b;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final synchronized String mo93464c(C90584f fVar, String str) {
        C90580b bVar = (C90580b) ((C92351a) this.f287112n.mo27525b()).mo87000b(fVar, C58833ax.m90834k(true)).get(str);
        if (bVar != null) {
            String str2 = bVar.f253241c;
            C58976aa aaVar = C58975e.f156826a;
            return str2;
        }
        C59104x c = f287099a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "ModelDownloadController");
        ((C59052c) ((C59052c) c).mo56372aa(21205)).mo56386p("Failed fetching the hotword model location configuration");
        return null;
    }

    /* renamed from: e */
    public final void mo93465e() {
        C86337q b = this.f287100b.mo80076b();
        b.mo80075j("download_hotword_model_upgrade");
        b.apply();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final void mo93466f(C89849ae aeVar) {
        if (!((C86124t) this.f287101c.mo27525b()).mo79746e(C90082eg.f249883Z)) {
            C58976aa aaVar = C58975e.f156826a;
        } else {
            ((C89859i) this.f287114p.mo27525b()).mo83702b(aeVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final synchronized void mo93467g(long j, String str, String str2, long j2, String str3) {
        C92489a aVar = (C92489a) C92490b.f258114f.createBuilder();
        aVar.copyOnWrite();
        C92490b bVar = (C92490b) aVar.instance;
        bVar.f258116a |= 1;
        bVar.f258117b = j;
        aVar.copyOnWrite();
        C92490b bVar2 = (C92490b) aVar.instance;
        str3.getClass();
        bVar2.f258116a |= 2;
        bVar2.f258118c = str3;
        aVar.copyOnWrite();
        C92490b bVar3 = (C92490b) aVar.instance;
        bVar3.f258116a |= 4;
        bVar3.f258119d = str;
        aVar.copyOnWrite();
        C92490b bVar4 = (C92490b) aVar.instance;
        bVar4.f258116a |= 16;
        bVar4.f258120e = j2;
        C86337q b = this.f287100b.mo80076b();
        b.mo80068c(str2, ((C92490b) aVar.build()).toByteArray());
        b.apply();
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C59104x b = f287099a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ModelDownloadController");
        ((C59052c) ((C59052c) b).mo56372aa(21207)).mo56386p("Processing state dump for MDD hotword model filegroups");
        m170512l(C58833ax.m90834k(fVar));
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0042, code lost:
        return false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x007f, code lost:
        return false;
     */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean mo93468h(java.lang.String r5, java.lang.String r6, com.google.android.apps.gsa.shared.speech.hotword.p7143a.C90584f r7) {
        /*
            r4 = this;
            monitor-enter(r4)
            boolean r0 = android.webkit.URLUtil.isValidUrl(r5)     // Catch:{ all -> 0x0097 }
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L_0x0043
            android.content.Context r0 = r4.f287105g     // Catch:{ all -> 0x0097 }
            java.io.File r0 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g.m152174c(r0, r6, r7)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0013
            r0 = 1
            goto L_0x0014
        L_0x0013:
            r0 = 0
        L_0x0014:
            android.content.Context r3 = r4.f287105g     // Catch:{ all -> 0x0097 }
            byte[] r5 = com.google.android.apps.gsa.speech.microdetection.p7303a.p7308e.C92513g.m152177f(r3, r5, r6, r7)     // Catch:{ all -> 0x0097 }
            if (r5 == 0) goto L_0x001e
            r5 = 1
            goto L_0x001f
        L_0x001e:
            r5 = 0
        L_0x001f:
            com.google.common.f.e r6 = f287099a     // Catch:{ all -> 0x0097 }
            com.google.common.f.x r6 = r6.mo56224b()     // Catch:{ all -> 0x0097 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0097 }
            java.lang.String r3 = "ModelDownloadController"
            r6.mo56378ag(r7, r3)     // Catch:{ all -> 0x0097 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0097 }
            r7 = 21216(0x52e0, float:2.973E-41)
            com.google.common.f.x r6 = r6.mo56372aa(r7)     // Catch:{ all -> 0x0097 }
            com.google.common.f.c r6 = (com.google.common.p4526f.C59052c) r6     // Catch:{ all -> 0x0097 }
            java.lang.String r7 = "model file Path exist %b, model exist %b"
            r6.mo56358K(r7, r0, r5)     // Catch:{ all -> 0x0097 }
            if (r0 == 0) goto L_0x0041
            if (r5 == 0) goto L_0x0041
            monitor-exit(r4)
            return r1
        L_0x0041:
            monitor-exit(r4)
            return r2
        L_0x0043:
            r6 = 47
            int r6 = r5.lastIndexOf(r6)     // Catch:{ IOException -> 0x0080 }
            if (r6 <= 0) goto L_0x0050
            java.lang.String r7 = r5.substring(r2, r6)     // Catch:{ IOException -> 0x0080 }
            goto L_0x0052
        L_0x0050:
            java.lang.String r7 = ""
        L_0x0052:
            int r0 = r5.length()     // Catch:{ IOException -> 0x0080 }
            int r0 = r0 + -1
            if (r6 >= r0) goto L_0x0060
            int r6 = r6 + r1
            java.lang.String r5 = r5.substring(r6)     // Catch:{ IOException -> 0x0080 }
            goto L_0x0062
        L_0x0060:
            java.lang.String r5 = ""
        L_0x0062:
            com.google.common.f.aa r6 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ IOException -> 0x0080 }
            android.content.Context r6 = r4.f287105g     // Catch:{ IOException -> 0x0080 }
            android.content.res.AssetManager r6 = r6.getAssets()     // Catch:{ IOException -> 0x0080 }
            java.lang.String[] r6 = r6.list(r7)     // Catch:{ IOException -> 0x0080 }
            if (r6 == 0) goto L_0x007e
            int r7 = r6.length     // Catch:{ IOException -> 0x0080 }
            if (r7 != 0) goto L_0x0074
            goto L_0x007e
        L_0x0074:
            java.util.List r6 = java.util.Arrays.asList(r6)     // Catch:{ IOException -> 0x0080 }
            boolean r5 = r6.contains(r5)     // Catch:{ IOException -> 0x0080 }
            monitor-exit(r4)
            return r5
        L_0x007e:
            monitor-exit(r4)
            return r2
        L_0x0080:
            r5 = move-exception
            com.google.common.f.e r6 = f287099a     // Catch:{ all -> 0x0097 }
            com.google.common.f.x r6 = r6.mo56225c()     // Catch:{ all -> 0x0097 }
            com.google.common.f.aa r7 = com.google.common.p4526f.p4527a.C58975e.f156826a     // Catch:{ all -> 0x0097 }
            java.lang.String r0 = "ModelDownloadController"
            r6.mo56378ag(r7, r0)     // Catch:{ all -> 0x0097 }
            java.lang.String r7 = "Cannot file hotword model file locally"
            r0 = 21215(0x52df, float:2.9729E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r6).mo56382g(r5)).mo56372aa(r0)).mo56386p(r7)     // Catch:{ all -> 0x0097 }
            monitor-exit(r4)
            return r2
        L_0x0097:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.microdetection.p8041c.C102821q.mo93468h(java.lang.String, java.lang.String, com.google.android.apps.gsa.shared.speech.hotword.a.f):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public final boolean mo93469i(C90584f fVar, String str, String str2) {
        C90748e.m148224b();
        C59104x b = f287099a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ModelDownloadController");
        ((C59052c) ((C59052c) b).mo56372aa(21218)).mo56386p("#requestHotwordModelDownload");
        C90584f fVar2 = C90584f.UNKNOWN;
        String str3 = fVar.ordinal() != 2 ? "pending_hotword_model_download_info" : "pending_xgoogle_hotword_model_download_info";
        C92490b bVar = null;
        byte[] e = this.f287100b.mo80079e(str3, (byte[]) null);
        if (e != null) {
            try {
                bVar = (C92490b) C62942bv.parseFrom((C62942bv) C92490b.f258114f, e);
            } catch (C62974ct e2) {
                C59104x d = f287099a.mo56226d();
                d.mo56378ag(C58975e.f156826a, "ModelDownloadController");
                ((C59052c) ((C59052c) ((C59052c) d).mo56382g(e2)).mo56372aa(21182)).mo56386p("Couldn't load HotwordModelDownloadInfo");
            }
        }
        if (bVar != null) {
            if (str.equals(bVar.f258119d)) {
                if (System.currentTimeMillis() - bVar.f258120e < 120000) {
                    C59104x b2 = f287099a.mo56224b();
                    b2.mo56378ag(C58975e.f156826a, "ModelDownloadController");
                    ((C59052c) ((C59052c) b2).mo56372aa(21223)).mo56386p("Model download canceled - previously pending request found");
                    mo93466f(C89849ae.HOTWORD_MODEL_LEGACY_DOWNLOAD_SKIPPED);
                    return false;
                }
            }
            long j = bVar.f258117b;
            try {
                ((C86183b) this.f287110l.mo27525b()).mo79820b(j);
            } catch (Exception e3) {
                C59104x d2 = f287099a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "ModelDownloadController");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e3)).mo56372aa(21222)).mo56388r("Failed removing the downloadId %d.", j);
            }
            C89949q.m146523g(289);
        }
        ((C90548ak) this.f287113o.mo27525b()).mo84668b(2, EventForDump.m147676e(8, str), BuildConfig.FLAVOR);
        C59071e eVar = f287099a;
        C59104x b3 = eVar.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "ModelDownloadController");
        ((C59052c) ((C59052c) b3).mo56372aa(21180)).mo56386p("Generating model download request");
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setVisibleInDownloadsUi(false);
        request.setNotificationVisibility(2);
        request.setAllowedOverMetered(true);
        request.setAllowedOverRoaming(true);
        long c = ((C86183b) this.f287110l.mo27525b()).mo79821c(request, 218);
        if (c == Long.MAX_VALUE) {
            C59104x d3 = eVar.mo56226d();
            d3.mo56378ag(C58975e.f156826a, "ModelDownloadController");
            ((C59052c) ((C59052c) d3).mo56372aa(21220)).mo56388r("Model download error-%d", Long.MAX_VALUE);
            mo93466f(C89849ae.HOTWORD_MODEL_LEGACY_DOWNLOAD_FAILED);
            return false;
        }
        C89949q.m146523g(287);
        mo93467g(c, str, str3, System.currentTimeMillis(), str2);
        mo93466f(C89849ae.HOTWORD_MODEL_LEGACY_DOWNLOAD_STARTED);
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final synchronized boolean mo93470j(String str, String str2, String str3, C90584f fVar) {
        String string = this.f287100b.getString(C90725ai.m148179a(str3, str2), (String) null);
        C59071e eVar = f287099a;
        C59104x b = eVar.mo56224b();
        b.mo56378ag(C58975e.f156826a, "ModelDownloadController");
        ((C59052c) ((C59052c) b).mo56372aa(21224)).mo56354G("shouldDownloadModel: modelLocale is %s, type is %s", str3, fVar);
        if (str.isEmpty()) {
            C59104x d = eVar.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ModelDownloadController");
            ((C59052c) ((C59052c) d).mo56372aa(21227)).mo56386p("The new hotword model location is empty.");
            return false;
        }
        if (string != null) {
            if (string.equals(str) && mo93468h(str, str3, fVar)) {
                mo93466f(C89849ae.HOTWORD_MODEL_LEGACY_ALREADY_DOWNLOADED);
                C59104x b2 = eVar.mo56224b();
                b2.mo56378ag(C58975e.f156826a, "ModelDownloadController");
                ((C59052c) ((C59052c) b2).mo56372aa(21226)).mo56386p("We already downloaded model from given location.");
                return false;
            }
        }
        C59104x b3 = eVar.mo56224b();
        b3.mo56378ag(C58975e.f156826a, "ModelDownloadController");
        ((C59052c) ((C59052c) b3).mo56372aa(21225)).mo56389s("Is model location URL valid: %b", Boolean.valueOf(URLUtil.isValidUrl(str)));
        return URLUtil.isValidUrl(str);
    }
}
