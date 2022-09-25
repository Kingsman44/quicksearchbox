package com.google.assistant.p3838ao.p3839a.p3845e;

import com.evernote.android.state.BuildConfig;
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

/* renamed from: com.google.assistant.ao.a.e.co */
/* compiled from: PG */
public final class C49585co extends C62942bv implements C63001dt {

    /* renamed from: j */
    public static final C49585co f127946j;

    /* renamed from: l */
    private static volatile C63010eb f127947l;

    /* renamed from: a */
    public int f127948a;

    /* renamed from: b */
    public int f127949b = 0;

    /* renamed from: c */
    public Object f127950c;

    /* renamed from: d */
    public String f127951d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public int f127952e;

    /* renamed from: f */
    public C62971cq f127953f = emptyProtobufList();

    /* renamed from: g */
    public C49593cw f127954g;

    /* renamed from: h */
    public C49538av f127955h;

    /* renamed from: i */
    public C62971cq f127956i = emptyProtobufList();

    /* renamed from: k */
    private byte f127957k = 2;

    static {
        C49585co coVar = new C49585co();
        f127946j = coVar;
        C62942bv.registerDefaultInstance(C49585co.class, coVar);
    }

    private C49585co() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f127957k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f127957k = b;
                return null;
            case 2:
                return newMessageInfo(f127946j, "\u0001\b\u0001\u0001\u0001\b\b\u0000\u0002\u0004\u0001ဈ\u0000\u0002င\u0001\u0003ᐼ\u0000\u0004ᐼ\u0000\u0005Л\u0006ဉ\u0004\u0007ဉ\u0005\bЛ", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C49626q.class, C49626q.class, C10662f.f35572a, C49584cn.class, C30325g.f82003a, C19618h.f54585a, "i", C49628s.class});
            case 3:
                return new C49585co();
            case 4:
                return new C49582cl();
            case 5:
                return f127946j;
            case 6:
                C63010eb ebVar = f127947l;
                if (ebVar == null) {
                    synchronized (C49585co.class) {
                        ebVar = f127947l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f127946j);
                            f127947l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
