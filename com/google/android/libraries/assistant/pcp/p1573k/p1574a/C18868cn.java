package com.google.android.libraries.assistant.pcp.p1573k.p1574a;

import android.content.ComponentName;
import android.content.Context;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123726at;
import com.google.android.apps.search.assistant.platform.pcp.p9329f.C123777f;
import com.google.android.libraries.assistant.pcp.p1573k.C18912aa;
import com.google.android.libraries.assistant.pcp.p1573k.C18928h;
import com.google.android.libraries.assistant.pcp.p1573k.C18930j;
import com.google.android.libraries.assistant.pcp.p1573k.C18940t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.assistant.p3897e.p3902c.p3907c.C51058ev;
import com.google.assistant.p3897e.p3902c.p3907c.C51098gh;
import com.google.assistant.p3897e.p3921j.C52559wf;
import com.google.assistant.p3897e.p3921j.C52560wg;
import com.google.assistant.p3897e.p3921j.C52567wn;
import com.google.assistant.p3897e.p3921j.C52568wo;
import com.google.assistant.p3980n.p3985c.C53019j;
import com.google.assistant.p3980n.p3985c.C53020k;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58331bb;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60887da;
import com.google.common.util.concurrent.C60922j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protos.p4816ai.p4818b.C63204j;
import com.google.protos.p5124m.p5125a.C65599b;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Queue;
import java.util.Set;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.assistant.pcp.k.a.cn */
/* compiled from: PG */
public final class C18868cn implements C18940t {

    /* renamed from: a */
    public static final C59071e f53115a = C59071e.m91332i("com.google.android.libraries.assistant.pcp.k.a.cn");

    /* renamed from: b */
    public static final ComponentName f53116b = new ComponentName("com.google.android.googlequicksearchbox", "com.google.android.apps.search.podcasts.browser.PodcastBrowserService");

    /* renamed from: c */
    public C60218r f53117c = C60218r.f162925d;

    /* renamed from: d */
    public final Context f53118d;

    /* renamed from: e */
    public final C18928h f53119e;

    /* renamed from: f */
    public final C18930j f53120f;

    /* renamed from: g */
    public final C60887da f53121g;

    /* renamed from: h */
    public final C18912aa f53122h;

    /* renamed from: i */
    public final C58485gu f53123i;

    /* renamed from: j */
    public final C58485gu f53124j;

    public C18868cn(C18928h hVar, C18930j jVar, C18912aa aaVar, Context context, C60887da daVar, C65599b bVar, C65599b bVar2) {
        this.f53119e = hVar;
        this.f53120f = jVar;
        this.f53122h = aaVar;
        this.f53118d = context;
        this.f53121g = daVar;
        this.f53123i = C58485gu.m89842j(bVar.f178301a);
        this.f53124j = C58485gu.m89842j(bVar2.f178301a);
    }

    /* renamed from: d */
    public static boolean m36292d(C53019j jVar, C52560wg wgVar, C53306j jVar2, Set set) {
        C51058ev evVar;
        C51098gh ghVar = wgVar.f137949e;
        if (ghVar == null) {
            ghVar = C51098gh.f133009e;
        }
        if (ghVar.f133012b == 1) {
            evVar = (C51058ev) ghVar.f133013c;
        } else {
            evVar = C51058ev.f132941o;
        }
        String str = evVar.f132944b;
        C52568wo woVar = wgVar.f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C52567wn b = C52567wn.m86649b(woVar.f138003j);
        if (b == null) {
            b = C52567wn.UNKNOWN;
        }
        if (!jVar2.equals(C53306j.MORRIS) || set.contains(str) || b.equals(C52567wn.NEWS)) {
            jVar.mo53956a(wgVar);
            return true;
        }
        ((C59052c) ((C59052c) f53115a.mo56224b()).mo56372aa(47477)).mo56389s("#maybeAddMediaItem() %s skipped.", wgVar.f137952h);
        return false;
    }

    /* renamed from: e */
    private static C58833ax m36293e(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            C52560wg wgVar = (C52560wg) ((Queue) it.next()).poll();
            if (wgVar != null) {
                return C58833ax.m90834k(wgVar);
            }
        }
        return C58836b.f156633a;
    }

    /* renamed from: a */
    public final C60870cx mo24198a(C60870cx cxVar, C60870cx cxVar2, C53306j jVar, C123777f fVar) {
        Object obj;
        HashSet hashSet = new HashSet();
        C62940bt r1 = C62942bv.checkIsLite(C123726at.f341744i);
        fVar.mo58887l(r1);
        if (fVar.f169962ag.mo58857o(r1.f169971d)) {
            C62940bt r12 = C62942bv.checkIsLite(C123726at.f341744i);
            fVar.mo58887l(r12);
            Object l = fVar.f169962ag.mo58854l(r12.f169971d);
            if (l == null) {
                obj = r12.f169969b;
            } else {
                obj = r12.mo58889c(l);
            }
            hashSet.addAll((Collection) Collection.EL.stream(((C123726at) obj).f341747b).map(C18857cc.f53104a).collect(C58370cn.f155946a));
        }
        C60870cx p = C60856cj.m92907p(cxVar, cxVar2);
        C18853bz bzVar = new C18853bz(this, jVar, hashSet);
        C60870cx h = C60922j.m93045h(p, C47810es.m84966f(bzVar), this.f53121g);
        C18858cd cdVar = new C18858cd(jVar);
        return C60922j.m93044g(h, C47810es.m84963c(cdVar), this.f53121g);
    }

    /* renamed from: b */
    public final boolean mo24199b(C52560wg wgVar) {
        C52567wn wnVar = C52567wn.UNKNOWN;
        C52568wo woVar = wgVar.f137950f;
        if (woVar == null) {
            woVar = C52568wo.f137992v;
        }
        C52567wn b = C52567wn.m86649b(woVar.f138003j);
        if (b == null) {
            b = C52567wn.UNKNOWN;
        }
        int ordinal = b.ordinal();
        return (ordinal == 1 || ordinal == 2 || ordinal == 3 || ordinal == 4 || ordinal == 9 || ordinal == 10 || ordinal == 13 || ordinal == 14) && wgVar.f137946b != 16;
    }

    /* renamed from: c */
    public final C53019j mo24200c(C53020k kVar, C58331bb bbVar, C53306j jVar, Set set, boolean z) {
        C51058ev evVar;
        C53019j jVar2 = (C53019j) kVar.toBuilder();
        jVar2.copyOnWrite();
        ((C53020k) jVar2.instance).f138974c = C53020k.emptyProtobufList();
        for (C52560wg wgVar : kVar.f138974c) {
            if (!z || !mo24199b(wgVar)) {
                m36292d(jVar2, wgVar, jVar, set);
            } else {
                C51098gh ghVar = wgVar.f137949e;
                if (ghVar == null) {
                    ghVar = C51098gh.f133009e;
                }
                if (ghVar.f133012b == 1) {
                    evVar = (C51058ev) ghVar.f133013c;
                } else {
                    evVar = C51058ev.f132941o;
                }
                String str = evVar.f132944b;
                C58833ax axVar = C58836b.f156633a;
                if (!str.isEmpty() && bbVar.mo54919w(str)) {
                    axVar = m36293e(bbVar.mo55277g(str));
                }
                if (!axVar.mo56113h()) {
                    axVar = m36293e(bbVar.mo54949B());
                }
                if (axVar.mo56113h()) {
                    ((C59052c) ((C59052c) f53115a.mo56224b()).mo56372aa(47476)).mo56389s("#populateLocalMediaItemSlot() on-device media %s populated.", ((C52560wg) axVar.mo56107c()).f137952h);
                    if ((wgVar.f137945a & 8192) != 0) {
                        C52559wf wfVar = (C52559wf) ((C52560wg) axVar.mo56107c()).toBuilder();
                        C63204j jVar3 = wgVar.f137953i;
                        if (jVar3 == null) {
                            jVar3 = C63204j.f170749e;
                        }
                        wfVar.copyOnWrite();
                        C52560wg wgVar2 = (C52560wg) wfVar.instance;
                        jVar3.getClass();
                        wgVar2.f137953i = jVar3;
                        wgVar2.f137945a |= 8192;
                        jVar2.copyOnWrite();
                        C53020k kVar2 = (C53020k) jVar2.instance;
                        C52560wg wgVar3 = (C52560wg) wfVar.build();
                        wgVar3.getClass();
                        kVar2.mo53957a();
                        kVar2.f138974c.add(wgVar3);
                    } else {
                        jVar2.mo53956a((C52560wg) axVar.mo56107c());
                    }
                }
            }
        }
        return jVar2;
    }
}
