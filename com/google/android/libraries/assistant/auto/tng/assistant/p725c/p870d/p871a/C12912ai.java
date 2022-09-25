package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p870d.p871a;

import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60845bz;
import com.google.net.p4726a.p4727a.C62722b;
import java.util.concurrent.CancellationException;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.d.a.ai */
/* compiled from: PG */
final class C12912ai implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C12914ak f40185a;

    public C12912ai(C12914ak akVar) {
        this.f40185a = akVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        if (th instanceof CancellationException) {
            this.f40185a.mo20848c(C62722b.CANCELLED);
            if (((Boolean) this.f40185a.f40203o.mo17428b()).booleanValue()) {
                ((C59052c) ((C59052c) C12914ak.f40189a.mo56224b()).mo56372aa(44547)).mo56386p("#execute#onFailure():Session execution cancelled");
            } else {
                ((C59052c) ((C59052c) ((C59052c) C12914ak.f40189a.mo56226d()).mo56382g(th)).mo56372aa(44546)).mo56386p("#execute#onFailure():Session execution failed");
            }
        } else {
            this.f40185a.mo20848c(C62722b.UNKNOWN);
            ((C59052c) ((C59052c) ((C59052c) C12914ak.f40189a.mo56226d()).mo56382g(th)).mo56372aa(44545)).mo56386p("#execute#onFailure():Session execution failed");
        }
        this.f40185a.mo20847b(th);
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Void voidR = (Void) obj;
        ((C59052c) ((C59052c) C12914ak.f40189a.mo56224b()).mo56372aa(44548)).mo56386p("#execute#onSuccess(): Session executed successfully");
        this.f40185a.mo20848c(C62722b.OK);
        this.f40185a.mo20847b((Throwable) null);
    }
}
