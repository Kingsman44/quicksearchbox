package com.google.android.apps.gsa.nga.shared.p6275aa.p6287i;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.i.b */
/* compiled from: PG */
public final class C80454b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80454b f220816c;

    /* renamed from: d */
    private static volatile C63010eb f220817d;

    /* renamed from: a */
    public int f220818a;

    /* renamed from: b */
    public String f220819b = BuildConfig.FLAVOR;

    static {
        C80454b bVar = new C80454b();
        f220816c = bVar;
        C62942bv.registerDefaultInstance(C80454b.class, bVar);
    }

    private C80454b() {
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
                return newMessageInfo(f220816c, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဈ\u0000", new Object[]{"a", "b"});
            case 3:
                return new C80454b();
            case 4:
                return new C80453a();
            case 5:
                return f220816c;
            case 6:
                C63010eb ebVar = f220817d;
                if (ebVar == null) {
                    synchronized (C80454b.class) {
                        ebVar = f220817d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220816c);
                            f220817d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
