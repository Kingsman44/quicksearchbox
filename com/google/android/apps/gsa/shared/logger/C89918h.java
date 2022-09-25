package com.google.android.apps.gsa.shared.logger;

import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7127q.C90452a;
import com.google.android.libraries.search.integrations.p3018c.C38505d;
import com.google.common.p4526f.C59090j;
import com.google.common.p4526f.p4528b.C59031f;
import com.google.common.p4526f.p4528b.C59037l;
import com.google.common.p4526f.p4528b.p4529a.C58982a;
import com.google.common.p4552o.p4559e.C59743a;
import dagger.C68214a;
import java.util.logging.Level;

/* renamed from: com.google.android.apps.gsa.shared.logger.h */
/* compiled from: PG */
public final class C89918h extends C58982a {

    /* renamed from: a */
    private final C68214a f246352a;

    public C89918h(String str, C68214a aVar) {
        super(str);
        this.f246352a = aVar;
    }

    /* renamed from: a */
    public final void mo36921a(C59031f fVar) {
        C59037l h = fVar.mo56305h();
        Throwable th = (Throwable) h.mo56312d(C59090j.f157047a);
        Integer num = (Integer) h.mo56312d(C38505d.f101863a);
        Integer num2 = (Integer) h.mo56312d(C38505d.f101864b);
        if (num != null || num2 != null) {
            C89886e b = ((C89911f) this.f246352a.mo27525b()).mo83756b(new C90452a(th, (num2 != null ? C59743a.UNEXPECTED_CLIENT_ERROR : C59743a.ERROR_GSA).f161421ts, num != null ? num.intValue() : C89885b.INTERNAL_ERROR_GENERIC_BUG_VALUE));
            b.f246287h = false;
            if (num2 != null) {
                b.f246282c = num2.intValue();
            }
            b.mo83721a();
        }
    }

    /* renamed from: b */
    public final boolean mo36922b(Level level) {
        return level.intValue() >= Level.INFO.intValue();
    }
}
