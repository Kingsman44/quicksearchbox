package com.google.android.libraries.assistant.p1594s.p1599c;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.c.h */
/* compiled from: PG */
public final class C19206h extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C19206h f53775f;

    /* renamed from: g */
    private static volatile C63010eb f53776g;

    /* renamed from: a */
    public int f53777a;

    /* renamed from: b */
    public int f53778b;

    /* renamed from: c */
    public String f53779c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f53780d = emptyProtobufList();

    /* renamed from: e */
    public C62961ch f53781e = emptyIntList();

    static {
        C19206h hVar = new C19206h();
        f53775f = hVar;
        C62942bv.registerDefaultInstance(C19206h.class, hVar);
    }

    private C19206h() {
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
                return newMessageInfo(f53775f, "\u0001\u0004\u0000\u0001\u0001\u000b\u0004\u0000\u0002\u0000\u0001ဋ\u0000\u0002ဈ\u0001\u0004\u0016\u000b\u001b", new Object[]{"a", "b", C45240c.f118157a, "e", "d", C19204f.class});
            case 3:
                return new C19206h();
            case 4:
                return new C19205g();
            case 5:
                return f53775f;
            case 6:
                C63010eb ebVar = f53776g;
                if (ebVar == null) {
                    synchronized (C19206h.class) {
                        ebVar = f53776g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53775f);
                            f53776g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
