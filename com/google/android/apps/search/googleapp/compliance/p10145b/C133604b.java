package com.google.android.apps.search.googleapp.compliance.p10145b;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.search.googleapp.compliance.b.b */
/* compiled from: PG */
public final class C133604b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C133604b f363964c;

    /* renamed from: d */
    private static volatile C63010eb f363965d;

    /* renamed from: a */
    public int f363966a;

    /* renamed from: b */
    public int f363967b;

    static {
        C133604b bVar = new C133604b();
        f363964c = bVar;
        C62942bv.registerDefaultInstance(C133604b.class, bVar);
    }

    private C133604b() {
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
                return newMessageInfo(f363964c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဌ\u0000", new Object[]{"a", "b", C133614l.m216829b()});
            case 3:
                return new C133604b();
            case 4:
                return new C133603a();
            case 5:
                return f363964c;
            case 6:
                C63010eb ebVar = f363965d;
                if (ebVar == null) {
                    synchronized (C133604b.class) {
                        ebVar = f363965d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f363964c);
                            f363965d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
