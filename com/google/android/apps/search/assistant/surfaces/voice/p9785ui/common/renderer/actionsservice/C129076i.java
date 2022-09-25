package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice;

import com.google.android.apps.search.assistant.surfaces.voice.controller.p9517a.p9523c.p9524a.C126977d;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32433a;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32459r;
import com.google.common.p4526f.C59071e;
import kotlinx.coroutines.C71422aw;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.i */
/* compiled from: PG */
public final class C129076i {

    /* renamed from: a */
    public static final C59071e f354587a = C59071e.m91331h();

    /* renamed from: b */
    public final C71422aw f354588b;

    /* renamed from: c */
    public final C32459r f354589c;

    /* renamed from: d */
    private final C126977d f354590d;

    public C129076i(C71422aw awVar, C32459r rVar, C126977d dVar) {
        C69664n.m101061g(awVar, "lightweightScope");
        C69664n.m101061g(rVar, "sessionManager");
        C69664n.m101061g(dVar, "conversationActions");
        this.f354588b = awVar;
        this.f354589c = rVar;
        this.f354590d = dVar;
    }

    /* renamed from: a */
    public final C32433a mo108834a(String str) {
        C69664n.m101061g(str, "key");
        return (C32433a) this.f354589c.f86990a.get(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0023  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo108835b(com.google.assistant.p3897e.p3921j.apy r10, p5462h.p5466c.C69577g r11) {
        /*
            r9 = this;
            java.lang.String r0 = "newBuilder()"
            boolean r1 = r11 instanceof com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice.C129075h
            if (r1 == 0) goto L_0x0015
            r1 = r11
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.h r1 = (com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice.C129075h) r1
            int r2 = r1.f354586d
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L_0x0015
            int r2 = r2 - r3
            r1.f354586d = r2
            goto L_0x001a
        L_0x0015:
            com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.h r1 = new com.google.android.apps.search.assistant.surfaces.voice.ui.common.renderer.actionsservice.h
            r1.<init>(r9, r11)
        L_0x001a:
            java.lang.Object r11 = r1.f354584b
            h.c.a.a r2 = p5462h.p5466c.p5467a.C69554a.COROUTINE_SUSPENDED
            int r3 = r1.f354586d
            r4 = 1
            if (r3 == 0) goto L_0x0036
            if (r3 != r4) goto L_0x002e
            java.lang.Object r10 = r1.f354583a
            p5462h.C69714l.m101134b(r11)     // Catch:{ Exception -> 0x002c }
            goto L_0x00c3
        L_0x002c:
            r11 = move-exception
            goto L_0x0099
        L_0x002e:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L_0x0036:
            p5462h.C69714l.m101134b(r11)
            com.google.android.apps.search.assistant.surfaces.voice.controller.a.c.a.d r11 = r9.f354590d     // Catch:{ Exception -> 0x002c }
            com.google.android.apps.search.assistant.surfaces.voice.f.a.g.b r3 = com.google.android.apps.search.assistant.surfaces.voice.p9591f.p9592a.p9600g.C127454b.CLIENT_INPUT     // Catch:{ Exception -> 0x002c }
            com.google.assistant.e.j.du r5 = com.google.assistant.p3897e.p3921j.C51805du.f135924e     // Catch:{ Exception -> 0x002c }
            com.google.protobuf.bn r5 = r5.createBuilder()     // Catch:{ Exception -> 0x002c }
            com.google.assistant.e.j.ds r5 = (com.google.assistant.p3897e.p3921j.C51803ds) r5     // Catch:{ Exception -> 0x002c }
            p5462h.p5473f.p5475b.C69664n.m101060f(r5, r0)     // Catch:{ Exception -> 0x002c }
            com.google.assistant.e.j.oh r5 = p5462h.p5473f.p5475b.C69664n.m101061g(r5, "builder")     // Catch:{ Exception -> 0x002c }
            java.lang.String r6 = "widget.DIALOG_INFO"
            r5.mo53832b(r6)     // Catch:{ Exception -> 0x002c }
            r5.mo53834d()     // Catch:{ Exception -> 0x002c }
            java.lang.String r6 = "widget_dialog_info_input"
            com.google.assistant.e.j.ka r7 = com.google.assistant.p3897e.p3921j.C52230ka.f137057d     // Catch:{ Exception -> 0x002c }
            com.google.protobuf.bn r7 = r7.createBuilder()     // Catch:{ Exception -> 0x002c }
            com.google.assistant.e.j.jz r7 = (com.google.assistant.p3897e.p3921j.C52228jz) r7     // Catch:{ Exception -> 0x002c }
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r0)     // Catch:{ Exception -> 0x002c }
            com.google.assistant.e.j.adu r0 = p5462h.p5473f.p5475b.C69664n.m101061g(r7, "builder")     // Catch:{ Exception -> 0x002c }
            java.lang.String r7 = "assistant.api.client_input.WidgetDialogInfoInput"
            r0.mo53678c(r7)     // Catch:{ Exception -> 0x002c }
            com.google.protobuf.z r7 = r10.toByteString()     // Catch:{ Exception -> 0x002c }
            java.lang.String r8 = "widgetDialogInfoInput.toByteString()"
            p5462h.p5473f.p5475b.C69664n.m101060f(r7, r8)     // Catch:{ Exception -> 0x002c }
            r0.mo53677b(r7)     // Catch:{ Exception -> 0x002c }
            com.google.assistant.e.j.ka r0 = r0.mo53676a()     // Catch:{ Exception -> 0x002c }
            r5.mo53833c(r6, r0)     // Catch:{ Exception -> 0x002c }
            com.google.assistant.e.j.du r0 = r5.mo53831a()     // Catch:{ Exception -> 0x002c }
            com.google.android.apps.search.assistant.surfaces.voice.controller.ui.actions.b r0 = com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127407d.m208361a(r3, r0)     // Catch:{ Exception -> 0x002c }
            java.lang.String r3 = "clientInput(\n           …            }\n          )"
            p5462h.p5473f.p5475b.C69664n.m101060f(r0, r3)     // Catch:{ Exception -> 0x002c }
            com.google.common.util.concurrent.cx r11 = r11.mo107875a(r0)     // Catch:{ Exception -> 0x002c }
            r1.f354583a = r10     // Catch:{ Exception -> 0x002c }
            r1.f354586d = r4     // Catch:{ Exception -> 0x002c }
            java.lang.Object r10 = kotlinx.coroutines.p5578d.C71663i.m104690c(r11, r1)     // Catch:{ Exception -> 0x002c }
            if (r10 != r2) goto L_0x00c3
            return r2
        L_0x0099:
            boolean r0 = r11 instanceof java.util.concurrent.CancellationException
            if (r0 != 0) goto L_0x00c6
            com.google.common.f.e r0 = f354587a
            com.google.common.f.x r0 = r0.mo56225c()
            com.google.common.f.c r0 = (com.google.common.p4526f.C59052c) r0
            com.google.common.f.x r11 = r0.mo56382g(r11)
            com.google.common.f.c r11 = (com.google.common.p4526f.C59052c) r11
            com.google.assistant.e.j.apy r10 = (com.google.assistant.p3897e.p3921j.apy) r10
            boolean r10 = r10.f135595e
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r10)
            com.google.common.f.n r0 = new com.google.common.f.n
            r1 = 38087(0x94c7, float:5.3371E-41)
            r0.<init>(r1)
            r11.mo56379ah(r0)
            java.lang.String r0 = "Failed to send widget.DIALOG_INFO, dialogTerminated=%s"
            r11.mo56389s(r0, r10)
        L_0x00c3:
            h.q r10 = p5462h.C69788q.f186170a
            return r10
        L_0x00c6:
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.renderer.actionsservice.C129076i.mo108835b(com.google.assistant.e.j.apy, h.c.g):java.lang.Object");
    }
}
