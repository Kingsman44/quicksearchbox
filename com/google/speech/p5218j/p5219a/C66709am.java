package com.google.speech.p5218j.p5219a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.a.am */
/* compiled from: PG */
public final class C66709am extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C66709am f181465g;

    /* renamed from: i */
    private static volatile C63010eb f181466i;

    /* renamed from: a */
    public int f181467a = 0;

    /* renamed from: b */
    public Object f181468b;

    /* renamed from: c */
    public int f181469c = 0;

    /* renamed from: d */
    public Object f181470d;

    /* renamed from: e */
    public int f181471e = 0;

    /* renamed from: f */
    public Object f181472f;

    /* renamed from: h */
    private byte f181473h = 2;

    static {
        C66709am amVar = new C66709am();
        f181465g = amVar;
        C62942bv.registerDefaultInstance(C66709am.class, amVar);
    }

    private C66709am() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181473h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181473h = b;
                return null;
            case 2:
                return newMessageInfo(f181465g, "\u0001\u0006\u0003\u0000\u0001\u0006\u0006\u0000\u0000\u0002\u0001ᐼ\u0000\u0002ြ\u0001\u0003ြ\u0001\u0004ᐼ\u0002\u0005ြ\u0002\u0006ြ\u0000", new Object[]{"b", "a", "d", C45240c.f118157a, C10662f.f35572a, "e", C66727bd.class, C66729bf.class, C66697aa.class, C66725bb.class, C66758y.class, C66756w.class});
            case 3:
                return new C66709am();
            case 4:
                return new C66708al();
            case 5:
                return f181465g;
            case 6:
                C63010eb ebVar = f181466i;
                if (ebVar == null) {
                    synchronized (C66709am.class) {
                        ebVar = f181466i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181465g);
                            f181466i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
