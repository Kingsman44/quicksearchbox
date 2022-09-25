package com.google.android.libraries.componentview.components.p1689c.p1690a;

import com.google.android.libraries.componentview.components.elements.p1696a.C20379d;
import com.google.android.libraries.componentview.components.p1693e.p1694a.C20349b;
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

/* renamed from: com.google.android.libraries.componentview.components.c.a.at */
/* compiled from: PG */
public final class C20123at extends C62942bv implements C63001dt {

    /* renamed from: g */
    public static final C20123at f56400g;

    /* renamed from: h */
    public static final C62940bt f56401h;

    /* renamed from: j */
    private static volatile C63010eb f56402j;

    /* renamed from: a */
    public int f56403a;

    /* renamed from: b */
    public C20379d f56404b;

    /* renamed from: c */
    public C20349b f56405c;

    /* renamed from: d */
    public C62971cq f56406d = emptyProtobufList();

    /* renamed from: e */
    public boolean f56407e;

    /* renamed from: f */
    public int f56408f;

    /* renamed from: i */
    private byte f56409i = 2;

    static {
        C20123at atVar = new C20123at();
        f56400g = atVar;
        C62942bv.registerDefaultInstance(C20123at.class, atVar);
        f56401h = C62942bv.newSingularGeneratedExtension(C56425d.f150537g, atVar, atVar, (C62958ce) null, 115699037, C63066gd.MESSAGE, C20123at.class);
    }

    private C20123at() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f56409i);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f56409i = b;
                return null;
            case 2:
                return newMessageInfo(f56400g, "\u0001\u0005\u0000\u0001\u0001\u0006\u0005\u0000\u0001\u0001\u0001ဉ\u0000\u0002ဉ\u0001\u0003Л\u0004ဇ\u0002\u0006င\u0003", new Object[]{"a", "b", C45240c.f118157a, "d", C56425d.class, "e", C10662f.f35572a});
            case 3:
                return new C20123at();
            case 4:
                return new C20122as();
            case 5:
                return f56400g;
            case 6:
                C63010eb ebVar = f56402j;
                if (ebVar == null) {
                    synchronized (C20123at.class) {
                        ebVar = f56402j;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f56400g);
                            f56402j = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
