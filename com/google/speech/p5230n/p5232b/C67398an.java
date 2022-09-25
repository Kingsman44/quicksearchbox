package com.google.speech.p5230n.p5232b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.an */
/* compiled from: PG */
public final class C67398an extends C62937bq implements C62938br {

    /* renamed from: d */
    public static final C67398an f183181d;

    /* renamed from: f */
    private static volatile C63010eb f183182f;

    /* renamed from: a */
    public int f183183a = 0;

    /* renamed from: b */
    public Object f183184b;

    /* renamed from: c */
    public C62971cq f183185c;

    /* renamed from: e */
    private byte f183186e = 2;

    static {
        C67398an anVar = new C67398an();
        f183181d = anVar;
        C62942bv.registerDefaultInstance(C67398an.class, anVar);
    }

    private C67398an() {
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        this.f183185c = emptyProtobufList();
    }

    /* renamed from: a */
    public final void mo59846a() {
        C62971cq cqVar = this.f183185c;
        if (!cqVar.mo58948c()) {
            this.f183185c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183186e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183186e = b;
                return null;
            case 2:
                return newMessageInfo(f183181d, "\u0001\u0018\u0001\u0000\u0001)\u0018\u0000\u0001\u0006\u0001ျ\u0000\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005ြ\u0000\u0006ᐼ\u0000\u0007ြ\u0000\bᐼ\u0000\tြ\u0000\nြ\u0000\u000bြ\u0000\fᐼ\u0000\rြ\u0000\u000eြ\u0000\u000fျ\u0000\u0010ျ\u0000\u0012ျ\u0000\u0013ျ\u0000\u0015ဴ\u0000\u0019ြ\u0000\u001a\u001b ြ\u0000$ြ\u0000%ᐼ\u0000)ြ\u0000", new Object[]{"b", "a", C67413j.class, C67388ad.class, C67421r.class, C67427x.class, C67394aj.class, C67429z.class, C67419p.class, C67405b.class, C67392ah.class, C67386ab.class, C67423t.class, C67415l.class, C67404at.class, C45240c.f118157a, C67396al.class, C67390af.class, C67417n.class, C67411h.class, C67425v.class});
            case 3:
                return new C67398an();
            case 4:
                return new C67397am();
            case 5:
                return f183181d;
            case 6:
                C63010eb ebVar = f183182f;
                if (ebVar == null) {
                    synchronized (C67398an.class) {
                        ebVar = f183182f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183181d);
                            f183182f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
