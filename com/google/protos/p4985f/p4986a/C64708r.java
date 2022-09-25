package com.google.protos.p4985f.p4986a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4881ar.p4882a.C63771b;

/* renamed from: com.google.protos.f.a.r */
/* compiled from: PG */
public final class C64708r extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C64708r f175399l;

    /* renamed from: o */
    private static volatile C63010eb f175400o;

    /* renamed from: a */
    public int f175401a;

    /* renamed from: b */
    public int f175402b = 0;

    /* renamed from: c */
    public Object f175403c;

    /* renamed from: d */
    public C62971cq f175404d = emptyProtobufList();

    /* renamed from: e */
    public long f175405e;

    /* renamed from: f */
    public C64706p f175406f;

    /* renamed from: g */
    public long f175407g = 10000;

    /* renamed from: h */
    public int f175408h;

    /* renamed from: i */
    public double f175409i;

    /* renamed from: j */
    public double f175410j;

    /* renamed from: k */
    public C62971cq f175411k = emptyProtobufList();

    /* renamed from: m */
    private C63771b f175412m;

    /* renamed from: n */
    private byte f175413n = 2;

    static {
        C64708r rVar = new C64708r();
        f175399l = rVar;
        C62942bv.registerDefaultInstance(C64708r.class, rVar);
    }

    private C64708r() {
    }

    /* renamed from: a */
    public final void mo59303a() {
        C62971cq cqVar = this.f175404d;
        if (!cqVar.mo58948c()) {
            this.f175404d = C62942bv.mutableCopy(cqVar);
        }
    }

    /* renamed from: b */
    public final void mo59304b() {
        C62971cq cqVar = this.f175411k;
        if (!cqVar.mo58948c()) {
            this.f175411k = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f175413n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f175413n = b;
                return null;
            case 2:
                return newMessageInfo(f175399l, "\u0001\u000b\u0001\u0001\u0001\u001c\u000b\u0000\u0002\u0001\u0001\u001b\u0003ဂ\u0000\bဉ\u0005\u000bြ\u0000\u000eဂ\u0007\u000fဌ\n\u0012ᐉ\r\u0014ြ\u0000\u0015က\u000e\u0016\u001b\u001cက\u000f", new Object[]{C45240c.f118157a, "b", "a", "d", C64648ab.class, "e", C10662f.f35572a, C64674ba.class, C30325g.f82003a, C19618h.f54585a, C64676bc.m96429b(), "m", C64678be.class, "i", C19621k.f54601a, C64661ao.class, "j"});
            case 3:
                return new C64708r();
            case 4:
                return new C64707q();
            case 5:
                return f175399l;
            case 6:
                C63010eb ebVar = f175400o;
                if (ebVar == null) {
                    synchronized (C64708r.class) {
                        ebVar = f175400o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f175399l);
                            f175400o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
