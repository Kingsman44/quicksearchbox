package com.google.android.libraries.assistant.p1484g.p1502d;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.common.p4526f.p4527a.C58970a;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.assistant.g.d.ai */
/* compiled from: PG */
public final /* synthetic */ class C18157ai implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C18149aa f51637a;

    public /* synthetic */ C18157ai(C18149aa aaVar) {
        this.f51637a = aaVar;
    }

    public final void accept(Object obj) {
        try {
            this.f51637a.mo20094a((Bundle) obj);
        } catch (RemoteException e) {
            ((C58970a) ((C58970a) ((C58970a) C18158aj.f51638a.mo56226d()).mo56382g(e)).mo56372aa(47069)).mo56386p("Could not send result of performing direct action");
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
