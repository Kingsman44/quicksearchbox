package com.google.android.gms.learning.dynamite.training;

import android.content.Context;
import com.google.android.gms.common.api.internal.C143773bu;
import com.google.android.gms.common.util.C144005e;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.internal.training.C144813q;
import com.google.android.gms.p10793f.C144165j;
import com.google.android.gms.p10793f.C144166k;
import com.google.android.libraries.micore.learning.base.C29712d;
import com.google.android.libraries.micore.learning.base.C29719k;
import java.util.concurrent.Executor;

/* compiled from: PG */
public class InAppTrainerCancellerImpl extends C144813q {

    /* renamed from: c */
    private static final C29719k f391374c = C29712d.m54802b("brella", "InAppTrnCnclImpl");

    /* renamed from: a */
    public Context f391375a;

    /* renamed from: b */
    public Executor f391376b;

    /* renamed from: a */
    public final boolean mo120110a(C144827n nVar, C144573b bVar) {
        if (bVar.mo119969aC(this.f391375a.getApplicationContext().getPackageName())) {
            return false;
        }
        nVar.mo120056h(1169);
        return true;
    }

    public void cancelJobsByType(int i, C143773bu buVar) {
        C144696bl.m235203b(new C144725u(this, i), buVar, this.f391376b, f391374c, this.f391375a);
    }

    public boolean init(C144165j jVar, C144165j jVar2, C143773bu buVar) {
        try {
            this.f391375a = (Context) C144166k.m234388a(jVar);
            this.f391376b = (Executor) C144166k.m234388a(jVar2);
            C144696bl.m235203b(new C144720p(this), buVar, this.f391376b, f391374c, this.f391375a);
            return true;
        } catch (Error | RuntimeException e) {
            C144005e.m234184a(this.f391375a, e);
            throw e;
        }
    }
}
