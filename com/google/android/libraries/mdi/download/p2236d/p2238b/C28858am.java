package com.google.android.libraries.mdi.download.p2236d.p2238b;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.C29396et;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29024am;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29111y;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42936cd;
import com.google.android.libraries.storage.protostore.C42939cg;
import com.google.common.base.C58833ax;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.mdi.download.d.b.am */
/* compiled from: PG */
public final class C28858am implements C68220f {

    /* renamed from: a */
    private final C28851af f78393a;

    /* renamed from: b */
    private final C69464a f78394b;

    /* renamed from: c */
    private final C69464a f78395c;

    public C28858am(C28851af afVar, C69464a aVar, C69464a aVar2) {
        this.f78393a = afVar;
        this.f78394b = aVar;
        this.f78395c = aVar2;
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo17428b() {
        C28851af afVar = this.f78393a;
        Context context = ((C28861b) this.f78394b).f78400a.f78353a;
        C68225k.m98532d(context);
        C58833ax axVar = (C58833ax) this.f78395c.mo17428b();
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("mdd_pds_config");
        a.f111968c = "mdd_pds_config";
        a.mo45821b(C29090d.m53983d("LoggingState", axVar));
        Uri a2 = a.mo45820a();
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(a2);
        i.mo45967d(C29396et.f79691f);
        i.mo45969f(false);
        C42936cd d = C42939cg.m75826d(context, afVar.f78359a);
        d.f112321c = C29111y.m54041d("gms_icing_mdd_network_usage_monitor", axVar);
        d.mo46008b();
        d.mo46009c(new C29024am());
        i.mo45965b().mo55395g(d.mo46007a());
        return afVar.f78360b.mo45979a(i.mo45964a());
    }
}
