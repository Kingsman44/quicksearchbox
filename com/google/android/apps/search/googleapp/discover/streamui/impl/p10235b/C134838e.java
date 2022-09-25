package com.google.android.apps.search.googleapp.discover.streamui.impl.p10235b;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.C4075m;
import com.facebook.litho.p334j.C6400c;
import com.google.android.googlequicksearchbox.R;
import com.google.p4283bv.p4354e.C57528m;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.impl.b.e */
/* compiled from: PG */
public final class C134838e implements C6400c {

    /* renamed from: a */
    final /* synthetic */ LayoutInflater f367083a;

    /* renamed from: b */
    final /* synthetic */ C134839f f367084b;

    /* renamed from: c */
    final /* synthetic */ C57528m f367085c;

    public C134838e(LayoutInflater layoutInflater, C134839f fVar, C57528m mVar) {
        this.f367083a = layoutInflater;
        this.f367084b = fVar;
        this.f367085c = mVar;
    }

    /* renamed from: a */
    public final View mo13409a(Context context, ViewGroup viewGroup) {
        C4075m mVar;
        View inflate = this.f367083a.inflate(R.layout.googleapp_discover_pagination_spinner, viewGroup, false);
        C69664n.m101059e(inflate, "null cannot be cast to non-null type android.view.View");
        C134839f fVar = this.f367084b;
        inflate.addOnAttachStateChangeListener(new C134837d(fVar, this.f367085c));
        if (fVar.f367091f) {
            ViewGroup.LayoutParams layoutParams = inflate.getLayoutParams();
            if (layoutParams == null) {
                mVar = new C4075m(-2, -2);
            } else {
                mVar = new C4075m(layoutParams);
            }
            mVar.f13052b = true;
            inflate.setLayoutParams(mVar);
        }
        return inflate;
    }
}
