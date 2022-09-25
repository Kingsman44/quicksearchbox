package com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6283b;

import com.evernote.android.state.BuildConfig;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.apps.gsa.nga.shared.aa.e.b.e */
/* compiled from: PG */
public final class C80375e extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C80375e f220543c;

    /* renamed from: e */
    private static volatile C63010eb f220544e;

    /* renamed from: a */
    public String f220545a = BuildConfig.FLAVOR;

    /* renamed from: b */
    public C62971cq f220546b = emptyProtobufList();

    /* renamed from: d */
    private byte f220547d = 2;

    static {
        C80375e eVar = new C80375e();
        f220543c = eVar;
        C62942bv.registerDefaultInstance(C80375e.class, eVar);
    }

    private C80375e() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f220547d);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f220547d = b;
                return null;
            case 2:
                return newMessageInfo(f220543c, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0001\u0001\u0001Ȉ\u0002Л", new Object[]{"a", "b", C61746h.class});
            case 3:
                return new C80375e();
            case 4:
                return new C80374d();
            case 5:
                return f220543c;
            case 6:
                C63010eb ebVar = f220544e;
                if (ebVar == null) {
                    synchronized (C80375e.class) {
                        ebVar = f220544e;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f220543c);
                            f220544e = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
