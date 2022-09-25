package com.google.android.apps.gsa.staticplugins.p7816dl.p7819c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99651b;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99668s;
import com.google.android.apps.gsa.staticplugins.p7816dl.p7818b.C99673x;
import com.google.android.libraries.gsa.monet.shared.C23113i;

/* renamed from: com.google.android.apps.gsa.staticplugins.dl.c.g */
/* compiled from: PG */
public final class C99682g implements C23113i {

    /* renamed from: a */
    private final C99680e f278956a;

    public C99682g(C99680e eVar) {
        this.f278956a = eVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("PartnerTabEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onPullToRefresh")) {
                C99673x xVar = (C99673x) this.f278956a;
                ((C99651b) xVar.f278937c).f278875b.mo28730f(true, false);
                xVar.mo91567h();
            } else if (str.equals("onScrollPositionChanged")) {
                ((C99651b) ((C99673x) this.f278956a).f278937c).f278878e.mo28651e(C99668s.f278928a);
            }
        }
    }
}
