package com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c;

import android.content.Context;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.libraries.assistant.assistantactions.c.b.c.a */
/* compiled from: PG */
public final /* synthetic */ class C11137a implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C11182f f36499a;

    /* renamed from: b */
    public final /* synthetic */ C52091ex f36500b;

    /* renamed from: c */
    public final /* synthetic */ Context f36501c;

    public /* synthetic */ C11137a(C11182f fVar, C52091ex exVar, Context context) {
        this.f36499a = fVar;
        this.f36500b = exVar;
        this.f36501c = context;
    }

    /* JADX WARNING: Removed duplicated region for block: B:114:0x041e  */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0423  */
    /* JADX WARNING: Removed duplicated region for block: B:119:0x0436  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x04c7  */
    /* JADX WARNING: Removed duplicated region for block: B:125:0x0527  */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x03b6  */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x03bb  */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x03c3  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object apply(java.lang.Object r19) {
        /*
            r18 = this;
            r0 = r18
            com.google.android.libraries.assistant.assistantactions.c.b.c.f r1 = r0.f36499a
            com.google.assistant.e.j.ex r2 = r0.f36500b
            android.content.Context r3 = r0.f36501c
            r4 = r19
            com.google.assistant.e.i.a.l r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51527l) r4
            java.util.ArrayList r5 = new java.util.ArrayList
            r5.<init>()
            com.google.protobuf.cq r6 = r4.f134276b
            int r6 = r6.size()
            r7 = 1
            if (r6 == r7) goto L_0x0034
            com.google.common.f.e r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11182f.f36574a
            com.google.common.f.x r1 = r1.mo56225c()
            java.lang.String r3 = "getConfirmResponse: There is no alarm instance defined in alarmParams."
            r4 = 43045(0xa825, float:6.0319E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r1).mo56372aa(r4)).mo56386p(r3)
            com.google.common.b.pz r1 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.e.a.j r1 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c.m26566b(r5, r1, r2)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r1)
            goto L_0x0749
        L_0x0034:
            int r6 = r4.f134275a
            r6 = r6 & 8
            if (r6 == 0) goto L_0x0730
            java.lang.String r6 = r4.f134279e
            r1.mo19614b(r6)
            java.lang.String r6 = "alarm_params"
            java.lang.String r8 = "assistant.api.params.AlarmParams"
            java.lang.String r9 = "alarm.CREATE_ALARM"
            com.google.assistant.e.j.dy r6 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26575e(r9, r6, r8, r4)
            r5.add(r6)
            com.google.assistant.e.j.e.fc r6 = r1.f36581h
            com.google.assistant.e.j.e.fc r8 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            java.lang.String r10 = "label"
            java.lang.String r11 = "recurrence"
            java.lang.String r12 = "datetime"
            if (r6 != r8) goto L_0x0345
            com.google.assistant.e.j.e.ff r6 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.e.en r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51934en) r6
            com.google.assistant.e.j.e.fa r8 = com.google.assistant.p3897e.p3921j.p3926e.C51948fa.f136294i
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.e.ex r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51944ex) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r13 = r8.instance
            com.google.assistant.e.j.e.fa r13 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r13
            int r14 = r13.f136296a
            r14 = r14 | 16
            r13.f136296a = r14
            r13.f136301f = r7
            com.google.assistant.e.j.e.ew r13 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.f136285f
            com.google.protobuf.bn r13 = r13.createBuilder()
            com.google.assistant.e.j.e.ev r13 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r13
            com.google.assistant.e.j.e.eu r14 = com.google.assistant.p3897e.p3921j.p3926e.C51941eu.f136271l
            com.google.protobuf.bn r14 = r14.createBuilder()
            com.google.assistant.e.j.e.eq r14 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r14
            com.google.assistant.e.c.c.d r16 = com.google.assistant.p3897e.p3902c.p3907c.C51009d.f132801i
            com.google.protobuf.bn r16 = r16.createBuilder()
            r7 = r16
            com.google.assistant.e.c.c.a r7 = (com.google.assistant.p3897e.p3902c.p3907c.C50928a) r7
            com.google.assistant.e.j.e.ff r15 = r1.f36576c
            com.google.common.base.ax r12 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r12, r15)
            boolean r15 = r12.mo56113h()
            if (r15 == 0) goto L_0x00f4
            java.lang.Object r15 = r12.mo56107c()
            com.google.assistant.e.j.e.eu r15 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r15
            int r15 = r15.f136277e
            r0 = 9
            if (r15 != r0) goto L_0x00f4
            java.lang.Object r15 = r12.mo56107c()
            com.google.assistant.e.j.e.eu r15 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r15
            r17 = r2
            int r2 = r15.f136277e
            if (r2 != r0) goto L_0x00ba
            java.lang.Object r0 = r15.f136278f
            com.google.assistant.e.c.c.id r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r0
            goto L_0x00bc
        L_0x00ba:
            com.google.assistant.e.c.c.id r0 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.f133140f
        L_0x00bc:
            int r0 = r0.f133142a
            r0 = r0 & 2
            if (r0 == 0) goto L_0x00f6
            java.lang.Object r0 = r12.mo56107c()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            int r2 = r0.f136277e
            r12 = 9
            if (r2 != r12) goto L_0x00d3
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.id r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r0
            goto L_0x00d5
        L_0x00d3:
            com.google.assistant.e.c.c.id r0 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.f133140f
        L_0x00d5:
            com.google.assistant.e.c.c.ib r0 = r0.f133144c
            if (r0 != 0) goto L_0x00db
            com.google.assistant.e.c.c.ib r0 = com.google.assistant.p3897e.p3902c.p3907c.C51146ib.f133130h
        L_0x00db:
            com.google.assistant.e.j.ql r0 = r0.f133134c
            if (r0 != 0) goto L_0x00e1
            com.google.assistant.e.j.ql r0 = com.google.assistant.p3897e.p3921j.C52403ql.f137512f
        L_0x00e1:
            r7.copyOnWrite()
            com.google.protobuf.bv r2 = r7.instance
            com.google.assistant.e.c.c.d r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r2
            r0.getClass()
            r2.f132804b = r0
            int r0 = r2.f132803a
            r12 = 1
            r0 = r0 | r12
            r2.f132803a = r0
            goto L_0x00f6
        L_0x00f4:
            r17 = r2
        L_0x00f6:
            com.google.assistant.e.j.e.ff r0 = r1.f36576c
            com.google.common.base.ax r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r11, r0)
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x014e
            java.lang.Object r2 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            int r2 = r2.f136277e
            r11 = 7
            if (r2 != r11) goto L_0x014e
            java.lang.Object r2 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            int r12 = r2.f136277e
            if (r12 != r11) goto L_0x011c
            java.lang.Object r2 = r2.f136278f
            com.google.assistant.e.c.c.hh r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r2
            goto L_0x011e
        L_0x011c:
            com.google.assistant.e.c.c.hh r2 = com.google.assistant.p3897e.p3902c.p3907c.C51125hh.f133077g
        L_0x011e:
            int r2 = r2.f133079a
            r2 = r2 & 2
            if (r2 == 0) goto L_0x014e
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            int r2 = r0.f136277e
            r11 = 7
            if (r2 != r11) goto L_0x0134
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.hh r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r0
            goto L_0x0136
        L_0x0134:
            com.google.assistant.e.c.c.hh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51125hh.f133077g
        L_0x0136:
            com.google.assistant.e.j.qf r0 = r0.f133081c
            if (r0 != 0) goto L_0x013c
            com.google.assistant.e.j.qf r0 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x013c:
            r7.copyOnWrite()
            com.google.protobuf.bv r2 = r7.instance
            com.google.assistant.e.c.c.d r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r2
            r0.getClass()
            r2.f132808f = r0
            int r0 = r2.f132803a
            r0 = r0 | 16
            r2.f132803a = r0
        L_0x014e:
            com.google.assistant.e.j.e.ff r0 = r1.f36576c
            com.google.common.base.ax r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r10, r0)
            boolean r2 = r0.mo56113h()
            if (r2 == 0) goto L_0x01a4
            java.lang.Object r2 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            int r2 = r2.f136277e
            r10 = 4
            if (r2 != r10) goto L_0x01a4
            java.lang.Object r2 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            int r11 = r2.f136277e
            if (r11 != r10) goto L_0x0174
            java.lang.Object r2 = r2.f136278f
            com.google.assistant.e.c.c.co r2 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r2
            goto L_0x0176
        L_0x0174:
            com.google.assistant.e.c.c.co r2 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x0176:
            java.lang.String r2 = r2.f132764d
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L_0x01a4
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            int r2 = r0.f136277e
            r10 = 4
            if (r2 != r10) goto L_0x018e
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.co r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r0
            goto L_0x0190
        L_0x018e:
            com.google.assistant.e.c.c.co r0 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x0190:
            java.lang.String r0 = r0.f132764d
            r7.copyOnWrite()
            com.google.protobuf.bv r2 = r7.instance
            com.google.assistant.e.c.c.d r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r2
            r0.getClass()
            int r10 = r2.f132803a
            r10 = r10 | 32
            r2.f132803a = r10
            r2.f132809g = r0
        L_0x01a4:
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.c.c.gg r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r0
            com.google.assistant.e.c.c.ev r2 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.c.c.es r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r2
            java.lang.String r10 = r4.f134279e
            r2.copyOnWrite()
            com.google.protobuf.bv r11 = r2.instance
            com.google.assistant.e.c.c.ev r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r11
            r10.getClass()
            int r12 = r11.f132943a
            r15 = 1
            r12 = r12 | r15
            r11.f132943a = r12
            r11.f132944b = r10
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.c.c.ev r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r2
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.assistant.e.c.c.gh r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r10
            r2.getClass()
            r10.f133013c = r2
            r10.f133012b = r15
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.gh r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r0
            r7.copyOnWrite()
            com.google.protobuf.bv r2 = r7.instance
            com.google.assistant.e.c.c.d r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r2
            r0.getClass()
            r2.f132810h = r0
            int r0 = r2.f132803a
            r0 = r0 | 64
            r2.f132803a = r0
            com.google.assistant.e.c.c.c r0 = com.google.assistant.p3897e.p3902c.p3907c.C50982c.ON
            r7.copyOnWrite()
            com.google.protobuf.bv r2 = r7.instance
            com.google.assistant.e.c.c.d r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r2
            int r0 = r0.f132731d
            r2.f132805c = r0
            int r0 = r2.f132803a
            r0 = r0 | 2
            r2.f132803a = r0
            com.google.protobuf.cq r0 = r4.f134276b
            int r0 = r0.size()
            if (r0 <= 0) goto L_0x025f
            com.google.protobuf.cq r0 = r4.f134276b
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.assistant.e.i.a.j r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r0
            int r0 = r0.f134092a
            r10 = 1
            r0 = r0 & r10
            if (r0 == 0) goto L_0x025f
            com.google.protobuf.cq r0 = r4.f134276b
            java.lang.Object r0 = r0.get(r2)
            com.google.assistant.e.i.a.j r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r0
            java.lang.String r0 = r0.f134095d
            com.google.assistant.e.c.c.v r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11185i.m26510a(r0, r10)
            r7.copyOnWrite()
            com.google.protobuf.bv r2 = r7.instance
            com.google.assistant.e.c.c.d r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r2
            r0.getClass()
            r2.f132806d = r0
            int r0 = r2.f132803a
            r10 = 4
            r0 = r0 | r10
            r2.f132803a = r0
            com.google.protobuf.cq r0 = r4.f134276b
            r2 = 0
            java.lang.Object r0 = r0.get(r2)
            com.google.assistant.e.i.a.j r0 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r0
            java.lang.String r0 = r0.f134095d
            com.google.assistant.e.c.c.v r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11185i.m26510a(r0, r2)
            r7.copyOnWrite()
            com.google.protobuf.bv r2 = r7.instance
            com.google.assistant.e.c.c.d r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r2
            r0.getClass()
            r2.f132807e = r0
            int r0 = r2.f132803a
            r0 = r0 | 8
            r2.f132803a = r0
        L_0x025f:
            com.google.protobuf.bv r0 = r7.build()
            com.google.assistant.e.c.c.d r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51009d) r0
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            r0.getClass()
            r2.f136278f = r0
            r0 = 28
            r2.f136277e = r0
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.c.c.gg r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r0
            com.google.assistant.e.c.c.ev r2 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.c.c.es r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r2
            com.google.protobuf.cq r4 = r4.f134276b
            r7 = 0
            java.lang.Object r4 = r4.get(r7)
            com.google.assistant.e.i.a.j r4 = (com.google.assistant.p3897e.p3917i.p3918a.C51473j) r4
            java.lang.String r4 = r4.f134095d
            android.net.Uri r7 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11185i.f36585a
            android.net.Uri$Builder r7 = r7.buildUpon()
            android.net.Uri$Builder r4 = r7.appendPath(r4)
            java.lang.String r7 = "view"
            android.net.Uri$Builder r4 = r4.appendPath(r7)
            android.net.Uri r4 = r4.build()
            java.lang.String r4 = r4.toString()
            r2.copyOnWrite()
            com.google.protobuf.bv r7 = r2.instance
            com.google.assistant.e.c.c.ev r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r7
            r4.getClass()
            int r10 = r7.f132943a
            r10 = r10 | 32
            r7.f132943a = r10
            r7.f132949g = r4
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.c.c.ev r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r2
            r0.copyOnWrite()
            com.google.protobuf.bv r4 = r0.instance
            com.google.assistant.e.c.c.gh r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r4
            r2.getClass()
            r4.f133013c = r2
            r2 = 1
            r4.f133012b = r2
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.gh r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r0
            r14.copyOnWrite()
            com.google.protobuf.bv r2 = r14.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            r0.getClass()
            r2.f136276d = r0
            r0 = 22
            r2.f136275c = r0
            com.google.protobuf.bv r0 = r14.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            r13.mo53759b(r0)
            com.google.protobuf.bv r0 = r13.build()
            com.google.assistant.e.j.e.ew r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51943ew) r0
            r8.mo53763b(r0)
            com.google.protobuf.bv r0 = r8.build()
            com.google.assistant.e.j.e.fa r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r0
            r6.mo53755b(r0)
            r6.copyOnWrite()
            com.google.protobuf.bv r0 = r6.instance
            com.google.assistant.e.j.e.ff r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r0
            int r2 = r0.f136317a
            r2 = r2 | 16
            r0.f136317a = r2
            r2 = 1
            r0.f136322f = r2
            com.google.assistant.e.j.e.ep r0 = com.google.assistant.p3897e.p3921j.p3926e.C51936ep.ALARM
            r6.copyOnWrite()
            com.google.protobuf.bv r2 = r6.instance
            com.google.assistant.e.j.e.ff r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r2
            int r0 = r0.f136236u
            r2.f136323g = r0
            int r0 = r2.f136317a
            r0 = r0 | 32
            r2.f136317a = r0
            com.google.assistant.e.j.e.fc r0 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            r6.copyOnWrite()
            com.google.protobuf.bv r2 = r6.instance
            com.google.assistant.e.j.e.ff r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r2
            int r0 = r0.f136309c
            r2.f136324h = r0
            int r0 = r2.f136317a
            r0 = r0 | 64
            r2.f136317a = r0
            com.google.protobuf.bv r0 = r6.build()
            com.google.assistant.e.j.e.ff r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r0
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26580j(r0)
            r5.add(r0)
            goto L_0x06b9
        L_0x0345:
            r17 = r2
            com.google.assistant.e.j.e.ff r0 = r1.f36576c
            com.google.common.base.ax r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r12, r0)
            boolean r2 = r0.mo56113h()
            java.lang.String r6 = ""
            if (r2 == 0) goto L_0x0394
            java.lang.Object r2 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            int r2 = r2.f136277e
            r7 = 9
            if (r2 != r7) goto L_0x0394
            java.lang.Object r2 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            int r8 = r2.f136277e
            if (r8 != r7) goto L_0x0370
            java.lang.Object r2 = r2.f136278f
            com.google.assistant.e.c.c.id r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r2
            goto L_0x0372
        L_0x0370:
            com.google.assistant.e.c.c.id r2 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.f133140f
        L_0x0372:
            int r2 = r2.f133142a
            r2 = r2 & 2
            if (r2 == 0) goto L_0x0394
            java.lang.Object r0 = r0.mo56107c()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            int r2 = r0.f136277e
            r7 = 9
            if (r2 != r7) goto L_0x0389
            java.lang.Object r0 = r0.f136278f
            com.google.assistant.e.c.c.id r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51148id) r0
            goto L_0x038b
        L_0x0389:
            com.google.assistant.e.c.c.id r0 = com.google.assistant.p3897e.p3902c.p3907c.C51148id.f133140f
        L_0x038b:
            com.google.assistant.e.c.c.ib r0 = r0.f133144c
            if (r0 != 0) goto L_0x0391
            com.google.assistant.e.c.c.ib r0 = com.google.assistant.p3897e.p3902c.p3907c.C51146ib.f133130h
        L_0x0391:
            java.lang.String r0 = r0.f133137f
            goto L_0x0395
        L_0x0394:
            r0 = r6
        L_0x0395:
            com.google.assistant.e.j.e.ff r2 = r1.f36576c
            com.google.common.base.ax r2 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r11, r2)
            boolean r7 = r2.mo56113h()
            if (r7 == 0) goto L_0x03fc
            java.lang.Object r7 = r2.mo56107c()
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            int r7 = r7.f136277e
            r8 = 7
            if (r7 != r8) goto L_0x03fc
            java.lang.Object r7 = r2.mo56107c()
            com.google.assistant.e.j.e.eu r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r7
            int r11 = r7.f136277e
            if (r11 != r8) goto L_0x03bb
            java.lang.Object r7 = r7.f136278f
            com.google.assistant.e.c.c.hh r7 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r7
            goto L_0x03bd
        L_0x03bb:
            com.google.assistant.e.c.c.hh r7 = com.google.assistant.p3897e.p3902c.p3907c.C51125hh.f133077g
        L_0x03bd:
            int r7 = r7.f133079a
            r7 = r7 & 2
            if (r7 == 0) goto L_0x03fc
            java.lang.Object r2 = r2.mo56107c()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            int r7 = r2.f136277e
            r8 = 7
            if (r7 != r8) goto L_0x03d3
            java.lang.Object r2 = r2.f136278f
            com.google.assistant.e.c.c.hh r2 = (com.google.assistant.p3897e.p3902c.p3907c.C51125hh) r2
            goto L_0x03d5
        L_0x03d3:
            com.google.assistant.e.c.c.hh r2 = com.google.assistant.p3897e.p3902c.p3907c.C51125hh.f133077g
        L_0x03d5:
            com.google.assistant.e.j.qf r2 = r2.f133081c
            if (r2 != 0) goto L_0x03db
            com.google.assistant.e.j.qf r2 = com.google.assistant.p3897e.p3921j.C52397qf.f137491j
        L_0x03db:
            com.google.common.base.ax r2 = com.google.common.base.C58833ax.m90834k(r2)
            com.google.common.base.ax r2 = com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11306d.m26904d(r2)
            boolean r7 = r2.mo56113h()
            if (r7 == 0) goto L_0x03fc
            java.lang.Object r2 = r2.mo56107c()
            com.android.b.s r2 = (com.android.p256b.C5033s) r2
            java.lang.String r2 = r2.toString()
            android.content.res.Resources r7 = r3.getResources()
            java.lang.String r2 = com.google.android.libraries.assistant.assistantactions.rendering.p641d.C11306d.m26907g(r2, r7)
            goto L_0x03fd
        L_0x03fc:
            r2 = r6
        L_0x03fd:
            com.google.assistant.e.j.e.ff r7 = r1.f36576c
            com.google.common.base.ax r7 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11222q.m26610g(r10, r7)
            boolean r8 = r7.mo56113h()
            if (r8 == 0) goto L_0x0427
            java.lang.Object r8 = r7.mo56107c()
            com.google.assistant.e.j.e.eu r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r8
            int r8 = r8.f136277e
            r10 = 4
            if (r8 != r10) goto L_0x0427
            java.lang.Object r6 = r7.mo56107c()
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            int r7 = r6.f136277e
            if (r7 != r10) goto L_0x0423
            java.lang.Object r6 = r6.f136278f
            com.google.assistant.e.c.c.co r6 = (com.google.assistant.p3897e.p3902c.p3907c.C50997co) r6
            goto L_0x0425
        L_0x0423:
            com.google.assistant.e.c.c.co r6 = com.google.assistant.p3897e.p3902c.p3907c.C50997co.f132759h
        L_0x0425:
            java.lang.String r6 = r6.f132764d
        L_0x0427:
            com.google.assistant.e.j.e.fa r7 = com.google.assistant.p3897e.p3921j.p3926e.C51948fa.f136294i
            com.google.protobuf.bn r7 = r7.createBuilder()
            com.google.assistant.e.j.e.ex r7 = (com.google.assistant.p3897e.p3921j.p3926e.C51944ex) r7
            boolean r8 = r0.isEmpty()
            r10 = 3
            if (r8 != 0) goto L_0x04c1
            com.google.assistant.e.j.e.ew r8 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.f136285f
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.e.ev r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r8
            com.google.assistant.e.j.e.eu r11 = com.google.assistant.p3897e.p3921j.p3926e.C51941eu.f136271l
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.j.e.eq r11 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r11
            com.google.assistant.e.c.c.hx r12 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
            com.google.protobuf.bn r12 = r12.createBuilder()
            com.google.assistant.e.c.c.hu r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51138hu) r12
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.assistant.e.c.c.hx r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r13
            r0.getClass()
            r14 = 1
            r13.f133122b = r14
            r13.f133123c = r0
            com.google.assistant.e.c.c.hw r0 = com.google.assistant.p3897e.p3902c.p3907c.C51140hw.CONFIRMATION_PRIMARY
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.assistant.e.c.c.hx r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r13
            int r0 = r0.f133118j
            r13.f133125e = r0
            int r0 = r13.f133121a
            r0 = r0 | 8
            r13.f133121a = r0
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.c.c.db r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r0
            r0.copyOnWrite()
            com.google.protobuf.bv r13 = r0.instance
            com.google.assistant.e.c.c.dc r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r13
            int r14 = r13.f132815a
            r14 = r14 | 2
            r13.f132815a = r14
            java.lang.String r14 = "https://www.gstatic.com/images/icons/material/system/2x/check_circle_googgreen_48dp.png"
            r13.f132817c = r14
            r12.copyOnWrite()
            com.google.protobuf.bv r13 = r12.instance
            com.google.assistant.e.c.c.hx r13 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r13
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.dc r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r0
            r0.getClass()
            r13.f133126f = r0
            int r0 = r13.f133121a
            r0 = r0 | 16
            r13.f133121a = r0
            r11.copyOnWrite()
            com.google.protobuf.bv r0 = r11.instance
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            com.google.protobuf.bv r12 = r12.build()
            com.google.assistant.e.c.c.hx r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r12
            r12.getClass()
            r0.f136278f = r12
            r0.f136277e = r10
            com.google.protobuf.bv r0 = r11.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            r8.mo53759b(r0)
            r7.mo53762a(r8)
        L_0x04c1:
            boolean r0 = r2.isEmpty()
            if (r0 != 0) goto L_0x0521
            com.google.assistant.e.j.e.ew r0 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.f136285f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.e.ev r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r0
            com.google.assistant.e.j.e.eu r8 = com.google.assistant.p3897e.p3921j.p3926e.C51941eu.f136271l
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.j.e.eq r8 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r8
            com.google.assistant.e.c.c.hx r11 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
            com.google.protobuf.bn r11 = r11.createBuilder()
            com.google.assistant.e.c.c.hu r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51138hu) r11
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.e.c.c.hx r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r12
            r2.getClass()
            r13 = 1
            r12.f133122b = r13
            r12.f133123c = r2
            com.google.assistant.e.c.c.hw r2 = com.google.assistant.p3897e.p3902c.p3907c.C51140hw.CONFIRMATION_SECONDARY
            r11.copyOnWrite()
            com.google.protobuf.bv r12 = r11.instance
            com.google.assistant.e.c.c.hx r12 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r12
            int r2 = r2.f133118j
            r12.f133125e = r2
            int r2 = r12.f133121a
            r2 = r2 | 8
            r12.f133121a = r2
            r8.copyOnWrite()
            com.google.protobuf.bv r2 = r8.instance
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            com.google.protobuf.bv r11 = r11.build()
            com.google.assistant.e.c.c.hx r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r11
            r11.getClass()
            r2.f136278f = r11
            r2.f136277e = r10
            com.google.protobuf.bv r2 = r8.build()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            r0.mo53759b(r2)
            r7.mo53762a(r0)
        L_0x0521:
            boolean r0 = r6.isEmpty()
            if (r0 != 0) goto L_0x0581
            com.google.assistant.e.j.e.ew r0 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.f136285f
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.e.ev r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r0
            com.google.assistant.e.j.e.eu r2 = com.google.assistant.p3897e.p3921j.p3926e.C51941eu.f136271l
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.e.eq r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r2
            com.google.assistant.e.c.c.hx r8 = com.google.assistant.p3897e.p3902c.p3907c.C51141hx.f133119h
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.c.c.hu r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51138hu) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.assistant.e.c.c.hx r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r11
            r6.getClass()
            r12 = 1
            r11.f133122b = r12
            r11.f133123c = r6
            com.google.assistant.e.c.c.hw r6 = com.google.assistant.p3897e.p3902c.p3907c.C51140hw.CONFIRMATION_SECONDARY
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.assistant.e.c.c.hx r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r11
            int r6 = r6.f133118j
            r11.f133125e = r6
            int r6 = r11.f133121a
            r6 = r6 | 8
            r11.f133121a = r6
            r2.copyOnWrite()
            com.google.protobuf.bv r6 = r2.instance
            com.google.assistant.e.j.e.eu r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r6
            com.google.protobuf.bv r8 = r8.build()
            com.google.assistant.e.c.c.hx r8 = (com.google.assistant.p3897e.p3902c.p3907c.C51141hx) r8
            r8.getClass()
            r6.f136278f = r8
            r6.f136277e = r10
            com.google.protobuf.bv r2 = r2.build()
            com.google.assistant.e.j.e.eu r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r2
            r0.mo53759b(r2)
            r7.mo53762a(r0)
        L_0x0581:
            android.content.res.Resources r0 = r3.getResources()
            r2 = 2132085208(0x7f1509d8, float:1.9810608E38)
            java.lang.String r0 = r0.getString(r2)
            com.google.assistant.e.j.e.ew r2 = com.google.assistant.p3897e.p3921j.p3926e.C51943ew.f136285f
            com.google.protobuf.bn r2 = r2.createBuilder()
            com.google.assistant.e.j.e.ev r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51942ev) r2
            com.google.assistant.e.j.e.eu r6 = com.google.assistant.p3897e.p3921j.p3926e.C51941eu.f136271l
            com.google.protobuf.bn r6 = r6.createBuilder()
            com.google.assistant.e.j.e.eq r6 = (com.google.assistant.p3897e.p3921j.p3926e.C51937eq) r6
            com.google.assistant.e.c.c.ah r8 = com.google.assistant.p3897e.p3902c.p3907c.C50936ah.f132593m
            com.google.protobuf.bn r8 = r8.createBuilder()
            com.google.assistant.e.c.c.aa r8 = (com.google.assistant.p3897e.p3902c.p3907c.C50929aa) r8
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.c.c.ah r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r10
            int r11 = r10.f132595a
            r12 = 4
            r11 = r11 | r12
            r10.f132595a = r11
            r11 = 1
            r10.f132600f = r11
            com.google.assistant.e.c.c.ac r10 = com.google.assistant.p3897e.p3902c.p3907c.C50931ac.DEFAULT
            r8.copyOnWrite()
            com.google.protobuf.bv r11 = r8.instance
            com.google.assistant.e.c.c.ah r11 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r11
            int r10 = r10.f132590g
            r11.f132602h = r10
            int r10 = r11.f132595a
            r10 = r10 | 64
            r11.f132595a = r10
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.c.c.ah r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r10
            r0.getClass()
            r11 = 1
            r10.f132596b = r11
            r10.f132597c = r0
            com.google.assistant.e.c.c.dc r0 = com.google.assistant.p3897e.p3902c.p3907c.C51012dc.f132813k
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.c.c.db r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51011db) r0
            java.lang.String r10 = r4.f134279e
            r0.copyOnWrite()
            com.google.protobuf.bv r11 = r0.instance
            com.google.assistant.e.c.c.dc r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r11
            r10.getClass()
            int r12 = r11.f132815a
            r12 = r12 | 32
            r11.f132815a = r12
            r11.f132821g = r10
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.dc r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51012dc) r0
            r8.copyOnWrite()
            com.google.protobuf.bv r10 = r8.instance
            com.google.assistant.e.c.c.ah r10 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r10
            r0.getClass()
            r10.f132601g = r0
            int r0 = r10.f132595a
            r0 = r0 | 32
            r10.f132595a = r0
            com.google.assistant.e.c.c.gh r0 = com.google.assistant.p3897e.p3902c.p3907c.C51098gh.f133009e
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.c.c.gg r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51097gg) r0
            com.google.assistant.e.c.c.ev r10 = com.google.assistant.p3897e.p3902c.p3907c.C51058ev.f132941o
            com.google.protobuf.bn r10 = r10.createBuilder()
            com.google.assistant.e.c.c.es r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51055es) r10
            java.lang.String r4 = r4.f134279e
            r10.copyOnWrite()
            com.google.protobuf.bv r11 = r10.instance
            com.google.assistant.e.c.c.ev r11 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r11
            r4.getClass()
            int r12 = r11.f132943a
            r13 = 1
            r12 = r12 | r13
            r11.f132943a = r12
            r11.f132944b = r4
            r10.copyOnWrite()
            com.google.protobuf.bv r4 = r10.instance
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4
            int r11 = r4.f132943a
            r11 = r11 | 32
            r4.f132943a = r11
            java.lang.String r11 = "intent:#Intent;action=android.intent.action.SHOW_ALARMS;end"
            r4.f132949g = r11
            com.google.protobuf.bv r4 = r10.build()
            com.google.assistant.e.c.c.ev r4 = (com.google.assistant.p3897e.p3902c.p3907c.C51058ev) r4
            r0.copyOnWrite()
            com.google.protobuf.bv r10 = r0.instance
            com.google.assistant.e.c.c.gh r10 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r10
            r4.getClass()
            r10.f133013c = r4
            r4 = 1
            r10.f133012b = r4
            r8.copyOnWrite()
            com.google.protobuf.bv r4 = r8.instance
            com.google.assistant.e.c.c.ah r4 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.c.c.gh r0 = (com.google.assistant.p3897e.p3902c.p3907c.C51098gh) r0
            r0.getClass()
            r4.f132599e = r0
            r0 = 4
            r4.f132598d = r0
            com.google.protobuf.bv r0 = r8.build()
            com.google.assistant.e.c.c.ah r0 = (com.google.assistant.p3897e.p3902c.p3907c.C50936ah) r0
            r6.copyOnWrite()
            com.google.protobuf.bv r4 = r6.instance
            com.google.assistant.e.j.e.eu r4 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r4
            r0.getClass()
            r4.f136278f = r0
            r0 = 17
            r4.f136277e = r0
            com.google.protobuf.bv r0 = r6.build()
            com.google.assistant.e.j.e.eu r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51941eu) r0
            r2.mo53759b(r0)
            r7.mo53762a(r2)
            com.google.assistant.e.j.e.ff r0 = com.google.assistant.p3897e.p3921j.p3926e.C51953ff.f136315l
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.assistant.e.j.e.en r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51934en) r0
            com.google.protobuf.bv r2 = r7.build()
            com.google.assistant.e.j.e.fa r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51948fa) r2
            r0.mo53755b(r2)
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.assistant.e.j.e.ff r2 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r2
            int r4 = r2.f136317a
            r4 = r4 | 16
            r2.f136317a = r4
            r4 = 1
            r2.f136322f = r4
            com.google.protobuf.bv r0 = r0.build()
            com.google.assistant.e.j.e.ff r0 = (com.google.assistant.p3897e.p3921j.p3926e.C51953ff) r0
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26580j(r0)
            r5.add(r0)
        L_0x06b9:
            com.google.assistant.e.j.e.o r0 = com.google.assistant.p3897e.p3921j.p3926e.C52056o.f136624a
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26577g(r0)
            r5.add(r0)
            java.lang.String r0 = "keyguard"
            java.lang.Object r0 = r3.getSystemService(r0)
            android.app.KeyguardManager r0 = (android.app.KeyguardManager) r0
            boolean r0 = r0.isDeviceLocked()
            if (r0 == 0) goto L_0x0723
            com.google.assistant.e.j.e.fc r0 = r1.f36581h
            com.google.assistant.e.j.e.fc r1 = com.google.assistant.p3897e.p3921j.p3926e.C51950fc.FORM_UI_THEME_IRIS_GLANCEABILITY
            if (r0 != r1) goto L_0x0723
            java.util.Locale r0 = java.util.Locale.getDefault()
            android.content.res.Resources r1 = r3.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            android.os.LocaleList r1 = r1.getLocales()
            boolean r1 = r1.isEmpty()
            if (r1 != 0) goto L_0x06fd
            android.content.res.Resources r0 = r3.getResources()
            android.content.res.Configuration r0 = r0.getConfiguration()
            android.os.LocaleList r0 = r0.getLocales()
            r1 = 0
            java.util.Locale r0 = r0.get(r1)
        L_0x06fd:
            android.content.res.Resources r1 = r3.getResources()
            r2 = 2132085217(0x7f1509e1, float:1.9810627E38)
            java.lang.String r1 = r1.getString(r2)
            java.lang.String r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26588r(r0)
            com.google.assistant.e.j.dy r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11209d.m26584n(r1, r0)
            r5.add(r0)
            com.google.common.b.qy r0 = new com.google.common.b.qy
            r0.<init>(r9)
            r1 = r17
            com.google.assistant.e.e.a.j r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c.m26566b(r5, r0, r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0749
        L_0x0723:
            r1 = r17
            com.google.common.b.pz r0 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.e.a.j r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c.m26566b(r5, r0, r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r0)
            goto L_0x0749
        L_0x0730:
            r1 = r2
            com.google.common.f.e r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11182f.f36574a
            com.google.common.f.x r0 = r0.mo56225c()
            java.lang.String r2 = "getConfirmResponse: android provider package name is undefined"
            r3 = 43044(0xa824, float:6.0317E-41)
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56386p(r2)
            com.google.common.b.pz r0 = com.google.common.p4522b.C58733pz.f156496a
            com.google.assistant.e.e.a.j r0 = com.google.android.libraries.assistant.assistantactions.p621c.p623b.p629f.C11208c.m26566b(r5, r0, r1)
            com.google.common.base.ax r1 = com.google.common.base.C58833ax.m90834k(r0)
        L_0x0749:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.assistant.assistantactions.p621c.p623b.p626c.C11137a.apply(java.lang.Object):java.lang.Object");
    }
}
