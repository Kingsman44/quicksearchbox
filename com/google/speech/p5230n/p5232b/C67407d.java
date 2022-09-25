package com.google.speech.p5230n.p5232b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.n.b.d */
/* compiled from: PG */
public final class C67407d extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C67407d f183202b;

    /* renamed from: g */
    private static volatile C63010eb f183203g;

    /* renamed from: a */
    public C62971cq f183204a = emptyProtobufList();

    /* renamed from: c */
    private int f183205c;

    /* renamed from: d */
    private String f183206d = BuildConfig.FLAVOR;

    /* renamed from: e */
    private String f183207e;

    /* renamed from: f */
    private byte f183208f = 2;

    static {
        C67407d dVar = new C67407d();
        f183202b = dVar;
        C62942bv.registerDefaultInstance(C67407d.class, dVar);
    }

    private C67407d() {
        emptyProtobufList();
        this.f183207e = BuildConfig.FLAVOR;
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f183208f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f183208f = b;
                return null;
            case 2:
                return newMessageInfo(f183202b, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0003\u0001ᔈ\u0000\u0002Л\u0004ᔈ\u0001", new Object[]{C45240c.f118157a, "d", "a", C67409f.class, "e"});
            case 3:
                return new C67407d();
            case 4:
                return new C67406c();
            case 5:
                return f183202b;
            case 6:
                C63010eb ebVar = f183203g;
                if (ebVar == null) {
                    synchronized (C67407d.class) {
                        ebVar = f183203g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f183202b);
                            f183203g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
