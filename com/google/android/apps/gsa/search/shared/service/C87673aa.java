package com.google.android.apps.gsa.search.shared.service;

import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.os.Trace;
import androidx.annotation.C0826b;
import com.google.android.apps.gsa.search.shared.actions.ParcelableVoiceAction;
import com.google.android.apps.gsa.search.shared.actions.VoiceAction;
import com.google.android.apps.gsa.search.shared.service.p6934a.C87666a;
import com.google.android.apps.gsa.search.shared.service.p6934a.C87672g;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87710as;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87711at;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87712au;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87741bw;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88213ti;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88214tj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88215tk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88244um;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88263ve;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88264vf;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88265vg;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88321xi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88323xk;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88324xl;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88325xm;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88326xn;
import com.google.android.apps.gsa.search.shared.service.p6935b.aay;
import com.google.android.apps.gsa.search.shared.service.p6935b.aaz;
import com.google.android.apps.gsa.search.shared.service.p6935b.aba;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p6997as.p6998a.C89287a;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7194x.C91167a;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.apps.gsa.shared.util.C90757ba;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7158b.C90752i;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.gsa.p1876k.C22872h;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4534f.C59081b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.search.shared.service.aa */
/* compiled from: PG */
public final class C87673aa implements C87681ai, C90991b {

    /* renamed from: a */
    public static final C59071e f236983a = C59071e.m91332i("com.google.android.apps.gsa.search.shared.service.aa");

    /* renamed from: s */
    private static final C91167a f236984s = new C91167a(new C21375e());

    /* renamed from: A */
    private final C68214a f236985A;

    /* renamed from: b */
    public final C88503x f236986b;

    /* renamed from: c */
    public final C90476a f236987c;

    /* renamed from: d */
    public final long f236988d;

    /* renamed from: e */
    public final List f236989e;

    /* renamed from: f */
    public final C58833ax f236990f;

    /* renamed from: g */
    C87682aj f236991g;

    /* renamed from: h */
    C90757ba f236992h;

    /* renamed from: i */
    protected final C88505z f236993i;

    /* renamed from: j */
    protected C88495p f236994j;

    /* renamed from: k */
    protected C87666a f236995k;

    /* renamed from: l */
    protected C88492m f236996l;

    /* renamed from: m */
    protected boolean f236997m;

    /* renamed from: n */
    public boolean f236998n;

    /* renamed from: o */
    public ClientEventData f236999o;

    /* renamed from: p */
    public C87685am f237000p;

    /* renamed from: q */
    public long f237001q;

    /* renamed from: r */
    public boolean f237002r;

    /* renamed from: t */
    private final Context f237003t;

    /* renamed from: u */
    private final C68214a f237004u;

    /* renamed from: v */
    private final C22871g f237005v;

    /* renamed from: w */
    private boolean f237006w;

    /* renamed from: x */
    private boolean f237007x;

    /* renamed from: y */
    private final ClientConfig f237008y;

    /* renamed from: z */
    private long f237009z;

    @Deprecated
    public C87673aa(Context context, C87682aj ajVar, C90757ba baVar, ClientConfig clientConfig, C22871g gVar, C90476a aVar) {
        this(context, ajVar, baVar, clientConfig, gVar, aVar, C88501v.f239209a, C58836b.f156633a, (C68214a) null);
    }

    /* renamed from: A */
    private static long m142697A() {
        long incrementAndGet;
        do {
            incrementAndGet = f236984s.f254534a.incrementAndGet();
        } while (!C89287a.m145218a(incrementAndGet));
        return incrementAndGet;
    }

    /* renamed from: B */
    private final void m142698B() {
        C58838bb.m90884s(!this.f237006w, "SearchServiceClient disposed and cannot be reused.");
    }

    /* renamed from: C */
    private final boolean m142699C() {
        return (this.f236996l == null || this.f236994j == null) ? false : true;
    }

    /* renamed from: D */
    private final boolean m142700D() {
        return (this.f236996l == null || this.f236995k == null) ? false : true;
    }

    /* renamed from: a */
    public final void mo81930a(boolean z) {
        C88489j jVar = new C88489j(C87739bu.CANCEL);
        C62940bt btVar = C87710as.f237179a;
        C87711at atVar = (C87711at) C87712au.f237180c.createBuilder();
        atVar.copyOnWrite();
        C87712au auVar = (C87712au) atVar.instance;
        auVar.f237182a |= 1;
        auVar.f237183b = z;
        jVar.mo82014b(btVar, (C87712au) atVar.build());
        mo81937i(jVar.mo82013a());
    }

    /* renamed from: b */
    public final void mo81931b(Query query) {
        C88489j jVar = new C88489j(C87739bu.QUERY_COMMIT);
        jVar.mo82015c(query);
        mo81937i(jVar.mo82013a());
    }

    /* renamed from: c */
    public final void mo81932c() {
        C59081b.m91349a(C58979ad.FULL, "stack size");
        C22872h.m42743c(C0826b.class);
        m142698B();
        if (!this.f236997m) {
            this.f236997m = true;
            C88505z zVar = this.f236993i;
            C22871g gVar = this.f237005v;
            C87682aj ajVar = this.f236991g;
            C90757ba baVar = this.f236992h;
            zVar.f239218c = gVar;
            zVar.f239216a = ajVar;
            zVar.f239217b = baVar;
            if (((Boolean) this.f237004u.mo27525b()).booleanValue()) {
                C58838bb.m90883r(this.f236990f.mo56113h());
                this.f237005v.mo28212l("connect", new C88502w(this));
                return;
            }
            if (this.f236987c.mo84225b()) {
                Trace.beginSection("SearchServiceNonLazyConnect");
            }
            Intent intent = new Intent();
            intent.setClassName(this.f237003t, "com.google.android.apps.gsa.search.core.service.SearchService");
            if (!this.f237003t.bindService(intent, this.f236986b, 1 | (Build.VERSION.SDK_INT >= 30 ? 4096 : 0))) {
                ((C59052c) ((C59052c) f236983a.mo56226d()).mo56372aa(9745)).mo56386p("Unable to bind to the search service");
                this.f236997m = false;
                try {
                    this.f237003t.unbindService(this.f236986b);
                } catch (IllegalArgumentException e) {
                    ((C59052c) ((C59052c) ((C59052c) f236983a.mo56226d()).mo56382g(e)).mo56372aa(9746)).mo56386p("unbindService failed after failed bindService");
                }
                mo81936h();
            }
            if (this.f236987c.mo84225b()) {
                Trace.endSection();
            }
        }
    }

    /* renamed from: e */
    public final void mo81933e() {
        C59081b.m91349a(C58979ad.FULL, "stack size");
        C22872h.m42743c(C0826b.class);
        if (this.f236997m) {
            if (mo81951w()) {
                try {
                    if (m142700D()) {
                        this.f236995k.mo80242h(this.f236988d, this.f237007x);
                    } else if (m142699C()) {
                        this.f236994j.mo80233b(this.f236988d, this.f237007x);
                    }
                    this.f237007x = false;
                } catch (RemoteException e) {
                    ((C59052c) ((C59052c) ((C59052c) f236983a.mo56226d()).mo56382g(e)).mo56372aa(9749)).mo56386p("detachClient failed");
                }
            }
            if (!((Boolean) this.f237004u.mo27525b()).booleanValue()) {
                try {
                    this.f237003t.unbindService(this.f236986b);
                } catch (IllegalArgumentException e2) {
                    ((C59052c) ((C59052c) ((C59052c) f236983a.mo56226d()).mo56382g(e2)).mo56372aa(9748)).mo56386p("IllegalArgumentException when unbinding.");
                }
            } else if (this.f236995k != null) {
                ((C87672g) this.f236990f.mo56107c()).mo81929b();
                this.f236995k = null;
            }
            this.f236996l = null;
            this.f236994j = null;
            this.f236997m = false;
        }
    }

    /* renamed from: f */
    public final void mo81934f() {
        mo81933e();
        this.f237006w = true;
        C88505z zVar = this.f236993i;
        zVar.f239219d.clear();
        zVar.f239216a = null;
        zVar.f239217b = null;
        zVar.f239218c = null;
        this.f236991g = null;
        this.f236992h = null;
    }

    /* renamed from: g */
    public final void mo81935g() {
        mo81937i(new C88489j(C87739bu.GO_BACK).mo82013a());
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        fVar.mo85291r("SearchServiceClient");
        fVar.mo85279c("ID").mo85276a(C90752i.m148230d(Long.valueOf(this.f236988d)));
        fVar.mo85279c("Connected").mo85276a(C90752i.m148228b(Boolean.valueOf(mo81951w())));
        fVar.mo85279c("Started").mo85276a(C90752i.m148228b(Boolean.valueOf(mo81953y())));
        fVar.mo85279c("Disposed").mo85276a(C90752i.m148228b(Boolean.valueOf(this.f237006w)));
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo81936h() {
        this.f236993i.mo82016e(new C87684al(C88244um.ON_SERVICE_DISCONNECTED).mo81964a());
    }

    /* renamed from: i */
    public final void mo81937i(ClientEventData clientEventData) {
        Object obj;
        C68214a aVar;
        C68214a aVar2;
        C87739bu buVar = C87739bu.UNKNOWN;
        C87739bu a = C87739bu.m142761a(clientEventData.f236955a.f237480b);
        if (a == null) {
            a = C87739bu.UNKNOWN;
        }
        int ordinal = a.ordinal();
        if (ordinal != 59) {
            if (ordinal != 60) {
                if (mo81952x()) {
                    C87739bu a2 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
                    if (a2 == null) {
                        a2 = C87739bu.UNKNOWN;
                    }
                    if (a2 == C87739bu.HOTWORD_DETECTED_IN_INTERACTOR && (aVar2 = this.f236985A) != null) {
                        ((C89859i) aVar2.mo27525b()).mo83702b(C89849ae.SEARCHSERVICE_RECEIVED_HOTWORD_FROM_INTERACTOR);
                    }
                } else {
                    this.f236989e.add(clientEventData);
                    C87739bu a3 = C87739bu.m142761a(clientEventData.f236955a.f237480b);
                    if (a3 == null) {
                        a3 = C87739bu.UNKNOWN;
                    }
                    if (a3 == C87739bu.HOTWORD_DETECTED_IN_INTERACTOR && (aVar = this.f236985A) != null) {
                        ((C89859i) aVar.mo27525b()).mo83702b(C89849ae.SEARCHSERVICE_RECEIVED_HOTWORD_FROM_INTERACTOR_PENDING);
                        return;
                    }
                    return;
                }
            } else if (this.f236999o != null) {
                this.f236999o = null;
                if (!mo81952x()) {
                    return;
                }
            } else {
                return;
            }
        } else if (this.f236999o == null) {
            this.f236999o = clientEventData;
            C62940bt btVar = C88321xi.f238851a;
            C87741bw bwVar = clientEventData.f236955a;
            C62940bt r0 = C62942bv.checkIsLite(btVar);
            bwVar.mo58887l(r0);
            Object l = bwVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            this.f237009z = ((C88323xk) obj).f238856c;
            if (mo81952x()) {
                this.f237002r = false;
            } else {
                return;
            }
        } else {
            return;
        }
        C88492m mVar = this.f236996l;
        if (mVar != null) {
            try {
                mVar.mo80387i(clientEventData);
            } catch (RemoteException e) {
                ((C59052c) ((C59052c) ((C59052c) f236983a.mo56225c()).mo56382g(e)).mo56372aa(9751)).mo56386p("onGenericClientEvent() failed");
            }
        }
    }

    /* renamed from: j */
    public final void mo81938j(boolean z) {
        if (z) {
            mo81937i(new C88489j(C87739bu.TOP_RESUMED_ACTIVTIY).mo82013a());
        }
    }

    /* renamed from: k */
    public final void mo81939k(boolean z, long j) {
        aaz aaz = (aaz) aba.f237126d.createBuilder();
        aaz.copyOnWrite();
        aba aba = (aba) aaz.instance;
        aba.f237128a |= 1;
        aba.f237129b = z;
        if (z) {
            aaz.copyOnWrite();
            aba aba2 = (aba) aaz.instance;
            aba2.f237128a |= 2;
            aba2.f237130c = j;
        }
        C88489j jVar = new C88489j(C87739bu.WINDOW_FOCUS_CHANGED);
        jVar.mo82014b(aay.f237114a, (aba) aaz.build());
        mo81937i(jVar.mo82013a());
    }

    /* renamed from: l */
    public final void mo81940l(C87682aj ajVar, C88244um... umVarArr) {
        for (C88244um umVar : umVarArr) {
            C88505z zVar = this.f236993i;
            Set set = (Set) zVar.f239219d.get(umVar);
            if (set != null) {
                HashSet hashSet = new HashSet(set);
                hashSet.add(ajVar);
                zVar.f239219d.put(umVar, C58528ij.m90006F(hashSet));
            } else {
                HashSet hashSet2 = new HashSet();
                hashSet2.add(ajVar);
                zVar.f239219d.put(umVar, C58528ij.m90006F(hashSet2));
            }
        }
    }

    /* renamed from: m */
    public final void mo81941m(C87682aj ajVar, C88244um... umVarArr) {
        for (C88244um umVar : umVarArr) {
            C88505z zVar = this.f236993i;
            Set set = (Set) zVar.f239219d.get(umVar);
            if (set != null) {
                HashSet hashSet = new HashSet(set);
                hashSet.remove(ajVar);
                zVar.f239219d.put(umVar, C58528ij.m90006F(hashSet));
                if (hashSet.isEmpty()) {
                    zVar.f239219d.remove(umVar);
                }
            }
        }
    }

    /* renamed from: n */
    public final void mo81942n(Bundle bundle) {
        long j = this.f236988d;
        long j2 = this.f237009z;
        long j3 = this.f237000p.f237035a;
        if (!(j2 == 100 || j2 == 0)) {
            j = j2 == 1 ? j3 : j2;
        }
        bundle.putLong("HandoverId", j);
    }

    /* renamed from: o */
    public final void mo81943o(boolean z) {
        C88489j jVar = new C88489j(C87739bu.SET_HOTWORD_DETECTION_ENABLED);
        C62940bt btVar = C88263ve.f238733a;
        C88264vf vfVar = (C88264vf) C88265vg.f238734c.createBuilder();
        vfVar.copyOnWrite();
        C88265vg vgVar = (C88265vg) vfVar.instance;
        vgVar.f238736a |= 1;
        vgVar.f238737b = z;
        jVar.mo82014b(btVar, (C88265vg) vfVar.build());
        mo81937i(jVar.mo82013a());
    }

    @Deprecated
    /* renamed from: p */
    public final void mo81944p() {
        mo81946r(0, (Bundle) null, C88431bb.f239082a);
    }

    @Deprecated
    /* renamed from: q */
    public final void mo81945q(Bundle bundle) {
        mo81946r(bundle.containsKey("HandoverId") ? bundle.getLong("HandoverId") : 0, (Bundle) null, C88431bb.f239082a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x004c  */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00e4  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00fb  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: r */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo81946r(long r9, android.os.Bundle r11, com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88431bb r12) {
        /*
            r8 = this;
            com.google.android.apps.gsa.shared.s.a.a r0 = r8.f236987c
            boolean r0 = r0.mo84225b()
            if (r0 == 0) goto L_0x000d
            java.lang.String r0 = "SearchSrvCliStart"
            android.os.Trace.beginSection(r0)
        L_0x000d:
            r8.m142698B()
            r0 = 0
            r2 = 1
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 == 0) goto L_0x001d
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0048
            r9 = r2
        L_0x001d:
            if (r11 != 0) goto L_0x0024
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
        L_0x0024:
            com.google.android.apps.gsa.search.shared.service.ClientConfig r4 = r8.f237008y
            com.google.common.o.amo r4 = r4.f236951d
            com.google.common.o.amo r4 = com.google.android.apps.gsa.shared.logger.C89949q.m146517a(r4)
            java.lang.String r5 = com.google.android.apps.gsa.shared.util.p7174l.C91053a.m148742b(r11)
            boolean r5 = android.text.TextUtils.isEmpty(r5)
            if (r5 != 0) goto L_0x0037
            goto L_0x0048
        L_0x0037:
            int r4 = r4.f159234au
            java.lang.String r4 = java.lang.String.valueOf(r4)
            java.lang.String r5 = "and.gsa.d.ssc"
            java.lang.String r4 = com.google.android.apps.gsa.shared.util.p7174l.C91053a.m148741a(r5, r4)
            java.lang.String r5 = "source"
            r11.putString(r5, r4)
        L_0x0048:
            int r4 = (r9 > r0 ? 1 : (r9 == r0 ? 0 : -1))
            if (r4 != 0) goto L_0x0054
            boolean r9 = r8.f237002r
            if (r9 == 0) goto L_0x0052
            r9 = r2
            goto L_0x0054
        L_0x0052:
            long r9 = r8.f237001q
        L_0x0054:
            long r0 = r8.f237001q
            com.google.android.apps.gsa.search.shared.service.ClientEventData r4 = r8.f236999o
            if (r4 != 0) goto L_0x0078
            boolean r4 = com.google.android.apps.gsa.shared.p6997as.p6998a.C89287a.m145218a(r9)
            if (r4 == 0) goto L_0x0065
            r0 = 0
            r8.f237002r = r0
            r0 = r9
            goto L_0x007b
        L_0x0065:
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 == 0) goto L_0x0070
            r2 = 100
            int r4 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x0078
            r9 = r2
        L_0x0070:
            com.google.android.apps.gsa.shared.x.a r0 = f236984s
            java.util.concurrent.atomic.AtomicLong r0 = r0.f254534a
            long r0 = r0.incrementAndGet()
        L_0x0078:
            r6 = r9
            r9 = r0
            r0 = r6
        L_0x007b:
            r8.f237001q = r9
            com.google.common.f.ad r9 = com.google.common.p4526f.C58979ad.FULL
            java.lang.String r10 = "stack size"
            com.google.common.p4526f.p4534f.C59081b.m91349a(r9, r10)
            com.google.android.apps.gsa.search.shared.service.b.xk r9 = com.google.android.apps.gsa.search.shared.service.p6935b.C88323xk.f238852f
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.apps.gsa.search.shared.service.b.xj r9 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88322xj) r9
            long r2 = r8.f236988d
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.apps.gsa.search.shared.service.b.xk r10 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88323xk) r10
            int r4 = r10.f238854a
            r4 = r4 | 1
            r10.f238854a = r4
            r10.f238855b = r2
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.apps.gsa.search.shared.service.b.xk r10 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88323xk) r10
            int r2 = r10.f238854a
            r2 = r2 | 2
            r10.f238854a = r2
            r10.f238856c = r0
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.apps.gsa.search.shared.service.b.xk r10 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88323xk) r10
            r12.getClass()
            r10.f238857d = r12
            int r12 = r10.f238854a
            r12 = r12 | 8
            r10.f238854a = r12
            long r0 = r8.f237001q
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.apps.gsa.search.shared.service.b.xk r10 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88323xk) r10
            int r12 = r10.f238854a
            r12 = r12 | 16
            r10.f238854a = r12
            r10.f238858e = r0
            com.google.protobuf.bv r9 = r9.build()
            com.google.android.apps.gsa.search.shared.service.b.xk r9 = (com.google.android.apps.gsa.search.shared.service.p6935b.C88323xk) r9
            com.google.android.apps.gsa.search.shared.service.j r10 = new com.google.android.apps.gsa.search.shared.service.j
            com.google.android.apps.gsa.search.shared.service.b.bu r12 = com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu.START_CLIENT
            r10.<init>((com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu) r12)
            com.google.protobuf.bt r12 = com.google.android.apps.gsa.search.shared.service.p6935b.C88321xi.f238851a
            r10.mo82014b(r12, r9)
            if (r11 == 0) goto L_0x00e4
            goto L_0x00e9
        L_0x00e4:
            android.os.Bundle r11 = new android.os.Bundle
            r11.<init>()
        L_0x00e9:
            r10.mo82015c(r11)
            com.google.android.apps.gsa.search.shared.service.ClientEventData r9 = r10.mo82013a()
            r8.mo81937i(r9)
            com.google.android.apps.gsa.shared.s.a.a r9 = r8.f236987c
            boolean r9 = r9.mo84225b()
            if (r9 == 0) goto L_0x00fe
            android.os.Trace.endSection()
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.search.shared.service.C87673aa.mo81946r(long, android.os.Bundle, com.google.android.apps.gsa.search.shared.service.c.b.bb):void");
    }

    /* renamed from: s */
    public final void mo81947s(Bundle bundle) {
        mo81946r(1, bundle, C88431bb.f239082a);
    }

    /* renamed from: t */
    public final void mo81948t(boolean z) {
        this.f237007x = z;
        C88489j jVar = new C88489j(C87739bu.STOP_CLIENT);
        C62940bt btVar = C88324xl.f238860a;
        C88325xm xmVar = (C88325xm) C88326xn.f238861d.createBuilder();
        long j = this.f236988d;
        xmVar.copyOnWrite();
        C88326xn xnVar = (C88326xn) xmVar.instance;
        xnVar.f238863a |= 1;
        xnVar.f238864b = j;
        xmVar.copyOnWrite();
        C88326xn xnVar2 = (C88326xn) xmVar.instance;
        xnVar2.f238863a |= 2;
        xnVar2.f238865c = z;
        jVar.mo82014b(btVar, (C88326xn) xmVar.build());
        mo81937i(jVar.mo82013a());
    }

    /* renamed from: u */
    public final void mo81949u() {
        mo81937i(new C88489j(C87739bu.STOP_LISTENING).mo82013a());
    }

    /* renamed from: v */
    public final void mo81950v() {
        mo81937i(new C88489j(C87739bu.STOP_SPEAKING).mo82013a());
    }

    /* renamed from: w */
    public final boolean mo81951w() {
        return m142699C() || m142700D();
    }

    /* renamed from: x */
    public final boolean mo81952x() {
        if (!this.f237006w) {
            return mo81951w();
        }
        ((C59052c) ((C59052c) f236983a.mo56225c()).mo56372aa(9761)).mo56386p("SearchServiceClient disposed and cannot be reused.");
        return false;
    }

    /* renamed from: y */
    public final boolean mo81953y() {
        return this.f236999o != null;
    }

    /* renamed from: z */
    public final void mo81954z(VoiceAction voiceAction, boolean z) {
        C88489j jVar = new C88489j(C87739bu.REQUEST_EXECUTE_ACTION);
        jVar.mo82015c(new ParcelableVoiceAction(voiceAction));
        C62940bt btVar = C88213ti.f238443a;
        C88214tj tjVar = (C88214tj) C88215tk.f238444d.createBuilder();
        tjVar.copyOnWrite();
        C88215tk tkVar = (C88215tk) tjVar.instance;
        tkVar.f238446a |= 1;
        tkVar.f238447b = 1;
        tjVar.copyOnWrite();
        C88215tk tkVar2 = (C88215tk) tjVar.instance;
        tkVar2.f238446a |= 2;
        tkVar2.f238448c = z;
        jVar.mo82014b(btVar, (C88215tk) tjVar.build());
        mo81937i(jVar.mo82013a());
    }

    public C87673aa(Context context, C87682aj ajVar, C90757ba baVar, ClientConfig clientConfig, C22871g gVar, C90476a aVar, C68214a aVar2, C58833ax axVar, C68214a aVar3) {
        this.f237009z = 0;
        this.f237002r = true;
        this.f237003t = context.getApplicationContext();
        this.f236987c = aVar;
        this.f237005v = gVar;
        this.f236991g = ajVar;
        this.f236992h = baVar;
        this.f237004u = aVar2;
        this.f236990f = axVar;
        this.f237008y = clientConfig;
        this.f236985A = aVar3;
        C88505z zVar = new C88505z();
        this.f236993i = zVar;
        zVar.f239218c = null;
        zVar.f239216a = null;
        zVar.f239217b = null;
        this.f236986b = new C88503x(this, zVar, clientConfig);
        this.f236989e = new ArrayList();
        this.f237000p = new C87685am(0, false);
        this.f236988d = m142697A();
        this.f237001q = m142697A();
    }
}
