package com.google.android.libraries.mdi.download.p2248h;

import android.net.Uri;
import com.google.android.libraries.mdi.download.C28730bh;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58836b;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60930r;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.libraries.mdi.download.h.ao */
/* compiled from: PG */
public final /* synthetic */ class C29505ao implements C60930r {

    /* renamed from: a */
    public final /* synthetic */ C29514ax f79957a;

    /* renamed from: b */
    public final /* synthetic */ C29409fd f79958b;

    public /* synthetic */ C29505ao(C29514ax axVar, C29409fd fdVar) {
        this.f79957a = axVar;
        this.f79958b = fdVar;
    }

    /* renamed from: a */
    public final C60870cx mo18058a() {
        C29514ax axVar = this.f79957a;
        C29409fd fdVar = this.f79958b;
        C29045l.m53930b("%s: Add groups from ManifestFileFlag to MDD.", "ManifestFileGroupPopulator");
        C28730bh bhVar = (C28730bh) axVar.f79982b.mo6453a();
        if (bhVar == null || bhVar.equals(C28730bh.f78048d)) {
            C29045l.m53943o("%s: The ManifestFileFlag is empty.", "ManifestFileGroupPopulator");
            axVar.mo34756g(3, C28730bh.f78048d);
            return C60866ct.f164955a;
        } else if ((bhVar.f78050a & 1) == 0 || bhVar.f78051b.isEmpty() || (bhVar.f78050a & 2) == 0 || !bhVar.f78052c.startsWith("https")) {
            axVar.mo34756g(402, bhVar);
            C29045l.m53935g("%s: Invalid manifest config from manifest flag.", "ManifestFileGroupPopulator");
            return C60856cj.m92899h(new IllegalArgumentException("Invalid manifest flag."));
        } else {
            String str = bhVar.f78052c;
            Uri build = axVar.f79981a.buildUpon().appendPath(bhVar.f78051b).build();
            AtomicReference atomicReference = new AtomicReference(C29514ax.m54502f(str, 2, C58836b.f156633a));
            String str2 = bhVar.f78051b;
            C29598bs bsVar = axVar.f79986f;
            C60870cx d = bsVar.f80178a.mo46042d();
            C29597br brVar = new C29597br(str2);
            C29670b i = C29670b.m54719g(C28738bp.m53591a(C60922j.m93044g(d, C47810es.m84963c(brVar), bsVar.f80179b), C28737bo.MANIFEST_FILE_GROUP_POPULATOR_METADATA_IO_ERROR, "Failed to read bookkeeping.")).mo34821h(new C29507aq(atomicReference), axVar.f79984d).mo34822i(new C29508ar(axVar, str, build, atomicReference), axVar.f79984d);
            C29670b i2 = C29670b.m54719g(C29670b.m54719g(i).mo34821h(C29509as.f79967a, axVar.f79984d).mo34819e(Throwable.class, C29510at.f79968a, axVar.f79984d)).mo34822i(new C29497ag(axVar, atomicReference, fdVar, build, str), axVar.f79984d);
            C29498ah ahVar = new C29498ah(axVar, atomicReference, build);
            Class<Throwable> cls = Throwable.class;
            C60870cx h = C60846c.m92879h(i2, cls, C47810es.m84966f(ahVar), axVar.f79984d);
            C29499ai aiVar = new C29499ai(axVar, bhVar, atomicReference);
            C60870cx h2 = C60922j.m93045h(h, C47810es.m84966f(aiVar), axVar.f79984d);
            C29500aj ajVar = new C29500aj(axVar, i, i2, h2, bhVar);
            return C60922j.m93045h(h2, C47810es.m84966f(ajVar), axVar.f79984d);
        }
    }
}
