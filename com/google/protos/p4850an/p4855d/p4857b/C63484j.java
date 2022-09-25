package com.google.protos.p4850an.p4855d.p4857b;

import com.google.android.libraries.p1649b.p1651b.C19618h;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62958ce;
import com.google.protobuf.C62961ch;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;
import com.google.protobuf.C63066gd;
import com.google.protos.p4850an.C63352aw;

/* renamed from: com.google.protos.an.d.b.j */
/* compiled from: PG */
public final class C63484j extends C62942bv implements C63001dt {

    /* renamed from: f */
    public static final C63484j f171546f;

    /* renamed from: g */
    public static final C62940bt f171547g;

    /* renamed from: k */
    private static volatile C63010eb f171548k;

    /* renamed from: a */
    public int f171549a;

    /* renamed from: b */
    public int f171550b;

    /* renamed from: c */
    public int f171551c;

    /* renamed from: d */
    public C62961ch f171552d = emptyIntList();

    /* renamed from: e */
    public C63488n f171553e;

    /* renamed from: h */
    private int f171554h;

    /* renamed from: i */
    private C63486l f171555i;

    /* renamed from: j */
    private byte f171556j = 2;

    static {
        C63484j jVar = new C63484j();
        f171546f = jVar;
        C62942bv.registerDefaultInstance(C63484j.class, jVar);
        f171547g = C62942bv.newSingularGeneratedExtension(C63352aw.f171196a, jVar, jVar, (C62958ce) null, 61183020, C63066gd.MESSAGE, C63484j.class);
    }

    private C63484j() {
        emptyProtobufList();
    }

    /* access modifiers changed from: protected */
    public final Object dynamicMethod(C62941bu buVar, Object obj, Object obj2) {
        C62941bu buVar2 = C62941bu.GET_MEMOIZED_IS_INITIALIZED;
        byte b = 1;
        switch (buVar.ordinal()) {
            case 0:
                return Byte.valueOf(this.f171556j);
            case 1:
                if (obj == null) {
                    b = 0;
                }
                this.f171556j = b;
                return null;
            case 2:
                return newMessageInfo(f171546f, "\u0001\u0006\u0000\u0001\u0001\u000e\u0006\u0000\u0001\u0001\u0001ဌ\u0000\u0002ဌ\u0001\u0006ဌ\u0005\b\u001e\tဉ\u0006\u000eᐉ\u000b", new Object[]{C19618h.f54585a, "a", C63476b.f171542a, "b", C63478d.f171543a, C45240c.f118157a, C63480f.f171544a, "d", C63482h.f171545a, "e", "i"});
            case 3:
                return new C63484j();
            case 4:
                return new C63475a();
            case 5:
                return f171546f;
            case 6:
                C63010eb ebVar = f171548k;
                if (ebVar == null) {
                    synchronized (C63484j.class) {
                        ebVar = f171548k;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f171546f);
                            f171548k = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
