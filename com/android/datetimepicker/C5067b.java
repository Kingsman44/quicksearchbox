package com.android.datetimepicker;

import android.database.ContentObserver;
import android.os.Handler;

/* renamed from: com.android.datetimepicker.b */
/* compiled from: PG */
final class C5067b extends ContentObserver {

    /* renamed from: a */
    final /* synthetic */ C5068c f16140a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C5067b(C5068c cVar) {
        super((Handler) null);
        this.f16140a = cVar;
    }

    public final void onChange(boolean z) {
        C5068c cVar = this.f16140a;
        cVar.f16144d = C5068c.m13932b(cVar.f16141a);
    }
}
