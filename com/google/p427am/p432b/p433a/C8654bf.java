package com.google.p427am.p432b.p433a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.am.b.a.bf */
/* compiled from: PG */
public final class C8654bf extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C8654bf f29945c;

    /* renamed from: d */
    private static volatile C63010eb f29946d;

    /* renamed from: a */
    public int f29947a;

    /* renamed from: b */
    public String f29948b = BuildConfig.FLAVOR;

    static {
        C8654bf bfVar = new C8654bf();
        f29945c = bfVar;
        C62942bv.registerDefaultInstance(C8654bf.class, bfVar);
    }

    private C8654bf() {
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
                return newMessageInfo(f29945c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002Ȉ", new Object[]{"a", "b"});
            case 3:
                return new C8654bf();
            case 4:
                return new C8653be();
            case 5:
                return f29945c;
            case 6:
                C63010eb ebVar = f29946d;
                if (ebVar == null) {
                    synchronized (C8654bf.class) {
                        ebVar = f29946d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f29945c);
                            f29946d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
