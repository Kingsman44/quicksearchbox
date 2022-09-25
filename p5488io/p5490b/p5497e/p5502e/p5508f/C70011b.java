package p5488io.p5490b.p5497e.p5502e.p5508f;

import com.google.android.libraries.search.rendering.xuikit.p3144e.C40490h;
import com.google.android.libraries.search.rendering.xuikit.p3144e.C40493k;
import com.google.android.libraries.search.rendering.xuikit.p3144e.C40495m;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4648g.p4650b.C61641d;
import java.util.concurrent.Executor;
import p5488io.p5490b.C70129u;
import p5488io.p5490b.C70130v;
import p5488io.p5490b.p5495c.C69813f;
import p5488io.p5490b.p5497e.p5498a.C69825a;
import p5488io.p5490b.p5497e.p5498a.C69828d;

/* renamed from: io.b.e.e.f.b */
/* compiled from: PG */
public final class C70011b extends C70129u {

    /* renamed from: a */
    final C40493k f186630a;

    public C70011b(C40493k kVar) {
        this.f186630a = kVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo61519p(C70130v vVar) {
        Executor executor;
        C70010a aVar = new C70010a(vVar);
        vVar.mo61460lO(aVar);
        try {
            C40493k kVar = this.f186630a;
            C61641d dVar = kVar.f106255a;
            executor = kVar.f106256b;
            C60870cx cxVar = (C60870cx) dVar.get();
            cxVar.getClass();
            C69828d.m101311h(aVar, new C69825a(new C40490h(cxVar)));
            C60856cj.m92911t(cxVar, C47810es.m84974n(new C40495m(aVar)), executor);
        } catch (Throwable th) {
            C69813f.m101292a(th);
            aVar.mo61578a(th);
        }
    }
}
