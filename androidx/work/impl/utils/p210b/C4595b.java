package androidx.work.impl.utils.p210b;

import android.os.Handler;
import android.os.Looper;
import androidx.work.impl.utils.C4615v;
import java.util.concurrent.Executor;

/* renamed from: androidx.work.impl.utils.b.b */
/* compiled from: PG */
public final class C4595b {

    /* renamed from: a */
    public final C4615v f14486a;

    /* renamed from: b */
    final Handler f14487b = new Handler(Looper.getMainLooper());

    /* renamed from: c */
    public final Executor f14488c = new C4594a(this);

    public C4595b(Executor executor) {
        this.f14486a = new C4615v(executor);
    }
}
