package com.google.android.apps.search.assistant.platform.pcp.p9325b;

import android.database.Cursor;
import com.google.android.libraries.storage.p3315b.C42839ay;
import com.google.android.libraries.storage.p3315b.C42840az;
import com.google.android.libraries.storage.p3315b.C42844bc;
import com.google.android.libraries.storage.p3315b.C42847bf;
import com.google.assistant.p3803ag.p3809c.C48948av;
import com.google.assistant.p3803ag.p3809c.C48950ax;
import com.google.assistant.p3803ag.p3809c.C48951ay;
import com.google.assistant.p3803ag.p3809c.C48952az;
import com.google.assistant.p3803ag.p3809c.C48971br;
import com.google.assistant.p3994s.p3995a.C53306j;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.b.z */
/* compiled from: PG */
public final /* synthetic */ class C123649z implements C42844bc {

    /* renamed from: a */
    public final /* synthetic */ C123610ac f341589a;

    /* renamed from: b */
    public final /* synthetic */ C42840az f341590b;

    /* renamed from: c */
    public final /* synthetic */ C42839ay f341591c;

    /* renamed from: d */
    public final /* synthetic */ long f341592d;

    /* renamed from: e */
    public final /* synthetic */ C53306j f341593e;

    /* renamed from: f */
    public final /* synthetic */ int f341594f;

    /* renamed from: g */
    public final /* synthetic */ String f341595g;

    public /* synthetic */ C123649z(C123610ac acVar, C42840az azVar, C42839ay ayVar, long j, C53306j jVar, int i, String str) {
        this.f341589a = acVar;
        this.f341590b = azVar;
        this.f341591c = ayVar;
        this.f341592d = j;
        this.f341593e = jVar;
        this.f341594f = i;
        this.f341595g = str;
    }

    /* renamed from: a */
    public final Object mo45922a(C42847bf bfVar) {
        Throwable th;
        C48971br brVar;
        C48971br brVar2;
        C48971br brVar3;
        C48971br brVar4;
        C42847bf bfVar2 = bfVar;
        C123610ac acVar = this.f341589a;
        C42840az azVar = this.f341590b;
        C42839ay ayVar = this.f341591c;
        long j = this.f341592d;
        C53306j jVar = this.f341593e;
        int i = this.f341594f;
        String str = this.f341595g;
        bfVar2.mo45934h(azVar.mo45920a());
        Optional empty = Optional.empty();
        Optional empty2 = Optional.empty();
        Cursor d = bfVar2.mo45932d(ayVar);
        try {
            if (d.moveToNext()) {
                empty = Optional.m71637of((C48952az) C62942bv.parseFrom((C62942bv) C48952az.f126657c, d.getBlob(d.getColumnIndexOrThrow("contextual_triggering_condition")), C62921ba.m95368a()));
            }
            if (d != null) {
                d.close();
            }
            if (!empty.isPresent()) {
                C59104x d2 = C123610ac.f341528a.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "PCP.Database");
                ((C59052c) ((C59052c) d2).mo56372aa(35175)).mo56386p("Current triggering condition is not available");
                return empty2;
            } else if (empty.get() == null) {
                C59104x d3 = C123610ac.f341528a.mo56226d();
                d3.mo56378ag(C58975e.f156826a, "PCP.Database");
                ((C59052c) ((C59052c) d3).mo56372aa(35176)).mo56386p("Current triggering condition is null");
                return empty2;
            } else {
                C48952az azVar2 = (C48952az) empty.get();
                long b = acVar.f341530c.mo26870b();
                int i2 = azVar2.f126659a;
                if (i2 == 1) {
                    int i3 = ((C48971br) azVar2.f126660b).f126691a;
                    if (i3 == 2) {
                        azVar2 = C123612ae.m202970d(azVar2, j, b);
                    } else if (i3 == 1) {
                        azVar2 = C123612ae.m202969c(azVar2, j, b);
                    }
                } else if (i2 == 2) {
                    C62971cq<C48952az> cqVar = ((C48951ay) azVar2.f126660b).f126656a;
                    C48948av avVar = (C48948av) azVar2.toBuilder();
                    avVar.copyOnWrite();
                    C48952az azVar3 = (C48952az) avVar.instance;
                    if (azVar3.f126659a == 2) {
                        azVar3.f126659a = 0;
                        azVar3.f126660b = null;
                    }
                    C48950ax axVar = (C48950ax) C48951ay.f126654b.createBuilder();
                    for (C48952az azVar4 : cqVar) {
                        if (azVar4.f126659a == 1) {
                            brVar3 = (C48971br) azVar4.f126660b;
                        } else {
                            brVar3 = C48971br.f126689d;
                        }
                        if (brVar3.f126691a == 2) {
                            azVar4 = C123612ae.m202970d(azVar4, j, b);
                        } else {
                            if (azVar4.f126659a == 1) {
                                brVar4 = (C48971br) azVar4.f126660b;
                            } else {
                                brVar4 = C48971br.f126689d;
                            }
                            if (brVar4.f126691a == 1) {
                                azVar4 = C123612ae.m202969c(azVar4, j, b);
                            }
                        }
                        axVar.mo53202b(azVar4);
                    }
                    avVar.copyOnWrite();
                    C48952az azVar5 = (C48952az) avVar.instance;
                    C48951ay ayVar2 = (C48951ay) axVar.build();
                    ayVar2.getClass();
                    azVar5.f126660b = ayVar2;
                    azVar5.f126659a = 2;
                    azVar2 = (C48952az) avVar.build();
                } else if (i2 == 3) {
                    C62971cq<C48952az> cqVar2 = ((C48951ay) azVar2.f126660b).f126656a;
                    C48948av avVar2 = (C48948av) azVar2.toBuilder();
                    avVar2.copyOnWrite();
                    C48952az azVar6 = (C48952az) avVar2.instance;
                    if (azVar6.f126659a == 3) {
                        azVar6.f126659a = 0;
                        azVar6.f126660b = null;
                    }
                    C48950ax axVar2 = (C48950ax) C48951ay.f126654b.createBuilder();
                    for (C48952az azVar7 : cqVar2) {
                        if (azVar7.f126659a == 1) {
                            brVar = (C48971br) azVar7.f126660b;
                        } else {
                            brVar = C48971br.f126689d;
                        }
                        if (brVar.f126691a == 2) {
                            azVar7 = C123612ae.m202970d(azVar7, j, b);
                        } else {
                            if (azVar7.f126659a == 1) {
                                brVar2 = (C48971br) azVar7.f126660b;
                            } else {
                                brVar2 = C48971br.f126689d;
                            }
                            if (brVar2.f126691a == 1) {
                                azVar7 = C123612ae.m202969c(azVar7, j, b);
                            }
                        }
                        axVar2.mo53202b(azVar7);
                    }
                    avVar2.copyOnWrite();
                    C48952az azVar8 = (C48952az) avVar2.instance;
                    C48951ay ayVar3 = (C48951ay) axVar2.build();
                    ayVar3.getClass();
                    azVar8.f126660b = ayVar3;
                    azVar8.f126659a = 3;
                    azVar2 = (C48952az) avVar2.build();
                }
                C48952az azVar9 = azVar2;
                Optional of = Optional.m71637of(azVar9);
                bfVar2.mo45934h(C123611ad.m202958q(jVar, i, str, azVar9, acVar.f341530c.mo26870b()).mo45920a());
                return of;
            }
        } catch (Throwable th2) {
            C123633j.m203004a(th, th2);
        }
        throw th;
    }
}
