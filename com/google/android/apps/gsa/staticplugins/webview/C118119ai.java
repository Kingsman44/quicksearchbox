package com.google.android.apps.gsa.staticplugins.webview;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.webkit.ValueCallback;
import android.webkit.WebBackForwardList;
import androidx.annotation.C0826b;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.search.core.C85747ck;
import com.google.android.apps.gsa.search.core.C85757cq;
import com.google.android.apps.gsa.search.core.google.C85854al;
import com.google.android.apps.gsa.search.core.google.C85862at;
import com.google.android.apps.gsa.search.core.google.C85923cq;
import com.google.android.apps.gsa.search.core.google.C85929cw;
import com.google.android.apps.gsa.search.core.p6519al.p6725ds.C85453c;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.core.p6816p.C86230bm;
import com.google.android.apps.gsa.search.core.p6816p.C86231bn;
import com.google.android.apps.gsa.search.core.webview.C87262h;
import com.google.android.apps.gsa.search.core.webview.C87266l;
import com.google.android.apps.gsa.search.core.webview.C87278x;
import com.google.android.apps.gsa.search.shared.api.C87504b;
import com.google.android.apps.gsa.search.shared.api.UriRequest;
import com.google.android.apps.gsa.shared.logger.C89886e;
import com.google.android.apps.gsa.shared.logger.C89911f;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p6968aa.C89013ak;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.apps.gsa.shared.p7030bj.C89691d;
import com.google.android.apps.gsa.shared.p7066m.C90117fo;
import com.google.android.apps.gsa.shared.p7066m.C90120fr;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.shared.util.p7159c.C90931ca;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.C21383f;
import com.google.android.libraries.search.location.p3029a.C38657ca;
import com.google.android.libraries.search.location.p3029a.C38658cb;
import com.google.common.base.C58833ax;
import com.google.common.base.C58835az;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.SettableFuture;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.webview.ai */
/* compiled from: PG */
public final class C118119ai implements C89688a, C90991b {

    /* renamed from: a */
    public static final C59071e f327777a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.webview.ai");

    /* renamed from: af */
    private static final C118118ah f327778af = new C118118ah(Query.f252741b.f252749G);

    /* renamed from: ag */
    private static final AtomicInteger f327779ag = new AtomicInteger();

    /* renamed from: b */
    public static final C58485gu f327780b = C58485gu.m89847o("/setprefs", "/save/agsa");

    /* renamed from: c */
    public static final byte[] f327781c = new byte[0];

    /* renamed from: A */
    public final C118258o f327782A;

    /* renamed from: B */
    public final C118114ad f327783B;

    /* renamed from: C */
    public final C38658cb f327784C;

    /* renamed from: D */
    C118260q f327785D;

    /* renamed from: E */
    final List f327786E = new ArrayList();

    /* renamed from: F */
    public final Context f327787F;

    /* renamed from: G */
    volatile C87278x f327788G;

    /* renamed from: H */
    public C118263t f327789H;

    /* renamed from: I */
    public boolean f327790I;

    /* renamed from: J */
    boolean f327791J = true;

    /* renamed from: K */
    public C85747ck f327792K;

    /* renamed from: L */
    public C118183cq f327793L;

    /* renamed from: M */
    public long f327794M;

    /* renamed from: N */
    public boolean f327795N;

    /* renamed from: O */
    public C60870cx f327796O = C60856cj.m92898g();

    /* renamed from: P */
    public final AtomicReference f327797P;

    /* renamed from: Q */
    public boolean f327798Q;

    /* renamed from: R */
    Deque f327799R;

    /* renamed from: S */
    public final Object f327800S = new Object();

    /* renamed from: T */
    public String f327801T;

    /* renamed from: U */
    public C87504b f327802U;

    /* renamed from: V */
    C86231bn f327803V;

    /* renamed from: W */
    public final Map f327804W = new HashMap();

    /* renamed from: X */
    public String f327805X;

    /* renamed from: Y */
    public volatile long f327806Y;

    /* renamed from: Z */
    final Object f327807Z = new Object();

    /* renamed from: aa */
    final ArrayList f327808aa = new ArrayList();

    /* renamed from: ab */
    public volatile SettableFuture f327809ab;

    /* renamed from: ac */
    public volatile C60870cx f327810ac;

    /* renamed from: ad */
    public final C38657ca f327811ad = new C118113ac(this);

    /* renamed from: ae */
    public int f327812ae = 1;

    /* renamed from: ah */
    private C58495hd f327813ah;

    /* renamed from: ai */
    private C60870cx f327814ai = C60856cj.m92898g();

    /* renamed from: aj */
    private String f327815aj;

    /* renamed from: ak */
    private Query f327816ak;

    /* renamed from: al */
    private Query f327817al;

    /* renamed from: am */
    private final Object f327818am = new Object();

    /* renamed from: an */
    private long f327819an = 0;

    /* renamed from: ao */
    private volatile String f327820ao = BuildConfig.FLAVOR;

    /* renamed from: ap */
    private String f327821ap;

    /* renamed from: aq */
    private int f327822aq = 0;

    /* renamed from: d */
    public final Object f327823d = new Object();

    /* renamed from: e */
    final AtomicReference f327824e = new AtomicReference(f327778af);

    /* renamed from: f */
    public final C68214a f327825f;

    /* renamed from: g */
    final Queue f327826g = new C58425eo(30);

    /* renamed from: h */
    public C89691d f327827h;

    /* renamed from: i */
    String f327828i;

    /* renamed from: j */
    public C86230bm f327829j;

    /* renamed from: k */
    final C118117ag f327830k = new C118117ag(this);

    /* renamed from: l */
    public final C68214a f327831l;

    /* renamed from: m */
    public final C86124t f327832m;

    /* renamed from: n */
    public final C21370a f327833n;

    /* renamed from: o */
    public final C85923cq f327834o;

    /* renamed from: p */
    public final C85929cw f327835p;

    /* renamed from: q */
    public final C22871g f327836q;

    /* renamed from: r */
    public final C90931ca f327837r;

    /* renamed from: s */
    public final C87266l f327838s;

    /* renamed from: t */
    public final C58881cr f327839t;

    /* renamed from: u */
    public final C68214a f327840u;

    /* renamed from: v */
    public final C68214a f327841v;

    /* renamed from: w */
    public final C68214a f327842w;

    /* renamed from: x */
    public final C118264u f327843x;

    /* renamed from: y */
    public final C85854al f327844y;

    /* renamed from: z */
    public final C85862at f327845z;

    public C118119ai(C68214a aVar, C86124t tVar, C21370a aVar2, C85923cq cqVar, C85929cw cwVar, C22871g gVar, C90931ca caVar, C85757cq cqVar2, Context context, C68214a aVar3, C68214a aVar4, C68214a aVar5, C68214a aVar6, C118264u uVar, C87266l lVar, C85854al alVar, C85862at atVar, C118259p pVar, C38658cb cbVar, C118251h hVar) {
        C118259p pVar2 = pVar;
        this.f327831l = aVar;
        this.f327832m = tVar;
        this.f327833n = aVar2;
        this.f327834o = cqVar;
        this.f327835p = cwVar;
        this.f327836q = gVar;
        this.f327837r = caVar;
        this.f327838s = lVar;
        this.f327839t = cqVar2;
        this.f327840u = aVar3;
        this.f327842w = aVar6;
        this.f327843x = uVar;
        Context context2 = (Context) pVar2.f328304a.mo17428b();
        context2.getClass();
        C118256m mVar = (C118256m) pVar2.f328305b.mo17428b();
        mVar.getClass();
        hVar.getClass();
        this.f327782A = new C118258o(context2, mVar, hVar);
        this.f327783B = new C118114ad(this);
        mo103550x(Query.f252741b);
        mo103549w(Query.f252741b);
        this.f327787F = context;
        SettableFuture settableFuture = new SettableFuture();
        settableFuture.mo57356n(C118826c.f331422a);
        this.f327797P = new AtomicReference(settableFuture);
        this.f327825f = aVar4;
        this.f327841v = aVar5;
        this.f327844y = alVar;
        this.f327845z = atVar;
        this.f327784C = cbVar;
        if (f327779ag.incrementAndGet() == 2) {
            ((C89911f) aVar3.mo27525b()).mo83755a((Throwable) null, 35925218, 29).mo83721a();
        }
        this.f327829j = new C86230bm(C60856cj.m92898g());
    }

    /* renamed from: E */
    static final String m196237E(String str) {
        if (str == null) {
            return null;
        }
        int indexOf = str.indexOf(35);
        return indexOf > 0 ? str.substring(0, indexOf) : str;
    }

    /* renamed from: F */
    private final void m196238F(C58495hd hdVar) {
        synchronized (this.f327823d) {
            this.f327813ah = hdVar;
        }
        C58976aa aaVar = C58975e.f156826a;
    }

    /* renamed from: b */
    public static int m196239b(WebBackForwardList webBackForwardList, String str, int i) {
        while (i >= 0) {
            String url = webBackForwardList.getItemAtIndex(i).getUrl();
            if (!(str == null || url == null)) {
                int indexOf = str.indexOf(35);
                String substring = indexOf >= 0 ? str.substring(0, indexOf) : str;
                int indexOf2 = url.indexOf(35);
                if (indexOf2 >= 0) {
                    url = url.substring(0, indexOf2);
                }
                if (TextUtils.equals(substring, url)) {
                    break;
                }
            }
            i--;
        }
        return i;
    }

    /* renamed from: h */
    static String m196240h(Bundle bundle) {
        String string = bundle.getString("velvet:gsa_web_view_controller:substate_hash");
        string.getClass();
        return string;
    }

    /* renamed from: A */
    public final boolean mo103527A(String str) {
        String str2 = this.f327820ao;
        if (TextUtils.isEmpty(str2)) {
            return false;
        }
        return str.equals(str2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: B */
    public final boolean mo103528B(String str) {
        synchronized (this.f327800S) {
            if (TextUtils.equals(this.f327801T, str)) {
                return true;
            }
            if (this.f327815aj == null) {
                this.f327815aj = Uri.decode(this.f327801T);
            }
            if (TextUtils.equals(this.f327815aj, Uri.decode(str))) {
                return true;
            }
            String E = m196237E(str);
            String E2 = m196237E(this.f327801T);
            if (TextUtils.equals(E2, E)) {
                return true;
            }
            boolean equals = TextUtils.equals(Uri.decode(E2), Uri.decode(E));
            return equals;
        }
    }

    /* renamed from: C */
    public final boolean mo103529C() {
        return this.f327788G == null;
    }

    /* renamed from: a */
    public final void mo83590a(String str) {
        if (mo103552z()) {
            this.f327788G.mo80923b(str, (ValueCallback) null);
            mo103537k(new C118116af(11, (String) null, (Query) null, 0));
            return;
        }
        C59104x c = f327777a.mo56225c();
        c.mo56378ag(C58975e.f156826a, "GsaWebView");
        ((C59052c) ((C59052c) c).mo56372aa(33790)).mo56386p("evaluateJavascript called before WebView is created.");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final C87262h mo103531c(String str, Map map, boolean z, Query query) {
        C118118ah ahVar = new C118118ah(query.f252749G);
        ((C118118ah) this.f327824e.getAndSet(ahVar)).mo103525c();
        C90875ai.m148465b(new C118267x(this), ahVar.f327774b, this.f327836q, "WebView done callback").mo85223a(new C118268y(z));
        mo103538l();
        C87278x xVar = this.f327788G;
        HashMap hashMap = new HashMap(map);
        xVar.f235737b.incrementAndGet();
        xVar.f235738c.incrementAndGet();
        xVar.f235736a.loadUrl(str, hashMap);
        this.f327791J = false;
        mo103537k(new C118116af(12, str, query, 0));
        return ahVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Query mo103532e() {
        Query query;
        synchronized (this.f327800S) {
            query = this.f327817al;
        }
        return query;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Query mo103533f() {
        Query query;
        synchronized (this.f327800S) {
            query = this.f327816ak;
        }
        return query;
    }

    /* renamed from: g */
    public final C60870cx mo103534g() {
        if (this.f327791J) {
            return this.f327809ab;
        }
        this.f327809ab = new SettableFuture();
        if (this.f327788G != null) {
            ((C118118ah) this.f327824e.getAndSet(f327778af)).mo103525c();
            C58976aa aaVar = C58975e.f156826a;
            C87278x xVar = this.f327788G;
            xVar.f235737b.incrementAndGet();
            xVar.f235736a.clearView();
            mo103537k(new C118116af(13, (String) null, (Query) null, 0));
            this.f327788G.mo80925d("about:blank");
            mo103537k(new C118116af(12, "about:blank", mo103532e(), 0));
            this.f327791J = true;
        } else {
            this.f327809ab.mo57356n(C118826c.f331422a);
        }
        return this.f327809ab;
    }

    /* JADX WARNING: Removed duplicated region for block: B:152:0x00e5 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00e2  */
    /* renamed from: gS */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo17602gS(com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f r18) {
        /*
            r17 = this;
            r1 = r17
            r0 = r18
            java.lang.String r2 = "GsaWebViewController"
            r0.mo85291r(r2)
            r2 = 0
            com.google.android.apps.gsa.shared.util.debug.a.f r3 = r0.mo85281e(r2)
            java.lang.String r4 = "Last load"
            r3.mo85291r(r4)
            java.lang.String r4 = "requested URL"
            com.google.android.apps.gsa.shared.util.debug.a.e r4 = r3.mo85279c(r4)
            java.lang.String r5 = r17.mo103535i()
            java.lang.String r5 = com.google.android.apps.gsa.search.core.google.C85929cw.m138091v(r5)
            com.google.android.apps.gsa.shared.util.b.i r5 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148233g(r5)
            r4.mo85276a(r5)
            android.os.Looper r4 = android.os.Looper.myLooper()
            android.os.Looper r5 = android.os.Looper.getMainLooper()
            if (r4 != r5) goto L_0x0053
            com.google.android.apps.gsa.search.core.webview.x r4 = r1.f327788G
            if (r4 != 0) goto L_0x0038
            r4 = r2
            goto L_0x0040
        L_0x0038:
            com.google.android.apps.gsa.search.core.webview.x r4 = r1.f327788G
            android.webkit.WebView r4 = r4.f235736a
            java.lang.String r4 = r4.getUrl()
        L_0x0040:
            if (r4 == 0) goto L_0x0053
            java.lang.String r5 = "loaded URL"
            com.google.android.apps.gsa.shared.util.debug.a.e r5 = r3.mo85279c(r5)
            java.lang.String r4 = com.google.android.apps.gsa.search.core.google.C85929cw.m138091v(r4)
            com.google.android.apps.gsa.shared.util.b.i r4 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148233g(r4)
            r5.mo85276a(r4)
        L_0x0053:
            java.lang.Object r4 = r1.f327823d
            monitor-enter(r4)
            com.google.common.b.hd r5 = r1.f327813ah     // Catch:{ all -> 0x034b }
            monitor-exit(r4)     // Catch:{ all -> 0x034b }
            r4 = 2
            r7 = 1
            if (r5 == 0) goto L_0x01cc
            com.google.android.apps.gsa.shared.util.debug.a.f r8 = r3.mo85281e(r2)
            r9 = r5
            com.google.common.b.pv r9 = (com.google.common.p4522b.C58729pv) r9
            int r9 = r9.f156487c
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Headers (without auth or cookies): "
            r10.<init>(r11)
            r10.append(r9)
            java.lang.String r9 = r10.toString()
            r8.mo85291r(r9)
            com.google.common.b.ij r9 = r5.keySet()
            java.util.Iterator r9 = r9.iterator()
            r10 = r2
        L_0x0080:
            boolean r11 = r9.hasNext()
            r12 = 10
            if (r11 == 0) goto L_0x0120
            java.lang.Object r11 = r9.next()
            java.lang.String r11 = (java.lang.String) r11
            java.lang.Object r13 = r5.get(r11)
            java.lang.String r13 = (java.lang.String) r13
            java.lang.String r14 = "X-Geo"
            boolean r14 = r14.equals(r11)
            if (r14 == 0) goto L_0x00e8
            java.util.ArrayList r10 = new java.util.ArrayList
            r10.<init>()
            if (r13 == 0) goto L_0x00e8
            java.lang.String r14 = "w "
            boolean r14 = r13.startsWith(r14)
            if (r14 != 0) goto L_0x00ac
            goto L_0x00e8
        L_0x00ac:
            java.lang.String r14 = "w ([^\\s]+)"
            java.util.regex.Pattern r14 = java.util.regex.Pattern.compile(r14)
            java.util.regex.Matcher r14 = r14.matcher(r13)
        L_0x00b6:
            boolean r15 = r14.find()
            if (r15 == 0) goto L_0x00e8
            java.lang.String r15 = r14.group(r7)
            boolean r16 = android.text.TextUtils.isEmpty(r15)
            if (r16 == 0) goto L_0x00c8
        L_0x00c6:
            r6 = r2
            goto L_0x00e0
        L_0x00c8:
            com.google.protos.ah.a.a.l r16 = com.google.protos.p4813ah.p4814a.p4815a.C63179l.f170583h
            com.google.protobuf.bn r16 = r16.createBuilder()
            r6 = r16
            com.google.protos.ah.a.a.k r6 = (com.google.protos.p4813ah.p4814a.p4815a.C63178k) r6
            byte[] r15 = android.util.Base64.decode(r15, r12)     // Catch:{ Exception -> 0x00de }
            com.google.protobuf.ba r12 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ Exception -> 0x00de }
            r6.mergeFrom((byte[]) r15, (com.google.protobuf.C62921ba) r12)     // Catch:{ Exception -> 0x00de }
            goto L_0x00e0
        L_0x00de:
            goto L_0x00c6
        L_0x00e0:
            if (r6 == 0) goto L_0x00e5
            r10.add(r6)
        L_0x00e5:
            r12 = 10
            goto L_0x00b6
        L_0x00e8:
            com.google.android.apps.gsa.shared.util.debug.a.e r6 = r8.mo85279c(r11)
            com.google.common.b.ij r12 = com.google.android.apps.gsa.search.core.google.C85929cw.f232319b
            com.google.common.b.qy r12 = (com.google.common.p4522b.C58759qy) r12
            java.lang.Object r12 = r12.f156534a
            boolean r12 = r12.equals(r11)
            if (r12 != 0) goto L_0x0117
            boolean r12 = android.text.TextUtils.isEmpty(r13)
            if (r12 == 0) goto L_0x00ff
            goto L_0x0117
        L_0x00ff:
            com.google.common.b.ij r12 = com.google.android.apps.gsa.search.core.google.C85929cw.f232320c
            com.google.common.b.qy r12 = (com.google.common.p4522b.C58759qy) r12
            java.lang.Object r12 = r12.f156534a
            boolean r11 = r12.equals(r11)
            if (r11 == 0) goto L_0x0110
            com.google.android.apps.gsa.shared.util.b.i r11 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148233g(r13)
            goto L_0x011b
        L_0x0110:
            java.lang.String r11 = "[EXPUNGED]"
            com.google.android.apps.gsa.shared.util.b.i r11 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r11)
            goto L_0x011b
        L_0x0117:
            com.google.android.apps.gsa.shared.util.b.i r11 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r13)
        L_0x011b:
            r6.mo85276a(r11)
            goto L_0x0080
        L_0x0120:
            if (r10 == 0) goto L_0x01d5
            com.google.android.apps.gsa.shared.util.debug.a.f r5 = r8.mo85281e(r2)
            java.lang.String r6 = "Decoded locations"
            r5.mo85291r(r6)
            r6 = 0
        L_0x012c:
            int r8 = r10.size()
            if (r6 >= r8) goto L_0x01d5
            java.lang.Object r8 = r10.get(r6)
            com.google.protos.ah.a.a.k r8 = (com.google.protos.p4813ah.p4814a.p4815a.C63178k) r8
            com.google.protobuf.bv r9 = r8.instance
            com.google.protos.ah.a.a.l r9 = (com.google.protos.p4813ah.p4814a.p4815a.C63179l) r9
            int r11 = r9.f170585a
            r11 = r11 & 16
            if (r11 == 0) goto L_0x01c8
            int r9 = r9.f170586b
            com.google.protos.ah.a.a.r r9 = com.google.protos.p4813ah.p4814a.p4815a.C63185r.m96200a(r9)
            if (r9 != 0) goto L_0x014c
            com.google.protos.ah.a.a.r r9 = com.google.protos.p4813ah.p4814a.p4815a.C63185r.UNKNOWN_ROLE
        L_0x014c:
            int r9 = r9.ordinal()
            if (r9 == r7) goto L_0x017e
            if (r9 == r4) goto L_0x0179
            r11 = 4
            if (r9 == r11) goto L_0x0174
            r11 = 10
            if (r9 == r11) goto L_0x0171
            r12 = 13
            if (r9 == r12) goto L_0x016e
            r12 = 6
            if (r9 == r12) goto L_0x016b
            r12 = 7
            if (r9 == r12) goto L_0x0168
            java.lang.String r9 = "Location (Unknown)"
            goto L_0x0182
        L_0x0168:
            java.lang.String r9 = "Location (Viewport)"
            goto L_0x0182
        L_0x016b:
            java.lang.String r9 = "Location (Historical Location)"
            goto L_0x0182
        L_0x016e:
            java.lang.String r9 = "Location (Wildcard)"
            goto L_0x0182
        L_0x0171:
            java.lang.String r9 = "Location (Experimental Location)"
            goto L_0x0182
        L_0x0174:
            r11 = 10
            java.lang.String r9 = "Location (User Specified for Request)"
            goto L_0x0182
        L_0x0179:
            r11 = 10
            java.lang.String r9 = "Location (Default Location)"
            goto L_0x0182
        L_0x017e:
            r11 = 10
            java.lang.String r9 = "Location (Current Location)"
        L_0x0182:
            com.google.android.apps.gsa.shared.util.debug.a.e r9 = r5.mo85279c(r9)
            com.google.protobuf.bv r12 = r8.instance
            com.google.protos.ah.a.a.l r12 = (com.google.protos.p4813ah.p4814a.p4815a.C63179l) r12
            com.google.protos.ah.a.a.h r12 = r12.f170589e
            if (r12 != 0) goto L_0x0190
            com.google.protos.ah.a.a.h r12 = com.google.protos.p4813ah.p4814a.p4815a.C63175h.f170573d
        L_0x0190:
            int r12 = r12.f170576b
            double r12 = (double) r12
            r14 = 4711630319722168320(0x416312d000000000, double:1.0E7)
            java.lang.Double.isNaN(r12)
            double r12 = r12 / r14
            com.google.protobuf.bv r8 = r8.instance
            com.google.protos.ah.a.a.l r8 = (com.google.protos.p4813ah.p4814a.p4815a.C63179l) r8
            com.google.protos.ah.a.a.h r8 = r8.f170589e
            if (r8 != 0) goto L_0x01a6
            com.google.protos.ah.a.a.h r8 = com.google.protos.p4813ah.p4814a.p4815a.C63175h.f170573d
        L_0x01a6:
            int r8 = r8.f170577c
            java.lang.StringBuilder r11 = new java.lang.StringBuilder
            r11.<init>()
            r11.append(r12)
            java.lang.String r12 = ", "
            r11.append(r12)
            double r12 = (double) r8
            java.lang.Double.isNaN(r12)
            double r12 = r12 / r14
            r11.append(r12)
            java.lang.String r8 = r11.toString()
            com.google.android.apps.gsa.shared.util.b.i r8 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148233g(r8)
            r9.mo85276a(r8)
        L_0x01c8:
            int r6 = r6 + 1
            goto L_0x012c
        L_0x01cc:
            java.lang.String r5 = "headers: null"
            com.google.android.apps.gsa.shared.util.b.i r5 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r5)
            r3.mo85292s(r5)
        L_0x01d5:
            java.lang.Object r5 = r1.f327823d
            monitor-enter(r5)
            java.lang.String r6 = "last stream"
            com.google.android.apps.gsa.shared.bj.d r8 = r1.f327827h     // Catch:{ all -> 0x0348 }
            r0.mo85289p(r6, r8)     // Catch:{ all -> 0x0348 }
            monitor-exit(r5)     // Catch:{ all -> 0x0348 }
            java.lang.Object r6 = r1.f327807Z
            monitor-enter(r6)
            java.util.ArrayList r5 = r1.f327808aa     // Catch:{ all -> 0x0345 }
            boolean r5 = r5.isEmpty()     // Catch:{ all -> 0x0345 }
            if (r5 != 0) goto L_0x0223
            java.util.ArrayList r5 = r1.f327808aa     // Catch:{ all -> 0x0345 }
            java.util.Iterator r5 = r5.iterator()     // Catch:{ all -> 0x0345 }
        L_0x01f1:
            boolean r8 = r5.hasNext()     // Catch:{ all -> 0x0345 }
            if (r8 == 0) goto L_0x0223
            java.lang.Object r8 = r5.next()     // Catch:{ all -> 0x0345 }
            com.google.common.base.az r8 = (com.google.common.base.C58835az) r8     // Catch:{ all -> 0x0345 }
            com.google.android.apps.gsa.shared.util.debug.a.f r9 = r0.mo85281e(r2)     // Catch:{ all -> 0x0345 }
            java.lang.String r10 = "tracked stream"
            r9.mo85291r(r10)     // Catch:{ all -> 0x0345 }
            java.lang.String r10 = "url"
            com.google.android.apps.gsa.shared.util.debug.a.e r9 = r9.mo85279c(r10)     // Catch:{ all -> 0x0345 }
            java.lang.Object r10 = r8.f156631a     // Catch:{ all -> 0x0345 }
            java.lang.String r10 = (java.lang.String) r10     // Catch:{ all -> 0x0345 }
            java.lang.String r10 = com.google.android.apps.gsa.search.core.google.C85929cw.m138091v(r10)     // Catch:{ all -> 0x0345 }
            com.google.android.apps.gsa.shared.util.b.i r10 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148233g(r10)     // Catch:{ all -> 0x0345 }
            r9.mo85276a(r10)     // Catch:{ all -> 0x0345 }
            java.lang.Object r8 = r8.f156632b     // Catch:{ all -> 0x0345 }
            com.google.android.apps.gsa.shared.util.debug.a.b r8 = (com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b) r8     // Catch:{ all -> 0x0345 }
            r0.mo85286m(r8)     // Catch:{ all -> 0x0345 }
            goto L_0x01f1
        L_0x0223:
            java.lang.String r5 = "last canceld stream url"
            com.google.android.apps.gsa.shared.util.debug.a.e r5 = r0.mo85279c(r5)     // Catch:{ all -> 0x0345 }
            java.lang.String r8 = r1.f327821ap     // Catch:{ all -> 0x0345 }
            java.lang.String r8 = com.google.android.apps.gsa.search.core.google.C85929cw.m138091v(r8)     // Catch:{ all -> 0x0345 }
            com.google.android.apps.gsa.shared.util.b.i r8 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148233g(r8)     // Catch:{ all -> 0x0345 }
            r5.mo85276a(r8)     // Catch:{ all -> 0x0345 }
            java.lang.String r5 = "canceled reading stream"
            com.google.android.apps.gsa.shared.util.debug.a.e r5 = r0.mo85279c(r5)     // Catch:{ all -> 0x0345 }
            int r8 = r1.f327822aq     // Catch:{ all -> 0x0345 }
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch:{ all -> 0x0345 }
            com.google.android.apps.gsa.shared.util.b.i r8 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148230d(r8)     // Catch:{ all -> 0x0345 }
            r5.mo85276a(r8)     // Catch:{ all -> 0x0345 }
            monitor-exit(r6)     // Catch:{ all -> 0x0345 }
            java.lang.String r5 = "suppress previous results"
            com.google.android.apps.gsa.shared.util.debug.a.e r5 = r0.mo85279c(r5)
            boolean r6 = r1.f327795N
            long r8 = r1.f327794M
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            r10.<init>()
            r10.append(r6)
            java.lang.String r6 = "/"
            r10.append(r6)
            r10.append(r8)
            java.lang.String r6 = r10.toString()
            com.google.android.apps.gsa.shared.util.b.i r6 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r6)
            r5.mo85276a(r6)
            java.lang.String r5 = "has pending history clear"
            com.google.android.apps.gsa.shared.util.debug.a.e r5 = r0.mo85279c(r5)
            boolean r6 = r1.f327798Q
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            com.google.android.apps.gsa.shared.util.b.i r6 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148228b(r6)
            r5.mo85276a(r6)
            java.lang.String r5 = "Committed query"
            com.google.android.apps.gsa.shared.search.Query r6 = r17.mo103532e()
            r0.mo85288o(r5, r6)
            java.lang.String r5 = "user agent"
            com.google.android.apps.gsa.shared.util.debug.a.e r5 = r0.mo85279c(r5)
            com.google.common.base.cr r6 = r1.f327839t
            com.google.android.apps.gsa.search.core.cq r6 = (com.google.android.apps.gsa.search.core.C85757cq) r6
            java.lang.String r6 = r6.mo6453a()
            com.google.android.apps.gsa.shared.util.b.i r6 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r6)
            r5.mo85276a(r6)
            java.lang.String r5 = "loadUrl() state"
            com.google.android.apps.gsa.shared.util.debug.a.e r5 = r0.mo85279c(r5)
            java.util.concurrent.atomic.AtomicReference r6 = r1.f327824e
            java.lang.Object r6 = r6.get()
            com.google.android.apps.gsa.staticplugins.webview.ah r6 = (com.google.android.apps.gsa.staticplugins.webview.C118118ah) r6
            com.google.android.apps.gsa.staticplugins.webview.ah r8 = f327778af
            if (r6 == r8) goto L_0x02d2
            boolean r8 = r6.f327775c
            if (r8 == 0) goto L_0x02b9
            java.lang.String r6 = "Cancelled"
            goto L_0x02d4
        L_0x02b9:
            com.google.common.util.concurrent.SettableFuture r8 = r6.f327774b
            boolean r8 = r8.isDone()
            if (r8 == 0) goto L_0x02c4
            java.lang.String r6 = "Loaded successfully into web view"
            goto L_0x02d4
        L_0x02c4:
            com.google.common.util.concurrent.SettableFuture r6 = r6.f327773a
            boolean r6 = r6.isDone()
            if (r6 == 0) goto L_0x02cf
            java.lang.String r6 = "Ready to show but not finished loading"
            goto L_0x02d4
        L_0x02cf:
            java.lang.String r6 = "Load started but not ready to show"
            goto L_0x02d4
        L_0x02d2:
            java.lang.String r6 = "No loadUrl() call in progress"
        L_0x02d4:
            com.google.android.apps.gsa.shared.util.b.i r6 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148229c(r6)
            r5.mo85276a(r6)
            java.lang.Object r5 = r1.f327823d
            monitor-enter(r5)
            java.lang.String r6 = "last URL"
            com.google.android.apps.gsa.shared.util.debug.a.e r6 = r0.mo85279c(r6)     // Catch:{ all -> 0x0342 }
            java.lang.String r8 = ""
            com.google.android.apps.gsa.shared.util.b.i r8 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148233g(r8)     // Catch:{ all -> 0x0342 }
            r6.mo85276a(r8)     // Catch:{ all -> 0x0342 }
            java.lang.String r6 = "Handled internal events"
            r3.mo85291r(r6)     // Catch:{ all -> 0x0342 }
            long r8 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0342 }
            com.google.android.libraries.f.a r6 = r1.f327833n     // Catch:{ all -> 0x0342 }
            long r10 = r6.mo26871c()     // Catch:{ all -> 0x0342 }
            long r8 = r8 - r10
            java.util.Queue r6 = r1.f327826g     // Catch:{ all -> 0x0342 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ all -> 0x0342 }
        L_0x0303:
            boolean r10 = r6.hasNext()     // Catch:{ all -> 0x0342 }
            if (r10 == 0) goto L_0x0330
            java.lang.Object r10 = r6.next()     // Catch:{ all -> 0x0342 }
            com.google.android.apps.gsa.staticplugins.webview.af r10 = (com.google.android.apps.gsa.staticplugins.webview.C118116af) r10     // Catch:{ all -> 0x0342 }
            java.lang.String r11 = "%s: %s"
            com.google.android.apps.gsa.shared.util.b.i[] r12 = new com.google.android.apps.gsa.shared.util.p7158b.C90752i[r4]     // Catch:{ all -> 0x0342 }
            java.util.Date r13 = new java.util.Date     // Catch:{ all -> 0x0342 }
            long r14 = r10.f327770e     // Catch:{ all -> 0x0342 }
            long r14 = r14 + r8
            r13.<init>(r14)     // Catch:{ all -> 0x0342 }
            com.google.android.apps.gsa.shared.util.b.i r13 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148232f(r13)     // Catch:{ all -> 0x0342 }
            r14 = 0
            r12[r14] = r13     // Catch:{ all -> 0x0342 }
            java.lang.String r10 = java.lang.String.valueOf(r10)     // Catch:{ all -> 0x0342 }
            com.google.android.apps.gsa.shared.util.b.i r10 = com.google.android.apps.gsa.shared.util.p7158b.C90752i.m148233g(r10)     // Catch:{ all -> 0x0342 }
            r12[r7] = r10     // Catch:{ all -> 0x0342 }
            r3.mo85293t(r11, r12)     // Catch:{ all -> 0x0342 }
            goto L_0x0303
        L_0x0330:
            monitor-exit(r5)     // Catch:{ all -> 0x0342 }
            com.google.android.apps.gsa.shared.util.debug.a.f r0 = r0.mo85281e(r2)
            com.google.android.apps.gsa.search.core.webview.x r3 = r1.f327788G
            if (r3 != 0) goto L_0x033a
            goto L_0x033e
        L_0x033a:
            com.google.android.apps.gsa.search.core.webview.x r2 = r1.f327788G
            android.webkit.WebView r2 = r2.f235736a
        L_0x033e:
            com.google.android.apps.gsa.shared.util.C90776bt.m148329c(r0, r2)
            return
        L_0x0342:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0342 }
            throw r0
        L_0x0345:
            r0 = move-exception
            monitor-exit(r6)     // Catch:{ all -> 0x0345 }
            throw r0
        L_0x0348:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0348 }
            throw r0
        L_0x034b:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x034b }
            goto L_0x034f
        L_0x034e:
            throw r0
        L_0x034f:
            goto L_0x034e
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.webview.C118119ai.mo17602gS(com.google.android.apps.gsa.shared.util.debug.a.f):void");
    }

    /* renamed from: i */
    public final String mo103535i() {
        String str;
        synchronized (this.f327800S) {
            str = this.f327801T;
        }
        return str;
    }

    /* renamed from: j */
    public final String mo103536j(String str, String str2) {
        if (str2.isEmpty()) {
            return m196237E(str);
        }
        String E = m196237E(str);
        return E + "#" + str2;
    }

    /* renamed from: k */
    public final void mo103537k(C118116af afVar) {
        synchronized (this.f327823d) {
            afVar.f327770e = this.f327833n.mo26871c();
            this.f327826g.add(afVar);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo103538l() {
        synchronized (this.f327807Z) {
            Iterator it = this.f327808aa.iterator();
            while (it.hasNext()) {
                C58835az azVar = (C58835az) it.next();
                C89691d dVar = (C89691d) azVar.f156632b;
                if (dVar.mo83597e()) {
                    C58976aa aaVar = C58975e.f156826a;
                    ((C89911f) this.f327840u.mo27525b()).mo83755a((Throwable) null, 26065627, 29).mo83721a();
                    this.f327822aq++;
                }
                dVar.mo83592a();
                this.f327821ap = (String) azVar.f156631a;
            }
            this.f327808aa.clear();
        }
    }

    /* renamed from: m */
    public final void mo103539m() {
        synchronized (this.f327786E) {
            this.f327786E.clear();
            this.f327814ai.cancel(false);
        }
        if (this.f327788G != null) {
            this.f327788G.mo80922a();
            this.f327788G = null;
            mo103537k(new C118116af(15, (String) null, (Query) null, 0));
            mo103538l();
            if (this.f327832m.mo79746e(C90117fo.f250750f)) {
                this.f327784C.mo41545b(this.f327811ad);
            }
        }
        C85747ck ckVar = this.f327792K;
        if (ckVar != null) {
            C58976aa aaVar = C58975e.f156826a;
            ckVar.f231832g.mo80905b();
        }
        C118260q qVar = this.f327785D;
        if (qVar != null) {
            qVar.f328306a = null;
        }
        f327779ag.decrementAndGet();
    }

    /* renamed from: n */
    public final void mo103540n(String str, long j, C90456c cVar) {
        C89886e b = ((C89911f) this.f327840u.mo27525b()).mo83756b(cVar);
        b.mo83725d(j);
        b.mo83721a();
        ((C118118ah) this.f327824e.get()).f327774b.mo57357o(new C85453c(str, j, cVar));
        synchronized (this.f327786E) {
            this.f327786E.clear();
        }
    }

    /* renamed from: o */
    public final void mo103541o(long j) {
        C118118ah ahVar = (C118118ah) this.f327824e.get();
        ahVar.mo103526d(ahVar.f327773a, j, C118826c.f331422a);
    }

    /* renamed from: p */
    public final void mo103542p(String str, Query query, Exception exc) {
        C90456c cVar;
        if (exc instanceof C89013ak) {
            cVar = (C89013ak) exc;
        } else {
            cVar = new C90457d("No page in cache", (int) C89885b.WEBVIEW_WEBRESOURCERESPONSE_UNAVAILABLE_VALUE);
        }
        if (exc == null) {
            C59104x c = f327777a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "GsaWebView");
            ((C59052c) ((C59052c) c).mo56372aa(33798)).mo56389s("Could not load page from cache: %s", C85929cw.m138091v(str));
        } else {
            C59104x c2 = f327777a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "GsaWebView");
            ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(exc)).mo56372aa(33797)).mo56389s("Error loading page: %s", C85929cw.m138091v(str));
        }
        mo103540n("No response", query.f252749G, cVar);
    }

    /* renamed from: q */
    public final void mo103543q(String str, long j) {
        if (!mo103528B(str)) {
            C59104x d = f327777a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GsaWebView");
            ((C59052c) ((C59052c) d).mo56372aa(33801)).mo56386p("Ignoring load event for old query.");
            return;
        }
        Uri parse = Uri.parse(str);
        String i = mo103535i();
        this.f327838s.mo80894q(j, parse, TextUtils.isEmpty(i) ? null : Uri.parse(i));
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final void mo103544r(int i, String str, Query query, long j) {
        C118116af afVar = new C118116af(i, str, query, j);
        synchronized (this.f327786E) {
            this.f327786E.add(afVar);
            this.f327814ai.cancel(false);
            this.f327814ai = this.f327836q.mo28208h("handleInternalEvents", 10, new C118265v(this));
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: s */
    public final void mo103545s(String str, Query query) {
        if (str == null) {
            str = BuildConfig.FLAVOR;
        }
        mo103544r(3, str, query, 0);
    }

    /* renamed from: t */
    public final void mo103546t(UriRequest uriRequest) {
        C22872h.m42743c(C0826b.class);
        String uri = uriRequest.f236331a.toString();
        C58838bb.m90883r(!TextUtils.isEmpty(uri));
        C58976aa aaVar = C58975e.f156826a;
        this.f327820ao = uri;
        C58495hd a = uriRequest.mo81502a();
        synchronized (this.f327818am) {
            this.f327819an = C90719ac.f253778a.f253779b.nextLong();
        }
        mo103531c(uri, a, true, Query.f252741b);
        m196238F(a);
        this.f327838s.mo80891n();
        mo103547u(326);
    }

    /* renamed from: u */
    public final void mo103547u(int i) {
        long j;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        synchronized (this.f327818am) {
            j = this.f327819an;
        }
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164093a |= 16;
        ufVar2.f164261p = j;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: v */
    public final void mo103548v(ArrayDeque arrayDeque) {
        Bundle bundle = new Bundle();
        this.f327788G.f235736a.saveState(bundle);
        arrayDeque.add(bundle);
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo103549w(Query query) {
        synchronized (this.f327800S) {
            this.f327817al = query;
            C118260q qVar = this.f327785D;
            if (qVar != null) {
                ((C118171cg) qVar.f328308c).f328045a = query.f252749G;
            }
            C118263t tVar = this.f327789H;
            if (tVar != null) {
                tVar.f328314b = this.f327817al.f252749G;
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final void mo103550x(Query query) {
        C22872h.m42743c(C0826b.class);
        synchronized (this.f327800S) {
            this.f327816ak = query;
        }
    }

    /* renamed from: y */
    public final void mo103551y() {
        this.f327794M = this.f327833n.mo26874f() + this.f327832m.mo79743a(C90120fr.f250808aU);
    }

    /* renamed from: z */
    public final boolean mo103552z() {
        C58976aa aaVar = C58975e.f156826a;
        return this.f327788G != null;
    }

    /* renamed from: D */
    public final UriRequest mo103530D(Query query, C87504b bVar, C86231bn bnVar, C58833ax axVar) {
        Uri uri;
        long j;
        bVar.getClass();
        C58838bb.m90883r(mo103552z());
        C58976aa aaVar = C58975e.f156826a;
        synchronized (this.f327786E) {
            this.f327786E.clear();
        }
        boolean z = true;
        if (axVar.mo56113h()) {
            uri = Uri.parse((String) axVar.mo56107c());
        } else {
            Uri uri2 = bVar.f236337b.f236331a;
            if (!query.mo84420dA() && !query.mo84373cF()) {
                C58838bb.m90883r(query.mo84317bB());
                if (query.mo84316bA()) {
                    j = C21383f.m40448a(this.f327833n, query.f252747E);
                } else {
                    j = query.f252745C;
                }
                String l = Long.toString(j);
                String str = query.f252770i;
                Uri.Builder clearQuery = uri2.buildUpon().clearQuery();
                for (String next : uri2.getQueryParameterNames()) {
                    if (!TextUtils.isEmpty(next) && !"qsubts".equals(next) && !"q".equals(next) && !"tch".equals(next) && !"fbts".equals(next)) {
                        for (String next2 : uri2.getQueryParameters(next)) {
                            if (next2 != null) {
                                clearQuery.appendQueryParameter(next, next2);
                            }
                        }
                    }
                }
                Long l2 = (Long) C90877ak.m148475i(this.f327829j.f233050a, (Object) null);
                if (l2 != null) {
                    clearQuery.appendQueryParameter("fbts", Long.toString(C21383f.m40448a(this.f327833n, l2.longValue())));
                } else {
                    C59104x c = f327777a.mo56225c();
                    c.mo56378ag(C58975e.f156826a, "GsaWebView");
                    ((C59052c) ((C59052c) c).mo56372aa(33778)).mo56386p("Unable to set 'fbts', first byte timestamp unavailable.");
                }
                clearQuery.appendQueryParameter("qsubts", l);
                clearQuery.appendQueryParameter("q", str);
                if (this.f327812ae == 2) {
                    clearQuery.appendQueryParameter("agsabk", "1");
                }
                String br = query.mo84359br();
                if (true == TextUtils.isEmpty(br)) {
                    br = null;
                }
                clearQuery.encodedFragment(br);
                uri = clearQuery.build();
            } else {
                uri = uri2;
            }
        }
        String uri3 = uri.toString();
        C58495hd a = bVar.f236337b.mo81502a();
        m196238F(a);
        if (uri3 == null || bnVar == null) {
            z = false;
        }
        C58838bb.m90868c(z);
        synchronized (this.f327800S) {
            this.f327801T = uri3;
            this.f327815aj = null;
            this.f327802U = bVar;
            this.f327803V = bnVar;
        }
        return new UriRequest(uri, a, (Map) null, (byte[]) null);
    }
}
