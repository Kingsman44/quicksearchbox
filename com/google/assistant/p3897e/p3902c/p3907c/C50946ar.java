package com.google.assistant.p3897e.p3902c.p3907c;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63042fg;

/* renamed from: com.google.assistant.e.c.c.ar */
/* compiled from: PG */
public final class C50946ar extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C50946ar f132618i;

    /* renamed from: k */
    private static volatile C63010eb f132619k;

    /* renamed from: a */
    public int f132620a;

    /* renamed from: b */
    public int f132621b = 0;

    /* renamed from: c */
    public Object f132622c;

    /* renamed from: d */
    public C51141hx f132623d;

    /* renamed from: e */
    public C63042fg f132624e;

    /* renamed from: f */
    public int f132625f;

    /* renamed from: g */
    public int f132626g = 1;

    /* renamed from: h */
    public boolean f132627h;

    /* renamed from: j */
    private byte f132628j = 2;

    static {
        C50946ar arVar = new C50946ar();
        f132618i = arVar;
        C62942bv.registerDefaultInstance(C50946ar.class, arVar);
    }

    private C50946ar() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f132628j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f132628j = b;
                return null;
            case 2:
                return newMessageInfo(f132618i, "\u0001\u0007\u0001\u0001\u0001\u0007\u0007\u0000\u0000\u0001\u0001ᐉ\u0000\u0002ြ\u0000\u0003ျ\u0000\u0004ဉ\u0003\u0005ဌ\u0004\u0006ဌ\u0005\u0007ဇ\u0006", new Object[]{C45240c.f118157a, "b", "a", "d", C50942an.class, "e", C10662f.f35572a, C50939ak.f132612a, C30325g.f82003a, C50944ap.f132617a, C19618h.f54585a});
            case 3:
                return new C50946ar();
            case 4:
                return new C50943ao();
            case 5:
                return f132618i;
            case 6:
                C63010eb ebVar = f132619k;
                if (ebVar == null) {
                    synchronized (C50946ar.class) {
                        ebVar = f132619k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f132618i);
                            f132619k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
