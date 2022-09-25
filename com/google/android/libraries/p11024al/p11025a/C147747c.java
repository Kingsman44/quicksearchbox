package com.google.android.libraries.p11024al.p11025a;

import com.google.android.gms.common.api.C143851w;
import com.google.android.gms.reminders.C145779h;
import com.google.android.gms.reminders.model.DateTime;
import com.google.android.gms.reminders.model.Location;
import com.google.android.gms.reminders.model.LocationGroup;
import com.google.android.gms.reminders.model.RecurrenceInfo;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.al.a.c */
/* compiled from: PG */
public final class C147747c implements C60931s {

    /* renamed from: a */
    final /* synthetic */ String f398685a;

    /* renamed from: b */
    final /* synthetic */ DateTime f398686b;

    /* renamed from: c */
    final /* synthetic */ Location f398687c;

    /* renamed from: d */
    final /* synthetic */ LocationGroup f398688d;

    /* renamed from: e */
    final /* synthetic */ RecurrenceInfo f398689e;

    /* renamed from: f */
    final /* synthetic */ C145779h f398690f;

    /* renamed from: g */
    final /* synthetic */ C143851w f398691g;

    public C147747c(String str, DateTime dateTime, Location location, LocationGroup locationGroup, RecurrenceInfo recurrenceInfo, C145779h hVar, C143851w wVar) {
        this.f398685a = str;
        this.f398686b = dateTime;
        this.f398687c = location;
        this.f398688d = locationGroup;
        this.f398689e = recurrenceInfo;
        this.f398690f = hVar;
        this.f398691g = wVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x008a, code lost:
        if (r15.mo122067G().equals(r0) != false) goto L_0x003e;
     */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00bf  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00cd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ com.google.common.util.concurrent.C60870cx apply(java.lang.Object r15) {
        /*
            r14 = this;
            com.google.android.gms.reminders.model.Task r15 = (com.google.android.gms.reminders.model.Task) r15
            if (r15 != 0) goto L_0x000f
            java.lang.String r15 = "CommonRemindersUtils"
            java.lang.String r0 = "No existing reminder found to perform update."
            android.util.Log.e(r15, r0)
            com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60866ct.f164955a
            goto L_0x0294
        L_0x000f:
            java.lang.String r0 = r14.f398685a
            com.google.android.gms.reminders.model.DateTime r1 = r14.f398686b
            com.google.android.gms.reminders.model.Location r2 = r14.f398687c
            com.google.android.gms.reminders.model.LocationGroup r3 = r14.f398688d
            com.google.android.gms.reminders.model.RecurrenceInfo r4 = r14.f398689e
            java.lang.String r5 = r15.mo122067G()
            boolean r5 = r5.equals(r0)
            r6 = 0
            r7 = 1
            r8 = 0
            if (r5 == 0) goto L_0x0041
            com.google.android.gms.reminders.model.DateTime r5 = r15.mo122071h()
            if (r1 != r5) goto L_0x0041
            com.google.android.gms.reminders.model.Location r5 = r15.mo122074k()
            if (r2 != r5) goto L_0x0041
            com.google.android.gms.reminders.model.LocationGroup r5 = r15.mo122075l()
            if (r3 != r5) goto L_0x0041
            com.google.android.gms.reminders.model.RecurrenceInfo r5 = r15.mo122076m()
            if (r4 != r5) goto L_0x0041
        L_0x003e:
            r0 = r8
            goto L_0x00bd
        L_0x0041:
            com.google.android.gms.reminders.model.ab r5 = new com.google.android.gms.reminders.model.ab
            r5.<init>(r15)
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r7)
            r5.f394346f = r9
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r6)
            r5.f394345e = r9
            r5.f394343c = r9
            r5.f394344d = r9
            r5.f394347g = r8
            r5.mo122170b(r8)
            r5.mo122171c(r8)
            r5.mo122172d(r8)
            r5.mo122173e(r8)
            java.lang.String r9 = r15.mo122067G()
            boolean r9 = r9.equals(r0)
            if (r9 != 0) goto L_0x0070
            r5.f394349i = r8
        L_0x0070:
            r5.f394341a = r0
            if (r1 != 0) goto L_0x008d
            if (r4 == 0) goto L_0x0077
            goto L_0x008d
        L_0x0077:
            if (r2 == 0) goto L_0x0082
            r5.mo122171c(r2)
            if (r3 == 0) goto L_0x00b9
            r5.mo122172d(r3)
            goto L_0x00b9
        L_0x0082:
            java.lang.String r1 = r15.mo122067G()
            boolean r0 = r1.equals(r0)
            if (r0 == 0) goto L_0x00b9
            goto L_0x003e
        L_0x008d:
            if (r1 == 0) goto L_0x00b4
            com.google.android.gms.reminders.model.f r0 = new com.google.android.gms.reminders.model.f
            r0.<init>(r1)
            java.lang.Integer r2 = r15.mo122084z()
            if (r2 == 0) goto L_0x00ab
            java.lang.Integer r2 = r15.mo122084z()
            boolean r2 = com.google.android.libraries.p11024al.p11025a.C147754j.m240816d(r2)
            if (r2 == 0) goto L_0x00ab
            java.lang.Long r1 = com.google.android.libraries.p11024al.p11025a.C147754j.m240815c(r1)
            r0.f394372f = r1
            goto L_0x00ad
        L_0x00ab:
            r0.f394372f = r8
        L_0x00ad:
            com.google.android.gms.reminders.model.DateTime r0 = r0.mo122198a()
            r5.mo122170b(r0)
        L_0x00b4:
            if (r4 == 0) goto L_0x00b9
            r5.mo122173e(r4)
        L_0x00b9:
            com.google.android.gms.reminders.model.Task r0 = r5.mo122169a()
        L_0x00bd:
            if (r0 != 0) goto L_0x00cd
            com.google.android.gms.reminders.model.TaskId r15 = r15.mo122077n()
            java.lang.String r15 = r15.mo122058h()
            com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60856cj.m92900i(r15)
            goto L_0x0294
        L_0x00cd:
            com.google.android.gms.reminders.h r1 = r14.f398690f
            com.google.android.gms.common.api.w r2 = r14.f398691g
            boolean r3 = com.google.android.libraries.p11024al.p11025a.C147753i.m240808c(r15)
            boolean r4 = com.google.android.libraries.p11024al.p11025a.C147753i.m240808c(r0)
            java.lang.String r5 = com.google.android.libraries.p11024al.p11025a.C147756l.m240820b()
            com.google.android.gms.reminders.UpdateRecurrenceOptions r9 = com.google.android.gms.reminders.UpdateRecurrenceOptions.f394129a
            java.lang.String r10 = "task_id required"
            java.lang.String r11 = "Must set task list"
            if (r3 == 0) goto L_0x0209
            com.google.android.gms.reminders.model.RecurrenceInfo r3 = r15.mo122076m()
            java.lang.String r3 = r3.mo122042k()
            java.lang.Long r12 = com.google.android.libraries.p11024al.p11025a.C147754j.m240814b(r15)
            if (r12 == 0) goto L_0x0109
            com.google.android.gms.reminders.n r9 = new com.google.android.gms.reminders.n
            r9.<init>()
            r9.mo122234b(r7)
            long r12 = r12.longValue()
            java.lang.Long r12 = java.lang.Long.valueOf(r12)
            r9.f394400b = r12
            com.google.android.gms.reminders.UpdateRecurrenceOptions r9 = r9.mo122233a()
        L_0x0109:
            java.lang.String r12 = "updateRecurrenceOption required"
            if (r4 == 0) goto L_0x01ab
            com.google.android.gms.reminders.model.RecurrenceInfo r15 = r15.mo122076m()
            com.google.android.gms.reminders.model.Recurrence r15 = r15.mo122039h()
            r4 = r0
            com.google.android.gms.reminders.model.TaskEntity r4 = (com.google.android.gms.reminders.model.TaskEntity) r4
            com.google.android.gms.reminders.model.RecurrenceInfoEntity r8 = r4.f394326q
            com.google.android.gms.reminders.model.Recurrence r8 = r8.mo122039h()
            boolean r15 = r15.equals(r8)
            if (r15 == 0) goto L_0x0141
            com.google.android.gms.reminders.model.Task r15 = com.google.android.libraries.p11024al.p11025a.C147755k.m240818b(r0)
            com.google.android.gms.common.api.z r15 = r1.mo121950c(r2, r3, r15, r9)
            com.google.common.util.concurrent.cx r15 = com.google.android.libraries.p11024al.p11025a.C147753i.m240809d(r15)
            com.google.android.libraries.al.a.h r0 = new com.google.android.libraries.al.a.h
            java.lang.String r1 = com.google.android.libraries.p11024al.p11025a.C147756l.m240821c(r3)
            r0.<init>(r1)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60922j.m93044g(r15, r0, r1)
            goto L_0x0294
        L_0x0141:
            com.google.android.gms.reminders.model.RecurrenceInfoEntity r15 = r4.f394326q
            com.google.android.gms.reminders.model.Recurrence r15 = r15.mo122039h()
            com.google.android.gms.reminders.model.Task r0 = com.google.android.libraries.p11024al.p11025a.C147755k.m240818b(r0)
            java.lang.String r1 = "new_recurrence required"
            com.google.android.gms.common.internal.C143919bh.m233971n(r15, r1)
            r1 = r0
            com.google.android.gms.reminders.model.TaskEntity r1 = (com.google.android.gms.reminders.model.TaskEntity) r1
            java.lang.Boolean r4 = r1.f394316g
            if (r4 == 0) goto L_0x015d
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L_0x015e
        L_0x015d:
            r6 = 1
        L_0x015e:
            java.lang.String r4 = "task.deleted field is readonly"
            com.google.android.gms.common.internal.C143919bh.m233960c(r6, r4)
            boolean r4 = android.text.TextUtils.equals(r3, r5)
            r4 = r4 ^ r7
            java.lang.String r6 = "new recurrenceId must be different than existing recurrenceId"
            com.google.android.gms.common.internal.C143919bh.m233960c(r4, r6)
            java.lang.Integer r1 = r1.f394311b
            com.google.android.gms.common.internal.C143919bh.m233971n(r1, r11)
            com.google.android.gms.common.internal.C143919bh.m233971n(r9, r12)
            com.google.android.gms.reminders.internal.p10862a.C145804w.m237120g(r3)
            com.google.android.gms.reminders.internal.p10862a.C145804w.m237120g(r5)
            com.google.android.gms.reminders.internal.p10862a.C145804w.m237121h(r15)
            com.google.android.gms.reminders.internal.p10862a.C145804w.m237123j(r0)
            com.google.android.gms.reminders.model.ab r15 = com.google.android.gms.reminders.internal.p10862a.C145804w.m237117d(r0, r5, r15)
            com.google.android.gms.reminders.model.Task r15 = r15.mo122169a()
            com.google.android.gms.reminders.model.Task r15 = com.google.android.gms.reminders.internal.p10862a.C145804w.m237118e(r15)
            com.google.android.gms.reminders.internal.a.l r0 = new com.google.android.gms.reminders.internal.a.l
            r0.<init>(r2, r3, r15, r9)
            com.google.android.gms.common.api.internal.m r15 = r2.mo119159d(r0)
            com.google.common.util.concurrent.cx r15 = com.google.android.libraries.p11024al.p11025a.C147753i.m240809d(r15)
            com.google.android.libraries.al.a.h r0 = new com.google.android.libraries.al.a.h
            java.lang.String r1 = com.google.android.libraries.p11024al.p11025a.C147756l.m240821c(r5)
            r0.<init>(r1)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60922j.m93044g(r15, r0, r1)
            goto L_0x0294
        L_0x01ab:
            com.google.android.gms.reminders.model.ab r1 = new com.google.android.gms.reminders.model.ab
            r1.<init>(r0)
            java.lang.String r0 = com.google.android.libraries.p11024al.p11025a.C147756l.m240820b()
            com.google.android.gms.reminders.model.TaskIdEntity r4 = new com.google.android.gms.reminders.model.TaskIdEntity
            r4.<init>(r0, r8)
            r1.mo122174f(r4)
            com.google.android.gms.reminders.model.Task r0 = r1.mo122169a()
            r1 = r0
            com.google.android.gms.reminders.model.TaskEntity r1 = (com.google.android.gms.reminders.model.TaskEntity) r1
            com.google.android.gms.reminders.model.TaskIdEntity r4 = r1.f394310a
            com.google.android.gms.common.internal.C143919bh.m233971n(r4, r10)
            com.google.android.gms.reminders.internal.p10862a.C145804w.m237120g(r3)
            java.lang.Integer r1 = r1.f394311b
            com.google.android.gms.common.internal.C143919bh.m233971n(r1, r11)
            com.google.android.gms.common.internal.C143919bh.m233971n(r9, r12)
            com.google.android.gms.reminders.model.ab r1 = new com.google.android.gms.reminders.model.ab
            r1.<init>(r0)
            r1.mo122173e(r8)
            com.google.android.gms.reminders.model.Task r0 = r1.mo122169a()
            com.google.android.gms.reminders.model.Task r0 = com.google.android.gms.reminders.internal.p10862a.C145804w.m237118e(r0)
            com.google.android.gms.reminders.internal.a.n r1 = new com.google.android.gms.reminders.internal.a.n
            r1.<init>(r2, r3, r0, r9)
            com.google.android.gms.common.api.internal.m r0 = r2.mo119159d(r1)
            com.google.common.util.concurrent.cx r0 = com.google.android.libraries.p11024al.p11025a.C147753i.m240809d(r0)
            com.google.android.libraries.al.a.h r1 = new com.google.android.libraries.al.a.h
            com.google.android.gms.reminders.model.RecurrenceInfo r15 = r15.mo122076m()
            java.lang.String r15 = r15.mo122042k()
            java.lang.String r15 = com.google.android.libraries.p11024al.p11025a.C147756l.m240821c(r15)
            r1.<init>(r15)
            com.google.common.util.concurrent.bg r15 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60922j.m93044g(r0, r1, r15)
            goto L_0x0294
        L_0x0209:
            if (r4 == 0) goto L_0x026f
            com.google.android.gms.reminders.model.TaskId r15 = r15.mo122077n()
            r1 = r0
            com.google.android.gms.reminders.model.TaskEntity r1 = (com.google.android.gms.reminders.model.TaskEntity) r1
            com.google.android.gms.reminders.model.RecurrenceInfoEntity r1 = r1.f394326q
            com.google.android.gms.reminders.model.Recurrence r1 = r1.mo122039h()
            com.google.android.gms.reminders.model.Task r0 = com.google.android.libraries.p11024al.p11025a.C147755k.m240818b(r0)
            com.google.android.gms.common.internal.C143919bh.m233971n(r15, r10)
            java.lang.String r3 = "recurrence required"
            com.google.android.gms.common.internal.C143919bh.m233971n(r1, r3)
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            r4 = r0
            com.google.android.gms.reminders.model.TaskEntity r4 = (com.google.android.gms.reminders.model.TaskEntity) r4
            java.lang.Boolean r6 = r4.f394316g
            boolean r3 = r3.equals(r6)
            r3 = r3 ^ r7
            java.lang.String r6 = "Task.deleted field is readonly."
            com.google.android.gms.common.internal.C143919bh.m233960c(r3, r6)
            java.lang.Integer r3 = r4.f394311b
            com.google.android.gms.common.internal.C143919bh.m233971n(r3, r11)
            com.google.android.gms.reminders.internal.p10862a.C145804w.m237120g(r5)
            com.google.android.gms.reminders.internal.p10862a.C145804w.m237121h(r1)
            com.google.android.gms.reminders.internal.p10862a.C145804w.m237123j(r0)
            com.google.android.gms.reminders.model.ab r0 = com.google.android.gms.reminders.internal.p10862a.C145804w.m237117d(r0, r5, r1)
            r0.mo122174f(r15)
            com.google.android.gms.reminders.model.Task r15 = r0.mo122169a()
            com.google.android.gms.reminders.model.Task r15 = com.google.android.gms.reminders.internal.p10862a.C145804w.m237118e(r15)
            com.google.android.gms.reminders.internal.a.m r0 = new com.google.android.gms.reminders.internal.a.m
            r0.<init>(r2, r15)
            com.google.android.gms.common.api.internal.m r15 = r2.mo119159d(r0)
            com.google.common.util.concurrent.cx r15 = com.google.android.libraries.p11024al.p11025a.C147753i.m240809d(r15)
            com.google.android.libraries.al.a.h r0 = new com.google.android.libraries.al.a.h
            java.lang.String r1 = com.google.android.libraries.p11024al.p11025a.C147756l.m240821c(r5)
            r0.<init>(r1)
            com.google.common.util.concurrent.bg r1 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60922j.m93044g(r15, r0, r1)
            goto L_0x0294
        L_0x026f:
            com.google.android.gms.reminders.model.Task[] r15 = new com.google.android.gms.reminders.model.Task[r7]
            r15[r6] = r0
            java.util.List r15 = java.util.Arrays.asList(r15)
            com.google.android.gms.reminders.internal.a.w r1 = (com.google.android.gms.reminders.internal.p10862a.C145804w) r1
            com.google.android.gms.common.api.z r15 = r1.mo121948a(r2, r15)
            com.google.common.util.concurrent.cx r15 = com.google.android.libraries.p11024al.p11025a.C147753i.m240809d(r15)
            com.google.android.libraries.al.a.h r1 = new com.google.android.libraries.al.a.h
            com.google.android.gms.reminders.model.TaskEntity r0 = (com.google.android.gms.reminders.model.TaskEntity) r0
            com.google.android.gms.reminders.model.TaskIdEntity r0 = r0.f394310a
            java.lang.String r0 = r0.mo122058h()
            r1.<init>(r0)
            com.google.common.util.concurrent.bg r0 = com.google.common.util.concurrent.C60826bg.f164896a
            com.google.common.util.concurrent.cx r15 = com.google.common.util.concurrent.C60922j.m93044g(r15, r1, r0)
        L_0x0294:
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.p11024al.p11025a.C147747c.apply(java.lang.Object):com.google.common.util.concurrent.cx");
    }
}
