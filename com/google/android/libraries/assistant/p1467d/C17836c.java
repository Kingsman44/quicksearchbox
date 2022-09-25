package com.google.android.libraries.assistant.p1467d;

import android.os.RemoteException;
import com.google.android.apps.search.assistant.platform.appintegration.p8990b.C119515a;
import com.google.android.libraries.assistant.p1467d.p1472c.C17837a;
import com.google.android.libraries.assistant.p1467d.p1472c.p1476c.C17881ak;
import com.google.common.base.C58817ah;
import com.google.common.p4526f.C59052c;

/* renamed from: com.google.android.libraries.assistant.d.c */
/* compiled from: PG */
public final /* synthetic */ class C17836c implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C17881ak f51178a;

    public /* synthetic */ C17836c(C17881ak akVar) {
        this.f51178a = akVar;
    }

    public final Object apply(Object obj) {
        try {
            ((C119515a) obj).mo23492a(this.f51178a);
            return C17837a.f51179a;
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) C17928f.f51358a.mo56225c()).mo56382g(e)).mo56372aa(42837)).mo56386p("Can't send data");
            return C17837a.f51180b;
        }
    }
}
