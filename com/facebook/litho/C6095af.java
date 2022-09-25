package com.facebook.litho;

import com.facebook.litho.p325d.C6180a;
import com.google.android.libraries.elements.p1729h.C21215m;

/* renamed from: com.facebook.litho.af */
/* compiled from: PG */
public final class C6095af {

    /* renamed from: a */
    public final C6411u f17995a;

    /* renamed from: b */
    public boolean f17996b = true;

    /* renamed from: c */
    public C6407q f17997c;

    /* renamed from: d */
    public boolean f17998d = true;

    /* renamed from: e */
    public boolean f17999e = true;

    /* renamed from: f */
    public C6193dm f18000f;

    /* renamed from: g */
    public C6280fw f18001g;

    /* renamed from: h */
    public boolean f18002h = false;

    /* renamed from: i */
    public C6099aj f18003i;

    /* renamed from: j */
    public boolean f18004j;

    /* renamed from: k */
    public final C6144by f18005k;

    /* renamed from: l */
    public String f18006l;

    /* renamed from: m */
    public C21215m f18007m;

    protected C6095af(C6411u uVar) {
        boolean z = C6180a.f18234a;
        this.f18004j = false;
        this.f18005k = C6123bd.f18071a;
        this.f17995a = uVar;
    }

    /* renamed from: a */
    public final ComponentTree mo12841a() {
        if (this.f17997c == null) {
            this.f17997c = C6270fm.m16828b(this.f17995a).f18513a;
        }
        if (this.f18007m != null && this.f18006l == null) {
            this.f18006l = this.f17997c.mo13461q();
        }
        return new ComponentTree(this);
    }
}
