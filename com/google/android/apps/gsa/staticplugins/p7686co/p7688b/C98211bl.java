package com.google.android.apps.gsa.staticplugins.p7686co.p7688b;

import android.content.Context;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7066m.C90081ef;
import com.google.android.apps.gsa.shared.util.debug.C91022f;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C91006f;
import com.google.android.apps.gsa.shared.util.p7159c.C90875ai;
import com.google.android.apps.gsa.sidekick.main.p7203f.C91374d;
import com.google.android.apps.gsa.sidekick.shared.util.C91957ah;
import com.google.android.apps.gsa.sidekick.shared.util.WrappedExecutedUserAction;
import com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98324af;
import com.google.android.apps.gsa.store.C118302a;
import com.google.android.apps.gsa.store.C118312c;
import com.google.android.apps.gsa.store.C118328s;
import com.google.android.apps.gsa.store.C118334w;
import com.google.android.apps.gsa.store.C118335x;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.p375ai.p378b.C7513aa;
import com.google.p375ai.p378b.C7518af;
import com.google.p375ai.p378b.C7573c;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7681g;
import com.google.p375ai.p378b.C7708h;
import com.google.p375ai.p378b.C7709ha;
import com.google.p375ai.p378b.C7711hc;
import com.google.p375ai.p378b.C7718hj;
import com.google.p375ai.p378b.C7746ik;
import com.google.p375ai.p378b.C7751ip;
import com.google.p375ai.p378b.C7752iq;
import com.google.p375ai.p378b.C7833lq;
import com.google.p375ai.p378b.C7834lr;
import com.google.p375ai.p378b.C7841ly;
import com.google.p375ai.p378b.C7845mb;
import com.google.p375ai.p378b.C7973qv;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.co.b.bl */
/* compiled from: PG */
public final class C98211bl implements C91374d {

    /* renamed from: e */
    public static final C59071e f274214e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.co.b.bl");

    /* renamed from: v */
    private static final C58528ij f274215v = C58528ij.m90015O(C7681g.DISMISS_NOTIFICATION, C7681g.CLICK_NOTIFICATION, C7681g.CLICK_NOTIFICATION_ACTION, C7681g.DISPLAYED_NOTIFICATION, C7681g.MANAGE_NOTIFICATIONS, C7681g.AT_A_PLACE_NOTIFICATION_CLICK, C7681g.REMOVED_NOTIFICATION, C7681g.NOTIFICATION_FEEDBACK_RATING_1, C7681g.NOTIFICATION_FEEDBACK_RATING_2, C7681g.NOTIFICATION_FEEDBACK_RATING_3, C7681g.NOTIFICATION_FEEDBACK_RATING_4, C7681g.NOTIFICATION_FEEDBACK_SUPPLEMENTARY_RATING_1, C7681g.NOTIFICATION_FEEDBACK_SUPPLEMENTARY_RATING_2, C7681g.NOTIFICATION_FEEDBACK_SUPPLEMENTARY_RATING_3, C7681g.NOTIFICATION_FEEDBACK_SUPPLEMENTARY_RATING_4, C7681g.NOTIFICATION_FEEDBACK_THUMBS_UP, C7681g.NOTIFICATION_FEEDBACK_THUMBS_DOWN, C7681g.NOTIFICATION_FEEDBACK_DISPLAYED, C7681g.NOTIFICATION_FEEDBACK_CLICKED, C7681g.NOTIFICATION_FEEDBACK_CANCELED, C7681g.NOTIFICATION_FEED_PROMPT_OPT_IN, C7681g.NOTIFICATION_FEED_PROMPT_OPT_OUT, C7681g.NOTIFICATION_FEED_PROMPT_DISPLAYED, C7681g.NOTIFICATIONS_OPT_OUT, C7681g.NOTIFICATIONS_OPT_IN, C7681g.NOTIFICATION_UNSUBSCRIBE);

    /* renamed from: f */
    public final Context f274216f;

    /* renamed from: g */
    public final C21370a f274217g;

    /* renamed from: h */
    public final C118312c f274218h;

    /* renamed from: i */
    public final C86124t f274219i;

    /* renamed from: j */
    public final Collection f274220j = Collections.synchronizedCollection(new C58425eo(3));

    /* renamed from: k */
    public final C98224o f274221k;

    /* renamed from: l */
    public final C60836bq f274222l = new C60836bq();

    /* renamed from: m */
    public final C86054o f274223m;

    /* renamed from: n */
    public final C118827a f274224n;

    /* renamed from: o */
    public final C22871g f274225o;

    /* renamed from: p */
    public final C22871g f274226p;

    /* renamed from: q */
    public final C58881cr f274227q;

    /* renamed from: r */
    public final C58881cr f274228r;

    /* renamed from: s */
    public final C58881cr f274229s;

    /* renamed from: t */
    public final C58881cr f274230t;

    /* renamed from: u */
    public final List f274231u = Collections.synchronizedList(new ArrayList());

    /* renamed from: w */
    private boolean f274232w = true;

    public C98211bl(Context context, C21370a aVar, C118312c cVar, C86124t tVar, C91022f fVar, C98224o oVar, C86054o oVar2, C118827a aVar2, C22871g gVar, C22871g gVar2) {
        this.f274216f = context;
        this.f274217g = aVar;
        this.f274218h = cVar;
        this.f274219i = tVar;
        this.f274221k = oVar;
        this.f274223m = oVar2;
        this.f274224n = aVar2;
        this.f274225o = gVar;
        this.f274226p = gVar2;
        this.f274227q = C58886cw.m90973a(new C98191as(this));
        this.f274228r = C58886cw.m90973a(new C98192at(this));
        this.f274229s = C58886cw.m90973a(new C98193au(this));
        this.f274230t = C58886cw.m90973a(new C98195aw(this));
        fVar.mo85301a(this);
    }

    /* renamed from: A */
    private static C7708h m162653A(C7708h hVar) {
        if ((hVar.f26896a & 8) != 0 && !hVar.f26900e) {
            return hVar;
        }
        C7573c cVar = (C7573c) hVar.toBuilder();
        cVar.copyOnWrite();
        C7708h hVar2 = (C7708h) cVar.instance;
        hVar2.f26896a |= 8;
        hVar2.f26900e = false;
        return (C7708h) cVar.build();
    }

    /* renamed from: B */
    private static boolean m162654B(C7708h hVar) {
        C58528ij ijVar = f274215v;
        C7681g a = C7681g.m22802a(hVar.f26897b);
        if (a == null) {
            a = C7681g.INVALID;
        }
        return ijVar.contains(a);
    }

    /* renamed from: C */
    private final C60870cx m162655C(C7718hj hjVar, C7708h hVar, C58833ax axVar) {
        C7752iq a = C91957ah.m150910a(hjVar, hVar, this.f274217g.mo26870b(), (C7669fo) axVar.mo56111f());
        if (!this.f274219i.mo79746e(C90081ef.f249847p) || !m162654B(hVar)) {
            return this.f274222l.mo57305b(new C98200ba(this, hjVar, hVar, a), C60826bg.f164896a);
        }
        return C118826c.f331423b;
    }

    /* renamed from: x */
    public static C7751ip m162656x(C7752iq iqVar) {
        C7718hj hjVar;
        C7718hj hjVar2;
        if (iqVar.f27134d == 2) {
            hjVar = (C7718hj) iqVar.f27135e;
        } else {
            hjVar = C7718hj.f26927af;
        }
        if (hjVar.f26962c != 310 || !((Boolean) hjVar.f26963d).booleanValue()) {
            if (hjVar.f26936H) {
                int i = hjVar.f26955a;
                if (!((i & 4) == 0 || (i & 32) == 0)) {
                    C7711hc hcVar = (C7711hc) C7718hj.f26927af.createBuilder();
                    C7669fo foVar = hjVar.f26968i;
                    if (foVar == null) {
                        foVar = C7669fo.f26633e;
                    }
                    hcVar.copyOnWrite();
                    C7718hj hjVar3 = (C7718hj) hcVar.instance;
                    foVar.getClass();
                    hjVar3.f26968i = foVar;
                    hjVar3.f26955a |= 4;
                    C7973qv qvVar = hjVar.f26971l;
                    if (qvVar == null) {
                        qvVar = C7973qv.f28001c;
                    }
                    hcVar.copyOnWrite();
                    C7718hj hjVar4 = (C7718hj) hcVar.instance;
                    qvVar.getClass();
                    hjVar4.f26971l = qvVar;
                    hjVar4.f26955a |= 32;
                    hcVar.copyOnWrite();
                    C7718hj hjVar5 = (C7718hj) hcVar.instance;
                    hjVar5.f26955a |= 268435456;
                    hjVar5.f26936H = true;
                    C7746ik a = C7746ik.m22834a(hjVar.f26966g);
                    if (a == null) {
                        a = C7746ik.UNKNOWN;
                    }
                    hcVar.copyOnWrite();
                    C7718hj hjVar6 = (C7718hj) hcVar.instance;
                    hjVar6.f26966g = a.f27108J;
                    hjVar6.f26955a |= 1;
                    C7709ha haVar = hjVar.f26972m;
                    if (haVar == null) {
                        haVar = C7709ha.f26910f;
                    }
                    hcVar.copyOnWrite();
                    C7718hj hjVar7 = (C7718hj) hcVar.instance;
                    haVar.getClass();
                    hjVar7.f26972m = haVar;
                    hjVar7.f26955a |= 64;
                    hjVar2 = (C7718hj) hcVar.build();
                }
            }
            C7711hc hcVar2 = (C7711hc) hjVar.toBuilder();
            hcVar2.copyOnWrite();
            C7718hj hjVar8 = (C7718hj) hcVar2.instance;
            hjVar8.f26975p = null;
            hjVar8.f26955a &= -2049;
            hcVar2.copyOnWrite();
            ((C7718hj) hcVar2.instance).f26935G = C7718hj.emptyProtobufList();
            hcVar2.copyOnWrite();
            ((C7718hj) hcVar2.instance).f26930B = C7718hj.emptyProtobufList();
            hcVar2.copyOnWrite();
            ((C7718hj) hcVar2.instance).f26932D = C7718hj.emptyProtobufList();
            C7718hj hjVar9 = (C7718hj) hcVar2.instance;
            if ((hjVar9.f26955a & 524288) != 0) {
                C7518af afVar = hjVar9.f26983x;
                if (afVar == null) {
                    afVar = C7518af.f26025j;
                }
                C7513aa aaVar = (C7513aa) afVar.toBuilder();
                aaVar.copyOnWrite();
                C7518af afVar2 = (C7518af) aaVar.instance;
                afVar2.f26028b = null;
                afVar2.f26027a &= -2;
                aaVar.copyOnWrite();
                ((C7518af) aaVar.instance).f26029c = C7518af.emptyProtobufList();
                hcVar2.copyOnWrite();
                C7718hj hjVar10 = (C7718hj) hcVar2.instance;
                C7518af afVar3 = (C7518af) aaVar.build();
                afVar3.getClass();
                hjVar10.f26983x = afVar3;
                hjVar10.f26955a |= 524288;
            }
            C7718hj hjVar11 = (C7718hj) hcVar2.instance;
            if ((hjVar11.f26955a & C89885b.S3REQUEST_VALUE) != 0) {
                C7834lr lrVar = hjVar11.f26981v;
                if (lrVar == null) {
                    lrVar = C7834lr.f27467c;
                }
                C7833lq lqVar = (C7833lq) lrVar.toBuilder();
                lqVar.copyOnWrite();
                ((C7834lr) lqVar.instance).f27469a = C7834lr.emptyProtobufList();
                C7834lr lrVar2 = (C7834lr) lqVar.build();
                hcVar2.copyOnWrite();
                C7718hj hjVar12 = (C7718hj) hcVar2.instance;
                lrVar2.getClass();
                hjVar12.f26981v = lrVar2;
                hjVar12.f26955a |= C89885b.S3REQUEST_VALUE;
            }
            C7718hj hjVar13 = (C7718hj) hcVar2.instance;
            if ((hjVar13.f26955a & 1048576) != 0) {
                C7834lr lrVar3 = hjVar13.f26984y;
                if (lrVar3 == null) {
                    lrVar3 = C7834lr.f27467c;
                }
                C7833lq lqVar2 = (C7833lq) lrVar3.toBuilder();
                lqVar2.copyOnWrite();
                ((C7834lr) lqVar2.instance).f27469a = C7834lr.emptyProtobufList();
                C7834lr lrVar4 = (C7834lr) lqVar2.build();
                hcVar2.copyOnWrite();
                C7718hj hjVar14 = (C7718hj) hcVar2.instance;
                lrVar4.getClass();
                hjVar14.f26984y = lrVar4;
                hjVar14.f26955a |= 1048576;
            }
            C7718hj hjVar15 = (C7718hj) hcVar2.instance;
            if ((hjVar15.f26955a & C89885b.HTTP_VALUE) != 0) {
                C7845mb mbVar = hjVar15.f26982w;
                if (mbVar == null) {
                    mbVar = C7845mb.f27493p;
                }
                C7841ly lyVar = (C7841ly) mbVar.toBuilder();
                lyVar.copyOnWrite();
                ((C7845mb) lyVar.instance).f27496b = C7845mb.emptyProtobufList();
                lyVar.copyOnWrite();
                ((C7845mb) lyVar.instance).f27497c = C7845mb.emptyProtobufList();
                lyVar.copyOnWrite();
                C7845mb mbVar2 = (C7845mb) lyVar.instance;
                mbVar2.f27504j = null;
                mbVar2.f27495a &= -65;
                lyVar.copyOnWrite();
                C7845mb mbVar3 = (C7845mb) lyVar.instance;
                mbVar3.f27506l = null;
                mbVar3.f27495a &= -257;
                hcVar2.copyOnWrite();
                C7718hj hjVar16 = (C7718hj) hcVar2.instance;
                C7845mb mbVar4 = (C7845mb) lyVar.build();
                mbVar4.getClass();
                hjVar16.f26982w = mbVar4;
                hjVar16.f26955a |= C89885b.HTTP_VALUE;
            }
            hjVar2 = (C7718hj) hcVar2.build();
        } else {
            C7711hc hcVar3 = (C7711hc) C7718hj.f26927af.createBuilder();
            C7669fo foVar2 = hjVar.f26968i;
            if (foVar2 == null) {
                foVar2 = C7669fo.f26633e;
            }
            hcVar3.copyOnWrite();
            C7718hj hjVar17 = (C7718hj) hcVar3.instance;
            foVar2.getClass();
            hjVar17.f26968i = foVar2;
            hjVar17.f26955a |= 4;
            hcVar3.copyOnWrite();
            C7718hj hjVar18 = (C7718hj) hcVar3.instance;
            hjVar18.f26962c = 310;
            hjVar18.f26963d = true;
            hjVar2 = (C7718hj) hcVar3.build();
        }
        C7751ip ipVar = (C7751ip) iqVar.toBuilder();
        ipVar.copyOnWrite();
        C7752iq iqVar2 = (C7752iq) ipVar.instance;
        hjVar2.getClass();
        iqVar2.f27135e = hjVar2;
        iqVar2.f27134d = 2;
        return ipVar;
    }

    /* renamed from: a */
    public final C60870cx mo85681a(C7718hj hjVar, C7708h hVar) {
        return this.f274222l.mo57305b(new C98228s(this, C91957ah.m150910a(hjVar, hVar, this.f274217g.mo26870b(), (C7669fo) null)), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final C60870cx mo85682b() {
        return this.f274222l.mo57305b(new C98235z(this), C60826bg.f164896a);
    }

    /* renamed from: c */
    public final C60870cx mo85683c(boolean z, C7708h hVar) {
        return this.f274222l.mo57305b(new C98234y(this, hVar, z), C60826bg.f164896a);
    }

    /* renamed from: e */
    public final C60870cx mo85684e() {
        return this.f274222l.mo57305b(new C98229t(this), C60826bg.f164896a);
    }

    /* renamed from: f */
    public final C60870cx mo85685f(C7718hj hjVar, C7708h hVar) {
        return this.f274222l.mo57305b(new C98197ay(this, (C7752iq) m162656x(C91957ah.m150910a(hjVar, hVar, this.f274217g.mo26870b(), (C7669fo) null)).build()), C60826bg.f164896a);
    }

    /* renamed from: g */
    public final C60870cx mo85686g(C7718hj hjVar, C7708h hVar) {
        return this.f274222l.mo57305b(new C98182aj(this, hjVar, hVar), C60826bg.f164896a);
    }

    /* renamed from: gS */
    public final void mo17602gS(C91006f fVar) {
        C58485gu j;
        fVar.mo85291r("EuaStore");
        C91006f e = fVar.mo85281e((Object) null);
        synchronized (this.f274220j) {
            j = C58485gu.m89842j(this.f274220j);
        }
        int size = j.size();
        for (int i = 0; i < size; i++) {
            ((C98209bj) j.get(i)).mo17602gS(e);
        }
    }

    /* renamed from: h */
    public final C60870cx mo85687h() {
        return this.f274222l.mo57305b(new C98180ah(this), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final C60870cx mo85688i(C7718hj hjVar, C7708h hVar) {
        return this.f274222l.mo57305b(new C98194av(this, hjVar, hVar), C60826bg.f164896a);
    }

    /* renamed from: j */
    public final C60870cx mo85689j(C7718hj hjVar, C7708h hVar) {
        if (mo91032z() && m162654B(hVar)) {
            hVar = m162653A(hVar);
        }
        return m162655C(hjVar, hVar, C58836b.f156633a);
    }

    /* renamed from: k */
    public final C60870cx mo85690k(C7718hj hjVar, C7708h hVar, C7669fo foVar) {
        if (mo91032z() && m162654B(hVar)) {
            hVar = m162653A(hVar);
        }
        return m162655C(hjVar, hVar, C58833ax.m90834k(foVar));
    }

    /* renamed from: l */
    public final C60870cx mo85691l(List list) {
        C7708h hVar;
        C7708h hVar2;
        if (this.f274219i.mo79746e(C90081ef.f249847p) || mo91032z()) {
            ArrayList arrayList = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C7752iq iqVar = (C7752iq) it.next();
                if (iqVar.f27132b == 1) {
                    hVar = (C7708h) iqVar.f27133c;
                } else {
                    hVar = C7708h.f26894n;
                }
                if (!m162654B(hVar)) {
                    arrayList.add(iqVar);
                } else if (mo91032z()) {
                    if (iqVar.f27132b == 1) {
                        hVar2 = (C7708h) iqVar.f27133c;
                    } else {
                        hVar2 = C7708h.f26894n;
                    }
                    C7708h A = m162653A(hVar2);
                    C7751ip ipVar = (C7751ip) iqVar.toBuilder();
                    ipVar.copyOnWrite();
                    C7752iq iqVar2 = (C7752iq) ipVar.instance;
                    A.getClass();
                    iqVar2.f27133c = A;
                    iqVar2.f27132b = 1;
                    arrayList.add((C7752iq) ipVar.build());
                }
            }
            list = arrayList;
        }
        return mo91027t(C58485gu.m89842j(list));
    }

    /* renamed from: m */
    public final C60870cx mo85692m(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            WrappedExecutedUserAction wrappedExecutedUserAction = (WrappedExecutedUserAction) it.next();
            if (!wrappedExecutedUserAction.f256439c) {
                wrappedExecutedUserAction = new WrappedExecutedUserAction(wrappedExecutedUserAction.f256437a, wrappedExecutedUserAction.f256438b, true);
            }
            C7751ip ipVar = (C7751ip) wrappedExecutedUserAction.f256437a.toBuilder();
            C7709ha haVar = wrappedExecutedUserAction.f256438b;
            if (haVar != null) {
                C7752iq iqVar = (C7752iq) ipVar.instance;
                if (iqVar.f27134d == 2) {
                    C7711hc hcVar = (C7711hc) ((C7718hj) iqVar.f27135e).toBuilder();
                    hcVar.copyOnWrite();
                    C7718hj hjVar = (C7718hj) hcVar.instance;
                    hjVar.f26972m = haVar;
                    hjVar.f26955a |= 64;
                    C7718hj hjVar2 = (C7718hj) hcVar.build();
                    ipVar.copyOnWrite();
                    C7752iq iqVar2 = (C7752iq) ipVar.instance;
                    hjVar2.getClass();
                    iqVar2.f27135e = hjVar2;
                    iqVar2.f27134d = 2;
                }
            }
            arrayList.add((C7752iq) ipVar.build());
        }
        return mo85691l(arrayList);
    }

    /* renamed from: n */
    public final void mo85693n(boolean z) {
        this.f274232w = z;
    }

    /* renamed from: o */
    public final C60870cx mo85694o(int i) {
        if (this.f274232w) {
            return this.f274222l.mo57305b(new C98198az(this, i), C60826bg.f164896a);
        }
        return C60856cj.m92900i(new C98208bi(this, 0, 0, Collections.emptySet(), Collections.emptyList(), 0));
    }

    /* renamed from: p */
    public final C118334w mo91023p() {
        C118335x g = this.f274218h.mo91761g();
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274457a, 1));
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274462f, 0));
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274463g, 1));
        return g.mo103674a();
    }

    /* renamed from: q */
    public final C60870cx mo91024q() {
        return C60922j.m93044g(this.f274218h.mo91763i(mo91023p()), C98189aq.f274172a, C60826bg.f164896a);
    }

    /* renamed from: r */
    public final C60870cx mo91025r(C7718hj hjVar, C118334w wVar) {
        return this.f274225o.mo28209i(this.f274218h.mo91763i(wVar), "getMatchingActionKeyFromQuery", new C98181ai(hjVar));
    }

    /* renamed from: s */
    public final C60870cx mo91026s(C7752iq iqVar) {
        C7718hj hjVar;
        C7708h hVar;
        C7718hj hjVar2;
        if (iqVar.f27134d == 2) {
            hjVar = (C7718hj) iqVar.f27135e;
        } else {
            hjVar = C7718hj.f26927af;
        }
        C118335x g = this.f274218h.mo91761g();
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274457a, 1));
        C118302a aVar = C98324af.f274458b;
        if (iqVar.f27132b == 1) {
            hVar = (C7708h) iqVar.f27133c;
        } else {
            hVar = C7708h.f26894n;
        }
        C7681g a = C7681g.m22802a(hVar.f26897b);
        if (a == null) {
            a = C7681g.INVALID;
        }
        g.f328476c.mo55395g(C118328s.m196511c(aVar, (long) a.f26835cv));
        C118302a aVar2 = C98324af.f274460d;
        if (iqVar.f27134d == 2) {
            hjVar2 = (C7718hj) iqVar.f27135e;
        } else {
            hjVar2 = C7718hj.f26927af;
        }
        C7746ik a2 = C7746ik.m22834a(hjVar2.f26966g);
        if (a2 == null) {
            a2 = C7746ik.UNKNOWN;
        }
        g.f328476c.mo55395g(C118328s.m196511c(aVar2, (long) a2.f27108J));
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274462f, 1));
        return C60922j.m93044g(mo91025r(hjVar, g.mo103674a()), C98184al.f274163a, C60826bg.f164896a);
    }

    /* renamed from: t */
    public final C60870cx mo91027t(C58485gu guVar) {
        return C60922j.m93045h(this.f274221k.mo91036a(this.f274223m.mo79659F(), guVar.size()), new C98190ar(this, guVar), C60826bg.f164896a);
    }

    /* renamed from: u */
    public final C60870cx mo91028u(boolean z, List list) {
        C60870cx b = this.f274225o.mo28202b("persistEuas", new C98186an(this, list, z));
        if (!z) {
            C90875ai.m148465b(new C98187ao(this, list), b, this.f274226p, "EuaPersistTracker").mo85223a(C98188ap.f274171a);
        }
        return b;
    }

    /* renamed from: v */
    public final C60870cx mo91029v(C118334w wVar, int i, C98203bd bdVar) {
        return this.f274225o.mo28209i(this.f274218h.mo91763i(wVar), "pollForActionsToFlush", new C98196ax(this, bdVar, i));
    }

    /* renamed from: w */
    public final C60870cx mo91030w(C7718hj hjVar, C7708h hVar) {
        C7718hj hjVar2;
        C7752iq iqVar = (C7752iq) m162656x(C91957ah.m150910a(hjVar, hVar, this.f274217g.mo26870b(), (C7669fo) null)).instance;
        if (iqVar.f27134d == 2) {
            hjVar2 = (C7718hj) iqVar.f27135e;
        } else {
            hjVar2 = C7718hj.f26927af;
        }
        C118335x g = this.f274218h.mo91761g();
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274457a, 1));
        C118302a aVar = C98324af.f274458b;
        C7681g a = C7681g.m22802a(hVar.f26897b);
        if (a == null) {
            a = C7681g.INVALID;
        }
        g.f328476c.mo55395g(C118328s.m196511c(aVar, (long) a.f26835cv));
        C118302a aVar2 = C98324af.f274460d;
        C7746ik a2 = C7746ik.m22834a(hjVar.f26966g);
        if (a2 == null) {
            a2 = C7746ik.UNKNOWN;
        }
        g.f328476c.mo55395g(C118328s.m196511c(aVar2, (long) a2.f27108J));
        g.f328476c.mo55395g(C118328s.m196511c(C98324af.f274462f, 1));
        return C60922j.m93045h(mo91025r(hjVar2, g.mo103674a()), new C98201bb(this), C60826bg.f164896a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x0068  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x006a  */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0076  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0086  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x008b  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0095  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo91031y(com.google.android.apps.gsa.store.C118329t r11, com.google.p375ai.p378b.C7752iq r12, boolean r13) {
        /*
            r10 = this;
            byte[] r2 = r12.toByteArray()
            java.lang.String r1 = com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98325ag.m162878c(r2)
            int r0 = r12.f27132b
            r6 = 1
            if (r0 != r6) goto L_0x0012
            java.lang.Object r0 = r12.f27133c
            com.google.ai.b.h r0 = (com.google.p375ai.p378b.C7708h) r0
            goto L_0x0014
        L_0x0012:
            com.google.ai.b.h r0 = com.google.p375ai.p378b.C7708h.f26894n
        L_0x0014:
            int r0 = r0.f26896a
            r0 = r0 & 8
            if (r0 == 0) goto L_0x002d
            int r0 = r12.f27132b
            if (r0 != r6) goto L_0x0023
            java.lang.Object r0 = r12.f27133c
            com.google.ai.b.h r0 = (com.google.p375ai.p378b.C7708h) r0
            goto L_0x0025
        L_0x0023:
            com.google.ai.b.h r0 = com.google.p375ai.p378b.C7708h.f26894n
        L_0x0025:
            boolean r0 = r0.f26900e
            if (r0 == 0) goto L_0x002a
            goto L_0x002d
        L_0x002a:
            r0 = 0
            r7 = 0
            goto L_0x002e
        L_0x002d:
            r7 = 1
        L_0x002e:
            if (r7 == 0) goto L_0x003c
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f274219i
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90010bp.f246908D
            long r3 = r0.mo79743a(r3)
            int r0 = (int) r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.DAYS
            goto L_0x0047
        L_0x003c:
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f274219i
            com.google.android.apps.gsa.shared.m.f r3 = com.google.android.apps.gsa.shared.p7066m.C90010bp.f246907C
            long r3 = r0.mo79743a(r3)
            int r0 = (int) r3
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES
        L_0x0047:
            r5 = r3
            long r3 = (long) r0
            r0 = r11
            com.google.android.apps.gsa.store.v r11 = r0.mo103668b(r1, r2, r3, r5)
            com.google.android.apps.gsa.store.a r0 = com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98324af.f274457a
            r1 = 1
            java.lang.Long r3 = java.lang.Long.valueOf(r1)
            r11.mo103672a(r0, r3)
            com.google.android.apps.gsa.store.a r0 = com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98324af.f274461e
            long r3 = r12.f27140j
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r11.mo103672a(r0, r3)
            r3 = 0
            if (r6 == r13) goto L_0x006a
            r8 = r3
            goto L_0x006b
        L_0x006a:
            r8 = r1
        L_0x006b:
            com.google.android.apps.gsa.store.a r13 = com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98324af.f274462f
            java.lang.Long r0 = java.lang.Long.valueOf(r8)
            r11.mo103672a(r13, r0)
            if (r6 == r7) goto L_0x0077
            r1 = r3
        L_0x0077:
            com.google.android.apps.gsa.store.a r13 = com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98324af.f274463g
            java.lang.Long r0 = java.lang.Long.valueOf(r1)
            r11.mo103672a(r13, r0)
            com.google.android.apps.gsa.store.a r13 = com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98324af.f274458b
            int r0 = r12.f27132b
            if (r0 != r6) goto L_0x008b
            java.lang.Object r0 = r12.f27133c
            com.google.ai.b.h r0 = (com.google.p375ai.p378b.C7708h) r0
            goto L_0x008d
        L_0x008b:
            com.google.ai.b.h r0 = com.google.p375ai.p378b.C7708h.f26894n
        L_0x008d:
            int r0 = r0.f26897b
            com.google.ai.b.g r0 = com.google.p375ai.p378b.C7681g.m22802a(r0)
            if (r0 != 0) goto L_0x0097
            com.google.ai.b.g r0 = com.google.p375ai.p378b.C7681g.INVALID
        L_0x0097:
            int r0 = r0.f26835cv
            long r0 = (long) r0
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.mo103672a(r13, r0)
            com.google.android.apps.gsa.store.a r13 = com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98324af.f274459c
            r0 = 2
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
            r11.mo103672a(r13, r0)
            int r13 = r12.f27134d
            r0 = 2
            if (r13 != r0) goto L_0x00cb
            com.google.android.apps.gsa.store.a r13 = com.google.android.apps.gsa.staticplugins.p7686co.p7694h.C98324af.f274460d
            java.lang.Object r12 = r12.f27135e
            com.google.ai.b.hj r12 = (com.google.p375ai.p378b.C7718hj) r12
            int r12 = r12.f26966g
            com.google.ai.b.ik r12 = com.google.p375ai.p378b.C7746ik.m22834a(r12)
            if (r12 != 0) goto L_0x00c1
            com.google.ai.b.ik r12 = com.google.p375ai.p378b.C7746ik.UNKNOWN
        L_0x00c1:
            int r12 = r12.f27108J
            long r0 = (long) r12
            java.lang.Long r12 = java.lang.Long.valueOf(r0)
            r11.mo103672a(r13, r12)
        L_0x00cb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.p7686co.p7688b.C98211bl.mo91031y(com.google.android.apps.gsa.store.t, com.google.ai.b.iq, boolean):void");
    }

    /* renamed from: z */
    public final boolean mo91032z() {
        return this.f274219i.mo79746e(C90081ef.f249849r);
    }
}
