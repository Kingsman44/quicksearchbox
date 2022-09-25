package com.google.assistant.p3897e.p3921j;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.kk */
/* compiled from: PG */
public final class C52240kk extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C52240kk f137096j;

    /* renamed from: k */
    private static volatile C63010eb f137097k;

    /* renamed from: a */
    public int f137098a;

    /* renamed from: b */
    public C62971cq f137099b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public boolean f137100c;

    /* renamed from: d */
    public boolean f137101d;

    /* renamed from: e */
    public boolean f137102e;

    /* renamed from: f */
    public boolean f137103f;

    /* renamed from: g */
    public boolean f137104g;

    /* renamed from: h */
    public boolean f137105h;

    /* renamed from: i */
    public boolean f137106i;

    static {
        C52240kk kkVar = new C52240kk();
        f137096j = kkVar;
        C62942bv.registerDefaultInstance(C52240kk.class, kkVar);
    }

    private C52240kk() {
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
                return newMessageInfo(f137096j, "\u0001\b\u0000\u0001\u0001\b\b\u0000\u0001\u0000\u0001ဇ\u0000\u0002ဇ\u0001\u0003ဇ\u0002\u0004ဇ\u0003\u0005ဇ\u0004\u0006ဇ\u0005\u0007\u001a\bဇ\u0006", new Object[]{"a", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "b", "i"});
            case 3:
                return new C52240kk();
            case 4:
                return new C52239kj();
            case 5:
                return f137096j;
            case 6:
                C63010eb ebVar = f137097k;
                if (ebVar == null) {
                    synchronized (C52240kk.class) {
                        ebVar = f137097k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f137096j);
                            f137097k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
