package com.google.android.libraries.elements.p1708c.p1709a;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import androidx.core.p098j.C2043bi;
import com.google.protos.youtube.elements.p5165a.C66016d;
import p5488io.p5490b.p5496d.C69819a;

/* renamed from: com.google.android.libraries.elements.c.a.e */
/* compiled from: PG */
public final /* synthetic */ class C20724e implements C69819a {

    /* renamed from: a */
    public final /* synthetic */ C20726g f58038a;

    /* renamed from: b */
    public final /* synthetic */ C66016d f58039b;

    /* renamed from: c */
    public final /* synthetic */ View f58040c;

    public /* synthetic */ C20724e(C20726g gVar, C66016d dVar, View view) {
        this.f58038a = gVar;
        this.f58039b = dVar;
        this.f58040c = view;
    }

    /* renamed from: a */
    public final void mo25795a() {
        View view;
        Window a;
        C20726g gVar = this.f58038a;
        C66016d dVar = this.f58039b;
        View view2 = this.f58040c;
        String str = dVar.f179536b;
        View rootView = view2.getRootView();
        if (rootView != null) {
            View d = C20726g.m38914d(str, rootView);
            if (d == null) {
                if (!gVar.f58041a.mo56113h() || (a = ((C20725f) gVar.f58041a.mo56107c()).mo25808a()) == null) {
                    Context context = view2.getContext();
                    while (true) {
                        if (!(context instanceof ContextWrapper)) {
                            view = null;
                            break;
                        } else if (context instanceof Activity) {
                            view = ((Activity) context).getWindow().getDecorView();
                            break;
                        } else {
                            context = ((ContextWrapper) context).getBaseContext();
                        }
                    }
                } else {
                    view = a.getDecorView();
                }
                if (view != null) {
                    d = C20726g.m38914d(str, view);
                }
            }
            if (d != null) {
                C2043bi.m5535aB(d, 64, (Bundle) null);
                return;
            }
            throw new IllegalArgumentException("Unable to locate view with accessibility id: ".concat(String.valueOf(str)));
        }
        throw new IllegalStateException("Unable to locate the root View.");
    }
}
