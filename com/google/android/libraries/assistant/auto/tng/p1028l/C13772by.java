package com.google.android.libraries.assistant.auto.tng.p1028l;

import android.app.ActivityManager;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1031b.C13745b;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1031b.C13747d;
import com.google.android.libraries.assistant.auto.tng.p1028l.p1033d.C13829a;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.by */
/* compiled from: PG */
public final /* synthetic */ class C13772by implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C13811cj f41956a;

    /* renamed from: b */
    public final /* synthetic */ C13755bh f41957b;

    /* renamed from: c */
    public final /* synthetic */ C13829a f41958c;

    public /* synthetic */ C13772by(C13811cj cjVar, C13755bh bhVar, C13829a aVar) {
        this.f41956a = cjVar;
        this.f41957b = bhVar;
        this.f41958c = aVar;
    }

    public final C60870cx apply(Object obj) {
        C13811cj cjVar = this.f41956a;
        C13755bh bhVar = this.f41957b;
        C13829a aVar = this.f41958c;
        Void voidR = (Void) obj;
        if (cjVar.f42070n.get()) {
            C58976aa aaVar = C58975e.f156826a;
            return C60856cj.m92898g();
        }
        if (((Boolean) cjVar.f42066j.mo17428b()).booleanValue()) {
            int a = C13747d.m29996a();
            float f = 0.0f;
            if (a != -1) {
                int[] b = C13747d.m29997b(C13745b.CPUINFO_MIN_FREQ);
                int[] b2 = C13747d.m29997b(C13745b.CPUINFO_MAX_FREQ);
                int[] b3 = C13747d.m29997b(C13745b.SCALING_CUR_FREQ);
                float f2 = 0.0f;
                for (int i = 0; i < a; i++) {
                    int i2 = b[i];
                    int i3 = b2[i];
                    int i4 = b3[i];
                    if (i2 == -1 || i3 == -1 || i4 == -1) {
                        a--;
                        C58976aa aaVar2 = C58975e.f156826a;
                    } else {
                        f2 += ((float) (i4 - i2)) / ((float) (i3 - i2));
                    }
                }
                if (a > 0) {
                    f = f2 / ((float) a);
                }
            }
            if (((double) f) > ((Double) cjVar.f42067k.mo17428b()).doubleValue()) {
                C58976aa aaVar3 = C58975e.f156826a;
                cjVar.f42061e.f42086b.mo19974a(C37179a.f97617dd);
                return C60856cj.m92898g();
            }
            ActivityManager activityManager = cjVar.f42069m;
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            try {
                activityManager.getMemoryInfo(memoryInfo);
            } catch (SecurityException unused) {
                C58976aa aaVar4 = C58975e.f156826a;
                memoryInfo = null;
            }
            if (memoryInfo != null && memoryInfo.lowMemory) {
                C58976aa aaVar5 = C58975e.f156826a;
                cjVar.f42061e.f42086b.mo19974a(C37179a.f97618de);
                return C60856cj.m92898g();
            }
        }
        C58976aa aaVar6 = C58975e.f156826a;
        cjVar.f42080x = bhVar.mo21251a(aVar, new C13809ch(cjVar, aVar.mo21272c(), aVar.mo21271b()));
        C60870cx c = cjVar.f42080x.mo21241c();
        C60856cj.m92911t(c, C47810es.m84974n(new C13813cl(cjVar.f42061e)), C60826bg.f164896a);
        return c;
    }
}
