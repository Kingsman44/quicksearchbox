package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import android.content.Context;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.au */
/* compiled from: PG */
public final /* synthetic */ class C33076au implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C33079ax f88544a;

    /* renamed from: b */
    public final /* synthetic */ C52091ex f88545b;

    /* renamed from: c */
    public final /* synthetic */ C52490tr f88546c;

    /* renamed from: d */
    public final /* synthetic */ Context f88547d;

    /* renamed from: e */
    public final /* synthetic */ Optional f88548e;

    public /* synthetic */ C33076au(C33079ax axVar, C52091ex exVar, C52490tr trVar, Context context, Optional optional) {
        this.f88544a = axVar;
        this.f88545b = exVar;
        this.f88546c = trVar;
        this.f88547d = context;
        this.f88548e = optional;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0129  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.ax r1 = r0.f88544a
            com.google.assistant.e.j.ex r2 = r0.f88545b
            com.google.assistant.e.j.tr r3 = r0.f88546c
            android.content.Context r4 = r0.f88547d
            j$.util.Optional r5 = r0.f88548e
            r6 = r19
            j$.util.Optional r6 = (p3186j$.util.Optional) r6
            boolean r7 = r6.isPresent()
            if (r7 != 0) goto L_0x04e2
            int r6 = r3.f137798b
            r7 = 9
            r8 = 3
            r9 = 2
            r10 = 0
            r11 = 17
            r12 = 4
            r13 = 1
            if (r6 != r7) goto L_0x011f
            int r6 = r3.f137797a
            r6 = r6 & r13
            if (r6 == 0) goto L_0x011f
            java.lang.Object r6 = r3.f137799c
            com.google.assistant.e.j.tc r6 = (com.google.assistant.p3897e.p3921j.C52475tc) r6
            boolean r6 = r6.f137747b
            if (r6 == 0) goto L_0x011f
            java.lang.String r6 = r3.f137800d
            com.google.assistant.e.j.e.ff r14 = r1.f88553c
            j$.util.Optional r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r6, r14)
            boolean r14 = r6.isPresent()
            if (r14 == 0) goto L_0x011f
            java.lang.Object r14 = r6.get()
            com.google.assistant.e.j.e.eu r14 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r14
            int r14 = r14.f136277e
            if (r14 != r11) goto L_0x011f
            java.lang.Object r6 = r6.get()
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            int r14 = r6.f136277e
            if (r14 != r11) goto L_0x0057
            java.lang.Object r6 = r6.f136278f
            com.google.assistant.e.c.c.ah r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r6
            goto L_0x0059
        L_0x0057:
            com.google.assistant.e.c.c.ah r6 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x0059:
            int r6 = r6.f132602h
            com.google.assistant.e.c.c.ac r6 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.m85981a(r6)
            if (r6 != 0) goto L_0x0063
            com.google.assistant.e.c.c.ac r6 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
        L_0x0063:
            com.google.assistant.e.c.c.ac r14 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.CANCEL
            if (r6 != r14) goto L_0x011f
            com.google.assistant.e.j.ex r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33119g.m61465a(r2)
            com.google.assistant.e.j.e.ff r14 = r1.f88553c
            java.lang.String r14 = r14.f136321e
            com.google.assistant.e.j.e.fc r15 = r1.f88555e
            int r16 = r14.hashCode()
            switch(r16) {
                case 306564950: goto L_0x00a1;
                case 535563322: goto L_0x0097;
                case 1163811721: goto L_0x008d;
                case 1578371832: goto L_0x0083;
                case 1935808271: goto L_0x0079;
                default: goto L_0x0078;
            }
        L_0x0078:
            goto L_0x00ab
        L_0x0079:
            java.lang.String r11 = "PauseTimer"
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x00ab
            r11 = 2
            goto L_0x00ac
        L_0x0083:
            java.lang.String r11 = "ResumeTimer"
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x00ab
            r11 = 3
            goto L_0x00ac
        L_0x008d:
            java.lang.String r11 = "CreateTimer"
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x00ab
            r11 = 0
            goto L_0x00ac
        L_0x0097:
            java.lang.String r11 = "DeleteTimer"
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x00ab
            r11 = 1
            goto L_0x00ac
        L_0x00a1:
            java.lang.String r11 = "ResetTimer"
            boolean r11 = r14.equals(r11)
            if (r11 == 0) goto L_0x00ab
            r11 = 4
            goto L_0x00ac
        L_0x00ab:
            r11 = -1
        L_0x00ac:
            if (r11 == 0) goto L_0x00f2
            if (r11 == r13) goto L_0x00e6
            if (r11 == r9) goto L_0x00da
            if (r11 == r8) goto L_0x00ce
            if (r11 == r12) goto L_0x00c2
            android.content.res.Resources r11 = r4.getResources()
            r14 = 2132085210(0x7f1509da, float:1.9810612E38)
            java.lang.String r11 = r11.getString(r14)
            goto L_0x00fd
        L_0x00c2:
            android.content.res.Resources r11 = r4.getResources()
            r14 = 2132085232(0x7f1509f0, float:1.9810657E38)
            java.lang.String r11 = r11.getString(r14)
            goto L_0x00fd
        L_0x00ce:
            android.content.res.Resources r11 = r4.getResources()
            r14 = 2132085233(0x7f1509f1, float:1.981066E38)
            java.lang.String r11 = r11.getString(r14)
            goto L_0x00fd
        L_0x00da:
            android.content.res.Resources r11 = r4.getResources()
            r14 = 2132085230(0x7f1509ee, float:1.9810653E38)
            java.lang.String r11 = r11.getString(r14)
            goto L_0x00fd
        L_0x00e6:
            android.content.res.Resources r11 = r4.getResources()
            r14 = 2132085222(0x7f1509e6, float:1.9810637E38)
            java.lang.String r11 = r11.getString(r14)
            goto L_0x00fd
        L_0x00f2:
            android.content.res.Resources r11 = r4.getResources()
            r14 = 2132085218(0x7f1509e2, float:1.9810629E38)
            java.lang.String r11 = r11.getString(r14)
        L_0x00fd:
            java.util.ArrayList r14 = new java.util.ArrayList
            r14.<init>()
            com.google.assistant.e.j.e.ep r8 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.TIMER
            com.google.assistant.e.j.dy r8 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61444c(r11, r15, r8)
            r14.add(r8)
            com.google.assistant.e.j.e.o r8 = com.google.assistant.p3897e.p3921j.p3926e.C52056o.f136624a
            com.google.assistant.e.j.dy r8 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61448g(r8)
            r14.add(r8)
            com.google.common.b.pz r8 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r6 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r14, r8, r6)
            j$.util.Optional r6 = p3186j$.util.Optional.m71637of(r6)
            goto L_0x0123
        L_0x011f:
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
        L_0x0123:
            boolean r8 = r6.isPresent()
            if (r8 != 0) goto L_0x04e2
            boolean r6 = r5.isPresent()
            if (r6 != 0) goto L_0x0136
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
        L_0x0133:
            r6 = r3
            goto L_0x02a8
        L_0x0136:
            java.lang.Object r5 = r5.get()
            com.google.assistant.e.j.un r5 = (com.google.assistant.p3897e.p3921j.C52513un) r5
            com.google.assistant.e.j.e.ff r6 = r1.f88553c
            com.google.assistant.e.j.e.ff r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61487d(r5, r6)
            r1.f88553c = r5
            int r5 = r3.f137798b
            if (r5 != r7) goto L_0x0161
            com.google.assistant.e.j.dy[] r3 = new com.google.assistant.p3897e.p3921j.C51809dy[r13]
            com.google.assistant.e.j.e.ff r5 = r1.f88553c
            com.google.assistant.e.j.dy r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61451j(r5)
            r3[r10] = r5
            java.util.ArrayList r3 = com.google.common.p4522b.C58597ky.m90212c(r3)
            com.google.common.b.pz r5 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r3 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r3, r5, r2)
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            goto L_0x0133
        L_0x0161:
            if (r5 != r12) goto L_0x0168
            java.lang.Object r5 = r3.f137799c
            com.google.assistant.e.j.tv r5 = (com.google.assistant.p3897e.p3921j.C52494tv) r5
            goto L_0x016a
        L_0x0168:
            com.google.assistant.e.j.tv r5 = com.google.assistant.p3897e.p3921j.C52494tv.f137809c
        L_0x016a:
            int r5 = r5.f137811a
            r5 = r5 & r13
            if (r5 == 0) goto L_0x0294
            com.google.assistant.e.j.e.ff r5 = r1.f88553c
            int r6 = r3.f137798b
            if (r6 != r12) goto L_0x017a
            java.lang.Object r3 = r3.f137799c
            com.google.assistant.e.j.tv r3 = (com.google.assistant.p3897e.p3921j.C52494tv) r3
            goto L_0x017c
        L_0x017a:
            com.google.assistant.e.j.tv r3 = com.google.assistant.p3897e.p3921j.C52494tv.f137809c
        L_0x017c:
            long r6 = r3.f137812b
            int r3 = (int) r6
            java.lang.String r6 = "providers"
            j$.util.Optional r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r6, r5)
            boolean r7 = r5.isPresent()
            java.lang.String r8 = ""
            if (r7 != 0) goto L_0x019c
            com.google.common.f.e r3 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33079ax.f88551a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r5 = "getSelectedAppIconIdentifierFromProvidersField, providers field is missing."
            r7 = 50921(0xc6e9, float:7.1356E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r7)).mo56386p(r5)
            goto L_0x01e3
        L_0x019c:
            java.lang.Object r5 = r5.get()
            com.google.assistant.e.j.e.eu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r5
            if (r3 < 0) goto L_0x01d5
            int r7 = r5.f136277e
            r11 = 6
            if (r7 != r11) goto L_0x01ae
            java.lang.Object r7 = r5.f136278f
            com.google.assistant.e.c.c.du r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r7
            goto L_0x01b0
        L_0x01ae:
            com.google.assistant.e.c.c.du r7 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x01b0:
            com.google.protobuf.cq r7 = r7.f132875f
            int r7 = r7.size()
            if (r3 < r7) goto L_0x01b9
            goto L_0x01d5
        L_0x01b9:
            int r7 = r5.f136277e
            if (r7 != r11) goto L_0x01c2
            java.lang.Object r5 = r5.f136278f
            com.google.assistant.e.c.c.du r5 = (com.google.assistant.p3897e.p3902c.p3907c.C51030du) r5
            goto L_0x01c4
        L_0x01c2:
            com.google.assistant.e.c.c.du r5 = com.google.assistant.p3897e.p3902c.p3907c.C51030du.f132868g
        L_0x01c4:
            com.google.protobuf.cq r5 = r5.f132875f
            java.lang.Object r3 = r5.get(r3)
            com.google.assistant.e.c.c.dr r3 = (com.google.assistant.p3897e.p3902c.p3907c.C51027dr) r3
            com.google.assistant.e.c.c.dc r3 = r3.f132864k
            if (r3 != 0) goto L_0x01d2
            com.google.assistant.e.c.c.dc r3 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
        L_0x01d2:
            java.lang.String r8 = r3.f132821g
            goto L_0x01e3
        L_0x01d5:
            com.google.common.f.e r3 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33079ax.f88551a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r5 = "getSelectedAppIconIdentifierFromProvidersField, invalid item index."
            r7 = 50920(0xc6e8, float:7.1354E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r7)).mo56386p(r5)
        L_0x01e3:
            boolean r3 = r8.isEmpty()
            if (r3 == 0) goto L_0x01fd
            com.google.common.f.e r3 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33079ax.f88551a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r5 = "maybeUpdateFormFieldsVisibility, fail to get user selected app icon identifier."
            r6 = 50914(0xc6e2, float:7.1346E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56386p(r5)
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0133
        L_0x01fd:
            r1.mo38511b(r8)
            com.google.assistant.e.j.e.ff r3 = r1.f88553c
            j$.util.Optional r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r6, r3)
            java.lang.Object r5 = r5.get()
            com.google.assistant.e.j.e.eu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r5
            com.google.assistant.e.j.e.eu r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61485b(r5)
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r3 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r5, r3, r6)
            r1.f88553c = r3
            com.google.assistant.e.j.e.ff r3 = r1.f88553c
            java.lang.String r5 = "clock_app_picker_field"
            j$.util.Optional r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r5, r3)
            boolean r6 = r5.isPresent()
            if (r6 != 0) goto L_0x0237
            com.google.common.f.e r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33079ax.f88551a
            com.google.common.f.x r5 = r5.mo56225c()
            java.lang.String r6 = "updateClockAppPickerFieldWithSelectedAppIconIdentifier, clockAppPickerField is missing."
            r7 = 50901(0xc6d5, float:7.1327E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r5).mo56372aa(r7)).mo56386p(r6)
            goto L_0x0278
        L_0x0237:
            java.lang.Object r6 = r5.get()
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            com.google.protobuf.bn r6 = r6.toBuilder()
            com.google.assistant.e.j.e.eq r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r6
            java.lang.Object r5 = r5.get()
            com.google.assistant.e.j.e.eu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r5
            int r7 = r5.f136277e
            r11 = 17
            if (r7 != r11) goto L_0x0254
            java.lang.Object r5 = r5.f136278f
            com.google.assistant.e.c.c.ah r5 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r5
            goto L_0x0256
        L_0x0254:
            com.google.assistant.e.c.c.ah r5 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x0256:
            com.google.assistant.e.c.c.ah r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61484a(r5, r8)
            r6.copyOnWrite()
            com.google.protobuf.bv r7 = r6.instance
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            r5.getClass()
            r7.f136278f = r5
            r5 = 17
            r7.f136277e = r5
            com.google.protobuf.bv r5 = r6.build()
            com.google.assistant.e.j.e.eu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r5
            j$.util.Optional r6 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r3 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r5, r3, r6)
        L_0x0278:
            r1.f88553c = r3
            com.google.assistant.e.j.dy[] r3 = new com.google.assistant.p3897e.p3921j.C51809dy[r13]
            com.google.assistant.e.j.e.ff r5 = r1.f88553c
            com.google.assistant.e.j.dy r5 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61451j(r5)
            r3[r10] = r5
            java.util.ArrayList r3 = com.google.common.p4522b.C58597ky.m90212c(r3)
            com.google.common.b.pz r5 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r3 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r3, r5, r2)
            j$.util.Optional r3 = p3186j$.util.Optional.m71637of(r3)
            goto L_0x0133
        L_0x0294:
            com.google.common.f.e r3 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33079ax.f88551a
            com.google.common.f.x r3 = r3.mo56225c()
            java.lang.String r5 = "maybeUpdateFormFieldsVisibility, unknown field is tapped."
            r6 = 50915(0xc6e3, float:7.1347E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r3).mo56372aa(r6)).mo56386p(r5)
            j$.util.Optional r3 = p3186j$.util.Optional.empty()
            goto L_0x0133
        L_0x02a8:
            boolean r3 = r6.isPresent()
            if (r3 != 0) goto L_0x04e2
            com.google.assistant.e.j.e.ff r3 = r1.f88553c
            com.google.assistant.e.j.uh r5 = r1.f88554d
            com.google.assistant.e.j.ex r2 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19050h.m36505b(r4, r2, r3, r5)
            com.google.assistant.e.j.e.ff r3 = r1.f88553c
            com.google.assistant.e.j.uh r1 = r1.f88554d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            com.google.android.libraries.assistant.portable.a.a.c r5 = new com.google.android.libraries.assistant.portable.a.a.c
            r5.<init>(r2)
            com.google.assistant.e.i.a.fe r6 = r5.f53448a
            com.google.protobuf.bv r6 = r6.instance
            com.google.assistant.e.i.a.fh r6 = (com.google.assistant.p3897e.p3917i.p3918a.C51373fh) r6
            com.google.protobuf.cq r6 = r6.f133804a
            int r6 = r6.size()
            if (r6 == 0) goto L_0x04c4
            int r6 = r5.mo24280l()
            if (r6 != 0) goto L_0x02da
            goto L_0x04c4
        L_0x02da:
            int r6 = r3.f136317a
            r6 = r6 & 8
            if (r6 == 0) goto L_0x04b1
            java.lang.String r6 = r3.f136321e
            android.util.Pair r6 = r5.mo24269a(r6)
            java.lang.Object r7 = r6.first
            com.google.common.base.ax r7 = (com.google.common.base.C58833ax) r7
            boolean r7 = r7.mo56113h()
            if (r7 == 0) goto L_0x049e
            java.lang.Object r7 = r6.second
            com.google.common.base.ax r7 = (com.google.common.base.C58833ax) r7
            boolean r7 = r7.mo56113h()
            if (r7 != 0) goto L_0x02fc
            goto L_0x049e
        L_0x02fc:
            java.lang.Object r7 = r6.first
            com.google.common.base.ax r7 = (com.google.common.base.C58833ax) r7
            java.lang.Object r7 = r7.mo56107c()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            java.lang.Object r6 = r6.second
            com.google.common.base.ax r6 = (com.google.common.base.C58833ax) r6
            java.lang.Object r6 = r6.mo56107c()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            com.google.z.c.d r8 = r5.mo24272d(r7, r6)
            com.google.protobuf.bn r8 = r8.toBuilder()
            com.google.z.c.c r8 = (com.google.p5277z.p5282c.C68013c) r8
            com.google.protobuf.bv r11 = r8.instance
            com.google.z.c.d r11 = (com.google.p5277z.p5282c.C68014d) r11
            com.google.knowledge.a.a.n r11 = r11.f184280c
            if (r11 != 0) goto L_0x032c
            com.google.knowledge.a.a.n r11 = com.google.knowledge.p4661a.p4662a.C61752n.f166808f
        L_0x032c:
            com.google.protobuf.bv r14 = r8.instance
            com.google.z.c.d r14 = (com.google.p5277z.p5282c.C68014d) r14
            com.google.z.c.l r14 = r14.f184281d
            if (r14 != 0) goto L_0x0336
            com.google.z.c.l r14 = com.google.p5277z.p5282c.C68022l.f184294b
        L_0x0336:
            com.google.protobuf.bn r14 = r14.toBuilder()
            com.google.z.c.e r14 = (com.google.p5277z.p5282c.C68015e) r14
            r15 = 0
        L_0x033d:
            com.google.protobuf.cq r13 = r11.f166812c
            int r13 = r13.size()
            java.lang.String r9 = "label"
            java.lang.String r12 = "duration"
            if (r15 >= r13) goto L_0x0394
            com.google.protobuf.cq r13 = r11.f166812c
            java.lang.Object r13 = r13.get(r15)
            com.google.knowledge.a.a.h r13 = (com.google.knowledge.p4661a.p4662a.C61746h) r13
            java.lang.String r0 = r13.f166796d
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x037b
            int r0 = r13.f166793a
            r10 = 4
            r0 = r0 & r10
            if (r0 == 0) goto L_0x0361
            r10 = 1
            goto L_0x0362
        L_0x0361:
            r10 = 0
        L_0x0362:
            if (r10 == 0) goto L_0x036f
            r17 = r10
            r0 = 2
            com.google.z.c.h r10 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r0)
            r14.mo60077b(r12, r10)
            goto L_0x0379
        L_0x036f:
            r17 = r10
            r10 = 3
            com.google.z.c.h r0 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r10)
            r14.mo60077b(r12, r0)
        L_0x0379:
            r10 = r17
        L_0x037b:
            java.lang.String r0 = r13.f166796d
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x038c
            r0 = 2
            com.google.z.c.h r12 = com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d.m36501g(r0)
            r14.mo60077b(r9, r12)
            goto L_0x038d
        L_0x038c:
            r0 = 2
        L_0x038d:
            int r15 = r15 + 1
            r0 = r18
            r9 = 2
            r12 = 4
            goto L_0x033d
        L_0x0394:
            r8.copyOnWrite()
            com.google.protobuf.bv r0 = r8.instance
            com.google.z.c.d r0 = (com.google.p5277z.p5282c.C68014d) r0
            com.google.protobuf.bv r11 = r14.build()
            com.google.z.c.l r11 = (com.google.p5277z.p5282c.C68022l) r11
            r11.getClass()
            r0.f184281d = r11
            int r11 = r0.f184278a
            r13 = 4
            r11 = r11 | r13
            r0.f184278a = r11
            r5.mo24278j(r7, r6, r8)
            com.google.assistant.e.j.ex r0 = r5.mo24270b(r2)
            j$.util.Optional r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r12, r3)
            boolean r5 = r2.isPresent()
            if (r5 == 0) goto L_0x03e8
            java.lang.Object r2 = r2.get()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.e.j.e.eq r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r5 = r2.instance
            com.google.assistant.e.j.e.eu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r5
            int r6 = r5.f136273a
            r6 = r6 | 64
            r5.f136273a = r6
            r6 = r10 ^ 1
            r5.f136282j = r6
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r3 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r2, r3, r5)
        L_0x03e8:
            java.lang.String r2 = "confirm_field"
            j$.util.Optional r2 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r2, r3)
            boolean r5 = r2.isPresent()
            if (r5 == 0) goto L_0x044c
            java.lang.Object r5 = r2.get()
            com.google.assistant.e.j.e.eu r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r5
            com.google.protobuf.bn r5 = r5.toBuilder()
            com.google.assistant.e.j.e.eq r5 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r5
            java.lang.Object r2 = r2.get()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            int r6 = r2.f136277e
            r7 = 17
            if (r6 != r7) goto L_0x0411
            java.lang.Object r2 = r2.f136278f
            com.google.assistant.e.c.c.ah r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r2
            goto L_0x0413
        L_0x0411:
            com.google.assistant.e.c.c.ah r2 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
        L_0x0413:
            com.google.protobuf.bn r2 = r2.toBuilder()
            com.google.assistant.e.c.c.aa r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50929aa) r2
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.e.c.c.ah r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r6
            int r7 = r6.f132595a
            r8 = 4
            r7 = r7 | r8
            r6.f132595a = r7
            r6.f132600f = r10
            r5.copyOnWrite()
            com.google.protobuf.bv r6 = r5.instance
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.c.c.ah r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r2
            r2.getClass()
            r6.f136278f = r2
            r2 = 17
            r6.f136277e = r2
            com.google.protobuf.bv r2 = r5.build()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            j$.util.Optional r5 = p3186j$.util.Optional.empty()
            com.google.assistant.e.j.e.ff r3 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61489f(r2, r3, r5)
        L_0x044c:
            com.google.protobuf.cq r1 = r1.f137840a
            com.google.assistant.e.j.tr r2 = com.google.assistant.p3897e.p3921j.C52490tr.f137795g
            java.lang.Object r1 = com.google.common.p4522b.C58557jl.m90130k(r1, r2)
            com.google.assistant.e.j.tr r1 = (com.google.assistant.p3897e.p3921j.C52490tr) r1
            int r1 = r1.f137798b
            r2 = 3
            if (r1 != r2) goto L_0x048c
            j$.util.Optional r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x.m61490g(r9, r3)
            boolean r1 = r1.isPresent()
            if (r1 == 0) goto L_0x0493
            com.google.protobuf.bn r1 = r3.toBuilder()
            com.google.assistant.e.j.e.en r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51934en) r1
            com.google.assistant.e.j.e.fe r2 = com.google.assistant.p3897e.p3921j.p3926e.C51952fe.FORM_FIELD_STATUS_UPDATE
            r1.copyOnWrite()
            com.google.protobuf.bv r3 = r1.instance
            com.google.assistant.e.j.e.ff r3 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r3
            int r2 = r2.f136314c
            r3.f136326j = r2
            int r2 = r3.f136317a
            r2 = r2 | 256(0x100, float:3.59E-43)
            r3.f136317a = r2
            com.google.protobuf.bv r1 = r1.build()
            com.google.assistant.e.j.e.ff r1 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r1
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61451j(r1)
            r4.add(r1)
            goto L_0x0493
        L_0x048c:
            com.google.assistant.e.j.dy r1 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d.m61451j(r3)
            r4.add(r1)
        L_0x0493:
            com.google.common.b.pz r1 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.j.en r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f.m61461b(r4, r1, r0)
            j$.util.Optional r0 = p3186j$.util.Optional.m71637of(r0)
            goto L_0x04d6
        L_0x049e:
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33079ax.f88551a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Didn't find matching intent state."
            r2 = 50918(0xc6e6, float:7.1351E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x04d6
        L_0x04b1:
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33079ax.f88551a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "Id field in ShowNativeFormArgs is unspecified."
            r2 = 50919(0xc6e7, float:7.1353E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            goto L_0x04d6
        L_0x04c4:
            com.google.common.f.e r0 = com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33079ax.f88551a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r1 = "progressDialog: Empty DIS is not expected."
            r2 = 50917(0xc6e5, float:7.135E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r2)).mo56386p(r1)
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
        L_0x04d6:
            r6 = r0
            boolean r0 = r6.isPresent()
            if (r0 != 0) goto L_0x04e2
            j$.util.Optional r0 = p3186j$.util.Optional.empty()
            return r0
        L_0x04e2:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d.C33076au.apply(java.lang.Object):java.lang.Object");
    }
}
