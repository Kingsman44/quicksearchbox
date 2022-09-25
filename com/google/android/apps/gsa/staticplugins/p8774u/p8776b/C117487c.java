package com.google.android.apps.gsa.staticplugins.p8774u.p8776b;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.shared.monet.p7070b.p7086e.C90225a;
import com.google.android.apps.gsa.staticplugins.p8774u.p8775a.C117471g;
import com.google.android.libraries.gsa.monet.shared.C23113i;

/* renamed from: com.google.android.apps.gsa.staticplugins.u.b.c */
/* compiled from: PG */
public final class C117487c implements C23113i {

    /* renamed from: a */
    private final C117485a f326117a;

    public C117487c(C117485a aVar) {
        this.f326117a = aVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("BottomSheetDialogEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            Bundle bundle = (Bundle) parcelable;
            if (str.equals("onCloseButtonClicked")) {
                C90225a aVar = ((C117471g) this.f326117a).f326058c;
                if (aVar != null) {
                    aVar.mo80973a();
                }
            } else if (str.equals("onNegativeButtonClicked")) {
                C90225a aVar2 = ((C117471g) this.f326117a).f326057b;
                aVar2.getClass();
                aVar2.mo80973a();
            } else if (str.equals("onPositiveButtonClicked")) {
                C90225a aVar3 = ((C117471g) this.f326117a).f326056a;
                aVar3.getClass();
                aVar3.mo80973a();
            }
        }
    }
}
