package com.google.protos.p4895aw.p4903c.p4904a.p4905a.p4906a.p4916c.p4921c.p4923b.p4925b;

import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.libraries.p1649b.p1651b.C19621k;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.youtube.elements.C66244fd;
import com.google.protos.youtube.elements.CommandOuterClass$Command;

/* renamed from: com.google.protos.aw.c.a.a.a.c.c.b.b.b */
/* compiled from: PG */
public final class C64241b extends C62942bv implements C63001dt {

    /* renamed from: l */
    public static final C64241b f173691l;

    /* renamed from: m */
    public static final C62940bt f173692m;

    /* renamed from: o */
    private static volatile C63010eb f173693o;

    /* renamed from: a */
    public int f173694a;

    /* renamed from: b */
    public int f173695b;

    /* renamed from: c */
    public int f173696c;

    /* renamed from: d */
    public float f173697d;

    /* renamed from: e */
    public float f173698e;

    /* renamed from: f */
    public int f173699f;

    /* renamed from: g */
    public int f173700g;

    /* renamed from: h */
    public boolean f173701h;

    /* renamed from: i */
    public boolean f173702i;

    /* renamed from: j */
    public float f173703j;

    /* renamed from: k */
    public CommandOuterClass$Command f173704k;

    /* renamed from: n */
    private byte f173705n = 2;

    static {
        C64241b bVar = new C64241b();
        f173691l = bVar;
        C62942bv.registerDefaultInstance(C64241b.class, bVar);
        f173692m = C62942bv.newSingularGeneratedExtension(C66244fd.f180131a, bVar, bVar, (C62958ce) null, 308037629, C63066gd.MESSAGE, C64241b.class);
    }

    private C64241b() {
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f173705n);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f173705n = b;
                return null;
            case 2:
                return newMessageInfo(f173691l, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0001\u0001င\u0000\u0002င\u0001\u0003ခ\u0002\u0004ခ\u0003\u0005ဋ\u0004\u0006ဋ\u0005\u0007ဇ\u0006\bဇ\u0007\tခ\b\nᐉ\t", new Object[]{"a", "b", C45240c.f118157a, "d", "e", C10662f.f35572a, C30325g.f82003a, C19618h.f54585a, "i", "j", C19621k.f54601a});
            case 3:
                return new C64241b();
            case 4:
                return new C64240a();
            case 5:
                return f173691l;
            case 6:
                C63010eb ebVar = f173693o;
                if (ebVar == null) {
                    synchronized (C64241b.class) {
                        ebVar = f173693o;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f173691l);
                            f173693o = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
