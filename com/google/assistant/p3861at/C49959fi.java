package com.google.assistant.p3861at;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.at.fi */
/* compiled from: PG */
public final class C49959fi extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C49959fi f129877f;

    /* renamed from: h */
    private static volatile C63010eb f129878h;

    /* renamed from: a */
    public boolean f129879a;

    /* renamed from: b */
    public C62971cq f129880b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public boolean f129881c;

    /* renamed from: d */
    public boolean f129882d;

    /* renamed from: e */
    public C49986gi f129883e;

    /* renamed from: g */
    private int f129884g;

    static {
        C49959fi fiVar = new C49959fi();
        f129877f = fiVar;
        C62942bv.registerDefaultInstance(C49959fi.class, fiVar);
    }

    private C49959fi() {
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
                return newMessageInfo(f129877f, "\u0001\u0005\u0000\u0001\u0004\t\u0005\u0000\u0001\u0000\u0004ဇ\u0002\u0005\u001a\u0007ဇ\u0004\bဇ\u0005\tဉ\u0006", new Object[]{C30325g.f82003a, "a", "b", C45240c.f118157a, "d", "e"});
            case 3:
                return new C49959fi();
            case 4:
                return new C49958fh();
            case 5:
                return f129877f;
            case 6:
                C63010eb ebVar = f129878h;
                if (ebVar == null) {
                    synchronized (C49959fi.class) {
                        ebVar = f129878h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f129877f);
                            f129878h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
