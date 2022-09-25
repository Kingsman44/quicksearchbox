package com.google.android.apps.gsa.staticplugins.messages.monet.p8037c;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8034a.C102721b;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8035b.C102729a;
import com.google.android.apps.gsa.staticplugins.messages.monet.p8035b.C102736e;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.common.base.C58833ax;

/* renamed from: com.google.android.apps.gsa.staticplugins.messages.monet.c.c */
/* compiled from: PG */
public final class C102751c implements C23113i {

    /* renamed from: a */
    private final C102749a f286849a;

    public C102751c(C102749a aVar) {
        this.f286849a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("MessageCardButtonEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onButtonClicked")) {
                C102736e eVar = (C102736e) this.f286849a;
                eVar.f286823b.mo93404a((C102721b) ((C58833ax) ((C102729a) eVar.f286822a).f286798c.f63720e).mo56109e(C102721b.UNKNOWN_BUTTON));
            }
        }
    }
}
