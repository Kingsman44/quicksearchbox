package com.google.assistant.p3988o;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3825an.p3832d.p3833a.C49358i;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.o.c */
/* compiled from: PG */
public final class C53033c extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C53033c f138997a;

    /* renamed from: e */
    private static volatile C63010eb f138998e;

    /* renamed from: b */
    private int f138999b;

    /* renamed from: c */
    private C62995dn f139000c = C62995dn.f170057a;

    /* renamed from: d */
    private C49358i f139001d;

    static {
        C53033c cVar = new C53033c();
        f138997a = cVar;
        C62942bv.registerDefaultInstance(C53033c.class, cVar);
    }

    private C53033c() {
        C62942bv.emptyProtobufList();
        emptyIntList();
        emptyProtobufList();
        emptyLongList();
        emptyLongList();
        emptyLongList();
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
                return newMessageInfo(f138997a, "\u0001\u0002\u0000\u0001\u001e\u001f\u0002\u0001\u0000\u0000\u001eဉ\u0001\u001f2", new Object[]{"b", "d", C45240c.f118157a, C53032b.f138996a});
            case 3:
                return new C53033c();
            case 4:
                return new C53031a();
            case 5:
                return f138997a;
            case 6:
                C63010eb ebVar = f138998e;
                if (ebVar == null) {
                    synchronized (C53033c.class) {
                        ebVar = f138998e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f138997a);
                            f138998e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
