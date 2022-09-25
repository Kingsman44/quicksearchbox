package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import android.content.Context;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.w */
/* compiled from: PG */
final class C13167w extends LinearLayoutManager {

    /* renamed from: a */
    final /* synthetic */ View f40773a;

    /* renamed from: b */
    final /* synthetic */ RecyclerView f40774b;

    /* renamed from: c */
    final /* synthetic */ C13118ab f40775c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13167w(C13118ab abVar, Context context, View view, RecyclerView recyclerView) {
        super(context, 0, false);
        this.f40775c = abVar;
        this.f40773a = view;
        this.f40774b = recyclerView;
    }

    /* access modifiers changed from: protected */
    public final void calculateExtraLayoutSpace(C0670ge geVar, int[] iArr) {
        super.calculateExtraLayoutSpace(geVar, iArr);
        int dimension = (((int) this.f40773a.getResources().getDimension(R.dimen.media_rec_album_photo_size)) + ((int) this.f40773a.getResources().getDimension(R.dimen.media_rec_album_button_margin))) * ((Long) this.f40775c.f40682g.mo17428b()).intValue();
        iArr[0] = Math.max(dimension, iArr[0]);
        iArr[1] = Math.max(dimension, iArr[1]);
    }

    public final boolean onRequestChildFocus(RecyclerView recyclerView, C0670ge geVar, View view, View view2) {
        if (view2 == null) {
            return super.onRequestChildFocus(recyclerView, geVar, view, (View) null);
        }
        C0640fb fbVar = this.f40774b.mAdapter;
        fbVar.getClass();
        int itemCount = fbVar.getItemCount();
        int position = getPosition(view2);
        if (position == 0 || position == itemCount - 1) {
            this.f40774b.smoothScrollToPosition(position);
        }
        return super.onRequestChildFocus(recyclerView, geVar, view, view2);
    }
}
