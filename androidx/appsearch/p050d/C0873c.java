package androidx.appsearch.p050d;

import android.app.appsearch.AppSearchResult;
import android.app.appsearch.AppSearchSession;
import androidx.appsearch.p048b.C0862a;
import androidx.p104d.p105a.C2170i;
import java.util.concurrent.Executor;
import p3186j$.util.function.Consumer;

/* renamed from: androidx.appsearch.d.c */
/* compiled from: PG */
public final /* synthetic */ class C0873c implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C2170i f2942a;

    /* renamed from: b */
    public final /* synthetic */ C0875e f2943b;

    public /* synthetic */ C0873c(C2170i iVar, C0875e eVar) {
        this.f2942a = iVar;
        this.f2943b = eVar;
    }

    public final void accept(Object obj) {
        C2170i iVar = this.f2942a;
        C0875e eVar = this.f2943b;
        AppSearchResult appSearchResult = (AppSearchResult) obj;
        Executor executor = C0876f.f2948a;
        if (appSearchResult.isSuccess()) {
            iVar.mo5422f(new C0879i((AppSearchSession) appSearchResult.getResultValue(), eVar.f2947c));
        } else {
            iVar.mo5423g(new C0862a(appSearchResult.getResultCode(), appSearchResult.getErrorMessage(), (Throwable) null));
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
