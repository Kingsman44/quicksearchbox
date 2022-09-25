package androidx.appsearch.p050d.p052b;

import android.app.appsearch.AppSearchBatchResult;
import android.app.appsearch.AppSearchResult;
import android.app.appsearch.BatchResultCallback;
import androidx.appsearch.p047a.C0827a;
import androidx.appsearch.p047a.C0837b;
import androidx.appsearch.p047a.C0838c;
import androidx.p104d.p105a.C2170i;
import java.util.Map;
import p3186j$.util.function.Function;

/* renamed from: androidx.appsearch.d.b.a */
/* compiled from: PG */
public final class C0872a implements BatchResultCallback {

    /* renamed from: a */
    private final C2170i f2940a;

    /* renamed from: b */
    private final Function f2941b;

    public C0872a(C2170i iVar, Function function) {
        this.f2940a = iVar;
        function.getClass();
        this.f2941b = function;
    }

    public final void onResult(AppSearchBatchResult appSearchBatchResult) {
        Function function = this.f2941b;
        appSearchBatchResult.getClass();
        C0827a aVar = new C0827a();
        for (Map.Entry entry : appSearchBatchResult.getSuccesses().entrySet()) {
            try {
                Object apply = function.apply(entry.getValue());
                Object key = entry.getKey();
                key.getClass();
                aVar.mo3371a();
                aVar.mo3372b(key, C0838c.m2689a(apply));
            } catch (Throwable th) {
                aVar.mo3372b(entry.getKey(), C0838c.m2690b(th));
            }
        }
        for (Map.Entry entry2 : appSearchBatchResult.getFailures().entrySet()) {
            Object key2 = entry2.getKey();
            int resultCode = ((AppSearchResult) entry2.getValue()).getResultCode();
            String errorMessage = ((AppSearchResult) entry2.getValue()).getErrorMessage();
            key2.getClass();
            aVar.mo3371a();
            aVar.mo3372b(key2, new C0838c(resultCode, (Object) null, errorMessage));
        }
        aVar.f2787d = true;
        this.f2940a.mo5422f(new C0837b(aVar.f2784a, aVar.f2785b, aVar.f2786c));
    }

    public final void onSystemError(Throwable th) {
        this.f2940a.mo5423g(th);
    }
}
