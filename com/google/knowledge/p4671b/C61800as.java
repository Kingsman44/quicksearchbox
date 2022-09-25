package com.google.knowledge.p4671b;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.b.as */
/* compiled from: PG */
public final class C61800as extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C61800as f166936f;

    /* renamed from: h */
    private static volatile C63010eb f166937h;

    /* renamed from: a */
    public int f166938a;

    /* renamed from: b */
    public String f166939b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f166940c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f166941d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public String f166942e;

    /* renamed from: g */
    private byte f166943g = 2;

    static {
        C61800as asVar = new C61800as();
        f166936f = asVar;
        C62942bv.registerDefaultInstance(C61800as.class, asVar);
    }

    private C61800as() {
        emptyProtobufList();
        this.f166942e = BuildConfig.FLAVOR;
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166943g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166943g = b;
                return null;
            case 2:
                return newMessageInfo(f166936f, "\u0001\u0004\u0000\u0001\u0002\f\u0004\u0000\u0000\u0000\u0002ဈ\u0003\u0003ဈ\u0004\u0007ဈ\u0000\fဈ\n", new Object[]{"a", C45240c.f118157a, "d", "b", "e"});
            case 3:
                return new C61800as();
            case 4:
                return new C61799ar();
            case 5:
                return f166936f;
            case 6:
                C63010eb ebVar = f166937h;
                if (ebVar == null) {
                    synchronized (C61800as.class) {
                        ebVar = f166937h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166936f);
                            f166937h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
