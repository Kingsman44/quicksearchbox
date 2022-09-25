package com.google.android.apps.gsa.staticplugins.avocado;

import android.accounts.Account;
import android.app.DownloadManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.media.SoundPool;
import android.net.Uri;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.assistant.settings.features.av.aq;
import com.google.android.apps.gsa.assistant.settings.features.av.ar;
import com.google.android.apps.gsa.assistant.settings.features.av.bz;
import com.google.android.apps.gsa.assistant.settings.features.av.dm;
import com.google.android.apps.gsa.assistant.settings.features.av.dn;
import com.google.android.apps.gsa.assistant.settings.features.avocado.ai;
import com.google.android.apps.gsa.assistant.shared.n.l;
import com.google.android.apps.gsa.assistant.shared.n.t;
import com.google.android.apps.gsa.assistant.shared.p5824n.C73894n;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83893b;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83917d;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83923j;
import com.google.android.apps.gsa.p6487s3.p6488a.C84282c;
import com.google.android.apps.gsa.p6487s3.p6488a.C84283d;
import com.google.android.apps.gsa.p8889z.p8893c.p8901h.p8903b.C118919a;
import com.google.android.apps.gsa.p8889z.p8917f.p8918a.C119072a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6813n.C86183b;
import com.google.android.apps.gsa.shared.p6968aa.C89007ae;
import com.google.android.apps.gsa.shared.p6968aa.C89012aj;
import com.google.android.apps.gsa.shared.p6968aa.C89057m;
import com.google.android.apps.gsa.shared.p7066m.C90082eg;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.apps.gsa.speech.helper.C92302a;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92444a;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92448e;
import com.google.android.apps.gsa.speech.p7295k.p7297b.C92452i;
import com.google.android.apps.gsa.speech.p7298l.p7300b.C92461a;
import com.google.android.apps.gsa.staticplugins.hotwordenrollment.C101495ac;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3861at.C49875cf;
import com.google.assistant.p3861at.C49879cj;
import com.google.assistant.p3861at.C49883cn;
import com.google.assistant.p3861at.C49891cv;
import com.google.assistant.p3861at.C49893cx;
import com.google.assistant.p3861at.C49897da;
import com.google.assistant.p3861at.C49898db;
import com.google.assistant.p3861at.C49902df;
import com.google.assistant.p3861at.C49903dg;
import com.google.assistant.p3861at.act;
import com.google.assistant.p3861at.acw;
import com.google.assistant.p3861at.acx;
import com.google.assistant.p3897e.p3929l.p3930a.C52692ay;
import com.google.assistant.p3897e.p3929l.p3930a.C52695ba;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4541l.C59337t;
import com.google.common.p4543n.p4546c.C59407o;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60870cx;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import com.google.p395al.p408c.p414c.p416b.C8466ai;
import com.google.protobuf.C62963cj;
import com.google.protobuf.C62971cq;
import com.google.speech.p5208h.C66595bu;
import com.google.speech.p5208h.C66599by;
import com.google.speech.p5208h.C66611ci;
import com.google.speech.p5208h.C66615cm;
import dagger.C68214a;
import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONObject;
import p3186j$.time.Duration;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.staticplugins.avocado.dh */
/* compiled from: PG */
public final class C94256dh {

    /* renamed from: a */
    public static final C59071e f263378a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.avocado.dh");

    /* renamed from: b */
    public static final Duration f263379b = Duration.ofSeconds(2);

    /* renamed from: A */
    private final C90931ca f263380A;

    /* renamed from: B */
    private final C119072a f263381B;

    /* renamed from: C */
    private final String f263382C;

    /* renamed from: D */
    private final C68214a f263383D;

    /* renamed from: E */
    private final C68214a f263384E;

    /* renamed from: F */
    private final C9439b f263385F;

    /* renamed from: G */
    private final C92461a f263386G;

    /* renamed from: H */
    private final C101495ac f263387H;

    /* renamed from: c */
    int f263388c = 60;

    /* renamed from: d */
    public final C86124t f263389d;

    /* renamed from: e */
    public final C89012aj f263390e;

    /* renamed from: f */
    public final C68214a f263391f;

    /* renamed from: g */
    public final C22871g f263392g;

    /* renamed from: h */
    public final C22871g f263393h;

    /* renamed from: i */
    public final l f263394i;

    /* renamed from: j */
    public final C59407o f263395j = C59407o.m92309e(C59407o.m92308d(Duration.ofMillis(1000)), 20);

    /* renamed from: k */
    public final C83893b f263396k;

    /* renamed from: l */
    public final C86054o f263397l;

    /* renamed from: m */
    public final ai f263398m;

    /* renamed from: n */
    public final C94200bf f263399n;

    /* renamed from: o */
    long f263400o;

    /* renamed from: p */
    long f263401p;

    /* renamed from: q */
    SoundPool f263402q;

    /* renamed from: r */
    boolean f263403r;

    /* renamed from: s */
    boolean f263404s;

    /* renamed from: t */
    int f263405t;

    /* renamed from: u */
    int f263406u;

    /* renamed from: v */
    public final Map f263407v = new HashMap();

    /* renamed from: w */
    public C59407o f263408w;

    /* renamed from: x */
    public BroadcastReceiver f263409x;

    /* renamed from: y */
    private final C89994f f263410y;

    /* renamed from: z */
    private final C92302a f263411z;

    public C94256dh(C89994f fVar, C89012aj ajVar, C68214a aVar, C119072a aVar2, C92302a aVar3, C90931ca caVar, C22871g gVar, C22871g gVar2, C92461a aVar4, String str, l lVar, C83893b bVar, C86054o oVar, C86124t tVar, C68214a aVar5, C94200bf bfVar, C68214a aVar6, ai aiVar, C83880an anVar, C101495ac acVar) {
        this.f263410y = fVar;
        this.f263390e = ajVar;
        this.f263391f = aVar;
        this.f263411z = aVar3;
        this.f263386G = aVar4;
        this.f263380A = caVar;
        this.f263382C = str;
        this.f263381B = aVar2;
        this.f263392g = gVar;
        this.f263393h = gVar2;
        this.f263394i = lVar;
        this.f263396k = bVar;
        this.f263397l = oVar;
        this.f263389d = tVar;
        this.f263383D = aVar5;
        this.f263399n = bfVar;
        this.f263384E = aVar6;
        this.f263398m = aiVar;
        C9439b a = C9439b.m23955a(anVar.mo77235i().f158062c);
        this.f263385F = a == null ? C9439b.UNKNOWN_ENTRY : a;
        this.f263387H = acVar;
    }

    /* renamed from: a */
    public static C94327n m155535a(act act, C83923j jVar) {
        C94326m mVar = (C94326m) C94327n.f263598g.createBuilder();
        ArrayList arrayList = new ArrayList();
        mVar.copyOnWrite();
        C94327n nVar = (C94327n) mVar.instance;
        nVar.f263600a |= 1;
        int i = 0;
        nVar.f263602d = false;
        if (act == null) {
            return (C94327n) mVar.build();
        }
        if ((act.f128894a & 64) == 0) {
            return (C94327n) mVar.build();
        }
        C49893cx cxVar = act.f128900g;
        if (cxVar == null) {
            cxVar = C49893cx.f129688b;
        }
        C62971cq cqVar = cxVar.f129690a;
        loop0:
        for (C83917d dVar : jVar.f228573b) {
            String str = dVar.f228555b;
            Iterator it = cqVar.iterator();
            while (true) {
                if (it.hasNext()) {
                    C49879cj cjVar = (C49879cj) it.next();
                    if (str.equals(cjVar.f129631b)) {
                        i++;
                        C49891cv cvVar = cjVar.f129639j;
                        if (cvVar == null) {
                            cvVar = C49891cv.f129647N;
                        }
                        C62963cj<C52692ay> cjVar2 = new C62963cj(cvVar.f129677o, C49891cv.f129649p);
                        if (!cjVar2.isEmpty()) {
                            arrayList.addAll(cjVar2);
                            for (C52692ay ayVar : cjVar2) {
                                ((C59052c) ((C59052c) f263378a.mo56225c()).mo56372aa(14304)).mo56387q("Error code returned: %d", ayVar.f138334n);
                            }
                        } else {
                            C49891cv cvVar2 = cjVar.f129639j;
                            if (((cvVar2 == null ? C49891cv.f129647N : cvVar2).f129663a & 65536) == 0) {
                                return (C94327n) mVar.build();
                            }
                            if (cvVar2 == null) {
                                cvVar2 = C49891cv.f129647N;
                            }
                            int a = C52695ba.m86691a(cvVar2.f129676n);
                            if (a != 0 && a == 2) {
                            }
                        }
                    }
                }
            }
            return (C94327n) mVar.build();
        }
        if (!arrayList.isEmpty()) {
            ((C59052c) ((C59052c) f263378a.mo56225c()).mo56372aa(14298)).mo56386p("Error happened, stop retrying.");
            mVar.mo88461a(arrayList);
            return (C94327n) mVar.build();
        } else if (i != jVar.f228573b.size()) {
            ((C59052c) ((C59052c) f263378a.mo56225c()).mo56372aa(14297)).mo56389s("Some devices not found in the returned settings. Device list is %s", jVar.f228573b);
            return (C94327n) mVar.build();
        } else {
            mVar.copyOnWrite();
            C94327n nVar2 = (C94327n) mVar.instance;
            nVar2.f263600a |= 1;
            nVar2.f263602d = true;
            return (C94327n) mVar.build();
        }
    }

    /* renamed from: f */
    static String m155536f(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("user_id", str);
        jSONObject.put("play_ready_message", false);
        if (str2 != null) {
            jSONObject.put("version_info", str2);
        }
        return jSONObject.toString();
    }

    /* renamed from: i */
    public static void m155537i(C84282c cVar) {
        cVar.mo77820a(C118919a.m197405c(), true);
    }

    /* renamed from: j */
    static final DownloadManager.Request m155538j(String str, File file) {
        DownloadManager.Request request = new DownloadManager.Request(Uri.parse(str));
        request.setDestinationUri(Uri.fromFile(file));
        request.setVisibleInDownloadsUi(false);
        request.setNotificationVisibility(2);
        return request;
    }

    /* renamed from: k */
    static final C66611ci m155539k(C89057m mVar) {
        C84283d dVar;
        try {
            dVar = new C84283d(new C89007ae(mVar.mo83034a()));
            try {
                C66611ci a = dVar.mo77821a();
                C59337t.m92223c(dVar);
                return a;
            } catch (Throwable th) {
                th = th;
                C59337t.m92223c(dVar);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            dVar = null;
            C59337t.m92223c(dVar);
            throw th;
        }
    }

    /* renamed from: l */
    static final File m155540l(Context context, String str) {
        File externalCacheDir = context.getExternalCacheDir();
        if (externalCacheDir != null) {
            return new File(externalCacheDir, str);
        }
        ((C59052c) ((C59052c) f263378a.mo56225c()).mo56372aa(14349)).mo56386p("Cannot open external cache directory");
        return null;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C60870cx mo88408b(Account account, C83923j jVar) {
        C58833ax axVar;
        if (this.f263387H.mo92325d()) {
            axVar = this.f263387H.mo92324c();
        } else {
            axVar = C58836b.f156633a;
        }
        if ((jVar.f228572a & 1) != 0) {
            aq createBuilder = ar.f.createBuilder();
            C45595b i = dn.i(this.f263385F);
            createBuilder.copyOnWrite();
            ar arVar = createBuilder.instance;
            arVar.b = i.f119929nK;
            arVar.a |= 1;
            if (axVar.mo56113h()) {
                String str = (String) axVar.mo56107c();
                createBuilder.copyOnWrite();
                ar arVar2 = createBuilder.instance;
                str.getClass();
                arVar2.a |= 8;
                arVar2.e = str;
            }
            dn dnVar = (dn) this.f263384E.mo27525b();
            String str2 = jVar.f228574c;
            dnVar.l(str2);
            C58485gu n = C58485gu.m89846n(str2);
            List list = (List) Collection.EL.stream(dnVar.c.f129690a).filter(new dm(str2)).map(bz.a).collect(Collectors.toList());
            acx e = dn.e(new acx[]{dnVar.b(list, true), dnVar.z(n, 4, false)});
            dnVar.F(n, 4, false);
            dnVar.m(list, true);
            return dnVar.h(e, createBuilder.build());
        }
        String b = this.f263399n.mo88400b();
        ((C59052c) ((C59052c) f263378a.mo56224b()).mo56372aa(14314)).mo56389s("Start enable. version info %s", b);
        this.f263394i.g(b);
        t b2 = C73894n.m108499b();
        t tVar = b2;
        tVar.c = C58833ax.m90833j(account);
        tVar.d = C58833ax.m90833j(this.f263398m.a());
        C49897da daVar = (C49897da) C49898db.f129704b.createBuilder();
        for (C83917d dVar : jVar.f228573b) {
            C49902df dfVar = (C49902df) C49903dg.f129712g.createBuilder();
            String str3 = dVar.f228555b;
            dfVar.copyOnWrite();
            C49903dg dgVar = (C49903dg) dfVar.instance;
            str3.getClass();
            dgVar.f129714a |= 1;
            dgVar.f129715b = str3;
            C49875cf cfVar = C49875cf.MANHATTAN;
            dfVar.copyOnWrite();
            C49903dg dgVar2 = (C49903dg) dfVar.instance;
            dgVar2.f129716c = cfVar.f129621v;
            dgVar2.f129714a |= 2;
            C49883cn cnVar = (C49883cn) C49891cv.f129647N.createBuilder();
            cnVar.copyOnWrite();
            C49891cv cvVar = (C49891cv) cnVar.instance;
            cvVar.f129663a |= 8192;
            cvVar.f129673k = true;
            dfVar.copyOnWrite();
            C49903dg dgVar3 = (C49903dg) dfVar.instance;
            C49891cv cvVar2 = (C49891cv) cnVar.build();
            cvVar2.getClass();
            dgVar3.f129719f = cvVar2;
            dgVar3.f129714a |= 32;
            daVar.mo53371b(dfVar);
        }
        acw acw = (acw) acx.f128971H.createBuilder();
        acw.copyOnWrite();
        acx acx = (acx) acw.instance;
        C49898db dbVar = (C49898db) daVar.build();
        dbVar.getClass();
        acx.f128991h = dbVar;
        acx.f128984a |= 32;
        b2.c((acx) acw.build());
        tVar.j = C58833ax.m90834k(getClass().getSimpleName());
        if (axVar.mo56113h()) {
            b2.b(axVar);
        }
        return this.f263394i.c(b2, 10, TimeUnit.SECONDS);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C8466ai mo88409c() {
        C8466ai aiVar = this.f263381B.mo104108d().f29444c;
        return aiVar == null ? C8466ai.f29395g : aiVar;
    }

    /* renamed from: d */
    public final C66599by mo88410d() {
        try {
            return (C66599by) C90877ak.m148473g(this.f263380A.mo85138c(new C92448e(this.f263410y, "video-writer", this.f263386G, this.f263382C, (amo) null, (String) null, (String) null)), 2000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ((C59052c) ((C59052c) ((C59052c) f263378a.mo56225c()).mo56382g(e)).mo56372aa(14346)).mo56386p("Unable to fetch S3ClientInfo");
            return null;
        }
    }

    /* renamed from: e */
    public final C66615cm mo88411e(Account account, C66595bu buVar) {
        C90931ca caVar = this.f263380A;
        C92444a aVar = new C92444a();
        aVar.mo87128d(this.f263411z);
        aVar.mo87130f(this.f263410y);
        aVar.f257829j = C58833ax.m90833j(account);
        aVar.f257830k = C58833ax.m90833j(buVar);
        try {
            return (C66615cm) C90877ak.m148473g(caVar.mo85138c(new C92452i(aVar.mo87125a())), 2000, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) f263378a.mo56225c()).mo56382g(e)).mo56372aa(14347)).mo56389s("Unable to fetch S3UserInfo with AuthToken; Exception: %s", e);
            return null;
        } catch (TimeoutException e2) {
            ((C59052c) ((C59052c) ((C59052c) f263378a.mo56225c()).mo56382g(e2)).mo56372aa(14348)).mo56389s("Timeout for S3UserInfo fetch with AuthToken; Exception: %s", e2);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final void mo88412g(Context context, boolean z) {
        SoundPool soundPool;
        SoundPool soundPool2;
        C58485gu c = this.f263389d.mo79745c(C90082eg.f249983bt);
        String str = (String) (z ? c.get(1) : c.get(0));
        if (z) {
            File l = m155540l(context, "photo-complete.wav");
            if (l != null && l.length() == 0) {
                this.f263401p = ((C86183b) this.f263383D.mo27525b()).mo79821c(m155538j(str, l), 683);
            } else if (l != null && (soundPool2 = this.f263402q) != null) {
                this.f263406u = soundPool2.load(l.getPath(), 1);
            }
        } else {
            File l2 = m155540l(context, "photo-capture.wav");
            if (l2 != null && l2.length() == 0) {
                this.f263400o = ((C86183b) this.f263383D.mo27525b()).mo79821c(m155538j(str, l2), 683);
            } else if (l2 != null && (soundPool = this.f263402q) != null) {
                this.f263405t = soundPool.load(l2.getPath(), 1);
            }
        }
    }

    /* renamed from: h */
    public final void mo88413h(boolean z) {
        int i;
        boolean z2;
        SoundPool soundPool = this.f263402q;
        if (soundPool != null) {
            if (z) {
                i = this.f263406u;
            } else {
                i = this.f263405t;
            }
            int i2 = i;
            if (z) {
                z2 = this.f263404s;
            } else {
                z2 = this.f263403r;
            }
            if (z2) {
                int play = soundPool.play(i2, 1.0f, 1.0f, 0, 0, 1.0f);
                C59071e eVar = f263378a;
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(14352)).mo56387q("the sound played is %d", i2);
                if (play == 0) {
                    ((C59052c) ((C59052c) eVar.mo56225c()).mo56372aa(14353)).mo56387q("Failed to play sound: [%d]", i2);
                    return;
                }
                return;
            }
            ((C59052c) ((C59052c) f263378a.mo56225c()).mo56372aa(14351)).mo56387q("The sound we are trying to play is not loaded yet: [%d]", i2);
        }
    }
}
