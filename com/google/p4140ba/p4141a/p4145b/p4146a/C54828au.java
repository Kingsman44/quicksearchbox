package com.google.p4140ba.p4141a.p4145b.p4146a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ba.a.b.a.au */
/* compiled from: PG */
public final class C54828au extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C54828au f143868g;

    /* renamed from: h */
    private static volatile C63010eb f143869h;

    /* renamed from: a */
    public int f143870a;

    /* renamed from: b */
    public String f143871b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f143872c = emptyProtobufList();

    /* renamed from: d */
    public long f143873d;

    /* renamed from: e */
    public C54849bo f143874e;

    /* renamed from: f */
    public int f143875f;

    static {
        C54828au auVar = new C54828au();
        f143868g = auVar;
        C62942bv.registerDefaultInstance(C54828au.class, auVar);
    }

    private C54828au() {
    }

    /* renamed from: a */
    public final void mo54161a() {
        C62971cq cqVar = this.f143872c;
        if (!cqVar.mo58948c()) {
            this.f143872c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        switch (buVar.ordinal()) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return newMessageInfo(f143868g, "\u0001\u0005\u0000\u0001\u0001\u0011\u0005\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001b\u0003ဉ\u0002\u0005ဃ\u0001\u0011ဌ\u0003", new Object[]{"a", "b", C45240c.f118157a, C54845bk.class, "e", "d", C10662f.f35572a, C54810ac.m87535b()});
            case 3:
                return new C54828au();
            case 4:
                return new C54827at();
            case 5:
                return f143868g;
            case 6:
                C63010eb ebVar = f143869h;
                if (ebVar == null) {
                    synchronized (C54828au.class) {
                        ebVar = f143869h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f143868g);
                            f143869h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
