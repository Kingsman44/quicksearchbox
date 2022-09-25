package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105200av;
import com.google.android.libraries.gsa.monet.shared.C23113i;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.a.j */
/* compiled from: PG */
public final class C105402j implements C23113i {

    /* renamed from: a */
    private final C105400h f294024a;

    public C105402j(C105400h hVar) {
        this.f294024a = hVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("InterestsTabContentEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onContentObscured")) {
                ((C105200av) this.f294024a).f293409a.mo94782d(true);
            } else if (str.equals("onContentUnObscured")) {
                ((C105200av) this.f294024a).f293409a.mo94782d(false);
            }
        }
    }
}
