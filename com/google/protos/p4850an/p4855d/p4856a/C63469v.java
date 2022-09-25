package com.google.protos.p4850an.p4855d.p4856a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4850an.C63352aw;
import com.google.protos.p4850an.p4855d.p4859d.C63556b;

/* renamed from: com.google.protos.an.d.a.v */
/* compiled from: PG */
public final class C63469v extends C62942bv implements C63001dt {

    /* renamed from: c */
    public static final C63469v f171518c;

    /* renamed from: d */
    public static final C62940bt f171519d;

    /* renamed from: h */
    private static volatile C63010eb f171520h;

    /* renamed from: a */
    public int f171521a;

    /* renamed from: b */
    public int f171522b;

    /* renamed from: e */
    private C63446af f171523e;

    /* renamed from: f */
    private C63556b f171524f;

    /* renamed from: g */
    private byte f171525g = 2;

    static {
        C63469v vVar = new C63469v();
        f171518c = vVar;
        C62942bv.registerDefaultInstance(C63469v.class, vVar);
        f171519d = C62942bv.newSingularGeneratedExtension(C63352aw.f171196a, vVar, vVar, (C62958ce) null, 84801380, C63066gd.MESSAGE, C63469v.class);
    }

    private C63469v() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171525g);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171525g = b;
                return null;
            case 2:
                return newMessageInfo(f171518c, "\u0001\u0003\u0000\u0001\u0002\n\u0003\u0000\u0000\u0002\u0002ᐉ\u0001\u0007ဌ\u0005\nᐉ\b", new Object[]{"a", "e", "b", C63467t.f171517a, C10662f.f35572a});
            case 3:
                return new C63469v();
            case 4:
                return new C63466s();
            case 5:
                return f171518c;
            case 6:
                C63010eb ebVar = f171520h;
                if (ebVar == null) {
                    synchronized (C63469v.class) {
                        ebVar = f171520h;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171518c);
                            f171520h = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
