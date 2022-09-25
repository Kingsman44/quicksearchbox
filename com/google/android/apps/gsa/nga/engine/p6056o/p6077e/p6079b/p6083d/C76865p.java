package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6079b.p6083d;

import android.content.Intent;
import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.libraries.gsa.p1876k.C22864c;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.b.d.p */
/* compiled from: PG */
public final /* synthetic */ class C76865p implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76869t f212288a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212289b;

    public /* synthetic */ C76865p(C76869t tVar, C74965n nVar) {
        this.f212288a = tVar;
        this.f212289b = nVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C76869t tVar = this.f212288a;
        C74965n nVar = this.f212289b;
        Optional optional = (Optional) obj;
        if (!optional.isPresent()) {
            return C81442m.f222851a;
        }
        return tVar.f212295c.mo28209i(tVar.f212294b.mo72336a(new Intent("android.intent.action.SENDTO", Uri.parse("mailto:".concat(String.valueOf((String) optional.get())))).setPackage("com.google.android.gm").addFlags(32768)), "[NGA] ComposeEmailFulfiller.composeToAddress", new C76866q(nVar));
    }
}
