package com.google.android.apps.gsa.staticplugins.p8774u.p8777c;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117494j;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.c.w */
/* compiled from: PG */
final class C117526w implements ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: a */
    final /* synthetic */ C117527x f326212a;

    public C117526w(C117527x xVar) {
        this.f326212a = xVar;
    }

    public final void onGlobalLayout() {
        C117494j jVar;
        C117494j jVar2;
        C117497ab abVar = this.f326212a.f326213a;
        abVar.f326145j = false;
        abVar.f326146k = true;
        abVar.f326154s = true;
        View view = abVar.f326148m;
        if (view != null) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            if (!this.f326212a.f326213a.f326140e.mo28316z()) {
                ((C59052c) ((C59052c) C117497ab.f326136a.mo56225c()).mo56372aa(18279)).mo56386p("Child feature has been removed");
                return;
            }
            if (!((C58833ax) ((C23249a) this.f326212a.f326213a.f326138c.mo103330c()).mo28725a()).mo56113h()) {
                ((C59052c) ((C59052c) C117497ab.f326136a.mo56225c()).mo56372aa(18278)).mo56386p("The animation-in type in the model is not present.");
                jVar = C117494j.ANIMATE_FADE_IN;
            } else {
                jVar = (C117494j) ((C58833ax) ((C23249a) this.f326212a.f326213a.f326138c.mo103330c()).mo28725a()).mo56107c();
            }
            if (!((C58833ax) ((C23249a) this.f326212a.f326213a.f326138c.mo103331d()).mo28725a()).mo56113h()) {
                ((C59052c) ((C59052c) C117497ab.f326136a.mo56225c()).mo56372aa(18277)).mo56386p("The animation-out type in the model is not present.");
                jVar2 = C117494j.ANIMATE_FADE_OUT;
            } else {
                jVar2 = (C117494j) ((C58833ax) ((C23249a) this.f326212a.f326213a.f326138c.mo103331d()).mo28725a()).mo56107c();
            }
            C117497ab abVar2 = this.f326212a.f326213a;
            abVar2.f326148m.getClass();
            C117494j jVar3 = C117494j.ANIMATE_FADE_IN;
            int ordinal = jVar2.ordinal();
            if (ordinal == 1) {
                abVar2.f326151p.f326163c = new C117507d(C117494j.ANIMATE_FADE_OUT, abVar2.f326148m);
            } else if (ordinal == 3) {
                abVar2.f326152q.f326163c = new C117507d(C117494j.ANIMATE_SLIDE_DOWN, abVar2.f326148m);
            } else if (ordinal != 5) {
                ((C59052c) ((C59052c) C117497ab.f326136a.mo56225c()).mo56372aa(18289)).mo56389s("Unexpected transition in animation type %s", jVar2.f326130g);
            } else {
                abVar2.f326153r.f326163c = new C117507d(C117494j.ANIMATE_FADE_OUT_SLIDE_DOWN, abVar2.f326148m);
            }
            C117497ab abVar3 = this.f326212a.f326213a;
            C117507d e = abVar3.mo103343e(jVar);
            if (e == null) {
                ((C59052c) ((C59052c) C117497ab.f326136a.mo56225c()).mo56372aa(18290)).mo56386p("Unable to start animation, the animation is null");
            } else {
                e.mo103348a(new C117519p(abVar3));
            }
        }
    }
}
