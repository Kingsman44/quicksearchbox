package com.google.android.apps.search.googleapp.discover.p10238u;

import com.google.apps.tiktok.concurrent.C46459k;
import com.google.frameworks.client.data.android.p4641h.C61467a;
import com.google.frameworks.client.data.android.p4641h.C61479al;
import com.google.frameworks.client.data.android.p4641h.C61480am;
import com.google.frameworks.client.data.android.p4641h.C61481b;
import com.google.frameworks.client.data.android.p4641h.C61483d;
import com.google.frameworks.client.data.android.p4641h.C61485f;
import com.google.p4283bv.p4354e.p4356b.p4365c.p4366a.C57259bn;
import p5462h.p5473f.p5475b.C69664n;
import p5488io.grpc.C70338di;
import p5488io.grpc.Status;

/* renamed from: com.google.android.apps.search.googleapp.discover.u.cd */
/* compiled from: PG */
public final class C135002cd implements C61485f {

    /* renamed from: a */
    private final C135011cm f367596a;

    /* renamed from: b */
    private final C57259bn f367597b;

    /* renamed from: c */
    private String f367598c;

    /* renamed from: d */
    private String f367599d;

    public C135002cd(C135011cm cmVar, C57259bn bnVar) {
        this.f367596a = cmVar;
        this.f367597b = bnVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C61479al mo39483a(C61481b bVar) {
        return C61479al.f166225a;
    }

    /* renamed from: b */
    public final C61479al mo39484b(C61481b bVar) {
        C70338di diVar = bVar.f166237c;
        String str = diVar.f187498c;
        if (str == null) {
            str = "Unknown";
        }
        this.f367598c = str;
        String b = C70338di.m102601b(diVar.f187497b);
        if (b == null) {
            b = diVar.f187497b;
        }
        this.f367599d = b;
        return C61479al.f166225a;
    }

    /* renamed from: c */
    public final C61480am mo39485c(C61467a aVar) {
        String str;
        String str2;
        C135011cm cmVar = this.f367596a;
        C57259bn bnVar = this.f367597b;
        String str3 = this.f367598c;
        if (str3 == null) {
            C69664n.m101065k("serviceName");
            str = null;
        } else {
            str = str3;
        }
        String str4 = this.f367599d;
        if (str4 == null) {
            C69664n.m101065k("methodName");
            str2 = null;
        } else {
            str2 = str4;
        }
        Status status = aVar.f166174a;
        C69664n.m101061g(str, "serviceName");
        C69664n.m101061g(str2, "methodName");
        C46459k.m82829b(cmVar.f367642b.mo46039a(new C135009ck(cmVar, str, str2, bnVar, status), cmVar.f367643c), "Failed to add request to GrpcClient debuggable", new Object[0]);
        return C61480am.f166232a;
    }

    /* renamed from: d */
    public final /* synthetic */ C61480am mo39486d(C61483d dVar) {
        return C61480am.f166232a;
    }

    /* renamed from: e */
    public final /* synthetic */ C61479al mo39487e() {
        return C61479al.f166225a;
    }

    /* renamed from: f */
    public final /* synthetic */ C61479al mo39488f() {
        return C61479al.f166225a;
    }

    /* renamed from: g */
    public final /* synthetic */ C61480am mo39489g() {
        return C61480am.f166232a;
    }
}
