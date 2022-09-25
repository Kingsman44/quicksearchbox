package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import android.content.Context;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.staticplugins.nga.p8087s.C103799g;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2246f.C29404a;
import com.google.android.libraries.mdi.download.p2248h.C29513aw;
import com.google.android.libraries.mdi.download.p2248h.C29514ax;
import com.google.android.libraries.mdi.download.p2248h.C29625v;
import com.google.android.libraries.mdi.download.p2248h.C29626w;
import com.google.android.libraries.mdi.download.p2248h.C29627x;
import com.google.android.libraries.mdi.download.p2248h.p2253c.C29606b;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.util.concurrent.C60826bg;
import dagger.p5294a.C68220f;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.ho */
/* compiled from: PG */
public final class C104104ho implements C68220f {
    /* renamed from: a */
    public static C29514ax m172057a(Context context, C42813k kVar, C22871g gVar, C58881cr crVar, C42880af afVar, C29404a aVar, C103799g gVar2, C86124t tVar) {
        C104099hj hjVar = new C104099hj(gVar);
        C29606b bVar = new C29606b(kVar, hjVar);
        C104100hk hkVar = new C104100hk(tVar);
        C29513aw awVar = new C29513aw();
        awVar.f79971a = context.getApplicationContext();
        awVar.f79972b = hkVar;
        awVar.f79973c = crVar;
        awVar.f79979i = bVar;
        awVar.f79975e = hjVar;
        awVar.f79976f = afVar;
        awVar.f79974d = kVar;
        awVar.f79980j = aVar;
        C29626w b = C29627x.m54588b();
        Objects.requireNonNull(gVar2);
        b.f80225a = new C29625v(new C104101hl(gVar2));
        b.f80227c = C60826bg.f164896a;
        C58838bb.m90884s(b.f80225a != null, "Must call setLocaleSupplier() or setLocaleFutureSupplier() before build().");
        if (b.f80226b == null) {
            C29045l.m53930b("%s: Applying LANG_FALLBACK_STRATEGY", "LocaleOverrider");
            b.f80226b = C29627x.f80229b;
        }
        awVar.f79977g = C58833ax.m90834k(new C29627x(b));
        return awVar.mo34752a();
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
