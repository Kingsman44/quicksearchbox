package com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c;

import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.m */
/* compiled from: PG */
public final /* synthetic */ class C101704m implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C101706o f283789a;

    public /* synthetic */ C101704m(C101706o oVar) {
        this.f283789a = oVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x002b, code lost:
        if (r8 != 2) goto L_0x022d;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x010a  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x014b  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0239  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x023f  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0243  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.o r0 = r14.f283789a
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.aj r1 = r0.f283800j
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.j r2 = r0.f283797g
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r2 = r2.f283875b
            com.google.common.f.aa r3 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r2.name()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.NO_SCREEN
            r4 = 3
            r5 = 2
            r6 = 1
            java.lang.String r7 = "SLAFlow"
            if (r2 != r3) goto L_0x02d1
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.NEEDS_DEVICE_ENROLLMENT
            com.google.android.apps.gsa.h.s.u r3 = r1.f283631c
            com.google.android.apps.gsa.h.s.aj r3 = r3.mo70888f()
            int r3 = r3.mo70866c()
            int r8 = r3 + -1
            r9 = 0
            if (r3 == 0) goto L_0x02d0
            if (r8 == 0) goto L_0x0176
            if (r8 == r6) goto L_0x002f
            if (r8 == r5) goto L_0x0176
            goto L_0x022d
        L_0x002f:
            com.google.android.apps.gsa.h.s.u r3 = r1.f283631c
            com.google.android.apps.gsa.h.s.aj r3 = r3.mo70888f()
            java.lang.String r3 = r3.mo70864a()
            com.google.android.apps.gsa.assistant.settings.features.av.ei r8 = r1.f283636h
            com.google.assistant.at.cj r8 = r8.a(r3)
            boolean r8 = com.google.android.apps.gsa.assistant.settings.features.av.ei.m(r8, r6)
            com.google.android.apps.gsa.assistant.settings.features.av.ei r10 = r1.f283636h
            com.google.assistant.at.cj r10 = r10.a(r3)
            boolean r10 = com.google.android.apps.gsa.assistant.settings.features.av.ei.m(r10, r5)
            com.google.android.apps.gsa.assistant.settings.features.av.ei r11 = r1.f283636h
            com.google.assistant.at.cj r3 = r11.a(r3)
            boolean r3 = com.google.android.apps.gsa.assistant.settings.features.av.ei.m(r3, r4)
            if (r8 != 0) goto L_0x0071
            if (r10 != 0) goto L_0x0071
            if (r3 == 0) goto L_0x005e
            goto L_0x0071
        L_0x005e:
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r8, r7)
            java.lang.String r8 = "No features already enabled"
            r10 = 20410(0x4fba, float:2.86E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r10)).mo56386p(r8)
            goto L_0x009e
        L_0x0071:
            com.google.common.f.e r11 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r11 = r11.mo56224b()
            com.google.common.f.aa r12 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r11.mo56378ag(r12, r7)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            r12 = 20403(0x4fb3, float:2.859E-41)
            com.google.common.f.x r11 = r11.mo56372aa(r12)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            java.lang.Boolean r8 = java.lang.Boolean.valueOf(r8)
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r3)
            java.lang.String r12 = "Features already enabled: voice match[%b], face match[%b], personal results[%b]"
            r11.mo56359L(r12, r8, r10, r3)
            java.util.ArrayDeque r3 = r1.f283639k
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.STRUCTURE_LEVEL_ASSISTANT_ALREADY_ENABLED_SCREEN
            r3.addLast(r8)
        L_0x009e:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.a r3 = r1.f283637i
            int r3 = r3.mo92453a(r6)
            int r3 = r3 + -1
            if (r3 == r6) goto L_0x00e2
            if (r3 == r5) goto L_0x00c6
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r8, r7)
            java.lang.String r8 = "Device does not need Voice Match enrollment"
            r10 = 20404(0x4fb4, float:2.8592E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r10)).mo56386p(r8)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r3 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.SKIPPED
            java.util.concurrent.atomic.AtomicReference r3 = r3.f284147a
            r3.set(r8)
            goto L_0x0100
        L_0x00c6:
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r8, r7)
            java.lang.String r8 = "Device needs Voice Match enrollment"
            r10 = 20409(0x4fb9, float:2.8599E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r10)).mo56386p(r8)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r3 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.NEEDS_DEVICE_ENROLLMENT
            java.util.concurrent.atomic.AtomicReference r3 = r3.f284147a
            r3.set(r8)
            goto L_0x00fd
        L_0x00e2:
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r8, r7)
            java.lang.String r8 = "Device needs Voice Match structure enrollment"
            r10 = 20408(0x4fb8, float:2.8598E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r10)).mo56386p(r8)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r3 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.NEEDS_STRUCTURE_ENROLLMENT
            java.util.concurrent.atomic.AtomicReference r3 = r3.f284147a
            r3.set(r8)
        L_0x00fd:
            r1.mo92459c()
        L_0x0100:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.a r3 = r1.f283637i
            int r3 = r3.mo92453a(r5)
            int r3 = r3 + -1
            if (r3 == r6) goto L_0x014b
            if (r3 == r5) goto L_0x0128
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r8, r7)
            java.lang.String r8 = "Device does not need Face Match enrollment"
            r10 = 20405(0x4fb5, float:2.8593E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r10)).mo56386p(r8)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r3 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.SKIPPED
            java.util.concurrent.atomic.AtomicReference r3 = r3.f284148b
            r3.set(r8)
            goto L_0x016d
        L_0x0128:
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r8, r7)
            java.lang.String r8 = "Device needs Face Match enrollment"
            r10 = 20407(0x4fb7, float:2.8596E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r10)).mo56386p(r8)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r3 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.NEEDS_DEVICE_ENROLLMENT
            java.util.concurrent.atomic.AtomicReference r3 = r3.f284148b
            r3.set(r8)
            java.util.ArrayDeque r3 = r1.f283639k
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.STRUCTURE_LEVEL_ASSISTANT_AVOCADO
            r3.addLast(r8)
            goto L_0x016d
        L_0x014b:
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r8, r7)
            java.lang.String r8 = "Device needs Face Match structure enrollment"
            r10 = 20406(0x4fb6, float:2.8595E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r10)).mo56386p(r8)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r3 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.NEEDS_STRUCTURE_ENROLLMENT
            java.util.concurrent.atomic.AtomicReference r3 = r3.f284148b
            r3.set(r8)
            java.util.ArrayDeque r3 = r1.f283639k
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.STRUCTURE_LEVEL_ASSISTANT_AVOCADO
            r3.addLast(r8)
        L_0x016d:
            java.util.ArrayDeque r3 = r1.f283639k
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.STRUCTURE_LEVEL_ASSISTANT_PERSONAL_RESULTS_SCREEN
            r3.addLast(r8)
            goto L_0x022a
        L_0x0176:
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r8, r7)
            java.lang.String r8 = "Start SLA flow for Structure enrollment"
            r10 = 20411(0x4fbb, float:2.8602E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r10)).mo56386p(r8)
            com.google.android.apps.gsa.h.s.u r3 = r1.f283631c
            com.google.android.apps.gsa.h.s.aj r3 = r3.mo70888f()
            java.lang.String r3 = r3.mo70865b()
            com.google.android.apps.gsa.assistant.settings.features.av.ei r8 = r1.f283636h
            boolean r8 = r8.r(r3, r6)
            if (r8 == 0) goto L_0x01b9
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r10, r7)
            java.lang.String r10 = "Voice Match Structure enrollment needed"
            r11 = 20414(0x4fbe, float:2.8606E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r11)).mo56386p(r10)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r8 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r10 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.NEEDS_STRUCTURE_ENROLLMENT
            java.util.concurrent.atomic.AtomicReference r8 = r8.f284147a
            r8.set(r10)
            r1.mo92459c()
            goto L_0x01c2
        L_0x01b9:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r8 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r10 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.SKIPPED
            java.util.concurrent.atomic.AtomicReference r8 = r8.f284147a
            r8.set(r10)
        L_0x01c2:
            com.google.android.apps.gsa.assistant.settings.features.av.ei r8 = r1.f283636h
            boolean r8 = r8.r(r3, r5)
            if (r8 == 0) goto L_0x01ed
            com.google.common.f.e r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r8 = r8.mo56224b()
            com.google.common.f.aa r10 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r8.mo56378ag(r10, r7)
            java.lang.String r10 = "Face Match Structure enrollment needed"
            r11 = 20413(0x4fbd, float:2.8605E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r8).mo56372aa(r11)).mo56386p(r10)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r8 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r10 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.NEEDS_STRUCTURE_ENROLLMENT
            java.util.concurrent.atomic.AtomicReference r8 = r8.f284148b
            r8.set(r10)
            java.util.ArrayDeque r8 = r1.f283639k
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r10 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.STRUCTURE_LEVEL_ASSISTANT_AVOCADO
            r8.addLast(r10)
            goto L_0x01f6
        L_0x01ed:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r8 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r10 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.SKIPPED
            java.util.concurrent.atomic.AtomicReference r8 = r8.f284148b
            r8.set(r10)
        L_0x01f6:
            com.google.android.apps.gsa.assistant.settings.features.av.ei r8 = r1.f283636h
            boolean r3 = r8.r(r3, r4)
            if (r3 == 0) goto L_0x0221
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r8 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r8, r7)
            java.lang.String r8 = "Personal Results Structure enrollment needed"
            r10 = 20412(0x4fbc, float:2.8603E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r10)).mo56386p(r8)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r3 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.NEEDS_STRUCTURE_ENROLLMENT
            java.util.concurrent.atomic.AtomicReference r3 = r3.f284149c
            r3.set(r8)
            java.util.ArrayDeque r3 = r1.f283639k
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.STRUCTURE_LEVEL_ASSISTANT_PERSONAL_RESULTS_SCREEN
            r3.addLast(r8)
            goto L_0x022a
        L_0x0221:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r3 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.SKIPPED
            java.util.concurrent.atomic.AtomicReference r3 = r3.f284149c
            r3.set(r8)
        L_0x022a:
            r1.mo92458b()
        L_0x022d:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r3 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r3 = r3.mo92641c()
            int r3 = r3.ordinal()
            if (r3 == 0) goto L_0x023f
            if (r3 == r6) goto L_0x023c
            goto L_0x0241
        L_0x023c:
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SLA_STRUCTURE_ENROLLMENT_START
            goto L_0x0241
        L_0x023f:
            com.google.android.apps.gsa.shared.logger.b.ae r9 = com.google.android.apps.gsa.shared.logger.p7051b.C89849ae.VOICE_MATCH_SLA_DEVICE_ENROLLMENT_START
        L_0x0241:
            if (r9 == 0) goto L_0x02d1
            dagger.a r3 = r1.f283635g
            java.lang.Object r3 = r3.mo27525b()
            com.google.android.apps.gsa.shared.logger.b.i r3 = (com.google.android.apps.gsa.shared.logger.p7051b.C89859i) r3
            com.google.android.apps.gsa.shared.logger.b.f r8 = new com.google.android.apps.gsa.shared.logger.b.f
            r8.<init>()
            r8.f246201a = r9
            com.google.common.o.cb r9 = com.google.common.p4552o.C59687cb.f160034bf
            com.google.protobuf.bn r9 = r9.createBuilder()
            com.google.common.o.aj r9 = (com.google.common.p4552o.C59582aj) r9
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.a r10 = r1.f283633e
            java.lang.String r10 = r10.mo92638c()
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.common.o.cb r11 = (com.google.common.p4552o.C59687cb) r11
            int r12 = r11.f160115b
            r12 = r12 | 4096(0x1000, float:5.74E-42)
            r11.f160115b = r12
            r11.f160048M = r10
            com.google.android.apps.gsa.h.s.u r10 = r1.f283631c
            com.google.android.apps.gsa.assistant.b.a.b r10 = r10.mo70883a()
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.common.o.cb r11 = (com.google.common.p4552o.C59687cb) r11
            int r10 = r10.f32835aq
            r11.f160049N = r10
            int r10 = r11.f160115b
            r10 = r10 | 8192(0x2000, float:1.14794E-41)
            r11.f160115b = r10
            dagger.a r10 = r1.f283632d
            java.lang.Object r10 = r10.mo27525b()
            com.google.android.apps.gsa.speech.hotword.c.d r10 = (com.google.android.apps.gsa.speech.hotword.p7285c.C92371d) r10
            java.util.Collection r10 = r10.f257559d
            j$.util.stream.Stream r10 = p3186j$.util.Collection.EL.stream(r10)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.ai r11 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101645ai.f283628a
            j$.util.stream.Stream r10 = r10.map(r11)
            j$.util.stream.Collector r11 = p3186j$.util.stream.Collectors.toList()
            java.lang.Object r10 = r10.collect(r11)
            java.util.List r10 = (java.util.List) r10
            r9.mo57004a(r10)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.a r10 = r1.f283633e
            java.util.concurrent.atomic.AtomicBoolean r10 = r10.f284134a
            boolean r10 = r10.get()
            r9.copyOnWrite()
            com.google.protobuf.bv r11 = r9.instance
            com.google.common.o.cb r11 = (com.google.common.p4552o.C59687cb) r11
            int r12 = r11.f160115b
            r13 = 32768(0x8000, float:4.5918E-41)
            r12 = r12 | r13
            r11.f160115b = r12
            r11.f160051P = r10
            com.google.protobuf.bv r9 = r9.build()
            com.google.common.o.cb r9 = (com.google.common.p4552o.C59687cb) r9
            r8.f246203c = r9
            com.google.android.apps.gsa.shared.logger.b.g r8 = r8.mo83699a()
            r3.mo74236a(r8)
            goto L_0x02d1
        L_0x02d0:
            throw r9
        L_0x02d1:
            com.google.common.b.gu r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283629a
            boolean r3 = r3.contains(r2)
            if (r3 == 0) goto L_0x0307
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r3 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r3 = r3.mo92641c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.CANCELLED
            boolean r3 = r3.equals(r8)
            if (r3 == 0) goto L_0x0307
            java.util.ArrayDeque r3 = r1.f283639k
            com.google.common.b.gu r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283629a
            r3.removeAll(r8)
            java.util.ArrayDeque r3 = r1.f283639k
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.STRUCTURE_LEVEL_ASSISTANT_AVOCADO
            r3.remove(r8)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.ae r3 = r1.f283638j
            boolean r3 = r3.mo92334g()
            if (r3 == 0) goto L_0x0307
            java.util.ArrayDeque r3 = r1.f283639k
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.STRUCTURE_LEVEL_ASSISTANT_PERSONAL_RESULTS_SCREEN
            r3.remove(r8)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168405g()
        L_0x0307:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r3 = r1.mo92457a()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.STRUCTURE_LEVEL_ASSISTANT_PERSONAL_RESULTS_SCREEN
            if (r3 != r8) goto L_0x0380
            com.google.android.apps.gsa.h.s.u r8 = r1.f283631c
            com.google.android.apps.gsa.h.s.aj r8 = r8.mo70888f()
            int r8 = r8.mo70866c()
            if (r8 != r5) goto L_0x0380
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r8 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.NEEDS_DEVICE_ENROLLMENT
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.c.c.a r8 = r1.f283637i
            int r4 = r8.mo92453a(r4)
            int r4 = r4 + -1
            if (r4 == r6) goto L_0x0365
            if (r4 == r5) goto L_0x0349
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r3 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.SKIPPED
            java.util.concurrent.atomic.AtomicReference r3 = r3.f284149c
            r3.set(r4)
            com.google.common.f.e r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r3 = r3.mo56224b()
            com.google.common.f.aa r4 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r3.mo56378ag(r4, r7)
            java.lang.String r4 = "Device does not need Personal Results enrollment"
            r5 = 20399(0x4faf, float:2.8585E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r5)).mo56386p(r4)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r3 = r1.mo92457a()
            goto L_0x0380
        L_0x0349:
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r7)
            java.lang.String r5 = "Device needs Personal Results enrollment"
            r6 = 20401(0x4fb1, float:2.8588E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r4 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r5 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.NEEDS_DEVICE_ENROLLMENT
            java.util.concurrent.atomic.AtomicReference r4 = r4.f284149c
            r4.set(r5)
            goto L_0x0380
        L_0x0365:
            com.google.common.f.e r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101646aj.f283630b
            com.google.common.f.x r4 = r4.mo56224b()
            com.google.common.f.aa r5 = com.google.common.p4526f.p4527a.C58975e.f156826a
            r4.mo56378ag(r5, r7)
            java.lang.String r5 = "Device needs Personal Results structure enrollment"
            r6 = 20400(0x4fb0, float:2.8586E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r4).mo56372aa(r6)).mo56386p(r5)
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r4 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r5 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.NEEDS_STRUCTURE_ENROLLMENT
            java.util.concurrent.atomic.AtomicReference r4 = r4.f284149c
            r4.set(r5)
        L_0x0380:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r4 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.STRUCTURE_LEVEL_ASSISTANT_CONFIRMATION_SCREEN
            if (r3 != r4) goto L_0x03a6
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r4 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r4 = r4.mo92641c()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r5 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.ENROLLED
            if (r4 == r5) goto L_0x03a6
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r4 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r4 = r4.mo92639a()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r5 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.ENROLLED
            if (r4 == r5) goto L_0x03a6
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.c r4 = r1.f283634f
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r4 = r4.mo92640b()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.h.b r5 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7985h.C101861b.ENROLLED
            if (r4 == r5) goto L_0x03a6
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r3 = r1.mo92457a()
        L_0x03a6:
            if (r3 != 0) goto L_0x03ad
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168405g()
            goto L_0x03bd
        L_0x03ad:
            r3.name()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.NO_SCREEN
            if (r2 != r1) goto L_0x03b9
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168404f(r3)
            goto L_0x03bd
        L_0x03b9:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.o r1 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101775o.m168407i(r3)
        L_0x03bd:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r2 = r1.mo92549b()
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r3 = com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7979d.C101773m.NO_SCREEN
            if (r2 != r3) goto L_0x03d5
            java.lang.Integer r2 = r1.mo92551d()
            int r2 = r2.intValue()
            android.content.Intent r1 = r1.mo92548a()
            r0.mo92514a(r2, r1)
            return
        L_0x03d5:
            com.google.android.apps.gsa.staticplugins.hotwordenrollment.d.m r2 = r1.mo92549b()
            java.lang.Boolean r1 = r1.mo92550c()
            boolean r1 = r1.booleanValue()
            r0.mo92516c(r2, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.gsa.staticplugins.hotwordenrollment.p7971c.p7978c.C101704m.run():void");
    }
}
