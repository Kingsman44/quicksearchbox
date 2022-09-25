package com.google.assistant.p3957l.p3958a.p3959a.p3960a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.l.a.a.a.b */
/* compiled from: PG */
public final class C52970b extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C52970b f138872b;

    /* renamed from: d */
    private static volatile C63010eb f138873d;

    /* renamed from: a */
    public String f138874a = BuildConfig.FLAVOR;

    /* renamed from: c */
    private int f138875c;

    static {
        C52970b bVar = new C52970b();
        f138872b = bVar;
        C62942bv.registerDefaultInstance(C52970b.class, bVar);
    }

    private C52970b() {
        emptyIntList();
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
                return newMessageInfo(f138872b, "\u0001\u0001\u0000\u0001\u0004\u0004\u0001\u0000\u0000\u0000\u0004ဈ\u0002", new Object[]{C45240c.f118157a, "a"});
            case 3:
                return new C52970b();
            case 4:
                return new C52969a();
            case 5:
                return f138872b;
            case 6:
                C63010eb ebVar = f138873d;
                if (ebVar == null) {
                    synchronized (C52970b.class) {
                        ebVar = f138873d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138872b);
                            f138873d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
