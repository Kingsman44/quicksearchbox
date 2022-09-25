package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.p5787e;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.p033v7.widget.C0569cl;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.e.c */
/* compiled from: PG */
public final class C73653c extends C0569cl {

    /* renamed from: b */
    final /* synthetic */ Context f194838b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73653c(Context context, Context context2) {
        super(context, 0);
        this.f194838b = context2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        int childAdapterPosition = recyclerView.getChildAdapterPosition(view);
        if (childAdapterPosition == 0) {
            rect.left = this.f194838b.getResources().getDimensionPixelOffset(R.dimen.promotion_card_initial_padding);
            childAdapterPosition = 0;
        }
        C0640fb fbVar = recyclerView.mAdapter;
        if (fbVar == null || childAdapterPosition != fbVar.getItemCount() - 1) {
            rect.right = this.f194838b.getResources().getDimensionPixelSize(R.dimen.promotion_card_middle_padding);
        } else {
            rect.right = this.f194838b.getResources().getDimensionPixelSize(R.dimen.promotion_card_end_padding);
        }
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C0670ge geVar) {
    }
}
