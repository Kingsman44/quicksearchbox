package com.google.p4017at.p4056g.p4057a.p4058a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.at.g.a.a.i */
/* compiled from: PG */
public final class C54057i extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C54057i f141819g;

    /* renamed from: i */
    private static volatile C63010eb f141820i;

    /* renamed from: a */
    public int f141821a;

    /* renamed from: b */
    public String f141822b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public String f141823c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C53970ae f141824d;

    /* renamed from: e */
    public C53992b f141825e;

    /* renamed from: f */
    public String f141826f = BuildConfig.FLAVOR;

    /* renamed from: h */
    private byte f141827h = 2;

    static {
        C54057i iVar = new C54057i();
        f141819g = iVar;
        C62942bv.registerDefaultInstance(C54057i.class, iVar);
    }

    private C54057i() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f141827h);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f141827h = b;
                return null;
            case 2:
                return newMessageInfo(f141819g, "\u0000\u0006\u0000\u0000\u0001\u0006\u0006\u0000\u0000\u0001\u0001\u0004\u0002Ȉ\u0003\t\u0004Љ\u0005Ȉ\u0006Ȉ", new Object[]{"a", "b", "d", "e", C45240c.f118157a, C10662f.f35572a});
            case 3:
                return new C54057i();
            case 4:
                return new C54056h();
            case 5:
                return f141819g;
            case 6:
                C63010eb ebVar = f141820i;
                if (ebVar == null) {
                    synchronized (C54057i.class) {
                        ebVar = f141820i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f141819g);
                            f141820i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
