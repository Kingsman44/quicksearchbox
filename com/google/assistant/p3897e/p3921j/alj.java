package com.google.assistant.p3897e.p3921j;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import p001a.p002a.p003a.p004a.p005a.p006a.C0002b;
import p001a.p002a.p003a.p004a.p005a.p006a.C0003c;

/* renamed from: com.google.assistant.e.j.alj */
/* compiled from: PG */
public final class alj extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final alj f135325f;

    /* renamed from: g */
    private static volatile C63010eb f135326g;

    /* renamed from: a */
    public int f135327a;

    /* renamed from: b */
    public int f135328b;

    /* renamed from: c */
    public C0002b f135329c;

    /* renamed from: d */
    public float f135330d;

    /* renamed from: e */
    public boolean f135331e;

    static {
        alj alj = new alj();
        f135325f = alj;
        C62942bv.registerDefaultInstance(alj.class, alj);
    }

    private alj() {
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
                return newMessageInfo(f135325f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0000\u0000\u0001ဌ\u0000\u0002ဉ\u0001\u0003ခ\u0002\u0005ဇ\u0004", new Object[]{"a", "b", C0003c.f7a, C45240c.f118157a, "d", "e"});
            case 3:
                return new alj();
            case 4:
                return new ali();
            case 5:
                return f135325f;
            case 6:
                C63010eb ebVar = f135326g;
                if (ebVar == null) {
                    synchronized (alj.class) {
                        ebVar = f135326g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f135325f);
                            f135326g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
