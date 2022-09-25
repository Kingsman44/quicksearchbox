package com.google.android.apps.gsa.staticplugins.opa.util;

import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import com.google.common.p4526f.C59052c;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.util.bg */
/* compiled from: PG */
public final class C113791bg extends WindowInsetsAnimation.Callback {

    /* renamed from: a */
    final /* synthetic */ ViewGroup.MarginLayoutParams f315145a;

    /* renamed from: b */
    final /* synthetic */ int f315146b;

    /* renamed from: c */
    final /* synthetic */ View f315147c;

    /* renamed from: d */
    final /* synthetic */ View f315148d;

    /* renamed from: e */
    final /* synthetic */ C113793bi f315149e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C113791bg(C113793bi biVar, ViewGroup.MarginLayoutParams marginLayoutParams, int i, View view, View view2) {
        super(0);
        this.f315149e = biVar;
        this.f315145a = marginLayoutParams;
        this.f315146b = i;
        this.f315147c = view;
        this.f315148d = view2;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        C113793bi biVar = this.f315149e;
        if (biVar.f315160f) {
            biVar.f315160f = false;
            WindowInsets rootWindowInsets = this.f315148d.getRootWindowInsets();
            int i = this.f315146b;
            if (rootWindowInsets != null) {
                i += rootWindowInsets.getInsets(WindowInsets.Type.ime()).bottom;
            } else {
                ((C59052c) ((C59052c) C113793bi.f315153a.mo56225c()).mo56372aa(28431)).mo56386p("WindowInsets is null when windowinsets animation ends");
            }
            if (this.f315145a.bottomMargin != i) {
                this.f315145a.bottomMargin = i;
                this.f315147c.setLayoutParams(this.f315145a);
            }
        }
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        if ((windowInsetsAnimation.getTypeMask() & WindowInsets.Type.ime()) != 0) {
            this.f315149e.f315160f = true;
        }
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        if (!this.f315149e.f315160f) {
            return windowInsets;
        }
        int i = windowInsets.getInsets(WindowInsets.Type.ime()).bottom;
        this.f315145a.bottomMargin = this.f315146b + i;
        this.f315147c.setLayoutParams(this.f315145a);
        return windowInsets;
    }
}
