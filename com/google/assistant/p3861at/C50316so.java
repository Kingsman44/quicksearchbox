package com.google.assistant.p3861at;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.so */
/* compiled from: PG */
public final class C50316so extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C62962ci f130951f = new C50312sk();

    /* renamed from: g */
    public static final C50316so f130952g;

    /* renamed from: i */
    private static volatile C63010eb f130953i;

    /* renamed from: a */
    public int f130954a;

    /* renamed from: b */
    public String f130955b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f130956c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f130957d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62961ch f130958e = emptyIntList();

    /* renamed from: h */
    private int f130959h;

    static {
        C50316so soVar = new C50316so();
        f130952g = soVar;
        C62942bv.registerDefaultInstance(C50316so.class, soVar);
    }

    private C50316so() {
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
                return newMessageInfo(f130952g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0000\u0001င\u0000\u0002ဈ\u0001\u0004ဈ\u0002\u0005ဈ\u0003\u0006\u001e", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, "d", "e", C50315sn.m85807b()});
            case 3:
                return new C50316so();
            case 4:
                return new C50313sl();
            case 5:
                return f130952g;
            case 6:
                C63010eb ebVar = f130953i;
                if (ebVar == null) {
                    synchronized (C50316so.class) {
                        ebVar = f130953i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f130952g);
                            f130953i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
