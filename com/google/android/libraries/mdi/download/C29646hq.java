package com.google.android.libraries.mdi.download;

import android.content.Context;
import com.google.android.libraries.mdi.download.foreground.C29423c;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29096j;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.libraries.mdi.download.hq */
/* compiled from: PG */
final class C29646hq implements C29096j {

    /* renamed from: a */
    final /* synthetic */ C58833ax f80293a;

    /* renamed from: b */
    final /* synthetic */ Context f80294b;

    public C29646hq(C58833ax axVar, Context context) {
        this.f80293a = axVar;
        this.f80294b = context;
    }

    /* renamed from: a */
    public final void mo34563a(String str, int i) {
        if (i == 1 && this.f80293a.mo56113h()) {
            C29423c.m54387j(this.f80294b, (Class) this.f80293a.mo56107c(), str);
        }
    }

    /* renamed from: b */
    public final void mo34564b(String str, int i) {
        if (i == 0 && this.f80293a.mo56113h()) {
            C29423c.m54388k(this.f80294b, (Class) this.f80293a.mo56107c(), str);
        }
    }
}
