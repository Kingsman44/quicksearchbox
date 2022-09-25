package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.assistant.p3897e.p3921j.C51805du;
import com.google.assistant.p3897e.p3921j.C52533vg;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.assistant.e.j.e.il */
/* compiled from: PG */
public final class C52040il extends C62942bv implements C63001dt {

    /* renamed from: e */
    public static final C52040il f136585e;

    /* renamed from: g */
    private static volatile C63010eb f136586g;

    /* renamed from: a */
    public int f136587a;

    /* renamed from: b */
    public String f136588b = BuildConfig.FLAVOR;

    /* renamed from: c */
    public C62971cq f136589c;

    /* renamed from: d */
    public C51805du f136590d;

    /* renamed from: f */
    private byte f136591f = 2;

    static {
        C52040il ilVar = new C52040il();
        f136585e = ilVar;
        C62942bv.registerDefaultInstance(C52040il.class, ilVar);
    }

    private C52040il() {
        emptyProtobufList();
        this.f136589c = emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f136591f);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f136591f = b;
                return null;
            case 2:
                return newMessageInfo(f136585e, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0001\u0001\u0001ဈ\u0000\u0003Л\u0004ဉ\u0001", new Object[]{"a", "b", C45240c.f118157a, C52533vg.class, "d"});
            case 3:
                return new C52040il();
            case 4:
                return new C52039ik();
            case 5:
                return f136585e;
            case 6:
                C63010eb ebVar = f136586g;
                if (ebVar == null) {
                    synchronized (C52040il.class) {
                        ebVar = f136586g;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136585e);
                            f136586g = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
