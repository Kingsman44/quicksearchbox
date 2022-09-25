package com.google.android.libraries.storage.protostore;

import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.protostore.p3320e.C42992a;
import com.google.apps.tiktok.tracing.C47522ah;
import com.google.apps.tiktok.tracing.C47523ai;
import com.google.apps.tiktok.tracing.C47524aj;
import com.google.common.base.C58838bb;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C62921ba;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.protostore.bu */
/* compiled from: PG */
public final class C42925bu extends C43002ei {

    /* renamed from: a */
    public static final C58881cr f112290a = C58886cw.m90973a(C42924bt.f112289a);

    /* renamed from: b */
    private final C42926bv f112291b;

    /* renamed from: c */
    private final boolean f112292c;

    public C42925bu(C42926bv bvVar, boolean z) {
        this.f112291b = bvVar;
        this.f112292c = z;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ C43001eh mo45981a(C42878ad adVar, String str, Executor executor, C42813k kVar) {
        C62921ba baVar;
        C47524aj ajVar;
        if (adVar.mo45978h()) {
            baVar = C62921ba.m95368a();
        } else {
            baVar = C62921ba.f169869a;
        }
        C42992a aVar = new C42992a(adVar.mo45976f(), baVar);
        C58838bb.m90868c(adVar.mo45974d() instanceof C42907bc);
        C60870cx i = C60856cj.m92900i(adVar.mo45971a());
        C43007j b = adVar.mo45972b();
        C42926bv bvVar = this.f112291b;
        boolean z = this.f112292c;
        if (adVar.mo45977g()) {
            ajVar = new C47523ai();
        } else {
            ajVar = new C47522ah();
        }
        return new C42929by(str, i, aVar, executor, kVar, b, false, bvVar, z, ajVar);
    }

    /* renamed from: b */
    public final String mo45982b() {
        return "mmap";
    }
}
