package com.google.android.apps.gsa.nga.engine.p6096p;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.assistant.p1363c.p1382d.C17198b;
import com.google.android.libraries.geller.portable.C21938ad;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.nga.engine.p.ab */
/* compiled from: PG */
public final class C77435ab {

    /* renamed from: a */
    private Geller f213458a;

    /* renamed from: b */
    private final Context f213459b;

    /* renamed from: c */
    private final C22871g f213460c;

    /* renamed from: d */
    private final C17198b f213461d;

    /* renamed from: e */
    private final GellerLoggingCallback f213462e;

    /* renamed from: f */
    private final C90851k f213463f;

    public C77435ab(Context context, C22871g gVar, C90851k kVar, C17198b bVar, GellerLoggingCallback gellerLoggingCallback) {
        this.f213459b = context;
        this.f213460c = gVar;
        this.f213463f = kVar;
        this.f213461d = bVar;
        this.f213462e = gellerLoggingCallback;
    }

    /* renamed from: a */
    public final synchronized Geller mo72569a() {
        if (this.f213458a == null) {
            C21938ad adVar = new C21938ad(this.f213459b, this.f213463f.mo85208a("[GELLER]BackgroundExecutor"), this.f213463f.mo85209b("[GELLER]BlockingExecutor"), C58733pz.f156496a);
            adVar.f60529h = this.f213462e;
            adVar.f60526e = true;
            this.f213458a = new Geller(adVar);
        }
        return this.f213458a;
    }

    /* renamed from: b */
    public final C60870cx mo72570b() {
        return this.f213460c.mo28210j(this.f213461d.mo23237a(), "[NGA]GellerWrapper.getReadOnlyGellerAsync", new C77434aa(this));
    }
}
