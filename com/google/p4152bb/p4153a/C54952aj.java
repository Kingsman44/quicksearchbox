package com.google.p4152bb.p4153a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.bb.a.aj */
/* compiled from: PG */
public final class C54952aj extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54952aj f144560c;

    /* renamed from: d */
    private static volatile C63010eb f144561d;

    /* renamed from: a */
    public int f144562a;

    /* renamed from: b */
    public String f144563b = BuildConfig.FLAVOR;

    static {
        C54952aj ajVar = new C54952aj();
        f144560c = ajVar;
        C62942bv.registerDefaultInstance(C54952aj.class, ajVar);
    }

    private C54952aj() {
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
                return newMessageInfo(f144560c, "\u0001\u0001\u0000\u0001\u0002\u0002\u0001\u0000\u0000\u0000\u0002ဈ\u0001", new Object[]{"a", "b"});
            case 3:
                return new C54952aj();
            case 4:
                return new C54951ai();
            case 5:
                return f144560c;
            case 6:
                C63010eb ebVar = f144561d;
                if (ebVar == null) {
                    synchronized (C54952aj.class) {
                        ebVar = f144561d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f144560c);
                            f144561d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
