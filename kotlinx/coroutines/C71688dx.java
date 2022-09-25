package kotlinx.coroutines;

import com.evernote.android.state.BuildConfig;
import java.util.concurrent.CancellationException;

/* renamed from: kotlinx.coroutines.dx */
/* compiled from: PG */
public final class C71688dx extends CancellationException implements C71401ah {

    /* renamed from: a */
    public final transient C71643cp f191140a;

    public C71688dx(String str, C71643cp cpVar) {
        super(str);
        this.f191140a = cpVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Throwable mo62763a() {
        String message = getMessage();
        if (message == null) {
            message = BuildConfig.FLAVOR;
        }
        C71688dx dxVar = new C71688dx(message, this.f191140a);
        dxVar.initCause(this);
        return dxVar;
    }
}
