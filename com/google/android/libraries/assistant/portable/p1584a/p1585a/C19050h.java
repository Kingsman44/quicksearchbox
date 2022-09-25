package com.google.android.libraries.assistant.portable.p1584a.p1585a;

import android.content.Context;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11206a;
import com.google.android.libraries.assistant.assistantactions.p636e.C11271a;
import com.google.assistant.p3897e.p3917i.p3918a.C51370fe;
import com.google.assistant.p3897e.p3917i.p3918a.C51373fh;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.assistant.p3897e.p3921j.C52470sy;
import com.google.assistant.p3897e.p3921j.C52477te;
import com.google.assistant.p3897e.p3921j.C52481ti;
import com.google.assistant.p3897e.p3921j.C52487to;
import com.google.assistant.p3897e.p3921j.C52489tq;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52496tx;
import com.google.assistant.p3897e.p3921j.C52505uf;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.C52509uj;
import com.google.assistant.p3897e.p3921j.C52537vk;
import com.google.assistant.p3897e.p3921j.C52540vn;
import com.google.assistant.p3897e.p3921j.C52541vo;
import com.google.assistant.p3897e.p3921j.p3926e.C51938er;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.knowledge.p4661a.p4662a.C61745g;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.protos.p4850an.C63633q;
import com.google.protos.p4850an.C63634r;
import com.google.protos.p4850an.p4853b.C63357a;
import com.google.protos.p4850an.p4853b.C63358b;
import com.google.protos.p4850an.p4853b.C63359c;
import com.google.protos.p4850an.p4853b.C63360d;
import com.google.protos.p4850an.p4853b.C63378v;
import com.google.protos.p4850an.p4854c.C63401ab;
import com.google.protos.p4850an.p4854c.C63402ac;
import com.google.protos.p4850an.p4854c.C63407ah;
import com.google.protos.p4850an.p4854c.C63408ai;
import com.google.protos.p4850an.p4854c.C63409aj;
import com.google.protos.p4850an.p4854c.C63410ak;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TimeZone;

/* renamed from: com.google.android.libraries.assistant.portable.a.a.h */
/* compiled from: PG */
public final class C19050h {

    /* renamed from: a */
    private static final C59071e f53455a = C59071e.m91332i("com.google.android.libraries.assistant.portable.a.a.h");

    /* renamed from: a */
    public static C52091ex m36504a(Context context, C52091ex exVar, C52507uh uhVar) {
        C51370fe feVar;
        C52487to toVar;
        C52505uf ufVar;
        C52470sy syVar;
        C52477te teVar;
        C52509uj ujVar;
        C52481ti tiVar;
        C52496tx txVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        uhVar.getClass();
        for (C52490tr trVar : uhVar.f137840a) {
            if ((trVar.f137797a & 2) != 0) {
                String str = trVar.f137801e;
                C52489tq tqVar = C52489tq.EDITABLE_TEXT_CONTENT;
                C51938er erVar = C51938er.TEXT_LABEL;
                int ordinal = C52489tq.m86641a(trVar.f137798b).ordinal();
                if (ordinal == 0) {
                    if (trVar.f137798b == 3) {
                        toVar = (C52487to) trVar.f137799c;
                    } else {
                        toVar = C52487to.f137774c;
                    }
                    linkedHashMap2.put(str, C11206a.m26554a(str, C11271a.m26762f(toVar.f137777b)));
                    linkedHashMap.put(str, C11206a.m26560g(str, toVar.f137777b));
                } else if (ordinal == 7) {
                    if (trVar.f137798b == 11) {
                        ufVar = (C52505uf) trVar.f137799c;
                    } else {
                        ufVar = C52505uf.f137834c;
                    }
                    C52397qf qfVar = ufVar.f137837b;
                    if (qfVar == null) {
                        qfVar = C52397qf.f137491j;
                    }
                    linkedHashMap2.put(str, C11206a.m26554a(str, C11271a.m26761e(qfVar)));
                    linkedHashMap.put(str, C11206a.m26559f(str, qfVar));
                } else if (ordinal == 9) {
                    if (trVar.f137798b == 13) {
                        syVar = (C52470sy) trVar.f137799c;
                    } else {
                        syVar = C52470sy.f137736c;
                    }
                    linkedHashMap2.put(str, C11206a.m26554a(str, C11271a.m26762f(syVar.f137739b)));
                    linkedHashMap.put(str, C11206a.m26560g(str, syVar.f137739b));
                } else if (ordinal == 12) {
                    C63357a aVar = (C63357a) m36506c(Collections.unmodifiableList(((C63360d) C19046d.m36498d(exVar, str).instance).f171234c)).toBuilder();
                    if (trVar.f137798b == 16) {
                        teVar = (C52477te) trVar.f137799c;
                    } else {
                        teVar = C52477te.f137748h;
                    }
                    m36510g(str, exVar, aVar, teVar, linkedHashMap, linkedHashMap2);
                } else if (ordinal == 2) {
                    if (trVar.f137798b == 5) {
                        ujVar = (C52509uj) trVar.f137799c;
                    } else {
                        ujVar = C52509uj.f137841c;
                    }
                    C52403ql qlVar = ujVar.f137844b;
                    if (qlVar == null) {
                        qlVar = C52403ql.f137512f;
                    }
                    C63359c d = C19046d.m36498d(exVar, str);
                    C63358b c = m36506c(Collections.unmodifiableList(((C63360d) d.instance).f171234c));
                    d.copyOnWrite();
                    ((C63360d) d.instance).f171234c = C63360d.emptyProtobufList();
                    C63357a aVar2 = (C63357a) c.toBuilder();
                    int i = qlVar.f137515b;
                    aVar2.copyOnWrite();
                    C63358b bVar = (C63358b) aVar2.instance;
                    bVar.f171218a |= 16;
                    bVar.f171222e = i;
                    int i2 = qlVar.f137516c;
                    aVar2.copyOnWrite();
                    C63358b bVar2 = (C63358b) aVar2.instance;
                    bVar2.f171218a |= 32;
                    bVar2.f171223f = i2;
                    int i3 = qlVar.f137517d;
                    aVar2.copyOnWrite();
                    C63358b bVar3 = (C63358b) aVar2.instance;
                    bVar3.f171218a |= 64;
                    bVar3.f171224g = i3;
                    d.mo59206a(aVar2);
                    C63360d dVar = (C63360d) d.build();
                    linkedHashMap2.put(str, C11206a.m26554a(str, C11271a.m26757a(dVar)));
                    linkedHashMap.put(str, C11206a.m26557d(str, dVar));
                } else if (ordinal == 3) {
                    if (trVar.f137798b == 6) {
                        tiVar = (C52481ti) trVar.f137799c;
                    } else {
                        tiVar = C52481ti.f137762c;
                    }
                    C52393qb qbVar = tiVar.f137765b;
                    if (qbVar == null) {
                        qbVar = C52393qb.f137479e;
                    }
                    C63359c d2 = C19046d.m36498d(exVar, str);
                    C63358b c2 = m36506c(Collections.unmodifiableList(((C63360d) d2.instance).f171234c));
                    d2.copyOnWrite();
                    ((C63360d) d2.instance).f171234c = C63360d.emptyProtobufList();
                    C63357a aVar3 = (C63357a) c2.toBuilder();
                    int i4 = qbVar.f137482b;
                    aVar3.copyOnWrite();
                    C63358b bVar4 = (C63358b) aVar3.instance;
                    bVar4.f171218a |= 1;
                    bVar4.f171219b = i4;
                    int a = C63378v.m96231a(qbVar.f137483c);
                    aVar3.copyOnWrite();
                    C63358b bVar5 = (C63358b) aVar3.instance;
                    int i5 = a - 1;
                    if (a != 0) {
                        bVar5.f171220c = i5;
                        bVar5.f171218a = 2 | bVar5.f171218a;
                        int i6 = qbVar.f137484d;
                        aVar3.copyOnWrite();
                        C63358b bVar6 = (C63358b) aVar3.instance;
                        bVar6.f171218a |= 4;
                        bVar6.f171221d = i6;
                        d2.mo59206a(aVar3);
                        C63360d dVar2 = (C63360d) d2.build();
                        linkedHashMap2.put(str, C11206a.m26554a(str, C11271a.m26757a(dVar2)));
                        linkedHashMap.put(str, C11206a.m26557d(str, dVar2));
                    } else {
                        throw null;
                    }
                } else if (ordinal == 4) {
                    if (trVar.f137798b == 7) {
                        txVar = (C52496tx) trVar.f137799c;
                    } else {
                        txVar = C52496tx.f137813c;
                    }
                    C52541vo voVar = txVar.f137816b;
                    if (voVar == null) {
                        voVar = C52541vo.f137908f;
                    }
                    C63407ah e = C19046d.m36499e(exVar, str);
                    C63402ac acVar = ((C63408ai) e.instance).f171354b;
                    if (acVar == null) {
                        acVar = C63402ac.f171336b;
                    }
                    C63401ab abVar = (C63401ab) acVar.toBuilder();
                    e.copyOnWrite();
                    C63408ai aiVar = (C63408ai) e.instance;
                    aiVar.f171354b = null;
                    aiVar.f171353a &= -2;
                    abVar.copyOnWrite();
                    ((C63402ac) abVar.instance).f171338a = C63402ac.emptyProtobufList();
                    C63409aj ajVar = (C63409aj) C63410ak.f171362e.createBuilder();
                    String d3 = m36507d(context, voVar);
                    ajVar.copyOnWrite();
                    C63410ak akVar = (C63410ak) ajVar.instance;
                    d3.getClass();
                    akVar.f171364a |= 1024;
                    akVar.f171365b = d3;
                    int j = m36513j(voVar);
                    ajVar.copyOnWrite();
                    C63410ak akVar2 = (C63410ak) ajVar.instance;
                    akVar2.f171366c = j - 1;
                    akVar2.f171364a |= 2048;
                    abVar.mo59211a(ajVar);
                    e.copyOnWrite();
                    C63408ai aiVar2 = (C63408ai) e.instance;
                    C63402ac acVar2 = (C63402ac) abVar.build();
                    acVar2.getClass();
                    aiVar2.f171354b = acVar2;
                    aiVar2.f171353a |= 1;
                    C63408ai aiVar3 = (C63408ai) e.build();
                    linkedHashMap2.put(str, C11206a.m26554a(str, C11271a.m26760d(aiVar3)));
                    linkedHashMap.put(str, C11206a.m26558e(str, aiVar3));
                }
            }
        }
        C58833ax b = C19043a.m36479b(exVar);
        if (b.mo56113h()) {
            feVar = (C51370fe) ((C51373fh) b.mo56107c()).toBuilder();
        } else {
            feVar = (C51370fe) C51373fh.f133802b.createBuilder();
        }
        C19046d.m36500f(linkedHashMap2, feVar);
        C19051i.m36517b(linkedHashMap, feVar);
        return C19043a.m36478a(exVar, (C51373fh) feVar.build());
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v48, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v7, resolved type: com.google.assistant.e.j.qf} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v52, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v10, resolved type: com.google.assistant.e.j.qb} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v116, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v71, resolved type: com.google.assistant.e.j.ka} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.assistant.p3897e.p3921j.C52091ex m36505b(android.content.Context r18, com.google.assistant.p3897e.p3921j.C52091ex r19, com.google.assistant.p3897e.p3921j.p3926e.C51953ff r20, com.google.assistant.p3897e.p3921j.C52507uh r21) {
        /*
            r7 = r19
            r0 = r21
            java.util.LinkedHashMap r8 = new java.util.LinkedHashMap
            r8.<init>()
            java.util.LinkedHashMap r9 = new java.util.LinkedHashMap
            r9.<init>()
            com.google.protobuf.cq r1 = r0.f137840a
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x0501
            com.google.protos.an.b.b r1 = com.google.protos.p4850an.p4853b.C63358b.f171216l
            com.google.protobuf.bn r1 = r1.createBuilder()
            r10 = r1
            com.google.protos.an.b.a r10 = (com.google.protos.p4850an.p4853b.C63357a) r10
            java.util.TimeZone r1 = java.util.TimeZone.getDefault()
            java.lang.String r1 = r1.getID()
            r10.copyOnWrite()
            com.google.protobuf.bv r2 = r10.instance
            com.google.protos.an.b.b r2 = (com.google.protos.p4850an.p4853b.C63358b) r2
            r1.getClass()
            int r3 = r2.f171218a
            r3 = r3 | 512(0x200, float:7.175E-43)
            r2.f171218a = r3
            r2.f171225h = r1
            com.google.protobuf.cq r0 = r0.f137840a
            r11 = 0
            java.lang.Object r0 = r0.get(r11)
            r12 = r0
            com.google.assistant.e.j.tr r12 = (com.google.assistant.p3897e.p3921j.C52490tr) r12
            r0 = r20
            com.google.protobuf.cq r0 = r0.f136319c
            java.util.Iterator r13 = r0.iterator()
        L_0x004b:
            boolean r0 = r13.hasNext()
            r14 = 16
            if (r0 == 0) goto L_0x04ad
            java.lang.Object r0 = r13.next()
            com.google.assistant.e.j.e.fa r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r0
            com.google.protobuf.cq r0 = r0.f136299d
            java.util.Iterator r15 = r0.iterator()
        L_0x005f:
            boolean r0 = r15.hasNext()
            if (r0 == 0) goto L_0x004b
            java.lang.Object r0 = r15.next()
            com.google.assistant.e.j.e.ew r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r0
            com.google.protobuf.cq r0 = r0.f136288b
            java.util.Iterator r16 = r0.iterator()
        L_0x0071:
            boolean r0 = r16.hasNext()
            if (r0 == 0) goto L_0x005f
            java.lang.Object r0 = r16.next()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            int r1 = r0.f136273a
            r1 = r1 & r14
            if (r1 == 0) goto L_0x0071
            java.lang.String r1 = r0.f136280h
            com.google.assistant.e.j.tq r2 = com.google.assistant.p3897e.p3921j.C52489tq.EDITABLE_TEXT_CONTENT
            com.google.assistant.e.j.e.er r2 = com.google.assistant.p3897e.p3921j.p3926e.C51938er.TEXT_LABEL
            int r2 = r0.f136277e
            com.google.assistant.e.j.e.er r2 = com.google.assistant.p3897e.p3921j.p3926e.C51938er.m86437a(r2)
            int r2 = r2.ordinal()
            r3 = 1
            r4 = 4
            if (r2 == r3) goto L_0x0475
            r5 = 9
            r6 = 6
            if (r2 == r6) goto L_0x03fc
            r11 = 14
            if (r2 == r11) goto L_0x035e
            r11 = 24
            r14 = 3
            if (r2 == r11) goto L_0x0228
            if (r2 == r14) goto L_0x019e
            if (r2 == r4) goto L_0x016f
            if (r2 == r5) goto L_0x012c
            r3 = 10
            if (r2 == r3) goto L_0x00b2
        L_0x00ae:
            r11 = 0
            r14 = 16
            goto L_0x0071
        L_0x00b2:
            com.google.assistant.e.j.qb r2 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
            int r3 = r0.f136277e
            r4 = 12
            if (r3 != r4) goto L_0x00bf
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.bw r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50978bw) r0
            goto L_0x00c1
        L_0x00bf:
            com.google.assistant.e.c.c.bw r0 = com.google.assistant.p3897e.p3902c.p3907c.C50978bw.f132713e
        L_0x00c1:
            com.google.protobuf.cq r0 = r0.f132717c
            java.util.Iterator r0 = r0.iterator()
        L_0x00c7:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x00dd
            java.lang.Object r3 = r0.next()
            com.google.assistant.e.c.c.bu r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50976bu) r3
            boolean r4 = r3.f132708d
            if (r4 == 0) goto L_0x00c7
            com.google.assistant.e.j.qb r2 = r3.f132707c
            if (r2 != 0) goto L_0x00dd
            com.google.assistant.e.j.qb r2 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
        L_0x00dd:
            com.google.assistant.e.j.qb r0 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00ae
            com.google.protos.an.b.c r0 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36498d(r7, r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.protos.an.b.d r3 = (com.google.protos.p4850an.p4853b.C63360d) r3
            com.google.protos.an.b.d r4 = com.google.protos.p4850an.p4853b.C63360d.f171230f
            com.google.protobuf.cq r4 = com.google.protos.p4850an.p4853b.C63360d.emptyProtobufList()
            r3.f171233b = r4
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.protos.an.b.d r3 = (com.google.protos.p4850an.p4853b.C63360d) r3
            com.google.protobuf.cq r4 = com.google.protos.p4850an.p4853b.C63360d.emptyProtobufList()
            r3.f171234c = r4
            m36514k(r10, r2)
            r0.mo59206a(r10)
            com.google.protobuf.bv r0 = r0.build()
            com.google.protos.an.b.d r0 = (com.google.protos.p4850an.p4853b.C63360d) r0
            com.google.knowledge.a.a.j r2 = com.google.android.libraries.assistant.assistantactions.p636e.C11271a.m26757a(r0)
            com.google.knowledge.a.a.h r2 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11206a.m26554a(r1, r2)
            r9.put(r1, r2)
            java.lang.String r2 = r12.f137801e
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x00ae
            com.google.protos.an.r r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11206a.m26557d(r1, r0)
            r8.put(r1, r0)
            goto L_0x00ae
        L_0x012c:
            com.google.assistant.e.j.vo r2 = com.google.assistant.p3897e.p3921j.C52541vo.f137908f
            int r3 = r0.f136277e
            r4 = 11
            if (r3 != r4) goto L_0x0139
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.ea r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51037ea) r0
            goto L_0x013b
        L_0x0139:
            com.google.assistant.e.c.c.ea r0 = com.google.assistant.p3897e.p3902c.p3907c.C51037ea.f132889e
        L_0x013b:
            com.google.protobuf.cq r0 = r0.f132893c
            java.util.Iterator r0 = r0.iterator()
        L_0x0141:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0159
            java.lang.Object r3 = r0.next()
            com.google.assistant.e.c.c.dy r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51034dy) r3
            boolean r4 = r3.f132882c
            if (r4 == 0) goto L_0x0141
            com.google.assistant.e.j.vo r0 = r3.f132883d
            if (r0 != 0) goto L_0x0157
            com.google.assistant.e.j.vo r0 = com.google.assistant.p3897e.p3921j.C52541vo.f137908f
        L_0x0157:
            r3 = r0
            goto L_0x015a
        L_0x0159:
            r3 = r2
        L_0x015a:
            com.google.assistant.e.j.vo r0 = com.google.assistant.p3897e.p3921j.C52541vo.f137908f
            boolean r0 = com.google.common.base.C58832aw.m90831a(r3, r0)
            if (r0 != 0) goto L_0x00ae
            r0 = r1
            r1 = r18
            r2 = r19
            r4 = r12
            r5 = r8
            r6 = r9
            m36511h(r0, r1, r2, r3, r4, r5, r6)
            goto L_0x00ae
        L_0x016f:
            int r2 = r0.f136277e
            r3 = 7
            if (r2 != r3) goto L_0x0179
            java.lang.Object r2 = r0.f136278f
            com.google.assistant.e.c.c.hh r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r2
            goto L_0x017b
        L_0x0179:
            com.google.assistant.e.c.c.hh r2 = com.google.assistant.p3897e.p3902c.p3907c.C51125hh.f133077g
        L_0x017b:
            int r2 = r2.f133079a
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0197
            int r2 = r0.f136277e
            if (r2 != r3) goto L_0x018a
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.hh r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r0
            goto L_0x018c
        L_0x018a:
            com.google.assistant.e.c.c.hh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51125hh.f133077g
        L_0x018c:
            com.google.assistant.e.j.qf r0 = r0.f133081c
            if (r0 != 0) goto L_0x0192
            com.google.assistant.e.j.qf r0 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x0192:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0199
        L_0x0197:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x0199:
            m36508e(r0, r1, r12, r8, r9)
            goto L_0x00ae
        L_0x019e:
            int r2 = r0.f136277e
            if (r2 != r6) goto L_0x01a7
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.du r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r0
            goto L_0x01a9
        L_0x01a7:
            com.google.assistant.e.c.c.du r0 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x01a9:
            com.google.protobuf.cq r0 = r0.f132875f
            j$.util.stream.Stream r0 = p3186j$.util.Collection.EL.stream(r0)
            com.google.android.libraries.assistant.portable.a.a.f r2 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19048f.f53453a
            j$.util.stream.Stream r0 = r0.filter(r2)
            j$.util.Optional r0 = r0.findFirst()
            boolean r2 = r0.isPresent()
            if (r2 == 0) goto L_0x00ae
            java.lang.Object r0 = r0.get()
            com.google.assistant.e.c.c.dr r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r0
            int r2 = r0.f132857d
            if (r2 != r4) goto L_0x01ce
            java.lang.Object r0 = r0.f132858e
            com.google.assistant.e.c.c.dg r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51016dg) r0
            goto L_0x01d0
        L_0x01ce:
            com.google.assistant.e.c.c.dg r0 = com.google.assistant.p3897e.p3902c.p3907c.C51016dg.f132827g
        L_0x01d0:
            com.google.assistant.e.j.du r0 = r0.f132833e
            if (r0 != 0) goto L_0x01d6
            com.google.assistant.e.j.du r0 = com.google.assistant.p3897e.p3921j.C51805du.f135924e
        L_0x01d6:
            com.google.protobuf.dn r2 = r0.f135929d
            java.lang.String r4 = "location_selection"
            boolean r2 = r2.containsKey(r4)
            if (r2 == 0) goto L_0x00ae
            com.google.assistant.e.j.ka r2 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d
            com.google.protobuf.dn r0 = r0.f135929d
            boolean r5 = r0.containsKey(r4)
            if (r5 == 0) goto L_0x01f1
            java.lang.Object r0 = r0.get(r4)
            r2 = r0
            com.google.assistant.e.j.ka r2 = (com.google.assistant.p3897e.p3921j.C52230ka) r2
        L_0x01f1:
            com.google.protobuf.z r0 = r2.f137061c     // Catch:{ ct -> 0x0218 }
            com.google.protobuf.ba r2 = com.google.protobuf.C62921ba.m95368a()     // Catch:{ ct -> 0x0218 }
            com.google.assistant.e.j.tx r4 = com.google.assistant.p3897e.p3921j.C52496tx.f137813c     // Catch:{ ct -> 0x0218 }
            com.google.protobuf.bv r0 = com.google.protobuf.C62942bv.parseFrom((com.google.protobuf.C62942bv) r4, (com.google.protobuf.C63088z) r0, (com.google.protobuf.C62921ba) r2)     // Catch:{ ct -> 0x0218 }
            com.google.assistant.e.j.tx r0 = (com.google.assistant.p3897e.p3921j.C52496tx) r0     // Catch:{ ct -> 0x0218 }
            int r2 = r0.f137815a     // Catch:{ ct -> 0x0218 }
            r2 = r2 & r3
            if (r2 == 0) goto L_0x00ae
            com.google.assistant.e.j.vo r0 = r0.f137816b     // Catch:{ ct -> 0x0218 }
            if (r0 != 0) goto L_0x020a
            com.google.assistant.e.j.vo r0 = com.google.assistant.p3897e.p3921j.C52541vo.f137908f     // Catch:{ ct -> 0x0218 }
        L_0x020a:
            r3 = r0
            r0 = r1
            r1 = r18
            r2 = r19
            r4 = r12
            r5 = r8
            r6 = r9
            m36511h(r0, r1, r2, r3, r4, r5, r6)     // Catch:{ ct -> 0x0218 }
            goto L_0x00ae
        L_0x0218:
            com.google.common.f.e r0 = f53455a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "updateFormFieldsDialogState: Could not extract location selection from ClientInput param."
            r2 = 47539(0xb9b3, float:6.6616E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            goto L_0x00ae
        L_0x0228:
            com.google.assistant.e.j.ql r2 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
            com.google.assistant.e.j.qb r5 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
            com.google.assistant.e.j.qf r11 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            int r3 = r0.f136277e
            r6 = 33
            if (r3 != r6) goto L_0x0239
            java.lang.Object r3 = r0.f136278f
            com.google.assistant.e.c.c.bd r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r3
            goto L_0x023b
        L_0x0239:
            com.google.assistant.e.c.c.bd r3 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x023b:
            com.google.protobuf.cq r3 = r3.f132660b
            java.util.Iterator r3 = r3.iterator()
        L_0x0241:
            boolean r17 = r3.hasNext()
            if (r17 == 0) goto L_0x02cb
            java.lang.Object r17 = r3.next()
            r6 = r17
            com.google.assistant.e.c.c.az r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r6
            int r14 = r6.f132649i
            com.google.assistant.e.c.c.aw r14 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r14)
            if (r14 != 0) goto L_0x0259
            com.google.assistant.e.c.c.aw r14 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x0259:
            com.google.assistant.e.c.c.aw r4 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.HIGHLIGHT
            if (r14 == r4) goto L_0x0271
            int r4 = r6.f132649i
            com.google.assistant.e.c.c.aw r4 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r4)
            if (r4 != 0) goto L_0x0267
            com.google.assistant.e.c.c.aw r4 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x0267:
            com.google.assistant.e.c.c.aw r14 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.ERROR
            if (r4 != r14) goto L_0x026c
            goto L_0x0271
        L_0x026c:
            r4 = 4
            r6 = 33
            r14 = 3
            goto L_0x0241
        L_0x0271:
            int r3 = r6.f132642b
            r4 = 4
            if (r3 != r4) goto L_0x027d
            java.lang.Object r2 = r6.f132643c
            com.google.assistant.e.j.ql r2 = (com.google.assistant.p3897e.p3921j.C52403ql) r2
            m36515l(r10, r2)
        L_0x027d:
            int r3 = r6.f132642b
            r4 = 3
            if (r3 != r4) goto L_0x028a
            java.lang.Object r3 = r6.f132643c
            r5 = r3
            com.google.assistant.e.j.qb r5 = (com.google.assistant.p3897e.p3921j.C52393qb) r5
            m36514k(r10, r5)
        L_0x028a:
            int r3 = r6.f132642b
            r4 = 5
            if (r3 != r4) goto L_0x02c1
            java.lang.Object r2 = r6.f132643c
            com.google.assistant.e.j.qd r2 = (com.google.assistant.p3897e.p3921j.C52395qd) r2
            com.google.assistant.e.j.ql r3 = r2.f137489c
            if (r3 != 0) goto L_0x0299
            com.google.assistant.e.j.ql r3 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x0299:
            com.google.assistant.e.j.qb r4 = r2.f137488b
            if (r4 != 0) goto L_0x029f
            com.google.assistant.e.j.qb r4 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
        L_0x029f:
            com.google.assistant.e.j.qn r2 = r2.f137490d
            if (r2 != 0) goto L_0x02a5
            com.google.assistant.e.j.qn r2 = com.google.assistant.p3897e.p3921j.C52405qn.f137519c
        L_0x02a5:
            java.lang.String r2 = r2.f137522b
            r10.copyOnWrite()
            com.google.protobuf.bv r5 = r10.instance
            com.google.protos.an.b.b r5 = (com.google.protos.p4850an.p4853b.C63358b) r5
            r2.getClass()
            int r14 = r5.f171218a
            r14 = r14 | 512(0x200, float:7.175E-43)
            r5.f171218a = r14
            r5.f171225h = r2
            m36515l(r10, r3)
            m36514k(r10, r4)
            r2 = r3
            r5 = r4
        L_0x02c1:
            int r3 = r6.f132642b
            r4 = 6
            if (r3 != r4) goto L_0x02cb
            java.lang.Object r3 = r6.f132643c
            r11 = r3
            com.google.assistant.e.j.qf r11 = (com.google.assistant.p3897e.p3921j.C52397qf) r11
        L_0x02cb:
            int r3 = r0.f136277e
            r4 = 33
            if (r3 != r4) goto L_0x02d6
            java.lang.Object r3 = r0.f136278f
            com.google.assistant.e.c.c.bd r3 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r3
            goto L_0x02d8
        L_0x02d6:
            com.google.assistant.e.c.c.bd r3 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x02d8:
            com.google.protobuf.cq r3 = r3.f132660b
            j$.util.stream.Stream r3 = p3186j$.util.Collection.EL.stream(r3)
            com.google.android.libraries.assistant.portable.a.a.g r4 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19049g.f53454a
            boolean r3 = r3.anyMatch(r4)
            if (r3 == 0) goto L_0x033d
            java.lang.String r3 = r12.f137801e
            boolean r3 = r3.equals(r1)
            if (r3 == 0) goto L_0x0327
            int r3 = r12.f137798b
            r4 = 16
            if (r3 != r4) goto L_0x0327
            java.lang.Object r3 = r12.f137799c
            com.google.assistant.e.j.te r3 = (com.google.assistant.p3897e.p3921j.C52477te) r3
            boolean r4 = r3.f137754e
            if (r4 == 0) goto L_0x0327
            int r4 = r0.f136277e
            r6 = 33
            if (r4 != r6) goto L_0x0307
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.bd r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50959bd) r0
            goto L_0x0309
        L_0x0307:
            com.google.assistant.e.c.c.bd r0 = com.google.assistant.p3897e.p3902c.p3907c.C50959bd.f132657e
        L_0x0309:
            long r3 = r3.f137753d
            com.google.protobuf.cq r0 = r0.f132660b
            int r3 = com.google.common.p4575r.C60757n.m92748i(r3)
            java.lang.Object r0 = r0.get(r3)
            com.google.assistant.e.c.c.az r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50954az) r0
            int r0 = r0.f132649i
            com.google.assistant.e.c.c.aw r0 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.m85988a(r0)
            if (r0 != 0) goto L_0x0321
            com.google.assistant.e.c.c.aw r0 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
        L_0x0321:
            com.google.assistant.e.c.c.aw r3 = com.google.assistant.p3897e.p3902c.p3907c.C50951aw.DEFAULT_STATUS
            if (r0 != r3) goto L_0x0327
            r3 = 1
            goto L_0x0328
        L_0x0327:
            r3 = 0
        L_0x0328:
            com.google.assistant.e.j.qf r0 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
            boolean r0 = r0.equals(r11)
            if (r0 != 0) goto L_0x0338
            if (r3 == 0) goto L_0x0333
            goto L_0x0338
        L_0x0333:
            com.google.common.base.ax r0 = com.google.common.base.C58833ax.m90834k(r11)
            goto L_0x033a
        L_0x0338:
            com.google.common.base.b r0 = com.google.common.base.C58836b.f156633a
        L_0x033a:
            m36508e(r0, r1, r12, r8, r9)
        L_0x033d:
            com.google.assistant.e.j.ql r0 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x034d
            com.google.assistant.e.j.qb r0 = com.google.assistant.p3897e.p3921j.C52393qb.f137479e
            boolean r0 = r0.equals(r5)
            if (r0 != 0) goto L_0x00ae
        L_0x034d:
            java.lang.String r0 = r12.f137801e
            boolean r3 = r0.equals(r1)
            r0 = r1
            r1 = r19
            r2 = r10
            r4 = r8
            r5 = r9
            m36509f(r0, r1, r2, r3, r4, r5)
            goto L_0x00ae
        L_0x035e:
            int r2 = r0.f136277e
            r3 = 21
            if (r2 != r3) goto L_0x0369
            java.lang.Object r2 = r0.f136278f
            com.google.assistant.e.c.c.ck r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50993ck) r2
            goto L_0x036b
        L_0x0369:
            com.google.assistant.e.c.c.ck r2 = com.google.assistant.p3897e.p3902c.p3907c.C50993ck.f132751e
        L_0x036b:
            int r2 = r2.f132753a
            r2 = r2 & 2
            if (r2 == 0) goto L_0x00ae
            int r2 = r0.f136277e
            if (r2 != r3) goto L_0x037a
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.ck r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50993ck) r0
            goto L_0x037c
        L_0x037a:
            com.google.assistant.e.c.c.ck r0 = com.google.assistant.p3897e.p3902c.p3907c.C50993ck.f132751e
        L_0x037c:
            com.google.assistant.e.c.c.ci r0 = r0.f132756d
            if (r0 != 0) goto L_0x0382
            com.google.assistant.e.c.c.ci r0 = com.google.assistant.p3897e.p3902c.p3907c.C50991ci.f132741h
        L_0x0382:
            com.google.protos.an.b.k r2 = com.google.protos.p4850an.p4853b.C63367k.f171252c
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.protos.an.b.j r2 = (com.google.protos.p4850an.p4853b.C63366j) r2
            com.google.protos.an.b.x r3 = com.google.protos.p4850an.p4853b.C63380x.f171276d
            com.google.protobuf.bn r3 = r3.createBuilder()
            com.google.protos.an.b.w r3 = (com.google.protos.p4850an.p4853b.C63379w) r3
            com.google.assistant.e.j.so r0 = r0.f132749g
            if (r0 != 0) goto L_0x0398
            com.google.assistant.e.j.so r0 = com.google.assistant.p3897e.p3921j.C52460so.f137714d
        L_0x0398:
            long r4 = r0.f137717b
            r3.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.protos.an.b.x r0 = (com.google.protos.p4850an.p4853b.C63380x) r0
            int r6 = r0.f171278a
            r11 = 1
            r6 = r6 | r11
            r0.f171278a = r6
            double r4 = (double) r4
            r0.f171279b = r4
            r3.copyOnWrite()
            com.google.protobuf.bv r0 = r3.instance
            com.google.protos.an.b.x r0 = (com.google.protos.p4850an.p4853b.C63380x) r0
            r4 = 4
            r0.f171280c = r4
            int r4 = r0.f171278a
            r4 = r4 | 2
            r0.f171278a = r4
            com.google.protobuf.bv r0 = r3.build()
            com.google.protos.an.b.x r0 = (com.google.protos.p4850an.p4853b.C63380x) r0
            r2.copyOnWrite()
            com.google.protobuf.bv r3 = r2.instance
            com.google.protos.an.b.k r3 = (com.google.protos.p4850an.p4853b.C63367k) r3
            r0.getClass()
            r3.f171255b = r0
            int r0 = r3.f171254a
            r4 = 1
            r0 = r0 | r4
            r3.f171254a = r0
            com.google.protobuf.bv r0 = r2.build()
            com.google.protos.an.b.k r0 = (com.google.protos.p4850an.p4853b.C63367k) r0
            com.google.knowledge.a.a.j r2 = com.google.android.libraries.assistant.assistantactions.p636e.C11271a.m26759c(r0)
            com.google.knowledge.a.a.h r2 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11206a.m26554a(r1, r2)
            r9.put(r1, r2)
            java.lang.String r2 = r12.f137801e
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x00ae
            com.google.knowledge.a.a.j r0 = com.google.android.libraries.assistant.assistantactions.p636e.C11271a.m26759c(r0)
            com.google.protos.an.at r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11206a.m26561h(r0)
            com.google.protos.an.r r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11206a.m26555b(r1, r0)
            r8.put(r1, r0)
            goto L_0x00ae
        L_0x03fc:
            com.google.assistant.e.j.ql r2 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
            int r3 = r0.f136277e
            if (r3 != r5) goto L_0x0407
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.id r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r0
            goto L_0x0409
        L_0x0407:
            com.google.assistant.e.c.c.id r0 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.f133140f
        L_0x0409:
            com.google.protobuf.cq r0 = r0.f133146e
            java.util.Iterator r0 = r0.iterator()
        L_0x040f:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0425
            java.lang.Object r3 = r0.next()
            com.google.assistant.e.c.c.ib r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51146ib) r3
            boolean r4 = r3.f133135d
            if (r4 == 0) goto L_0x040f
            com.google.assistant.e.j.ql r2 = r3.f133134c
            if (r2 != 0) goto L_0x0425
            com.google.assistant.e.j.ql r2 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x0425:
            com.google.assistant.e.j.ql r0 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
            boolean r0 = r0.equals(r2)
            if (r0 != 0) goto L_0x00ae
            com.google.protos.an.b.c r0 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36498d(r7, r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.protos.an.b.d r3 = (com.google.protos.p4850an.p4853b.C63360d) r3
            com.google.protos.an.b.d r4 = com.google.protos.p4850an.p4853b.C63360d.f171230f
            com.google.protobuf.cq r4 = com.google.protos.p4850an.p4853b.C63360d.emptyProtobufList()
            r3.f171233b = r4
            r0.copyOnWrite()
            com.google.protobuf.bv r3 = r0.instance
            com.google.protos.an.b.d r3 = (com.google.protos.p4850an.p4853b.C63360d) r3
            com.google.protobuf.cq r4 = com.google.protos.p4850an.p4853b.C63360d.emptyProtobufList()
            r3.f171234c = r4
            m36515l(r10, r2)
            r0.mo59206a(r10)
            com.google.protobuf.bv r0 = r0.build()
            com.google.protos.an.b.d r0 = (com.google.protos.p4850an.p4853b.C63360d) r0
            com.google.knowledge.a.a.j r2 = com.google.android.libraries.assistant.assistantactions.p636e.C11271a.m26757a(r0)
            com.google.knowledge.a.a.h r2 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11206a.m26554a(r1, r2)
            r9.put(r1, r2)
            java.lang.String r2 = r12.f137801e
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x00ae
            com.google.protos.an.r r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11206a.m26557d(r1, r0)
            r8.put(r1, r0)
            goto L_0x00ae
        L_0x0475:
            int r2 = r0.f136277e
            r3 = 4
            if (r2 != r3) goto L_0x047f
            java.lang.Object r2 = r0.f136278f
            com.google.assistant.e.c.c.co r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r2
            goto L_0x0481
        L_0x047f:
            com.google.assistant.e.c.c.co r2 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x0481:
            java.lang.String r2 = r2.f132764d
            com.google.knowledge.a.a.j r2 = com.google.android.libraries.assistant.assistantactions.p636e.C11271a.m26762f(r2)
            com.google.knowledge.a.a.h r2 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11206a.m26554a(r1, r2)
            r9.put(r1, r2)
            java.lang.String r2 = r12.f137801e
            boolean r2 = r2.equals(r1)
            if (r2 == 0) goto L_0x00ae
            int r2 = r0.f136277e
            r3 = 4
            if (r2 != r3) goto L_0x04a0
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.co r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r0
            goto L_0x04a2
        L_0x04a0:
            com.google.assistant.e.c.c.co r0 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x04a2:
            java.lang.String r0 = r0.f132764d
            com.google.protos.an.r r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11206a.m26560g(r1, r0)
            r8.put(r1, r0)
            goto L_0x00ae
        L_0x04ad:
            boolean r0 = r12.f137802f
            if (r0 == 0) goto L_0x04d8
            int r0 = r12.f137798b
            r1 = 16
            if (r0 != r1) goto L_0x04bc
            java.lang.Object r0 = r12.f137799c
            com.google.assistant.e.j.te r0 = (com.google.assistant.p3897e.p3921j.C52477te) r0
            goto L_0x04be
        L_0x04bc:
            com.google.assistant.e.j.te r0 = com.google.assistant.p3897e.p3921j.C52477te.f137748h
        L_0x04be:
            boolean r0 = r0.f137754e
            if (r0 == 0) goto L_0x04d8
            java.lang.String r0 = r12.f137801e
            int r2 = r12.f137798b
            if (r2 != r1) goto L_0x04cd
            java.lang.Object r1 = r12.f137799c
            com.google.assistant.e.j.te r1 = (com.google.assistant.p3897e.p3921j.C52477te) r1
            goto L_0x04cf
        L_0x04cd:
            com.google.assistant.e.j.te r1 = com.google.assistant.p3897e.p3921j.C52477te.f137748h
        L_0x04cf:
            r3 = r1
            r1 = r19
            r2 = r10
            r4 = r8
            r5 = r9
            m36510g(r0, r1, r2, r3, r4, r5)
        L_0x04d8:
            com.google.common.base.ax r0 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19043a.m36479b(r19)
            com.google.android.libraries.assistant.portable.a.a.e r1 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19047e.f53452a
            com.google.common.base.ax r0 = r0.mo56106b(r1)
            com.google.assistant.e.i.a.fh r1 = com.google.assistant.p3897e.p3917i.p3918a.C51373fh.f133802b
            com.google.protobuf.bn r1 = r1.createBuilder()
            com.google.assistant.e.i.a.fe r1 = (com.google.assistant.p3897e.p3917i.p3918a.C51370fe) r1
            java.lang.Object r0 = r0.mo56109e(r1)
            com.google.assistant.e.i.a.fe r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51370fe) r0
            com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36500f(r9, r0)
            com.google.android.libraries.assistant.portable.p1584a.p1585a.C19051i.m36517b(r8, r0)
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.i.a.fh r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51373fh) r0
            com.google.assistant.e.j.ex r0 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19043a.m36478a(r7, r0)
            return r0
        L_0x0501:
            com.google.common.f.e r0 = f53455a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "showNativeFormContent is empty."
            r2 = 47535(0xb9af, float:6.6611E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.portable.p1584a.p1585a.C19050h.m36505b(android.content.Context, com.google.assistant.e.j.ex, com.google.assistant.e.j.e.ff, com.google.assistant.e.j.uh):com.google.assistant.e.j.ex");
    }

    /* renamed from: c */
    private static C63358b m36506c(List list) {
        C63358b bVar = (C63358b) C58557jl.m90130k(list, C63358b.f171216l);
        if ((bVar.f171218a & 512) != 0) {
            return bVar;
        }
        C63357a aVar = (C63357a) bVar.toBuilder();
        String id = TimeZone.getDefault().getID();
        aVar.copyOnWrite();
        C63358b bVar2 = (C63358b) aVar.instance;
        id.getClass();
        bVar2.f171218a |= 512;
        bVar2.f171225h = id;
        return (C63358b) aVar.build();
    }

    /* renamed from: d */
    private static final String m36507d(Context context, C52541vo voVar) {
        C52489tq tqVar = C52489tq.EDITABLE_TEXT_CONTENT;
        C51938er erVar = C51938er.TEXT_LABEL;
        int a = C52540vn.m86645a(voVar.f137914e);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i != 1) {
            if (i == 2) {
                return context.getResources().getString(R.string.assistantactions_home_label_text);
            }
            if (i == 3) {
                return context.getResources().getString(R.string.assistantactions_work_label_text);
            }
            ((C59052c) ((C59052c) f53455a.mo56225c()).mo56372aa(47537)).mo56386p("getTextFromMapsLocation: undefined LocationType.");
            return BuildConfig.FLAVOR;
        } else if (!voVar.equals(C52541vo.f137908f)) {
            C52537vk vkVar = voVar.f137912c;
            if (vkVar == null) {
                vkVar = C52537vk.f137903c;
            }
            return vkVar.f137906b + " " + voVar.f137911b;
        } else {
            ((C59052c) ((C59052c) f53455a.mo56225c()).mo56372aa(47538)).mo56386p("getTextFromMapsLocation: Empty location is selected in location picker, which should not happen.");
            return BuildConfig.FLAVOR;
        }
    }

    /* renamed from: e */
    private static void m36508e(C58833ax axVar, String str, C52490tr trVar, Map map, Map map2) {
        if (axVar.mo56113h()) {
            m36512i(str, (C52397qf) axVar.mo56107c(), trVar.f137801e.equals(str), map, map2);
            return;
        }
        C61745g gVar = (C61745g) C61746h.f166791g.createBuilder();
        gVar.copyOnWrite();
        C61746h hVar = (C61746h) gVar.instance;
        str.getClass();
        hVar.f166793a |= 2;
        hVar.f166796d = str;
        map2.put(str, (C61746h) gVar.build());
        if (trVar.f137801e.equals(str)) {
            C63633q qVar = (C63633q) C63634r.f172096f.createBuilder();
            qVar.copyOnWrite();
            C63634r rVar = (C63634r) qVar.instance;
            str.getClass();
            rVar.f172098a |= 1;
            rVar.f172101d = str;
            map.put(str, (C63634r) qVar.build());
        }
    }

    /* renamed from: f */
    private static void m36509f(String str, C52091ex exVar, C63357a aVar, boolean z, Map map, Map map2) {
        C63359c d = C19046d.m36498d(exVar, str);
        d.copyOnWrite();
        C63360d dVar = C63360d.f171230f;
        ((C63360d) d.instance).f171233b = C63360d.emptyProtobufList();
        d.copyOnWrite();
        ((C63360d) d.instance).f171234c = C63360d.emptyProtobufList();
        d.mo59206a(aVar);
        C63360d dVar2 = (C63360d) d.build();
        map2.put(str, C11206a.m26554a(str, C11271a.m26757a(dVar2)));
        if (z) {
            map.put(str, C11206a.m26557d(str, dVar2));
        }
    }

    /* renamed from: g */
    private static void m36510g(String str, C52091ex exVar, C63357a aVar, C52477te teVar, Map map, Map map2) {
        if (teVar.f137751b == 4) {
            m36514k(aVar, (C52393qb) teVar.f137752c);
            m36509f(str, exVar, aVar, true, map, map2);
        }
        if (teVar.f137751b == 5) {
            m36515l(aVar, (C52403ql) teVar.f137752c);
            m36509f(str, exVar, aVar, true, map, map2);
        }
        if (teVar.f137751b == 6) {
            m36512i(str, (C52397qf) teVar.f137752c, true, map, map2);
        }
    }

    /* renamed from: h */
    private static void m36511h(String str, Context context, C52091ex exVar, C52541vo voVar, C52490tr trVar, Map map, Map map2) {
        C63407ah e = C19046d.m36499e(exVar, str);
        C63402ac acVar = ((C63408ai) e.instance).f171354b;
        if (acVar == null) {
            acVar = C63402ac.f171336b;
        }
        C63401ab abVar = (C63401ab) acVar.toBuilder();
        String d = m36507d(context, voVar);
        e.copyOnWrite();
        C63408ai aiVar = (C63408ai) e.instance;
        d.getClass();
        aiVar.f171353a |= 16;
        aiVar.f171356d = d;
        e.copyOnWrite();
        C63408ai aiVar2 = (C63408ai) e.instance;
        aiVar2.f171354b = null;
        aiVar2.f171353a &= -2;
        abVar.copyOnWrite();
        ((C63402ac) abVar.instance).f171338a = C63402ac.emptyProtobufList();
        C63409aj ajVar = (C63409aj) C63410ak.f171362e.createBuilder();
        String d2 = m36507d(context, voVar);
        ajVar.copyOnWrite();
        C63410ak akVar = (C63410ak) ajVar.instance;
        d2.getClass();
        akVar.f171364a |= 1024;
        akVar.f171365b = d2;
        int j = m36513j(voVar);
        ajVar.copyOnWrite();
        C63410ak akVar2 = (C63410ak) ajVar.instance;
        akVar2.f171366c = j - 1;
        akVar2.f171364a |= 2048;
        abVar.mo59211a(ajVar);
        e.copyOnWrite();
        C63408ai aiVar3 = (C63408ai) e.instance;
        C63402ac acVar2 = (C63402ac) abVar.build();
        acVar2.getClass();
        aiVar3.f171354b = acVar2;
        aiVar3.f171353a |= 1;
        C63408ai aiVar4 = (C63408ai) e.build();
        map2.put(str, C11206a.m26554a(str, C11271a.m26760d(aiVar4)));
        if (trVar.f137801e.equals(str)) {
            map.put(str, C11206a.m26558e(str, aiVar4));
        }
    }

    /* renamed from: i */
    private static void m36512i(String str, C52397qf qfVar, boolean z, Map map, Map map2) {
        map2.put(str, C11206a.m26554a(str, C11271a.m26761e(qfVar)));
        if (z) {
            map.put(str, C11206a.m26559f(str, qfVar));
        }
    }

    /* renamed from: j */
    private static final int m36513j(C52541vo voVar) {
        C52489tq tqVar = C52489tq.EDITABLE_TEXT_CONTENT;
        C51938er erVar = C51938er.TEXT_LABEL;
        int a = C52540vn.m86645a(voVar.f137914e);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return 1;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        ((C59052c) ((C59052c) f53455a.mo56225c()).mo56372aa(47536)).mo56386p("getAliasFromMapsLocation: undefined LocationType.");
        return 1;
    }

    /* renamed from: k */
    private static void m36514k(C63357a aVar, C52393qb qbVar) {
        int i = qbVar.f137482b;
        aVar.copyOnWrite();
        C63358b bVar = (C63358b) aVar.instance;
        C63358b bVar2 = C63358b.f171216l;
        bVar.f171218a |= 1;
        bVar.f171219b = i;
        int a = C63378v.m96231a(qbVar.f137483c);
        aVar.copyOnWrite();
        C63358b bVar3 = (C63358b) aVar.instance;
        int i2 = a - 1;
        if (a != 0) {
            bVar3.f171220c = i2;
            bVar3.f171218a |= 2;
            int i3 = qbVar.f137484d;
            aVar.copyOnWrite();
            C63358b bVar4 = (C63358b) aVar.instance;
            bVar4.f171218a |= 4;
            bVar4.f171221d = i3;
            return;
        }
        throw null;
    }

    /* renamed from: l */
    private static void m36515l(C63357a aVar, C52403ql qlVar) {
        int i = qlVar.f137515b;
        aVar.copyOnWrite();
        C63358b bVar = (C63358b) aVar.instance;
        C63358b bVar2 = C63358b.f171216l;
        bVar.f171218a |= 16;
        bVar.f171222e = i;
        int i2 = qlVar.f137516c;
        aVar.copyOnWrite();
        C63358b bVar3 = (C63358b) aVar.instance;
        bVar3.f171218a |= 32;
        bVar3.f171223f = i2;
        int i3 = qlVar.f137517d;
        aVar.copyOnWrite();
        C63358b bVar4 = (C63358b) aVar.instance;
        bVar4.f171218a |= 64;
        bVar4.f171224g = i3;
    }
}
