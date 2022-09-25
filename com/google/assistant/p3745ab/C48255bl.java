package com.google.assistant.p3745ab;

import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.ab.bl */
/* compiled from: PG */
public final class C48255bl extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C48255bl f124817a;

    /* renamed from: e */
    private static volatile C63010eb f124818e;

    /* renamed from: b */
    private C62995dn f124819b = C62995dn.f170057a;

    /* renamed from: c */
    private C62995dn f124820c = C62995dn.f170057a;

    /* renamed from: d */
    private byte f124821d = 2;

    static {
        C48255bl blVar = new C48255bl();
        f124817a = blVar;
        C62942bv.registerDefaultInstance(C48255bl.class, blVar);
    }

    private C48255bl() {
        emptyIntList();
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f124821d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f124821d = b;
                return null;
            case 2:
                return newMessageInfo(f124817a, "\u0001\u0002\u0000\u0000\u0011\u0012\u0002\u0002\u0000\u0000\u00112\u00122", new Object[]{"b", C48253bj.f124815a, C45240c.f118157a, C48254bk.f124816a});
            case 3:
                return new C48255bl();
            case 4:
                return new C48252bi();
            case 5:
                return f124817a;
            case 6:
                C63010eb ebVar = f124818e;
                if (ebVar == null) {
                    synchronized (C48255bl.class) {
                        ebVar = f124818e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f124817a);
                            f124818e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
