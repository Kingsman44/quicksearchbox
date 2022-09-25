package com.google.android.libraries.onegoogle.accountmenu.features.education.p2368c;

import com.google.android.libraries.logging.p2185ve.p2199f.C28421h;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmanagement.C30253a;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30870ac;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58881cr;
import com.google.common.p4522b.C58528ij;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.education.c.c */
/* compiled from: PG */
public final class C30556c extends C30569p {

    /* renamed from: a */
    public C30158c f82530a;

    /* renamed from: b */
    public C30253a f82531b;

    /* renamed from: c */
    public int f82532c;

    /* renamed from: d */
    public int f82533d;

    /* renamed from: e */
    public C58881cr f82534e;

    /* renamed from: f */
    public C58881cr f82535f;

    /* renamed from: g */
    public boolean f82536g;

    /* renamed from: h */
    public C28421h f82537h;

    /* renamed from: i */
    public Runnable f82538i;

    /* renamed from: j */
    public byte f82539j;

    /* renamed from: k */
    public int f82540k;

    /* renamed from: l */
    public int f82541l;

    /* renamed from: m */
    public C30567n f82542m;

    /* renamed from: n */
    private final C58833ax f82543n;

    /* renamed from: o */
    private C30870ac f82544o;

    /* renamed from: p */
    private C58528ij f82545p;

    /* renamed from: q */
    private final C58833ax f82546q;

    /* renamed from: r */
    private int f82547r;

    /* renamed from: s */
    private C30555b f82548s;

    public C30556c() {
        C58836b bVar = C58836b.f156633a;
        this.f82543n = bVar;
        this.f82546q = bVar;
    }

    /* renamed from: a */
    public final C28421h mo36214a() {
        C28421h hVar = this.f82537h;
        if (hVar != null) {
            return hVar;
        }
        throw new IllegalStateException("Property \"vePrimitives\" has not been set");
    }

    /* renamed from: b */
    public final C30158c mo36215b() {
        C30158c cVar = this.f82530a;
        if (cVar != null) {
            return cVar;
        }
        throw new IllegalStateException("Property \"accountConverter\" has not been set");
    }

    /* renamed from: c */
    public final C30253a mo36216c() {
        C30253a aVar = this.f82531b;
        if (aVar != null) {
            return aVar;
        }
        throw new IllegalStateException("Property \"accountsModel\" has not been set");
    }

    /* renamed from: d */
    public final C30570q mo36217d() {
        C30158c cVar;
        C30253a aVar;
        C30567n nVar;
        C30555b bVar;
        C30870ac acVar;
        int i;
        C58881cr crVar;
        C58881cr crVar2;
        C58528ij ijVar;
        C28421h hVar;
        Runnable runnable;
        int i2;
        if (this.f82539j != 15 || (cVar = this.f82530a) == null || (aVar = this.f82531b) == null || (nVar = this.f82542m) == null || (bVar = this.f82548s) == null || (acVar = this.f82544o) == null || (i = this.f82547r) == 0 || (crVar = this.f82534e) == null || (crVar2 = this.f82535f) == null || (ijVar = this.f82545p) == null || this.f82540k == 0 || (hVar = this.f82537h) == null || (runnable = this.f82538i) == null || (i2 = this.f82541l) == 0) {
            StringBuilder sb = new StringBuilder();
            if (this.f82530a == null) {
                sb.append(" accountConverter");
            }
            if (this.f82531b == null) {
                sb.append(" accountsModel");
            }
            if (this.f82542m == null) {
                sb.append(" shouldShowEducationAndHighlightChecker");
            }
            if (this.f82548s == null) {
                sb.append(" callbacks");
            }
            if (this.f82544o == null) {
                sb.append(" simpleVeLogger");
            }
            if (this.f82547r == 0) {
                sb.append(" id");
            }
            if ((this.f82539j & 1) == 0) {
                sb.append(" impressionCap");
            }
            if ((this.f82539j & 2) == 0) {
                sb.append(" highlightImpressionCap");
            }
            if (this.f82534e == null) {
                sb.append(" shouldConsumeEducation");
            }
            if (this.f82535f == null) {
                sb.append(" shouldConsumeHighlight");
            }
            if ((this.f82539j & 4) == 0) {
                sb.append(" withScrim");
            }
            if (this.f82545p == null) {
                sb.append(" highlightIds");
            }
            if ((this.f82539j & 8) == 0) {
                sb.append(" shouldClickAnchorOnInteraction");
            }
            if (this.f82540k == 0) {
                sb.append(" a11yLevel");
            }
            if (this.f82537h == null) {
                sb.append(" vePrimitives");
            }
            if (this.f82538i == null) {
                sb.append(" onEducationShown");
            }
            if (this.f82541l == 0) {
                sb.append(" placement");
            }
            throw new IllegalStateException("Missing required properties:".concat(sb.toString()));
        }
        return new C30557d(cVar, aVar, this.f82543n, nVar, bVar, acVar, i, this.f82532c, this.f82533d, crVar, crVar2, ijVar, this.f82536g, hVar, this.f82546q, runnable, i2);
    }

    /* renamed from: e */
    public final C58833ax mo36218e() {
        return this.f82546q;
    }

    /* renamed from: f */
    public final C58833ax mo36219f() {
        return this.f82543n;
    }

    /* renamed from: g */
    public final void mo36220g(C58528ij ijVar) {
        if (ijVar != null) {
            this.f82545p = ijVar;
            return;
        }
        throw new NullPointerException("Null highlightIds");
    }

    /* renamed from: h */
    public final void mo36221h(C30870ac acVar) {
        this.f82544o = acVar;
    }

    /* renamed from: i */
    public final void mo36222i(int i) {
        this.f82547r = i;
    }

    /* renamed from: j */
    public final void mo36223j(C30555b bVar) {
        this.f82548s = bVar;
    }
}
