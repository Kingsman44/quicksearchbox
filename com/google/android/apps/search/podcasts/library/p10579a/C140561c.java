package com.google.android.apps.search.podcasts.library.p10579a;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.search.podcasts.library.p10581c.C140569a;
import com.google.android.libraries.play.unison.binding.C31970as;
import com.google.android.libraries.play.unison.binding.C31987m;
import com.google.android.libraries.play.unison.binding.C31989o;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;

/* renamed from: com.google.android.apps.search.podcasts.library.a.c */
/* compiled from: PG */
public final /* synthetic */ class C140561c implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C140563e f381738a;

    /* renamed from: b */
    public final /* synthetic */ C31989o f381739b;

    public /* synthetic */ C140561c(C140563e eVar, C31989o oVar) {
        this.f381738a = eVar;
        this.f381739b = oVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C140563e eVar = this.f381738a;
        C31989o oVar = this.f381739b;
        if (motionEvent.getActionMasked() != 0) {
            return false;
        }
        C31970as asVar = (C31970as) ((C31987m) oVar).f85985a;
        asVar.getClass();
        C47393f.m84237h(new C140569a(asVar.mo37734c().findContainingViewHolder(eVar.mo37744f())), view);
        return false;
    }
}
