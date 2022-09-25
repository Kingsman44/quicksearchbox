package com.google.assistant.p3980n.p3983b.p3984a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.n.b.a.b */
/* compiled from: PG */
public final class C53006b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C53006b f138944d;

    /* renamed from: e */
    private static volatile C63010eb f138945e;

    /* renamed from: a */
    public int f138946a;

    /* renamed from: b */
    public boolean f138947b;

    /* renamed from: c */
    public String f138948c = BuildConfig.FLAVOR;

    static {
        C53006b bVar = new C53006b();
        f138944d = bVar;
        C62942bv.registerDefaultInstance(C53006b.class, bVar);
    }

    private C53006b() {
        emptyProtobufList();
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
                return newMessageInfo(f138944d, "\u0001\u0002\u0000\u0001\u0001\u0003\u0002\u0000\u0000\u0000\u0001ဇ\u0000\u0003ဈ\u0001", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C53006b();
            case 4:
                return new C53005a();
            case 5:
                return f138944d;
            case 6:
                C63010eb ebVar = f138945e;
                if (ebVar == null) {
                    synchronized (C53006b.class) {
                        ebVar = f138945e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138944d);
                            f138945e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
