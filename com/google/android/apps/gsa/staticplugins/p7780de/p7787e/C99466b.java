package com.google.android.apps.gsa.staticplugins.p7780de.p7787e;

import android.content.Context;
import android.os.UserManager;
import com.google.android.apps.gsa.p8852u.C118575h;
import com.google.android.apps.gsa.search.core.p6519al.p6654ck.C85130a;
import com.google.android.apps.gsa.search.core.service.p6856h.C86734a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.e.b */
/* compiled from: PG */
public final class C99466b extends C86734a implements C85130a {

    /* renamed from: a */
    public final Context f278335a;

    /* renamed from: b */
    public final UserManager f278336b;

    /* renamed from: c */
    private final C22871g f278337c;

    public C99466b(Context context, UserManager userManager, C22871g gVar) {
        super(C118575h.WORKER_RESTRICTED_PROFILE, "restrictedprofile");
        this.f278335a = context;
        this.f278336b = userManager;
        this.f278337c = gVar;
    }

    /* renamed from: a */
    public final C60870cx mo78726a() {
        return this.f278337c.mo28201a("Check if Google search is enabled", new C99465a(this));
    }

    /* renamed from: o */
    public final boolean mo20306o() {
        return true;
    }
}
