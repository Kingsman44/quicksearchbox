package com.google.android.libraries.mdi.download.p2236d;

import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29035b;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.common.base.C58838bb;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;

/* renamed from: com.google.android.libraries.mdi.download.d.dm */
/* compiled from: PG */
public final /* synthetic */ class C28996dm implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C29117fe f78725a;

    /* renamed from: b */
    public final /* synthetic */ C29035b f78726b;

    /* renamed from: c */
    public final /* synthetic */ C29334dr f78727c;

    /* renamed from: d */
    public final /* synthetic */ C29392ep f78728d;

    /* renamed from: e */
    public final /* synthetic */ boolean f78729e;

    /* renamed from: f */
    public final /* synthetic */ C60931s f78730f;

    /* renamed from: g */
    public final /* synthetic */ C29392ep f78731g;

    /* renamed from: h */
    public final /* synthetic */ C29334dr f78732h;

    public /* synthetic */ C28996dm(C29117fe feVar, C29035b bVar, C29334dr drVar, C29392ep epVar, boolean z, C60931s sVar, C29392ep epVar2, C29334dr drVar2) {
        this.f78725a = feVar;
        this.f78726b = bVar;
        this.f78727c = drVar;
        this.f78728d = epVar;
        this.f78729e = z;
        this.f78730f = sVar;
        this.f78731g = epVar2;
        this.f78732h = drVar2;
    }

    public final C60870cx apply(Object obj) {
        C29117fe feVar = this.f78725a;
        C29035b bVar = this.f78726b;
        C29334dr drVar = this.f78727c;
        C29392ep epVar = this.f78728d;
        boolean z = this.f78729e;
        C60931s sVar = this.f78730f;
        C29392ep epVar2 = this.f78731g;
        C29334dr drVar2 = this.f78732h;
        C29116fd fdVar = (C29116fd) obj;
        if (fdVar == C29116fd.FAILED) {
            bVar.mo34555b(drVar);
            return C60856cj.m92900i(C29116fd.FAILED);
        } else if (fdVar == C29116fd.PENDING) {
            bVar.mo34557d(bVar.f78828b + -1 != 0 ? 1112 : 1007, drVar);
            return C60856cj.m92900i(C29116fd.PENDING);
        } else {
            C58838bb.m90868c(fdVar == C29116fd.DOWNLOADED);
            return C29670b.m54719g(sVar.apply(drVar)).mo34822i(new C29002ds(feVar, bVar, drVar, z, epVar), feVar.f78980i).mo34822i(new C28990dg(feVar, drVar), feVar.f78980i).mo34822i(new C28991dh(feVar, epVar2, drVar2), feVar.f78980i).mo34822i(new C28992di(feVar, z, epVar), feVar.f78980i).mo34822i(new C28993dj(feVar), feVar.f78980i).mo34821h(new C28995dl(bVar, drVar2), feVar.f78980i);
        }
    }
}
