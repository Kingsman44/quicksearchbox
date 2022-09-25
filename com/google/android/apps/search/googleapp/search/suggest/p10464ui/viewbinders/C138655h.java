package com.google.android.apps.search.googleapp.search.suggest.p10464ui.viewbinders;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.search.googleapp.search.suggest.C138030av;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138587l;
import com.google.android.apps.search.googleapp.search.suggest.p10464ui.p10466b.C138591p;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.googleapp.search.suggest.ui.viewbinders.h */
/* compiled from: PG */
public final /* synthetic */ class C138655h implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C138635an f377127a;

    /* renamed from: b */
    public final /* synthetic */ C138030av f377128b;

    /* renamed from: c */
    public final /* synthetic */ View f377129c;

    public /* synthetic */ C138655h(C138635an anVar, C138030av avVar, View view) {
        this.f377127a = anVar;
        this.f377128b = avVar;
        this.f377129c = view;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C138635an anVar = this.f377127a;
        C138030av avVar = this.f377128b;
        View view2 = this.f377129c;
        if (!(anVar.mo114423c(avVar) instanceof C138587l)) {
            return false;
        }
        C47393f.m84237h(new C138591p(anVar.mo114424d(avVar), anVar.mo114421a(avVar)), view2);
        return false;
    }
}
