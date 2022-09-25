package com.google.android.apps.search.podcasts.p10550b.p10551a;

import com.google.android.libraries.storage.p3315b.C42827am;
import com.google.android.libraries.storage.p3315b.C42828an;
import com.google.android.libraries.storage.p3315b.C42829ao;
import com.google.android.libraries.storage.p3315b.C42835au;
import com.google.android.libraries.storage.p3315b.C42837aw;
import com.google.android.libraries.storage.p3315b.C42838ax;

/* renamed from: com.google.android.apps.search.podcasts.b.a.r */
/* compiled from: PG */
public final class C140005r {

    /* renamed from: a */
    public static final C42837aw f380528a;

    /* renamed from: b */
    public static final C42835au f380529b;

    static {
        C42838ax axVar = new C42838ax("show_metadata");
        axVar.f112125a.append("\n        feed_url NOT IN\n        (SELECT DISTINCT feed_url FROM episode_metadata)\n      ");
        f380528a = axVar.mo45919a();
        C42827am amVar = new C42827am();
        amVar.f112108a.mo55395g(C140004q.f380527a);
        C42829ao aoVar = new C42829ao();
        C42828an.m75678a("synchronous = 0", aoVar);
        amVar.f112110c = aoVar;
        f380529b = amVar.mo45914a();
    }
}
