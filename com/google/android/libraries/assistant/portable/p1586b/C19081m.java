package com.google.android.libraries.assistant.portable.p1586b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.portable.b.m */
/* compiled from: PG */
public final class C19081m extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C19081m f53515g;

    /* renamed from: h */
    private static volatile C63010eb f53516h;

    /* renamed from: a */
    public int f53517a;

    /* renamed from: b */
    public String f53518b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C19066aj f53519c;

    /* renamed from: d */
    public boolean f53520d;

    /* renamed from: e */
    public C19069am f53521e;

    /* renamed from: f */
    public String f53522f;

    static {
        C19081m mVar = new C19081m();
        f53515g = mVar;
        C62942bv.registerDefaultInstance(C19081m.class, mVar);
    }

    private C19081m() {
        emptyProtobufList();
        this.f53522f = BuildConfig.FLAVOR;
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
                return newMessageInfo(f53515g, "\u0001\u0005\u0000\u0001\u0001\b\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0005ဉ\u0003\u0006ဇ\u0004\u0007ဉ\u0005\bဈ\u0006", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C19081m();
            case 4:
                return new C19080l();
            case 5:
                return f53515g;
            case 6:
                C63010eb ebVar = f53516h;
                if (ebVar == null) {
                    synchronized (C19081m.class) {
                        ebVar = f53516h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53515g);
                            f53516h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
