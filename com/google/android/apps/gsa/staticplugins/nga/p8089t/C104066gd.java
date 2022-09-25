package com.google.android.apps.gsa.staticplugins.nga.p8089t;

import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.apps.gsa.tasks.C118476ak;
import com.google.android.apps.gsa.tasks.C118549h;
import com.google.android.apps.search.assistant.platform.ondevice.datadownload.p9271b.p9272a.C122191l;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.mdi.download.C28806cu;
import com.google.android.libraries.mdi.download.C28807cv;
import com.google.android.libraries.mdi.download.C29409fd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.t.gd */
/* compiled from: PG */
public final class C104066gd implements C118549h {

    /* renamed from: a */
    public final C22871g f289543a;

    /* renamed from: b */
    public final C122191l f289544b;

    /* renamed from: c */
    private final C29409fd f289545c;

    /* renamed from: d */
    private final C103943bp f289546d;

    public C104066gd(C29409fd fdVar, C103943bp bpVar, C22871g gVar, C122191l lVar) {
        this.f289545c = fdVar;
        this.f289546d = bpVar;
        this.f289543a = gVar;
        this.f289544b = lVar;
    }

    /* renamed from: a */
    public final C60870cx mo65234a(C118476ak akVar) {
        C22871g gVar = this.f289543a;
        C60870cx c = this.f289546d.mo93890c();
        C29409fd fdVar = this.f289545c;
        C28806cu h = C28807cv.m53759h();
        h.mo34460d(true);
        C60870cx g = fdVar.mo34718g(h.mo34462f());
        return C118826c.m197213c(gVar.mo28210j(C60856cj.m92895d(c, g).mo57334a(new C104059fx(c, g), new C104060fy(this)), "[NGA] NgaSotConfigsCleanupTask.callDeletion", new C104065gc(this)));
    }
}
