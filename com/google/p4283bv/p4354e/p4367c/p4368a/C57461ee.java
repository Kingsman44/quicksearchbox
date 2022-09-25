package com.google.p4283bv.p4354e.p4367c.p4368a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bv.e.c.a.ee */
/* compiled from: PG */
public final class C57461ee extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C57461ee f153497g;

    /* renamed from: h */
    private static volatile C63010eb f153498h;

    /* renamed from: a */
    public int f153499a;

    /* renamed from: b */
    public int f153500b = 14;

    /* renamed from: c */
    public int f153501c;

    /* renamed from: d */
    public boolean f153502d;

    /* renamed from: e */
    public float f153503e;

    /* renamed from: f */
    public C62971cq f153504f;

    static {
        C57461ee eeVar = new C57461ee();
        f153497g = eeVar;
        C62942bv.registerDefaultInstance(C57461ee.class, eeVar);
    }

    private C57461ee() {
        C62942bv.emptyProtobufList();
        this.f153504f = emptyProtobufList();
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
                return newMessageInfo(f153497g, "\u0001\u0005\u0000\u0001\u0001\t\u0005\u0000\u0001\u0000\u0001င\u0000\u0004ဇ\u0004\u0007ဋ\u0002\b\u001b\tခ\u0005", new Object[]{"a", "b", "d", C45240c.f118157a, C10662f.f35572a, C57482ez.class, "e"});
            case 3:
                return new C57461ee();
            case 4:
                return new C57460ed();
            case 5:
                return f153497g;
            case 6:
                C63010eb ebVar = f153498h;
                if (ebVar == null) {
                    synchronized (C57461ee.class) {
                        ebVar = f153498h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f153497g);
                            f153498h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
