package com.google.android.apps.gsa.staticplugins.opa.tapas.p8555l;

import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80007da;
import com.google.android.apps.gsa.nga.engine.p6262y.p6271e.p6272a.C80012i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113405ep;
import com.google.android.apps.search.assistant.platform.p9171i.p9217c.p9220b.p9224d.C121438d;
import com.google.android.apps.search.assistant.platform.p9171i.p9230e.p9231a.p9233b.C121509q;
import com.google.android.libraries.gsa.p1876k.C22864c;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.l.ed */
/* compiled from: PG */
public final /* synthetic */ class C112396ed implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C112435fh f311841a;

    /* renamed from: b */
    public final /* synthetic */ C113405ep f311842b;

    /* renamed from: c */
    public final /* synthetic */ C80007da f311843c;

    public /* synthetic */ C112396ed(C112435fh fhVar, C113405ep epVar, C80007da daVar) {
        this.f311841a = fhVar;
        this.f311842b = epVar;
        this.f311843c = daVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C121509q l;
        C112435fh fhVar = this.f311841a;
        C113405ep epVar = this.f311842b;
        C80007da daVar = this.f311843c;
        List list = (List) obj;
        C121509q l2 = C112435fh.f311928a.mo105243l("issue_log_data_collection");
        try {
            C80012i c = fhVar.mo99520c(list, epVar, daVar);
            fhVar.f311932e.mo99591a(c);
            l = C112435fh.f311928a.mo105243l("buildResult");
            C121438d f = fhVar.mo99522f(C121438d.m200684a(), c);
            l.close();
            l2.close();
            return f;
        } catch (Throwable th) {
            try {
                l2.close();
            } catch (Throwable th2) {
                C112294dz.m186129a(th, th2);
            }
            throw th;
        }
        throw th;
    }
}
