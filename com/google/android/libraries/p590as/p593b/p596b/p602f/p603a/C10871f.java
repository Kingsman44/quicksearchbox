package com.google.android.libraries.p590as.p593b.p596b.p602f.p603a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.as.b.b.f.a.f */
/* compiled from: PG */
public final class C10871f extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C10871f f35937h;

    /* renamed from: i */
    private static volatile C63010eb f35938i;

    /* renamed from: a */
    public int f35939a;

    /* renamed from: b */
    public long f35940b;

    /* renamed from: c */
    public String f35941c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f35942d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public long f35943e;

    /* renamed from: f */
    public String f35944f = BuildConfig.FLAVOR;

    /* renamed from: g */
    public C62971cq f35945g = emptyProtobufList();

    static {
        C10871f fVar = new C10871f();
        f35937h = fVar;
        C62942bv.registerDefaultInstance(C10871f.class, fVar);
    }

    private C10871f() {
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
                return newMessageInfo(f35937h, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0000\u0001ဂ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004ဂ\u0003\u0005ဈ\u0004\u0006\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C10867b.class});
            case 3:
                return new C10871f();
            case 4:
                return new C10870e();
            case 5:
                return f35937h;
            case 6:
                C63010eb ebVar = f35938i;
                if (ebVar == null) {
                    synchronized (C10871f.class) {
                        ebVar = f35938i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f35937h);
                            f35938i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
