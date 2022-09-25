package com.google.android.apps.search.assistant.platform.pcp.p9329f;

import com.google.p381aj.p382a.p383a.p384a.C8242v;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.apps.search.assistant.platform.pcp.f.v */
/* compiled from: PG */
public final class C123793v extends C62942bv implements C63001dt {

    /* renamed from: b */
    public static final C123793v f341983b;

    /* renamed from: c */
    public static final C62940bt f341984c;

    /* renamed from: d */
    public static final C62940bt f341985d;

    /* renamed from: f */
    private static volatile C63010eb f341986f;

    /* renamed from: a */
    public C62971cq f341987a = emptyProtobufList();

    /* renamed from: e */
    private byte f341988e = 2;

    static {
        C123793v vVar = new C123793v();
        f341983b = vVar;
        C62942bv.registerDefaultInstance(C123793v.class, vVar);
        C123793v vVar2 = vVar;
        C123793v vVar3 = vVar;
        f341984c = C62942bv.newSingularGeneratedExtension(C123777f.f341922a, vVar2, vVar3, (C62958ce) null, 337455777, C63066gd.MESSAGE, C123793v.class);
        f341985d = C62942bv.newSingularGeneratedExtension(C123777f.f341922a, vVar2, vVar3, (C62958ce) null, 337456160, C63066gd.MESSAGE, C123793v.class);
    }

    private C123793v() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f341988e);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f341988e = b;
                return null;
            case 2:
                return newMessageInfo(f341983b, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"a", C8242v.class});
            case 3:
                return new C123793v();
            case 4:
                return new C123792u();
            case 5:
                return f341983b;
            case 6:
                C63010eb ebVar = f341986f;
                if (ebVar == null) {
                    synchronized (C123793v.class) {
                        ebVar = f341986f;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f341983b);
                            f341986f = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
