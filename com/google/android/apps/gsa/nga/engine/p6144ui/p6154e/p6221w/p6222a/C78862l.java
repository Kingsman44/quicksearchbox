package com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6221w.p6222a;

import com.google.android.apps.gsa.nga.engine.p6144ui.p6154e.p6165e.p6167b.C78245d;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80706ch;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80708cj;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80709ck;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80710cl;
import com.google.android.apps.gsa.nga.shared.p6417x.C83343ad;

/* renamed from: com.google.android.apps.gsa.nga.engine.ui.e.w.a.l */
/* compiled from: PG */
public final /* synthetic */ class C78862l implements C83343ad {

    /* renamed from: a */
    public static final /* synthetic */ C78862l f217025a = new C78862l();

    private /* synthetic */ C78862l() {
    }

    /* renamed from: a */
    public final Object mo73138a(Object obj, Object obj2, Object obj3) {
        C78245d dVar = (C78245d) obj;
        C80710cl clVar = (C80710cl) obj2;
        Boolean bool = (Boolean) obj3;
        C80709ck a = C78863m.m126712a(dVar);
        int h = dVar.mo73180b().mo73175h();
        int i = h - 1;
        if (h == 0) {
            throw null;
        } else if (i != 0) {
            boolean z = true;
            if (i == 1) {
                C80706ch e = C80710cl.m128515e();
                e.mo74468d(C80708cj.HALF_LISTENING);
                e.mo74469e(a);
                return e.mo74465a();
            } else if (i == 2) {
                return clVar;
            } else {
                if (i != 3) {
                    C80706ch e2 = C80710cl.m128515e();
                    e2.mo74468d(C80708cj.GONE);
                    e2.mo74469e(a);
                    return e2.mo74465a();
                } else if (bool.booleanValue()) {
                    return clVar;
                } else {
                    C80706ch e3 = C80710cl.m128515e();
                    e3.mo74468d(C80708cj.FULFILL_BOTTOM);
                    int h2 = dVar.mo73180b().mo73175h();
                    if (h2 != 0) {
                        if (h2 != 1) {
                            int h3 = dVar.mo73180b().mo73175h();
                            if (h3 == 0) {
                                throw null;
                            } else if (h3 != 2) {
                                z = false;
                            }
                        }
                        e3.mo74467c(z);
                        e3.mo74469e(a);
                        return e3.mo74465a();
                    }
                    throw null;
                }
            }
        } else {
            C80706ch e4 = C80710cl.m128515e();
            e4.mo74468d(C80708cj.FULL_LISTENING);
            e4.mo74469e(a);
            return e4.mo74465a();
        }
    }
}
