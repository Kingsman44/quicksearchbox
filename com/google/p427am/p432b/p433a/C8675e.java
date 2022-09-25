package com.google.p427am.p432b.p433a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.e */
/* compiled from: PG */
public final class C8675e extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C8675e f29990g;

    /* renamed from: h */
    private static volatile C63010eb f29991h;

    /* renamed from: a */
    public String f29992a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C8633al f29993b;

    /* renamed from: c */
    public C8628ag f29994c;

    /* renamed from: d */
    public boolean f29995d;

    /* renamed from: e */
    public boolean f29996e;

    /* renamed from: f */
    public C62971cq f29997f = emptyProtobufList();

    static {
        C8675e eVar = new C8675e();
        f29990g = eVar;
        C62942bv.registerDefaultInstance(C8675e.class, eVar);
    }

    private C8675e() {
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
                return newMessageInfo(f29990g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0001\u0000\u0001Ȉ\u0002\t\u0003\t\u0004\u0007\u0005\u0007\u0006\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C8649ba.class});
            case 3:
                return new C8675e();
            case 4:
                return new C8674d();
            case 5:
                return f29990g;
            case 6:
                C63010eb ebVar = f29991h;
                if (ebVar == null) {
                    synchronized (C8675e.class) {
                        ebVar = f29991h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29990g);
                            f29991h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
