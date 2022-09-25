package com.google.android.gms.learning.dynamite;

import android.app.job.JobScheduler;
import com.google.android.gms.learning.C144573b;
import com.google.android.gms.learning.C144827n;
import com.google.android.gms.learning.p10823d.C144588ad;
import com.google.android.gms.learning.p10823d.p10824a.C144583a;
import com.google.android.gms.learning.p10823d.p10824a.C144584b;
import com.google.android.libraries.micore.learning.base.C29711c;
import com.google.android.libraries.micore.learning.base.C29716h;
import com.google.android.libraries.micore.learning.p2258a.C29708r;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.common.base.C58817ah;

/* renamed from: com.google.android.gms.learning.dynamite.l */
/* compiled from: PG */
public final /* synthetic */ class C144626l implements C58817ah {

    /* renamed from: a */
    public static final /* synthetic */ C144626l f391325a = new C144626l();

    private /* synthetic */ C144626l() {
    }

    public final Object apply(Object obj) {
        C29711c cVar = (C29711c) obj;
        C42877ac i = C42878ad.m75739i();
        C42718e a = C42719f.m75461a(cVar.mo34851a());
        C42719f.m75462b("files");
        a.f111967b = "files";
        C42719f.m75463c("brella");
        a.f111968c = "brella";
        a.mo45821b("training_task_store.pb");
        i.mo45968e(a.mo45820a());
        i.mo45967d(C29708r.f80465b);
        return new C144588ad(cVar.mo34851a(), (C144573b) cVar.mo34852c(C144573b.class), (C144827n) cVar.mo34852c(C144827n.class), ((C42880af) cVar.mo34852c(C42880af.class)).mo45979a(i.mo45964a()), (C29716h) cVar.mo34852c(C29716h.class), new C144583a((JobScheduler) cVar.mo34851a().getSystemService("jobscheduler"), new C144584b(cVar.mo34851a(), (C144573b) cVar.mo34852c(C144573b.class), (C144827n) cVar.mo34852c(C144827n.class), (C29716h) cVar.mo34852c(C29716h.class)), (C144827n) cVar.mo34852c(C144827n.class)));
    }
}
