package com.google.common.p4552o;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82924fm;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.common.o.ahp */
/* compiled from: PG */
public final class ahp extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final ahp f158769d;

    /* renamed from: e */
    private static volatile C63010eb f158770e;

    /* renamed from: a */
    public int f158771a;

    /* renamed from: b */
    public C62961ch f158772b = emptyIntList();

    /* renamed from: c */
    public String f158773c = BuildConfig.FLAVOR;

    static {
        ahp ahp = new ahp();
        f158769d = ahp;
        C62942bv.registerDefaultInstance(ahp.class, ahp);
    }

    private ahp() {
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
                return newMessageInfo(f158769d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u001e\u0002ဈ\u0000", new Object[]{"a", "b", C82924fm.m132430b(), C45240c.f118157a});
            case 3:
                return new ahp();
            case 4:
                return new aho();
            case 5:
                return f158769d;
            case 6:
                C63010eb ebVar = f158770e;
                if (ebVar == null) {
                    synchronized (ahp.class) {
                        ebVar = f158770e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f158769d);
                            f158770e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
