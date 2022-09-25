package com.facebook.litho;

import android.content.Context;
import android.content.res.Resources;

/* renamed from: com.facebook.litho.fk */
/* compiled from: PG */
public final class C6268fk {

    /* renamed from: a */
    public final Resources.Theme f18510a;

    /* renamed from: b */
    private final Resources f18511b;

    /* renamed from: c */
    private final Context f18512c;

    public C6268fk(C6411u uVar) {
        Context context = uVar.f19009b;
        this.f18512c = context;
        this.f18511b = context.getResources();
        this.f18510a = context.getTheme();
    }

    /* renamed from: a */
    public final int mo13257a(float f) {
        return C6159cg.m16231a(f * this.f18511b.getDisplayMetrics().density);
    }

    /* renamed from: b */
    public final int mo13258b(float f) {
        return C6159cg.m16231a(f * this.f18511b.getDisplayMetrics().scaledDensity);
    }
}
