package com.google.android.apps.gsa.nga.engine.p6144ui.answer;

import com.google.android.apps.gsa.nga.engine.av.bl;
import com.google.android.libraries.gsa.p1876k.C22869e;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.answer.at */
/* compiled from: PG */
public final /* synthetic */ class C78047at implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C78048au f215002a;

    /* renamed from: b */
    public final /* synthetic */ bl f215003b;

    public /* synthetic */ C78047at(C78048au auVar, bl blVar) {
        this.f215002a = auVar;
        this.f215003b = blVar;
    }

    public final void run() {
        C78048au auVar = this.f215002a;
        if (this.f215003b.equals(bl.a)) {
            KeyboardHandler keyboardHandler = auVar.f215004a;
            keyboardHandler.f214919e.hideSoftInputFromWindow(keyboardHandler.f214915a.getWindowToken(), 0);
        }
    }
}
