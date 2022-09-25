package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.a.g */
/* compiled from: PG */
public final class C105399g implements C23113i {

    /* renamed from: a */
    private final C105397e f294022a;

    public C105399g(C105397e eVar) {
        this.f294022a = eVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("InfiniteFeedEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onScrollingInfiniteFeedUpdate_long_long")) {
                this.f294022a.mo94689t(Long.valueOf(pVar.f63472a.getLong("firstVisibleContentIdHash")).longValue(), Long.valueOf(pVar.f63472a.getLong("lastVisibleContentIdHash")).longValue());
            }
        }
    }
}
