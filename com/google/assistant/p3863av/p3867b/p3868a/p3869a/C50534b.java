package com.google.assistant.p3863av.p3867b.p3868a.p3869a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.av.b.a.a.b */
/* compiled from: PG */
public final class C50534b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C50534b f131522b;

    /* renamed from: d */
    private static volatile C63010eb f131523d;

    /* renamed from: a */
    public String f131524a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f131525c;

    static {
        C50534b bVar = new C50534b();
        f131522b = bVar;
        C62942bv.registerDefaultInstance(C50534b.class, bVar);
    }

    private C50534b() {
        emptyProtobufList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f131522b, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C50534b();
            case 4:
                return new C50533a();
            case 5:
                return f131522b;
            case 6:
                C63010eb ebVar = f131523d;
                if (ebVar == null) {
                    synchronized (C50534b.class) {
                        ebVar = f131523d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131522b);
                            f131523d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
