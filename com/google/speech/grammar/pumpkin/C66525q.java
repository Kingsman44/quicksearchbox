package com.google.speech.grammar.pumpkin;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.speech.grammar.pumpkin.q */
/* compiled from: PG */
public final class C66525q extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C66525q f180929f;

    /* renamed from: h */
    private static volatile C63010eb f180930h;

    /* renamed from: a */
    public int f180931a;

    /* renamed from: b */
    public String f180932b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f180933c = emptyProtobufList();

    /* renamed from: d */
    public float f180934d;

    /* renamed from: e */
    public String f180935e = BuildConfig.FLAVOR;

    /* renamed from: g */
    private byte f180936g = 2;

    static {
        C66525q qVar = new C66525q();
        f180929f = qVar;
        C62942bv.registerDefaultInstance(C66525q.class, qVar);
    }

    private C66525q() {
    }

    /* renamed from: a */
    public final void mo59669a() {
        C62971cq cqVar = this.f180933c;
        if (!cqVar.mo58948c()) {
            this.f180933c = C62942bv.mutableCopy(cqVar);
        }
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f180936g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f180936g = b;
                return null;
            case 2:
                return newMessageInfo(f180929f, "\u0001\u0004\u0000\u0001\u0002\u0005\u0004\u0000\u0001\u0002\u0002ᔈ\u0001\u0003Л\u0004ခ\u0002\u0005ဈ\u0003", new Object[]{"a", "b", C45240c.f118157a, C66521m.class, "d", "e"});
            case 3:
                return new C66525q();
            case 4:
                return new C66524p();
            case 5:
                return f180929f;
            case 6:
                C63010eb ebVar = f180930h;
                if (ebVar == null) {
                    synchronized (C66525q.class) {
                        ebVar = f180930h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f180929f);
                            f180930h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
