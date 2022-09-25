package com.google.android.libraries.search.assistant.performer.p2766i;

import com.google.android.gms.reminders.C145780i;
import com.google.android.gms.reminders.model.C145822ab;
import com.google.android.gms.reminders.model.C145826af;
import com.google.android.gms.reminders.model.C145828ah;
import com.google.android.gms.reminders.model.C145832d;
import com.google.android.gms.reminders.model.C145834f;
import com.google.android.gms.reminders.model.C145838j;
import com.google.android.gms.reminders.model.C145843o;
import com.google.android.gms.reminders.model.C145849u;
import com.google.android.gms.reminders.model.TaskIdEntity;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.libraries.p3339v.C43205e;
import com.google.android.libraries.search.assistant.performer.p2767j.C36180b;
import com.google.assistant.p3803ag.p3809c.C49106gr;
import com.google.assistant.p3803ag.p3809c.C49107gs;
import com.google.assistant.p3812ah.p3813a.C49163a;
import com.google.assistant.p3812ah.p3813a.C49164b;
import com.google.assistant.p3821al.p3823b.C49238e;
import com.google.assistant.p3821al.p3823b.C49239f;
import com.google.assistant.p3821al.p3823b.C49240g;
import com.google.assistant.p3821al.p3823b.C49241h;
import com.google.assistant.p3897e.p3921j.C52235kf;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52395qd;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.C52428rj;
import com.google.assistant.p3897e.p3921j.p3924c.C51732c;
import com.google.assistant.p3897e.p3921j.p3924c.C51735f;
import com.google.assistant.p3897e.p3921j.p3924c.C51736g;
import com.google.assistant.p3897e.p3921j.p3924c.C51738i;
import com.google.assistant.p3897e.p3921j.p3924c.C51739j;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.p4653i.p4654a.C61689bc;
import com.google.p4653i.p4654a.C61690bd;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C63042fg;
import com.google.protobuf.p4750c.C62950b;
import p3186j$.util.Collection;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.search.assistant.performer.i.l */
/* compiled from: PG */
public final /* synthetic */ class C36164l implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36167o f94513a;

    /* renamed from: b */
    public final /* synthetic */ C51739j f94514b;

    public /* synthetic */ C36164l(C36167o oVar, C51739j jVar) {
        this.f94513a = oVar;
        this.f94514b = jVar;
    }

    public final C60870cx apply(Object obj) {
        C146006ab abVar;
        C52395qd qdVar;
        C51738i iVar;
        C51738i iVar2;
        C51736g gVar;
        int i;
        C51735f fVar;
        C36167o oVar = this.f94513a;
        C51739j jVar = this.f94514b;
        try {
            C145780i a = oVar.f94523f.mo39979a((String) obj);
            try {
                C145822ab abVar2 = new C145822ab();
                abVar2.mo122175g(16);
                abVar2.f394341a = jVar.f135741d;
                C61689bc bcVar = (C61689bc) C61690bd.f166668a.createBuilder();
                C62940bt btVar = C49107gs.f127002h;
                C49106gr grVar = (C49106gr) C49107gs.f127001g.createBuilder();
                String str = jVar.f135742e;
                grVar.copyOnWrite();
                C49107gs gsVar = (C49107gs) grVar.instance;
                str.getClass();
                int i2 = 4;
                gsVar.f127004a |= 4;
                gsVar.f127006c = str;
                C52428rj rjVar = jVar.f135743f;
                if (rjVar == null) {
                    rjVar = C52428rj.f137558m;
                }
                grVar.copyOnWrite();
                C49107gs gsVar2 = (C49107gs) grVar.instance;
                rjVar.getClass();
                gsVar2.f127005b = rjVar;
                gsVar2.f127004a |= 1;
                int i3 = jVar.f135744g;
                grVar.copyOnWrite();
                C49107gs gsVar3 = (C49107gs) grVar.instance;
                gsVar3.f127004a |= 8;
                gsVar3.f127007d = i3;
                bcVar.mo58885m(btVar, (C49107gs) grVar.build());
                if (!jVar.f135745h.isEmpty()) {
                    C62940bt btVar2 = C49164b.f127131d;
                    C49163a aVar = (C49163a) C49164b.f127130c.createBuilder();
                    C49240g gVar2 = (C49240g) C49241h.f127300c.createBuilder();
                    String str2 = jVar.f135745h;
                    gVar2.copyOnWrite();
                    C49241h hVar = (C49241h) gVar2.instance;
                    str2.getClass();
                    hVar.f127302a |= 1;
                    hVar.f127303b = str2;
                    C49241h hVar2 = (C49241h) gVar2.build();
                    aVar.copyOnWrite();
                    C49164b bVar = (C49164b) aVar.instance;
                    hVar2.getClass();
                    bVar.f127134b = hVar2;
                    bVar.f127133a |= 1;
                    bcVar.mo58885m(btVar2, (C49164b) aVar.build());
                }
                C62940bt btVar3 = C49239f.f127296d;
                C49238e eVar = (C49238e) C49239f.f127295c.createBuilder();
                C63042fg b = C62950b.m95471b(oVar.f94522e);
                eVar.copyOnWrite();
                C49239f fVar2 = (C49239f) eVar.instance;
                b.getClass();
                fVar2.f127299b = b;
                fVar2.f127298a |= 2;
                bcVar.mo58885m(btVar3, (C49239f) eVar.build());
                abVar2.f394348h = ((C61690bd) bcVar.build()).toByteArray();
                int i4 = jVar.f135738a;
                int i5 = 0;
                if (i4 != 0) {
                    i2 = i4 != 2 ? i4 != 5 ? i4 != 10 ? 0 : 3 : 2 : 1;
                }
                int i6 = i2 - 1;
                if (i2 != 0) {
                    if (i6 == 0) {
                        abVar2.mo122174f(new TaskIdEntity(jVar.f135740c, (String) null));
                        if (jVar.f135738a == 2) {
                            qdVar = (C52395qd) jVar.f135739b;
                        } else {
                            qdVar = C52395qd.f137485e;
                        }
                        C52393qb qbVar = qdVar.f137488b;
                        if (qbVar == null) {
                            qbVar = C52393qb.f137479e;
                        }
                        C145834f fVar3 = new C145834f(C36167o.m64565b(qbVar));
                        C52403ql qlVar = qdVar.f137489c;
                        if (qlVar == null) {
                            qlVar = C52403ql.f137512f;
                        }
                        fVar3.f394370d = C36167o.m64567d(qlVar);
                        abVar2.mo122170b(fVar3.mo122198a());
                        abVar = a.mo121952b(abVar2.mo122169a());
                    } else if (i6 == 1) {
                        if (i4 == 5) {
                            iVar = (C51738i) jVar.f135739b;
                        } else {
                            iVar = C51738i.f135731c;
                        }
                        C52397qf qfVar = iVar.f135733a;
                        if (qfVar == null) {
                            qfVar = C52397qf.f137491j;
                        }
                        if (jVar.f135738a == 5) {
                            iVar2 = (C51738i) jVar.f135739b;
                        } else {
                            iVar2 = C51738i.f135731c;
                        }
                        C52403ql qlVar2 = iVar2.f135734b;
                        if (qlVar2 == null) {
                            qlVar2 = C52403ql.f137512f;
                        }
                        C145843o oVar2 = new C145843o();
                        if (qfVar.f137499g.size() > 0) {
                            oVar2.mo122217b(3);
                            C145828ah ahVar = new C145828ah();
                            for (Integer intValue : qfVar.f137499g) {
                                ahVar.mo122187b(Integer.valueOf(intValue.intValue()));
                            }
                            ahVar.f394362a = C36167o.m64566c(qfVar);
                            oVar2.f394392g = ahVar.mo122186a();
                        } else {
                            if (qfVar.f137498f.size() <= 0) {
                                if (qfVar.f137497e.size() <= 0) {
                                    if (qfVar.f137496d.size() <= 0) {
                                        throw new IllegalArgumentException("A recurrence rule must by either yearly or monthly or weekly or daily.");
                                    } else if (qfVar.f137496d.size() == 7) {
                                        oVar2.mo122217b(0);
                                    } else {
                                        oVar2.mo122217b(1);
                                        C145826af afVar = new C145826af();
                                        Stream sorted = Collection.EL.stream(qfVar.f137496d).distinct().map(C36161i.f94510a).sorted();
                                        Objects.requireNonNull(afVar);
                                        sorted.forEach(new C36162j(afVar));
                                        oVar2.f394390e = afVar.mo122182a();
                                    }
                                }
                            }
                            oVar2.mo122217b(2);
                            oVar2.f394391f = C36167o.m64566c(qfVar);
                        }
                        C145832d dVar = new C145832d();
                        dVar.mo122195b(C36167o.m64567d(qlVar2));
                        oVar2.f394389d = dVar.mo122194a();
                        C145849u uVar = new C145849u();
                        C52393qb qbVar2 = qfVar.f137501i;
                        if (qbVar2 == null) {
                            qbVar2 = C52393qb.f137479e;
                        }
                        uVar.f394397a = C36167o.m64565b(qbVar2);
                        oVar2.f394387b = uVar.mo122226a();
                        oVar2.f394386a = Integer.valueOf(qfVar.f137500h);
                        abVar = a.mo121951a(jVar.f135740c, oVar2.mo122216a(), abVar2.mo122169a());
                    } else if (i6 == 2) {
                        abVar2.mo122174f(new TaskIdEntity(jVar.f135740c, (String) null));
                        if (jVar.f135738a == 10) {
                            gVar = (C51736g) jVar.f135739b;
                        } else {
                            gVar = C51736g.f135725d;
                        }
                        C145838j jVar2 = new C145838j();
                        jVar2.f394378c = gVar.f135729c;
                        int i7 = gVar.f135727a;
                        if (i7 == 0) {
                            i5 = 3;
                        } else if (i7 == 2) {
                            i5 = 1;
                        } else if (i7 == 3) {
                            i5 = 2;
                        }
                        int i8 = i5 - 1;
                        if (i5 != 0) {
                            if (i8 == 0) {
                                if (i7 != 2 || (i = C51732c.m86371a(((Integer) gVar.f135728b).intValue())) == 0) {
                                    i = 1;
                                }
                                int i9 = i - 1;
                                if (i9 == 1) {
                                    jVar2.mo122206b(1);
                                } else if (i9 == 2) {
                                    jVar2.mo122206b(2);
                                } else {
                                    throw new IllegalArgumentException("Illegal location alias");
                                }
                            } else if (i8 == 1) {
                                if (i7 == 3) {
                                    fVar = (C51735f) gVar.f135728b;
                                } else {
                                    fVar = C51735f.f135718e;
                                }
                                jVar2.f394376a = Double.valueOf(fVar.f135720a);
                                jVar2.f394377b = Double.valueOf(fVar.f135721b);
                                jVar2.f394379d = Integer.valueOf((int) fVar.f135722c);
                                if (!fVar.f135723d.isEmpty()) {
                                    jVar2.f394381f = fVar.f135723d;
                                }
                            } else {
                                throw new IllegalArgumentException("Illegal location trigger type");
                            }
                            abVar2.mo122171c(jVar2.mo122205a());
                            abVar = a.mo121952b(abVar2.mo122169a());
                        } else {
                            throw null;
                        }
                    } else {
                        throw new IllegalArgumentException("No trigger is set.");
                    }
                    return C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(C43205e.m76192b(abVar)), new C36165m(oVar, jVar), C60826bg.f164896a), Exception.class, new C36166n(oVar), C60826bg.f164896a);
                }
                throw null;
            } catch (RuntimeException e) {
                throw new IllegalStateException("Failed to create reminder on ARP.", e);
            } catch (RuntimeException e2) {
                throw new IllegalStateException("Failed to create reminder on ARP.", e2);
            } catch (RuntimeException e3) {
                throw new IllegalStateException("Failed to create reminder on ARP.", e3);
            } catch (IllegalArgumentException unused) {
                oVar.f94521d.mo41705t("INVALID_CLIENT_OP_ARGS");
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INVALID_ARGUMENT, "Failed to create reminder on ARP due to illegal arguments."));
            } catch (IllegalStateException unused2) {
                oVar.f94521d.mo41705t("FAILED_TO_CALL_ARP_CREATION");
                return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, "Failed to create reminder on ARP due to illegal state."));
            }
        } catch (RuntimeException unused3) {
            oVar.f94521d.mo41705t("FAILED_TO_GET_ARP_INSTANCE");
            return C60856cj.m92900i(C36180b.m64579c(C52235kf.INTERNAL, "Failed to get ARP instance"));
        }
    }
}
