package com.google.android.libraries.search.p2904c.p2952o;

import com.google.android.libraries.search.p2904c.C37612fx;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62964ck;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.search.c.o.b */
/* compiled from: PG */
public final class C37907b extends C62942bv implements C63001dt {

    /* renamed from: d */
    public static final C37907b f100487d;

    /* renamed from: e */
    public static final C62940bt f100488e;

    /* renamed from: f */
    private static volatile C63010eb f100489f;

    /* renamed from: a */
    public int f100490a;

    /* renamed from: b */
    public long f100491b;

    /* renamed from: c */
    public C62964ck f100492c = emptyLongList();

    static {
        C37907b bVar = new C37907b();
        f100487d = bVar;
        C62942bv.registerDefaultInstance(C37907b.class, bVar);
        f100488e = C62942bv.newSingularGeneratedExtension(C37612fx.f99944d, bVar, bVar, (C62958ce) null, 10001, C63066gd.MESSAGE, C37907b.class);
    }

    private C37907b() {
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
                return newMessageInfo(f100487d, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001ဂ\u0000\u0002%", new Object[]{"a", "b", C45240c.f118157a});
            case 3:
                return new C37907b();
            case 4:
                return new C37904a();
            case 5:
                return f100487d;
            case 6:
                C63010eb ebVar = f100489f;
                if (ebVar == null) {
                    synchronized (C37907b.class) {
                        ebVar = f100489f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f100487d);
                            f100489f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
