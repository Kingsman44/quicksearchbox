package com.google.p3562ao.p3563a.p3568d;

import com.evernote.android.state.BuildConfig;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.ao.a.d.g */
/* compiled from: PG */
public final class C45569g extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C45569g f119095c;

    /* renamed from: d */
    private static volatile C63010eb f119096d;

    /* renamed from: a */
    public String f119097a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f119098b = C62942bv.emptyProtobufList();

    static {
        C45569g gVar = new C45569g();
        f119095c = gVar;
        C62942bv.registerDefaultInstance(C45569g.class, gVar);
    }

    private C45569g() {
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
                return newMessageInfo(f119095c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002Ț", new Object[]{"a", "b"});
            case 3:
                return new C45569g();
            case 4:
                return new C45568f();
            case 5:
                return f119095c;
            case 6:
                C63010eb ebVar = f119096d;
                if (ebVar == null) {
                    synchronized (C45569g.class) {
                        ebVar = f119096d;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f119095c);
                            f119096d = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
