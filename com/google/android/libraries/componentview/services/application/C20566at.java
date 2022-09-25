package com.google.android.libraries.componentview.services.application;

import android.graphics.Color;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;

/* renamed from: com.google.android.libraries.componentview.services.application.at */
/* compiled from: PG */
public final class C20566at {
    /* renamed from: a */
    public static final /* synthetic */ int m38590a(C19995r rVar) {
        int i = rVar.f56034a;
        return ((i & 8) == 0 && (i & 1) == 0 && (i & 2) == 0 && (i & 4) == 0) ? rVar.f56039f : Color.argb(Math.round(rVar.f56038e * 255.0f), Math.round(rVar.f56035b * 255.0f), Math.round(rVar.f56036c * 255.0f), Math.round(rVar.f56037d * 255.0f));
    }
}
