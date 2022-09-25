package com.google.android.apps.gsa.staticplugins.p8774u.p8777c;

import android.view.MotionEvent;
import android.view.View;
import com.google.android.apps.gsa.shared.p7148ui.C90656ba;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.p8774u.p8776b.C117489e;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1923a.C23249a;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.c.s */
/* compiled from: PG */
public final /* synthetic */ class C117522s implements C90656ba {

    /* renamed from: a */
    public final /* synthetic */ C117497ab f326208a;

    public /* synthetic */ C117522s(C117497ab abVar) {
        this.f326208a = abVar;
    }

    /* renamed from: a */
    public final boolean mo73061a(MotionEvent motionEvent) {
        C117497ab abVar = this.f326208a;
        if (abVar.f326146k || abVar.f326145j || abVar.f326148m == null) {
            return false;
        }
        if (((Boolean) ((C23249a) abVar.f326138c.mo103338k()).mo28725a()).booleanValue()) {
            abVar.f326145j = true;
            View view = abVar.f326148m;
            view.getClass();
            if (!C91115n.m148877i(view, motionEvent)) {
                abVar.f326139d.mo103317i(C117489e.TOUCH_OUTSIDE);
                return false;
            }
            abVar.f326145j = false;
            return false;
        } else if (((Boolean) ((C23249a) abVar.f326138c.mo103335h()).mo28725a()).booleanValue()) {
            return true;
        } else {
            return false;
        }
    }
}
