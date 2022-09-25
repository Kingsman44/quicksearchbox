package com.google.speech.p5204e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63088z;

/* renamed from: com.google.speech.e.j */
/* compiled from: PG */
public final class C66499j extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C66499j f180860d;

    /* renamed from: e */
    private static volatile C63010eb f180861e;

    /* renamed from: a */
    public int f180862a;

    /* renamed from: b */
    public String f180863b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C66493d f180864c;

    static {
        C66499j jVar = new C66499j();
        f180860d = jVar;
        C62942bv.registerDefaultInstance(C66499j.class, jVar);
    }

    private C66499j() {
        C63088z zVar = C63088z.f170246b;
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
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
                return newMessageInfo(f180860d, "\u0001\u0002\u0000\u0001\u0015\u001b\u0002\u0000\u0000\u0000\u0015ဈ\u0015\u001bဉ\u001b", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C66499j();
            case 4:
                return new C66495f();
            case 5:
                return f180860d;
            case 6:
                C63010eb ebVar = f180861e;
                if (ebVar == null) {
                    synchronized (C66499j.class) {
                        ebVar = f180861e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180860d);
                            f180861e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
