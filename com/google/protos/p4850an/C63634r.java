package com.google.protos.p4850an;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61762x;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.an.r */
/* compiled from: PG */
public final class C63634r extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63634r f172096f;

    /* renamed from: h */
    private static volatile C63010eb f172097h;

    /* renamed from: a */
    public int f172098a;

    /* renamed from: b */
    public int f172099b = 0;

    /* renamed from: c */
    public Object f172100c;

    /* renamed from: d */
    public String f172101d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C61762x f172102e;

    /* renamed from: g */
    private byte f172103g = 2;

    static {
        C63634r rVar = new C63634r();
        f172096f = rVar;
        C62942bv.registerDefaultInstance(C63634r.class, rVar);
    }

    private C63634r() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f172103g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f172103g = b;
                return null;
            case 2:
                return newMessageInfo(f172096f, "\u0001\u0010\u0001\u0001\u0001\u0011\u0010\u0000\u0000\u0007\u0001ဈ\u0000\u0002ᐼ\u0000\u0003ᐼ\u0000\u0004ြ\u0000\u0005ᐼ\u0000\u0006ᐼ\u0000\u0007ြ\u0000\bြ\u0000\tြ\u0000\nᐼ\u0000\u000bြ\u0000\fြ\u0000\u000eြ\u0000\u000fᐼ\u0000\u0010ြ\u0000\u0011ᐉ\u0010", new Object[]{C45240c.f118157a, "b", "a", "d", C63349at.class, C63345ap.class, C63636t.class, C63341al.class, C63333ad.class, C63339aj.class, C63337ah.class, C63335af.class, C63632p.class, C63347ar.class, C63638v.class, C63343an.class, C63640x.class, C63331ab.class, "e"});
            case 3:
                return new C63634r();
            case 4:
                return new C63633q();
            case 5:
                return f172096f;
            case 6:
                C63010eb ebVar = f172097h;
                if (ebVar == null) {
                    synchronized (C63634r.class) {
                        ebVar = f172097h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f172096f);
                            f172097h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
