package com.google.assistant.p3944g.p3948b.p3949a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.g.b.a.f */
/* compiled from: PG */
public final class C52941f extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C52941f f138810d;

    /* renamed from: e */
    private static volatile C63010eb f138811e;

    /* renamed from: a */
    public int f138812a;

    /* renamed from: b */
    public String f138813b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f138814c = BuildConfig.FLAVOR;

    static {
        C52941f fVar = new C52941f();
        f138810d = fVar;
        C62942bv.registerDefaultInstance(C52941f.class, fVar);
    }

    private C52941f() {
        emptyProtobufList();
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
                return newMessageInfo(f138810d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C52941f();
            case 4:
                return new C52940e();
            case 5:
                return f138810d;
            case 6:
                C63010eb ebVar = f138811e;
                if (ebVar == null) {
                    synchronized (C52941f.class) {
                        ebVar = f138811e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138810d);
                            f138811e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
