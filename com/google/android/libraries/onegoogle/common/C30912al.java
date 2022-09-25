package com.google.android.libraries.onegoogle.common;

import android.text.TextPaint;
import com.google.common.base.C58839bc;

/* renamed from: com.google.android.libraries.onegoogle.common.al */
/* compiled from: PG */
public final /* synthetic */ class C30912al implements C58839bc {

    /* renamed from: a */
    public final /* synthetic */ TextPaint f83337a;

    /* renamed from: b */
    public final /* synthetic */ float f83338b;

    public /* synthetic */ C30912al(TextPaint textPaint, float f) {
        this.f83337a = textPaint;
        this.f83338b = f;
    }

    /* renamed from: a */
    public final boolean mo5941a(Object obj) {
        return this.f83337a.measureText((String) obj) <= this.f83338b;
    }
}
