package com.google.lens.p4708k;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.lens.k.f */
/* compiled from: PG */
public final class C62598f extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C62598f f169003g;

    /* renamed from: i */
    private static volatile C63010eb f169004i;

    /* renamed from: a */
    public boolean f169005a;

    /* renamed from: b */
    public float f169006b = 1.0f;

    /* renamed from: c */
    public C62961ch f169007c = emptyIntList();

    /* renamed from: d */
    public C62961ch f169008d = emptyIntList();

    /* renamed from: e */
    public C62961ch f169009e = emptyIntList();

    /* renamed from: f */
    public boolean f169010f;

    /* renamed from: h */
    private int f169011h;

    static {
        C62598f fVar = new C62598f();
        f169003g = fVar;
        C62942bv.registerDefaultInstance(C62598f.class, fVar);
    }

    private C62598f() {
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
                return newMessageInfo(f169003g, "\u0001\u0006\u0000\u0001\u0002\u0007\u0006\u0000\u0003\u0000\u0002ဇ\u0001\u0003ခ\u0002\u0004\u0016\u0005\u0016\u0006\u0016\u0007ဇ\u0003", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C62598f();
            case 4:
                return new C62597e();
            case 5:
                return f169003g;
            case 6:
                C63010eb ebVar = f169004i;
                if (ebVar == null) {
                    synchronized (C62598f.class) {
                        ebVar = f169004i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f169003g);
                            f169004i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
