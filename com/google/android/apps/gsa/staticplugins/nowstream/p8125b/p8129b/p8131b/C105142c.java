package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8131b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8126a.p8127a.C105100g;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.b.b.c */
/* compiled from: PG */
public final class C105142c implements C23113i {

    /* renamed from: a */
    private final C105140a f293109a;

    public C105142c(C105140a aVar) {
        this.f293109a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("HeaderEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onBackButtonClicked")) {
                ((C105100g) this.f293109a).f293015b.mo94562a();
            } else if (str.equals("onFeedbackLaunched")) {
                ((C105100g) this.f293109a).f293016c.mo94564a();
            } else if (str.equals("onItemClicked_int")) {
                ((C105100g) this.f293109a).f293014a.mo94563a(Integer.valueOf(pVar.f63472a.getInt("itemId")).intValue());
            }
        }
    }
}
