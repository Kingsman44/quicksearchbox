package com.google.p381aj.p382a.p383a.p384a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.aj.a.a.a.aj */
/* compiled from: PG */
public final class C8221aj extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C8221aj f28861a;

    /* renamed from: h */
    private static volatile C63010eb f28862h;

    /* renamed from: b */
    private int f28863b;

    /* renamed from: c */
    private C8242v f28864c;

    /* renamed from: d */
    private C8242v f28865d;

    /* renamed from: e */
    private C8232l f28866e;

    /* renamed from: f */
    private C8232l f28867f;

    /* renamed from: g */
    private byte f28868g = 2;

    static {
        C8221aj ajVar = new C8221aj();
        f28861a = ajVar;
        C62942bv.registerDefaultInstance(C8221aj.class, ajVar);
    }

    private C8221aj() {
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyFloatList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f28868g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f28868g = b;
                return null;
            case 2:
                return newMessageInfo(f28861a, "\u0001\u0004\u0000\u0001\u0001\u0019\u0004\u0000\u0000\u0004\u0001ᔉ\u0000\u0004ᐉ\u0003\u0018ᐉ\u0017\u0019ᐉ\u0018", new Object[]{"b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C8221aj();
            case 4:
                return new C8220ai();
            case 5:
                return f28861a;
            case 6:
                C63010eb ebVar = f28862h;
                if (ebVar == null) {
                    synchronized (C8221aj.class) {
                        ebVar = f28862h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f28861a);
                            f28862h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
