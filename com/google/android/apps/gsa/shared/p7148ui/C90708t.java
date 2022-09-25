package com.google.android.apps.gsa.shared.p7148ui;

import java.util.Observable;
import java.util.Observer;

/* renamed from: com.google.android.apps.gsa.shared.ui.t */
/* compiled from: PG */
final class C90708t implements Observer {

    /* renamed from: a */
    final /* synthetic */ C90714z f253739a;

    public C90708t(C90714z zVar) {
        this.f253739a = zVar;
    }

    public final void update(Observable observable, Object obj) {
        int a = ((C90713y) observable).mo85038a();
        C90714z zVar = this.f253739a;
        int i = zVar.f253749d;
        if (a != i && a != i) {
            zVar.f253749d = a;
            zVar.mo85047k(0, i == 0 ? 1 : 0);
        }
    }
}
