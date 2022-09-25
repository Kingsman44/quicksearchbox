package com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.d.a.b */
/* compiled from: PG */
public final class C80206b extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80206b f220056c;

    /* renamed from: e */
    private static volatile C63010eb f220057e;

    /* renamed from: a */
    public String f220058a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public long f220059b;

    /* renamed from: d */
    private int f220060d;

    static {
        C80206b bVar = new C80206b();
        f220056c = bVar;
        C62942bv.registerDefaultInstance(C80206b.class, bVar);
    }

    private C80206b() {
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
                return newMessageInfo(f220056c, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001ဈ\u0000\u0002ဂ\u0001", new Object[]{"d", "a", "b"});
            case 3:
                return new C80206b();
            case 4:
                return new C80179a();
            case 5:
                return f220056c;
            case 6:
                C63010eb ebVar = f220057e;
                if (ebVar == null) {
                    synchronized (C80206b.class) {
                        ebVar = f220057e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220056c);
                            f220057e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
