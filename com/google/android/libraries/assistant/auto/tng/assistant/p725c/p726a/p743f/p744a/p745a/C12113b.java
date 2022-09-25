package com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p743f.p744a.p745a;

import com.google.android.libraries.assistant.auto.tng.assistant.p725c.p726a.p727a.C11989b;
import com.google.android.libraries.onegoogle.accountmenu.p2352b.C30325g;
import com.google.android.libraries.p579ar.faceviewer.C10662f;
import com.google.android.libraries.search.p2904c.C37655hb;
import com.google.android.setupcompat.p3549a.C45240c;
import com.google.protobuf.C62935bo;
import com.google.protobuf.C62941bu;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C63001dt;
import com.google.protobuf.C63010eb;

/* renamed from: com.google.android.libraries.assistant.auto.tng.assistant.c.a.f.a.a.b */
/* compiled from: PG */
public final class C12113b extends C62942bv implements C63001dt {

    /* renamed from: h */
    public static final C12113b f38724h;

    /* renamed from: i */
    private static volatile C63010eb f38725i;

    /* renamed from: a */
    public int f38726a;

    /* renamed from: b */
    public int f38727b = 0;

    /* renamed from: c */
    public Object f38728c;

    /* renamed from: d */
    public int f38729d = 16000;

    /* renamed from: e */
    public int f38730e = 1;

    /* renamed from: f */
    public int f38731f = 2;

    /* renamed from: g */
    public boolean f38732g;

    static {
        C12113b bVar = new C12113b();
        f38724h = bVar;
        C62942bv.registerDefaultInstance(C12113b.class, bVar);
    }

    private C12113b() {
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
                return newMessageInfo(f38724h, "\u0001\t\u0001\u0001\u0001\t\t\u0000\u0000\u0000\u0001ှ\u0000\u0002ဋ\u0005\u0003ဋ\u0006\u0004ဋ\u0007\u0005ျ\u0000\u0006ြ\u0000\u0007ျ\u0000\bြ\u0000\tဇ\b", new Object[]{C45240c.f118157a, "b", "a", "d", "e", C10662f.f35572a, C37655hb.class, C11989b.class, C30325g.f82003a});
            case 3:
                return new C12113b();
            case 4:
                return new C12112a();
            case 5:
                return f38724h;
            case 6:
                C63010eb ebVar = f38725i;
                if (ebVar == null) {
                    synchronized (C12113b.class) {
                        ebVar = f38725i;
                        if (ebVar == null) {
                            ebVar = new C62935bo(f38724h);
                            f38725i = ebVar;
                        }
                    }
                }
                return ebVar;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
