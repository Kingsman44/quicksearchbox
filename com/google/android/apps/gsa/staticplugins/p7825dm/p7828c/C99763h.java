package com.google.android.apps.gsa.staticplugins.p7825dm.p7828c;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.google.android.apps.gsa.search.core.google.gaia.p6800c.p6801a.C86034c;
import com.google.android.apps.gsa.search.core.p6500ac.C84410n;
import com.google.android.apps.gsa.search.core.p6500ac.C84411o;
import com.google.android.apps.gsa.search.shared.p6929g.C87556d;
import com.google.android.apps.gsa.shared.p7030bj.C89688a;
import com.google.android.apps.gsa.shared.util.p7159c.p7160a.C90851k;
import com.google.android.apps.search.googleapp.discover.channels.p10180a.C134109e;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.util.concurrent.C60845bz;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4301f.C56686b;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4301f.C56690f;
import com.google.p4283bv.p4287b.p4288a.p4289a.p4301f.C56692h;
import com.google.protobuf.C62974ct;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.apps.gsa.staticplugins.dm.c.h */
/* compiled from: PG */
public final class C99763h {

    /* renamed from: a */
    public final Context f279145a;

    /* renamed from: b */
    private final C89688a f279146b;

    /* renamed from: c */
    private final C84411o f279147c;

    /* renamed from: d */
    private final C86034c f279148d;

    /* renamed from: e */
    private final Executor f279149e;

    /* renamed from: f */
    private final Executor f279150f;

    /* renamed from: com.google.android.apps.gsa.staticplugins.dm.c.h$a */
    /* compiled from: PG */
    interface C99764a {
        /* renamed from: nP */
        C134109e mo91589nP();
    }

    public C99763h(C89688a aVar, Context context, C84411o oVar, C86034c cVar, C90851k kVar) {
        this.f279146b = aVar;
        this.f279145a = context;
        this.f279147c = oVar;
        this.f279148d = cVar;
        this.f279149e = kVar.mo85210c("TngSilkThreadInvocation");
        this.f279150f = kVar.mo85211d("ChannelActivityUiThreadOpening");
    }

    @JavascriptInterface
    public void getChannelFollowState(String str, String str2, String str3) {
        C84410n a = this.f279147c.mo77963a(str2, str3, this.f279146b);
        try {
            C47633f i = C47633f.m84733g(this.f279148d.mo79697b()).mo51516i(new C99757b(this, (C56686b) C87556d.m142212a(str, C56686b.f151306b.getParserForType())), this.f279150f);
            C60845bz n = C47810es.m84974n(new C99761f(a));
            C60856cj.m92911t(i.f164926b, C47810es.m84974n(n), this.f279149e);
        } catch (C62974ct e) {
            a.mo77959a(e);
        }
    }

    @JavascriptInterface
    public void openChannel(String str, String str2, String str3) {
        C84410n a = this.f279147c.mo77963a(str2, str3, this.f279146b);
        try {
            C47633f i = C47633f.m84733g(this.f279148d.mo79697b()).mo51516i(new C99759d(this, (C56690f) C87556d.m142212a(str, C56690f.f151315f.getParserForType())), this.f279150f);
            C60845bz n = C47810es.m84974n(new C99760e(a));
            C60856cj.m92911t(i.f164926b, C47810es.m84974n(n), this.f279149e);
        } catch (C62974ct e) {
            a.mo77959a(e);
        }
    }

    @JavascriptInterface
    public void setChannelFollowState(String str, String str2, String str3) {
        C84410n a = this.f279147c.mo77963a(str2, str3, this.f279146b);
        try {
            C47633f i = C47633f.m84733g(this.f279148d.mo79697b()).mo51516i(new C99758c(this, (C56692h) C87556d.m142212a(str, C56692h.f151323c.getParserForType())), this.f279150f);
            C60845bz n = C47810es.m84974n(new C99762g(a));
            C60856cj.m92911t(i.f164926b, C47810es.m84974n(n), this.f279149e);
        } catch (C62974ct e) {
            a.mo77959a(e);
        }
    }
}
