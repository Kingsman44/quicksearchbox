package com.google.android.libraries.storage.protostore;

import com.google.apps.tiktok.concurrent.C46423aj;
import com.google.apps.tiktok.tracing.C47522ah;
import com.google.apps.tiktok.tracing.C47523ai;
import com.google.apps.tiktok.tracing.C47524aj;
import com.google.apps.tiktok.tracing.C47558bi;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58817ah;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60836bq;
import com.google.common.util.concurrent.C60850cd;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.storage.protostore.eg */
/* compiled from: PG */
public class C43000eg {

    /* renamed from: a */
    public final String f112449a;

    /* renamed from: b */
    public final C43001eh f112450b;

    /* renamed from: c */
    public final C46423aj f112451c;

    /* renamed from: d */
    public final Object f112452d = new Object();

    /* renamed from: e */
    public final C47524aj f112453e;

    /* renamed from: f */
    public List f112454f = new ArrayList();

    /* renamed from: g */
    private final C60870cx f112455g;

    /* renamed from: h */
    private final C60836bq f112456h;

    /* renamed from: i */
    private final C46423aj f112457i = new C46423aj(new C42997ed(this), C60826bg.f164896a);

    public C43000eg(C43001eh ehVar, C60870cx cxVar, boolean z) {
        this.f112450b = ehVar;
        this.f112455g = cxVar;
        this.f112449a = ehVar.mo45989e();
        this.f112451c = new C46423aj(ehVar.mo45986a(), C60826bg.f164896a);
        this.f112456h = new C60836bq();
        if (z) {
            this.f112453e = new C47523ai();
        } else {
            this.f112453e = new C47522ah();
        }
        mo46041c(new C42990dz(this));
    }

    /* renamed from: a */
    public final C60870cx mo46039a(C58817ah ahVar, Executor executor) {
        return mo46040b(C47810es.m84966f(new C42994ea(ahVar)), executor);
    }

    /* renamed from: b */
    public final C60870cx mo46040b(C60931s sVar, Executor executor) {
        C47558bi b = this.f112453e.mo51389b("Update ".concat(String.valueOf(this.f112449a)));
        try {
            C60870cx b2 = this.f112457i.mo50395b();
            this.f112456h.mo57305b(new C42988dx(b2), C60826bg.f164896a);
            C60870cx b3 = this.f112456h.mo57305b(C47810es.m84965e(new C42989dy(this, b2, sVar, executor)), C60826bg.f164896a);
            b3.getClass();
            if (!b2.isDone()) {
                if (b3.isDone()) {
                    C60856cj.m92912u(b3, b2);
                } else {
                    C60850cd cdVar = new C60850cd(b3, b2);
                    b3.mo4106b(cdVar, C60826bg.f164896a);
                    b2.mo4106b(cdVar, C60826bg.f164896a);
                }
            }
            C60856cj.m92901j(this.f112455g);
            b.mo51417a(b3);
            if (b != null) {
                b.close();
            }
            return b3;
        } catch (Throwable th) {
            C42986dv.m75883a(th, th);
        }
        throw th;
    }

    /* renamed from: c */
    public final void mo46041c(C60931s sVar) {
        synchronized (this.f112452d) {
            this.f112454f.add(sVar);
        }
    }

    /* renamed from: d */
    public final C60870cx mo46042d() {
        C60870cx cxVar;
        this.f112453e.mo51388a();
        if (this.f112457i.f121487d.isDone()) {
            cxVar = this.f112450b.mo45990f((C42954cv) null);
        } else {
            C47558bi b = this.f112453e.mo51389b("Get ".concat(String.valueOf(this.f112449a)));
            try {
                C60870cx h = C60922j.m93045h(this.f112457i.mo50395b(), C47810es.m84966f(new C42987dw(this)), C60826bg.f164896a);
                b.mo51417a(h);
                if (b != null) {
                    b.close();
                }
                cxVar = h;
            } catch (Throwable th) {
                C42986dv.m75883a(th, th);
            }
        }
        C60856cj.m92901j(this.f112455g);
        return C60856cj.m92901j(cxVar);
        throw th;
    }
}
