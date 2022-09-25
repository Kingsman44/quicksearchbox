package com.google.android.libraries.search.rendering.xuikit.p3097a;

import com.google.android.libraries.elements.interfaces.C21232ab;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3116d.p3117a.C40064b;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40358k;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3142k.C40463g;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57776h;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57778j;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57780l;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57782n;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57702a;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57704c;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57705d;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57707f;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57709h;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57711j;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57713l;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57714m;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4392b.p4396b.p4399b.C57716o;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57763f;
import com.google.p4283bv.p4380j.p4385b.p4386a.p4410d.C57772o;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63070h;
import com.google.protos.youtube.elements.C66260r;
import java.util.Collections;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.d */
/* compiled from: PG */
public final class C40062d {

    /* renamed from: a */
    private final C21232ab f105276a;

    /* renamed from: b */
    private final C40064b f105277b;

    /* renamed from: c */
    private final C58833ax f105278c;

    /* renamed from: d */
    private final C21259bb f105279d;

    /* renamed from: e */
    private final C40358k f105280e;

    public C40062d(C21232ab abVar, C40064b bVar, C58833ax axVar, C21259bb bbVar, C40358k kVar) {
        this.f105276a = abVar;
        this.f105277b = bVar;
        this.f105278c = axVar;
        this.f105279d = bbVar;
        this.f105280e = kVar;
    }

    /* renamed from: a */
    public final void mo42164a(C57776h hVar) {
        Object obj;
        C40084x xVar;
        C57705d dVar;
        for (C57778j jVar : hVar.f154367a) {
            String str = jVar.f154371a;
            int a = C57782n.m88531a(jVar.f154372b);
            if (a == 0) {
                a = 1;
            }
            C57780l lVar = jVar.f154373c;
            if (lVar == null) {
                lVar = C57780l.f154376c;
            }
            int i = a - 1;
            if (i == 1) {
                C62940bt r2 = C62942bv.checkIsLite(C57772o.f154360b);
                lVar.mo58887l(r2);
                if (lVar.f169962ag.mo58857o(r2.f169971d)) {
                    this.f105277b.mo42167b(str, lVar);
                } else {
                    C62940bt r22 = C62942bv.checkIsLite(C57709h.f154177c);
                    lVar.mo58887l(r22);
                    if (lVar.f169962ag.mo58857o(r22.f169971d)) {
                        C57713l lVar2 = (C57713l) C57714m.f154186b.createBuilder();
                        C62940bt r6 = C62942bv.checkIsLite(C57709h.f154177c);
                        lVar.mo58887l(r6);
                        Object l = lVar.f169962ag.mo58854l(r6.f169971d);
                        if (l == null) {
                            obj = r6.f169969b;
                        } else {
                            obj = r6.mo58889c(l);
                        }
                        for (C57707f fVar : ((C57709h) obj).f154179a) {
                            int i2 = fVar.f154173a;
                            boolean z = false;
                            if (!((i2 & 2) == 0 || (i2 & 1) == 0)) {
                                z = true;
                            }
                            C58838bb.m90869d(z, "RequiredResources must have both the name and resource fields filled in.");
                            C57711j jVar2 = fVar.f154175c;
                            if (jVar2 == null) {
                                jVar2 = C57711j.f154180c;
                            }
                            String str2 = fVar.f154174b;
                            str2.getClass();
                            C58838bb.m90869d(!Collections.unmodifiableMap(((C57714m) lVar2.instance).f154188a).containsKey(str2), "You can not have two RequiredResources with the same name");
                            C58833ax axVar = this.f105278c;
                            if (axVar.mo56113h()) {
                                C40085y yVar = (C40085y) axVar.mo56107c();
                                synchronized (yVar.f105305c) {
                                    xVar = (C40084x) yVar.f105305c.get(jVar2);
                                }
                                C57702a aVar = (C57702a) C57705d.f154166d.createBuilder();
                                if (xVar == null) {
                                    aVar.copyOnWrite();
                                    C57705d dVar2 = (C57705d) aVar.instance;
                                    dVar2.f154169b = 1;
                                    dVar2.f154168a |= 1;
                                    dVar = (C57705d) aVar.build();
                                } else {
                                    C57716o oVar = C57716o.RESOURCE_TYPE_UNSPECIFIED;
                                    C57716o a2 = C57716o.m88524a(jVar2.f154182a);
                                    if (a2 == null) {
                                        a2 = C57716o.RESOURCE_TYPE_UNSPECIFIED;
                                    }
                                    if (a2.ordinal() != 1) {
                                        C59052c cVar = (C59052c) ((C59052c) C40085y.f105304b.mo56226d()).mo56372aa(53296);
                                        C57716o a3 = C57716o.m88524a(jVar2.f154182a);
                                        if (a3 == null) {
                                            a3 = C57716o.RESOURCE_TYPE_UNSPECIFIED;
                                        }
                                        cVar.mo56387q("Received unspported resource type %d.", a3.f154194d);
                                        aVar.copyOnWrite();
                                        C57705d dVar3 = (C57705d) aVar.instance;
                                        dVar3.f154169b = 1;
                                        dVar3.f154168a |= 1;
                                    } else {
                                        C60870cx a4 = xVar.mo42118a();
                                        String b = xVar.mo42119b();
                                        int a5 = C40085y.m69608a(jVar2, a4);
                                        aVar.copyOnWrite();
                                        C57705d dVar4 = (C57705d) aVar.instance;
                                        int i3 = a5 - 1;
                                        dVar4.f154169b = i3;
                                        dVar4.f154168a |= 1;
                                        int a6 = C57704c.m88522a(i3);
                                        if (a6 != 0 && a6 == 3) {
                                            C40463g gVar = yVar.f105306d;
                                            synchronized (gVar.f106199b) {
                                                if (!gVar.f106198a.containsKey(b)) {
                                                    gVar.f106198a.put(b, a4);
                                                }
                                            }
                                            aVar.copyOnWrite();
                                            C57705d dVar5 = (C57705d) aVar.instance;
                                            b.getClass();
                                            dVar5.f154168a |= 2;
                                            dVar5.f154170c = b;
                                        }
                                    }
                                    dVar = (C57705d) aVar.build();
                                }
                                C40358k kVar = this.f105280e;
                                int a7 = C57704c.m88522a(dVar.f154169b);
                                if (a7 == 0) {
                                    a7 = 1;
                                }
                                kVar.mo42417d("PreregisteredResources.AvailabilityCheck.Outcome", a7 - 1);
                                int i4 = dVar.f154169b;
                                lVar2.mo54525a(str2, dVar);
                            } else {
                                this.f105280e.mo42417d("PreregisteredResources.AvailabilityCheck.Outcome", 1);
                                this.f105279d.mo25782a(C66260r.LOG_TYPE_CONFIGURATION_ERROR, "A Required Resource was requested but an xUiKitResourceCache has not been provided in this client.", C21319z.f59680u, (Throwable) null);
                                C57702a aVar2 = (C57702a) C57705d.f154166d.createBuilder();
                                aVar2.copyOnWrite();
                                C57705d dVar6 = (C57705d) aVar2.instance;
                                dVar6.f154169b = 1;
                                dVar6.f154168a |= 1;
                                lVar2.mo54525a(str2, (C57705d) aVar2.build());
                            }
                        }
                        this.f105276a.mo26140c(str, ((C57714m) lVar2.build()).toByteArray());
                    } else {
                        C62940bt r23 = C62942bv.checkIsLite(C57763f.f154348b);
                        lVar.mo58887l(r23);
                        if (lVar.f169962ag.mo58857o(r23.f169971d)) {
                            this.f105277b.mo42166a(str);
                        } else if ((lVar.f154378a & 1) != 0) {
                            C21232ab abVar = this.f105276a;
                            C63070h hVar2 = lVar.f154379b;
                            if (hVar2 == null) {
                                hVar2 = C63070h.f170215c;
                            }
                            abVar.mo26140c(str, hVar2.f170218b.mo59174N());
                        }
                    }
                }
            } else if (i != 2) {
                this.f105279d.mo25782a(C66260r.LOG_TYPE_INVALID_FIELD, "Received UNKNOWN mutation type.", C21319z.f59680u, (Throwable) null);
            } else {
                this.f105276a.mo26141d(str);
            }
        }
    }
}
