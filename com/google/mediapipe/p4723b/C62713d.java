package com.google.mediapipe.p4723b;

import java.nio.FloatBuffer;

/* renamed from: com.google.mediapipe.b.d */
/* compiled from: PG */
public final class C62713d {

    /* renamed from: a */
    public static final FloatBuffer f169328a = C62715f.m94925b(0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 1.0f, 1.0f, 1.0f);

    /* renamed from: b */
    public static final FloatBuffer f169329b;

    /* renamed from: c */
    public static final FloatBuffer f169330c;

    /* renamed from: d */
    public static final FloatBuffer f169331d;

    /* renamed from: e */
    public static final FloatBuffer f169332e;

    /* renamed from: k */
    private static final C62712c f169333k;

    /* renamed from: l */
    private static final C62712c f169334l;

    /* renamed from: m */
    private static final C62712c f169335m;

    /* renamed from: n */
    private static final C62712c f169336n;

    /* renamed from: o */
    private static final C62712c[] f169337o;

    /* renamed from: f */
    public int f169338f = 0;

    /* renamed from: g */
    public int f169339g;

    /* renamed from: h */
    public int f169340h;

    /* renamed from: i */
    public final float[] f169341i = new float[16];

    /* renamed from: j */
    public int f169342j = 0;

    static {
        C62715f.m94925b(0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f);
        C62712c cVar = new C62712c(-1.0f, -1.0f);
        f169333k = cVar;
        C62712c cVar2 = new C62712c(1.0f, -1.0f);
        f169334l = cVar2;
        C62712c cVar3 = new C62712c(-1.0f, 1.0f);
        f169335m = cVar3;
        C62712c cVar4 = new C62712c(1.0f, 1.0f);
        f169336n = cVar4;
        C62712c[] cVarArr = {cVar, cVar2, cVar3, cVar4};
        f169337o = cVarArr;
        f169329b = m94919a(cVarArr, 0, 1, 2, 3);
        f169330c = m94919a(cVarArr, 2, 0, 3, 1);
        f169331d = m94919a(cVarArr, 3, 2, 1, 0);
        f169332e = m94919a(cVarArr, 1, 3, 0, 2);
    }

    /* renamed from: a */
    private static FloatBuffer m94919a(C62712c[] cVarArr, int i, int i2, int i3, int i4) {
        C62712c cVar = cVarArr[i];
        C62712c cVar2 = cVarArr[i2];
        C62712c cVar3 = cVarArr[i3];
        C62712c cVar4 = cVarArr[i4];
        return C62715f.m94925b(cVar.f169326a, cVar.f169327b, cVar2.f169326a, cVar2.f169327b, cVar3.f169326a, cVar3.f169327b, cVar4.f169326a, cVar4.f169327b);
    }
}
