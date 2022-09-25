package com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e;

import android.widget.Button;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40132d;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40150v;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40151w;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3123e.p3124a.C40153y;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40247a;
import com.google.android.libraries.search.rendering.xuikit.bubbles.p3129f.C40252f;
import com.google.apps.tiktok.tracing.C47810es;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.bubbles.e.q */
/* compiled from: PG */
public final /* synthetic */ class C40236q implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C40165ak f105700a;

    /* renamed from: b */
    public final /* synthetic */ Button f105701b;

    public /* synthetic */ C40236q(C40165ak akVar, Button button) {
        this.f105700a = akVar;
        this.f105701b = button;
    }

    public final void run() {
        C40165ak akVar = this.f105700a;
        akVar.f105505l.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(this.f105701b));
        C40153y yVar = akVar.f105492C;
        C40132d dVar = (C40132d) yVar;
        dVar.f105411c.animate().alpha(0.0f).withEndAction(C47810es.m84977q(new C40150v(yVar))).start();
        dVar.f105410b.animate().scaleX(0.0f).scaleY(0.0f).translationY(((C40247a) C40252f.m69868b(dVar.f105412d)).f105718b).alpha(0.0f).withEndAction(C47810es.m84977q(new C40151w(yVar))).start();
    }
}
