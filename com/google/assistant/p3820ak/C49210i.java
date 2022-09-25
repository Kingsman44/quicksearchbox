package com.google.assistant.p3820ak;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ak.i */
/* compiled from: PG */
public final class C49210i extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C49210i f127233e;

    /* renamed from: g */
    private static volatile C63010eb f127234g;

    /* renamed from: a */
    public int f127235a;

    /* renamed from: b */
    public C49209h f127236b;

    /* renamed from: c */
    public String f127237c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f127238d = BuildConfig.FLAVOR;

    /* renamed from: f */
    private int f127239f;

    static {
        C49210i iVar = new C49210i();
        f127233e = iVar;
        C62942bv.registerDefaultInstance(C49210i.class, iVar);
    }

    private C49210i() {
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
                return newMessageInfo(f127233e, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001င\u0000\u0003ဉ\u0002\u0004ဈ\u0003\u0005ဈ\u0004", new Object[]{C10662f.f35572a, "a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C49210i();
            case 4:
                return new C49207f();
            case 5:
                return f127233e;
            case 6:
                C63010eb ebVar = f127234g;
                if (ebVar == null) {
                    synchronized (C49210i.class) {
                        ebVar = f127234g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127233e);
                            f127234g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
