package com.google.apps.tiktok.concurrent.futuresmixin;

import android.content.Context;
import androidx.lifecycle.C2358bf;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.apps.tiktok.tracing.C47831fm;
import com.google.common.util.concurrent.C60870cx;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;

/* compiled from: PG */
public final class FuturesMixinViewModel extends C2358bf implements C46453s {

    /* renamed from: a */
    public final Executor f121521a;

    /* renamed from: b */
    public final C46435a f121522b = new C46435a("FuturesMixinRF");

    /* renamed from: c */
    public final Set f121523c;

    /* renamed from: d */
    public final int f121524d;

    /* renamed from: e */
    public boolean f121525e;

    /* renamed from: f */
    private final Context f121526f;

    /* JADX WARNING: Removed duplicated region for block: B:12:0x006d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public FuturesMixinViewModel(androidx.lifecycle.C2344as r11, android.content.Context r12, java.util.concurrent.Executor r13) {
        /*
            r10 = this;
            r10.<init>()
            com.google.apps.tiktok.concurrent.futuresmixin.a r0 = new com.google.apps.tiktok.concurrent.futuresmixin.a
            java.lang.String r1 = "FuturesMixinRF"
            r0.<init>(r1)
            r10.f121522b = r0
            r0 = 0
            r10.f121525e = r0
            r10.f121521a = r13
            r10.f121526f = r12
            int r13 = android.os.Process.myPid()
            r10.f121524d = r13
            java.lang.String r13 = "future_saved_state"
            java.lang.Object r1 = r11.mo5755b(r13)
            android.os.Bundle r1 = (android.os.Bundle) r1
            r2 = 1
            if (r1 == 0) goto L_0x00cc
            java.lang.String r3 = "last_process_id"
            int r3 = r1.getInt(r3)
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 30
            if (r4 < r5) goto L_0x005b
            java.lang.String r4 = "activity"
            java.lang.Object r4 = r12.getSystemService(r4)
            android.app.ActivityManager r4 = (android.app.ActivityManager) r4
            if (r4 == 0) goto L_0x005b
            java.lang.String r12 = r12.getPackageName()
            java.util.List r12 = r4.getHistoricalProcessExitReasons(r12, r3, r2)
            boolean r3 = r12.isEmpty()
            if (r3 != 0) goto L_0x005b
            java.lang.Object r12 = r12.get(r0)
            android.app.ApplicationExitInfo r12 = (android.app.ApplicationExitInfo) r12
            int r12 = r12.getReason()
            java.lang.Integer r12 = java.lang.Integer.valueOf(r12)
            com.google.common.base.ax r12 = com.google.common.base.C58833ax.m90834k(r12)
            goto L_0x005d
        L_0x005b:
            com.google.common.base.b r12 = com.google.common.base.C58836b.f156633a
        L_0x005d:
            java.lang.String r3 = "future_wrappers"
            android.os.Parcelable[] r3 = r1.getParcelableArray(r3)
            java.util.HashSet r4 = new java.util.HashSet
            int r5 = r3.length
            r4.<init>(r5)
            r10.f121523c = r4
        L_0x006b:
            if (r0 >= r5) goto L_0x00d3
            r4 = r3[r0]
            com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture r4 = (com.google.apps.tiktok.concurrent.futuresmixin.ParcelableFuture) r4
            com.google.common.base.ax r6 = r4.f121530c
            boolean r6 = r6.mo56113h()
            if (r6 != 0) goto L_0x007a
            goto L_0x00c4
        L_0x007a:
            com.google.common.base.ax r6 = r4.f121530c
            java.lang.Object r6 = r6.mo56107c()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            if (r6 == r2) goto L_0x00c4
            r7 = 2
            if (r6 != r7) goto L_0x00ae
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "ParcelableFuture was Parceled by a lifecycle change before it completed."
            r6.<init>(r7)
            boolean r7 = r12.mo56113h()
            if (r7 == 0) goto L_0x00a4
            java.lang.String r7 = " process exit reason code: "
            r6.append(r7)
            java.lang.Object r7 = r12.mo56107c()
            r6.append(r7)
        L_0x00a4:
            com.google.apps.tiktok.concurrent.futuresmixin.t r7 = new com.google.apps.tiktok.concurrent.futuresmixin.t
            java.lang.String r6 = r6.toString()
            r7.<init>(r6)
            goto L_0x00c1
        L_0x00ae:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "ParcelableFuture read in unexpected value for hasResult: "
            r8.<init>(r9)
            r8.append(r6)
            java.lang.String r6 = r8.toString()
            r7.<init>(r6)
        L_0x00c1:
            r4.mo50433b(r7)
        L_0x00c4:
            java.util.Set r6 = r10.f121523c
            r6.add(r4)
            int r0 = r0 + 1
            goto L_0x006b
        L_0x00cc:
            java.util.HashSet r12 = new java.util.HashSet
            r12.<init>(r2)
            r10.f121523c = r12
        L_0x00d3:
            com.google.apps.tiktok.concurrent.futuresmixin.a r12 = r10.f121522b
            r12.mo50442e(r1)
            com.google.apps.tiktok.concurrent.futuresmixin.p r12 = new com.google.apps.tiktok.concurrent.futuresmixin.p
            r12.<init>(r10)
            r11.mo5758e(r13, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.apps.tiktok.concurrent.futuresmixin.FuturesMixinViewModel.<init>(androidx.lifecycle.as, android.content.Context, java.util.concurrent.Executor):void");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo50431a(C60870cx cxVar, Object obj, C46440f fVar) {
        C19559g.m37304c();
        WeakHashMap weakHashMap = C47831fm.f123851a;
        ParcelableFuture parcelableFuture = new ParcelableFuture(this.f121522b.mo50438a(fVar), obj, cxVar);
        this.f121523c.add(parcelableFuture);
        if (this.f121525e) {
            parcelableFuture.mo50434c(this);
            if (!cxVar.isDone()) {
                fVar.mo18068i(obj);
            }
        }
    }
}
