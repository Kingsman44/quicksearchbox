package com.google.assistant.p3897e.p3910e.p3911a;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.assist.C9404ci;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52081en;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.p4152bb.p4153a.C55349pb;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4985f.p5042u.C65354p;
import com.google.research.xeno.effect.C66412o;

/* renamed from: com.google.assistant.e.e.a.j */
/* compiled from: PG */
public final class C51195j extends C62942bv implements C63001dt {

    /* renamed from: n */
    public static final C51195j f133264n;

    /* renamed from: r */
    private static volatile C63010eb f133265r;

    /* renamed from: a */
    public int f133266a;

    /* renamed from: b */
    public C55349pb f133267b;

    /* renamed from: c */
    public C62971cq f133268c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f133269d = emptyProtobufList();

    /* renamed from: e */
    public C51194i f133270e;

    /* renamed from: f */
    public String f133271f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62971cq f133272g = emptyProtobufList();

    /* renamed from: h */
    public C52091ex f133273h;

    /* renamed from: i */
    public boolean f133274i;

    /* renamed from: j */
    public C52081en f133275j;

    /* renamed from: k */
    public boolean f133276k;

    /* renamed from: l */
    public String f133277l = BuildConfig.FLAVOR;

    /* renamed from: m */
    public boolean f133278m;

    /* renamed from: o */
    private C9404ci f133279o;

    /* renamed from: p */
    private C54201r f133280p;

    /* renamed from: q */
    private byte f133281q = 2;

    static {
        C51195j jVar = new C51195j();
        f133264n = jVar;
        C62942bv.registerDefaultInstance(C51195j.class, jVar);
    }

    private C51195j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f133281q);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f133281q = b;
                return null;
            case 2:
                return newMessageInfo(f133264n, "\u0001\u000e\u0000\u0001\u0001\u0019\u000e\u0000\u0003\u0006\u0001ᐉ\u0000\u0002ဇ\b\u0003Л\u0006ဉ\u0002\u0007ᐉ\n\nᐉ\u0003\u000bဈ\u0004\fЛ\u0011Л\u0012ဉ\u0007\u0013ဉ\u0005\u0014ဇ\u0006\u0017ဈ\u000f\u0019ဇ\u0011", new Object[]{"a", "b", C19621k.f54601a, C45240c.f118157a, C65354p.class, "e", "p", C66412o.f180592a, C10662f.f35572a, C30325g.f82003a, C51187b.class, "d", C51201p.class, "j", C19618h.f54585a, "i", "l", "m"});
            case 3:
                return new C51195j();
            case 4:
                return new C51190e();
            case 5:
                return f133264n;
            case 6:
                C63010eb ebVar = f133265r;
                if (ebVar == null) {
                    synchronized (C51195j.class) {
                        ebVar = f133265r;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f133264n);
                            f133265r = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
