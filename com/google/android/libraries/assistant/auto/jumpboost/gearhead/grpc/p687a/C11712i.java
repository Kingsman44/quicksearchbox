package com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.p687a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.jumpboost.gearhead.grpc.a.i */
/* compiled from: PG */
public final class C11712i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C11712i f37744e;

    /* renamed from: g */
    private static volatile C63010eb f37745g;

    /* renamed from: a */
    public C62971cq f37746a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f37747b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public String f37748c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f37749d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private int f37750f;

    static {
        C11712i iVar = new C11712i();
        f37744e = iVar;
        C62942bv.registerDefaultInstance(C11712i.class, iVar);
    }

    private C11712i() {
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
                return newMessageInfo(f37744e, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0002\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001\u0005ဈ\u0002", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C11712i();
            case 4:
                return new C11711h();
            case 5:
                return f37744e;
            case 6:
                C63010eb ebVar = f37745g;
                if (ebVar == null) {
                    synchronized (C11712i.class) {
                        ebVar = f37745g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f37744e);
                            f37745g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
