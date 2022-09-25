package com.google.android.apps.search.assistant.surfaces.voice.p9590e;

import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119898q;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119899r;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119902u;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119903v;
import com.google.android.apps.search.assistant.platform.p9005b.p9006a.p9035d.C119904w;
import com.google.android.apps.search.assistant.surfaces.voice.controller.p9532ui.p9534b.C127120a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.p9736c.p9737a.C128581b;
import com.google.apps.tiktok.dataservice.C46690ah;
import com.google.apps.tiktok.dataservice.C46691ai;
import com.google.apps.tiktok.dataservice.local.C46851e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import p5462h.C69677g;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.e.e */
/* compiled from: PG */
public final class C127408e implements C46851e {

    /* renamed from: a */
    final /* synthetic */ C127409f f350823a;

    public C127408e(C127409f fVar) {
        this.f350823a = fVar;
    }

    /* renamed from: a */
    public final C46691ai mo20330a() {
        C46690ah ahVar = C127120a.f350020b;
        C69664n.m101060f(ahVar, "STATE_KEY");
        return ahVar;
    }

    /* renamed from: b */
    public final C60870cx mo20331b() {
        C119899r rVar;
        C119904w a = this.f350823a.f350824a.mo107985a();
        C128581b bVar = C128581b.GONE;
        if (a.f333911a == 2) {
            C119903v vVar = (C119903v) a.f333912b;
            int a2 = C119902u.m198776a(vVar.f333906a);
            int i = a2 - 1;
            if (a2 == 0) {
                throw null;
            } else if (i == 0) {
                if (vVar.f333906a == 1) {
                    rVar = (C119899r) vVar.f333907b;
                } else {
                    rVar = C119899r.f333900c;
                }
                int a3 = C119898q.m198773a(rVar.f333902a);
                int i2 = a3 - 1;
                if (a3 == 0) {
                    throw null;
                } else if (i2 == 0 || i2 == 1) {
                    bVar = C128581b.LISTENING;
                } else if (i2 == 2) {
                    bVar = C128581b.USER_INPUT;
                } else if (i2 == 3) {
                    bVar = C128581b.GONE;
                } else {
                    throw new C69677g();
                }
            } else if (i == 1) {
                bVar = C128581b.THINKING;
            } else if (i == 2) {
                bVar = C128581b.EXECUTING;
            } else if (i == 3) {
                bVar = C128581b.GONE;
            } else {
                throw new C69677g();
            }
        }
        return C60856cj.m92900i(bVar);
    }
}
