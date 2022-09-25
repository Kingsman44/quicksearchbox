package com.google.android.gms.common.internal;

import android.content.Intent;
import com.google.android.gms.common.api.internal.C143777by;

/* renamed from: com.google.android.gms.common.internal.x */
/* compiled from: PG */
public final class C143953x extends C143954y {

    /* renamed from: a */
    final /* synthetic */ Intent f390182a;

    /* renamed from: b */
    final /* synthetic */ C143777by f390183b;

    public C143953x(Intent intent, C143777by byVar) {
        this.f390182a = intent;
        this.f390183b = byVar;
    }

    /* renamed from: a */
    public final void mo119482a() {
        Intent intent = this.f390182a;
        if (intent != null) {
            this.f390183b.startActivityForResult(intent, 2);
        }
    }
}
