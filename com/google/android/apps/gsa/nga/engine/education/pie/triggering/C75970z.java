package com.google.android.apps.gsa.nga.engine.education.pie.triggering;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.nga.shared.p6407v.p6410c.C82485gy;
import com.google.common.p4526f.p4527a.C58974d;
import p3186j$.time.Instant;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.triggering.z */
/* compiled from: PG */
final class C75970z extends BroadcastReceiver {

    /* renamed from: a */
    final /* synthetic */ C75915aa f210772a;

    public C75970z(C75915aa aaVar) {
        this.f210772a = aaVar;
    }

    public final void onReceive(Context context, Intent intent) {
        boolean z = intent.getBooleanExtra("nav", false) || intent.getBooleanExtra("freenav", false);
        C58974d dVar = C75915aa.f210622a;
        synchronized (this.f210772a) {
            if (z) {
                C75915aa aaVar = this.f210772a;
                C75932ar a = aaVar.f210630i.mo71966a();
                a.mo71964b(Optional.m71637of(this.f210772a.f210626e.mo57444a()));
                aaVar.f210630i = a.mo71963a();
                this.f210772a.f210628g.set(true);
            } else if (this.f210772a.f210628g.getAndSet(false) && this.f210772a.f210630i.mo71968c().isPresent()) {
                Instant instant = (Instant) this.f210772a.f210630i.mo71968c().get();
                C75915aa aaVar2 = this.f210772a;
                aaVar2.f210627f.mo75579d(new C82485gy("PIE_MAPS_SIGNAL_NAVIGATION_LENGTH", Double.valueOf((double) (aaVar2.f210626e.mo57444a().toEpochMilli() - instant.toEpochMilli()))));
                Collection.EL.stream(this.f210772a.f210630i.mo71967b().mo54948A()).filter(new C75968x(this, instant)).forEach(new C75969y(this));
            }
        }
    }
}
