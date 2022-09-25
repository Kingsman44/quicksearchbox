package com.google.frameworks.client.data.android.server;

import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.HashMap;
import java.util.Map;
import p3186j$.util.concurrent.ConcurrentHashMap;
import p5460g.p5461a.C69464a;
import p5488io.grpc.C70173bh;
import p5488io.grpc.C70298d;
import p5488io.grpc.C70338di;
import p5488io.grpc.C70705ej;
import p5488io.grpc.C70709en;
import p5488io.grpc.C70710eo;
import p5488io.grpc.C70711ep;
import p5488io.grpc.C70716eu;

/* renamed from: com.google.frameworks.client.data.android.server.l */
/* compiled from: PG */
public final class C61564l extends C70173bh {

    /* renamed from: a */
    private static final C59071e f166395a = C59071e.m91332i("com.google.frameworks.client.data.android.server.l");

    /* renamed from: b */
    private static final C70709en f166396b = new C70709en((C70338di) null, (C70705ej) null);

    /* renamed from: c */
    private static final C70711ep f166397c = C70710eo.m103393a("not_found", (C70716eu) null, new HashMap());

    /* renamed from: d */
    private final Map f166398d;

    /* renamed from: e */
    private final Object f166399e = new Object();

    /* renamed from: f */
    private final Map f166400f = new HashMap();

    /* renamed from: g */
    private final Map f166401g = new HashMap();

    /* renamed from: h */
    private final ConcurrentHashMap f166402h = new ConcurrentHashMap();

    public C61564l(Map map) {
        this.f166398d = map;
    }

    /* renamed from: a */
    public final C70709en mo58124a(String str) {
        int indexOf;
        C70709en enVar = (C70709en) this.f166402h.get(str);
        if (enVar == null && (indexOf = str.indexOf(47)) > 0) {
            String substring = str.substring(0, indexOf);
            synchronized (this.f166399e) {
                C70711ep epVar = (C70711ep) this.f166401g.get(substring);
                if (epVar == null) {
                    C69464a aVar = (C69464a) this.f166398d.get(substring);
                    if (aVar != null) {
                        C70298d dVar = (C70298d) aVar.mo17428b();
                        this.f166400f.put(substring, dVar.getClass());
                        epVar = dVar.mo17222gs();
                        if (epVar == null) {
                            ((C59052c) ((C59052c) f166395a.mo56226d()).mo56372aa(54892)).mo56389s("No subsystem created for service %s.", substring);
                            epVar = f166397c;
                        }
                    } else {
                        ((C59052c) ((C59052c) f166395a.mo56226d()).mo56372aa(54891)).mo56389s("No factory available for service %s.", substring);
                        epVar = f166397c;
                    }
                    this.f166401g.put(substring, epVar);
                }
                enVar = epVar != f166397c ? (C70709en) epVar.f188453b.get(str) : null;
                if (enVar == null) {
                    enVar = f166396b;
                }
                this.f166402h.put(str, enVar);
            }
        }
        if (enVar == f166396b) {
            return null;
        }
        return enVar;
    }
}
