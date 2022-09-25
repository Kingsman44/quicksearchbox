package com.google.android.apps.search.assistant.surfaces.dictation.service.p9461n;

import com.google.android.apps.gsa.nga.api.a.al;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126299ah;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126301aj;
import com.google.android.apps.search.assistant.surfaces.dictation.service.p9479s.C126309ar;
import com.google.apps.tiktok.concurrent.C46459k;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60931s;
import p3186j$.time.Duration;
import p3186j$.util.Optional;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.apps.search.assistant.surfaces.dictation.service.n.em */
/* compiled from: PG */
public final /* synthetic */ class C126129em implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C126141ey f347567a;

    /* renamed from: b */
    public final /* synthetic */ long f347568b;

    /* renamed from: c */
    public final /* synthetic */ Function f347569c;

    public /* synthetic */ C126129em(C126141ey eyVar, long j, Function function) {
        this.f347567a = eyVar;
        this.f347568b = j;
        this.f347569c = function;
    }

    public final C60870cx apply(Object obj) {
        C126141ey eyVar = this.f347567a;
        long j = this.f347568b;
        Function function = this.f347569c;
        Optional optional = (Optional) obj;
        if (!optional.isPresent() || j != eyVar.f347590d.get()) {
            return C60866ct.f164955a;
        }
        C126117ea eaVar = new C126117ea(eyVar, j, new C126115dz(optional));
        C60888db dbVar = eyVar.f347588b;
        C46459k.m82829b(C126309ar.m206524c(new C126299ah(new C126301aj(eaVar)), (Duration) function.apply((al) optional.get()), dbVar), "idle UI timer failed [SD]", new Object[0]);
        return C60866ct.f164955a;
    }
}
