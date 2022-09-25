package androidx.appsearch.p050d;

import android.app.appsearch.GlobalSearchSession;
import android.app.appsearch.exceptions.AppSearchException;
import android.app.appsearch.observer.ObserverCallback;
import android.app.appsearch.observer.ObserverSpec;
import androidx.appsearch.p047a.C0859x;
import androidx.appsearch.p048b.C0862a;
import androidx.appsearch.p049c.C0866c;
import androidx.core.p094f.C1888a;
import androidx.p060c.C0977g;
import androidx.p060c.C0979i;
import com.google.android.libraries.search.assistant.p2828y.p2838g.p2840b.C36926i;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.Executor;

/* renamed from: androidx.appsearch.d.b */
/* compiled from: PG */
final class C0871b implements C0859x {

    /* renamed from: a */
    private final GlobalSearchSession f2938a;

    /* renamed from: b */
    private final Map f2939b = new C0977g();

    public C0871b(GlobalSearchSession globalSearchSession) {
        globalSearchSession.getClass();
        this.f2938a = globalSearchSession;
    }

    public final void close() {
        this.f2938a.close();
    }

    /* renamed from: b */
    public final void mo3458b(C36926i iVar) {
        iVar.getClass();
        if (C1888a.m5150d()) {
            synchronized (this.f2939b) {
                ObserverCallback observerCallback = (ObserverCallback) this.f2939b.get(iVar);
                if (observerCallback != null) {
                    try {
                        this.f2938a.unregisterObserverCallback("com.google.android.deskclock", observerCallback);
                        this.f2939b.remove(iVar);
                    } catch (AppSearchException e) {
                        throw new C0862a(e.getResultCode(), e.getMessage(), e.getCause());
                    }
                }
            }
        } else {
            throw new UnsupportedOperationException("GLOBAL_SEARCH_SESSION_REGISTER_OBSERVER_CALLBACK is not supported on this AppSearch implementation");
        }
    }

    /* renamed from: a */
    public final void mo3457a(C0866c cVar, Executor executor, C36926i iVar) {
        executor.getClass();
        iVar.getClass();
        if (C1888a.m5150d()) {
            synchronized (this.f2939b) {
                C0868a aVar = (ObserverCallback) this.f2939b.get(iVar);
                if (aVar == null) {
                    aVar = new C0868a(iVar);
                }
                try {
                    GlobalSearchSession globalSearchSession = this.f2938a;
                    ObserverSpec.Builder builder = new ObserverSpec.Builder();
                    if (cVar.f2932b == null) {
                        ArrayList<String> stringArrayList = cVar.f2931a.getStringArrayList("filterSchema");
                        if (stringArrayList == null) {
                            cVar.f2932b = Collections.emptySet();
                        } else {
                            cVar.f2932b = Collections.unmodifiableSet(new C0979i((Collection) stringArrayList));
                        }
                    }
                    globalSearchSession.registerObserverCallback("com.google.android.deskclock", builder.addFilterSchemas(cVar.f2932b).build(), executor, aVar);
                    this.f2939b.put(iVar, aVar);
                } catch (AppSearchException e) {
                    throw new C0862a(e.getResultCode(), e.getMessage(), e.getCause());
                }
            }
            return;
        }
        throw new UnsupportedOperationException("GLOBAL_SEARCH_SESSION_REGISTER_OBSERVER_CALLBACK is not supported on this AppSearch implementation");
    }
}
