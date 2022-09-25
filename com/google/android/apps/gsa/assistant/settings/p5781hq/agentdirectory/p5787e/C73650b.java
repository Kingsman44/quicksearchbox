package com.google.android.apps.gsa.assistant.settings.p5781hq.agentdirectory.p5787e;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.support.p033v7.widget.C0569cl;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.assistant.settings.hq.agentdirectory.e.b */
/* compiled from: PG */
public final class C73650b extends C0569cl {

    /* renamed from: b */
    final /* synthetic */ Context f194832b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C73650b(Context context, Context context2) {
        super(context, 1);
        this.f194832b = context2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C0670ge geVar) {
        if (recyclerView.getChildAdapterPosition(view) == 0) {
            rect.top = this.f194832b.getResources().getDimensionPixelOffset(R.dimen.v2_small_agent_card_item_decorator_top_margin);
        }
        rect.bottom = this.f194832b.getResources().getDimensionPixelOffset(R.dimen.v2_small_agent_card_item_decorator_bottom_margin);
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C0670ge geVar) {
    }
}
