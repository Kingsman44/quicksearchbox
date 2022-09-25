package com.google.android.gms.common.moduleinstall.internal;

import android.app.Activity;
import android.content.Context;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.C143707a;
import com.google.android.gms.common.api.C143724i;
import com.google.android.gms.common.api.C143840l;
import com.google.android.gms.common.api.C143841m;
import com.google.android.gms.common.api.C143846r;
import com.google.android.gms.common.api.C143847s;
import com.google.android.gms.common.api.C143852x;
import com.google.android.gms.common.api.internal.C143784ce;
import com.google.android.gms.common.api.internal.C143785cf;
import com.google.android.gms.common.api.internal.C143796cq;
import com.google.android.gms.common.api.internal.C143809dc;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.common.moduleinstall.C143960a;
import com.google.android.gms.common.moduleinstall.C143962c;
import com.google.android.gms.common.moduleinstall.C143964e;
import com.google.android.gms.common.moduleinstall.ModuleAvailabilityResponse;
import com.google.android.gms.common.moduleinstall.ModuleInstallResponse;
import com.google.android.gms.p10818l.C144435a;
import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146021aq;
import java.util.Arrays;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.gms.common.moduleinstall.internal.s */
/* compiled from: PG */
public final class C143985s extends C143847s implements C143962c {

    /* renamed from: a */
    public static final /* synthetic */ int f390219a = 0;

    /* renamed from: b */
    private static final C143840l f390220b;

    /* renamed from: c */
    private static final C143707a f390221c;

    /* renamed from: d */
    private static final C143841m f390222d;

    static {
        C143840l lVar = new C143840l();
        f390220b = lVar;
        C143980n nVar = new C143980n();
        f390221c = nVar;
        f390222d = new C143841m("ModuleInstall.API", nVar, lVar);
    }

    public C143985s(Context context) {
        super(context, (Activity) null, f390222d, C143724i.f389627f, C143846r.f389923a);
    }

    /* renamed from: a */
    public final C146006ab mo119493a(C143852x... xVarArr) {
        for (int i = 0; i <= 0; i++) {
            C143919bh.m233971n(xVarArr[i], "Requested API must not be null.");
        }
        ApiFeatureRequest a = ApiFeatureRequest.m234132a(Arrays.asList(xVarArr), false);
        if (a.f390198a.isEmpty()) {
            return C146021aq.m237850d(new ModuleAvailabilityResponse(true, 0));
        }
        C143809dc dcVar = new C143809dc();
        dcVar.f389862c = new Feature[]{C144435a.f391042a};
        dcVar.f389863d = 27301;
        dcVar.f389861b = false;
        dcVar.f389860a = new C143979m(a);
        return super.mo119290u(0, dcVar.mo119260a());
    }

    /* renamed from: b */
    public final C146006ab mo119494b(C143964e eVar) {
        C143784ce ceVar;
        ApiFeatureRequest a = ApiFeatureRequest.m234132a(eVar.f390194a, true);
        C143960a aVar = eVar.f390195b;
        Executor executor = eVar.f390196c;
        if (a.f390198a.isEmpty()) {
            return C146021aq.m237850d(new ModuleInstallResponse(0, false));
        }
        if (aVar == null) {
            C143809dc dcVar = new C143809dc();
            dcVar.f389862c = new Feature[]{C144435a.f391042a};
            dcVar.f389861b = true;
            dcVar.f389863d = 27304;
            dcVar.f389860a = new C143978l(a);
            return super.mo119290u(0, dcVar.mo119260a());
        }
        if (executor == null) {
            ceVar = C143785cf.m233680b(aVar, this.f389927B, C143960a.class.getSimpleName());
        } else {
            ceVar = C143785cf.m233681c(aVar, executor, C143960a.class.getSimpleName());
        }
        C143988v vVar = new C143988v(ceVar);
        AtomicReference atomicReference = new AtomicReference();
        C143975i iVar = new C143975i(this, atomicReference, aVar, a, vVar);
        C143976j jVar = new C143976j(vVar);
        C143796cq cqVar = new C143796cq();
        cqVar.f389833c = ceVar;
        cqVar.f389834d = new Feature[]{C144435a.f391042a};
        cqVar.f389835e = true;
        cqVar.f389831a = iVar;
        cqVar.f389832b = jVar;
        cqVar.f389836f = 27305;
        return mo119291v(cqVar.mo119255a()).mo122485d(new C143977k(atomicReference));
    }

    /* renamed from: c */
    public final void mo119495c(C143960a aVar) {
        mo119292w(C143785cf.m233679a(aVar, C143960a.class.getSimpleName()), 27306);
    }
}
