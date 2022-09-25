package com.google.android.apps.gsa.staticplugins.p8019j.p8020a;

import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.base.C58869cf;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4449cd.C57940c;
import dagger.p5295b.C68282c;
import dagger.p5295b.C68283d;
import dagger.p5295b.p5296a.C68236af;
import dagger.p5295b.p5296a.C68247h;
import dagger.p5295b.p5297b.C68277d;
import java.util.Iterator;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.apps.gsa.staticplugins.j.a.n */
/* compiled from: PG */
public final class C102526n extends C68247h {

    /* renamed from: a */
    private final C68283d f286140a;

    public C102526n(C69464a aVar, C69464a aVar2, C68283d dVar) {
        super(aVar2, new C68277d(C102526n.class), aVar);
        this.f286140a = C68236af.m98549d(dVar);
    }

    /* renamed from: a */
    public final /* synthetic */ C60870cx mo20481a(Object obj) {
        Object obj2;
        C68282c cVar = (C68282c) obj;
        if (C57940c.m88582i(cVar)) {
            String str = (String) C57940c.m88577d(cVar);
            if (str != null) {
                Iterator it = C58869cf.m90937c(C58837ba.m90854c(";\\s")).mo56153g(str).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = C58836b.f156633a;
                        break;
                    }
                    String str2 = (String) it.next();
                    int indexOf = str2.indexOf(61);
                    if (indexOf > 0 && indexOf != str2.length() - 1 && str2.substring(0, indexOf).equals("NID")) {
                        obj2 = C58833ax.m90834k(str2.substring(indexOf + 1));
                        break;
                    }
                }
            } else {
                obj2 = C58836b.f156633a;
            }
        } else {
            C58833ax b = C57940c.m88575b(cVar);
            if (b.mo56113h()) {
                C59104x c = C102522j.f286133a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "DevicePropModule");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g((Throwable) b.mo56107c())).mo56372aa(14000)).mo56386p("Failed to fetch cookies.");
            }
            obj2 = C58836b.f156633a;
        }
        return C60856cj.m92900i(obj2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final C60870cx mo20482b() {
        return C68236af.m98546a(this.f286140a.mo60297gq());
    }
}
