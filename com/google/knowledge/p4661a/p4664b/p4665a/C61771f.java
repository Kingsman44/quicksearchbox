package com.google.knowledge.p4661a.p4664b.p4665a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.knowledge.a.b.a.f */
/* compiled from: PG */
public final class C61771f extends C62942bv implements C63001dt {

    /* renamed from: a */
    public static final C61771f f166855a;

    /* renamed from: h */
    private static volatile C63010eb f166856h;

    /* renamed from: b */
    private int f166857b;

    /* renamed from: c */
    private C62995dn f166858c = C62995dn.f170057a;

    /* renamed from: d */
    private C61752n f166859d;

    /* renamed from: e */
    private C61774i f166860e;

    /* renamed from: f */
    private C62995dn f166861f = C62995dn.f170057a;

    /* renamed from: g */
    private byte f166862g = 2;

    static {
        C61771f fVar = new C61771f();
        f166855a = fVar;
        C62942bv.registerDefaultInstance(C61771f.class, fVar);
    }

    private C61771f() {
        emptyIntList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f166862g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f166862g = b;
                return null;
            case 2:
                return newMessageInfo(f166855a, "\u0001\u0004\u0000\u0001&B\u0004\u0002\u0000\u0001&22ᐉ\u001232Bဉ\u0014", new Object[]{"b", C45240c.f118157a, C61769d.f166853a, "d", C10662f.f35572a, C61770e.f166854a, "e"});
            case 3:
                return new C61771f();
            case 4:
                return new C61768c();
            case 5:
                return f166855a;
            case 6:
                C63010eb ebVar = f166856h;
                if (ebVar == null) {
                    synchronized (C61771f.class) {
                        ebVar = f166856h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f166855a);
                            f166856h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
