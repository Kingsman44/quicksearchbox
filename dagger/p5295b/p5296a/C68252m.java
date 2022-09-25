package dagger.p5295b.p5296a;

import com.google.common.p4522b.C58598kz;
import com.google.common.p4522b.C58615lp;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60870cx;
import dagger.p5295b.C68283d;
import java.util.Collections;
import java.util.Set;

/* renamed from: dagger.b.a.m */
/* compiled from: PG */
final class C68252m implements C68283d {

    /* renamed from: a */
    public final Set f184618a;

    /* renamed from: b */
    final /* synthetic */ C68249j f184619b;

    /* renamed from: c */
    final /* synthetic */ C68253n f184620c;

    public C68252m(C68253n nVar, C68249j jVar) {
        this.f184620c = nVar;
        this.f184619b = jVar;
        C58598kz kzVar = new C58598kz();
        kzVar.mo55627f(C58615lp.WEAK);
        this.f184618a = Collections.newSetFromMap(kzVar.mo55626e());
    }

    /* renamed from: gq */
    public final C60870cx mo60297gq() {
        C60870cx gq = this.f184620c.mo60297gq();
        if (!gq.isDone() && this.f184618a.add(gq)) {
            gq.mo4106b(new C68251l(this, gq), C60826bg.f164896a);
        }
        return gq;
    }
}
