package com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.components;

import android.content.Context;
import android.graphics.Rect;
import android.support.p033v7.widget.C0648fj;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.ui.components.f */
/* compiled from: PG */
public final class C33265f extends C0648fj {

    /* renamed from: a */
    private final int f88984a;

    public C33265f(Context context) {
        this.f88984a = context.getResources().getDimensionPixelSize(R.dimen.fa_message_carousel_field_item_decoration_space);
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        super.getItemOffsets(rect, view, recyclerView, geVar);
        if (recyclerView.getChildAdapterPosition(view) != 0) {
            rect.left = this.f88984a;
        }
    }
}
