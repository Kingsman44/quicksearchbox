package com.google.android.libraries.lens.sdk.p2045c;

import android.os.Bundle;
import com.google.common.p4522b.C58495hd;
import java.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.sdk.c.o */
/* compiled from: PG */
public final class C24930o implements C24928m {

    /* renamed from: a */
    private final Map f68052a;

    public C24930o(Map map) {
        this.f68052a = map;
    }

    /* renamed from: a */
    public final void mo30142a(C24917b bVar, Bundle bundle) {
        C24928m mVar;
        String string = bundle.getString("SessionType");
        if (string != null && (mVar = (C24928m) this.f68052a.get(string)) != null) {
            mVar.mo30142a(bVar, bundle);
        }
    }

    /* renamed from: b */
    public final void mo30143b(Consumer consumer) {
        for (Map.Entry entry : ((C58495hd) this.f68052a).entrySet()) {
            ((C24928m) entry.getValue()).mo30143b(new C24929n(entry, consumer));
        }
    }

    /* renamed from: c */
    public final void mo30144c(long j) {
        for (C24928m c : ((C58495hd) this.f68052a).values()) {
            c.mo30144c(j);
        }
    }

    /* renamed from: d */
    public final /* synthetic */ void mo30145d() {
    }
}
