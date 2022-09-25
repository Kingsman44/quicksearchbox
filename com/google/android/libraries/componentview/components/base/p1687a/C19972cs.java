package com.google.android.libraries.componentview.components.base.p1687a;

import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62971cq;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;

/* renamed from: com.google.android.libraries.componentview.components.base.a.cs */
/* compiled from: PG */
public final class C19972cs extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C19972cs f55953g;

    /* renamed from: h */
    public static final C62940bt f55954h;

    /* renamed from: j */
    private static volatile C63010eb f55955j;

    /* renamed from: a */
    public int f55956a;

    /* renamed from: b */
    public C19916aq f55957b;

    /* renamed from: c */
    public C62971cq f55958c = emptyProtobufList();

    /* renamed from: d */
    public C62971cq f55959d = emptyProtobufList();

    /* renamed from: e */
    public boolean f55960e;

    /* renamed from: f */
    public boolean f55961f;

    /* renamed from: i */
    private byte f55962i = 2;

    static {
        C19972cs csVar = new C19972cs();
        f55953g = csVar;
        C62942bv.registerDefaultInstance(C19972cs.class, csVar);
        f55954h = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, csVar, csVar, (C62958ce) null, 108390330, C63066gd.MESSAGE, C19972cs.class);
    }

    private C19972cs() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f55962i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f55962i = b;
                return null;
            case 2:
                return newMessageInfo(f55953g, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0002\u0001\u0001ဉ\u0000\u0002Л\u0003\u001b\u0004ဇ\u0001\u0005ဇ\u0002", new Object[]{"a", "b", C45240c.f118157a, C56425d.class, "d", C19971cr.class, "e", C10662f.f35572a});
            case 3:
                return new C19972cs();
            case 4:
                return new C19969cp();
            case 5:
                return f55953g;
            case 6:
                C63010eb ebVar = f55955j;
                if (ebVar == null) {
                    synchronized (C19972cs.class) {
                        ebVar = f55955j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f55953g);
                            f55955j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
