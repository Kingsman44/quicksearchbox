package com.google.assistant.p3897e.p3921j.p3926e;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63037fb;

/* renamed from: com.google.assistant.e.j.e.hr */
/* compiled from: PG */
public final class C52019hr extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C52019hr f136523g;

    /* renamed from: i */
    private static volatile C63010eb f136524i;

    /* renamed from: a */
    public C62971cq f136525a = C62942bv.emptyProtobufList();

    /* renamed from: b */
    public C62971cq f136526b = C62942bv.emptyProtobufList();

    /* renamed from: c */
    public String f136527c = BuildConfig.FLAVOR;

    /* renamed from: d */
    public C63037fb f136528d;

    /* renamed from: e */
    public String f136529e = BuildConfig.FLAVOR;

    /* renamed from: f */
    public String f136530f;

    /* renamed from: h */
    private int f136531h;

    static {
        C52019hr hrVar = new C52019hr();
        f136523g = hrVar;
        C62942bv.registerDefaultInstance(C52019hr.class, hrVar);
    }

    private C52019hr() {
        C62942bv.emptyProtobufList();
        C62942bv.emptyProtobufList();
        this.f136530f = BuildConfig.FLAVOR;
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
                return newMessageInfo(f136523g, "\u0001\u0006\u0000\u0001\u0002\n\u0006\u0000\u0002\u0000\u0002\u001a\u0003\u001a\u0004ဈ\u0001\u0005ဉ\u0002\u0006ဈ\u0003\nဈ\u0005", new Object[]{C19618h.f54585a, "a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a});
            case 3:
                return new C52019hr();
            case 4:
                return new C52018hq();
            case 5:
                return f136523g;
            case 6:
                C63010eb ebVar = f136524i;
                if (ebVar == null) {
                    synchronized (C52019hr.class) {
                        ebVar = f136524i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f136523g);
                            f136524i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
