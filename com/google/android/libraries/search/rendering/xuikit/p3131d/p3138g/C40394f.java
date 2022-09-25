package com.google.android.libraries.search.rendering.xuikit.p3131d.p3138g;

import com.google.common.base.C58833ax;
import dagger.p5294a.C68220f;
import dagger.p5294a.C68225k;
import java.util.concurrent.ExecutorService;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71633cf;
import kotlinx.coroutines.C71683ds;
import p5460g.p5461a.C69464a;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.d.g.f */
/* compiled from: PG */
public final class C40394f implements C68220f {
    /* renamed from: a */
    public static C71422aw m70078a(C58833ax axVar, C69464a aVar) {
        C69664n.m101061g(aVar, "executorProvider");
        Object b = aVar.mo17428b();
        C69664n.m101060f(b, "executorProvider.get()");
        Object e = axVar.mo56109e(C71423ax.m104197b(C71633cf.m104609a((ExecutorService) b).plus(new C71683ds())));
        C69664n.m101060f(e, "defaultCoroutineScope.or… SupervisorJob())\n      )");
        C71422aw awVar = (C71422aw) e;
        C68225k.m98532d(awVar);
        return awVar;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo17428b() {
        throw null;
    }
}
