package com.google.android.libraries.assistant.portable.p1586b;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3912f.C51209d;
import com.google.assistant.p3897e.p3921j.C52431rm;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.portable.b.aj */
/* compiled from: PG */
public final class C19066aj extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C62962ci f53482d = new C19064ah();

    /* renamed from: e */
    public static final C19066aj f53483e;

    /* renamed from: f */
    private static volatile C63010eb f53484f;

    /* renamed from: a */
    public int f53485a;

    /* renamed from: b */
    public int f53486b;

    /* renamed from: c */
    public C62961ch f53487c = emptyIntList();

    static {
        C19066aj ajVar = new C19066aj();
        f53483e = ajVar;
        C62942bv.registerDefaultInstance(C19066aj.class, ajVar);
    }

    private C19066aj() {
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
                return newMessageInfo(f53483e, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဌ\u0000\u0002\u001e", new Object[]{"a", "b", C52431rm.m86629c(), C45240c.f118157a, C51209d.m86087b()});
            case 3:
                return new C19066aj();
            case 4:
                return new C19065ai();
            case 5:
                return f53483e;
            case 6:
                C63010eb ebVar = f53484f;
                if (ebVar == null) {
                    synchronized (C19066aj.class) {
                        ebVar = f53484f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53483e);
                            f53484f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
