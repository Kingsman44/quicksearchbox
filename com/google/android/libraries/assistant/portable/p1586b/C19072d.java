package com.google.android.libraries.assistant.portable.p1586b;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.portable.b.d */
/* compiled from: PG */
public final class C19072d extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C19072d f53497f;

    /* renamed from: h */
    private static volatile C63010eb f53498h;

    /* renamed from: a */
    public String f53499a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public int f53500b;

    /* renamed from: c */
    public int f53501c;

    /* renamed from: d */
    public float f53502d;

    /* renamed from: e */
    public String f53503e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private int f53504g;

    static {
        C19072d dVar = new C19072d();
        f53497f = dVar;
        C62942bv.registerDefaultInstance(C19072d.class, dVar);
    }

    private C19072d() {
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
                return newMessageInfo(f53497f, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဋ\u0001\u0003ဋ\u0002\u0004ခ\u0003\u0005ဈ\u0004", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C19072d();
            case 4:
                return new C19071c();
            case 5:
                return f53497f;
            case 6:
                C63010eb ebVar = f53498h;
                if (ebVar == null) {
                    synchronized (C19072d.class) {
                        ebVar = f53498h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53497f);
                            f53498h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
