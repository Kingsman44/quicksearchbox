package com.google.android.libraries.search.p2993e;

import com.google.android.libraries.p11012aj.C147596b;
import com.google.android.libraries.p3332u.p3333a.p3337d.C43198a;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.Set;
import java.util.concurrent.Executor;
import p3186j$.util.Collection;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.search.e.c */
/* compiled from: PG */
public final class C38304c {

    /* renamed from: a */
    public static final C58974d f101473a = C58974d.m91136j();

    /* renamed from: b */
    private static final C58528ij f101474b = C58528ij.m90015O("com.google.android.nowdev.TrustedTestService", "com.google.apps.tiktok.experiments.phenotype.ConfigurationUpdatedReceiver_Receiver", "com.google.android.apps.gsa.configuration.PhenotypeBroadcastReceiver", "com.google.android.libraries.phenotype.client.stable.PhenotypeUpdateBackgroundBroadcastReceiver", "com.google.android.libraries.phenotype.registration.PhenotypeMetadataHolderService", "com.google.android.apps.gsa.eventlogger.EventLoggerService", new String[0]);

    /* renamed from: a */
    public static C43198a m67621a(Executor executor) {
        return new C43198a(executor, (Set) Collection.EL.stream(f101474b).map(new C38302a()).collect(C58370cn.f155947b), new C38303b());
    }

    /* renamed from: b */
    static boolean m67622b(C69464a aVar) {
        String b = C147596b.m240671b();
        return b != null && b.endsWith(":search") && ((Boolean) aVar.mo17428b()).booleanValue();
    }
}
