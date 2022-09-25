package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.C50871b;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.i.a.l */
/* compiled from: PG */
public final class C51527l extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C51527l f134273f;

    /* renamed from: h */
    private static volatile C63010eb f134274h;

    /* renamed from: a */
    public int f134275a;

    /* renamed from: b */
    public C62971cq f134276b = emptyProtobufList();

    /* renamed from: c */
    public long f134277c;

    /* renamed from: d */
    public C62971cq f134278d = emptyProtobufList();

    /* renamed from: e */
    public String f134279e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f134280g = 2;

    static {
        C51527l lVar = new C51527l();
        f134273f = lVar;
        C62942bv.registerDefaultInstance(C51527l.class, lVar);
    }

    private C51527l() {
    }

    /* renamed from: a */
    public final void mo53633a() {
        C62971cq cqVar = this.f134276b;
        if (!cqVar.mo58948c()) {
            this.f134276b = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134280g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134280g = b;
                return null;
            case 2:
                return newMessageInfo(f134273f, "\u0001\u0004\u0000\u0001\u0001\u0005\u0004\u0000\u0002\u0001\u0001Л\u0002ဂ\u0001\u0004\u001b\u0005ဈ\u0003", new Object[]{"a", "b", C51473j.class, C45240c.f118157a, "d", C50871b.class, "e"});
            case 3:
                return new C51527l();
            case 4:
                return new C51500k();
            case 5:
                return f134273f;
            case 6:
                C63010eb ebVar = f134274h;
                if (ebVar == null) {
                    synchronized (C51527l.class) {
                        ebVar = f134274h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134273f);
                            f134274h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
