package com.google.android.libraries.lens.view.session.ondevice;

import android.content.Context;
import com.google.android.libraries.lens.common.p2000c.C24105b;
import com.google.android.libraries.lens.ondevice.C24265a;
import com.google.android.libraries.lens.ondevice.C24522i;
import com.google.android.libraries.lens.ondevice.C24823o;
import com.google.android.libraries.lens.ondevice.C24825q;
import com.google.android.libraries.lens.ondevice.p2037n.C24770ac;
import com.google.android.libraries.lens.p1994b.C24067a;
import com.google.android.libraries.lens.view.flags.C26244b;
import com.google.android.libraries.lens.view.p2054ae.C25024w;
import com.google.android.libraries.lens.view.p2070an.p2072b.C25397ag;
import com.google.android.libraries.lens.view.p2159q.C27608bb;
import com.google.apps.tiktok.inject.C47266f;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60887da;
import dagger.p5294a.C68220f;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.lens.view.session.ondevice.j */
/* compiled from: PG */
public final class C27972j implements C68220f {
    /* renamed from: a */
    public static C24823o m52091a(Context context, C60887da daVar, C26244b bVar, C24770ac acVar, C58833ax axVar, C24067a aVar, C27608bb bbVar, C24105b bVar2, C25397ag agVar, Executor executor, C25024w wVar) {
        C58833ax axVar2 = axVar;
        C24265a aVar2 = new C24265a();
        if (axVar2 != null) {
            aVar2.f66307a = axVar2;
            aVar2.f66310d = C58833ax.m90834k(bVar2);
            aVar2.f66308b = C58833ax.m90834k(agVar.mo30444a(wVar));
            aVar2.f66309c = C58833ax.m90834k(executor);
            C24825q b = aVar2.mo30024b();
            Context context2 = context;
            return C24823o.m45946a(daVar, acVar, bVar, aVar, bbVar, b, (C24522i) C47266f.m84076a(context, C24522i.class));
        }
        throw new NullPointerException("Null debugSink");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
