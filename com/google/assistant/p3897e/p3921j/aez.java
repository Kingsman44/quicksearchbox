package com.google.assistant.p3897e.p3921j;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.aez */
/* compiled from: PG */
public final class aez extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final aez f134976g;

    /* renamed from: h */
    private static volatile C63010eb f134977h;

    /* renamed from: a */
    public int f134978a;

    /* renamed from: b */
    public int f134979b;

    /* renamed from: c */
    public boolean f134980c;

    /* renamed from: d */
    public boolean f134981d;

    /* renamed from: e */
    public boolean f134982e = true;

    /* renamed from: f */
    public int f134983f;

    static {
        aez aez = new aez();
        f134976g = aez;
        C62942bv.registerDefaultInstance(aez.class, aez);
    }

    private aez() {
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
                return newMessageInfo(f134976g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0000\u0000\u0001င\u0000\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဌ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, acp.f134842a});
            case 3:
                return new aez();
            case 4:
                return new aey();
            case 5:
                return f134976g;
            case 6:
                C63010eb ebVar = f134977h;
                if (ebVar == null) {
                    synchronized (aez.class) {
                        ebVar = f134977h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134976g);
                            f134977h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
