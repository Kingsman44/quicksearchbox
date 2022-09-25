package com.google.android.apps.search.googleapp.googleappbrowser.p10264e.p10265a;

import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.apps.tiktok.cache.C46370ah;
import com.google.apps.tiktok.cache.C46401p;
import com.google.apps.tiktok.cache.InstanceStateStoreFactory;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58800sl;
import com.google.protobuf.C62944bx;
import com.google.protobuf.C63077o;

/* renamed from: com.google.android.apps.search.googleapp.googleappbrowser.e.a.a */
/* compiled from: PG */
public final class C135572a {

    /* renamed from: b */
    private static final C58528ij f369289b = C58528ij.m90012L(C89849ae.CCT_NAVIGATION_ABORTED, C89849ae.CCT_NAVIGATION_FAILED, C89849ae.CCT_FIRST_CONTENTFUL_PAINT);

    /* renamed from: a */
    public final C89859i f369290a;

    /* renamed from: c */
    private final C46401p f369291c;

    public C135572a(C89859i iVar, InstanceStateStoreFactory instanceStateStoreFactory) {
        this.f369290a = iVar;
        this.f369291c = instanceStateStoreFactory.mo50325a("gab_app_flow_events_cache", C63077o.f170228b);
    }

    /* renamed from: a */
    public final void mo112390a(C89849ae aeVar) {
        C46370ah a = this.f369291c.mo50378a(C62944bx.m95448a(aeVar.f245884YW));
        C58528ij ijVar = f369289b;
        if (ijVar.contains(aeVar)) {
            C58800sl lA = ijVar.iterator();
            while (lA.hasNext()) {
                C46370ah a2 = this.f369291c.mo50378a(C62944bx.m95448a(((C89849ae) lA.next()).f245884YW));
                if (a2 != null && ((C63077o) a2.f121384a).f170230a) {
                    return;
                }
            }
        } else if (a != null && ((C63077o) a.f121384a).f170230a) {
            return;
        }
        this.f369290a.mo83702b(aeVar);
        this.f369291c.mo50381d(C62944bx.m95448a(aeVar.f245884YW), C63077o.m96099a(true));
    }
}
