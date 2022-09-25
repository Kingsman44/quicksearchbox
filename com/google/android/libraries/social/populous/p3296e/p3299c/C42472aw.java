package com.google.android.libraries.social.populous.p3296e.p3299c;

import android.content.Context;
import android.provider.ContactsContract;
import com.google.android.libraries.social.populous.core.C42266as;
import com.google.android.libraries.social.populous.core.C42352m;
import com.google.android.libraries.social.populous.logging.C42591z;
import com.google.android.libraries.social.populous.p3296e.C42549n;
import com.google.android.libraries.social.populous.p3296e.C42550o;
import com.google.android.libraries.social.populous.p3296e.C42554s;
import com.google.common.base.C58872ci;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.social.populous.e.c.aw */
/* compiled from: PG */
public final class C42472aw implements C42554s {

    /* renamed from: a */
    public final Context f111408a;

    /* renamed from: b */
    public final Executor f111409b;

    /* renamed from: c */
    public final C42591z f111410c;

    /* renamed from: d */
    private final C42352m f111411d;

    public C42472aw(Context context, C42352m mVar, Executor executor, C42591z zVar) {
        this.f111408a = context;
        this.f111411d = mVar;
        this.f111409b = executor;
        this.f111410c = zVar;
    }

    /* renamed from: a */
    public final C60870cx mo45370a(C42549n nVar) {
        if (!C42454ae.m74855h(this.f111408a)) {
            C42550o oVar = new C42550o();
            oVar.f111627f = 5;
            oVar.f111626e = 18;
            oVar.f111623b = C58485gu.m89842j(C58485gu.m89845m());
            return C60856cj.m92900i(oVar.mo45556a());
        }
        C58872ci b = this.f111410c.mo45632b();
        Context context = this.f111408a;
        C42352m mVar = this.f111411d;
        Executor executor = this.f111409b;
        C60870cx g = C60922j.m93044g(C60922j.m93045h(C60922j.m93044g(C42451ab.m74843a(context.getContentResolver(), executor, ContactsContract.Directory.CONTENT_URI, C42468as.f111396a).mo57272e(C42465ap.f111393a, executor).mo57275g(), new C42464ao(mVar), C60826bg.f164896a), new C42469at(this, nVar), C60826bg.f164896a), new C42470au(), this.f111409b);
        C60856cj.m92911t(g, new C42471av(this, b, nVar, g), C60826bg.f164896a);
        return g;
    }

    /* renamed from: b */
    public final C60870cx mo45371b() {
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final void mo45372c(C42266as asVar) {
    }

    /* renamed from: d */
    public final int mo45373d() {
        return 5;
    }
}
