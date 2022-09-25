package com.google.android.libraries.mdi.download;

import com.google.android.libraries.mdi.C28597c;
import com.google.android.libraries.mdi.C29689e;
import com.google.android.libraries.mdi.download.p2236d.C29202ii;
import com.google.android.libraries.mdi.download.p2236d.C29211ir;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import com.google.protobuf.C63070h;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.ha */
/* compiled from: PG */
public final /* synthetic */ class C29630ha implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29689e f80235a;

    /* renamed from: b */
    public final /* synthetic */ C29211ir f80236b;

    /* renamed from: c */
    public final /* synthetic */ C29328dl f80237c;

    /* renamed from: d */
    public final /* synthetic */ C29334dr f80238d;

    /* renamed from: e */
    public final /* synthetic */ boolean f80239e;

    /* renamed from: f */
    public final /* synthetic */ boolean f80240f;

    /* renamed from: g */
    public final /* synthetic */ C42813k f80241g;

    /* renamed from: h */
    public final /* synthetic */ Executor f80242h;

    public /* synthetic */ C29630ha(C29689e eVar, C29211ir irVar, C29328dl dlVar, C29334dr drVar, boolean z, boolean z2, C42813k kVar, Executor executor) {
        this.f80235a = eVar;
        this.f80236b = irVar;
        this.f80237c = dlVar;
        this.f80238d = drVar;
        this.f80239e = z;
        this.f80240f = z2;
        this.f80241g = kVar;
        this.f80242h = executor;
    }

    public final C60870cx apply(Object obj) {
        C63070h hVar;
        C29689e eVar = this.f80235a;
        C29211ir irVar = this.f80236b;
        C29328dl dlVar = this.f80237c;
        C29334dr drVar = this.f80238d;
        boolean z = this.f80239e;
        boolean z2 = this.f80240f;
        C42813k kVar = this.f80241g;
        Executor executor = this.f80242h;
        C28597c cVar = (C28597c) obj;
        if (eVar == C29689e.DOWNLOADED || eVar == C29689e.PENDING_CUSTOM_VALIDATION) {
            C29045l.m53932d("%s getDataFileUri %s %s", "MDDManager", dlVar.f79473b, drVar.f79501c);
            return C60922j.m93045h(C60922j.m93045h(irVar.mo34632h(), C47810es.m84966f(new C29202ii(irVar, dlVar, drVar, z)), irVar.f79204n), C47810es.m84966f(new C29433fx(z2, kVar, cVar, dlVar)), executor);
        }
        String str = dlVar.f79473b;
        int i = dlVar.f79475d;
        int i2 = dlVar.f79480i;
        if ((dlVar.f79472a & 8192) != 0) {
            hVar = dlVar.f79487p;
            if (hVar == null) {
                hVar = C63070h.f170215c;
            }
        } else {
            hVar = null;
        }
        cVar.mo34275b(C29647hr.m54607o(str, i, i2, (String) null, hVar));
        return C60856cj.m92900i(cVar);
    }
}
