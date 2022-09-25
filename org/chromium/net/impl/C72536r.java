package org.chromium.net.impl;

/* renamed from: org.chromium.net.impl.r */
/* compiled from: PG */
public final class C72536r {

    /* renamed from: a */
    public final boolean f193011a;

    /* renamed from: b */
    public final boolean f193012b;

    /* renamed from: c */
    public final boolean f193013c;

    /* renamed from: d */
    public final boolean f193014d;

    /* renamed from: e */
    public final int f193015e;

    /* renamed from: f */
    public final String f193016f;

    /* renamed from: g */
    public final boolean f193017g;

    /* renamed from: h */
    public final int f193018h;

    public C72536r(C72533o oVar) {
        int i;
        this.f193011a = oVar.f193000d;
        String str = oVar.f193001e;
        String str2 = oVar.f193002f;
        this.f193012b = oVar.f193003g;
        this.f193013c = oVar.f193004h;
        this.f193014d = oVar.f193005i;
        int ordinal = oVar.f193006j.ordinal();
        if (ordinal != 0) {
            i = 3;
            if (ordinal != 1) {
                if (ordinal == 2) {
                    i = 2;
                } else if (ordinal == 3) {
                    i = 1;
                } else {
                    throw new IllegalArgumentException("Unknown internal builder cache mode");
                }
            }
        } else {
            i = 0;
        }
        this.f193015e = i;
        this.f193016f = oVar.f193008l;
        this.f193017g = oVar.f193009m;
        this.f193018h = oVar.mo64274a(10);
    }
}
