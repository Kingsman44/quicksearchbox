package com.google.assistant.p3820ak;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.ak.m */
/* compiled from: PG */
public final class C49214m extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C49214m f127245g;

    /* renamed from: h */
    private static volatile C63010eb f127246h;

    /* renamed from: a */
    public int f127247a;

    /* renamed from: b */
    public C49212k f127248b;

    /* renamed from: c */
    public String f127249c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63042fg f127250d;

    /* renamed from: e */
    public float f127251e;

    /* renamed from: f */
    public boolean f127252f;

    static {
        C49214m mVar = new C49214m();
        f127245g = mVar;
        C62942bv.registerDefaultInstance(C49214m.class, mVar);
    }

    private C49214m() {
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
                return newMessageInfo(f127245g, "\u0001\u0005\u0000\u0001\u0001\u0007\u0005\u0000\u0000\u0000\u0001ဉ\u0000\u0002ဈ\u0001\u0004ဉ\u0003\u0005ခ\u0004\u0007ဇ\u0005", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C49214m();
            case 4:
                return new C49213l();
            case 5:
                return f127245g;
            case 6:
                C63010eb ebVar = f127246h;
                if (ebVar == null) {
                    synchronized (C49214m.class) {
                        ebVar = f127246h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127245g);
                            f127246h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
