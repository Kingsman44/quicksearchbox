package com.google.p3723ar.imp.view;

import android.content.Context;
import android.os.Handler;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.filament.p10722a.C142635f;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import p3186j$.util.Objects;

/* renamed from: com.google.ar.imp.view.n */
/* compiled from: PG */
public final class C48004n {

    /* renamed from: a */
    public static final String f124238a = "n";

    /* renamed from: b */
    public C47981aa f124239b;

    public C48004n() {
    }

    public C48004n(C47981aa aaVar) {
        this.f124239b = aaVar;
    }

    /* renamed from: e */
    public static C48004n m85167e(C47985ae aeVar, Context context, View view) {
        C60870cx cxVar;
        int a = C47984ad.m85154a(aeVar.f124196g);
        if (a == 0) {
            a = 1;
        }
        C47993i iVar = new C47993i(a);
        C48001k kVar = new C48001k(aeVar, context);
        if (iVar.mo53099e()) {
            try {
                cxVar = C60856cj.m92900i(kVar.call());
            } catch (Exception e) {
                cxVar = C60856cj.m92899h(e);
            }
        } else {
            Handler a2 = iVar.f124205a.mo53092a();
            Objects.requireNonNull(a2);
            cxVar = C60856cj.m92904m(kVar, new C47980a(a2));
        }
        try {
            return new C48004n(new C47981aa(iVar, view, aeVar.f124192c, (View) cxVar.get(), aeVar.f124195f));
        } catch (InterruptedException | ExecutionException e2) {
            throw new IllegalStateException("Unable to initialize Impress API", e2);
        }
    }

    /* renamed from: f */
    public static C60870cx m85168f(C47985ae aeVar, Context context, Executor executor) {
        return C60856cj.m92904m(new C48002l(aeVar, context), executor);
    }

    /* renamed from: a */
    public final long mo53115a() {
        C47981aa aaVar = this.f124239b;
        if (aaVar != null) {
            return aaVar.f124185b.mo53086a();
        }
        return 0;
    }

    /* renamed from: b */
    public final void mo53116b() {
        C47981aa aaVar = this.f124239b;
        if (aaVar != null && aaVar.f124185b.mo53086a() != 0) {
            C142635f fVar = aaVar.f124184a;
            fVar.mo117335b();
            fVar.f386969c = null;
            fVar.f386971e = null;
            C47993i iVar = aaVar.f124186c;
            View view = aaVar.f124185b;
            Objects.requireNonNull(view);
            iVar.mo53097c(new C48009s(view));
        }
    }

    /* renamed from: c */
    public final void mo53117c(int i) {
        C47981aa aaVar = this.f124239b;
        if (aaVar != null) {
            aaVar.f124186c.mo53097c(new C48010t(aaVar, i));
        }
    }

    /* renamed from: d */
    public final boolean mo53118d(MotionEvent motionEvent) {
        C47981aa aaVar = this.f124239b;
        if (aaVar == null || aaVar.f124185b.mo53086a() == 0) {
            return false;
        }
        aaVar.f124186c.mo53097c(new C48012v(aaVar, motionEvent));
        return true;
    }
}
