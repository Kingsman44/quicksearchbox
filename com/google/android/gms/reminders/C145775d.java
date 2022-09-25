package com.google.android.gms.reminders;

import com.google.android.gms.reminders.model.TaskId;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.gms.reminders.d */
/* compiled from: PG */
public final class C145775d {

    /* renamed from: a */
    public TaskId[] f394134a;

    /* renamed from: b */
    public Long f394135b = null;

    /* renamed from: c */
    public Long f394136c = null;

    /* renamed from: d */
    public Long f394137d = null;

    /* renamed from: e */
    public Long f394138e = null;

    /* renamed from: f */
    public boolean f394139f = false;

    /* renamed from: g */
    public int f394140g = 0;

    /* renamed from: h */
    public int f394141h = 0;

    /* renamed from: i */
    private List f394142i;

    /* renamed from: j */
    private int f394143j = -1;

    /* renamed from: a */
    public final LoadRemindersOptions mo121943a() {
        if (this.f394134a == null) {
            return new LoadRemindersOptions((List) null, this.f394142i, this.f394135b, this.f394136c, this.f394137d, this.f394138e, this.f394139f, this.f394140g, false, false, this.f394143j, this.f394141h, (List) null, (Long) null, (Long) null);
        }
        ArrayList arrayList = new ArrayList();
        for (TaskId h : this.f394134a) {
            arrayList.add(h.mo122058h());
        }
        return new LoadRemindersOptions(arrayList, this.f394142i, this.f394135b, this.f394136c, this.f394137d, this.f394138e, this.f394139f, this.f394140g, false, false, this.f394143j, this.f394141h, (List) null, (Long) null, (Long) null);
    }

    /* renamed from: b */
    public final void mo121944b(int i) {
        if (this.f394142i == null) {
            this.f394142i = new ArrayList();
        }
        this.f394142i.add(Integer.valueOf(i));
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x002c  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x002f  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo121945c(int... r10) {
        /*
            r9 = this;
            r0 = 0
            r9.f394143j = r0
            int r1 = r10.length
            r2 = 0
        L_0x0005:
            if (r2 >= r1) goto L_0x0039
            r3 = r10[r2]
            r4 = -1
            r5 = 1
            if (r3 == r4) goto L_0x0018
            if (r3 == 0) goto L_0x0018
            if (r3 == r5) goto L_0x0018
            r6 = 2
            if (r3 != r6) goto L_0x0016
            r3 = 2
            goto L_0x0018
        L_0x0016:
            r6 = 0
            goto L_0x0019
        L_0x0018:
            r6 = 1
        L_0x0019:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Invalid load reminder type:"
            r7.<init>(r8)
            r7.append(r3)
            java.lang.String r7 = r7.toString()
            com.google.android.gms.common.internal.C143919bh.m233960c(r6, r7)
            if (r3 != r4) goto L_0x002f
            r9.f394143j = r4
            goto L_0x0036
        L_0x002f:
            int r4 = r9.f394143j
            int r3 = r5 << r3
            r3 = r3 | r4
            r9.f394143j = r3
        L_0x0036:
            int r2 = r2 + 1
            goto L_0x0005
        L_0x0039:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.reminders.C145775d.mo121945c(int[]):void");
    }
}
