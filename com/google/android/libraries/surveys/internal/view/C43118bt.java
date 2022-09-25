package com.google.android.libraries.surveys.internal.view;

import android.view.View;
import java.util.List;

/* renamed from: com.google.android.libraries.surveys.internal.view.bt */
/* compiled from: PG */
public final /* synthetic */ class C43118bt implements View.OnClickListener {

    /* renamed from: a */
    public final /* synthetic */ C43122bx f112771a;

    /* renamed from: b */
    public final /* synthetic */ View[] f112772b;

    /* renamed from: c */
    public final /* synthetic */ List f112773c;

    /* renamed from: d */
    public final /* synthetic */ int f112774d;

    public /* synthetic */ C43118bt(C43122bx bxVar, View[] viewArr, List list, int i) {
        this.f112771a = bxVar;
        this.f112772b = viewArr;
        this.f112773c = list;
        this.f112774d = i;
    }

    public final void onClick(View view) {
        C43122bx bxVar = this.f112771a;
        View[] viewArr = this.f112772b;
        List list = this.f112773c;
        int i = this.f112774d;
        for (View view2 : viewArr) {
            view2.setOnClickListener((View.OnClickListener) null);
            view2.setClickable(false);
        }
        view.postOnAnimationDelayed(new C43115bq(bxVar, list, i), 200);
    }
}
