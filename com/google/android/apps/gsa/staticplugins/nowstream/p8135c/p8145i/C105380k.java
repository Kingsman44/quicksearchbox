package com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8145i;

import android.graphics.Rect;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.Pair;
import com.google.android.apps.gsa.p8885y.C118827a;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.search.core.p6805i.C86106b;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.p7066m.C90010bp;
import com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.VisualElementBoundsParcelable;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105304u;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.p1917d.p1918a.C23245b;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.p4566l.C60217q;
import com.google.common.p4552o.p4566l.C60218r;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p375ai.p378b.C7669fo;
import com.google.p375ai.p378b.C7973qv;
import com.google.p375ai.p378b.C8176yi;
import com.google.p375ai.p378b.C8178yk;
import com.google.p4283bv.p4354e.p4356b.C57052a;
import com.google.p4283bv.p4354e.p4356b.C57057b;
import com.google.p4283bv.p4354e.p4356b.C57344d;
import com.google.protobuf.C62921ba;
import com.google.protos.p4816ai.p4817a.C63187a;
import com.google.protos.p4816ai.p4817a.C63188b;
import com.google.protos.p4816ai.p4817a.C63190d;
import com.google.protos.p4816ai.p4817a.C63192f;
import com.google.protos.p4816ai.p4817a.C63193g;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.c.i.k */
/* compiled from: PG */
public final class C105380k {

    /* renamed from: h */
    private static final Comparator f293987h = new C105378i();

    /* renamed from: i */
    private static final C59071e f293988i = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.nowstream.c.i.k");

    /* renamed from: a */
    public final List f293989a = new ArrayList();

    /* renamed from: b */
    public final C118827a f293990b;

    /* renamed from: c */
    final Map f293991c = new LinkedHashMap();

    /* renamed from: d */
    public int f293992d = 0;

    /* renamed from: e */
    public boolean f293993e;

    /* renamed from: f */
    public C60220t f293994f;

    /* renamed from: g */
    public C105304u f293995g;

    /* renamed from: j */
    private final C21370a f293996j;

    /* renamed from: k */
    private final C86124t f293997k;

    /* renamed from: l */
    private final C105371b f293998l;

    /* renamed from: m */
    private final Set f293999m = Collections.newSetFromMap(new LinkedHashMap());

    /* renamed from: n */
    private final C86106b f294000n;

    /* renamed from: o */
    private final C58881cr f294001o = C58886cw.m90973a(new C105373d(this));

    /* renamed from: p */
    private final C58881cr f294002p = C58886cw.m90973a(new C105374e(this));

    /* renamed from: q */
    private final C58881cr f294003q = C58886cw.m90973a(new C105375f(this));

    /* renamed from: r */
    private final C58881cr f294004r = C58886cw.m90973a(new C105376g(this));

    /* renamed from: s */
    private final C58881cr f294005s = C58886cw.m90973a(new C105377h(this));

    /* renamed from: t */
    private long f294006t = -1;

    /* renamed from: u */
    private boolean f294007u = false;

    /* renamed from: v */
    private boolean f294008v = false;

    /* renamed from: w */
    private long f294009w;

    public C105380k(C86106b bVar, C21370a aVar, C86124t tVar, C118827a aVar2, C105371b bVar2) {
        this.f294000n = bVar;
        this.f293996j = aVar;
        this.f293997k = tVar;
        this.f293990b = aVar2;
        this.f293998l = bVar2;
    }

    /* renamed from: e */
    public static C63192f m175068e(int i, long j) {
        C63188b bVar = (C63188b) C63192f.f170699q.createBuilder();
        bVar.copyOnWrite();
        C63192f fVar = (C63192f) bVar.instance;
        fVar.f170705e = i - 1;
        fVar.f170701a |= 2;
        bVar.copyOnWrite();
        C63192f fVar2 = (C63192f) bVar.instance;
        fVar2.f170701a |= 1;
        fVar2.f170704d = j;
        return (C63192f) bVar.build();
    }

    /* renamed from: a */
    public final void mo94775a(long j, C58485gu guVar) {
        C8176yi yiVar;
        C8176yi yiVar2;
        Rect rect;
        C57052a aVar;
        C7973qv c;
        long j2 = j;
        boolean e = this.f293997k.mo79746e(C90010bp.f246945aN);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            VisualElementBoundsParcelable visualElementBoundsParcelable = (VisualElementBoundsParcelable) guVar.get(i);
            if (!linkedHashMap.containsKey(visualElementBoundsParcelable.mo86364d())) {
                C57057b e2 = visualElementBoundsParcelable.mo86365e();
                if (e2 != null) {
                    aVar = (C57052a) e2.toBuilder();
                } else {
                    aVar = (C57052a) C57057b.f152311e.createBuilder();
                }
                C7669fo b = visualElementBoundsParcelable.mo86362b();
                if (b != null) {
                    aVar.copyOnWrite();
                    C57057b bVar = (C57057b) aVar.instance;
                    bVar.f152314b = b;
                    bVar.f152313a = 1 | bVar.f152313a;
                }
                if (e && (c = visualElementBoundsParcelable.mo86363c()) != null) {
                    aVar.copyOnWrite();
                    C57057b bVar2 = (C57057b) aVar.instance;
                    bVar2.f152315c = c;
                    bVar2.f152313a = 2 | bVar2.f152313a;
                }
                C8178yk d = visualElementBoundsParcelable.mo86364d();
                C57057b bVar3 = (C57057b) aVar.build();
                if (d != null) {
                    C105370a aVar2 = new C105370a(d, bVar3);
                    linkedHashMap.put(visualElementBoundsParcelable.mo86364d(), aVar2);
                    linkedHashMap2.put(aVar2, new ArrayList());
                } else {
                    throw new NullPointerException("Null visualElementInfo");
                }
            }
            List list = (List) linkedHashMap2.get((C105379j) linkedHashMap.get(visualElementBoundsParcelable.mo86364d()));
            if (list != null) {
                list.add(visualElementBoundsParcelable.mo86361a());
            }
        }
        this.f293996j.mo26870b();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        boolean z = false;
        for (Map.Entry entry : linkedHashMap2.entrySet()) {
            if (((List) entry.getValue()).size() > 1) {
                List<Rect> list2 = (List) entry.getValue();
                Collections.sort(list2, f293987h);
                int i2 = LinearLayoutManager.INVALID_OFFSET;
                int i3 = LinearLayoutManager.INVALID_OFFSET;
                for (Rect rect2 : list2) {
                    if (i3 != i2) {
                        int i4 = rect2.top - i3;
                        if (i4 != 1 && i4 != 0) {
                            C58976aa aaVar = C58975e.f156826a;
                            C59104x d2 = f293988i.mo56226d();
                            d2.mo56378ag(C58975e.f156826a, "FeedVeViewportReporter");
                            ((C59052c) ((C59052c) d2).mo56372aa(22317)).mo56386p("visual_element_info being recorded with non-contiguous view bounds.");
                            break;
                        }
                        i3 = Math.max(i3, rect2.bottom);
                        i2 = LinearLayoutManager.INVALID_OFFSET;
                    } else {
                        i3 = rect2.bottom;
                    }
                }
                List list3 = (List) entry.getValue();
                rect = new Rect();
                for (int i5 = 0; i5 < list3.size(); i5++) {
                    rect.union((Rect) list3.get(i5));
                }
                if (!z && this.f293991c.containsKey(((C105379j) entry.getKey()).mo94767a())) {
                    Rect rect3 = (Rect) this.f293991c.get(((C105379j) entry.getKey()).mo94767a());
                    rect3.getClass();
                    z = (rect.right - rect.left == rect3.right - rect3.left && rect.bottom - rect.top == rect3.bottom - rect3.top) ? false : true;
                }
                this.f293991c.put(((C105379j) entry.getKey()).mo94767a(), rect);
            } else if (((List) entry.getValue()).size() == 1) {
                rect = (Rect) ((List) entry.getValue()).get(0);
            } else {
                C59104x d3 = f293988i.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "FeedVeViewportReporter");
                ((C59052c) ((C59052c) d3).mo56372aa(22316)).mo56386p("visual_element_info being recorded with no bounds.");
            }
            linkedHashMap3.put((C105379j) entry.getKey(), rect);
        }
        if (z) {
            this.f293989a.add(m175068e(11, this.f293996j.mo26870b()));
        }
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            C8178yk a = ((C105379j) entry2.getKey()).mo94767a();
            if (a.f28739b == 1) {
                yiVar = (C8176yi) a.f28740c;
            } else {
                yiVar = C8176yi.f28728f;
            }
            C60220t tVar = yiVar.f28731b;
            if (tVar == null) {
                tVar = C60220t.f162931e;
            }
            int a2 = this.f293998l.mo94772a(tVar);
            if (this.f293999m.add(Integer.valueOf(a2))) {
                C63188b bVar4 = (C63188b) m175068e(12, j2).toBuilder();
                bVar4.copyOnWrite();
                C63192f fVar = (C63192f) bVar4.instance;
                fVar.f170701a |= 1;
                fVar.f170704d = j2;
                bVar4.copyOnWrite();
                C63192f fVar2 = (C63192f) bVar4.instance;
                fVar2.f170705e = 11;
                fVar2.f170701a |= 2;
                bVar4.copyOnWrite();
                C63192f fVar3 = (C63192f) bVar4.instance;
                fVar3.f170701a |= 8192;
                fVar3.f170714n = a2;
                String d4 = C28294l.m52914d(tVar);
                bVar4.copyOnWrite();
                C63192f fVar4 = (C63192f) bVar4.instance;
                d4.getClass();
                fVar4.f170701a |= 32768;
                fVar4.f170715o = d4;
                this.f293989a.add((C63192f) bVar4.build());
            }
            Rect rect4 = (Rect) entry2.getValue();
            C63188b bVar5 = (C63188b) m175068e(2, j2).toBuilder();
            bVar5.copyOnWrite();
            C63192f fVar5 = (C63192f) bVar5.instance;
            fVar5.f170701a |= 8192;
            fVar5.f170714n = a2;
            C8178yk a3 = ((C105379j) entry2.getKey()).mo94767a();
            if (a3.f28739b == 1) {
                yiVar2 = (C8176yi) a3.f28740c;
            } else {
                yiVar2 = C8176yi.f28728f;
            }
            int i6 = yiVar2.f28733d;
            bVar5.copyOnWrite();
            C63192f fVar6 = (C63192f) bVar5.instance;
            fVar6.f170702b = 10;
            fVar6.f170703c = Integer.valueOf(i6);
            int i7 = rect4.top;
            int i8 = this.f293992d;
            bVar5.copyOnWrite();
            C63192f fVar7 = (C63192f) bVar5.instance;
            fVar7.f170701a |= 4;
            fVar7.f170706f = i7 + i8;
            int i9 = rect4.left;
            bVar5.copyOnWrite();
            C63192f fVar8 = (C63192f) bVar5.instance;
            fVar8.f170701a |= 8;
            fVar8.f170707g = i9;
            int width = rect4.width();
            bVar5.copyOnWrite();
            C63192f fVar9 = (C63192f) bVar5.instance;
            fVar9.f170701a |= 32;
            fVar9.f170709i = width;
            int height = rect4.height();
            bVar5.copyOnWrite();
            C63192f fVar10 = (C63192f) bVar5.instance;
            fVar10.f170701a |= 16;
            fVar10.f170708h = height;
            C57057b b2 = ((C105379j) entry2.getKey()).mo94768b();
            if (b2 != null) {
                bVar5.mo58885m(C57344d.f153206b, b2);
            }
            this.f293989a.add((C63192f) bVar5.build());
        }
        if (!linkedHashMap2.isEmpty()) {
            this.f294007u = true;
        }
        C58976aa aaVar2 = C58975e.f156826a;
    }

    /* renamed from: b */
    public final void mo94776b(ProtoParcelable protoParcelable, int i, long j) {
        C8176yi yiVar;
        C8176yi yiVar2;
        C63188b bVar = (C63188b) m175068e(10, j).toBuilder();
        C8178yk ykVar = (C8178yk) C23245b.m43557b(protoParcelable, C8178yk.f28736g.getParserForType(), C62921ba.m95368a(), true);
        ykVar.getClass();
        C105371b bVar2 = this.f293998l;
        if (ykVar.f28739b == 1) {
            yiVar = (C8176yi) ykVar.f28740c;
        } else {
            yiVar = C8176yi.f28728f;
        }
        C60220t tVar = yiVar.f28731b;
        if (tVar == null) {
            tVar = C60220t.f162931e;
        }
        int a = bVar2.mo94772a(tVar);
        bVar.copyOnWrite();
        C63192f fVar = (C63192f) bVar.instance;
        fVar.f170701a |= 128;
        fVar.f170711k = i;
        bVar.copyOnWrite();
        C63192f fVar2 = (C63192f) bVar.instance;
        fVar2.f170701a |= 8192;
        fVar2.f170714n = a;
        if (ykVar.f28739b == 1) {
            yiVar2 = (C8176yi) ykVar.f28740c;
        } else {
            yiVar2 = C8176yi.f28728f;
        }
        int i2 = yiVar2.f28733d;
        bVar.copyOnWrite();
        C63192f fVar3 = (C63192f) bVar.instance;
        fVar3.f170702b = 10;
        fVar3.f170703c = Integer.valueOf(i2);
        this.f293989a.add((C63192f) bVar.build());
    }

    /* renamed from: c */
    public final void mo94777c(Rect rect, long j) {
        if (!this.f294008v) {
            ((C118831d) this.f294001o.mo6453a()).mo104025g(1);
        }
        this.f294008v = true;
        this.f294009w = j;
        if (this.f294006t != -1) {
            C63188b bVar = (C63188b) m175068e(3, j).toBuilder();
            long j2 = this.f294006t;
            bVar.copyOnWrite();
            C63192f fVar = (C63192f) bVar.instance;
            fVar.f170701a |= 256;
            fVar.f170712l = j - j2;
            this.f294006t = -1;
            this.f293989a.add((C63192f) bVar.build());
        }
        C63188b bVar2 = (C63188b) m175068e(1, j).toBuilder();
        int i = rect.bottom;
        int i2 = rect.top;
        bVar2.copyOnWrite();
        C63192f fVar2 = (C63192f) bVar2.instance;
        fVar2.f170701a |= 16;
        fVar2.f170708h = i - i2;
        int i3 = rect.right;
        int i4 = rect.left;
        bVar2.copyOnWrite();
        C63192f fVar3 = (C63192f) bVar2.instance;
        fVar3.f170701a |= 32;
        fVar3.f170709i = i3 - i4;
        int i5 = this.f293992d;
        bVar2.copyOnWrite();
        C63192f fVar4 = (C63192f) bVar2.instance;
        fVar4.f170701a |= 64;
        fVar4.f170710j = i5;
        this.f293989a.add((C63192f) bVar2.build());
    }

    /* renamed from: d */
    public final void mo94778d(long j) {
        long j2 = j;
        if (this.f294008v) {
            if (this.f293993e) {
                C105304u uVar = this.f293995g;
                if (uVar != null) {
                    uVar.mo94710a();
                }
                this.f293994f = null;
                this.f293992d = 0;
            }
            this.f294008v = false;
            C63188b bVar = (C63188b) m175068e(7, j2).toBuilder();
            int i = 2;
            int i2 = true != this.f293993e ? 1 : 2;
            bVar.copyOnWrite();
            C63192f fVar = (C63192f) bVar.instance;
            fVar.f170713m = i2;
            fVar.f170701a |= 4096;
            this.f293989a.add((C63192f) bVar.build());
            C63188b bVar2 = (C63188b) m175068e(1, j2).toBuilder();
            bVar2.copyOnWrite();
            C63192f fVar2 = (C63192f) bVar2.instance;
            fVar2.f170701a |= 8;
            fVar2.f170707g = 0;
            bVar2.copyOnWrite();
            C63192f fVar3 = (C63192f) bVar2.instance;
            fVar3.f170701a |= 4;
            fVar3.f170706f = 0;
            bVar2.copyOnWrite();
            C63192f fVar4 = (C63192f) bVar2.instance;
            fVar4.f170701a |= 16;
            fVar4.f170708h = 0;
            bVar2.copyOnWrite();
            C63192f fVar5 = (C63192f) bVar2.instance;
            fVar5.f170701a |= 32;
            fVar5.f170709i = 0;
            this.f293989a.add((C63192f) bVar2.build());
            Collections.sort(this.f293989a, C105372c.f293981a);
            C58485gu<C63192f> j3 = C58485gu.m89842j(this.f293989a);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            ArrayList arrayList = new ArrayList();
            boolean z = false;
            int i3 = 0;
            for (C63192f fVar6 : j3) {
                int i4 = fVar6.f170705e;
                int a = C63190d.m96203a(i4);
                if (a == 0 || a != 4) {
                    int a2 = C63190d.m96203a(i4);
                    if (a2 != 0 && a2 == 11) {
                        linkedHashMap.clear();
                        arrayList.add(fVar6);
                        i3 = 0;
                    } else {
                        int a3 = C63190d.m96203a(i4);
                        if (a3 != 0 && a3 == i) {
                            Pair pair = new Pair(Integer.valueOf(fVar6.f170714n), Integer.valueOf(fVar6.f170702b == 10 ? ((Integer) fVar6.f170703c).intValue() : 0));
                            if (!linkedHashMap.containsKey(pair)) {
                                linkedHashMap.put(pair, new Rect(fVar6.f170707g, fVar6.f170706f, fVar6.f170709i, fVar6.f170708h));
                                arrayList.add(fVar6);
                            } else {
                                Rect rect = (Rect) linkedHashMap.get(pair);
                                rect.getClass();
                                if (!(rect.top == fVar6.f170706f && rect.bottom == fVar6.f170708h)) {
                                    linkedHashMap.put(pair, new Rect(fVar6.f170707g, fVar6.f170706f, fVar6.f170709i, fVar6.f170708h));
                                    arrayList.add(fVar6);
                                }
                            }
                        } else {
                            arrayList.add(fVar6);
                        }
                    }
                } else if (z) {
                    i3 += fVar6.f170710j;
                    int size = arrayList.size();
                    C63188b bVar3 = (C63188b) fVar6.toBuilder();
                    bVar3.copyOnWrite();
                    C63192f fVar7 = (C63192f) bVar3.instance;
                    fVar7.f170701a |= 64;
                    fVar7.f170710j = i3;
                    arrayList.set(size - 1, (C63192f) bVar3.build());
                } else {
                    i3 = fVar6.f170710j;
                    arrayList.add(fVar6);
                }
                int a4 = C63190d.m96203a(fVar6.f170705e);
                if (a4 != 0 && a4 == 4) {
                    i = 2;
                    z = true;
                } else {
                    i = 2;
                    z = false;
                }
            }
            this.f293989a.clear();
            this.f293999m.clear();
            if (!this.f294007u) {
                ((C118831d) this.f294003q.mo6453a()).mo104025g(1);
                ((C118831d) this.f294005s.mo6453a()).mo104025g(this.f293996j.mo26870b() - this.f294009w);
                C59104x b = f293988i.mo56224b();
                b.mo56378ag(C58975e.f156826a, "FeedVeViewportReporter");
                ((C59052c) ((C59052c) b).mo56372aa(22318)).mo56386p("Not reporting attention logs with no visual elements.");
            } else {
                this.f294007u = false;
                C63187a aVar = (C63187a) C63193g.f170718h.createBuilder();
                aVar.mo59193a(arrayList);
                C105304u uVar2 = this.f293995g;
                if (uVar2 != null) {
                    int intValue = ((Integer) uVar2.f293790a.f293798h.mo94561z().f63720e).intValue();
                    aVar.copyOnWrite();
                    C63193g gVar = (C63193g) aVar.instance;
                    gVar.f170720a |= 16;
                    gVar.f170726g = intValue;
                    int intValue2 = ((Integer) uVar2.f293790a.f293798h.mo94560y().f63720e).intValue();
                    aVar.copyOnWrite();
                    C63193g gVar2 = (C63193g) aVar.instance;
                    gVar2.f170720a |= 1;
                    gVar2.f170721b = intValue2;
                    uVar2.f293790a.f293798h.mo94560y().mo28730f(Integer.valueOf(((Integer) uVar2.f293790a.f293798h.mo94560y().f63720e).intValue() + arrayList.size()), false);
                    uVar2.mo94710a();
                }
                C60220t tVar = this.f293994f;
                if (tVar != null) {
                    C60217q qVar = (C60217q) C60218r.f162925d.createBuilder();
                    qVar.copyOnWrite();
                    C60218r rVar = (C60218r) qVar.instance;
                    rVar.f162928b = tVar;
                    rVar.f162927a |= 1;
                    C60218r rVar2 = (C60218r) qVar.build();
                    aVar.copyOnWrite();
                    C63193g gVar3 = (C63193g) aVar.instance;
                    rVar2.getClass();
                    gVar3.f170723d = rVar2;
                    gVar3.f170720a |= 4;
                }
                ((C118831d) this.f294002p.mo6453a()).mo104025g(1);
                ((C118831d) this.f294004r.mo6453a()).mo104025g(this.f293996j.mo26870b() - this.f294009w);
                C63193g gVar4 = (C63193g) aVar.build();
                String b2 = this.f294000n.mo79727b();
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar = (C60555uf) tzVar.instance;
                ufVar.f164093a |= 2;
                ufVar.f164258m = 1192;
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                gVar4.getClass();
                ufVar2.f164110aQ = gVar4;
                ufVar2.f164251f |= 64;
                if (b2 != null) {
                    tzVar.copyOnWrite();
                    C60555uf ufVar3 = (C60555uf) tzVar.instance;
                    ufVar3.f164254i |= 8192;
                    ufVar3.f164166bT = b2;
                }
                C58976aa aaVar = C58975e.f156826a;
                C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            }
            this.f294006t = j2;
            this.f293993e = false;
        }
    }
}
