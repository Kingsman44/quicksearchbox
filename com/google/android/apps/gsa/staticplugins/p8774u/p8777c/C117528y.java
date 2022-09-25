package com.google.android.apps.gsa.staticplugins.p8774u.p8777c;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90233i;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.c.y */
/* compiled from: PG */
final class C117528y implements View.OnTouchListener {

    /* renamed from: a */
    final /* synthetic */ C117497ab f326214a;

    public C117528y(C117497ab abVar) {
        this.f326214a = abVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        View view2;
        if (((Boolean) ((C23249a) this.f326214a.f326138c.mo103335h()).mo28725a()).booleanValue()) {
            C117497ab abVar = this.f326214a;
            if (!abVar.f326146k && !abVar.f326145j && abVar.f326148m != null) {
                abVar.f326145j = true;
                C90233i iVar = abVar.f326150o;
                if (iVar == null) {
                    view2 = null;
                } else {
                    view2 = iVar.mo83945b();
                }
                if (view2 == null || !C91115n.m148877i(view2, motionEvent)) {
                    this.f326214a.f326145j = false;
                } else {
                    view.performClick();
                    this.f326214a.mo103344f();
                    return true;
                }
            }
        }
        return false;
    }
}
