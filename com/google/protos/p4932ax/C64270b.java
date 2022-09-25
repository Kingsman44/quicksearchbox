package com.google.protos.p4932ax;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.protos.ax.b */
/* compiled from: PG */
public final class C64270b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C64270b f173770c;

    /* renamed from: d */
    private static volatile C63010eb f173771d;

    /* renamed from: a */
    public int f173772a;

    /* renamed from: b */
    public boolean f173773b;

    static {
        C64270b bVar = new C64270b();
        f173770c = bVar;
        C62942bv.registerDefaultInstance(C64270b.class, bVar);
    }

    private C64270b() {
        emptyLongList();
        emptyLongList();
        C62942bv.emptyProtobufList();
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
                return newMessageInfo(f173770c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဇ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C64270b();
            case 4:
                return new C64260a();
            case 5:
                return f173770c;
            case 6:
                C63010eb ebVar = f173771d;
                if (ebVar == null) {
                    synchronized (C64270b.class) {
                        ebVar = f173771d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173770c);
                            f173771d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
