package dagger.p5295b.p5296a;

import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: dagger.b.a.g */
/* compiled from: PG */
public abstract class C68246g implements C68248i {

    /* renamed from: a */
    private final AtomicBoolean f184608a = new AtomicBoolean();

    /* renamed from: b */
    public final C68245f f184609b = new C68245f();

    protected C68246g() {
    }

    /* renamed from: c */
    public C68283d mo60298c(C68249j jVar) {
        C68244e eVar = new C68244e(this);
        eVar.f184606a.mo4106b(new C68243d(eVar, jVar), C60826bg.f164896a);
        return eVar;
    }

    /* renamed from: d */
    public final void mo60299d(boolean z) {
        this.f184608a.set(true);
        this.f184609b.mo60305e(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: gp */
    public abstract C60870cx mo60301gp();

    /* renamed from: gq */
    public final C60870cx mo60297gq() {
        if (this.f184608a.compareAndSet(false, true)) {
            this.f184609b.mo57358p(mo60301gp());
        }
        return this.f184609b;
    }

    /* renamed from: gr */
    public C68283d mo60300gr() {
        return new C68244e(this);
    }
}
