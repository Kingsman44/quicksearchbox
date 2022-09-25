package com.google.android.apps.search.googleapp.settingsui;

import android.animation.ArgbEvaluator;
import android.animation.ObjectAnimator;
import android.support.p033v7.widget.C0655fq;
import android.support.p033v7.widget.RecyclerView;
import android.view.View;
import androidx.core.content.C1878d;
import androidx.preference.C3990ap;
import com.google.android.apps.search.googleapp.p10536x.C139873i;
import com.google.android.apps.search.googleapp.settingsui.p10484c.C139205a;
import com.google.android.googlequicksearchbox.R;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.googleapp.settingsui.ax */
/* compiled from: PG */
public final class C139170ax implements C0655fq {

    /* renamed from: a */
    final /* synthetic */ C3990ap f378494a;

    /* renamed from: b */
    final /* synthetic */ C139873i f378495b;

    /* renamed from: c */
    final /* synthetic */ RecyclerView f378496c;

    /* renamed from: d */
    final /* synthetic */ C139178ba f378497d;

    public C139170ax(C3990ap apVar, C139873i iVar, RecyclerView recyclerView, C139178ba baVar) {
        this.f378494a = apVar;
        this.f378495b = iVar;
        this.f378496c = recyclerView;
        this.f378497d = baVar;
    }

    /* renamed from: a */
    public final void mo2457a(View view) {
        C69664n.m101061g(view, "view");
        if (this.f378496c.getChildAdapterPosition(view) == this.f378494a.mo8425c(this.f378495b.name())) {
            C139205a aVar = this.f378497d.f378527q;
            C69664n.m101061g(view, "view");
            int a = C1878d.m5128a(aVar.f378596a.requireContext(), R.color.agsa_color_hairline);
            ObjectAnimator ofObject = ObjectAnimator.ofObject(view, "backgroundColor", new ArgbEvaluator(), new Object[]{0, Integer.valueOf(a)});
            ofObject.setRepeatMode(2);
            ofObject.setRepeatCount(1);
            ofObject.setDuration(1000);
            ofObject.start();
            this.f378496c.removeOnChildAttachStateChangeListener(this);
        }
    }

    /* renamed from: b */
    public final void mo2458b(View view) {
        C69664n.m101061g(view, "view");
    }
}
