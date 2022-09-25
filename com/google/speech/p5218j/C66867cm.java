package com.google.speech.p5218j;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.j.cm */
/* compiled from: PG */
public final class C66867cm extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C66867cm f181796g;

    /* renamed from: h */
    private static volatile C63010eb f181797h;

    /* renamed from: a */
    public int f181798a;

    /* renamed from: b */
    public boolean f181799b = true;

    /* renamed from: c */
    public boolean f181800c = true;

    /* renamed from: d */
    public boolean f181801d = true;

    /* renamed from: e */
    public boolean f181802e;

    /* renamed from: f */
    public boolean f181803f;

    static {
        C66867cm cmVar = new C66867cm();
        f181796g = cmVar;
        C62942bv.registerDefaultInstance(C66867cm.class, cmVar);
    }

    private C66867cm() {
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
                return newMessageInfo(f181796g, "\u0001\u0005\u0000\u0001\u0003\u0007\u0005\u0000\u0000\u0000\u0003ဇ\u0004\u0004ဇ\u0001\u0005ဇ\u0002\u0006ဇ\u0005\u0007ဇ\u0003", new Object[]{"a", "e", "b", C45240c.f118157a, C10662f.f35572a, "d"});
            case 3:
                return new C66867cm();
            case 4:
                return new C66866cl();
            case 5:
                return f181796g;
            case 6:
                C63010eb ebVar = f181797h;
                if (ebVar == null) {
                    synchronized (C66867cm.class) {
                        ebVar = f181797h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181796g);
                            f181797h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
