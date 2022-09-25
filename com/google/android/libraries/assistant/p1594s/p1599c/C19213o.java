package com.google.android.libraries.assistant.p1594s.p1599c;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C62995dn;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.s.c.o */
/* compiled from: PG */
public final class C19213o extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C19213o f53797f;

    /* renamed from: h */
    private static volatile C63010eb f53798h;

    /* renamed from: a */
    public int f53799a;

    /* renamed from: b */
    public C62961ch f53800b = emptyIntList();

    /* renamed from: c */
    public String f53801c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C62971cq f53802d = emptyProtobufList();

    /* renamed from: e */
    public String f53803e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private C62995dn f53804g = C62995dn.f170057a;

    static {
        C19213o oVar = new C19213o();
        f53797f = oVar;
        C62942bv.registerDefaultInstance(C19213o.class, oVar);
    }

    private C19213o() {
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
                return newMessageInfo(f53797f, "\u0001\u0005\u0000\u0001\u0001\u0010\u0005\u0001\u0002\u0000\u0001\u001e\u0002ဈ\u0000\f\u001b\u000f2\u0010ဈ\u0004", new Object[]{"a", "b", C19216r.f53811a, C45240c.f118157a, "d", C19206h.class, C30325g.f82003a, C19212n.f53796a, "e"});
            case 3:
                return new C19213o();
            case 4:
                return new C19211m();
            case 5:
                return f53797f;
            case 6:
                C63010eb ebVar = f53798h;
                if (ebVar == null) {
                    synchronized (C19213o.class) {
                        ebVar = f53798h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f53797f);
                            f53798h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
