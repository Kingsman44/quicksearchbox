package com.google.android.apps.gsa.staticplugins.nga.p8044a.p8045a;

import android.app.KeyguardManager;
import android.content.Context;
import com.google.android.apps.gsa.nga.shared.p6326ao.C80963a;
import com.google.android.apps.gsa.nga.shared.p6326ao.p6327a.C80969f;
import com.google.android.apps.gsa.nga.shared.p6334b.C81016b;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103335ap;
import com.google.android.apps.gsa.staticplugins.nga.p8067j.C103360j;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.a.a.dc */
/* compiled from: PG */
public final class C102975dc extends C80969f {

    /* renamed from: c */
    private final C103335ap f287547c;

    /* renamed from: d */
    private final C90021c f287548d;

    public C102975dc(C81016b bVar, Context context, C103335ap apVar, C90021c cVar) {
        super(bVar, context, (KeyguardManager) context.getSystemService(KeyguardManager.class));
        this.f287547c = apVar;
        this.f287548d = cVar;
    }

    /* renamed from: m */
    public final void mo74752m(Consumer consumer, String str) {
        if (((C80963a) this.f221968a.get()) == null && this.f287548d.mo79746e(C90126fx.f251501jx)) {
            C102984m mVar = new C102984m(this);
            this.f287547c.f288119a.mo93770d(new C103360j(new C102973da(mVar)));
        }
        super.mo74752m(consumer, str);
    }
}
