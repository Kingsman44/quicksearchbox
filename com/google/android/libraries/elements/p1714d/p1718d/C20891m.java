package com.google.android.libraries.elements.p1714d.p1718d;

import android.content.Context;
import com.google.android.libraries.elements.C20697c;
import com.google.android.libraries.elements.interfaces.C21259bb;
import com.google.android.libraries.elements.interfaces.C21280bw;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.elements.interfaces.IntersectionEngine;
import com.google.android.libraries.elements.interfaces.ProminenceAlgorithm;
import com.google.android.libraries.elements.internal.C21327ag;
import com.google.common.base.C58833ax;
import com.google.protos.youtube.elements.C66260r;

/* renamed from: com.google.android.libraries.elements.d.d.m */
/* compiled from: PG */
public final /* synthetic */ class C20891m implements C21280bw {

    /* renamed from: a */
    public final /* synthetic */ C21259bb f58582a;

    /* renamed from: b */
    public final /* synthetic */ C58833ax f58583b;

    /* renamed from: c */
    public final /* synthetic */ Context f58584c;

    public /* synthetic */ C20891m(C21259bb bbVar, C58833ax axVar, Context context) {
        this.f58582a = bbVar;
        this.f58583b = axVar;
        this.f58584c = context;
    }

    /* renamed from: a */
    public final Object mo26022a() {
        C21259bb bbVar = this.f58582a;
        C58833ax axVar = this.f58583b;
        Context context = this.f58584c;
        C20697c.m38871a();
        IntersectionEngine create = IntersectionEngine.create();
        if (create == null) {
            bbVar.mo25782a(C66260r.LOG_TYPE_INTERNAL_ERROR, "Failed to create IntersectionEngine.", C21319z.f59680u, (Throwable) null);
            return new C20892n();
        }
        if (((Boolean) axVar.mo56109e(false)).booleanValue()) {
            create.setEnableProminence(true, ProminenceAlgorithm.DEFAULT_ALGORITHM);
        }
        create.setRtl(C21327ag.m40334a(context));
        return create;
    }
}
