package com.google.assistant.p3994s.p3995a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.s.a.ag */
/* compiled from: PG */
public final class C53070ag extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C53070ag f139073g;

    /* renamed from: i */
    private static volatile C63010eb f139074i;

    /* renamed from: a */
    public int f139075a;

    /* renamed from: b */
    public int f139076b = 0;

    /* renamed from: c */
    public Object f139077c;

    /* renamed from: d */
    public String f139078d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f139079e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public C53198f f139080f;

    /* renamed from: h */
    private byte f139081h = 2;

    static {
        C53070ag agVar = new C53070ag();
        f139073g = agVar;
        C62942bv.registerDefaultInstance(C53070ag.class, agVar);
    }

    private C53070ag() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f139081h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f139081h = b;
                return null;
            case 2:
                return newMessageInfo(f139073g, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ြ\u0000\u0002ᐼ\u0000\u0003ဈ\u0004\u0004ဈ\u0005\u0005ဉ\u0006\u0006ြ\u0000\u0007ြ\u0000", new Object[]{C45240c.f118157a, "b", "a", C53066ac.class, C53064aa.class, "d", "e", C10662f.f35572a, C53069af.class, C53465u.class});
            case 3:
                return new C53070ag();
            case 4:
                return new C53067ad();
            case 5:
                return f139073g;
            case 6:
                C63010eb ebVar = f139074i;
                if (ebVar == null) {
                    synchronized (C53070ag.class) {
                        ebVar = f139074i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f139073g);
                            f139074i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
