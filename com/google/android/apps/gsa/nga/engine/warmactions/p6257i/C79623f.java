package com.google.android.apps.gsa.nga.engine.warmactions.p6257i;

import com.google.android.apps.gsa.nga.engine.warmactions.p6250c.C79490o;
import com.google.common.p4526f.p4527a.C58970a;
import java.io.IOException;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.nga.engine.warmactions.i.f */
/* compiled from: PG */
public final /* synthetic */ class C79623f implements Consumer {

    /* renamed from: a */
    public static final /* synthetic */ C79623f f218426a = new C79623f();

    private /* synthetic */ C79623f() {
    }

    public final void accept(Object obj) {
        try {
            ((C79490o) obj).close();
        } catch (IOException e) {
            ((C58970a) ((C58970a) ((C58970a) C79630m.f218430a.mo56225c()).mo56382g(e)).mo56372aa(5707)).mo56386p("#MWW failed to close mic.");
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
