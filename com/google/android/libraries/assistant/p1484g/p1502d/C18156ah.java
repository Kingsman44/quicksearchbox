package com.google.android.libraries.assistant.p1484g.p1502d;

import android.os.RemoteException;
import com.google.common.p4526f.p4527a.C58970a;
import java.util.List;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.g.d.ah */
/* compiled from: PG */
public final /* synthetic */ class C18156ah implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C18152ad f51636a;

    public /* synthetic */ C18156ah(C18152ad adVar) {
        this.f51636a = adVar;
    }

    public final void accept(Object obj) {
        try {
            this.f51636a.mo20095a((List) obj);
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) C18158aj.f51638a.mo56226d()).mo56382g(e)).mo56372aa(47070)).mo56386p("Could not send direct actions response");
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
