package com.google.android.apps.search.googleapp.discover.streamui.impl.p10234a;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.C4075m;
import com.facebook.litho.p334j.C6400c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.a.f */
/* compiled from: PG */
final class C134786f implements C6400c {

    /* renamed from: a */
    final /* synthetic */ int f366998a;

    /* renamed from: b */
    final /* synthetic */ C134791k f366999b;

    public C134786f(int i, C134791k kVar) {
        this.f366998a = i;
        this.f366999b = kVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo13409a(Context context, ViewGroup viewGroup) {
        C4075m mVar;
        C69664n.m101061g(context, "context");
        View inflate = LayoutInflater.from(context).inflate(this.f366998a, viewGroup, false);
        C69664n.m101059e(inflate, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        ConstraintLayout constraintLayout = (ConstraintLayout) inflate;
        if (this.f366999b.f367014d) {
            ViewGroup.LayoutParams layoutParams = constraintLayout.getLayoutParams();
            if (layoutParams == null) {
                mVar = new C4075m(-2, -2);
            } else {
                mVar = new C4075m(layoutParams);
            }
            mVar.f13052b = true;
            constraintLayout.setLayoutParams(mVar);
        }
        return constraintLayout;
    }
}
