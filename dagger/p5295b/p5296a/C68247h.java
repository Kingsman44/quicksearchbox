package dagger.p5295b.p5296a;

import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import dagger.p5295b.p5297b.C68276c;
import dagger.p5295b.p5297b.C68277d;
import dagger.p5295b.p5297b.C68281h;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: dagger.b.a.h */
/* compiled from: PG */
public abstract class C68247h extends C68246g implements Executor, C60931s {

    /* renamed from: a */
    private final C69464a f184610a;

    /* renamed from: c */
    private final C68277d f184611c;

    /* renamed from: d */
    private final C69464a f184612d;

    /* renamed from: e */
    private volatile C68276c f184613e = null;

    protected C68247h(C69464a aVar, C68277d dVar, C69464a aVar2) {
        this.f184610a = aVar;
        this.f184611c = dVar;
        this.f184612d = aVar2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C60870cx mo20481a(Object obj);

    @Deprecated
    public final C60870cx apply(Object obj) {
        this.f184613e.mo51660e();
        try {
            return mo20481a(obj);
        } finally {
            this.f184613e.mo51659d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C60870cx mo20482b();

    @Deprecated
    public final void execute(Runnable runnable) {
        this.f184613e.mo54580f();
        ((Executor) this.f184612d.mo17428b()).execute(runnable);
    }

    /* access modifiers changed from: protected */
    /* renamed from: gp */
    public final C60870cx mo60301gp() {
        this.f184613e = ((C68281h) this.f184610a.mo17428b()).mo51661a(this.f184611c);
        this.f184613e.mo51658b();
        C60870cx h = C60922j.m93045h(mo20482b(), this, this);
        this.f184613e.mo60311g(h);
        return h;
    }
}
