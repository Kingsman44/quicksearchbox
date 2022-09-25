package com.google.android.apps.gsa.staticplugins.nga.education.pie.p8059d;

import com.google.android.apps.gsa.nga.shared.p6407v.C83305i;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82486gz;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82716pm;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82717pn;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.util.concurrent.C60845bz;
import java.util.UUID;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.education.pie.d.i */
/* compiled from: PG */
final class C103107i implements C60845bz {

    /* renamed from: a */
    final /* synthetic */ C103108j f287751a;

    public C103107i(C103108j jVar) {
        this.f287751a = jVar;
    }

    /* renamed from: gl */
    public final void mo17910gl(Throwable th) {
        ((C58970a) ((C58970a) ((C58970a) C103108j.f287752a.mo56226d()).mo56382g(th)).mo56372aa(21474)).mo56386p("[NGA Pie] Failed to enqueue Pie Triggering worker");
        C83305i iVar = this.f287751a.f287753b;
        C82716pm c = C82717pn.m132233c();
        ((C82486gz) c).f225387b = "SUCCESSFULLY_ENQUEUED_TRIGGERING_WORKER";
        iVar.mo75579d(c.mo76438a());
    }

    /* renamed from: gm */
    public final /* synthetic */ void mo17911gm(Object obj) {
        UUID uuid = (UUID) obj;
        C83305i iVar = this.f287751a.f287753b;
        C82716pm c = C82717pn.m132233c();
        ((C82486gz) c).f225387b = "SUCCESSFULLY_ENQUEUED_TRIGGERING_WORKER";
        iVar.mo75579d(c.mo76438a());
    }
}
