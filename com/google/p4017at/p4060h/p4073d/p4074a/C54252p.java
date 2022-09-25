package com.google.p4017at.p4060h.p4073d.p4074a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.h.d.a.p */
/* compiled from: PG */
public final class C54252p extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C54252p f142450c;

    /* renamed from: d */
    private static volatile C63010eb f142451d;

    /* renamed from: a */
    public int f142452a;

    /* renamed from: b */
    public String f142453b = BuildConfig.FLAVOR;

    static {
        C54252p pVar = new C54252p();
        f142450c = pVar;
        C62942bv.registerDefaultInstance(C54252p.class, pVar);
    }

    private C54252p() {
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
                return newMessageInfo(f142450c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C54252p();
            case 4:
                return new C54251o();
            case 5:
                return f142450c;
            case 6:
                C63010eb ebVar = f142451d;
                if (ebVar == null) {
                    synchronized (C54252p.class) {
                        ebVar = f142451d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f142450c);
                            f142451d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
