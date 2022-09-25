package com.google.android.apps.gsa.staticplugins.p7855dr.p7859d;

import com.google.android.apps.gsa.shared.p7148ui.C90713y;
import java.util.Observable;

/* renamed from: com.google.android.apps.gsa.staticplugins.dr.d.aq */
/* compiled from: PG */
final class C100050aq extends Observable implements C90713y {

    /* renamed from: a */
    final /* synthetic */ C100053at f279781a;

    public C100050aq(C100053at atVar) {
        this.f279781a = atVar;
    }

    /* renamed from: a */
    public final int mo85038a() {
        C100053at atVar = this.f279781a;
        return atVar.f279787B.f242008a.f241535a + atVar.f279808m.top;
    }

    public final void notifyObservers() {
        setChanged();
        super.notifyObservers();
    }
}
