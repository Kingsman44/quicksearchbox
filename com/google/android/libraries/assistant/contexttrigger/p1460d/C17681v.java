package com.google.android.libraries.assistant.contexttrigger.p1460d;

import android.content.Intent;
import com.google.common.base.C58817ah;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.assistant.contexttrigger.d.v */
/* compiled from: PG */
public final /* synthetic */ class C17681v implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C17684y f50832a;

    /* renamed from: b */
    public final /* synthetic */ Intent f50833b;

    public /* synthetic */ C17681v(C17684y yVar, Intent intent) {
        this.f50832a = yVar;
        this.f50833b = intent;
    }

    public final Object apply(Object obj) {
        return ((Optional) obj).map(new C17680u(this.f50832a, this.f50833b));
    }
}
