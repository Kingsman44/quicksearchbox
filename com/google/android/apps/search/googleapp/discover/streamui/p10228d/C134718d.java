package com.google.android.apps.search.googleapp.discover.streamui.p10228d;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.C4075m;
import com.facebook.litho.p334j.C6400c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.setupcompat.p3549a.C45240c;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.discover.streamui.d.d */
/* compiled from: PG */
public final class C134718d implements C6400c {

    /* renamed from: a */
    final /* synthetic */ C134719e f366838a;

    /* renamed from: b */
    final /* synthetic */ int f366839b;

    public C134718d(C134719e eVar, int i) {
        this.f366838a = eVar;
        this.f366839b = i;
    }

    /* renamed from: a */
    public final View mo13409a(Context context, ViewGroup viewGroup) {
        C69664n.m101061g(context, C45240c.f118157a);
        View inflate = LayoutInflater.from(context).inflate(R.layout.googleapp_discover_header_container, viewGroup, false);
        C69664n.m101059e(inflate, "null cannot be cast to non-null type android.widget.FrameLayout");
        FrameLayout frameLayout = (FrameLayout) inflate;
        C134719e eVar = this.f366838a;
        int i = this.f366839b;
        if (eVar.f366841b) {
            C4075m mVar = new C4075m(frameLayout.getLayoutParams());
            mVar.f13052b = true;
            frameLayout.setLayoutParams(mVar);
        }
        frameLayout.getLayoutParams().height = i;
        return frameLayout;
    }
}
