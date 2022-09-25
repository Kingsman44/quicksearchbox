package com.google.android.apps.gsa.staticplugins.fedass.p7941c.p7943b;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.libraries.assistant.p1363c.p1382d.C17198b;
import com.google.android.libraries.geller.portable.C21938ad;
import com.google.android.libraries.geller.portable.Geller;
import com.google.android.libraries.geller.portable.callbacks.GellerLoggingCallback;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58733pz;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.fedass.c.b.b */
/* compiled from: PG */
public final class C100818b {

    /* renamed from: a */
    private Geller f281773a;

    /* renamed from: b */
    private final Context f281774b;

    /* renamed from: c */
    private final C22871g f281775c;

    /* renamed from: d */
    private final GellerLoggingCallback f281776d;

    /* renamed from: e */
    private final C17198b f281777e;

    /* renamed from: f */
    private final C90851k f281778f;

    public C100818b(Context context, C22871g gVar, GellerLoggingCallback gellerLoggingCallback, C90851k kVar, C17198b bVar) {
        this.f281774b = context;
        this.f281775c = gVar;
        this.f281776d = gellerLoggingCallback;
        this.f281778f = kVar;
        this.f281777e = bVar;
    }

    /* renamed from: a */
    public final synchronized Geller mo92070a() {
        if (this.f281773a == null) {
            C21938ad adVar = new C21938ad(this.f281774b, this.f281778f.mo85208a("[GELLER]BackgroundExecutor"), this.f281778f.mo85209b("[GELLER]BlockingExecutor"), C58733pz.f156496a);
            adVar.f60529h = this.f281776d;
            adVar.f60526e = true;
            this.f281773a = new Geller(adVar);
        }
        return this.f281773a;
    }

    /* renamed from: b */
    public final C60870cx mo92071b() {
        return this.f281775c.mo28210j(this.f281777e.mo23237a(), "[NGA]GellerTrainWrapper.getReadOnlyGellerAsync", new C100817a(this));
    }
}
