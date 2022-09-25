package com.google.speech.p5208h;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62937bq;
import com.google.protobuf.C62938br;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63010eb;
import com.google.protos.p4934ay.p4938c.C64278b;

/* renamed from: com.google.speech.h.ci */
/* compiled from: PG */
public final class C66611ci extends C62937bq implements C62938br {

    /* renamed from: g */
    public static final C66611ci f181206g;

    /* renamed from: i */
    private static volatile C63010eb f181207i;

    /* renamed from: a */
    public int f181208a;

    /* renamed from: b */
    public int f181209b;

    /* renamed from: c */
    public int f181210c;

    /* renamed from: d */
    public String f181211d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C64278b f181212e;

    /* renamed from: f */
    public C62971cq f181213f = C62942bv.emptyProtobufList();

    /* renamed from: h */
    private byte f181214h = 2;

    static {
        C66611ci ciVar = new C66611ci();
        f181206g = ciVar;
        C62942bv.registerDefaultInstance(C66611ci.class, ciVar);
    }

    private C66611ci() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f181214h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f181214h = b;
                return null;
            case 2:
                return newMessageInfo(f181206g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001ဌ\u0000\u0002င\u0001\u0003ဈ\u0002\u0004\u001a\u0006ဉ\u0003", new Object[]{"a", "b", C66610ch.m97261b(), C45240c.f118157a, "d", C10662f.f35572a, "e"});
            case 3:
                return new C66611ci();
            case 4:
                return new C66608cf();
            case 5:
                return f181206g;
            case 6:
                C63010eb ebVar = f181207i;
                if (ebVar == null) {
                    synchronized (C66611ci.class) {
                        ebVar = f181207i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f181206g);
                            f181207i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
