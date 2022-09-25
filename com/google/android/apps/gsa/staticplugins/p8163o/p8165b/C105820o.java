package com.google.android.apps.gsa.staticplugins.p8163o.p8165b;

import android.os.Handler;
import com.google.android.apps.gsa.shared.p7127q.C90457d;
import com.google.android.apps.p8919h.p8920a.p8921a.p8922a.p8924b.C119111c;
import com.google.android.libraries.p11016ak.p11022d.C147705c;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4543n.p4546c.C59395c;
import com.google.common.util.concurrent.C60845bz;
import java.io.IOException;

/* renamed from: com.google.android.apps.gsa.staticplugins.o.b.o */
/* compiled from: PG */
final class C105820o implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C105823r f295205a;

    public C105820o(C105823r rVar) {
        this.f295205a = rVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        Throwable cause = th instanceof C59395c ? th.getCause() : th;
        if (cause == null || (!(cause instanceof C147705c) && !(cause instanceof C119111c))) {
            this.f295205a.f295216j = C58833ax.m90834k(new IOException("Failed to get the number of paragraphs.", th));
            return;
        }
        int a = C105810e.m176156a(cause);
        ((C59052c) ((C59052c) C105823r.f295207a.mo56225c()).mo56372aa(14099)).mo56387q("Error code = %d", a);
        this.f295205a.f295216j = C58833ax.m90834k(new IOException(new C90457d("Failed to get the number of paragraphs.", th, a)));
    }

    /* renamed from: gm */
    public final /* bridge */ /* synthetic */ void mo17911gm(Object obj) {
        Integer num = (Integer) obj;
        num.getClass();
        ((Handler) this.f295205a.f295215i.mo56107c()).post(new C105819n(this, num));
    }
}
