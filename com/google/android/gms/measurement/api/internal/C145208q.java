package com.google.android.gms.measurement.api.internal;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.common.internal.C143919bh;
import com.google.android.gms.dynamite.C144149k;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import com.google.android.gms.measurement.internal.C145352ex;
import com.google.android.gms.p10793f.C144166k;

/* renamed from: com.google.android.gms.measurement.api.internal.q */
/* compiled from: PG */
final class C145208q extends C145183ad {

    /* renamed from: a */
    final /* synthetic */ Context f392472a;

    /* renamed from: b */
    final /* synthetic */ Bundle f392473b;

    /* renamed from: c */
    final /* synthetic */ C145192am f392474c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C145208q(C145192am amVar, Context context, Bundle bundle) {
        super(amVar, true);
        this.f392474c = amVar;
        this.f392472a = context;
        this.f392473b = bundle;
    }

    /* renamed from: a */
    public final void mo120691a() {
        C145195d dVar;
        try {
            C143919bh.m233958a(this.f392472a);
            C145192am amVar = this.f392474c;
            try {
                dVar = C145194c.asInterface(DynamiteModule.m234354d(this.f392472a, DynamiteModule.f390446b, ModuleDescriptor.MODULE_ID).mo119687c("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
            } catch (C144149k e) {
                amVar.mo120701a(e, true, false);
                dVar = null;
            }
            amVar.f392457f = dVar;
            if (this.f392474c.f392457f == null) {
                Log.w(this.f392474c.f392452a, "Failed to connect to measurement client.");
                return;
            }
            int a = DynamiteModule.m234352a(this.f392472a, ModuleDescriptor.MODULE_ID);
            int b = DynamiteModule.m234353b(this.f392472a, ModuleDescriptor.MODULE_ID, false);
            InitializationParams initializationParams = new InitializationParams(74009, (long) Math.max(a, b), b < a, (String) null, (String) null, (String) null, this.f392473b, C145352ex.m236168a(this.f392472a));
            C145195d dVar2 = this.f392474c.f392457f;
            C143919bh.m233958a(dVar2);
            dVar2.initialize(new C144166k(this.f392472a), initializationParams, this.f392430f);
        } catch (Exception e2) {
            this.f392474c.mo120701a(e2, true, false);
        }
    }
}
