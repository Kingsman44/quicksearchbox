package com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl;

import android.content.ComponentName;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90051dc;
import com.google.android.apps.gsa.shared.p7066m.C90069du;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123719am;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123722ap;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123723aq;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123776e;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14781a;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14782b;
import com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.C14783c;
import com.google.android.libraries.assistant.auto.tng.morris.p1068c.C14146p;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14218bb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14219bc;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14221be;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14290dt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14294dx;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14296dz;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14298ea;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14299eb;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14301ed;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14302ee;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14311en;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14325fa;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14499lm;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14625qd;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14626qe;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14627qf;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1095f.C15346t;
import com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15378f;
import com.google.android.libraries.assistant.auto.tng.suggestions.p1243h.p1253e.C16269a;
import com.google.android.libraries.assistant.pcp.p1573k.C18914ac;
import com.google.android.libraries.assistant.pcp.p1573k.C18925e;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2876d.C37182a;
import com.google.android.libraries.search.p2871b.p2895i.C37252a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3994s.p3995a.C53270hr;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58724pq;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.net.p4726a.p4727a.C62722b;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import p3186j$.util.Collection;
import p3186j$.util.Optional;
import p3186j$.util.concurrent.ConcurrentHashMap;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cq */
/* compiled from: PG */
public final class C14856cq implements C14781a {

    /* renamed from: a */
    public static final C59071e f44715a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.cq");

    /* renamed from: b */
    public static final C58485gu f44716b = C58485gu.m89832B("com.spotify.music", "com.google.android.apps.youtube.music", "com.amazon.mp3", "com.pandora.android", "com.audible.application", "com.soundcloud.android", "com.sirius", "com.clearchannel.iheartradio.controller", "deezer.android.app", "com.jio.media.jiobeats");

    /* renamed from: c */
    public final C16269a f44717c;

    /* renamed from: d */
    public final C15378f f44718d;

    /* renamed from: e */
    public final C37215b f44719e;

    /* renamed from: f */
    public final C21370a f44720f;

    /* renamed from: g */
    public final C86124t f44721g;

    /* renamed from: h */
    public final ConcurrentHashMap f44722h = new ConcurrentHashMap();

    /* renamed from: i */
    public final AtomicReference f44723i = new AtomicReference(C14626qe.STATUS_UNKNOWN);

    /* renamed from: j */
    public C58485gu f44724j = C58485gu.m89845m();

    /* renamed from: k */
    private final Context f44725k;

    /* renamed from: l */
    private final C60887da f44726l;

    /* renamed from: m */
    private final C15346t f44727m;

    /* renamed from: n */
    private final C18914ac f44728n;

    /* renamed from: o */
    private final AtomicReference f44729o = new AtomicReference();

    /* renamed from: p */
    private final AtomicReference f44730p = new AtomicReference();

    /* renamed from: q */
    private final AtomicBoolean f44731q = new AtomicBoolean(false);

    public C14856cq(C16269a aVar, Context context, C60887da daVar, C86124t tVar, C15346t tVar2, C15378f fVar, C37215b bVar, C21370a aVar2, C18914ac acVar) {
        this.f44717c = aVar;
        this.f44725k = context;
        this.f44726l = daVar;
        this.f44721g = tVar;
        this.f44727m = tVar2;
        this.f44718d = fVar;
        this.f44719e = bVar;
        this.f44720f = aVar2;
        this.f44728n = acVar;
    }

    /* renamed from: k */
    public static String m31239k(String str, String str2) {
        return new ComponentName(str, str2).flattenToString();
    }

    /* renamed from: n */
    public static boolean m31240n(String str) {
        return "mini.for_you".equals(str) || "drivingscreen.for_you".equals(str);
    }

    /* renamed from: o */
    private final C14221be m31241o(C14219bc bcVar, List list, boolean z, boolean z2) {
        C14296dz dzVar;
        C14221be beVar;
        C14298ea eaVar = (C14298ea) C14299eb.f43261d.createBuilder();
        if (bcVar.f43038a == 12) {
            dzVar = (C14296dz) bcVar.f43039b;
        } else {
            dzVar = C14296dz.f43258b;
        }
        C14302ee eeVar = dzVar.f43260a;
        if (eeVar == null) {
            eeVar = C14302ee.f43267d;
        }
        if ("com.google.android.apps.youtube.music".equals(eeVar.f43270b)) {
            C58976aa aaVar = C58975e.f156826a;
            this.f44723i.get();
            C14625qd qdVar = (C14625qd) C14627qf.f44206b.createBuilder();
            qdVar.copyOnWrite();
            ((C14627qf) qdVar.instance).f44208a = ((C14626qe) this.f44723i.get()).getNumber();
            eaVar.copyOnWrite();
            C14627qf qfVar = (C14627qf) qdVar.build();
            qfVar.getClass();
            ((C14299eb) eaVar.instance).f43265c = qfVar;
        }
        if ((list == null || list.isEmpty()) && z) {
            if (list == null) {
                list = new ArrayList();
            }
            list.add(mo21777j(C18925e.m36384b(this.f44725k)));
        }
        if (z2 && this.f44721g.mo79746e(C90051dc.f248789X)) {
            if (list == null || Collection.EL.stream(list).allMatch(C14844ce.f44701a)) {
                C58495hd hdVar = (C58495hd) Collection.EL.stream(this.f44724j).filter(C14846cg.f44703a).collect(C58370cn.m89403c(C14847ch.f44704a, C14848ci.f44705a, C14849cj.f44706a));
                if (!hdVar.isEmpty()) {
                    List arrayList = list == null ? new ArrayList() : list;
                    C58485gu guVar = f44716b;
                    int i = ((C58724pq) guVar).f156474d;
                    int i2 = 0;
                    int i3 = 0;
                    for (int i4 = 0; i4 < i; i4++) {
                        String str = (String) guVar.get(i4);
                        if (hdVar.containsKey(str) && (!str.equals("com.google.android.apps.youtube.music") || ((C14626qe) this.f44723i.get()).equals(C14626qe.YOUTUBE_PREMIUM_USER))) {
                            arrayList.add(i3, m31242p((C14216b) hdVar.get(str)));
                            i3++;
                            if (i3 == 2) {
                                break;
                            }
                        }
                    }
                    if (i3 < 2) {
                        C58485gu guVar2 = (C58485gu) Collection.EL.stream(this.f44724j).filter(C14850ck.f44707a).collect(C58370cn.f155946a);
                        int size = guVar2.size();
                        while (i2 < size) {
                            arrayList.add(i3, m31242p((C14216b) guVar2.get(i2)));
                            i3++;
                            i2++;
                            if (i3 == 2) {
                                break;
                            }
                        }
                    }
                    if (i3 < 2 && hdVar.containsKey("com.google.android.apps.youtube.music")) {
                        arrayList.add(i3, m31242p((C14216b) hdVar.get("com.google.android.apps.youtube.music")));
                    }
                }
            } else {
                C58976aa aaVar2 = C58975e.f156826a;
            }
        }
        if (list == null || list.isEmpty()) {
            C58976aa aaVar3 = C58975e.f156826a;
            beVar = C14783c.m31117a((C14299eb) eaVar.build());
        } else {
            eaVar.copyOnWrite();
            C14299eb ebVar = (C14299eb) eaVar.instance;
            C62971cq cqVar = ebVar.f43263a;
            if (!cqVar.mo58948c()) {
                ebVar.f43263a = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) list, (List) ebVar.f43263a);
            beVar = C14783c.m31117a((C14299eb) eaVar.build());
        }
        this.f44730p.set((Object) null);
        return beVar;
    }

    /* renamed from: p */
    private static C14292dv m31242p(C14216b bVar) {
        C14290dt dtVar = (C14290dt) C14292dv.f43233q.createBuilder();
        dtVar.copyOnWrite();
        bVar.getClass();
        ((C14292dv) dtVar.instance).f43239e = bVar;
        dtVar.copyOnWrite();
        ((C14292dv) dtVar.instance).f43250p = 4;
        return (C14292dv) dtVar.build();
    }

    /* renamed from: q */
    private final synchronized C60870cx m31243q(String str, List list, C60870cx cxVar, C53306j jVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f44730p.get();
        C14855cp cpVar = (C14855cp) this.f44730p.get();
        if (cpVar != null) {
            if (cpVar.mo21751b().equals(str)) {
                return cpVar.mo21750a();
            }
            cpVar.mo21750a().cancel(false);
            this.f44719e.mo19974a(C37182a.f97787aS.mo40805c(C62722b.CANCELLED));
            cpVar.mo21750a().cancel(false);
            this.f44730p.set((Object) null);
        }
        this.f44719e.mo19974a(C37182a.f97785aQ);
        this.f44722h.clear();
        this.f44720f.mo26870b();
        AtomicReference atomicReference = this.f44730p;
        C14851cl clVar = new C14851cl(this, jVar, list);
        C60870cx h = C60922j.m93045h(cxVar, C47810es.m84966f(clVar), this.f44726l);
        C14852cm cmVar = new C14852cm(this, str);
        atomicReference.set(new C14812b(str, C60922j.m93045h(h, C47810es.m84966f(cmVar), this.f44726l)));
        C14855cp cpVar2 = (C14855cp) this.f44730p.get();
        cpVar2.getClass();
        return cpVar2.mo21750a();
    }

    /* renamed from: r */
    private final C60870cx m31244r() {
        C60870cx cxVar = (C60870cx) this.f44729o.get();
        if (cxVar != null) {
            return cxVar;
        }
        C60870cx s = m31245s();
        this.f44729o.set(s);
        return s;
    }

    /* renamed from: s */
    private final C60870cx m31245s() {
        C58976aa aaVar = C58975e.f156826a;
        C14845cf cfVar = new C14845cf(this);
        return C60856cj.m92904m(C47810es.m84978r(cfVar), this.f44726l);
    }

    /* renamed from: u */
    private final Optional m31246u(ComponentName componentName) {
        if (!this.f44721g.mo79745c(C90069du.f249735m).contains(componentName.getPackageName())) {
            return Optional.empty();
        }
        C59104x b = f44715a.mo56224b();
        b.mo56378ag(C58975e.f156826a, "Morris.MediaPcpDataSrc");
        ((C59052c) ((C59052c) b).mo56372aa(45623)).mo56386p("#Set driving mode");
        Bundle bundle = new Bundle();
        bundle.putBoolean("android.media.browse.ASSISTANT_DRIVING_MODE", true);
        return Optional.m71637of(bundle);
    }

    /* renamed from: v */
    private final String m31247v(String str) {
        if (this.f44724j.isEmpty()) {
            return BuildConfig.FLAVOR;
        }
        ArrayList arrayList = new ArrayList();
        C58485gu guVar = this.f44724j;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C14216b bVar = (C14216b) guVar.get(i);
            if (bVar.f43011c.equals(str)) {
                arrayList.add(bVar.f43012d);
            }
        }
        if (arrayList.size() == 1) {
            return (String) arrayList.get(0);
        }
        C59104x d = f44715a.mo56226d();
        d.mo56378ag(C58975e.f156826a, "Morris.MediaPcpDataSrc");
        ((C59052c) ((C59052c) d).mo56372aa(45624)).mo56387q("Did not find a matching className. %d", arrayList.size());
        return BuildConfig.FLAVOR;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo21501a() {
    }

    /* renamed from: b */
    public final void mo21502b() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f44729o.get() == null) {
            this.f44729o.set(m31245s());
        }
    }

    /* renamed from: c */
    public final void mo21503c() {
        C58976aa aaVar = C58975e.f156826a;
        this.f44731q.set(true);
    }

    /* renamed from: d */
    public final void mo21504d() {
        C58976aa aaVar = C58975e.f156826a;
        C60870cx cxVar = (C60870cx) this.f44729o.get();
        if (cxVar != null && !cxVar.isDone()) {
            boolean cancel = cxVar.cancel(false);
            C59104x b = f44715a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "Morris.MediaPcpDataSrc");
            ((C59052c) ((C59052c) b).mo56372aa(45638)).mo56389s("#onMorrisStopped() fetchAppListFuture cancelled: %b", Boolean.valueOf(cancel));
        }
        this.f44729o.set((Object) null);
        this.f44724j = C58485gu.m89845m();
        C14855cp cpVar = (C14855cp) this.f44730p.get();
        if (cpVar != null && !cpVar.mo21750a().isDone()) {
            boolean cancel2 = cpVar.mo21750a().cancel(false);
            C59104x b2 = f44715a.mo56224b();
            b2.mo56378ag(C58975e.f156826a, "Morris.MediaPcpDataSrc");
            ((C59052c) ((C59052c) b2).mo56372aa(45637)).mo56355H("#onMorrisStopped() fetchMediaItemsDataFuture %s cancelled: %b", cpVar.mo21751b(), cancel2);
        }
        this.f44730p.set((Object) null);
        this.f44722h.clear();
    }

    /* renamed from: e */
    public final /* synthetic */ void mo21505e() {
    }

    /* renamed from: f */
    public final C14216b mo21776f(String str, String str2) {
        if (!str2.isEmpty()) {
            return this.f44727m.mo22212a(str, str2);
        }
        return this.f44727m.mo22212a(str, m31247v(str));
    }

    /* renamed from: g */
    public final /* synthetic */ void mo21506g() {
    }

    /* renamed from: h */
    public final C14221be mo21727h(C14219bc bcVar) {
        C14296dz dzVar;
        C14296dz dzVar2;
        C14296dz dzVar3;
        C58485gu guVar;
        C58976aa aaVar = C58975e.f156826a;
        C14218bb bbVar = C14218bb.MEDIA_UI_DATA_REQUEST;
        if (C14218bb.m30579a(bcVar.f43038a).ordinal() != 8) {
            return C14221be.f43041c;
        }
        if (bcVar.f43038a == 12) {
            dzVar = (C14296dz) bcVar.f43039b;
        } else {
            dzVar = C14296dz.f43258b;
        }
        C14302ee eeVar = dzVar.f43260a;
        if (eeVar == null) {
            eeVar = C14302ee.f43267d;
        }
        int b = C14301ed.m30599b(eeVar.f43269a);
        if (b == 0) {
            b = 1;
        }
        int i = b - 2;
        if (i == 1) {
            int i2 = bcVar.f43038a;
            if (i2 == 12) {
                dzVar2 = (C14296dz) bcVar.f43039b;
            } else {
                dzVar2 = C14296dz.f43258b;
            }
            C14302ee eeVar2 = dzVar2.f43260a;
            if (eeVar2 == null) {
                eeVar2 = C14302ee.f43267d;
            }
            String str = eeVar2.f43270b;
            if (i2 == 12) {
                dzVar3 = (C14296dz) bcVar.f43039b;
            } else {
                dzVar3 = C14296dz.f43258b;
            }
            C14302ee eeVar3 = dzVar3.f43260a;
            if (eeVar3 == null) {
                eeVar3 = C14302ee.f43267d;
            }
            String str2 = eeVar3.f43271c;
            if (str2.isEmpty()) {
                Iterator it = this.f44722h.keySet().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        guVar = C58485gu.m89845m();
                        break;
                    }
                    String str3 = (String) it.next();
                    if (!m31240n(str3)) {
                        ComponentName unflattenFromString = ComponentName.unflattenFromString(str3);
                        unflattenFromString.getClass();
                        if (str.equals(unflattenFromString.getPackageName())) {
                            guVar = C58485gu.m89842j((java.util.Collection) this.f44722h.get(str3));
                            break;
                        }
                    }
                }
            } else if (this.f44722h.get(m31239k(str, str2)) == null) {
                guVar = C58485gu.m89845m();
            } else {
                List list = (List) this.f44722h.get(m31239k(str, str2));
                list.getClass();
                guVar = C58485gu.m89842j(list);
            }
            return m31241o(bcVar, guVar, false, false);
        } else if (i == 2) {
            return m31241o(bcVar, (List) this.f44722h.get("mini.for_you"), true, true);
        } else {
            if (i == 3) {
                C14298ea eaVar = (C14298ea) C14299eb.f43261d.createBuilder();
                C58485gu guVar2 = this.f44724j;
                eaVar.copyOnWrite();
                C14299eb ebVar = (C14299eb) eaVar.instance;
                C62971cq cqVar = ebVar.f43264b;
                if (!cqVar.mo58948c()) {
                    ebVar.f43264b = C62942bv.mutableCopy(cqVar);
                }
                C62947c.addAll((Iterable) guVar2, (List) ebVar.f43264b);
                return C14783c.m31117a((C14299eb) eaVar.build());
            } else if (i != 4) {
                return C14221be.f43041c;
            } else {
                return m31241o(bcVar, (List) this.f44722h.get("drivingscreen.for_you"), true, true);
            }
        }
    }

    /* renamed from: i */
    public final C60870cx mo21728i(C14219bc bcVar) {
        C14296dz dzVar;
        C14296dz dzVar2;
        C14296dz dzVar3;
        C58976aa aaVar = C58975e.f156826a;
        C14218bb bbVar = C14218bb.MEDIA_UI_DATA_REQUEST;
        if (C14218bb.m30579a(bcVar.f43038a).ordinal() != 8) {
            return C60856cj.m92900i(C14782b.FAILED);
        }
        if (bcVar.f43038a == 12) {
            dzVar = (C14296dz) bcVar.f43039b;
        } else {
            dzVar = C14296dz.f43258b;
        }
        C14302ee eeVar = dzVar.f43260a;
        if (eeVar == null) {
            eeVar = C14302ee.f43267d;
        }
        int b = C14301ed.m30599b(eeVar.f43269a);
        if (b == 0) {
            b = 1;
        }
        int i = b - 2;
        if (i == 1) {
            int i2 = bcVar.f43038a;
            if (i2 == 12) {
                dzVar2 = (C14296dz) bcVar.f43039b;
            } else {
                dzVar2 = C14296dz.f43258b;
            }
            C14302ee eeVar2 = dzVar2.f43260a;
            if (eeVar2 == null) {
                eeVar2 = C14302ee.f43267d;
            }
            String str = eeVar2.f43270b;
            if (i2 == 12) {
                dzVar3 = (C14296dz) bcVar.f43039b;
            } else {
                dzVar3 = C14296dz.f43258b;
            }
            C14302ee eeVar3 = dzVar3.f43260a;
            if (eeVar3 == null) {
                eeVar3 = C14302ee.f43267d;
            }
            String str2 = eeVar3.f43271c;
            String k = m31239k(str, str2);
            C58485gu n = C58485gu.m89846n(9);
            C123776e eVar = (C123776e) C123777f.f341922a.createBuilder();
            C62940bt btVar = C123726at.f341744i;
            C123719am amVar = (C123719am) C123726at.f341743h.createBuilder();
            C123722ap apVar = (C123722ap) C123723aq.f341737d.createBuilder();
            apVar.copyOnWrite();
            C123723aq aqVar = (C123723aq) apVar.instance;
            str.getClass();
            aqVar.f341739a = 1 | aqVar.f341739a;
            aqVar.f341740b = str;
            apVar.copyOnWrite();
            C123723aq aqVar2 = (C123723aq) apVar.instance;
            str2.getClass();
            aqVar2.f341739a = 2 | aqVar2.f341739a;
            aqVar2.f341741c = str2;
            amVar.mo106110b(apVar);
            amVar.copyOnWrite();
            C123726at atVar = (C123726at) amVar.instance;
            atVar.f341750e = 3;
            atVar.f341746a |= 4;
            eVar.mo58885m(btVar, (C123726at) amVar.build());
            return m31243q(k, n, C60856cj.m92900i((C123777f) eVar.build()), C53306j.MORRIS);
        } else if (i == 2) {
            return m31243q("mini.for_you", C58485gu.m89846n(10), C60922j.m93044g(m31244r(), C47810es.m84963c(new C14853cn(this)), this.f44726l), C53306j.MORRIS);
        } else if (i == 3) {
            return m31244r();
        } else {
            if (i != 4) {
                return C60856cj.m92900i(C14782b.FAILED);
            }
            return m31243q("drivingscreen.for_you", C58485gu.m89846n(10), C60922j.m93044g(m31244r(), C47810es.m84963c(new C14854co(this)), this.f44726l), C53306j.MORRIS_DRIVING_SCREEN);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x0160  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x016d  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01c8  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x01ee  */
    /* renamed from: j */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv mo21777j(com.google.assistant.p3897e.p3921j.C52560wg r15) {
        /*
            r14 = this;
            com.google.android.apps.gsa.search.core.i.t r0 = r14.f44721g
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248823ae
            boolean r0 = r0.mo79746e(r1)
            int r1 = r15.f137946b
            r2 = 16
            if (r1 != r2) goto L_0x0013
            java.lang.Object r1 = r15.f137947c
            com.google.assistant.e.c.c.dg r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r1
            goto L_0x0015
        L_0x0013:
            com.google.assistant.e.c.c.dg r1 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x0015:
            int r1 = r1.f132829a
            r1 = r1 & 8
            java.lang.String r3 = r15.f137952h
            com.google.assistant.e.c.c.gh r4 = r15.f137949e
            if (r4 != 0) goto L_0x0021
            com.google.assistant.e.c.c.gh r4 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x0021:
            int r5 = r4.f133012b
            r6 = 1
            if (r5 != r6) goto L_0x002b
            java.lang.Object r4 = r4.f133013c
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4
            goto L_0x002d
        L_0x002b:
            com.google.assistant.e.c.c.ev r4 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
        L_0x002d:
            java.lang.String r4 = r4.f132944b
            com.google.assistant.e.j.wo r5 = r15.f137950f
            if (r5 != 0) goto L_0x0035
            com.google.assistant.e.j.wo r5 = com.google.assistant.p3897e.p3921j.C52568wo.f137992v
        L_0x0035:
            boolean r6 = com.google.common.base.C58837ba.m90859h(r4)
            java.lang.String r7 = ""
            if (r6 == 0) goto L_0x0063
            int r6 = r5.f138003j
            com.google.assistant.e.j.wn r6 = com.google.assistant.p3897e.p3921j.C52567wn.m86649b(r6)
            if (r6 != 0) goto L_0x0047
            com.google.assistant.e.j.wn r6 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
        L_0x0047:
            com.google.assistant.e.j.wn r8 = com.google.assistant.p3897e.p3921j.C52567wn.NEWS
            java.lang.String r9 = "com.google.android.googlequicksearchbox"
            if (r6 != r8) goto L_0x0052
            java.lang.String r4 = "com.google.android.apps.gsa.staticplugins.mediabrowser.OpaMediaBrowserService"
        L_0x004f:
            r6 = r4
            r4 = r9
            goto L_0x0064
        L_0x0052:
            int r6 = r5.f138003j
            com.google.assistant.e.j.wn r6 = com.google.assistant.p3897e.p3921j.C52567wn.m86649b(r6)
            if (r6 != 0) goto L_0x005c
            com.google.assistant.e.j.wn r6 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
        L_0x005c:
            com.google.assistant.e.j.wn r8 = com.google.assistant.p3897e.p3921j.C52567wn.PODCAST_EPISODE
            if (r6 != r8) goto L_0x0063
            java.lang.String r4 = "com.google.android.apps.search.podcasts.browser.PodcastBrowserService"
            goto L_0x004f
        L_0x0063:
            r6 = r7
        L_0x0064:
            com.google.assistant.e.c.c.gh r8 = r15.f137949e
            if (r8 != 0) goto L_0x006a
            com.google.assistant.e.c.c.gh r8 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
        L_0x006a:
            java.lang.String r8 = r8.f133014d
            boolean r9 = r4.isEmpty()
            boolean r10 = r8.isEmpty()
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv.f43233q
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.dt r11 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14290dt) r11
            java.lang.String r12 = r5.f138000g
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r13 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r13
            r12.getClass()
            r13.f43246l = r12
            java.lang.String r12 = r5.f137998e
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r13 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r13
            r12.getClass()
            r13.f43241g = r12
            java.lang.String r12 = r5.f137999f
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r13 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r13
            r12.getClass()
            r13.f43240f = r12
            int r12 = r5.f138003j
            com.google.assistant.e.j.wn r12 = com.google.assistant.p3897e.p3921j.C52567wn.m86649b(r12)
            if (r12 != 0) goto L_0x00b0
            com.google.assistant.e.j.wn r12 = com.google.assistant.p3897e.p3921j.C52567wn.UNKNOWN
        L_0x00b0:
            int r12 = r12.f137991y
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r13 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r13
            r13.f43247m = r12
            int r12 = r15.f137945a
            r12 = r12 & 8192(0x2000, float:1.14794E-41)
            if (r12 == 0) goto L_0x00d3
            com.google.protos.ai.b.j r12 = r15.f137953i
            if (r12 != 0) goto L_0x00c7
            com.google.protos.ai.b.j r12 = com.google.protos.p4816ai.p4818b.C63204j.f170749e
        L_0x00c7:
            r11.copyOnWrite()
            com.google.protobuf.bv r13 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r13 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r13
            r12.getClass()
            r13.f43248n = r12
        L_0x00d3:
            boolean r12 = r3.isEmpty()
            if (r12 != 0) goto L_0x00e5
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r12
            r3.getClass()
            r12.f43243i = r3
        L_0x00e5:
            if (r1 == 0) goto L_0x0139
            int r1 = r15.f137946b
            if (r1 != r2) goto L_0x00f0
            java.lang.Object r1 = r15.f137947c
            com.google.assistant.e.c.c.dg r1 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r1
            goto L_0x00f2
        L_0x00f0:
            com.google.assistant.e.c.c.dg r1 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x00f2:
            com.google.assistant.e.j.du r1 = r1.f132833e
            if (r1 != 0) goto L_0x00f8
            com.google.assistant.e.j.du r1 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x00f8:
            if (r0 == 0) goto L_0x012c
            j$.util.Optional r0 = com.google.android.libraries.assistant.p1363c.p1451h.C17590a.m34883b(r1)
            com.google.android.libraries.assistant.auto.tng.morris.h.d r2 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15376d.f46153a
            j$.util.Optional r0 = r0.map(r2)
            java.lang.Object r0 = r0.orElse(r7)
            java.lang.String r0 = (java.lang.String) r0
            boolean r2 = r0.isEmpty()
            if (r2 != 0) goto L_0x011f
            com.google.common.f.aa r1 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r1
            r0.getClass()
            r1.f43249o = r0
            goto L_0x014d
        L_0x011f:
            r11.copyOnWrite()
            com.google.protobuf.bv r0 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r0
            r1.getClass()
            r0.f43244j = r1
            goto L_0x014d
        L_0x012c:
            r11.copyOnWrite()
            com.google.protobuf.bv r0 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r0
            r1.getClass()
            r0.f43244j = r1
            goto L_0x014d
        L_0x0139:
            int r0 = r15.f137945a
            r0 = r0 & 32
            if (r0 == 0) goto L_0x014d
            java.lang.String r0 = r15.f137951g
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r1
            r0.getClass()
            r1.f43245k = r0
        L_0x014d:
            boolean r15 = com.google.android.libraries.assistant.pcp.p1573k.C18925e.m36386d(r15)
            if (r15 == 0) goto L_0x015d
            r11.copyOnWrite()
            com.google.protobuf.bv r0 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r0
            r1 = 3
            r0.f43250p = r1
        L_0x015d:
            r0 = 4
            if (r9 == 0) goto L_0x0163
            if (r10 != 0) goto L_0x01e8
            r10 = 0
        L_0x0163:
            com.google.android.libraries.assistant.auto.tng.morris.e.b r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b.f43007f
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.a r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14189a) r1
            if (r9 != 0) goto L_0x01c6
            r1.copyOnWrite()
            com.google.protobuf.bv r2 = r1.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.b r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b) r2
            r4.getClass()
            r2.f43011c = r4
            boolean r2 = r6.isEmpty()
            if (r2 == 0) goto L_0x0183
            java.lang.String r6 = r14.m31247v(r4)
        L_0x0183:
            boolean r2 = r6.isEmpty()
            if (r2 != 0) goto L_0x01c6
            com.google.android.libraries.assistant.auto.tng.morris.g.f.t r2 = r14.f44727m
            android.content.ComponentName r3 = new android.content.ComponentName
            r3.<init>(r4, r6)
            java.lang.String r2 = r2.mo22215e(r3)
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.b r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b) r3
            r6.getClass()
            r3.f43012d = r6
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.b r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b) r3
            r2.getClass()
            r3.f43013e = r2
            com.google.protobuf.bv r3 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r3 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r3
            java.lang.String r3 = r3.f43241g
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x01c6
            if (r15 == 0) goto L_0x01c6
            r11.copyOnWrite()
            com.google.protobuf.bv r15 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r15 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r15
            r2.getClass()
            r15.f43241g = r2
        L_0x01c6:
            if (r10 != 0) goto L_0x01d6
            r1.copyOnWrite()
            com.google.protobuf.bv r15 = r1.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.b r15 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b) r15
            r8.getClass()
            r15.f43009a = r0
            r15.f43010b = r8
        L_0x01d6:
            r11.copyOnWrite()
            com.google.protobuf.bv r15 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r15 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r15
            com.google.protobuf.bv r1 = r1.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.b r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14216b) r1
            r1.getClass()
            r15.f43239e = r1
        L_0x01e8:
            int r15 = r5.f137994a
            r15 = r15 & 1024(0x400, float:1.435E-42)
            if (r15 == 0) goto L_0x0230
            com.google.assistant.e.c.c.dc r15 = r5.f138004k
            if (r15 != 0) goto L_0x01f4
            com.google.assistant.e.c.c.dc r15 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x01f4:
            com.google.protobuf.z r15 = r15.f132819e
            boolean r15 = r15.mo59173M()
            if (r15 != 0) goto L_0x0214
            com.google.assistant.e.c.c.dc r15 = r5.f138004k
            if (r15 != 0) goto L_0x0202
            com.google.assistant.e.c.c.dc r15 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x0202:
            com.google.protobuf.z r15 = r15.f132819e
            r11.copyOnWrite()
            com.google.protobuf.bv r0 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r0
            r15.getClass()
            r1 = 5
            r0.f43235a = r1
            r0.f43236b = r15
            goto L_0x0230
        L_0x0214:
            com.google.assistant.e.c.c.dc r15 = r5.f138004k
            if (r15 != 0) goto L_0x021a
            com.google.assistant.e.c.c.dc r15 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x021a:
            java.lang.String r15 = r15.f132817c
            boolean r1 = r15.isEmpty()
            if (r1 != 0) goto L_0x0230
            r11.copyOnWrite()
            com.google.protobuf.bv r1 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r1
            r15.getClass()
            r1.f43235a = r0
            r1.f43236b = r15
        L_0x0230:
            com.google.protobuf.bv r15 = r11.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.dv r15 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14292dv) r15
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.framework.datasources.impl.C14856cq.mo21777j(com.google.assistant.e.j.wg):com.google.android.libraries.assistant.auto.tng.morris.e.dv");
    }

    /* renamed from: l */
    public final List mo21778l(String str) {
        List list = (List) this.f44722h.get(str);
        if (list != null) {
            return list;
        }
        this.f44722h.put(str, new ArrayList());
        return (List) this.f44722h.get(str);
    }

    /* renamed from: m */
    public final List mo21779m() {
        ArrayList arrayList = new ArrayList(this.f44724j.size());
        C58485gu guVar = this.f44724j;
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C14216b bVar = (C14216b) guVar.get(i);
            C123722ap apVar = (C123722ap) C123723aq.f341737d.createBuilder();
            String str = bVar.f43011c;
            apVar.copyOnWrite();
            C123723aq aqVar = (C123723aq) apVar.instance;
            str.getClass();
            aqVar.f341739a |= 1;
            aqVar.f341740b = str;
            String str2 = bVar.f43012d;
            apVar.copyOnWrite();
            C123723aq aqVar2 = (C123723aq) apVar.instance;
            str2.getClass();
            aqVar2.f341739a |= 2;
            aqVar2.f341741c = str2;
            arrayList.add((C123723aq) apVar.build());
        }
        return arrayList;
    }

    /* renamed from: t */
    public final void mo21729t(C14219bc bcVar, C14324f fVar, C14499lm lmVar) {
        C14294dx dxVar;
        C14294dx dxVar2;
        C14294dx dxVar3;
        C14294dx dxVar4;
        C14294dx dxVar5;
        C14294dx dxVar6;
        C14294dx dxVar7;
        C14294dx dxVar8;
        C14325fa faVar;
        C14325fa faVar2;
        C14311en enVar;
        C14311en enVar2;
        C58976aa aaVar = C58975e.f156826a;
        C14218bb bbVar = C14218bb.MEDIA_UI_DATA_REQUEST;
        int ordinal = C14218bb.m30579a(bcVar.f43038a).ordinal();
        if (ordinal == 11) {
            if (bcVar.f43038a == 13) {
                dxVar = (C14294dx) bcVar.f43039b;
            } else {
                dxVar = C14294dx.f43252e;
            }
            if (!dxVar.f43256c.isEmpty()) {
                int i = bcVar.f43038a;
                if (i == 13) {
                    dxVar6 = (C14294dx) bcVar.f43039b;
                } else {
                    dxVar6 = C14294dx.f43252e;
                }
                String str = dxVar6.f43254a;
                if (i == 13) {
                    dxVar7 = (C14294dx) bcVar.f43039b;
                } else {
                    dxVar7 = C14294dx.f43252e;
                }
                ComponentName componentName = new ComponentName(str, dxVar7.f43255b);
                if (bcVar.f43038a == 13) {
                    dxVar8 = (C14294dx) bcVar.f43039b;
                } else {
                    dxVar8 = C14294dx.f43252e;
                }
                String str2 = dxVar8.f43256c;
                componentName.flattenToString();
                this.f44728n.mo24210e(componentName, str2, m31246u(componentName));
                return;
            }
            if (bcVar.f43038a == 13) {
                dxVar2 = (C14294dx) bcVar.f43039b;
            } else {
                dxVar2 = C14294dx.f43252e;
            }
            if (!dxVar2.f43257d.isEmpty()) {
                if (bcVar.f43038a == 13) {
                    dxVar3 = (C14294dx) bcVar.f43039b;
                } else {
                    dxVar3 = C14294dx.f43252e;
                }
                Uri parse = Uri.parse(dxVar3.f43257d);
                int i2 = bcVar.f43038a;
                if (i2 == 13) {
                    dxVar4 = (C14294dx) bcVar.f43039b;
                } else {
                    dxVar4 = C14294dx.f43252e;
                }
                String str3 = dxVar4.f43254a;
                if (i2 == 13) {
                    dxVar5 = (C14294dx) bcVar.f43039b;
                } else {
                    dxVar5 = C14294dx.f43252e;
                }
                ComponentName componentName2 = new ComponentName(str3, dxVar5.f43255b);
                componentName2.flattenToString();
                this.f44728n.mo24210e(componentName2, parse, m31246u(componentName2));
            }
        } else if (ordinal == 12) {
            if (bcVar.f43038a == 21) {
                faVar = (C14325fa) bcVar.f43039b;
            } else {
                faVar = C14325fa.f43337c;
            }
            String str4 = faVar.f43339a;
            if (bcVar.f43038a == 21) {
                faVar2 = (C14325fa) bcVar.f43039b;
            } else {
                faVar2 = C14325fa.f43337c;
            }
            ComponentName componentName3 = new ComponentName(str4, faVar2.f43340b);
            componentName3.flattenToString();
            this.f44728n.mo24209d(componentName3, m31246u(componentName3));
        } else if (ordinal != 16) {
            if (ordinal == 17) {
                if (bcVar.f43038a == 20) {
                    enVar = (C14311en) bcVar.f43039b;
                } else {
                    enVar = C14311en.f43296b;
                }
                C14302ee eeVar = enVar.f43298a;
                if (eeVar == null) {
                    eeVar = C14302ee.f43267d;
                }
                String str5 = eeVar.f43270b;
                if (bcVar.f43038a == 20) {
                    enVar2 = (C14311en) bcVar.f43039b;
                } else {
                    enVar2 = C14311en.f43296b;
                }
                C14302ee eeVar2 = enVar2.f43298a;
                if (eeVar2 == null) {
                    eeVar2 = C14302ee.f43267d;
                }
                String str6 = eeVar2.f43271c;
                C37215b bVar = this.f44719e;
                C37252a c = C37182a.f97792aX.mo40779c();
                C14146p.m30449c(c, str5, str6);
                bVar.mo19974a(c);
                C16269a aVar = this.f44717c;
                C53306j jVar = C53306j.MORRIS;
                C58485gu n = C58485gu.m89846n(9);
                C53270hr hrVar = C53270hr.PREFETCH;
                C123776e eVar = (C123776e) C123777f.f341922a.createBuilder();
                C62940bt btVar = C123726at.f341744i;
                C123719am amVar = (C123719am) C123726at.f341743h.createBuilder();
                C123722ap apVar = (C123722ap) C123723aq.f341737d.createBuilder();
                apVar.copyOnWrite();
                C123723aq aqVar = (C123723aq) apVar.instance;
                str5.getClass();
                aqVar.f341739a |= 1;
                aqVar.f341740b = str5;
                apVar.copyOnWrite();
                C123723aq aqVar2 = (C123723aq) apVar.instance;
                str6.getClass();
                aqVar2.f341739a |= 2;
                aqVar2.f341741c = str6;
                amVar.mo106110b(apVar);
                eVar.mo58885m(btVar, (C123726at) amVar.build());
                aVar.mo22867a(jVar, n, false, hrVar, Optional.m71637of((C123777f) eVar.build()));
                this.f44719e.mo19974a(C14146p.m30448b(C37182a.f97793aY.mo40806d(), str5, str6, C62722b.OK));
            }
        } else if (this.f44731q.getAndSet(false)) {
            C37215b bVar2 = this.f44719e;
            C37252a c2 = C37182a.f97792aX.mo40779c();
            C14146p.m30449c(c2, "foryou", "foryou");
            bVar2.mo19974a(c2);
            C16269a aVar2 = this.f44717c;
            C53306j jVar2 = C53306j.MORRIS;
            C58485gu n2 = C58485gu.m89846n(10);
            C53270hr hrVar2 = C53270hr.PREFETCH;
            C123776e eVar2 = (C123776e) C123777f.f341922a.createBuilder();
            C62940bt btVar2 = C123726at.f341744i;
            C123719am amVar2 = (C123719am) C123726at.f341743h.createBuilder();
            amVar2.mo106109a(mo21779m());
            long a = this.f44721g.mo79743a(C90051dc.f248880bi);
            amVar2.copyOnWrite();
            C123726at atVar = (C123726at) amVar2.instance;
            atVar.f341746a |= 2;
            atVar.f341749d = (int) a;
            eVar2.mo58885m(btVar2, (C123726at) amVar2.build());
            aVar2.mo22867a(jVar2, n2, false, hrVar2, Optional.m71637of((C123777f) eVar2.build()));
            this.f44719e.mo19974a(C14146p.m30448b(C37182a.f97793aY.mo40806d(), "foryou", "foryou", C62722b.OK));
        }
    }
}
