package com.google.android.libraries.onegoogle.accountmenu.p2377h;

import android.support.p033v7.widget.C0642fd;
import android.view.View;
import androidx.lifecycle.C2391v;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.particle.C30238l;
import com.google.android.libraries.onegoogle.accountmanagement.C30281j;
import com.google.android.libraries.onegoogle.accountmanagement.p2350b.C30271p;
import com.google.android.libraries.onegoogle.accountmenu.accountlayer.C30306o;
import com.google.android.libraries.onegoogle.accountmenu.cards.C30378bf;
import com.google.android.libraries.onegoogle.common.C30930q;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.h.ao */
/* compiled from: PG */
final class C30666ao implements View.OnAttachStateChangeListener {

    /* renamed from: a */
    final /* synthetic */ C30306o f82772a;

    /* renamed from: b */
    final /* synthetic */ C30271p f82773b;

    /* renamed from: c */
    final /* synthetic */ C0642fd f82774c;

    /* renamed from: d */
    final /* synthetic */ C0642fd f82775d;

    /* renamed from: e */
    final /* synthetic */ C30378bf f82776e;

    /* renamed from: f */
    final /* synthetic */ C30378bf f82777f;

    /* renamed from: g */
    final /* synthetic */ C0642fd f82778g;

    /* renamed from: h */
    final /* synthetic */ C30669ar f82779h;

    public C30666ao(C30669ar arVar, C30306o oVar, C30271p pVar, C0642fd fdVar, C0642fd fdVar2, C30378bf bfVar, C30378bf bfVar2, C0642fd fdVar3) {
        this.f82779h = arVar;
        this.f82772a = oVar;
        this.f82773b = pVar;
        this.f82774c = fdVar;
        this.f82775d = fdVar2;
        this.f82776e = bfVar;
        this.f82777f = bfVar2;
        this.f82778g = fdVar3;
    }

    public final void onViewAttachedToWindow(View view) {
        C2391v a = C30930q.m57727a(view);
        if (this.f82779h.f82804s.mo56113h()) {
            ((C30238l) this.f82779h.f82804s.mo56107c()).mo5704e(a, this.f82779h.f82792g);
        }
        C30306o oVar = this.f82772a;
        oVar.f81934a.f81880a.add(this.f82779h.f82805t);
        C30271p pVar = this.f82773b;
        pVar.mObservable.registerObserver(this.f82774c);
        this.f82774c.mo2834d(0, 0);
        this.f82779h.f82805t.mo18106c(C30281j.m56319c(this.f82772a.f81934a.f81883d));
        C30271p pVar2 = this.f82773b;
        pVar2.mObservable.registerObserver(this.f82775d);
        C30378bf bfVar = this.f82776e;
        bfVar.mObservable.registerObserver(this.f82775d);
        this.f82775d.mo2834d(0, 0);
        C30378bf bfVar2 = this.f82777f;
        bfVar2.mObservable.registerObserver(this.f82778g);
        ((C30665an) this.f82778g).mo36359h();
        C30669ar arVar = this.f82779h;
        if (!arVar.f82796k) {
            arVar.f82797l.mo36287c(a, arVar.f82787b, R.id.selected_account_view);
        }
    }

    public final void onViewDetachedFromWindow(View view) {
        C30306o oVar = this.f82772a;
        oVar.f81934a.f81880a.remove(this.f82779h.f82805t);
        C30271p pVar = this.f82773b;
        pVar.mObservable.unregisterObserver(this.f82775d);
        C30378bf bfVar = this.f82776e;
        bfVar.mObservable.unregisterObserver(this.f82775d);
        C30271p pVar2 = this.f82773b;
        pVar2.mObservable.unregisterObserver(this.f82774c);
        C30378bf bfVar2 = this.f82777f;
        bfVar2.mObservable.unregisterObserver(this.f82778g);
        if (this.f82779h.f82804s.mo56113h()) {
            ((C30238l) this.f82779h.f82804s.mo56107c()).mo5679j(this.f82779h.f82792g);
        }
    }
}
