package com.google.android.apps.search.googleapp.discover.channels;

import com.google.android.apps.search.googleapp.discover.p10238u.C134952am;
import com.google.android.libraries.search.logging.p3041d.C39143kr;
import com.google.apps.tiktok.cache.C46407v;
import com.google.apps.tiktok.concurrent.C46463o;
import com.google.apps.tiktok.dataservice.C46689ag;
import com.google.apps.tiktok.dataservice.C46885y;
import com.google.apps.tiktok.tracing.contrib.p3700b.C47633f;
import com.google.common.p4580v.C60950i;
import com.google.common.util.concurrent.C60817ay;
import com.google.common.util.concurrent.C60870cx;
import com.google.p4017at.p4027c.p4028a.p4029a.C53842b;
import com.google.p4017at.p4027c.p4028a.p4029a.C53846f;
import com.google.p4017at.p4027c.p4028a.p4029a.C53847g;
import com.google.p4017at.p4027c.p4028a.p4029a.C53858r;
import com.google.p4017at.p4027c.p4028a.p4029a.C53859s;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;
import p5488io.grpc.C70335df;
import p5488io.grpc.C70337dh;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70761fa;
import p5488io.grpc.C70888j;
import p5488io.grpc.p5531h.p5532a.C70850d;
import p5488io.grpc.p5533i.C70876o;

/* renamed from: com.google.android.apps.search.googleapp.discover.channels.o */
/* compiled from: PG */
final class C134183o implements C46689ag {

    /* renamed from: a */
    static final Duration f365505a = Duration.ofMinutes(5);

    /* renamed from: b */
    public final C60950i f365506b;

    /* renamed from: c */
    public final C134150bl f365507c;

    /* renamed from: d */
    public final C134128aq f365508d;

    /* renamed from: e */
    public final C39143kr f365509e;

    /* renamed from: f */
    private final C46407v f365510f;

    /* renamed from: g */
    private final C53846f f365511g;

    /* renamed from: h */
    private final Executor f365512h;

    /* renamed from: i */
    private final C134952am f365513i;

    public C134183o(C46407v vVar, C53846f fVar, Executor executor, C60950i iVar, C134952am amVar, C134128aq aqVar, C39143kr krVar, C134150bl blVar) {
        this.f365510f = vVar;
        this.f365511g = fVar;
        this.f365512h = executor;
        this.f365506b = iVar;
        this.f365513i = amVar;
        this.f365508d = aqVar;
        this.f365509e = krVar;
        this.f365507c = blVar;
    }

    /* renamed from: a */
    public final C46463o mo18086a() {
        return new C46463o(new C60817ay(C47633f.m84733g(this.f365510f.mo50345e(this.f365507c)).mo51515h(new C134180l(this), this.f365512h)));
    }

    /* renamed from: b */
    public final C60870cx mo18087b() {
        C53846f fVar = (C53846f) this.f365513i.mo112087c(this.f365511g);
        C53858r rVar = (C53858r) C53859s.f141346c.createBuilder();
        String str = this.f365507c.f365439b;
        rVar.copyOnWrite();
        str.getClass();
        ((C53859s) rVar.instance).f141348a = str;
        rVar.copyOnWrite();
        ((C53859s) rVar.instance).f141349b = 2;
        C53859s sVar = (C53859s) rVar.build();
        C70888j jVar = fVar.f189039a;
        C70338di diVar = C53847g.f141331a;
        if (diVar == null) {
            synchronized (C53847g.class) {
                diVar = C53847g.f141331a;
                if (diVar == null) {
                    C70335df d = C70338di.m102603d();
                    d.f187487c = C70337dh.UNARY;
                    d.f187488d = C70338di.m102602c("google.internal.discover.channels.v1.DiscoverChannels", "GetChannel");
                    d.f187489e = true;
                    d.f187485a = C70850d.m103697c(C53859s.f141346c);
                    d.f187486b = C70850d.m103697c(C53842b.f141313k);
                    diVar = d.mo62040a();
                    C53847g.f141331a = diVar;
                }
            }
        }
        return C47633f.m84733g(C70876o.m103760a(jVar.mo39510a(diVar, fVar.f189040b), sVar)).mo51516i(new C134181m(this), this.f365512h).mo51513e(C70761fa.class, new C134182n(this), this.f365512h);
    }

    /* renamed from: c */
    public final /* bridge */ /* synthetic */ Object mo18088c() {
        return new C46885y(this.f365507c.f365439b);
    }
}
