package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.speech.p5218j.p5220b.p5221a.C66811o;
import com.google.speech.p5218j.p5220b.p5221a.C66814r;

/* renamed from: com.google.common.o.aes */
/* compiled from: PG */
public final class aes extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final aes f158479g;

    /* renamed from: h */
    private static volatile C63010eb f158480h;

    /* renamed from: a */
    public int f158481a;

    /* renamed from: b */
    public String f158482b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public int f158483c;

    /* renamed from: d */
    public int f158484d;

    /* renamed from: e */
    public C62961ch f158485e = emptyIntList();

    /* renamed from: f */
    public C62971cq f158486f = emptyProtobufList();

    static {
        aes aes = new aes();
        f158479g = aes;
        C62942bv.registerDefaultInstance(aes.class, aes);
    }

    private aes() {
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
                return newMessageInfo(f158479g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0004\u001b\u0005င\u0003\u0006ဌ\u0002\u0007\u001e", new Object[]{"a", "b", C10662f.f35572a, aeu.class, "d", C45240c.f118157a, C66811o.f181679a, "e", C66814r.m97355b()});
            case 3:
                return new aes();
            case 4:
                return new aer();
            case 5:
                return f158479g;
            case 6:
                C63010eb ebVar = f158480h;
                if (ebVar == null) {
                    synchronized (aes.class) {
                        ebVar = f158480h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158479g);
                            f158480h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
