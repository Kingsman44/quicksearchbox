package com.google.android.libraries.assistant.auto.tng.assistant.p887ui.projected.mediarec;

import android.content.Context;
import android.support.p033v7.widget.C0670ge;
import android.support.p033v7.widget.GridLayoutManager;
import android.view.View;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.ui.projected.mediarec.x */
/* compiled from: PG */
final class C13168x extends GridLayoutManager {

    /* renamed from: a */
    final /* synthetic */ View f40776a;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C13168x(Context context, int i, View view) {
        super(context, i, 1);
        this.f40776a = view;
    }

    /* access modifiers changed from: protected */
    public final void calculateExtraLayoutSpace(C0670ge geVar, int[] iArr) {
        super.calculateExtraLayoutSpace(geVar, iArr);
        int dimension = (int) this.f40776a.getResources().getDimension(R.dimen.media_rec_grid_album_content_height);
        iArr[0] = Math.max(dimension, iArr[0]);
        iArr[1] = Math.max(dimension, iArr[1]);
    }
}
