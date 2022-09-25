package com.google.assistant.p3897e.p3917i.p3918a;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C52393qb;
import com.google.assistant.p3897e.p3921j.C52397qf;
import com.google.assistant.p3897e.p3921j.C52403ql;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protos.p4883as.p4884a.C63777f;

/* renamed from: com.google.assistant.e.i.a.j */
/* compiled from: PG */
public final class C51473j extends C62942bv implements C63001dt {

    /* renamed from: i */
    public static final C51473j f134090i;

    /* renamed from: l */
    private static volatile C63010eb f134091l;

    /* renamed from: a */
    public int f134092a;

    /* renamed from: b */
    public int f134093b = 0;

    /* renamed from: c */
    public Object f134094c;

    /* renamed from: d */
    public String f134095d = BuildConfig.FLAVOR;

    /* renamed from: e */
    public C52403ql f134096e;

    /* renamed from: f */
    public int f134097f;

    /* renamed from: g */
    public long f134098g;

    /* renamed from: h */
    public String f134099h = BuildConfig.FLAVOR;

    /* renamed from: j */
    private C63777f f134100j;

    /* renamed from: k */
    private byte f134101k = 2;

    static {
        C51473j jVar = new C51473j();
        f134090i = jVar;
        C62942bv.registerDefaultInstance(C51473j.class, jVar);
    }

    private C51473j() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f134101k);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f134101k = b;
                return null;
            case 2:
                return newMessageInfo(f134090i, "\u0001\b\u0001\u0001\u0001\t\b\u0000\u0000\u0001\u0001ဈ\u0000\u0002ဉ\u0001\u0003ြ\u0000\u0004ြ\u0000\u0005ဌ\u0004\u0006ဂ\u0005\u0007ဈ\u0006\tᐉ\b", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C52393qb.class, C52397qf.class, C10662f.f35572a, C51419h.m86181b(), C30325g.f82003a, C19618h.f54585a, "j"});
            case 3:
                return new C51473j();
            case 4:
                return new C51446i();
            case 5:
                return f134090i;
            case 6:
                C63010eb ebVar = f134091l;
                if (ebVar == null) {
                    synchronized (C51473j.class) {
                        ebVar = f134091l;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f134090i);
                            f134091l = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
