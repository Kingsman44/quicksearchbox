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

/* renamed from: com.google.assistant.at.lu */
/* compiled from: PG */
public final class C50133lu extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C50133lu f130326e;

    /* renamed from: g */
    private static volatile C63010eb f130327g;

    /* renamed from: a */
    public String f130328a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f130329b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public boolean f130330c;

    /* renamed from: d */
    public boolean f130331d;

    /* renamed from: f */
    private int f130332f;

    static {
        C50133lu luVar = new C50133lu();
        f130326e = luVar;
        C62942bv.registerDefaultInstance(C50133lu.class, luVar);
    }

    private C50133lu() {
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
                return newMessageInfo(f130326e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002\u001a\u0004ဇ\u0002\u0005ဇ\u0003", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C50133lu();
            case 4:
                return new C50132lt();
            case 5:
                return f130326e;
            case 6:
                C63010eb ebVar = f130327g;
                if (ebVar == null) {
                    synchronized (C50133lu.class) {
                        ebVar = f130327g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130326e);
                            f130327g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
