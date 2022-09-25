package com.google.android.libraries.assistant.auto.tng.morris.framework.p1086e;

import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14670aj;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14672al;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14693bf;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14698bk;
import com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14704e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.framework.e.ap */
/* compiled from: PG */
public final class C14955ap {

    /* renamed from: a */
    private final C14693bf f44908a;

    /* renamed from: b */
    private final C14672al f44909b;

    /* renamed from: c */
    private final C14686az f44910c;

    /* renamed from: d */
    private final C14704e f44911d;

    /* renamed from: e */
    private final C14670aj f44912e;

    /* renamed from: f */
    private final C14698bk f44913f;

    /* renamed from: g */
    private final C86124t f44914g;

    public C14955ap(C14693bf bfVar, C14672al alVar, C14686az azVar, C14704e eVar, C14670aj ajVar, C86124t tVar, C14698bk bkVar) {
        this.f44908a = bfVar;
        this.f44909b = alVar;
        this.f44910c = azVar;
        this.f44911d = eVar;
        this.f44912e = ajVar;
        this.f44914g = tVar;
        this.f44913f = bkVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:178:0x08ea, code lost:
        if (r10.mo21525m() != false) goto L_0x08fc;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo21866a(com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14324f r9, com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj r10, com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14549ni r11, com.google.android.libraries.assistant.auto.tng.morris.framework.C14749d r12) {
        /*
            r8 = this;
            com.google.android.libraries.assistant.auto.tng.morris.e.lj r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14496lj.UNKNOWN_TASK
            int r10 = r10.ordinal()
            r0 = 5
            java.lang.String r1 = "Morris.AssistantCtrl"
            r2 = 4
            java.lang.String r3 = "Morris.PhoneController"
            r4 = 3
            java.lang.String r5 = "Morris.MessageCtrl"
            r6 = 11
            r7 = 1
            switch(r10) {
                case 1: goto L_0x0a6f;
                case 2: goto L_0x09e9;
                case 3: goto L_0x094a;
                case 4: goto L_0x0848;
                case 5: goto L_0x07f7;
                case 6: goto L_0x074b;
                case 7: goto L_0x066c;
                case 8: goto L_0x063e;
                case 9: goto L_0x05d0;
                case 10: goto L_0x050a;
                case 11: goto L_0x049d;
                case 12: goto L_0x041d;
                case 13: goto L_0x0408;
                case 14: goto L_0x03c3;
                case 15: goto L_0x0312;
                case 16: goto L_0x02ae;
                case 17: goto L_0x0295;
                case 18: goto L_0x027e;
                case 19: goto L_0x025d;
                case 20: goto L_0x01b3;
                case 21: goto L_0x0166;
                case 22: goto L_0x0151;
                case 23: goto L_0x0119;
                case 24: goto L_0x0104;
                case 25: goto L_0x00ef;
                case 26: goto L_0x0079;
                case 27: goto L_0x0016;
                default: goto L_0x0015;
            }
        L_0x0015:
            return
        L_0x0016:
            com.google.android.libraries.assistant.auto.tng.morris.e.ow r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14590ow.f44104b
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.ov r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14589ov) r9
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.bk r10 = r8.f44913f
            j$.util.Optional r12 = r10.f44413d
            boolean r12 = r12.isPresent()
            if (r12 == 0) goto L_0x003d
            j$.util.Optional r10 = r10.f44413d
            java.lang.Object r10 = r10.get()
            com.google.assistant.s.a.nu r10 = (com.google.assistant.p3994s.p3995a.C53435nu) r10
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ow r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14590ow) r12
            r10.getClass()
            r12.f44106a = r10
            goto L_0x0060
        L_0x003d:
            com.google.common.f.e r10 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14698bk.f44410a
            com.google.common.f.x r10 = r10.mo56226d()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            java.lang.String r0 = "Morris.SuggestCtrl"
            r10.mo56378ag(r12, r0)
            java.lang.String r12 = "#populateOnboardingPopupTask cached suggestion was not present, but task was requested."
            r0 = 45442(0xb182, float:6.3678E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r0)).mo56386p(r12)
            com.google.assistant.s.a.nu r10 = com.google.assistant.p3994s.p3995a.C53435nu.f140233n
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ow r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14590ow) r12
            r10.getClass()
            r12.f44106a = r10
        L_0x0060:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.protobuf.bv r9 = r9.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.ow r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14590ow) r9
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 23
            r10.f44160a = r9
            return
        L_0x0079:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.bf r9 = r8.f44908a
            j$.util.OptionalInt r10 = r9.f44387i
            boolean r10 = r10.isPresent()
            if (r10 == 0) goto L_0x00da
            android.util.SparseArray r10 = r9.f44395q
            j$.util.OptionalInt r12 = r9.f44387i
            int r12 = r12.getAsInt()
            int r10 = r10.indexOfKey(r12)
            if (r10 < 0) goto L_0x00da
            j$.util.Optional r10 = r9.f44389k
            boolean r10 = r10.isEmpty()
            if (r10 == 0) goto L_0x009a
            goto L_0x00da
        L_0x009a:
            com.google.android.libraries.assistant.auto.tng.morris.e.nh r10 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14548nh.f44000c
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.ng r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14547ng) r10
            j$.util.OptionalInt r12 = r9.f44387i
            int r12 = r12.getAsInt()
            r10.copyOnWrite()
            com.google.protobuf.bv r0 = r10.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.nh r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14548nh) r0
            r0.f44002a = r12
            j$.util.Optional r9 = r9.f44389k
            java.lang.Object r9 = r9.get()
            java.lang.Iterable r9 = (java.lang.Iterable) r9
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.nh r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14548nh) r12
            com.google.protobuf.cq r0 = r12.f44003b
            boolean r1 = r0.mo58948c()
            if (r1 != 0) goto L_0x00ce
            com.google.protobuf.cq r0 = com.google.protobuf.C62942bv.mutableCopy((com.google.protobuf.C62971cq) r0)
            r12.f44003b = r0
        L_0x00ce:
            com.google.protobuf.cq r12 = r12.f44003b
            com.google.protobuf.C62947c.addAll((java.lang.Iterable) r9, (java.util.List) r12)
            com.google.protobuf.bv r9 = r10.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.nh r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14548nh) r9
            goto L_0x00dc
        L_0x00da:
            com.google.android.libraries.assistant.auto.tng.morris.e.nh r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14548nh.f44000c
        L_0x00dc:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 18
            r10.f44160a = r9
            return
        L_0x00ef:
            com.google.android.libraries.assistant.auto.tng.morris.e.pg r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14601pg.f44132a
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 19
            r10.f44160a = r9
            return
        L_0x0104:
            com.google.android.libraries.assistant.auto.tng.morris.e.nk r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14551nk.f44004a
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 17
            r10.f44160a = r9
            return
        L_0x0119:
            com.google.android.libraries.assistant.auto.tng.morris.e.ou r10 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14588ou.f44101b
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.ot r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14587ot) r10
            int r9 = r9.f43333b
            int r9 = p001a.p007b.p011b.p012a.C0025a.m8c(r9)
            if (r9 != 0) goto L_0x012a
            goto L_0x012b
        L_0x012a:
            r7 = r9
        L_0x012b:
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ou r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14588ou) r9
            int r12 = p001a.p007b.p011b.p012a.C0025a.m7b(r7)
            r9.f44103a = r12
            r11.copyOnWrite()
            com.google.protobuf.bv r9 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r9
            com.google.protobuf.bv r10 = r10.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.ou r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14588ou) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r10.getClass()
            r9.f44161b = r10
            r10 = 14
            r9.f44160a = r10
            return
        L_0x0151:
            com.google.android.libraries.assistant.auto.tng.morris.e.nm r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14553nm.f44006a
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 13
            r10.f44160a = r9
            return
        L_0x0166:
            com.google.android.libraries.assistant.auto.tng.morris.e.no r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14555no.f44008d
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.nn r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14554nn) r9
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.e r10 = r8.f44911d
            boolean r12 = r10.f44440e
            if (r12 == 0) goto L_0x017e
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.no r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14555no) r10
            r10.f44012c = r7
            goto L_0x019a
        L_0x017e:
            boolean r12 = r10.f44439d
            if (r12 == 0) goto L_0x018c
            r9.copyOnWrite()
            com.google.protobuf.bv r10 = r9.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.no r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14555no) r10
            r10.f44011b = r7
            goto L_0x019a
        L_0x018c:
            java.lang.String r10 = r10.f44438c
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.no r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14555no) r12
            r10.getClass()
            r12.f44010a = r10
        L_0x019a:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.protobuf.bv r9 = r9.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.no r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14555no) r9
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 22
            r10.f44160a = r9
            return
        L_0x01b3:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.e r10 = r8.f44911d
            int r9 = r9.f43332a
            a.b.b.a.c r9 = p001a.p007b.p011b.p012a.C0027c.m9a(r9)
            if (r9 != 0) goto L_0x01bf
            a.b.b.a.c r9 = p001a.p007b.p011b.p012a.C0027c.UNRECOGNIZED
        L_0x01bf:
            j$.util.Optional r12 = r10.f44443h
            boolean r12 = r12.isEmpty()
            if (r12 == 0) goto L_0x01f6
            com.google.common.f.e r10 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14704e.f44436a
            com.google.common.f.x r10 = r10.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r12, r1)
            java.lang.String r12 = "Rendered card is expected while building Immersive card task"
            r0 = 45337(0xb119, float:6.353E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r0)).mo56386p(r12)
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r10 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr.f44013g
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.np r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14556np) r10
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14704e.m30895y(r9)
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr) r12
            r12.f44020f = r9
            com.google.protobuf.bv r9 = r10.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr) r9
            goto L_0x024c
        L_0x01f6:
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr.f44013g
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.np r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14556np) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r1 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr) r1
            r1.f44018d = r0
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r0 = r10.f44437b
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r1 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14350fz.MIC_CLOSE
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x021a
            com.google.android.apps.gsa.search.core.i.t r0 = r10.f44449n
            com.google.android.apps.gsa.shared.m.f r1 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248915l
            long r0 = r0.mo79743a(r1)
            goto L_0x021c
        L_0x021a:
            r0 = 0
        L_0x021c:
            r12.copyOnWrite()
            com.google.protobuf.bv r2 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr) r2
            r2.f44019e = r0
            j$.util.Optional r10 = r10.f44443h
            java.lang.Object r10 = r10.get()
            com.google.at.h.b.a.r r10 = (com.google.p4017at.p4060h.p4068b.p4069a.C54201r) r10
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr) r0
            r10.getClass()
            r0.f44017c = r10
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14704e.m30895y(r9)
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr) r10
            r10.f44020f = r9
            com.google.protobuf.bv r9 = r12.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr) r9
        L_0x024c:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r10.f44160a = r6
            return
        L_0x025d:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.e r10 = r8.f44911d
            int r9 = r9.f43332a
            a.b.b.a.c r9 = p001a.p007b.p011b.p012a.C0027c.m9a(r9)
            if (r9 != 0) goto L_0x0269
            a.b.b.a.c r9 = p001a.p007b.p011b.p012a.C0027c.UNRECOGNIZED
        L_0x0269:
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r9 = r10.mo21681m(r12, r9)
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r10.f44160a = r6
            return
        L_0x027e:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.e r10 = r8.f44911d
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r9 = r10.mo21679k(r12, r9)
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r10.f44160a = r6
            return
        L_0x0295:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.e r10 = r8.f44911d
            com.google.android.apps.search.assistant.platform.pcp.f.cb r0 = com.google.android.apps.search.assistant.platform.pcp.p9329f.C123762cb.TEXT
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r9 = r10.mo21680l(r12, r0, r9)
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r10.f44160a = r6
            return
        L_0x02ae:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.e r10 = r8.f44911d
            int r9 = r9.f43332a
            a.b.b.a.c r9 = p001a.p007b.p011b.p012a.C0027c.m9a(r9)
            if (r9 != 0) goto L_0x02ba
            a.b.b.a.c r9 = p001a.p007b.p011b.p012a.C0027c.UNRECOGNIZED
        L_0x02ba:
            j$.util.Optional r10 = r10.f44444i
            r12 = 0
            java.lang.Object r10 = r10.orElse(r12)
            com.google.android.libraries.assistant.auto.tng.ui.voiceplate.b.d r10 = (com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d) r10
            if (r10 != 0) goto L_0x02db
            com.google.common.f.e r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14704e.f44436a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r10, r1)
            java.lang.String r10 = "AppActionArgs is expected while building OneShotWidgetTask"
            r12 = 45342(0xb11e, float:6.3538E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r12)).mo56386p(r10)
            com.google.android.libraries.assistant.auto.tng.morris.e.oy r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14592oy.f44108c
            goto L_0x02ff
        L_0x02db:
            com.google.android.libraries.assistant.auto.tng.morris.e.oy r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14592oy.f44108c
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.ox r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14591ox) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oy r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14592oy) r0
            r0.f44110a = r10
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14704e.m30895y(r9)
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oy r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14592oy) r10
            r10.f44111b = r9
            com.google.protobuf.bv r9 = r12.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.oy r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14592oy) r9
        L_0x02ff:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 21
            r10.f44160a = r9
            return
        L_0x0312:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.aj r10 = r8.f44912e
            j$.util.Optional r10 = r10.f44306e
            com.google.android.apps.gsa.search.core.i.t r0 = r8.f44914g
            com.google.android.apps.gsa.shared.m.d r1 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248812aT
            boolean r0 = r0.mo79746e(r1)
            if (r0 != 0) goto L_0x0369
            boolean r0 = r10.isPresent()
            if (r0 == 0) goto L_0x0348
            java.lang.Object r0 = r10.get()
            com.google.android.libraries.assistant.auto.tng.morris.e.ee r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14302ee) r0
            int r0 = r0.f43269a
            int r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14301ed.m30599b(r0)
            if (r0 != 0) goto L_0x0335
            goto L_0x0348
        L_0x0335:
            if (r0 != r4) goto L_0x0348
            java.lang.Object r10 = r10.get()
            com.google.android.libraries.assistant.auto.tng.morris.e.ee r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14302ee) r10
            java.lang.String r10 = r10.f43270b
            java.lang.String r0 = "com.spotify.music"
            boolean r10 = r0.equals(r10)
            if (r10 == 0) goto L_0x0348
            goto L_0x0369
        L_0x0348:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.e r10 = r8.f44911d
            int r9 = r9.f43332a
            a.b.b.a.c r9 = p001a.p007b.p011b.p012a.C0027c.m9a(r9)
            if (r9 != 0) goto L_0x0354
            a.b.b.a.c r9 = p001a.p007b.p011b.p012a.C0027c.UNRECOGNIZED
        L_0x0354:
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r9 = r10.mo21682n(r12, r9)
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r10.f44160a = r6
            return
        L_0x0369:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.e r10 = r8.f44911d
            int r9 = r9.f43332a
            a.b.b.a.c r9 = p001a.p007b.p011b.p012a.C0027c.m9a(r9)
            if (r9 != 0) goto L_0x0375
            a.b.b.a.c r9 = p001a.p007b.p011b.p012a.C0027c.UNRECOGNIZED
        L_0x0375:
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr.f44013g
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.np r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14556np) r12
            android.content.Context r10 = r10.f44445j
            android.content.res.Resources r10 = r10.getResources()
            r0 = 2132088430(0x7f15166e, float:1.9817143E38)
            java.lang.String r10 = r10.getString(r0)
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr) r0
            r10.getClass()
            r0.f44015a = r10
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr) r10
            r10.f44018d = r2
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14704e.m30895y(r9)
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr) r10
            r10.f44020f = r9
            com.google.protobuf.bv r9 = r12.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.nr r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14558nr) r9
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r10.f44160a = r6
            return
        L_0x03c3:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.al r10 = r8.f44909b
            j$.util.Optional r10 = r10.mo21648k(r4, r12)
            boolean r12 = r10.isPresent()
            if (r12 == 0) goto L_0x0407
            com.google.android.libraries.assistant.auto.tng.morris.e.oe r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14572oe.f44055i
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.od r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14571od) r12
            java.lang.Object r10 = r10.get()
            com.google.android.libraries.assistant.auto.tng.morris.e.fr r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14342fr) r10
            com.google.android.apps.gsa.search.core.i.t r0 = r8.f44914g
            com.google.android.libraries.assistant.auto.tng.morris.framework.p1086e.C14946ag.m31465b(r10, r12, r0)
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1087f.C14983a.m31499a(r9)
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oe r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14572oe) r10
            r9 = r9 ^ r7
            r10.f44063g = r9
            r11.copyOnWrite()
            com.google.protobuf.bv r9 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r9
            com.google.protobuf.bv r10 = r12.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.oe r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14572oe) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r10.getClass()
            r9.f44161b = r10
            r10 = 6
            r9.f44160a = r10
        L_0x0407:
            return
        L_0x0408:
            com.google.android.libraries.assistant.auto.tng.morris.e.pa r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14595pa.f44120a
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 20
            r10.f44160a = r9
            return
        L_0x041d:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.az r10 = r8.f44910c
            com.google.android.libraries.assistant.auto.tng.morris.d.a r12 = r10.f44352b
            j$.util.Optional r12 = r12.mo21487m()
            boolean r0 = r12.isPresent()
            if (r0 == 0) goto L_0x0475
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq.f44091f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.op r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14583op) r0
            java.lang.Object r12 = r12.get()
            com.google.android.libraries.assistant.auto.tng.morris.d.c r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c) r12
            android.content.Context r1 = r10.f44353c
            com.google.android.libraries.assistant.auto.tng.morris.e.fx r12 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30815k(r12, r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq) r1
            r12.getClass()
            r1.f44093a = r12
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ay r10 = r10.f44355e
            int r10 = r10.f44348f
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq) r12
            r12.f44095c = r10
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq) r10
            r10.f44096d = r7
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30819w(r9)
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq) r10
            r10.f44097e = r9
            com.google.protobuf.bv r9 = r0.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq) r9
            goto L_0x048a
        L_0x0475:
            com.google.common.f.e r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.f44351a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r10, r5)
            java.lang.String r10 = "Contact information is not available for the getMessageAutoDismissReplyTask"
            r12 = 45399(0xb157, float:6.3618E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r12)).mo56386p(r10)
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq.f44091f
        L_0x048a:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 16
            r10.f44160a = r9
            return
        L_0x049d:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.az r10 = r8.f44910c
            com.google.android.libraries.assistant.auto.tng.morris.d.a r12 = r10.f44352b
            j$.util.Optional r12 = r12.mo21485k()
            boolean r0 = r12.isEmpty()
            if (r0 == 0) goto L_0x04c1
            com.google.common.f.e r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.f44351a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r10, r5)
            java.lang.String r10 = "No active incoming messages to auto read"
            r12 = 45395(0xb153, float:6.3612E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r12)).mo56386p(r10)
            com.google.android.libraries.assistant.auto.tng.morris.e.og r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14574og.f44066c
            goto L_0x04f7
        L_0x04c1:
            r10.mo21657p()
            com.google.android.libraries.assistant.auto.tng.morris.e.og r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14574og.f44066c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.of r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14573of) r0
            java.lang.Object r12 = r12.get()
            com.google.android.libraries.assistant.auto.tng.morris.d.c r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c) r12
            android.content.Context r10 = r10.f44353c
            com.google.android.libraries.assistant.auto.tng.morris.e.fx r10 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30815k(r12, r10)
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.og r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14574og) r12
            r10.getClass()
            r12.f44068a = r10
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30819w(r9)
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.og r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14574og) r10
            r10.f44069b = r9
            com.google.protobuf.bv r9 = r0.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.og r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14574og) r9
        L_0x04f7:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 15
            r10.f44160a = r9
            return
        L_0x050a:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.az r10 = r8.f44910c
            boolean r12 = r10.f44360j
            if (r12 == 0) goto L_0x0563
            com.google.android.libraries.assistant.auto.tng.morris.d.a r12 = r10.f44352b
            j$.util.Optional r12 = r12.mo21485k()
            boolean r12 = r12.isPresent()
            if (r12 == 0) goto L_0x0563
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq.f44091f
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.op r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14583op) r12
            com.google.android.libraries.assistant.auto.tng.morris.d.a r0 = r10.f44352b
            j$.util.Optional r0 = r0.mo21485k()
            java.lang.Object r0 = r0.get()
            com.google.android.libraries.assistant.auto.tng.morris.d.c r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c) r0
            android.content.Context r1 = r10.f44353c
            com.google.android.libraries.assistant.auto.tng.morris.e.fx r0 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30815k(r0, r1)
            r12.copyOnWrite()
            com.google.protobuf.bv r1 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq) r1
            r0.getClass()
            r1.f44093a = r0
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ay r10 = r10.f44355e
            int r10 = r10.f44348f
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq) r0
            r0.f44095c = r10
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30819w(r9)
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq) r10
            r10.f44097e = r9
            com.google.protobuf.bv r9 = r12.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq) r9
            goto L_0x05bd
        L_0x0563:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ay r12 = r10.f44355e
            j$.util.Optional r12 = r12.f44343a
            boolean r12 = r12.isPresent()
            if (r12 == 0) goto L_0x05a8
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq.f44091f
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.op r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14583op) r12
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ay r0 = r10.f44355e
            com.google.android.libraries.assistant.auto.tng.morris.e.om r0 = r10.mo21655l(r0)
            r12.copyOnWrite()
            com.google.protobuf.bv r1 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq) r1
            r0.getClass()
            r1.f44094b = r0
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ay r10 = r10.f44355e
            int r10 = r10.f44348f
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq) r0
            r0.f44095c = r10
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30819w(r9)
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq) r10
            r10.f44097e = r9
            com.google.protobuf.bv r9 = r12.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq) r9
            goto L_0x05bd
        L_0x05a8:
            com.google.common.f.e r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.f44351a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r10, r5)
            java.lang.String r10 = "Contact information is not available for the getMessageReplyTask"
            r12 = 45400(0xb158, float:6.3619E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r12)).mo56386p(r10)
            com.google.android.libraries.assistant.auto.tng.morris.e.oq r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14584oq.f44091f
        L_0x05bd:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 12
            r10.f44160a = r9
            return
        L_0x05d0:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.az r10 = r8.f44910c
            com.google.android.libraries.assistant.auto.tng.morris.d.a r12 = r10.f44352b
            j$.util.Optional r12 = r12.mo21485k()
            boolean r0 = r10.f44360j
            if (r0 == 0) goto L_0x0616
            boolean r0 = r12.isPresent()
            if (r0 == 0) goto L_0x0616
            com.google.android.libraries.assistant.auto.tng.morris.e.oo r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14582oo.f44087c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.on r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14581on) r0
            java.lang.Object r12 = r12.get()
            com.google.android.libraries.assistant.auto.tng.morris.d.c r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c) r12
            android.content.Context r10 = r10.f44353c
            com.google.android.libraries.assistant.auto.tng.morris.e.fx r10 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30815k(r12, r10)
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oo r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14582oo) r12
            r10.getClass()
            r12.f44089a = r10
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30819w(r9)
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oo r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14582oo) r10
            r10.f44090b = r9
            com.google.protobuf.bv r9 = r0.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.oo r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14582oo) r9
            goto L_0x062b
        L_0x0616:
            com.google.common.f.e r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.f44351a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r10, r5)
            java.lang.String r10 = "No active incoming messages to read"
            r12 = 45398(0xb156, float:6.3616E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r12)).mo56386p(r10)
            com.google.android.libraries.assistant.auto.tng.morris.e.oo r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14582oo.f44087c
        L_0x062b:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 9
            r10.f44160a = r9
            return
        L_0x063e:
            com.google.android.libraries.assistant.auto.tng.morris.e.os r10 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14586os.f44098b
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.or r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14585or) r10
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30819w(r9)
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.os r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14586os) r12
            r12.f44100a = r9
            com.google.protobuf.bv r9 = r10.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.os r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14586os) r9
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 8
            r10.f44160a = r9
            return
        L_0x066c:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.az r10 = r8.f44910c
            boolean r12 = r10.f44360j
            if (r12 == 0) goto L_0x06d2
            com.google.android.libraries.assistant.auto.tng.morris.d.a r12 = r10.f44352b
            j$.util.Optional r12 = r12.mo21485k()
            boolean r12 = r12.isPresent()
            if (r12 == 0) goto L_0x06d2
            com.google.android.libraries.assistant.auto.tng.morris.e.ok r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok.f44075f
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.oj r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14577oj) r12
            com.google.android.libraries.assistant.auto.tng.morris.d.a r0 = r10.f44352b
            j$.util.Optional r0 = r0.mo21485k()
            java.lang.Object r0 = r0.get()
            com.google.android.libraries.assistant.auto.tng.morris.d.c r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c) r0
            android.content.Context r1 = r10.f44353c
            com.google.android.libraries.assistant.auto.tng.morris.e.fx r0 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30815k(r0, r1)
            r12.copyOnWrite()
            com.google.protobuf.bv r1 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ok r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok) r1
            r0.getClass()
            r1.f44077a = r0
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ay r0 = r10.f44355e
            int r0 = r0.f44349g
            r12.copyOnWrite()
            com.google.protobuf.bv r1 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ok r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok) r1
            r1.f44079c = r0
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ay r10 = r10.f44355e
            int r10 = r10.f44350h
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ok r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok) r0
            r0.f44080d = r10
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30819w(r9)
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ok r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok) r10
            r10.f44081e = r9
            com.google.protobuf.bv r9 = r12.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.ok r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok) r9
            goto L_0x0739
        L_0x06d2:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ay r12 = r10.f44355e
            j$.util.Optional r12 = r12.f44343a
            boolean r12 = r12.isPresent()
            if (r12 == 0) goto L_0x0724
            com.google.android.libraries.assistant.auto.tng.morris.e.ok r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok.f44075f
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.oj r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14577oj) r12
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ay r0 = r10.f44355e
            com.google.android.libraries.assistant.auto.tng.morris.e.om r0 = r10.mo21655l(r0)
            r12.copyOnWrite()
            com.google.protobuf.bv r1 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ok r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok) r1
            r0.getClass()
            r1.f44078b = r0
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ay r0 = r10.f44355e
            int r0 = r0.f44349g
            r12.copyOnWrite()
            com.google.protobuf.bv r1 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ok r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok) r1
            r1.f44079c = r0
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ay r10 = r10.f44355e
            int r10 = r10.f44350h
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ok r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok) r0
            r0.f44080d = r10
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30819w(r9)
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ok r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok) r10
            r10.f44081e = r9
            com.google.protobuf.bv r9 = r12.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.ok r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok) r9
            goto L_0x0739
        L_0x0724:
            com.google.common.f.e r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.f44351a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r10, r5)
            java.lang.String r10 = "Contact metadata is not available when getting MessageConfirmTask"
            r12 = 45397(0xb155, float:6.3615E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r12)).mo56386p(r10)
            com.google.android.libraries.assistant.auto.tng.morris.e.ok r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14578ok.f44075f
        L_0x0739:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 7
            r10.f44160a = r9
            return
        L_0x074b:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.az r10 = r8.f44910c
            boolean r12 = r10.f44360j
            if (r12 == 0) goto L_0x0797
            com.google.android.libraries.assistant.auto.tng.morris.d.a r12 = r10.f44352b
            j$.util.Optional r12 = r12.mo21485k()
            boolean r12 = r12.isPresent()
            if (r12 == 0) goto L_0x0797
            com.google.android.libraries.assistant.auto.tng.morris.e.oi r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14576oi.f44070d
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.oh r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14575oh) r12
            com.google.android.libraries.assistant.auto.tng.morris.d.a r0 = r10.f44352b
            j$.util.Optional r0 = r0.mo21485k()
            java.lang.Object r0 = r0.get()
            com.google.android.libraries.assistant.auto.tng.morris.d.c r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c) r0
            android.content.Context r10 = r10.f44353c
            com.google.android.libraries.assistant.auto.tng.morris.e.fx r10 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30815k(r0, r10)
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oi r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14576oi) r0
            r10.getClass()
            r0.f44072a = r10
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30819w(r9)
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14576oi) r10
            r10.f44074c = r9
            com.google.protobuf.bv r9 = r12.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.oi r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14576oi) r9
            goto L_0x07e4
        L_0x0797:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ay r12 = r10.f44355e
            j$.util.Optional r12 = r12.f44343a
            boolean r12 = r12.isPresent()
            if (r12 == 0) goto L_0x07cf
            com.google.android.libraries.assistant.auto.tng.morris.e.oi r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14576oi.f44070d
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.oh r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14575oh) r12
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.ay r0 = r10.f44355e
            com.google.android.libraries.assistant.auto.tng.morris.e.om r10 = r10.mo21655l(r0)
            r12.copyOnWrite()
            com.google.protobuf.bv r0 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oi r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14576oi) r0
            r10.getClass()
            r0.f44073b = r10
            boolean r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30819w(r9)
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14576oi) r10
            r10.f44074c = r9
            com.google.protobuf.bv r9 = r12.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.oi r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14576oi) r9
            goto L_0x07e4
        L_0x07cf:
            com.google.common.f.e r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.f44351a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r10, r5)
            java.lang.String r10 = "Contact metadata is not available when getting MessageComposeTask"
            r12 = 45396(0xb154, float:6.3613E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r12)).mo56386p(r10)
            com.google.android.libraries.assistant.auto.tng.morris.e.oi r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14576oi.f44070d
        L_0x07e4:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 10
            r10.f44160a = r9
            return
        L_0x07f7:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.az r9 = r8.f44910c
            com.google.android.libraries.assistant.auto.tng.morris.d.a r10 = r9.f44352b
            j$.util.Optional r10 = r10.mo21485k()
            boolean r12 = r10.isEmpty()
            if (r12 == 0) goto L_0x0808
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa.f44045d
            goto L_0x0837
        L_0x0808:
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r12 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa.f44045d
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.nz r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14566nz) r12
            java.lang.Object r10 = r10.get()
            com.google.android.libraries.assistant.auto.tng.morris.d.c r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c) r10
            android.content.Context r9 = r9.f44353c
            com.google.android.libraries.assistant.auto.tng.morris.e.fx r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30815k(r10, r9)
            r12.copyOnWrite()
            com.google.protobuf.bv r10 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa) r10
            r9.getClass()
            r10.f44047a = r9
            r12.copyOnWrite()
            com.google.protobuf.bv r9 = r12.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa) r9
            r9.f44049c = r7
            com.google.protobuf.bv r9 = r12.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa) r9
        L_0x0837:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r10.f44160a = r2
            return
        L_0x0848:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.az r9 = r8.f44910c
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.bf r10 = r8.f44908a
            j$.util.OptionalInt r10 = r10.f44387i
            boolean r10 = r10.isPresent()
            r10 = r10 ^ r7
            com.google.android.libraries.assistant.auto.tng.morris.d.a r1 = r9.f44352b
            j$.util.Optional r1 = r1.mo21485k()
            boolean r3 = r1.isEmpty()
            if (r3 == 0) goto L_0x0863
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa.f44045d
            goto L_0x0939
        L_0x0863:
            r3 = 0
            if (r10 != 0) goto L_0x08a0
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r10 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa.f44045d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.nz r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14566nz) r10
            java.lang.Object r12 = r1.get()
            com.google.android.libraries.assistant.auto.tng.morris.d.c r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c) r12
            android.content.Context r9 = r9.f44353c
            com.google.android.libraries.assistant.auto.tng.morris.e.fx r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30815k(r12, r9)
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa) r12
            r9.getClass()
            r12.f44047a = r9
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa) r9
            r9.f44048b = r3
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa) r9
            r9.f44049c = r3
            com.google.protobuf.bv r9 = r10.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa) r9
            goto L_0x0939
        L_0x08a0:
            java.lang.Object r10 = r1.get()
            com.google.android.libraries.assistant.auto.tng.morris.d.c r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c) r10
            com.google.android.apps.gsa.search.core.i.t r4 = r9.f44354d
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248827ai
            boolean r4 = r4.mo79746e(r5)
            if (r4 != 0) goto L_0x08b1
            goto L_0x08fc
        L_0x08b1:
            boolean r4 = r10.mo21523k()
            if (r4 == 0) goto L_0x08b8
            goto L_0x08fc
        L_0x08b8:
            com.google.android.libraries.assistant.auto.tng.morris.d.a r4 = r9.f44352b
            java.lang.String r5 = r10.mo21518f()
            boolean r4 = r4.mo21496v(r5)
            if (r4 == 0) goto L_0x08c5
            goto L_0x08fc
        L_0x08c5:
            j$.util.Optional r4 = r9.f44365o
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.as r5 = new com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.as
            r5.<init>(r9, r12)
            java.lang.Object r12 = r4.orElseGet(r5)
            com.google.android.libraries.assistant.auto.tng.morris.e.bw r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14239bw) r12
            com.google.android.apps.gsa.search.core.i.t r4 = r9.f44354d
            com.google.android.apps.gsa.shared.m.d r5 = com.google.android.apps.gsa.shared.p7066m.C90051dc.f248828aj
            boolean r4 = r4.mo79746e(r5)
            if (r4 == 0) goto L_0x08ed
            com.google.assistant.e.l.a.as r4 = r12.f43095a
            if (r4 != 0) goto L_0x08e2
            com.google.assistant.e.l.a.as r4 = com.google.assistant.p3897e.p3929l.p3930a.C52686as.f138291q
        L_0x08e2:
            boolean r4 = r4.f138304l
            if (r4 != 0) goto L_0x08ed
            boolean r10 = r10.mo21525m()
            if (r10 == 0) goto L_0x08ed
            goto L_0x08fc
        L_0x08ed:
            com.google.assistant.e.l.a.as r10 = r12.f43095a
            if (r10 != 0) goto L_0x08f3
            com.google.assistant.e.l.a.as r10 = com.google.assistant.p3897e.p3929l.p3930a.C52686as.f138291q
        L_0x08f3:
            com.google.android.apps.gsa.search.core.i.t r12 = r9.f44354d
            int r10 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15389q.m32021a(r10, r12)
            if (r10 != r0) goto L_0x08fc
            r3 = 1
        L_0x08fc:
            if (r3 != 0) goto L_0x0901
            r9.mo21657p()
        L_0x0901:
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r10 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa.f44045d
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.nz r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14566nz) r10
            java.lang.Object r12 = r1.get()
            com.google.android.libraries.assistant.auto.tng.morris.d.c r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1069d.C14187c) r12
            android.content.Context r9 = r9.f44353c
            com.google.android.libraries.assistant.auto.tng.morris.e.fx r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14686az.m30815k(r12, r9)
            r10.copyOnWrite()
            com.google.protobuf.bv r12 = r10.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa) r12
            r9.getClass()
            r12.f44047a = r9
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa) r9
            r9.f44048b = r3
            r10.copyOnWrite()
            com.google.protobuf.bv r9 = r10.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa) r9
            r9.f44049c = r7
            com.google.protobuf.bv r9 = r10.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.oa r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14568oa) r9
        L_0x0939:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r10.f44160a = r2
            return
        L_0x094a:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.bf r9 = r8.f44908a
            j$.util.OptionalInt r10 = r9.f44387i
            boolean r10 = r10.isPresent()
            if (r10 == 0) goto L_0x09c3
            android.util.SparseArray r10 = r9.f44395q
            j$.util.OptionalInt r0 = r9.f44387i
            int r0 = r0.getAsInt()
            int r10 = r10.indexOfKey(r0)
            if (r10 >= 0) goto L_0x0963
            goto L_0x09c3
        L_0x0963:
            android.util.SparseArray r10 = r9.f44395q
            j$.util.OptionalInt r0 = r9.f44387i
            int r0 = r0.getAsInt()
            java.lang.Object r10 = r10.get(r0)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.be r10 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14692be) r10
            java.lang.Object r10 = p3186j$.util.Objects.requireNonNull(r10)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.be r10 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14692be) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pc r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14597pc.f44122e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.pb r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14596pb) r0
            j$.util.OptionalInt r1 = r9.f44387i
            int r1 = r1.getAsInt()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pc r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14597pc) r2
            r2.f44125b = r1
            android.content.Context r9 = r9.f44381c
            java.lang.String r1 = r10.f44377d
            java.lang.String r9 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15388p.m32017e(r9, r12, r1)
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pc r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14597pc) r12
            r9.getClass()
            r12.f44124a = r9
            int r9 = r10.f44378e
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pc r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14597pc) r12
            int r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14632v.m30647a(r9)
            r12.f44126c = r9
            long r9 = r10.f44375b
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pc r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14597pc) r12
            r12.f44127d = r9
            com.google.protobuf.bv r9 = r0.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.pc r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14597pc) r9
            goto L_0x09d8
        L_0x09c3:
            com.google.common.f.e r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14693bf.f44379a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r10, r3)
            java.lang.String r10 = "Ongoing Call Info should be present."
            r12 = 45414(0xb166, float:6.3639E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r12)).mo56386p(r10)
            com.google.android.libraries.assistant.auto.tng.morris.e.pc r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14597pc.f44122e
        L_0x09d8:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r10.f44160a = r4
            return
        L_0x09e9:
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.bf r9 = r8.f44908a
            j$.util.OptionalInt r10 = r9.f44386h
            boolean r10 = r10.isPresent()
            if (r10 == 0) goto L_0x0a48
            android.util.SparseArray r10 = r9.f44395q
            j$.util.OptionalInt r0 = r9.f44386h
            int r0 = r0.getAsInt()
            int r10 = r10.indexOfKey(r0)
            if (r10 >= 0) goto L_0x0a02
            goto L_0x0a48
        L_0x0a02:
            android.util.SparseArray r10 = r9.f44395q
            j$.util.OptionalInt r0 = r9.f44386h
            int r0 = r0.getAsInt()
            java.lang.Object r10 = r10.get(r0)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.be r10 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14692be) r10
            java.lang.Object r10 = p3186j$.util.Objects.requireNonNull(r10)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.be r10 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14692be) r10
            java.lang.String r10 = r10.f44377d
            com.google.android.libraries.assistant.auto.tng.morris.e.pe r0 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14599pe.f44128c
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.pd r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14598pd) r0
            android.content.Context r1 = r9.f44381c
            java.lang.String r10 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15388p.m32017e(r1, r12, r10)
            r0.copyOnWrite()
            com.google.protobuf.bv r12 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pe r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14599pe) r12
            r10.getClass()
            r12.f44130a = r10
            j$.util.OptionalInt r9 = r9.f44386h
            int r9 = r9.getAsInt()
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pe r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14599pe) r10
            r10.f44131b = r9
            com.google.protobuf.bv r9 = r0.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.pe r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14599pe) r9
            goto L_0x0a5d
        L_0x0a48:
            com.google.common.f.e r9 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14693bf.f44379a
            com.google.common.f.x r9 = r9.mo56225c()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r9.mo56378ag(r10, r3)
            java.lang.String r10 = "Outgoing Call Info should be present."
            r12 = 45415(0xb167, float:6.364E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r9).mo56372aa(r12)).mo56386p(r10)
            com.google.android.libraries.assistant.auto.tng.morris.e.pe r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14599pe.f44128c
        L_0x0a5d:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r9 = 2
            r10.f44160a = r9
            return
        L_0x0a6f:
            com.google.android.libraries.assistant.auto.tng.morris.e.ny r9 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14565ny.f44034e
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.android.libraries.assistant.auto.tng.morris.e.nx r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14564nx) r9
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.e r10 = r8.f44911d
            com.google.android.libraries.assistant.auto.tng.morris.e.fz r10 = r10.f44437b
            r9.copyOnWrite()
            com.google.protobuf.bv r0 = r9.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ny r0 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14565ny) r0
            int r10 = r10.getNumber()
            r0.f44039d = r10
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.bf r10 = r8.f44908a
            j$.util.OptionalInt r0 = r10.f44385g
            boolean r0 = r0.isPresent()
            if (r0 == 0) goto L_0x0af5
            android.util.SparseArray r0 = r10.f44395q
            j$.util.OptionalInt r1 = r10.f44385g
            int r1 = r1.getAsInt()
            int r0 = r0.indexOfKey(r1)
            if (r0 >= 0) goto L_0x0aa1
            goto L_0x0af5
        L_0x0aa1:
            android.util.SparseArray r0 = r10.f44395q
            j$.util.OptionalInt r1 = r10.f44385g
            int r1 = r1.getAsInt()
            java.lang.Object r0 = r0.get(r1)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.be r0 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14692be) r0
            java.lang.Object r0 = p3186j$.util.Objects.requireNonNull(r0)
            com.google.android.libraries.assistant.auto.tng.morris.framework.a.b.be r0 = (com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14692be) r0
            java.lang.String r0 = r0.f44377d
            android.content.Context r1 = r10.f44381c
            java.lang.String r1 = com.google.android.libraries.assistant.auto.tng.morris.p1096h.C15388p.m32017e(r1, r12, r0)
            r9.copyOnWrite()
            com.google.protobuf.bv r2 = r9.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ny r2 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14565ny) r2
            r1.getClass()
            r2.f44036a = r1
            j$.util.OptionalInt r10 = r10.f44385g
            int r10 = r10.getAsInt()
            r9.copyOnWrite()
            com.google.protobuf.bv r1 = r9.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ny r1 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14565ny) r1
            r1.f44037b = r10
            j$.util.Optional r10 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14693bf.m30841f(r12, r0)
            boolean r12 = r10.isPresent()
            if (r12 == 0) goto L_0x0b08
            java.lang.Object r10 = r10.get()
            com.google.android.libraries.assistant.auto.tng.morris.e.gj r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14361gj) r10
            r9.copyOnWrite()
            com.google.protobuf.bv r12 = r9.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.ny r12 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14565ny) r12
            r10.getClass()
            r12.f44038c = r10
            goto L_0x0b08
        L_0x0af5:
            com.google.common.f.e r10 = com.google.android.libraries.assistant.auto.tng.morris.framework.p1078a.p1080b.C14693bf.f44379a
            com.google.common.f.x r10 = r10.mo56225c()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r10.mo56378ag(r12, r3)
            java.lang.String r12 = "Incoming Call Info should be present."
            r0 = 45427(0xb173, float:6.3657E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r10).mo56372aa(r0)).mo56386p(r12)
        L_0x0b08:
            r11.copyOnWrite()
            com.google.protobuf.bv r10 = r11.instance
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r10 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi) r10
            com.google.protobuf.bv r9 = r9.build()
            com.google.android.libraries.assistant.auto.tng.morris.e.ny r9 = (com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14565ny) r9
            com.google.android.libraries.assistant.auto.tng.morris.e.pi r11 = com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14603pi.f44158c
            r9.getClass()
            r10.f44161b = r9
            r10.f44160a = r7
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.auto.tng.morris.framework.p1086e.C14955ap.mo21866a(com.google.android.libraries.assistant.auto.tng.morris.e.f, com.google.android.libraries.assistant.auto.tng.morris.e.lj, com.google.android.libraries.assistant.auto.tng.morris.e.ni, com.google.android.libraries.assistant.auto.tng.morris.framework.d):void");
    }
}
