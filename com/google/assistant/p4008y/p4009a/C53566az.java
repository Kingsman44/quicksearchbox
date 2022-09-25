package com.google.assistant.p4008y.p4009a;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4479cg.C58075g;
import com.google.p4479cg.C58077i;
import com.google.p4479cg.C58081m;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62962ci;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.y.a.az */
/* compiled from: PG */
public final class C53566az extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C62962ci f140582e = new C53564ax();

    /* renamed from: h */
    public static final C53566az f140583h;

    /* renamed from: i */
    private static volatile C63010eb f140584i;

    /* renamed from: a */
    public int f140585a;

    /* renamed from: b */
    public C58075g f140586b;

    /* renamed from: c */
    public C58075g f140587c;

    /* renamed from: d */
    public C62961ch f140588d = emptyIntList();

    /* renamed from: f */
    public C58081m f140589f;

    /* renamed from: g */
    public C58081m f140590g;

    static {
        C53566az azVar = new C53566az();
        f140583h = azVar;
        C62942bv.registerDefaultInstance(C53566az.class, azVar);
    }

    private C53566az() {
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
                return newMessageInfo(f140583h, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001ဉ\u0000\u0002ဉ\u0001\u0003\u001e\u0004ဉ\u0002\u0005ဉ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C58077i.m88833b(), C10662f.f35572a, C30325g.f82003a});
            case 3:
                return new C53566az();
            case 4:
                return new C53565ay();
            case 5:
                return f140583h;
            case 6:
                C63010eb ebVar = f140584i;
                if (ebVar == null) {
                    synchronized (C53566az.class) {
                        ebVar = f140584i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f140583h);
                            f140584i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
