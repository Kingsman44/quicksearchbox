package com.google.android.apps.gsa.search.core.p6816p;

import com.google.android.apps.gsa.search.core.logging.C86169a;
import com.google.android.apps.gsa.search.shared.actions.ActionData;
import com.google.android.apps.gsa.search.shared.actions.errors.C87415c;
import com.google.android.apps.gsa.shared.p7127q.C90456c;
import com.google.android.apps.gsa.shared.search.Query;
import com.google.android.libraries.logging.C28294l;
import com.google.android.libraries.p1730f.C21370a;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.p4566l.C60220t;
import com.google.p4017at.p4060h.p4068b.p4069a.C54182a;
import com.google.p4017at.p4060h.p4068b.p4069a.C54196m;
import com.google.p4017at.p4060h.p4068b.p4069a.C54204u;
import com.google.p4152bb.p4153a.C54946ad;
import com.google.p4152bb.p4153a.C54976bg;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.p4280bt.C56486b;
import com.google.p4280bt.C56488d;
import com.google.p4500cm.p4518d.p4519a.C58178a;
import com.google.p4500cm.p4518d.p4519a.C58179b;
import com.google.p5277z.p5282c.C68024n;
import com.google.p5277z.p5282c.C68026p;
import com.google.p5277z.p5282c.C68032v;
import com.google.protobuf.C62910ar;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;
import com.google.protobuf.C63070h;
import dagger.C68214a;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.search.core.p.x */
/* compiled from: PG */
public final class C86269x {

    /* renamed from: a */
    public static final C59071e f233206a = C59071e.m91332i("com.google.android.apps.gsa.search.core.p.x");

    /* renamed from: b */
    public final C86246cb f233207b;

    /* renamed from: c */
    private final Query f233208c;

    /* renamed from: d */
    private final C21370a f233209d;

    /* renamed from: e */
    private final C68214a f233210e;

    /* renamed from: f */
    private C56488d f233211f;

    /* renamed from: g */
    private int f233212g = 0;

    /* renamed from: h */
    private boolean f233213h = false;

    /* renamed from: i */
    private String f233214i = null;

    public C86269x(C86246cb cbVar, Query query, C21370a aVar, C68214a aVar2) {
        this.f233207b = cbVar;
        this.f233208c = query;
        this.f233209d = aVar;
        this.f233210e = aVar2;
    }

    /* renamed from: a */
    public final void mo79968a(C54196m mVar) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        C54204u uVar;
        C54204u uVar2;
        C58833ax axVar;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f233212g == 0) {
            long d = this.f233209d.mo26872d();
            C86169a.m138609a(this.f233208c, d);
            this.f233207b.mo79918ai(d);
            this.f233207b.mo79933ax();
        }
        if (this.f233211f == null) {
            if ((mVar.f142233a & 1) != 0) {
                C56488d dVar = mVar.f142236d;
                if (dVar == null) {
                    dVar = C56488d.f150876d;
                }
                if (dVar.f150878a != 0) {
                    C56488d dVar2 = mVar.f142236d;
                    if (dVar2 == null) {
                        dVar2 = C56488d.f150876d;
                    }
                    this.f233211f = dVar2;
                    Query query = this.f233208c;
                    if (dVar2.f150880c.size() > 1) {
                        C59104x c = C86270y.f233215a.mo56225c();
                        c.mo56378ag(C58975e.f156826a, "CS.StatusHandler");
                        ((C59052c) ((C59052c) c).mo56372aa(7743)).mo56386p("Unexpected multiple error details.");
                    }
                    Iterator it = dVar2.f150880c.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            C59104x c2 = C86270y.f233215a.mo56225c();
                            c2.mo56378ag(C58975e.f156826a, "CS.StatusHandler");
                            ((C59052c) ((C59052c) c2).mo56372aa(7741)).mo56386p("Unhandled status.");
                            axVar = C58836b.f156633a;
                            break;
                        }
                        C63070h hVar = (C63070h) it.next();
                        if (hVar.f170217a.equals("type.googleapis.com/google.rpc.RetryInfo")) {
                            try {
                                C62910ar arVar = ((C56486b) C62942bv.parseFrom((C62942bv) C56486b.f150873b, hVar.f170218b)).f150875a;
                                if (arVar == null) {
                                    arVar = C62910ar.f169858c;
                                }
                                axVar = C58833ax.m90834k(C87415c.m141581a(query, new C86225bh(TimeUnit.SECONDS.toMillis(arVar.f169860a) + TimeUnit.NANOSECONDS.toMillis((long) arVar.f169861b))).f236022f);
                            } catch (C62974ct unused) {
                                C59104x c3 = C86270y.f233215a.mo56225c();
                                c3.mo56378ag(C58975e.f156826a, "CS.StatusHandler");
                                ((C59052c) ((C59052c) c3).mo56372aa(7742)).mo56386p("Received invalid RetryInfo.");
                                axVar = C58836b.f156633a;
                            }
                        }
                    }
                    if (axVar.mo56113h()) {
                        this.f233207b.mo79840k((C90456c) axVar.mo56107c());
                        return;
                    }
                    return;
                }
            }
            if (mVar.f142234b == 3) {
                if (((C54204u) mVar.f142235c).f142260h == null) {
                    C60220t tVar = C60220t.f162931e;
                }
                int i = mVar.f142234b;
                if (i == 3) {
                    uVar = (C54204u) mVar.f142235c;
                } else {
                    uVar = C54204u.f142252i;
                }
                if ((uVar.f142254a & 128) != 0) {
                    if (i == 3) {
                        uVar2 = (C54204u) mVar.f142235c;
                    } else {
                        uVar2 = C54204u.f142252i;
                    }
                    C60220t tVar2 = uVar2.f142260h;
                    if (tVar2 == null) {
                        tVar2 = C60220t.f162931e;
                    }
                    this.f233214i = C28294l.m52914d(tVar2);
                }
            }
            C62940bt r0 = C62942bv.checkIsLite(C54182a.f142197a);
            mVar.mo58887l(r0);
            Object l = mVar.f169962ag.mo58854l(r0.f169971d);
            if (l == null) {
                obj = r0.f169969b;
            } else {
                obj = r0.mo58889c(l);
            }
            if (((C55349pb) obj).f145835d.size() > 0) {
                this.f233213h = true;
                C62940bt r02 = C62942bv.checkIsLite(C54182a.f142197a);
                mVar.mo58887l(r02);
                Object l2 = mVar.f169962ag.mo58854l(r02.f169971d);
                if (l2 == null) {
                    obj2 = r02.f169969b;
                } else {
                    obj2 = r02.mo58889c(l2);
                }
                C54946ad adVar = (C54946ad) ((C55349pb) obj2).f145835d.get(0);
                C54976bg bgVar = adVar.f144537e;
                if (bgVar == null) {
                    bgVar = C54976bg.f144641o;
                }
                C62940bt r5 = C62942bv.checkIsLite(C68026p.f184307c);
                bgVar.mo58887l(r5);
                if (bgVar.f169962ag.mo58857o(r5.f169971d)) {
                    C54976bg bgVar2 = adVar.f144537e;
                    if (bgVar2 == null) {
                        bgVar2 = C54976bg.f144641o;
                    }
                    C62940bt r4 = C62942bv.checkIsLite(C68026p.f184307c);
                    bgVar2.mo58887l(r4);
                    Object l3 = bgVar2.f169962ag.mo58854l(r4.f169971d);
                    if (l3 == null) {
                        obj4 = r4.f169969b;
                    } else {
                        obj4 = r4.mo58889c(l3);
                    }
                    C68032v vVar = ((C68024n) ((C68026p) obj4).f184309a.get(0)).f184300a;
                    if (vVar == null) {
                        vVar = C68032v.f184320b;
                    }
                    C86246cb cbVar = this.f233207b;
                    C58178a aVar = (C58178a) C58179b.f155534j.createBuilder();
                    aVar.copyOnWrite();
                    C58179b bVar = (C58179b) aVar.instance;
                    vVar.getClass();
                    bVar.f155541f = vVar;
                    bVar.f155536a |= 64;
                    cbVar.mo79935az((C58179b) aVar.build());
                }
                C86246cb cbVar2 = this.f233207b;
                C62940bt r3 = C62942bv.checkIsLite(C54182a.f142197a);
                mVar.mo58887l(r3);
                Object l4 = mVar.f169962ag.mo58854l(r3.f169971d);
                if (l4 == null) {
                    obj3 = r3.f169969b;
                } else {
                    obj3 = r3.mo58889c(l4);
                }
                cbVar2.mo79912ac(ActionData.m141431u((C55349pb) obj3, (C58179b) null, this.f233214i, false, this.f233210e, (C52091ex) null));
            } else if (this.f233212g > 0) {
                this.f233207b.mo79912ac(ActionData.f235991b);
            }
            if (this.f233213h && mVar.f142234b == 6) {
                C86246cb cbVar3 = this.f233207b;
                C58178a aVar2 = (C58178a) C58179b.f155534j.createBuilder();
                aVar2.copyOnWrite();
                C58179b bVar2 = (C58179b) aVar2.instance;
                bVar2.f155536a |= 32;
                bVar2.f155540e = true;
                cbVar3.mo79935az((C58179b) aVar2.build());
            }
            if (mVar.f142234b == 3) {
                this.f233207b.mo79909Z((C54204u) mVar.f142235c);
            }
            this.f233207b.mo79907X(mVar.toByteArray());
            this.f233207b.mo79910aa(mVar.getSerializedSize());
            this.f233212g++;
            return;
        }
        C59104x c4 = f233206a.mo56225c();
        c4.mo56378ag(C58975e.f156826a, "CS.Handler");
        ((C59052c) ((C59052c) c4).mo56372aa(7738)).mo56386p("Unexpected streaming response after status.");
    }
}
