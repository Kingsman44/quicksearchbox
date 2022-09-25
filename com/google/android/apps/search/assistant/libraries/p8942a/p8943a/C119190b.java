package com.google.android.apps.search.assistant.libraries.p8942a.p8943a;

import android.os.Build;
import android.view.contentcapture.DataShareRequest;
import com.google.android.apps.search.assistant.libraries.p8942a.C119207d;
import com.google.android.apps.search.assistant.libraries.p8942a.p8944b.p8945a.C119205a;
import com.google.android.libraries.p1635au.C19569f;
import com.google.android.libraries.search.logging.p3041d.C39141kp;
import com.google.common.base.C58817ah;
import com.google.common.base.C58872ci;
import com.google.common.p4526f.C59052c;
import p3186j$.time.Duration;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.libraries.a.a.b */
/* compiled from: PG */
public final /* synthetic */ class C119190b implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C119202n f332394a;

    /* renamed from: b */
    public final /* synthetic */ DataShareRequest f332395b;

    /* renamed from: c */
    public final /* synthetic */ int f332396c;

    /* renamed from: d */
    public final /* synthetic */ C58872ci f332397d;

    /* renamed from: e */
    public final /* synthetic */ int f332398e;

    public /* synthetic */ C119190b(C119202n nVar, DataShareRequest dataShareRequest, int i, C58872ci ciVar, int i2) {
        this.f332394a = nVar;
        this.f332395b = dataShareRequest;
        this.f332396c = i;
        this.f332397d = ciVar;
        this.f332398e = i2;
    }

    public final Object apply(Object obj) {
        C119202n nVar = this.f332394a;
        DataShareRequest dataShareRequest = this.f332395b;
        int i = this.f332396c;
        C58872ci ciVar = this.f332397d;
        int i2 = this.f332398e;
        C119207d dVar = (C119207d) obj;
        ((C59052c) ((C59052c) C119202n.f332431a.mo56224b()).mo56372aa(34345)).mo56389s("#shareData for %s done", dataShareRequest.getLocusId().getId());
        C119205a aVar = nVar.f332444m;
        String id = dataShareRequest.getLocusId().getId();
        Duration ofNanos = Duration.ofNanos(ciVar.mo56159b());
        C39141kp kpVar = aVar.f332448a;
        long millis = ofNanos.toMillis();
        int i3 = Build.VERSION.SDK_INT;
        String str = aVar.f332449b;
        String b = aVar.mo104244b();
        int a = aVar.mo104243a();
        ((C19569f) kpVar.f102866ax.mo6453a()).mo24824b((double) millis, Integer.valueOf(i3), str, b, Integer.valueOf(a), id, Integer.valueOf(i), dVar.name());
        C119205a aVar2 = nVar.f332444m;
        String id2 = dataShareRequest.getLocusId().getId();
        aVar2.f332448a.mo41689d(Build.VERSION.SDK_INT, aVar2.f332449b, aVar2.mo104244b(), aVar2.mo104243a(), id2, i, i2, dVar.name());
        Collection.EL.forEach(nVar.f332442k, new C119191c(dataShareRequest));
        return dVar;
    }
}
