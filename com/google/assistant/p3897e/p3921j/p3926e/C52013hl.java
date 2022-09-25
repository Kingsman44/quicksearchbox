package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.hl */
/* compiled from: PG */
public final class C52013hl extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52013hl f136508e;

    /* renamed from: g */
    private static volatile C63010eb f136509g;

    /* renamed from: a */
    public int f136510a;

    /* renamed from: b */
    public String f136511b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C52015hn f136512c;

    /* renamed from: d */
    public boolean f136513d;

    /* renamed from: f */
    private byte f136514f = 2;

    static {
        C52013hl hlVar = new C52013hl();
        f136508e = hlVar;
        C62942bv.registerDefaultInstance(C52013hl.class, hlVar);
    }

    private C52013hl() {
        emptyProtobufList();
        emptyProtobufList();
        C62942bv.emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136514f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136514f = b;
                return null;
            case 2:
                return newMessageInfo(f136508e, "\u0001\u0003\u0000\u0001\u0001\u0007\u0003\u0000\u0000\u0001\u0001ဈ\u0000\u0003ᐉ\u0002\u0007ဇ\u0003", new Object[]{"a", "b", C45240c.f118157a, "d"});
            case 3:
                return new C52013hl();
            case 4:
                return new C52012hk();
            case 5:
                return f136508e;
            case 6:
                C63010eb ebVar = f136509g;
                if (ebVar == null) {
                    synchronized (C52013hl.class) {
                        ebVar = f136509g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136508e);
                            f136509g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
