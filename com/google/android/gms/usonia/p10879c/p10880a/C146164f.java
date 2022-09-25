package com.google.android.gms.usonia.p10879c.p10880a;

import com.google.android.gms.tasks.C146006ab;
import com.google.android.gms.tasks.C146014aj;
import com.google.android.gms.tasks.C146020ap;
import com.google.android.gms.tasks.C146021aq;
import com.google.android.gms.usonia.PeerAddress;
import com.google.android.gms.usonia.auth.internal.C146145r;
import com.google.android.gms.usonia.directory.C146207a;
import com.google.android.gms.usonia.metrics.internal.C146293a;
import com.google.android.gms.usonia.metrics.internal.C146298f;
import com.google.android.gms.usonia.p10879c.C146158a;
import com.google.android.gms.usonia.p10879c.C146166b;
import com.google.android.gms.usonia.p10879c.C146167c;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60888db;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.net.ssl.SSLContext;
import p3186j$.util.DesugarCollections;
import p5488io.grpc.C70286co;
import p5488io.grpc.p5525e.C70460dv;
import p5488io.grpc.p5527g.C70835p;
import p5488io.grpc.p5533i.C70866e;

/* renamed from: com.google.android.gms.usonia.c.a.f */
/* compiled from: PG */
public final class C146164f extends C146166b {

    /* renamed from: a */
    public static final C59071e f394931a = C59071e.m91332i("com.google.android.gms.usonia.c.a.f");

    /* renamed from: b */
    public final C146162d f394932b;

    /* renamed from: c */
    private final C146207a f394933c;

    /* renamed from: d */
    private final C146145r f394934d;

    /* renamed from: e */
    private final C146298f f394935e;

    /* renamed from: f */
    private final C60888db f394936f;

    /* renamed from: g */
    private final Map f394937g = DesugarCollections.synchronizedMap(new HashMap());

    /* renamed from: h */
    private C146006ab f394938h = null;

    protected C146164f(C146207a aVar, C146145r rVar, C146298f fVar, C60888db dbVar) {
        this.f394933c = aVar;
        this.f394934d = rVar;
        this.f394932b = new C146162d();
        this.f394935e = fVar;
        this.f394936f = dbVar;
    }

    /* renamed from: f */
    private final synchronized C146006ab m238081f(String str, C146167c cVar, C58833ax axVar) {
        C146006ab abVar;
        C146006ab abVar2;
        C146006ab abVar3;
        C146014aj ajVar;
        if (this.f394932b.mo122729f(str).length == 0) {
            abVar = this.f394933c.mo122750f(str, this.f394932b);
        } else {
            abVar = C146021aq.m237850d((Object) null);
        }
        abVar2 = abVar;
        if (this.f394938h == null) {
            this.f394938h = this.f394934d.mo122631b(this);
        }
        abVar3 = this.f394938h;
        List<C146006ab> asList = Arrays.asList(new C146006ab[]{abVar2, abVar3});
        if (asList != null) {
            if (!asList.isEmpty()) {
                for (C146006ab abVar4 : asList) {
                    if (abVar4 == null) {
                        throw new NullPointerException("null tasks are not accepted");
                    }
                }
                C146014aj ajVar2 = new C146014aj();
                C146020ap apVar = new C146020ap(asList.size(), ajVar2);
                for (C146006ab h : asList) {
                    C146021aq.m237854h(h, apVar);
                }
                ajVar = ajVar2;
            }
        }
        ajVar = C146021aq.m237850d((Object) null);
        return ajVar.mo122482a(this.f394936f, new C146160b(this, abVar2, abVar3, str, cVar, axVar));
    }

    /* renamed from: a */
    public final C146006ab mo122730a(String str, C146167c cVar) {
        return m238081f(str, cVar, C58836b.f156633a);
    }

    /* renamed from: b */
    public final synchronized C146006ab mo122731b(String str, C146167c cVar) {
        C146006ab abVar;
        if (this.f394932b.mo122729f(str).length == 1) {
            abVar = this.f394933c.mo122753i(str, this.f394932b);
        } else {
            abVar = C146021aq.m237850d((Object) null);
        }
        return abVar.mo122484c(this.f394936f, new C146161c(this, str, cVar));
    }

    /* renamed from: c */
    public final C70866e mo122732c(C146158a aVar, PeerAddress peerAddress) {
        if (this.f394934d.mo122697m()) {
            C70286co coVar = (C70286co) this.f394937g.get(peerAddress);
            if (coVar != null) {
                peerAddress.mo122618a();
                coVar.mo61976h();
            } else {
                peerAddress.mo122618a();
                C146145r rVar = this.f394934d;
                synchronized (rVar) {
                    if (!rVar.mo122697m()) {
                        ((C59052c) ((C59052c) C146145r.f394889a.mo56226d()).mo56372aa(42059)).mo56389s("getSSLContext() but credentials are invalid. Timer present? %s", Boolean.valueOf(rVar.f394894d.mo56113h()));
                    }
                }
                SSLContext sSLContext = (SSLContext) rVar.mo122688d().mo122488g();
                long currentTimeMillis = System.currentTimeMillis();
                byte[] bArr = peerAddress.f394831a;
                byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
                InetAddress byAddress = InetAddress.getByAddress(copyOf);
                if (byAddress != null) {
                    C70835p pVar = new C70835p(C70460dv.m102876d(byAddress.getHostAddress(), peerAddress.f394832b));
                    pVar.f188926h = C146159a.f394917a;
                    pVar.f188925g = sSLContext.getSocketFactory();
                    pVar.f188929k = 1;
                    coVar = pVar.f188921c.mo57963c();
                    this.f394935e.mo122861b(C146293a.SERVICE_CLIENT_CHANNEL_CREATE_DELAY, System.currentTimeMillis() - currentTimeMillis);
                    this.f394937g.put(peerAddress, coVar);
                } else {
                    String arrays = Arrays.toString(copyOf);
                    throw new UnknownHostException("[invalid ip: " + arrays + "]");
                }
            }
            return (C70866e) aVar.mo53141a(coVar);
        }
        throw new IllegalStateException("Getting a channel but auth is expired. Call AuthClient::addAuthUser() to keep credentials refreshed.");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo122733d(C146293a aVar, String str, long j) {
        this.f394935e.mo122862c(aVar, str, j);
    }

    /* renamed from: e */
    public final synchronized C146006ab mo122734e() {
        this.f394938h.getClass();
        this.f394938h = null;
        return this.f394934d.mo122691g(this);
    }
}
