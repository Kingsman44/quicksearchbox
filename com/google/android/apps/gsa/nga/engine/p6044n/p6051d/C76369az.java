package com.google.android.apps.gsa.nga.engine.p6044n.p6051d;

import android.graphics.Bitmap;
import com.google.android.apps.gsa.nga.shared.p6275aa.C80112b;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.common.p4522b.C58480gp;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.d.az */
/* compiled from: PG */
public final /* synthetic */ class C76369az implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C76374bd f211488a;

    /* renamed from: b */
    public final /* synthetic */ C58480gp f211489b;

    /* renamed from: c */
    public final /* synthetic */ C80112b f211490c;

    public /* synthetic */ C76369az(C76374bd bdVar, C58480gp gpVar, C80112b bVar) {
        this.f211488a = bdVar;
        this.f211489b = gpVar;
        this.f211490c = bVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C76374bd bdVar = this.f211488a;
        C58480gp gpVar = this.f211489b;
        C80112b bVar = this.f211490c;
        Optional optional = (Optional) obj;
        if (optional.isPresent()) {
            gpVar.mo55395g((Bitmap) optional.get());
        }
        bdVar.f211498b.mo72196g(bVar, gpVar.mo55394f());
    }
}
