package com.google.android.libraries.performance.primes.metrics.storage;

import android.content.pm.IPackageStatsObserver;
import android.content.pm.PackageStats;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.concurrent.Semaphore;

/* compiled from: PG */
final class PackageStatsCapture {

    /* renamed from: a */
    public static final C59071e f84973a = C59071e.m91332i("com.google.android.libraries.performance.primes.metrics.storage.PackageStatsCapture");

    /* compiled from: PG */
    final class PackageStatsCallback extends IPackageStatsObserver.Stub {

        /* renamed from: a */
        private final Semaphore f84974a = new Semaphore(1);

        /* renamed from: b */
        private volatile PackageStats f84975b;

        private PackageStatsCallback() {
        }

        public void onGetStatsCompleted(PackageStats packageStats, boolean z) {
            if (z) {
                this.f84975b = packageStats;
            } else {
                ((C59052c) ((C59052c) PackageStatsCapture.f84973a.mo56226d()).mo56372aa(50423)).mo56386p("Failure getting PackageStats");
            }
            this.f84974a.release();
        }
    }
}
