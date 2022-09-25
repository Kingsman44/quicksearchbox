package androidx.slice;

import android.app.slice.SliceManager;
import android.content.Context;
import androidx.slice.widget.C4134al;
import java.util.concurrent.Executor;

/* renamed from: androidx.slice.p */
/* compiled from: PG */
final class C4117p implements Runnable {

    /* renamed from: a */
    final /* synthetic */ C4119r f13153a;

    public C4117p(C4119r rVar) {
        this.f13153a = rVar;
    }

    public final void run() {
        this.f13153a.mo8636b();
        C4119r rVar = this.f13153a;
        Context context = rVar.f13160f.f13162a;
        Slice a = C4107f.m11767a(C4105d.m11765a((SliceManager) C4104c.m11764a(context, SliceManager.class), rVar.f13155a, C4107f.m11768b(C4134al.f13281c)), context);
        Executor executor = this.f13153a.f13156b;
        ((C4115n) executor).f13150a.post(new C4116o(this, a));
    }
}
