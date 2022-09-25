package com.google.android.libraries.assistant.auto.tng.morris.p1071e;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.e.it */
/* compiled from: PG */
public final class C14425it extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C14425it f43635f;

    /* renamed from: h */
    private static volatile C63010eb f43636h;

    /* renamed from: a */
    public int f43637a;

    /* renamed from: b */
    public C14636z f43638b;

    /* renamed from: c */
    public boolean f43639c;

    /* renamed from: d */
    public C60214n f43640d;

    /* renamed from: e */
    public int f43641e;

    /* renamed from: g */
    private byte f43642g = 2;

    static {
        C14425it itVar = new C14425it();
        f43635f = itVar;
        C62942bv.registerDefaultInstance(C14425it.class, itVar);
    }

    private C14425it() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f43642g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f43642g = b;
                return null;
            case 2:
                return newMessageInfo(f43635f, "\u0000\u0005\u0000\u0000\u0001\u000b\u0005\u0000\u0000\u0001\u0001\f\u0003\u0007\u0004\t\nЉ\u000b\f", new Object[]{"a", C45240c.f118157a, "b", "d", "e"});
            case 3:
                return new C14425it();
            case 4:
                return new C14423ir();
            case 5:
                return f43635f;
            case 6:
                C63010eb ebVar = f43636h;
                if (ebVar == null) {
                    synchronized (C14425it.class) {
                        ebVar = f43636h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f43635f);
                            f43636h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
