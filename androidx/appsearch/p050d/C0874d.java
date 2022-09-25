package androidx.appsearch.p050d;

import android.app.appsearch.AppSearchResult;
import android.app.appsearch.GlobalSearchSession;
import androidx.appsearch.p048b.C0862a;
import androidx.p104d.p105a.C2170i;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;

/* renamed from: androidx.appsearch.d.d */
/* compiled from: PG */
public final /* synthetic */ class C0874d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C2170i f2944a;

    public /* synthetic */ C0874d(C2170i iVar) {
        this.f2944a = iVar;
    }

    public final void accept(Object obj) {
        C2170i iVar = this.f2944a;
        AppSearchResult appSearchResult = (AppSearchResult) obj;
        Executor executor = C0876f.f2948a;
        if (appSearchResult.isSuccess()) {
            iVar.mo5422f(new C0871b((GlobalSearchSession) appSearchResult.getResultValue()));
        } else {
            iVar.mo5423g(new C0862a(appSearchResult.getResultCode(), appSearchResult.getErrorMessage(), (Throwable) null));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
