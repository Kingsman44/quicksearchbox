package com.google.android.libraries.mdi.download.p2236d.p2238b;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.common.base.C58833ax;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.mdi.download.d.b.an */
/* compiled from: PG */
public final class C28859an implements C68220f {

    /* renamed from: a */
    private final C69464a f78396a;

    /* renamed from: b */
    private final C69464a f78397b;

    public C28859an(C69464a aVar, C69464a aVar2) {
        this.f78396a = aVar;
        this.f78397b = aVar2;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        Context context = ((C28861b) this.f78396a).f78400a.f78353a;
        C68225k.m98532d(context);
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("mdd_pds_config");
        a.f111968c = "mdd_pds_config";
        a.mo45821b(C29090d.m53983d("DestSharedFiles", (C58833ax) this.f78397b.mo17428b()));
        Uri a2 = a.mo45820a();
        C68225k.m98532d(a2);
        return a2;
    }
}
