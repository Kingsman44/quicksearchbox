package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56226ag;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56230ak;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56242aw;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4963bf.p4964a.p4965a.C64597bs;

/* renamed from: com.google.at.g.a.a.cs */
/* compiled from: PG */
public final class C54038cs extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C54038cs f141782f;

    /* renamed from: g */
    private static volatile C63010eb f141783g;

    /* renamed from: a */
    public C56242aw f141784a;

    /* renamed from: b */
    public C56226ag f141785b;

    /* renamed from: c */
    public C62971cq f141786c = emptyProtobufList();

    /* renamed from: d */
    public String f141787d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C64597bs f141788e;

    static {
        C54038cs csVar = new C54038cs();
        f141782f = csVar;
        C62942bv.registerDefaultInstance(C54038cs.class, csVar);
    }

    private C54038cs() {
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
                return newMessageInfo(f141782f, "\u0000\u0005\u0000\u0000\u0001\u0007\u0005\u0000\u0001\u0000\u0001\u001b\u0002\t\u0003\t\u0004Ȉ\u0007\t", new Object[]{C45240c.f118157a, C56230ak.class, "b", "a", "d", "e"});
            case 3:
                return new C54038cs();
            case 4:
                return new C54037cr();
            case 5:
                return f141782f;
            case 6:
                C63010eb ebVar = f141783g;
                if (ebVar == null) {
                    synchronized (C54038cs.class) {
                        ebVar = f141783g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141782f);
                            f141783g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
