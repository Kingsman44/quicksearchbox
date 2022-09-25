package com.google.android.apps.gsa.staticplugins.p7684cn.p7685a;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.gms.clearcut.C143673z;
import com.google.android.gms.clearcut.p10777a.C143619a;
import com.google.android.gms.common.util.C144006f;
import com.google.common.p4552o.C59700co;
import dagger.C68214a;
import dagger.p5294a.C68220f;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.cn.a.e */
/* compiled from: PG */
public final class C98037e implements C68220f {
    /* renamed from: a */
    public static C143673z m162315a(Context context, C59700co coVar, String str, C90851k kVar, C68214a aVar, C68214a aVar2) {
        Duration duration = C98036d.f273766a;
        C143619a aVar3 = (C143619a) aVar.mo27525b();
        C143658k kVar2 = new C143658k(context, str, (String) null);
        if (C59700co.SEARCH == coVar) {
            kVar2.mo119001h(new C98035c(aVar2));
        }
        C143673z zVar = new C143673z(kVar2, "ANDROID_GSA_COUNTERS", 1024, C144006f.f390244a);
        zVar.mo119025i();
        zVar.mo119026j(kVar.mo85210c("Clearcut Counters"), (int) C98036d.f273766a.toMillis());
        return zVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
