package androidx.work;

import android.content.Context;
import androidx.work.impl.utils.p209a.C4579m;
import com.google.common.util.concurrent.C60870cx;
import kotlinx.coroutines.C71414ao;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71423ax;
import kotlinx.coroutines.C71424ay;
import kotlinx.coroutines.C71613bn;
import kotlinx.coroutines.C71643cp;
import kotlinx.coroutines.C71646cs;
import kotlinx.coroutines.C71803m;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.C69585o;
import p5462h.p5473f.p5475b.C69664n;

/* compiled from: PG */
public abstract class CoroutineWorker extends C4378ab {

    /* renamed from: a */
    public final C4579m f13983a;

    /* renamed from: b */
    public final C71646cs f13984b = new C71646cs((C71643cp) null);

    /* renamed from: g */
    private final C71414ao f13985g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        C69664n.m101061g(context, "appContext");
        C69664n.m101061g(workerParameters, "params");
        C4579m mVar = new C4579m();
        this.f13983a = mVar;
        mVar.mo4106b(new C4413i(this), this.f14000d.f13995h.f14486a);
        this.f13985g = C71613bn.f191047a;
    }

    /* renamed from: a */
    public final C60870cx mo9296a() {
        C71646cs csVar = new C71646cs((C71643cp) null);
        C71422aw b = C71423ax.m104197b(this.f13985g.plus(csVar));
        C4642w wVar = new C4642w(csVar, new C4579m());
        C71803m.m105043d(b, (C69585o) null, (C71424ay) null, new C4629j(wVar, this, (C69577g) null), 3);
        return wVar;
    }

    /* renamed from: b */
    public final C60870cx mo9297b() {
        C71803m.m105043d(C71423ax.m104197b(this.f13985g.plus(this.f13984b)), (C69585o) null, (C71424ay) null, new C4630k(this, (C69577g) null), 3);
        return this.f13983a;
    }

    /* renamed from: c */
    public abstract Object mo9298c(C69577g gVar);

    /* renamed from: d */
    public final void mo9299d() {
        this.f13983a.cancel(false);
    }
}
