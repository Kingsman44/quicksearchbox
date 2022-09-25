package com.google.android.apps.gsa.staticplugins.p8774u.p8776b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23259d;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.b.h */
/* compiled from: PG */
public final class C117492h implements C23113i {

    /* renamed from: a */
    private final C117490f f326122a;

    public C117492h(C117490f fVar) {
        this.f326122a = fVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("BottomSheetEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onChildShown")) {
                this.f326122a.mo103315f();
            } else if (str.equals("onScroll")) {
                this.f326122a.mo103316h();
            } else if (str.equals("onTouch_com.google.android.apps.gsa.staticplugins.bottomsheet.shared.BottomSheetEvents.TouchArea")) {
                C23259d dVar = new C23259d(C117489e.values());
                int i = pVar.f63472a.getInt("touchArea");
                this.f326122a.mo103317i((C117489e) dVar.f63738a[i]);
            }
        }
    }
}
