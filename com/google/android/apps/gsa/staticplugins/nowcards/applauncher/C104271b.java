package com.google.android.apps.gsa.staticplugins.nowcards.applauncher;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7159c.C90929bz;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104348l;
import com.google.android.apps.gsa.staticplugins.nowcards.base.C104349m;
import com.google.android.apps.gsa.staticplugins.nowcards.carousel.C104394e;
import com.google.android.apps.p489g.p494d.C9277u;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowcards.applauncher.b */
/* compiled from: PG */
public final class C104271b extends C104349m {

    /* renamed from: b */
    private final C90929bz f290039b;

    /* renamed from: c */
    private final C68214a f290040c;

    /* renamed from: d */
    private final C104394e f290041d;

    public C104271b(C90929bz bzVar, C68214a aVar, C104394e eVar) {
        this.f290039b = bzVar;
        this.f290040c = aVar;
        this.f290041d = eVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C104348l mo94016a(Context context) {
        return new C104272c(context, this.f290039b, this.f290040c, this.f290330a);
    }

    /* renamed from: b */
    public final C9277u[] mo94017b() {
        return new C9277u[]{C9277u.APP_LAUNCHER_MODULE};
    }
}
