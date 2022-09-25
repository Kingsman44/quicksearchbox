package com.google.speech.p5218j.p5220b.p5221a;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.b.a.ag */
/* compiled from: PG */
public final class C66794ag extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66794ag f181640f;

    /* renamed from: g */
    private static volatile C63010eb f181641g;

    /* renamed from: a */
    public int f181642a;

    /* renamed from: b */
    public int f181643b;

    /* renamed from: c */
    public int f181644c;

    /* renamed from: d */
    public C62971cq f181645d = C62942bv.emptyProtobufList();

    /* renamed from: e */
    public C66791ad f181646e;

    static {
        C66794ag agVar = new C66794ag();
        f181640f = agVar;
        C62942bv.registerDefaultInstance(C66794ag.class, agVar);
    }

    private C66794ag() {
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
                return newMessageInfo(f181640f, "\u0001\u0004\u0000\u0001\u0001\u0006\u0004\u0000\u0001\u0000\u0001င\u0000\u0002င\u0001\u0004\u001a\u0006ဉ\u0004", new Object[]{"a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C66794ag();
            case 4:
                return new C66793af();
            case 5:
                return f181640f;
            case 6:
                C63010eb ebVar = f181641g;
                if (ebVar == null) {
                    synchronized (C66794ag.class) {
                        ebVar = f181641g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181640f);
                            f181641g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
