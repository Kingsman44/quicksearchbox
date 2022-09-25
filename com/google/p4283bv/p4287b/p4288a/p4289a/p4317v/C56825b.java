package com.google.p4283bv.p4287b.p4288a.p4289a.p4317v;

import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.SenderStateOuterClass$SenderState;

/* renamed from: com.google.bv.b.a.a.v.b */
/* compiled from: PG */
public final class C56825b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C56825b f151617c;

    /* renamed from: d */
    public static final C62940bt f151618d;

    /* renamed from: e */
    private static volatile C63010eb f151619e;

    /* renamed from: a */
    public int f151620a;

    /* renamed from: b */
    public C56829f f151621b;

    static {
        C56825b bVar = new C56825b();
        f151617c = bVar;
        C62942bv.registerDefaultInstance(C56825b.class, bVar);
        f151618d = C62942bv.newSingularGeneratedExtension(SenderStateOuterClass$SenderState.f179521a, bVar, bVar, (C62958ce) null, 454144546, C63066gd.MESSAGE, C56825b.class);
    }

    private C56825b() {
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
                return newMessageInfo(f151617c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C56825b();
            case 4:
                return new C56824a();
            case 5:
                return f151617c;
            case 6:
                C63010eb ebVar = f151619e;
                if (ebVar == null) {
                    synchronized (C56825b.class) {
                        ebVar = f151619e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f151617c);
                            f151619e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
