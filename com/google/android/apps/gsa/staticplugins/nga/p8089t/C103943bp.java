package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import android.content.Context;
import android.content.pm.PackageManager;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.api.C74714bo;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.C90773bq;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.C103799g;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122184e;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122185f;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122191l;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122194o;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17136an;
import com.google.android.libraries.assistant.p1363c.p1371b.p1379f.C17157t;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.C28740br;
import com.google.android.libraries.mdi.download.C28746bx;
import com.google.android.libraries.mdi.download.C28804cs;
import com.google.android.libraries.mdi.download.C28805ct;
import com.google.android.libraries.mdi.download.C28807cv;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.C29663j;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p3186j$.util.Optional;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.bp */
/* compiled from: PG */
public final class C103943bp {

    /* renamed from: a */
    public static final C58974d f289282a = C58974d.m91136j();

    /* renamed from: i */
    private static final Pattern f289283i = Pattern.compile("\\d+(\\.\\d+)*");

    /* renamed from: b */
    public final Context f289284b;

    /* renamed from: c */
    public final C68214a f289285c;

    /* renamed from: d */
    public final C68214a f289286d;

    /* renamed from: e */
    public final C68214a f289287e;

    /* renamed from: f */
    public final C68214a f289288f;

    /* renamed from: g */
    public final C104126w f289289g;

    /* renamed from: h */
    public final C122191l f289290h;

    /* renamed from: j */
    private final C68214a f289291j;

    /* renamed from: k */
    private final C22871g f289292k;

    /* renamed from: l */
    private final C22871g f289293l;

    /* renamed from: m */
    private C60870cx f289294m = null;

    public C103943bp(Context context, C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C68214a aVar5, C22871g gVar, C22871g gVar2, C104126w wVar, C122191l lVar) {
        this.f289284b = context;
        this.f289285c = aVar;
        this.f289286d = aVar2;
        this.f289287e = aVar3;
        this.f289288f = aVar4;
        this.f289291j = aVar5;
        this.f289292k = gVar;
        this.f289293l = gVar2;
        this.f289289g = wVar;
        this.f289290h = lVar;
    }

    /* renamed from: f */
    public static String m171877f(C104126w wVar, Context context) {
        try {
            String c = C90773bq.m148321c(context);
            Matcher matcher = f289283i.matcher(c);
            if (matcher.find()) {
                return matcher.group();
            }
            wVar.mo93948a(5, String.format(Locale.US, "Failed to parse APK version '%s'.", new Object[]{c}));
            return "0";
        } catch (PackageManager.NameNotFoundException unused) {
            wVar.mo93948a(6, "Failed to get APK version.");
            return "0";
        }
    }

    /* renamed from: g */
    private final C60870cx m171878g(C60870cx cxVar) {
        return this.f289292k.mo28205e(cxVar, "[NGA] NgaDownloadConfigManager.catchError", Exception.class, C103932be.f289264a);
    }

    /* renamed from: h */
    private final synchronized C60870cx m171879h() {
        if (this.f289294m == null) {
            this.f289294m = this.f289293l.mo28201a("[NGA] NgaDownloadConfigManager.getLocalDownloadConfig", new C103928ba(this));
        }
        return this.f289294m;
    }

    /* renamed from: a */
    public final C60870cx mo93888a(C28740br brVar) {
        return this.f289292k.mo28209i(((C29409fd) this.f289285c.mo27525b()).mo34714c(brVar), "[NGA] NgaDownloadConfigManager.downloadFileGroup", C103930bc.f289262a);
    }

    /* renamed from: b */
    public final C60870cx mo93889b(C28807cv cvVar) {
        C22871g gVar = this.f289292k;
        C122191l lVar = this.f289290h;
        C122184e eVar = (C122184e) C122185f.f338875f.createBuilder();
        String m = C17136an.m34278m(Optional.ofNullable(cvVar.mo34463a().mo56111f()));
        eVar.copyOnWrite();
        m.getClass();
        ((C122185f) eVar.instance).f338881e = m;
        String str = (String) cvVar.mo34464b().mo56109e(BuildConfig.FLAVOR);
        eVar.copyOnWrite();
        str.getClass();
        ((C122185f) eVar.instance).f338880d = str;
        String languageTag = ((C103799g) this.f289286d.mo27525b()).mo93859b().toLanguageTag();
        eVar.copyOnWrite();
        languageTag.getClass();
        ((C122185f) eVar.instance).f338878b = languageTag;
        boolean e = cvVar.mo34467e();
        eVar.copyOnWrite();
        ((C122185f) eVar.instance).f338877a = e;
        boolean d = cvVar.mo34466d();
        eVar.copyOnWrite();
        ((C122185f) eVar.instance).f338879c = d;
        return gVar.mo28209i(C17157t.m34305a(C70876o.m103760a(lVar.f189039a.mo39510a(C122194o.m201734b(), lVar.f189040b), (C122185f) eVar.build())), "[NGA] getClientFileGroups.parse", C103929bb.f289261a);
    }

    /* renamed from: c */
    public final C60870cx mo93890c() {
        C103942bo boVar;
        C22871g gVar = this.f289292k;
        long a = ((C86124t) this.f289288f.mo27525b()).mo79743a(C90126fx.f251007ag);
        C103942bo[] values = C103942bo.values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                ((C58970a) ((C58970a) f289282a.mo56224b()).mo56372aa(21697)).mo56388r("Failed to parse SourceMode: flagValue=%d", a);
                boVar = C103942bo.MERGE_AFTER_INITIAL_DOWNLOAD;
                break;
            }
            boVar = values[i];
            if (boVar.f289279e == a) {
                break;
            }
            i++;
        }
        ArrayList arrayList = new ArrayList();
        if (boVar.f289280f) {
            arrayList.add(m171878g(m171879h()));
        }
        if (boVar.f289281g.test(Boolean.valueOf(!((C74714bo) this.f289291j.mo27525b()).mo71082e()))) {
            C28804cs f = C28805ct.m53747f();
            ((C29663j) f).f80313a = "nga_sot_configs";
            arrayList.add(m171878g(this.f289293l.mo28209i(((C29409fd) this.f289285c.mo27525b()).mo34717f(f.mo34447a()), "[NGA] NgaDownloadConfigManager.fetchDownloadConfig", new C103936bi(this))));
        }
        return gVar.mo28210j(this.f289292k.mo28209i(C60856cj.m92896e(arrayList), "[NGA] NgaDownloadConfigManager.getDownloadConfig.mergeConfigs", C103935bh.f289267a), "[NGA] NgaDownloadConfigManager.getLatestDataGroups", new C103931bd(this));
    }

    /* renamed from: d */
    public final C60870cx mo93891d(C28746bx bxVar) {
        return bxVar.mo19336b((C29409fd) this.f289285c.mo27525b());
    }

    /* renamed from: e */
    public final C60870cx mo93892e() {
        if (!((C86124t) this.f289288f.mo27525b()).mo79746e(C90126fx.f251273fh)) {
            return C60866ct.f164955a;
        }
        return this.f289292k.mo28205e(this.f289293l.mo28202b("[NGA] NgaDownloadConfigManager.verifyAllPendingGroups", new C103939bl(this)), "[NGA] NgaDownloadConfigManager.verifyAllPendingGroups.catchError", Exception.class, C103926az.f289258a);
    }
}
