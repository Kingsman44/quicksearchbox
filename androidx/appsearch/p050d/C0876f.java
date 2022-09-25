package androidx.appsearch.p050d;

import android.app.appsearch.AppSearchManager;
import androidx.p104d.p105a.C2170i;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import p3186j$.util.function.Consumer;

/* renamed from: androidx.appsearch.d.f */
/* compiled from: PG */
public final class C0876f {

    /* renamed from: a */
    public static final Executor f2948a = Executors.newCachedThreadPool();

    /* renamed from: a */
    public static C60870cx m2759a(C0875e eVar) {
        C2170i iVar = new C2170i();
        ((AppSearchManager) eVar.f2945a.getSystemService(AppSearchManager.class)).createSearchSession(new AppSearchManager.SearchContext.Builder(eVar.f2946b).build(), eVar.f2947c, Consumer.Wrapper.convert(new C0873c(iVar, eVar)));
        return iVar;
    }
}
