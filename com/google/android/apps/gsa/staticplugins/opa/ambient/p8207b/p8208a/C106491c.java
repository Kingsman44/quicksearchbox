package com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8208a;

import android.app.ActivityManager;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.media.AudioManager;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106531e;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8217d.C106532f;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8222i.C106564b;
import com.google.android.apps.gsa.staticplugins.opa.ambient.p8207b.p8213d.p8222i.C106566d;
import com.google.android.libraries.p1635au.C19567d;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60845bz;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.ambient.b.a.c */
/* compiled from: PG */
final class C106491c implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C106532f f296992a;

    /* renamed from: b */
    final /* synthetic */ C106493e f296993b;

    public C106491c(C106493e eVar, C106532f fVar) {
        this.f296993b = eVar;
        this.f296992a = fVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) this.f296993b.f296995a.mo56226d()).mo56382g(th)).mo56372aa(23070)).mo56386p("Error getting current media session state.");
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        boolean z;
        boolean z2;
        boolean z3;
        List<ActivityManager.RunningAppProcessInfo> runningAppProcesses;
        C58485gu j = C58485gu.m89842j(((C106566d) obj).f297149a);
        boolean z4 = !j.isEmpty();
        C106493e eVar = this.f296993b;
        C39141kp kpVar = eVar.f297001g;
        boolean isDeviceLocked = eVar.f297003i.f230023b.isDeviceLocked();
        C58976aa aaVar = C58975e.f156826a;
        C106493e eVar2 = this.f296993b;
        ActivityManager activityManager = (ActivityManager) eVar2.f297002h.getSystemService("activity");
        if (activityManager != null && (runningAppProcesses = activityManager.getRunningAppProcesses()) != null) {
            Intent intent = new Intent("android.intent.action.MAIN");
            intent.addCategory("android.intent.category.HOME");
            ResolveInfo resolveActivity = eVar2.f297002h.getPackageManager().resolveActivity(intent, 65536);
            if (resolveActivity != null && resolveActivity.activityInfo != null) {
                String str = resolveActivity.activityInfo.packageName;
                Iterator<ActivityManager.RunningAppProcessInfo> it = runningAppProcesses.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    ActivityManager.RunningAppProcessInfo next = it.next();
                    if (next.importance == 100 && next.processName.equals(str)) {
                        z = true;
                        break;
                    }
                }
            }
        }
        z = false;
        AudioManager audioManager = (AudioManager) this.f296993b.f297002h.getSystemService("audio");
        if (audioManager == null) {
            z2 = false;
        } else {
            z2 = audioManager.isMusicActive();
        }
        AudioManager audioManager2 = (AudioManager) this.f296993b.f297002h.getSystemService("audio");
        if (audioManager2 != null && (audioManager2.getMode() == 2 || audioManager2.getMode() == 3)) {
            z3 = true;
        } else {
            z3 = false;
        }
        C106531e a = C106531e.m177306a(this.f296992a.f297082c);
        if (a == null) {
            a = C106531e.UNKNOWN;
        }
        ((C19567d) kpVar.f102891bV.mo6453a()).mo24822a(1, Boolean.valueOf(isDeviceLocked), Boolean.valueOf(z4), Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3), a.name());
        if (z4) {
            C106493e eVar3 = this.f296993b;
            C39141kp kpVar2 = eVar3.f297001g;
            int size = j.size();
            long j2 = 0;
            long j3 = 0;
            int i = 0;
            while (true) {
                if (i < size) {
                    C106564b bVar = (C106564b) j.get(i);
                    if (bVar.f297145d) {
                        break;
                    }
                    long j4 = bVar.f297146e;
                    if (j4 > j3) {
                        j3 = j4;
                    }
                    i++;
                } else if (j3 == 0) {
                    j2 = -1;
                } else {
                    j2 = (eVar3.f296999e.mo26871c() - j3) / 60000;
                }
            }
            ((C19569f) kpVar2.f102893bX.mo6453a()).mo24824b((double) j2, Boolean.valueOf(this.f296993b.f297003i.f230023b.isDeviceLocked()));
        }
    }
}
