package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.za */
/* compiled from: PG */
public final class C50491za extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C50491za f131389g;

    /* renamed from: h */
    private static volatile C63010eb f131390h;

    /* renamed from: a */
    public int f131391a;

    /* renamed from: b */
    public String f131392b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f131393c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f131394d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f131395e = C62942bv.emptyProtobufList();

    /* renamed from: f */
    public C62971cq f131396f = emptyProtobufList();

    static {
        C50491za zaVar = new C50491za();
        f131389g = zaVar;
        C62942bv.registerDefaultInstance(C50491za.class, zaVar);
    }

    private C50491za() {
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
                return newMessageInfo(f131389g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003\u001a\u0004\u001b\u0005ဈ\u0002", new Object[]{"a", "b", C45240c.f118157a, "e", C10662f.f35572a, C50489yz.class, "d"});
            case 3:
                return new C50491za();
            case 4:
                return new C50487yx();
            case 5:
                return f131389g;
            case 6:
                C63010eb ebVar = f131390h;
                if (ebVar == null) {
                    synchronized (C50491za.class) {
                        ebVar = f131390h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f131389g);
                            f131390h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
