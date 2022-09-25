package com.google.android.apps.search.assistant.verticals.p10036c;

import android.view.contentcapture.DataShareWriteAdapter;
import androidx.p104d.p105a.C2164c;
import com.google.common.p4526f.p4527a.C58970a;

/* renamed from: com.google.android.apps.search.assistant.verticals.c.f */
/* compiled from: PG */
final class C131940f implements DataShareWriteAdapter {

    /* renamed from: a */
    final /* synthetic */ C2164c f360249a;

    /* renamed from: b */
    final /* synthetic */ C131943i f360250b;

    public C131940f(C131943i iVar, C2164c cVar) {
        this.f360250b = iVar;
        this.f360249a = cVar;
    }

    public final void onError(int i) {
        ((C58970a) ((C58970a) C131943i.f360252a.mo56225c()).mo56372aa(39605)).mo56387q("Data share failed with error code %d.", i);
        this.f360249a.mo5437b(false);
    }

    public final void onRejected() {
        ((C58970a) ((C58970a) C131943i.f360252a.mo56225c()).mo56372aa(39606)).mo56386p("Data share rejected by Content Capture service.");
        this.f360249a.mo5437b(false);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:27|26|35|36) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:35:0x094d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onWrite(android.os.ParcelFileDescriptor r18) {
        /*
            r17 = this;
            r1 = r17
            java.lang.String r2 = "https://www.gstatic.com/assistant/settings/commuting_to_work_routine.svg"
            java.lang.String r3 = "https://www.gstatic.com/assistant/settings/im_home_routine.svg"
            java.lang.String r4 = "Translate your conversation"
            java.lang.String r5 = "https://fonts.gstatic.com/s/i/productlogos/assistant_interpreter/v5/192px.svg"
            java.lang.String r6 = "https://assistant.google.com/services/invoke/uid/0000004f0e04d1da?intent=WORKFLOW_TRIGGER&param.asst=interpreter"
            java.lang.String r7 = "https://fonts.gstatic.com/s/i/googlematerialicons/reminder/v17/24px.svg"
            android.os.ParcelFileDescriptor$AutoCloseOutputStream r9 = new android.os.ParcelFileDescriptor$AutoCloseOutputStream     // Catch:{ Exception -> 0x0950 }
            r10 = r18
            r9.<init>(r10)     // Catch:{ Exception -> 0x0950 }
            r10 = 1
            com.google.android.apps.search.assistant.verticals.c.i r11 = r1.f360250b     // Catch:{ all -> 0x092c }
            java.util.ArrayList r12 = new java.util.ArrayList     // Catch:{ all -> 0x092c }
            r12.<init>()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r13 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r13 = r13.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r13 = (com.google.assistant.p3825an.p3836f.C49373a) r13     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r14 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r14 = r14.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.b r14 = (com.google.assistant.p3825an.p3836f.C49376b) r14     // Catch:{ all -> 0x092c }
            r14.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r15 = r14.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r15 = (com.google.assistant.p3825an.p3836f.C49377c) r15     // Catch:{ all -> 0x092c }
            r15.f127620b = r10     // Catch:{ all -> 0x092c }
            int r8 = r15.f127619a     // Catch:{ all -> 0x092c }
            r8 = r8 | r10
            r15.f127619a = r8     // Catch:{ all -> 0x092c }
            r14.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r8 = r14.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r8 = (com.google.assistant.p3825an.p3836f.C49377c) r8     // Catch:{ all -> 0x092c }
            int r15 = r8.f127619a     // Catch:{ all -> 0x092c }
            r10 = 2
            r15 = r15 | r10
            r8.f127619a = r15     // Catch:{ all -> 0x092c }
            java.lang.String r15 = "https://assistant.google.com/services/invoke/uid/0000004f0e04d1da?intent=WORKFLOW_TRIGGER&param.asst=create_family_bell"
            r8.f127621c = r15     // Catch:{ all -> 0x092c }
            r14.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r8 = r14.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r8 = (com.google.assistant.p3825an.p3836f.C49377c) r8     // Catch:{ all -> 0x092c }
            int r15 = r8.f127619a     // Catch:{ all -> 0x092c }
            r15 = r15 | 4
            r8.f127619a = r15     // Catch:{ all -> 0x092c }
            r15 = 0
            r8.f127622d = r15     // Catch:{ all -> 0x092c }
            r13.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r8 = r13.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r8 = (com.google.assistant.p3825an.p3836f.C49380f) r8     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r14 = r14.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r14 = (com.google.assistant.p3825an.p3836f.C49377c) r14     // Catch:{ all -> 0x092c }
            r14.getClass()     // Catch:{ all -> 0x092c }
            r8.f127631b = r14     // Catch:{ all -> 0x092c }
            int r14 = r8.f127630a     // Catch:{ all -> 0x092c }
            r15 = 1
            r14 = r14 | r15
            r8.f127630a = r14     // Catch:{ all -> 0x092c }
            r13.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r8 = r13.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r8 = (com.google.assistant.p3825an.p3836f.C49380f) r8     // Catch:{ all -> 0x092c }
            int r14 = r8.f127630a     // Catch:{ all -> 0x092c }
            r14 = r14 | r10
            r8.f127630a = r14     // Catch:{ all -> 0x092c }
            java.lang.String r14 = "https://www.gstatic.com/assistant/verticals/family/family_bell.svg"
            r8.f127632c = r14     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r8 = com.google.assistant.p3825an.p3836f.C49379e.f127623d     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.d r8 = (com.google.assistant.p3825an.p3836f.C49378d) r8     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r14 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r14 = (com.google.assistant.p3825an.p3836f.C49379e) r14     // Catch:{ all -> 0x092c }
            int r15 = r14.f127625a     // Catch:{ all -> 0x092c }
            r16 = 1
            r15 = r15 | 1
            r14.f127625a = r15     // Catch:{ all -> 0x092c }
            java.lang.String r15 = "E2E - Family Bell"
            r14.f127626b = r15     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r14 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r14 = (com.google.assistant.p3825an.p3836f.C49379e) r14     // Catch:{ all -> 0x092c }
            int r15 = r14.f127625a     // Catch:{ all -> 0x092c }
            r15 = r15 | r10
            r14.f127625a = r15     // Catch:{ all -> 0x092c }
            java.lang.String r15 = "Schedule announcements with Assistant"
            r14.f127627c = r15     // Catch:{ all -> 0x092c }
            r13.mo53239a(r8)     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r8 = r13.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r8 = (com.google.assistant.p3825an.p3836f.C49380f) r8     // Catch:{ all -> 0x092c }
            r12.add(r8)     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r8 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r8 = (com.google.assistant.p3825an.p3836f.C49373a) r8     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r13 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r13 = r13.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.b r13 = (com.google.assistant.p3825an.p3836f.C49376b) r13     // Catch:{ all -> 0x092c }
            r13.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r14 = r13.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r14 = (com.google.assistant.p3825an.p3836f.C49377c) r14     // Catch:{ all -> 0x092c }
            r15 = 1
            r14.f127620b = r15     // Catch:{ all -> 0x092c }
            int r10 = r14.f127619a     // Catch:{ all -> 0x092c }
            r10 = r10 | r15
            r14.f127619a = r10     // Catch:{ all -> 0x092c }
            r13.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r13.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r10 = (com.google.assistant.p3825an.p3836f.C49377c) r10     // Catch:{ all -> 0x092c }
            int r14 = r10.f127619a     // Catch:{ all -> 0x092c }
            r15 = 2
            r14 = r14 | r15
            r10.f127619a = r14     // Catch:{ all -> 0x092c }
            java.lang.String r14 = "https://assistant.google.com/services/invoke/uid/0000004f0e04d1da?intent=WORKFLOW_TRIGGER&param.asst=find_family"
            r10.f127621c = r14     // Catch:{ all -> 0x092c }
            r13.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r13.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r10 = (com.google.assistant.p3825an.p3836f.C49377c) r10     // Catch:{ all -> 0x092c }
            int r14 = r10.f127619a     // Catch:{ all -> 0x092c }
            r14 = r14 | 4
            r10.f127619a = r14     // Catch:{ all -> 0x092c }
            r14 = 0
            r10.f127622d = r14     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r10 = (com.google.assistant.p3825an.p3836f.C49380f) r10     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r13 = r13.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r13 = (com.google.assistant.p3825an.p3836f.C49377c) r13     // Catch:{ all -> 0x092c }
            r13.getClass()     // Catch:{ all -> 0x092c }
            r10.f127631b = r13     // Catch:{ all -> 0x092c }
            int r13 = r10.f127630a     // Catch:{ all -> 0x092c }
            r14 = 1
            r13 = r13 | r14
            r10.f127630a = r13     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r10 = (com.google.assistant.p3825an.p3836f.C49380f) r10     // Catch:{ all -> 0x092c }
            int r13 = r10.f127630a     // Catch:{ all -> 0x092c }
            r14 = 2
            r13 = r13 | r14
            r10.f127630a = r13     // Catch:{ all -> 0x092c }
            java.lang.String r13 = "https://fonts.gstatic.com/s/i/googlematerialicons/person_pin_circle/v15/24px.svg"
            r10.f127632c = r13     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r10 = com.google.assistant.p3825an.p3836f.C49379e.f127623d     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.d r10 = (com.google.assistant.p3825an.p3836f.C49378d) r10     // Catch:{ all -> 0x092c }
            r10.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r13 = r10.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r13 = (com.google.assistant.p3825an.p3836f.C49379e) r13     // Catch:{ all -> 0x092c }
            int r14 = r13.f127625a     // Catch:{ all -> 0x092c }
            r15 = 1
            r14 = r14 | r15
            r13.f127625a = r14     // Catch:{ all -> 0x092c }
            java.lang.String r14 = "E2E - Where is my family"
            r13.f127626b = r14     // Catch:{ all -> 0x092c }
            r10.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r13 = r10.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r13 = (com.google.assistant.p3825an.p3836f.C49379e) r13     // Catch:{ all -> 0x092c }
            int r14 = r13.f127625a     // Catch:{ all -> 0x092c }
            r15 = 2
            r14 = r14 | r15
            r13.f127625a = r14     // Catch:{ all -> 0x092c }
            java.lang.String r14 = "Find out where your loved ones are"
            r13.f127627c = r14     // Catch:{ all -> 0x092c }
            r8.mo53239a(r10)     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r8 = (com.google.assistant.p3825an.p3836f.C49380f) r8     // Catch:{ all -> 0x092c }
            r12.add(r8)     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r8 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r8 = (com.google.assistant.p3825an.p3836f.C49373a) r8     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r10 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.b r10 = (com.google.assistant.p3825an.p3836f.C49376b) r10     // Catch:{ all -> 0x092c }
            r10.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r13 = r10.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r13 = (com.google.assistant.p3825an.p3836f.C49377c) r13     // Catch:{ all -> 0x092c }
            r14 = 1
            r13.f127620b = r14     // Catch:{ all -> 0x092c }
            int r15 = r13.f127619a     // Catch:{ all -> 0x092c }
            r15 = r15 | r14
            r13.f127619a = r15     // Catch:{ all -> 0x092c }
            r10.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r13 = r10.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r13 = (com.google.assistant.p3825an.p3836f.C49377c) r13     // Catch:{ all -> 0x092c }
            int r14 = r13.f127619a     // Catch:{ all -> 0x092c }
            r15 = 2
            r14 = r14 | r15
            r13.f127619a = r14     // Catch:{ all -> 0x092c }
            java.lang.String r14 = "https://assistant.google.com/services/invoke/uid/0000004f0e04d1da?intent=WORKFLOW_TRIGGER&param.asst=show_reminder"
            r13.f127621c = r14     // Catch:{ all -> 0x092c }
            r10.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r13 = r10.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r13 = (com.google.assistant.p3825an.p3836f.C49377c) r13     // Catch:{ all -> 0x092c }
            int r14 = r13.f127619a     // Catch:{ all -> 0x092c }
            r14 = r14 | 4
            r13.f127619a = r14     // Catch:{ all -> 0x092c }
            r14 = 0
            r13.f127622d = r14     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r13 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r13 = (com.google.assistant.p3825an.p3836f.C49380f) r13     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r10.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r10 = (com.google.assistant.p3825an.p3836f.C49377c) r10     // Catch:{ all -> 0x092c }
            r10.getClass()     // Catch:{ all -> 0x092c }
            r13.f127631b = r10     // Catch:{ all -> 0x092c }
            int r10 = r13.f127630a     // Catch:{ all -> 0x092c }
            r14 = 1
            r10 = r10 | r14
            r13.f127630a = r10     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r10 = (com.google.assistant.p3825an.p3836f.C49380f) r10     // Catch:{ all -> 0x092c }
            int r13 = r10.f127630a     // Catch:{ all -> 0x092c }
            r14 = 2
            r13 = r13 | r14
            r10.f127630a = r13     // Catch:{ all -> 0x092c }
            r10.f127632c = r7     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r10 = com.google.assistant.p3825an.p3836f.C49379e.f127623d     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.d r10 = (com.google.assistant.p3825an.p3836f.C49378d) r10     // Catch:{ all -> 0x092c }
            r10.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r13 = r10.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r13 = (com.google.assistant.p3825an.p3836f.C49379e) r13     // Catch:{ all -> 0x092c }
            int r14 = r13.f127625a     // Catch:{ all -> 0x092c }
            r15 = 1
            r14 = r14 | r15
            r13.f127625a = r14     // Catch:{ all -> 0x092c }
            java.lang.String r14 = "E2E - Show My Reminders"
            r13.f127626b = r14     // Catch:{ all -> 0x092c }
            r10.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r13 = r10.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r13 = (com.google.assistant.p3825an.p3836f.C49379e) r13     // Catch:{ all -> 0x092c }
            int r14 = r13.f127625a     // Catch:{ all -> 0x092c }
            r15 = 2
            r14 = r14 | r15
            r13.f127625a = r14     // Catch:{ all -> 0x092c }
            java.lang.String r14 = "See all your reminders in one place"
            r13.f127627c = r14     // Catch:{ all -> 0x092c }
            r8.mo53239a(r10)     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r8 = (com.google.assistant.p3825an.p3836f.C49380f) r8     // Catch:{ all -> 0x092c }
            r12.add(r8)     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r8 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r8 = (com.google.assistant.p3825an.p3836f.C49373a) r8     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r10 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r10 = r10.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.b r10 = (com.google.assistant.p3825an.p3836f.C49376b) r10     // Catch:{ all -> 0x092c }
            r10.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r13 = r10.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r13 = (com.google.assistant.p3825an.p3836f.C49377c) r13     // Catch:{ all -> 0x092c }
            r14 = 1
            r13.f127620b = r14     // Catch:{ all -> 0x092c }
            int r15 = r13.f127619a     // Catch:{ all -> 0x092c }
            r15 = r15 | r14
            r13.f127619a = r15     // Catch:{ all -> 0x092c }
            r10.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r13 = r10.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r13 = (com.google.assistant.p3825an.p3836f.C49377c) r13     // Catch:{ all -> 0x092c }
            int r14 = r13.f127619a     // Catch:{ all -> 0x092c }
            r15 = 2
            r14 = r14 | r15
            r13.f127619a = r14     // Catch:{ all -> 0x092c }
            java.lang.String r14 = "https://assistant.google.com/services/invoke/uid/0000004f0e04d1da?intent=WORKFLOW_TRIGGER&param.asst=create_reminder"
            r13.f127621c = r14     // Catch:{ all -> 0x092c }
            r10.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r13 = r10.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r13 = (com.google.assistant.p3825an.p3836f.C49377c) r13     // Catch:{ all -> 0x092c }
            int r14 = r13.f127619a     // Catch:{ all -> 0x092c }
            r14 = r14 | 4
            r13.f127619a = r14     // Catch:{ all -> 0x092c }
            r14 = 0
            r13.f127622d = r14     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r13 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r13 = (com.google.assistant.p3825an.p3836f.C49380f) r13     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r10.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r10 = (com.google.assistant.p3825an.p3836f.C49377c) r10     // Catch:{ all -> 0x092c }
            r10.getClass()     // Catch:{ all -> 0x092c }
            r13.f127631b = r10     // Catch:{ all -> 0x092c }
            int r10 = r13.f127630a     // Catch:{ all -> 0x092c }
            r14 = 1
            r10 = r10 | r14
            r13.f127630a = r10     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r10 = (com.google.assistant.p3825an.p3836f.C49380f) r10     // Catch:{ all -> 0x092c }
            int r13 = r10.f127630a     // Catch:{ all -> 0x092c }
            r14 = 2
            r13 = r13 | r14
            r10.f127630a = r13     // Catch:{ all -> 0x092c }
            r10.f127632c = r7     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r7 = com.google.assistant.p3825an.p3836f.C49379e.f127623d     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.d r7 = (com.google.assistant.p3825an.p3836f.C49378d) r7     // Catch:{ all -> 0x092c }
            r7.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r10 = (com.google.assistant.p3825an.p3836f.C49379e) r10     // Catch:{ all -> 0x092c }
            int r13 = r10.f127625a     // Catch:{ all -> 0x092c }
            r14 = 1
            r13 = r13 | r14
            r10.f127625a = r13     // Catch:{ all -> 0x092c }
            java.lang.String r13 = "E2E - Set a reminder"
            r10.f127626b = r13     // Catch:{ all -> 0x092c }
            r7.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r10 = (com.google.assistant.p3825an.p3836f.C49379e) r10     // Catch:{ all -> 0x092c }
            int r13 = r10.f127625a     // Catch:{ all -> 0x092c }
            r14 = 2
            r13 = r13 | r14
            r10.f127625a = r13     // Catch:{ all -> 0x092c }
            java.lang.String r13 = "Assistant keeps track of your to-dos"
            r10.f127627c = r13     // Catch:{ all -> 0x092c }
            r8.mo53239a(r7)     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r7 = r8.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r7 = (com.google.assistant.p3825an.p3836f.C49380f) r7     // Catch:{ all -> 0x092c }
            r12.add(r7)     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r7 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r7 = (com.google.assistant.p3825an.p3836f.C49373a) r7     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r8 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.b r8 = (com.google.assistant.p3825an.p3836f.C49376b) r8     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r10 = (com.google.assistant.p3825an.p3836f.C49377c) r10     // Catch:{ all -> 0x092c }
            r13 = 2
            r10.f127620b = r13     // Catch:{ all -> 0x092c }
            int r13 = r10.f127619a     // Catch:{ all -> 0x092c }
            r14 = 1
            r13 = r13 | r14
            r10.f127619a = r13     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r10 = (com.google.assistant.p3825an.p3836f.C49377c) r10     // Catch:{ all -> 0x092c }
            int r13 = r10.f127619a     // Catch:{ all -> 0x092c }
            r14 = 2
            r13 = r13 | r14
            r10.f127619a = r13     // Catch:{ all -> 0x092c }
            java.lang.String r13 = "https://shoppinglist.google.com"
            r10.f127621c = r13     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r10 = (com.google.assistant.p3825an.p3836f.C49377c) r10     // Catch:{ all -> 0x092c }
            int r13 = r10.f127619a     // Catch:{ all -> 0x092c }
            r13 = r13 | 4
            r10.f127619a = r13     // Catch:{ all -> 0x092c }
            r13 = 0
            r10.f127622d = r13     // Catch:{ all -> 0x092c }
            r7.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r10 = (com.google.assistant.p3825an.p3836f.C49380f) r10     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r8 = (com.google.assistant.p3825an.p3836f.C49377c) r8     // Catch:{ all -> 0x092c }
            r8.getClass()     // Catch:{ all -> 0x092c }
            r10.f127631b = r8     // Catch:{ all -> 0x092c }
            int r8 = r10.f127630a     // Catch:{ all -> 0x092c }
            r13 = 1
            r8 = r8 | r13
            r10.f127630a = r8     // Catch:{ all -> 0x092c }
            r7.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r8 = (com.google.assistant.p3825an.p3836f.C49380f) r8     // Catch:{ all -> 0x092c }
            int r10 = r8.f127630a     // Catch:{ all -> 0x092c }
            r13 = 2
            r10 = r10 | r13
            r8.f127630a = r10     // Catch:{ all -> 0x092c }
            java.lang.String r10 = "https://www.gstatic.com/assistant/verticals/shopping/shopping_googblue500.svg"
            r8.f127632c = r10     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r8 = com.google.assistant.p3825an.p3836f.C49379e.f127623d     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.d r8 = (com.google.assistant.p3825an.p3836f.C49378d) r8     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r10 = (com.google.assistant.p3825an.p3836f.C49379e) r10     // Catch:{ all -> 0x092c }
            int r13 = r10.f127625a     // Catch:{ all -> 0x092c }
            r14 = 1
            r13 = r13 | r14
            r10.f127625a = r13     // Catch:{ all -> 0x092c }
            java.lang.String r13 = "E2E - Shopping list"
            r10.f127626b = r13     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r10 = (com.google.assistant.p3825an.p3836f.C49379e) r10     // Catch:{ all -> 0x092c }
            int r13 = r10.f127625a     // Catch:{ all -> 0x092c }
            r14 = 2
            r13 = r13 | r14
            r10.f127625a = r13     // Catch:{ all -> 0x092c }
            java.lang.String r13 = "View the items in your shopping list"
            r10.f127627c = r13     // Catch:{ all -> 0x092c }
            r7.mo53239a(r8)     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r7 = r7.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r7 = (com.google.assistant.p3825an.p3836f.C49380f) r7     // Catch:{ all -> 0x092c }
            r12.add(r7)     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r7 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r7 = (com.google.assistant.p3825an.p3836f.C49373a) r7     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r8 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.b r8 = (com.google.assistant.p3825an.p3836f.C49376b) r8     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r10 = (com.google.assistant.p3825an.p3836f.C49377c) r10     // Catch:{ all -> 0x092c }
            r13 = 1
            r10.f127620b = r13     // Catch:{ all -> 0x092c }
            int r14 = r10.f127619a     // Catch:{ all -> 0x092c }
            r14 = r14 | r13
            r10.f127619a = r14     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r10 = (com.google.assistant.p3825an.p3836f.C49377c) r10     // Catch:{ all -> 0x092c }
            int r13 = r10.f127619a     // Catch:{ all -> 0x092c }
            r14 = 2
            r13 = r13 | r14
            r10.f127619a = r13     // Catch:{ all -> 0x092c }
            r10.f127621c = r6     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r10 = (com.google.assistant.p3825an.p3836f.C49377c) r10     // Catch:{ all -> 0x092c }
            int r13 = r10.f127619a     // Catch:{ all -> 0x092c }
            r13 = r13 | 4
            r10.f127619a = r13     // Catch:{ all -> 0x092c }
            r13 = 0
            r10.f127622d = r13     // Catch:{ all -> 0x092c }
            r7.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r7.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r10 = (com.google.assistant.p3825an.p3836f.C49380f) r10     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r8 = (com.google.assistant.p3825an.p3836f.C49377c) r8     // Catch:{ all -> 0x092c }
            r8.getClass()     // Catch:{ all -> 0x092c }
            r10.f127631b = r8     // Catch:{ all -> 0x092c }
            int r8 = r10.f127630a     // Catch:{ all -> 0x092c }
            r13 = 1
            r8 = r8 | r13
            r10.f127630a = r8     // Catch:{ all -> 0x092c }
            r7.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r8 = r7.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r8 = (com.google.assistant.p3825an.p3836f.C49380f) r8     // Catch:{ all -> 0x092c }
            int r10 = r8.f127630a     // Catch:{ all -> 0x092c }
            r13 = 2
            r10 = r10 | r13
            r8.f127630a = r10     // Catch:{ all -> 0x092c }
            r8.f127632c = r5     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r8 = com.google.assistant.p3825an.p3836f.C49379e.f127623d     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.d r8 = (com.google.assistant.p3825an.p3836f.C49378d) r8     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r10 = (com.google.assistant.p3825an.p3836f.C49379e) r10     // Catch:{ all -> 0x092c }
            int r13 = r10.f127625a     // Catch:{ all -> 0x092c }
            r14 = 1
            r13 = r13 | r14
            r10.f127625a = r13     // Catch:{ all -> 0x092c }
            java.lang.String r13 = "E2E - Interpreter mode"
            r10.f127626b = r13     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r10 = (com.google.assistant.p3825an.p3836f.C49379e) r10     // Catch:{ all -> 0x092c }
            int r13 = r10.f127625a     // Catch:{ all -> 0x092c }
            r14 = 2
            r13 = r13 | r14
            r10.f127625a = r13     // Catch:{ all -> 0x092c }
            r10.f127627c = r4     // Catch:{ all -> 0x092c }
            r7.mo53239a(r8)     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r7 = r7.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r7 = (com.google.assistant.p3825an.p3836f.C49380f) r7     // Catch:{ all -> 0x092c }
            r12.add(r7)     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r7 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r7 = (com.google.assistant.p3825an.p3836f.C49373a) r7     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r8 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r8 = r8.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.b r8 = (com.google.assistant.p3825an.p3836f.C49376b) r8     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r10 = (com.google.assistant.p3825an.p3836f.C49377c) r10     // Catch:{ all -> 0x092c }
            r13 = 1
            r10.f127620b = r13     // Catch:{ all -> 0x092c }
            int r14 = r10.f127619a     // Catch:{ all -> 0x092c }
            r14 = r14 | r13
            r10.f127619a = r14     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r10 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r10 = (com.google.assistant.p3825an.p3836f.C49377c) r10     // Catch:{ all -> 0x092c }
            int r13 = r10.f127619a     // Catch:{ all -> 0x092c }
            r14 = 2
            r13 = r13 | r14
            r10.f127619a = r13     // Catch:{ all -> 0x092c }
            r10.f127621c = r6     // Catch:{ all -> 0x092c }
            r8.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r8.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r6 = (com.google.assistant.p3825an.p3836f.C49377c) r6     // Catch:{ all -> 0x092c }
            int r10 = r6.f127619a     // Catch:{ all -> 0x092c }
            r10 = r10 | 4
            r6.f127619a = r10     // Catch:{ all -> 0x092c }
            r10 = 0
            r6.f127622d = r10     // Catch:{ all -> 0x092c }
            r7.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r7.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r6 = (com.google.assistant.p3825an.p3836f.C49380f) r6     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r8 = r8.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r8 = (com.google.assistant.p3825an.p3836f.C49377c) r8     // Catch:{ all -> 0x092c }
            r8.getClass()     // Catch:{ all -> 0x092c }
            r6.f127631b = r8     // Catch:{ all -> 0x092c }
            int r8 = r6.f127630a     // Catch:{ all -> 0x092c }
            r10 = 1
            r8 = r8 | r10
            r6.f127630a = r8     // Catch:{ all -> 0x092c }
            r7.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r7.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r6 = (com.google.assistant.p3825an.p3836f.C49380f) r6     // Catch:{ all -> 0x092c }
            int r8 = r6.f127630a     // Catch:{ all -> 0x092c }
            r10 = 2
            r8 = r8 | r10
            r6.f127630a = r8     // Catch:{ all -> 0x092c }
            r6.f127632c = r5     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r5 = com.google.assistant.p3825an.p3836f.C49379e.f127623d     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.d r5 = (com.google.assistant.p3825an.p3836f.C49378d) r5     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r6 = (com.google.assistant.p3825an.p3836f.C49379e) r6     // Catch:{ all -> 0x092c }
            int r8 = r6.f127625a     // Catch:{ all -> 0x092c }
            r10 = 1
            r8 = r8 | r10
            r6.f127625a = r8     // Catch:{ all -> 0x092c }
            java.lang.String r8 = "E2E - Be my translator"
            r6.f127626b = r8     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r6 = (com.google.assistant.p3825an.p3836f.C49379e) r6     // Catch:{ all -> 0x092c }
            int r8 = r6.f127625a     // Catch:{ all -> 0x092c }
            r10 = 2
            r8 = r8 | r10
            r6.f127625a = r8     // Catch:{ all -> 0x092c }
            r6.f127627c = r4     // Catch:{ all -> 0x092c }
            r7.mo53239a(r5)     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r7.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r4 = (com.google.assistant.p3825an.p3836f.C49380f) r4     // Catch:{ all -> 0x092c }
            r12.add(r4)     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r4 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r4 = (com.google.assistant.p3825an.p3836f.C49373a) r4     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r5 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.b r5 = (com.google.assistant.p3825an.p3836f.C49376b) r5     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r6 = (com.google.assistant.p3825an.p3836f.C49377c) r6     // Catch:{ all -> 0x092c }
            r7 = 1
            r6.f127620b = r7     // Catch:{ all -> 0x092c }
            int r8 = r6.f127619a     // Catch:{ all -> 0x092c }
            r8 = r8 | r7
            r6.f127619a = r8     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r6 = (com.google.assistant.p3825an.p3836f.C49377c) r6     // Catch:{ all -> 0x092c }
            int r7 = r6.f127619a     // Catch:{ all -> 0x092c }
            r8 = 2
            r7 = r7 | r8
            r6.f127619a = r7     // Catch:{ all -> 0x092c }
            java.lang.String r7 = "https://assistant.google.com/services/invoke/uid/0000004f0e04d1da?intent=WORKFLOW_TRIGGER&param.workflow_id=routine_0000001"
            r6.f127621c = r7     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r6 = (com.google.assistant.p3825an.p3836f.C49377c) r6     // Catch:{ all -> 0x092c }
            int r7 = r6.f127619a     // Catch:{ all -> 0x092c }
            r7 = r7 | 4
            r6.f127619a = r7     // Catch:{ all -> 0x092c }
            r7 = 0
            r6.f127622d = r7     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r6 = (com.google.assistant.p3825an.p3836f.C49380f) r6     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r5 = (com.google.assistant.p3825an.p3836f.C49377c) r5     // Catch:{ all -> 0x092c }
            r5.getClass()     // Catch:{ all -> 0x092c }
            r6.f127631b = r5     // Catch:{ all -> 0x092c }
            int r5 = r6.f127630a     // Catch:{ all -> 0x092c }
            r7 = 1
            r5 = r5 | r7
            r6.f127630a = r5     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r5 = (com.google.assistant.p3825an.p3836f.C49380f) r5     // Catch:{ all -> 0x092c }
            int r6 = r5.f127630a     // Catch:{ all -> 0x092c }
            r7 = 2
            r6 = r6 | r7
            r5.f127630a = r6     // Catch:{ all -> 0x092c }
            java.lang.String r6 = "https://www.gstatic.com/assistant/settings/good_morning_routine.svg"
            r5.f127632c = r6     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r5 = com.google.assistant.p3825an.p3836f.C49379e.f127623d     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.d r5 = (com.google.assistant.p3825an.p3836f.C49378d) r5     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r6 = (com.google.assistant.p3825an.p3836f.C49379e) r6     // Catch:{ all -> 0x092c }
            int r7 = r6.f127625a     // Catch:{ all -> 0x092c }
            r8 = 1
            r7 = r7 | r8
            r6.f127625a = r7     // Catch:{ all -> 0x092c }
            java.lang.String r7 = "\"Good morning\" routine"
            r6.f127626b = r7     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r6 = (com.google.assistant.p3825an.p3836f.C49379e) r6     // Catch:{ all -> 0x092c }
            int r7 = r6.f127625a     // Catch:{ all -> 0x092c }
            r8 = 2
            r7 = r7 | r8
            r6.f127625a = r7     // Catch:{ all -> 0x092c }
            java.lang.String r7 = "Start the \"Good morning\" routine"
            r6.f127627c = r7     // Catch:{ all -> 0x092c }
            r4.mo53239a(r5)     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r4 = (com.google.assistant.p3825an.p3836f.C49380f) r4     // Catch:{ all -> 0x092c }
            r12.add(r4)     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r4 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r4 = (com.google.assistant.p3825an.p3836f.C49373a) r4     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r5 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.b r5 = (com.google.assistant.p3825an.p3836f.C49376b) r5     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r6 = (com.google.assistant.p3825an.p3836f.C49377c) r6     // Catch:{ all -> 0x092c }
            r7 = 1
            r6.f127620b = r7     // Catch:{ all -> 0x092c }
            int r8 = r6.f127619a     // Catch:{ all -> 0x092c }
            r8 = r8 | r7
            r6.f127619a = r8     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r6 = (com.google.assistant.p3825an.p3836f.C49377c) r6     // Catch:{ all -> 0x092c }
            int r7 = r6.f127619a     // Catch:{ all -> 0x092c }
            r8 = 2
            r7 = r7 | r8
            r6.f127619a = r7     // Catch:{ all -> 0x092c }
            java.lang.String r7 = "https://assistant.google.com/services/invoke/uid/0000004f0e04d1da?intent=WORKFLOW_TRIGGER&param.workflow_id=routine_0000002"
            r6.f127621c = r7     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r6 = (com.google.assistant.p3825an.p3836f.C49377c) r6     // Catch:{ all -> 0x092c }
            int r7 = r6.f127619a     // Catch:{ all -> 0x092c }
            r7 = r7 | 4
            r6.f127619a = r7     // Catch:{ all -> 0x092c }
            r7 = 0
            r6.f127622d = r7     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r6 = (com.google.assistant.p3825an.p3836f.C49380f) r6     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r5 = (com.google.assistant.p3825an.p3836f.C49377c) r5     // Catch:{ all -> 0x092c }
            r5.getClass()     // Catch:{ all -> 0x092c }
            r6.f127631b = r5     // Catch:{ all -> 0x092c }
            int r5 = r6.f127630a     // Catch:{ all -> 0x092c }
            r7 = 1
            r5 = r5 | r7
            r6.f127630a = r5     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r5 = (com.google.assistant.p3825an.p3836f.C49380f) r5     // Catch:{ all -> 0x092c }
            int r6 = r5.f127630a     // Catch:{ all -> 0x092c }
            r7 = 2
            r6 = r6 | r7
            r5.f127630a = r6     // Catch:{ all -> 0x092c }
            java.lang.String r6 = "https://www.gstatic.com/assistant/settings/bed_time_routine.svg"
            r5.f127632c = r6     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r5 = com.google.assistant.p3825an.p3836f.C49379e.f127623d     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.d r5 = (com.google.assistant.p3825an.p3836f.C49378d) r5     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r6 = (com.google.assistant.p3825an.p3836f.C49379e) r6     // Catch:{ all -> 0x092c }
            int r7 = r6.f127625a     // Catch:{ all -> 0x092c }
            r8 = 1
            r7 = r7 | r8
            r6.f127625a = r7     // Catch:{ all -> 0x092c }
            java.lang.String r7 = "E2E - Bedtime routine"
            r6.f127626b = r7     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r6 = (com.google.assistant.p3825an.p3836f.C49379e) r6     // Catch:{ all -> 0x092c }
            int r7 = r6.f127625a     // Catch:{ all -> 0x092c }
            r8 = 2
            r7 = r7 | r8
            r6.f127625a = r7     // Catch:{ all -> 0x092c }
            java.lang.String r7 = "Start the Bedtime routine"
            r6.f127627c = r7     // Catch:{ all -> 0x092c }
            r4.mo53239a(r5)     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r4 = (com.google.assistant.p3825an.p3836f.C49380f) r4     // Catch:{ all -> 0x092c }
            r12.add(r4)     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r4 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r4 = (com.google.assistant.p3825an.p3836f.C49373a) r4     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r5 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.b r5 = (com.google.assistant.p3825an.p3836f.C49376b) r5     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r6 = (com.google.assistant.p3825an.p3836f.C49377c) r6     // Catch:{ all -> 0x092c }
            r7 = 1
            r6.f127620b = r7     // Catch:{ all -> 0x092c }
            int r8 = r6.f127619a     // Catch:{ all -> 0x092c }
            r8 = r8 | r7
            r6.f127619a = r8     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r6 = (com.google.assistant.p3825an.p3836f.C49377c) r6     // Catch:{ all -> 0x092c }
            int r7 = r6.f127619a     // Catch:{ all -> 0x092c }
            r8 = 2
            r7 = r7 | r8
            r6.f127619a = r7     // Catch:{ all -> 0x092c }
            java.lang.String r7 = "https://assistant.google.com/services/invoke/uid/0000004f0e04d1da?intent=WORKFLOW_TRIGGER&param.workflow_id=routine_0000003"
            r6.f127621c = r7     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r6 = (com.google.assistant.p3825an.p3836f.C49377c) r6     // Catch:{ all -> 0x092c }
            int r7 = r6.f127619a     // Catch:{ all -> 0x092c }
            r7 = r7 | 4
            r6.f127619a = r7     // Catch:{ all -> 0x092c }
            r7 = 0
            r6.f127622d = r7     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r6 = (com.google.assistant.p3825an.p3836f.C49380f) r6     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r5 = (com.google.assistant.p3825an.p3836f.C49377c) r5     // Catch:{ all -> 0x092c }
            r5.getClass()     // Catch:{ all -> 0x092c }
            r6.f127631b = r5     // Catch:{ all -> 0x092c }
            int r5 = r6.f127630a     // Catch:{ all -> 0x092c }
            r7 = 1
            r5 = r5 | r7
            r6.f127630a = r5     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r5 = (com.google.assistant.p3825an.p3836f.C49380f) r5     // Catch:{ all -> 0x092c }
            int r6 = r5.f127630a     // Catch:{ all -> 0x092c }
            r7 = 2
            r6 = r6 | r7
            r5.f127630a = r6     // Catch:{ all -> 0x092c }
            r5.f127632c = r3     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r5 = com.google.assistant.p3825an.p3836f.C49379e.f127623d     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.d r5 = (com.google.assistant.p3825an.p3836f.C49378d) r5     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r6 = (com.google.assistant.p3825an.p3836f.C49379e) r6     // Catch:{ all -> 0x092c }
            int r7 = r6.f127625a     // Catch:{ all -> 0x092c }
            r8 = 1
            r7 = r7 | r8
            r6.f127625a = r7     // Catch:{ all -> 0x092c }
            java.lang.String r7 = "E2E - \"Leaving home\" routine"
            r6.f127626b = r7     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r6 = (com.google.assistant.p3825an.p3836f.C49379e) r6     // Catch:{ all -> 0x092c }
            int r7 = r6.f127625a     // Catch:{ all -> 0x092c }
            r8 = 2
            r7 = r7 | r8
            r6.f127625a = r7     // Catch:{ all -> 0x092c }
            java.lang.String r7 = "Start the \"Leaving home\" routine"
            r6.f127627c = r7     // Catch:{ all -> 0x092c }
            r4.mo53239a(r5)     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r4 = (com.google.assistant.p3825an.p3836f.C49380f) r4     // Catch:{ all -> 0x092c }
            r12.add(r4)     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r4 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r4 = (com.google.assistant.p3825an.p3836f.C49373a) r4     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r5 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.b r5 = (com.google.assistant.p3825an.p3836f.C49376b) r5     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r6 = (com.google.assistant.p3825an.p3836f.C49377c) r6     // Catch:{ all -> 0x092c }
            r7 = 1
            r6.f127620b = r7     // Catch:{ all -> 0x092c }
            int r8 = r6.f127619a     // Catch:{ all -> 0x092c }
            r8 = r8 | r7
            r6.f127619a = r8     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r6 = (com.google.assistant.p3825an.p3836f.C49377c) r6     // Catch:{ all -> 0x092c }
            int r7 = r6.f127619a     // Catch:{ all -> 0x092c }
            r8 = 2
            r7 = r7 | r8
            r6.f127619a = r7     // Catch:{ all -> 0x092c }
            java.lang.String r7 = "https://assistant.google.com/services/invoke/uid/0000004f0e04d1da?intent=WORKFLOW_TRIGGER&param.workflow_id=routine_0000004"
            r6.f127621c = r7     // Catch:{ all -> 0x092c }
            r5.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r5.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r6 = (com.google.assistant.p3825an.p3836f.C49377c) r6     // Catch:{ all -> 0x092c }
            int r7 = r6.f127619a     // Catch:{ all -> 0x092c }
            r7 = r7 | 4
            r6.f127619a = r7     // Catch:{ all -> 0x092c }
            r7 = 0
            r6.f127622d = r7     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r6 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r6 = (com.google.assistant.p3825an.p3836f.C49380f) r6     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r5.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r5 = (com.google.assistant.p3825an.p3836f.C49377c) r5     // Catch:{ all -> 0x092c }
            r5.getClass()     // Catch:{ all -> 0x092c }
            r6.f127631b = r5     // Catch:{ all -> 0x092c }
            int r5 = r6.f127630a     // Catch:{ all -> 0x092c }
            r7 = 1
            r5 = r5 | r7
            r6.f127630a = r5     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r5 = (com.google.assistant.p3825an.p3836f.C49380f) r5     // Catch:{ all -> 0x092c }
            int r6 = r5.f127630a     // Catch:{ all -> 0x092c }
            r7 = 2
            r6 = r6 | r7
            r5.f127630a = r6     // Catch:{ all -> 0x092c }
            r5.f127632c = r3     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r3 = com.google.assistant.p3825an.p3836f.C49379e.f127623d     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.d r3 = (com.google.assistant.p3825an.p3836f.C49378d) r3     // Catch:{ all -> 0x092c }
            r3.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r5 = (com.google.assistant.p3825an.p3836f.C49379e) r5     // Catch:{ all -> 0x092c }
            int r6 = r5.f127625a     // Catch:{ all -> 0x092c }
            r7 = 1
            r6 = r6 | r7
            r5.f127625a = r6     // Catch:{ all -> 0x092c }
            java.lang.String r6 = "E2E - \"I'm home\" routine"
            r5.f127626b = r6     // Catch:{ all -> 0x092c }
            r3.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r5 = (com.google.assistant.p3825an.p3836f.C49379e) r5     // Catch:{ all -> 0x092c }
            int r6 = r5.f127625a     // Catch:{ all -> 0x092c }
            r7 = 2
            r6 = r6 | r7
            r5.f127625a = r6     // Catch:{ all -> 0x092c }
            java.lang.String r6 = "Start the \"I'm home\" routine"
            r5.f127627c = r6     // Catch:{ all -> 0x092c }
            r4.mo53239a(r3)     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r3 = r4.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r3 = (com.google.assistant.p3825an.p3836f.C49380f) r3     // Catch:{ all -> 0x092c }
            r12.add(r3)     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r3 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r3 = (com.google.assistant.p3825an.p3836f.C49373a) r3     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r4 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.b r4 = (com.google.assistant.p3825an.p3836f.C49376b) r4     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r5 = (com.google.assistant.p3825an.p3836f.C49377c) r5     // Catch:{ all -> 0x092c }
            r6 = 1
            r5.f127620b = r6     // Catch:{ all -> 0x092c }
            int r7 = r5.f127619a     // Catch:{ all -> 0x092c }
            r7 = r7 | r6
            r5.f127619a = r7     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r5 = (com.google.assistant.p3825an.p3836f.C49377c) r5     // Catch:{ all -> 0x092c }
            int r6 = r5.f127619a     // Catch:{ all -> 0x092c }
            r7 = 2
            r6 = r6 | r7
            r5.f127619a = r6     // Catch:{ all -> 0x092c }
            java.lang.String r6 = "https://assistant.google.com/services/invoke/uid/0000004f0e04d1da?intent=WORKFLOW_TRIGGER&param.workflow_id=routine_0000005"
            r5.f127621c = r6     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r5 = (com.google.assistant.p3825an.p3836f.C49377c) r5     // Catch:{ all -> 0x092c }
            int r6 = r5.f127619a     // Catch:{ all -> 0x092c }
            r6 = r6 | 4
            r5.f127619a = r6     // Catch:{ all -> 0x092c }
            r6 = 0
            r5.f127622d = r6     // Catch:{ all -> 0x092c }
            r3.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r5 = (com.google.assistant.p3825an.p3836f.C49380f) r5     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r4 = (com.google.assistant.p3825an.p3836f.C49377c) r4     // Catch:{ all -> 0x092c }
            r4.getClass()     // Catch:{ all -> 0x092c }
            r5.f127631b = r4     // Catch:{ all -> 0x092c }
            int r4 = r5.f127630a     // Catch:{ all -> 0x092c }
            r6 = 1
            r4 = r4 | r6
            r5.f127630a = r4     // Catch:{ all -> 0x092c }
            r3.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r4 = (com.google.assistant.p3825an.p3836f.C49380f) r4     // Catch:{ all -> 0x092c }
            int r5 = r4.f127630a     // Catch:{ all -> 0x092c }
            r6 = 2
            r5 = r5 | r6
            r4.f127630a = r5     // Catch:{ all -> 0x092c }
            r4.f127632c = r2     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r4 = com.google.assistant.p3825an.p3836f.C49379e.f127623d     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.d r4 = (com.google.assistant.p3825an.p3836f.C49378d) r4     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r5 = (com.google.assistant.p3825an.p3836f.C49379e) r5     // Catch:{ all -> 0x092c }
            int r6 = r5.f127625a     // Catch:{ all -> 0x092c }
            r7 = 1
            r6 = r6 | r7
            r5.f127625a = r6     // Catch:{ all -> 0x092c }
            java.lang.String r6 = "E2E - \"Commuting to work\" routine"
            r5.f127626b = r6     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r5 = (com.google.assistant.p3825an.p3836f.C49379e) r5     // Catch:{ all -> 0x092c }
            int r6 = r5.f127625a     // Catch:{ all -> 0x092c }
            r7 = 2
            r6 = r6 | r7
            r5.f127625a = r6     // Catch:{ all -> 0x092c }
            java.lang.String r6 = "Start the \"Commuting to work\" routine"
            r5.f127627c = r6     // Catch:{ all -> 0x092c }
            r3.mo53239a(r4)     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r3 = (com.google.assistant.p3825an.p3836f.C49380f) r3     // Catch:{ all -> 0x092c }
            r12.add(r3)     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r3 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r3 = (com.google.assistant.p3825an.p3836f.C49373a) r3     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r4 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r4 = r4.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.b r4 = (com.google.assistant.p3825an.p3836f.C49376b) r4     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r5 = (com.google.assistant.p3825an.p3836f.C49377c) r5     // Catch:{ all -> 0x092c }
            r6 = 1
            r5.f127620b = r6     // Catch:{ all -> 0x092c }
            int r7 = r5.f127619a     // Catch:{ all -> 0x092c }
            r7 = r7 | r6
            r5.f127619a = r7     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r5 = (com.google.assistant.p3825an.p3836f.C49377c) r5     // Catch:{ all -> 0x092c }
            int r6 = r5.f127619a     // Catch:{ all -> 0x092c }
            r7 = 2
            r6 = r6 | r7
            r5.f127619a = r6     // Catch:{ all -> 0x092c }
            java.lang.String r6 = "https://assistant.google.com/services/invoke/uid/0000004f0e04d1da?intent=WORKFLOW_TRIGGER&param.workflow_id=routine_0000006"
            r5.f127621c = r6     // Catch:{ all -> 0x092c }
            r4.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r4.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r5 = (com.google.assistant.p3825an.p3836f.C49377c) r5     // Catch:{ all -> 0x092c }
            int r6 = r5.f127619a     // Catch:{ all -> 0x092c }
            r6 = r6 | 4
            r5.f127619a = r6     // Catch:{ all -> 0x092c }
            r6 = 0
            r5.f127622d = r6     // Catch:{ all -> 0x092c }
            r3.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r5 = (com.google.assistant.p3825an.p3836f.C49380f) r5     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r4.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r4 = (com.google.assistant.p3825an.p3836f.C49377c) r4     // Catch:{ all -> 0x092c }
            r4.getClass()     // Catch:{ all -> 0x092c }
            r5.f127631b = r4     // Catch:{ all -> 0x092c }
            int r4 = r5.f127630a     // Catch:{ all -> 0x092c }
            r6 = 1
            r4 = r4 | r6
            r5.f127630a = r4     // Catch:{ all -> 0x092c }
            r3.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r4 = (com.google.assistant.p3825an.p3836f.C49380f) r4     // Catch:{ all -> 0x092c }
            int r5 = r4.f127630a     // Catch:{ all -> 0x092c }
            r6 = 2
            r5 = r5 | r6
            r4.f127630a = r5     // Catch:{ all -> 0x092c }
            r4.f127632c = r2     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r2 = com.google.assistant.p3825an.p3836f.C49379e.f127623d     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.d r2 = (com.google.assistant.p3825an.p3836f.C49378d) r2     // Catch:{ all -> 0x092c }
            r2.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r4 = (com.google.assistant.p3825an.p3836f.C49379e) r4     // Catch:{ all -> 0x092c }
            int r5 = r4.f127625a     // Catch:{ all -> 0x092c }
            r6 = 1
            r5 = r5 | r6
            r4.f127625a = r5     // Catch:{ all -> 0x092c }
            java.lang.String r5 = "E2E - \"Commuting home\" routine"
            r4.f127626b = r5     // Catch:{ all -> 0x092c }
            r2.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r4 = (com.google.assistant.p3825an.p3836f.C49379e) r4     // Catch:{ all -> 0x092c }
            int r5 = r4.f127625a     // Catch:{ all -> 0x092c }
            r6 = 2
            r5 = r5 | r6
            r4.f127625a = r5     // Catch:{ all -> 0x092c }
            java.lang.String r5 = "Start the \"Commuting to home\" routine"
            r4.f127627c = r5     // Catch:{ all -> 0x092c }
            r3.mo53239a(r2)     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r2 = r3.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r2 = (com.google.assistant.p3825an.p3836f.C49380f) r2     // Catch:{ all -> 0x092c }
            r12.add(r2)     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r2 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r2 = r2.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r2 = (com.google.assistant.p3825an.p3836f.C49373a) r2     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r3 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.b r3 = (com.google.assistant.p3825an.p3836f.C49376b) r3     // Catch:{ all -> 0x092c }
            r3.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r4 = (com.google.assistant.p3825an.p3836f.C49377c) r4     // Catch:{ all -> 0x092c }
            r5 = 1
            r4.f127620b = r5     // Catch:{ all -> 0x092c }
            int r6 = r4.f127619a     // Catch:{ all -> 0x092c }
            r6 = r6 | r5
            r4.f127619a = r6     // Catch:{ all -> 0x092c }
            r3.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r4 = (com.google.assistant.p3825an.p3836f.C49377c) r4     // Catch:{ all -> 0x092c }
            int r5 = r4.f127619a     // Catch:{ all -> 0x092c }
            r6 = 2
            r5 = r5 | r6
            r4.f127619a = r5     // Catch:{ all -> 0x092c }
            java.lang.String r5 = "https://assistant.google.com/services/invoke/uid/0000004f0e04d1da?intent=WORKFLOW_TRIGGER&param.asst=create_broadcast"
            r4.f127621c = r5     // Catch:{ all -> 0x092c }
            r3.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r4 = (com.google.assistant.p3825an.p3836f.C49377c) r4     // Catch:{ all -> 0x092c }
            int r5 = r4.f127619a     // Catch:{ all -> 0x092c }
            r5 = r5 | 4
            r4.f127619a = r5     // Catch:{ all -> 0x092c }
            r5 = 0
            r4.f127622d = r5     // Catch:{ all -> 0x092c }
            r2.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r2.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r4 = (com.google.assistant.p3825an.p3836f.C49380f) r4     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r3 = (com.google.assistant.p3825an.p3836f.C49377c) r3     // Catch:{ all -> 0x092c }
            r3.getClass()     // Catch:{ all -> 0x092c }
            r4.f127631b = r3     // Catch:{ all -> 0x092c }
            int r3 = r4.f127630a     // Catch:{ all -> 0x092c }
            r5 = 1
            r3 = r3 | r5
            r4.f127630a = r3     // Catch:{ all -> 0x092c }
            r2.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r3 = r2.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r3 = (com.google.assistant.p3825an.p3836f.C49380f) r3     // Catch:{ all -> 0x092c }
            int r4 = r3.f127630a     // Catch:{ all -> 0x092c }
            r5 = 2
            r4 = r4 | r5
            r3.f127630a = r4     // Catch:{ all -> 0x092c }
            java.lang.String r4 = "https://www.gstatic.com/assistant/verticals/communication/family_broadcast.svg"
            r3.f127632c = r4     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r3 = com.google.assistant.p3825an.p3836f.C49379e.f127623d     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r3 = r3.createBuilder()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.d r3 = (com.google.assistant.p3825an.p3836f.C49378d) r3     // Catch:{ all -> 0x092c }
            r3.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r4 = (com.google.assistant.p3825an.p3836f.C49379e) r4     // Catch:{ all -> 0x092c }
            int r5 = r4.f127625a     // Catch:{ all -> 0x092c }
            r6 = 1
            r5 = r5 | r6
            r4.f127625a = r5     // Catch:{ all -> 0x092c }
            java.lang.String r5 = "E2E - Broadcast a message"
            r4.f127626b = r5     // Catch:{ all -> 0x092c }
            r3.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r4 = r3.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.e r4 = (com.google.assistant.p3825an.p3836f.C49379e) r4     // Catch:{ all -> 0x092c }
            int r5 = r4.f127625a     // Catch:{ all -> 0x092c }
            r6 = 2
            r5 = r5 | r6
            r4.f127625a = r5     // Catch:{ all -> 0x092c }
            java.lang.String r5 = "Broadcast to all home devices"
            r4.f127627c = r5     // Catch:{ all -> 0x092c }
            r2.mo53239a(r3)     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r2 = r2.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r2 = (com.google.assistant.p3825an.p3836f.C49380f) r2     // Catch:{ all -> 0x092c }
            r12.add(r2)     // Catch:{ all -> 0x092c }
            java.util.Iterator r2 = r12.iterator()     // Catch:{ all -> 0x092c }
        L_0x08bb:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x092c }
            if (r3 == 0) goto L_0x0923
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r3 = (com.google.assistant.p3825an.p3836f.C49380f) r3     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.c r4 = r3.f127631b     // Catch:{ all -> 0x092c }
            if (r4 != 0) goto L_0x08cd
            com.google.assistant.an.f.c r4 = com.google.assistant.p3825an.p3836f.C49377c.f127617e     // Catch:{ all -> 0x092c }
        L_0x08cd:
            boolean r4 = r4.f127622d     // Catch:{ all -> 0x092c }
            if (r4 != 0) goto L_0x08bb
            java.lang.String r4 = r3.f127632c     // Catch:{ all -> 0x092c }
            com.google.protobuf.z r4 = com.google.protobuf.C63088z.m96143E(r4)     // Catch:{ all -> 0x092c }
            boolean r5 = r4.mo59173M()     // Catch:{ all -> 0x092c }
            if (r5 == 0) goto L_0x08ff
            android.content.Context r4 = r11.f360253b     // Catch:{ all -> 0x092c }
            android.content.res.Resources r4 = r4.getResources()     // Catch:{ all -> 0x092c }
            r5 = 2131233854(0x7f080c3e, float:1.8083857E38)
            android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)     // Catch:{ all -> 0x092c }
            android.graphics.drawable.BitmapDrawable r4 = (android.graphics.drawable.BitmapDrawable) r4     // Catch:{ all -> 0x092c }
            android.graphics.Bitmap r4 = r4.getBitmap()     // Catch:{ all -> 0x092c }
            com.google.protobuf.y r5 = com.google.protobuf.C63088z.m96150v()     // Catch:{ all -> 0x092c }
            android.graphics.Bitmap$CompressFormat r6 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ all -> 0x092c }
            r7 = 100
            r4.compress(r6, r7, r5)     // Catch:{ all -> 0x092c }
            com.google.protobuf.z r4 = r5.mo59165b()     // Catch:{ all -> 0x092c }
        L_0x08ff:
            com.google.assistant.an.f.f r5 = com.google.assistant.p3825an.p3836f.C49380f.f127628f     // Catch:{ all -> 0x092c }
            com.google.protobuf.bn r3 = r5.createBuilder(r3)     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.a r3 = (com.google.assistant.p3825an.p3836f.C49373a) r3     // Catch:{ all -> 0x092c }
            r3.copyOnWrite()     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r5 = r3.instance     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r5 = (com.google.assistant.p3825an.p3836f.C49380f) r5     // Catch:{ all -> 0x092c }
            r4.getClass()     // Catch:{ all -> 0x092c }
            int r6 = r5.f127630a     // Catch:{ all -> 0x092c }
            r6 = r6 | 4
            r5.f127630a = r6     // Catch:{ all -> 0x092c }
            r5.f127633d = r4     // Catch:{ all -> 0x092c }
            com.google.protobuf.bv r3 = r3.build()     // Catch:{ all -> 0x092c }
            com.google.assistant.an.f.f r3 = (com.google.assistant.p3825an.p3836f.C49380f) r3     // Catch:{ all -> 0x092c }
            r3.writeTo(r9)     // Catch:{ all -> 0x092c }
            goto L_0x08bb
        L_0x0923:
            r9.close()     // Catch:{ Exception -> 0x0928 }
            r8 = 1
            goto L_0x0962
        L_0x0928:
            r0 = move-exception
            r2 = r0
            r6 = 0
            goto L_0x0953
        L_0x092c:
            r0 = move-exception
            r2 = r0
            r9.close()     // Catch:{ all -> 0x0933 }
        L_0x0931:
            r6 = 0
            goto L_0x094d
        L_0x0933:
            r0 = move-exception
            r3 = r0
            r4 = 1
            java.lang.Class[] r5 = new java.lang.Class[r4]     // Catch:{ Exception -> 0x0931 }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            r6 = 0
            r5[r6] = r4     // Catch:{ Exception -> 0x094d }
            java.lang.Class<java.lang.Throwable> r4 = java.lang.Throwable.class
            java.lang.String r7 = "addSuppressed"
            java.lang.reflect.Method r4 = r4.getDeclaredMethod(r7, r5)     // Catch:{ Exception -> 0x094d }
            r5 = 1
            java.lang.Object[] r5 = new java.lang.Object[r5]     // Catch:{ Exception -> 0x094d }
            r5[r6] = r3     // Catch:{ Exception -> 0x094d }
            r4.invoke(r2, r5)     // Catch:{ Exception -> 0x094d }
        L_0x094d:
            throw r2     // Catch:{ Exception -> 0x094e }
        L_0x094e:
            r0 = move-exception
            goto L_0x0952
        L_0x0950:
            r0 = move-exception
            r6 = 0
        L_0x0952:
            r2 = r0
        L_0x0953:
            com.google.common.f.a.d r3 = com.google.android.apps.search.assistant.verticals.p10036c.C131943i.f360252a
            com.google.common.f.x r3 = r3.mo56226d()
            java.lang.String r4 = "Error writing deeplink to AiAi stream."
            r5 = 39608(0x9ab8, float:5.5503E-41)
            ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) ((com.google.common.p4526f.p4527a.C58970a) r3).mo56382g(r2)).mo56372aa(r5)).mo56386p(r4)
            r8 = 0
        L_0x0962:
            androidx.d.a.c r2 = r1.f360249a
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r8)
            r2.mo5437b(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.verticals.p10036c.C131940f.onWrite(android.os.ParcelFileDescriptor):void");
    }
}
