package com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.p8122a;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.util.debug.p7166b.C91018d;
import com.google.android.apps.gsa.sidekick.shared.monet.p7250f.C91825b;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91877a;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91881e;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91882f;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91884h;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91885i;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91886j;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91887k;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91890n;
import com.google.android.apps.gsa.sidekick.shared.p7254o.C91891o;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105023d;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105024e;
import com.google.android.apps.gsa.staticplugins.nowcards.p8119i.p8121b.C105038s;
import com.google.android.apps.gsa.staticplugins.nowstream.shared.C105419b;
import com.google.android.apps.p489g.p494d.C9212cu;
import com.google.android.apps.p489g.p494d.C9214cw;
import com.google.android.apps.p489g.p494d.C9215cx;
import com.google.android.sidekick.shared.remoteapi.CardRenderingContext;
import com.google.common.base.C58832aw;
import com.google.common.base.C58833ax;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58495hd;
import com.google.p375ai.p378b.C7718hj;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54782b;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54784d;
import com.google.p4140ba.p4141a.p4142a.p4144b.C54785e;
import com.google.p4283bv.p4354e.p4356b.p4357a.C57056d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.i.b.a.k */
/* compiled from: PG */
public final class C105010k implements C91885i, C91882f {

    /* renamed from: a */
    private final C91891o f292577a;

    /* renamed from: b */
    private final C105038s f292578b;

    /* renamed from: c */
    private final C91886j f292579c;

    /* renamed from: d */
    private final C105024e f292580d;

    /* renamed from: e */
    private final C58881cr f292581e;

    /* renamed from: f */
    private final Map f292582f;

    /* renamed from: g */
    private int f292583g = 0;

    /* renamed from: h */
    private Optional f292584h;

    /* renamed from: i */
    private final C105004e f292585i;

    /* renamed from: j */
    private final C105023d f292586j;

    public C105010k(C105005f fVar, C105038s sVar, C105023d dVar, C91886j jVar, C105024e eVar, C58881cr crVar, C91891o oVar) {
        int i;
        this.f292578b = sVar;
        this.f292586j = dVar;
        this.f292579c = jVar;
        this.f292580d = eVar;
        this.f292581e = crVar;
        this.f292577a = oVar;
        this.f292582f = new HashMap();
        this.f292584h = Optional.empty();
        CardRenderingContext cardRenderingContext = (CardRenderingContext) crVar.mo6453a();
        synchronized (cardRenderingContext.f118456b) {
            i = cardRenderingContext.f118457c.getInt("MIN_PERCENT_SHOWN_FOR_VISIBLE");
        }
        C91877a aVar = new C91877a(i);
        C58833ax axVar = (C58833ax) fVar.f292572a.mo17428b();
        axVar.getClass();
        C58833ax axVar2 = (C58833ax) fVar.f292573b.mo17428b();
        axVar2.getClass();
        this.f292585i = new C105004e(axVar, axVar2, aVar);
    }

    /* renamed from: g */
    private final Optional m174147g(View view, boolean z) {
        if (!this.f292582f.containsKey(view)) {
            return Optional.empty();
        }
        C105009j jVar = (C105009j) this.f292582f.get(view);
        if (jVar.mo94454g().isPresent()) {
            return jVar.mo94454g();
        }
        if (!z) {
            return Optional.empty();
        }
        C91886j jVar2 = this.f292579c;
        ViewGroup b = jVar.mo94448b();
        C9215cx e = jVar.mo94451e();
        jVar.mo94447a();
        C91887k a = jVar2.mo86427a(b, e, jVar.mo94449c(), jVar.mo94453f());
        Map map = this.f292582f;
        C105008i d = jVar.mo94450d();
        d.mo94445c(a);
        map.put(view, d.mo94443a());
        return Optional.m71637of(a);
    }

    /* renamed from: h */
    private final void m174148h(C105004e eVar) {
        boolean z;
        C58495hd l = C58495hd.m89898l(eVar.f292563d);
        for (View view : l.keySet()) {
            if (this.f292582f.containsKey(view)) {
                C105009j jVar = (C105009j) this.f292582f.get(view);
                boolean h = jVar.mo94455h();
                C91884h hVar = C91884h.UNKNOWN;
                int ordinal = ((C91884h) l.get(view)).ordinal();
                if (ordinal != 1) {
                    if ((ordinal == 3 || ordinal == 4) && !h) {
                        if (jVar.mo94453f().isPresent()) {
                            ((C91881e) jVar.mo94453f().get()).mo86415c();
                        }
                        Map map = this.f292582f;
                        C105008i d = jVar.mo94450d();
                        d.mo94444b(true);
                        map.put(view, d.mo94443a());
                    }
                } else if (h) {
                    Map map2 = this.f292582f;
                    C105008i d2 = jVar.mo94450d();
                    d2.mo94444b(false);
                    map2.put(view, d2.mo94443a());
                }
            }
        }
        int i = eVar.f292565f;
        if (i != 4) {
            ArrayList arrayList = new ArrayList();
            for (View view2 : l.keySet()) {
                if (this.f292582f.containsKey(view2)) {
                    C91884h hVar2 = C91884h.UNKNOWN;
                    int ordinal2 = ((C91884h) l.get(view2)).ordinal();
                    if (ordinal2 == 1) {
                        C105009j jVar2 = (C105009j) this.f292582f.get(view2);
                        if (jVar2.mo94453f().isPresent()) {
                            ((C91881e) jVar2.mo94453f().get()).mo86414b();
                        }
                        Optional g = m174147g(view2, false);
                        if (g.isPresent()) {
                            ((C91887k) g.get()).mo86432e();
                        }
                    } else if (ordinal2 == 2) {
                        C105009j jVar3 = (C105009j) this.f292582f.get(view2);
                        if (jVar3.mo94453f().isPresent()) {
                            ((C91881e) jVar3.mo94453f().get()).mo86414b();
                        }
                        Optional g2 = m174147g(view2, false);
                        if (g2.isPresent()) {
                            ((C91887k) g2.get()).mo86430c();
                            if (jVar3.mo94451e().f31840b == 1 && ((CardRenderingContext) this.f292581e.mo6453a()).mo49322q()) {
                                jVar3.mo94448b().removeAllViews();
                                jVar3.mo94449c().mo86447h(2);
                            }
                        }
                    } else if (ordinal2 == 3 || ordinal2 == 4) {
                        arrayList.add(view2);
                    }
                }
            }
            if (this.f292584h.isPresent() && !arrayList.contains(this.f292584h.get())) {
                this.f292584h = Optional.empty();
            }
            if (arrayList.size() == 0) {
                this.f292584h = Optional.empty();
                return;
            }
            CardRenderingContext cardRenderingContext = (CardRenderingContext) this.f292581e.mo6453a();
            synchronized (cardRenderingContext.f118456b) {
                z = cardRenderingContext.f118457c.getBoolean("INLINE_VIDEO_PLAY_ON_SCROLL");
            }
            if (z || i == 2) {
                Collections.sort(arrayList, C105007h.f292576a);
                View view3 = (View) arrayList.get(0);
                if (this.f292584h.isPresent()) {
                    View view4 = (View) this.f292584h.get();
                    if (view4 != view3) {
                        if (this.f292582f.containsKey(view4)) {
                            C105009j jVar4 = (C105009j) this.f292582f.get(view4);
                            if (jVar4.mo94453f().isPresent()) {
                                ((C91881e) jVar4.mo94453f().get()).mo86414b();
                            }
                            Optional g3 = m174147g(view4, false);
                            if (g3.isPresent()) {
                                ((C91887k) g3.get()).mo86430c();
                            }
                        }
                    } else {
                        return;
                    }
                }
                if (this.f292582f.containsKey(view3)) {
                    Optional g4 = m174147g(view3, true);
                    if (g4.isPresent()) {
                        ((C91887k) g4.get()).mo86428a();
                    }
                    this.f292584h = Optional.m71637of(view3);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo86421a(C105004e eVar) {
        m174148h(eVar);
    }

    /* renamed from: b */
    public final void mo86422b(C105004e eVar) {
        m174148h(eVar);
    }

    /* renamed from: c */
    public final void mo86423c() {
        for (C105009j g : this.f292582f.values()) {
            Optional g2 = g.mo94454g();
            if (g2.isPresent()) {
                ((C91887k) g2.get()).mo86431d();
            }
        }
        this.f292577a.mo86452e();
        this.f292577a.mo86451d();
        this.f292584h = Optional.empty();
    }

    /* renamed from: d */
    public final void mo86424d(ViewGroup viewGroup) {
        C105009j jVar = (C105009j) this.f292582f.remove(viewGroup);
        if (jVar != null) {
            if (this.f292584h.isPresent() && this.f292584h.get() == viewGroup) {
                this.f292584h = Optional.empty();
            }
            C105004e eVar = this.f292585i;
            eVar.f292563d.remove(viewGroup);
            if (eVar.f292563d.isEmpty() && eVar.f292564e) {
                C58833ax axVar = eVar.f292560a;
                if (axVar.mo56113h()) {
                    ((C105419b) axVar.mo56107c()).mo94781c(eVar);
                }
                C58833ax axVar2 = eVar.f292561b;
                if (axVar2.mo56113h()) {
                    ((C91825b) axVar2.mo56107c()).mo86304c(eVar);
                }
                eVar.f292564e = false;
            }
            if (this.f292582f.isEmpty()) {
                this.f292585i.f292562c.remove(this);
            }
            if (jVar.mo94453f().isPresent()) {
                ((C91881e) jVar.mo94453f().get()).mo86414b();
            }
            if (jVar.mo94454g().isPresent()) {
                ((C91887k) jVar.mo94454g().get()).mo86432e();
                ((C91887k) jVar.mo94454g().get()).mo86431d();
            }
            this.f292583g--;
        }
    }

    /* renamed from: e */
    public final void mo86425e(ViewGroup viewGroup, C9215cx cxVar, long j, C91890n nVar, Optional optional) {
        Optional optional2;
        boolean z;
        C9214cw cwVar;
        ViewGroup viewGroup2 = viewGroup;
        C9215cx cxVar2 = cxVar;
        C91890n nVar2 = nVar;
        if (!this.f292582f.containsKey(viewGroup2)) {
            if (this.f292583g == 0) {
                C90476a aVar = C91018d.f254254a;
            }
            this.f292583g++;
            if (this.f292582f.isEmpty()) {
                this.f292585i.f292562c.add(this);
            }
            C105004e eVar = this.f292585i;
            if (!eVar.f292564e) {
                C58833ax axVar = eVar.f292560a;
                if (axVar.mo56113h()) {
                    ((C105419b) axVar.mo56107c()).mo94779a(eVar);
                }
                C58833ax axVar2 = eVar.f292561b;
                if (axVar2.mo56113h()) {
                    ((C91825b) axVar2.mo56107c()).mo86302a(eVar);
                }
                eVar.f292564e = true;
            }
            eVar.f292563d.put(viewGroup2, C91884h.UNKNOWN);
            Optional empty = Optional.empty();
            int a = C57056d.m88255a(cxVar2.f31849k);
            if (!(a == 0 || a == 1 || cxVar2.f31850l.isEmpty())) {
                C54784d dVar = (C54784d) C54785e.f143724d.createBuilder();
                int a2 = C57056d.m88255a(cxVar2.f31849k);
                if (a2 == 0) {
                    a2 = 1;
                }
                dVar.copyOnWrite();
                C54785e eVar2 = (C54785e) dVar.instance;
                eVar2.f143727b = a2 - 1;
                eVar2.f143726a |= 1;
                String str = cxVar2.f31850l;
                dVar.copyOnWrite();
                C54785e eVar3 = (C54785e) dVar.instance;
                str.getClass();
                eVar3.f143726a |= 2;
                eVar3.f143728c = str;
                empty = Optional.m71637of((C54785e) dVar.build());
            }
            Optional optional3 = empty;
            if (((cxVar2.f31840b == 1 ? (C9214cw) cxVar2.f31841c : C9214cw.f31833c).f31835a & 1) != 0) {
                C105023d dVar2 = this.f292586j;
                if (cxVar2.f31840b == 1) {
                    cwVar = (C9214cw) cxVar2.f31841c;
                } else {
                    cwVar = C9214cw.f31833c;
                }
                optional2 = Optional.m71637of(dVar2.mo94478a(j, 0, cwVar.f31836b, (String) null, 2, false, optional3, optional));
            } else {
                int i = cxVar2.f31840b;
                if (i == 2) {
                    C105023d dVar3 = this.f292586j;
                    int a3 = C54782b.m87527a(((C9212cu) cxVar2.f31841c).f31829h);
                    optional2 = Optional.m71637of(dVar3.mo94478a(j, a3 == 0 ? 1 : a3, (String) null, cxVar2.f31848j, 3, false, optional3, optional));
                } else if (i == 12) {
                    optional2 = Optional.m71637of(this.f292586j.mo94478a(j, 0, (String) null, cxVar2.f31848j, 4, false, optional3, optional));
                } else {
                    optional2 = Optional.empty();
                }
            }
            C91887k a4 = this.f292579c.mo86427a(viewGroup2, cxVar2, nVar2, optional2);
            C105000a aVar2 = new C105000a();
            aVar2.f292535a = viewGroup2;
            if (cxVar2 != null) {
                aVar2.f292536b = cxVar2;
                aVar2.f292537c = j;
                aVar2.f292541g = (byte) (1 | aVar2.f292541g);
                aVar2.f292538d = nVar2;
                if (optional2 != null) {
                    aVar2.f292539e = optional2;
                    aVar2.f292540f = Optional.m71637of(a4);
                    aVar2.mo94444b(false);
                    int a5 = C54782b.m87527a((cxVar2.f31840b == 2 ? (C9212cu) cxVar2.f31841c : C9212cu.f31820l).f31829h);
                    if (a5 != 0 && a5 == 5) {
                        CardRenderingContext cardRenderingContext = (CardRenderingContext) this.f292581e.mo6453a();
                        synchronized (cardRenderingContext.f118456b) {
                            z = cardRenderingContext.f118457c.getBoolean("ENABLE_THIRD_PARTY_PLAYER_PRELOADING_FOR_STAMP");
                        }
                        if (z) {
                            a4.mo86429b();
                        }
                    }
                    this.f292582f.put(viewGroup2, aVar2.mo94443a());
                    return;
                }
                throw new NullPointerException("Null inlineVideoLogger");
            }
            throw new NullPointerException("Null playVideoAction");
        }
    }

    /* renamed from: f */
    public final boolean mo86426f(C9215cx cxVar, long j, C7718hj hjVar) {
        C105009j jVar;
        Iterator it = this.f292582f.values().iterator();
        while (true) {
            if (!it.hasNext()) {
                jVar = null;
                break;
            }
            jVar = (C105009j) it.next();
            if (C58832aw.m90831a(cxVar, jVar.mo94451e())) {
                break;
            }
        }
        if (((CardRenderingContext) this.f292581e.mo6453a()).mo49321p() && cxVar.f31840b == 1) {
            for (View view : new HashSet(this.f292582f.keySet())) {
                C105009j jVar2 = (C105009j) this.f292582f.get(view);
                if (jVar2 != null && jVar2.mo94451e().f31840b == 1 && !C58832aw.m90831a(cxVar, jVar2.mo94451e()) && jVar2.mo94454g().isPresent()) {
                    ((C91887k) jVar2.mo94454g().get()).mo86431d();
                    Map map = this.f292582f;
                    C105008i d = jVar2.mo94450d();
                    d.mo94446d(Optional.empty());
                    map.put(view, d.mo94443a());
                }
            }
        }
        if (this.f292578b.mo94485b(cxVar)) {
            C90476a aVar = C91018d.f254254a;
            if (jVar != null && jVar.mo94454g().isPresent()) {
                return ((C91887k) jVar.mo94454g().get()).mo86433f(cxVar, jVar.mo94447a(), hjVar);
            }
            this.f292580d.mo94479a(cxVar, j, 0, (View) null, hjVar);
            return true;
        } else if (jVar == null || !jVar.mo94453f().isPresent()) {
            return false;
        } else {
            ((C91881e) jVar.mo94453f().get()).mo86419g(12);
            return false;
        }
    }
}
