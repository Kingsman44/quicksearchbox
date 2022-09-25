package com.google.assistant.p3897e.p3921j;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.akj */
/* compiled from: PG */
public final class akj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final akj f135267f;

    /* renamed from: g */
    private static volatile C63010eb f135268g;

    /* renamed from: a */
    public int f135269a;

    /* renamed from: b */
    public String f135270b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f135271c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public String f135272d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C62971cq f135273e = emptyProtobufList();

    static {
        akj akj = new akj();
        f135267f = akj;
        C62942bv.registerDefaultInstance(akj.class, akj);
    }

    private akj() {
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
                return newMessageInfo(f135267f, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001ဈ\u0000\u0002ဈ\u0001\u0003ဈ\u0002\u0004\u001b", new Object[]{"a", "b", C45240c.f118157a, "d", "e", aki.class});
            case 3:
                return new akj();
            case 4:
                return new akf();
            case 5:
                return f135267f;
            case 6:
                C63010eb ebVar = f135268g;
                if (ebVar == null) {
                    synchronized (akj.class) {
                        ebVar = f135268g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135267f);
                            f135268g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
