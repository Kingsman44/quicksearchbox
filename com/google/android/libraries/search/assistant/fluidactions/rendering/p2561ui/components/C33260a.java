package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components;

import android.content.Context;
import android.databinding.C0118a;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p033v7.widget.C0569cl;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.a */
/* compiled from: PG */
public final class C33260a extends C0569cl {

    /* renamed from: b */
    private static final C59071e f88974b = C59071e.m91332i("com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.a");

    /* renamed from: c */
    private final boolean f88975c;

    /* renamed from: d */
    private int f88976d;

    public C33260a(Context context, int i, Drawable drawable, boolean z) {
        super(context, i);
        this.f88976d = i;
        this.f88975c = z;
        if (!z || m61691c(drawable) != -1) {
            mo2696a(drawable);
        } else {
            C0118a.m96d(f88974b.mo56225c(), "Drawable set for DividerItemDecoration must have intrinsic width or height!", 50978, C58979ad.SMALL);
        }
    }

    /* renamed from: c */
    private final int m61691c(Drawable drawable) {
        if (drawable == null) {
            return -1;
        }
        if (this.f88976d == 1) {
            return drawable.getIntrinsicHeight();
        }
        return drawable.getIntrinsicWidth();
    }

    /* renamed from: b */
    public final void mo2697b(int i) {
        super.mo2697b(i);
        this.f88976d = i;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        int c;
        super.getItemOffsets(rect, view, recyclerView, geVar);
        if (this.f88975c && recyclerView.getChildAdapterPosition(view) != 0 && (c = m61691c(this.f2212a)) != -1) {
            if (this.f88976d == 1) {
                rect.top = c;
            } else {
                rect.left = c;
            }
        }
    }
}
