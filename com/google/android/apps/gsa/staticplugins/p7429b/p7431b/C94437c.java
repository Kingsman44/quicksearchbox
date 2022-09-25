package com.google.android.apps.gsa.staticplugins.p7429b.p7431b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.p7429b.p7430a.C94432d;
import com.google.android.libraries.gsa.monet.shared.C23113i;

/* renamed from: com.google.android.apps.gsa.staticplugins.b.b.c */
/* compiled from: PG */
public final class C94437c implements C23113i {

    /* renamed from: a */
    private final C94435a f264026a;

    public C94437c(C94435a aVar) {
        this.f264026a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("ActivityPageManagerEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onStackFinished")) {
                ((C94432d) this.f264026a).f264014c.mo80935a();
            }
        }
    }
}
