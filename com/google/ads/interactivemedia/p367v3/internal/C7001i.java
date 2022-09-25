package com.google.ads.interactivemedia.p367v3.internal;

import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: com.google.ads.interactivemedia.v3.internal.i */
/* compiled from: PG */
public final class C7001i extends C6893e {

    /* renamed from: a */
    private static final Pattern f22343a = Pattern.compile("^[a-zA-Z0-9 ]+$");

    /* renamed from: b */
    private final C6947g f22344b;

    /* renamed from: c */
    private final List f22345c = new ArrayList();

    /* renamed from: d */
    private C6782ac f22346d;

    /* renamed from: e */
    private boolean f22347e = false;

    /* renamed from: f */
    private boolean f22348f = false;

    /* renamed from: g */
    private final String f22349g;

    /* renamed from: h */
    private C6809ax f22350h;

    public C7001i(C6920f fVar, C6947g gVar) {
        this.f22344b = gVar;
        this.f22349g = UUID.randomUUID().toString();
        m20650l((View) null);
        if (gVar.mo15868h() == C6974h.HTML || gVar.mo15868h() == C6974h.JAVASCRIPT) {
            this.f22346d = new C6783ad(gVar.mo15865e());
        } else {
            this.f22346d = new C6786af(gVar.mo15864d(), (String) null);
        }
        this.f22346d.mo14414a();
        C7190p.m21443a().mo16264b(this);
        C7352v.m22064a().mo16599b(this.f22346d.mo14417d(), fVar.mo15861a());
    }

    /* renamed from: l */
    private final void m20650l(View view) {
        this.f22350h = new C6809ax(view);
    }

    /* renamed from: a */
    public final void mo15759a() {
        if (!this.f22347e) {
            this.f22347e = true;
            C7190p.m21443a().mo16265c(this);
            this.f22346d.mo14423j(C7379w.m22239a().mo16708f());
            this.f22346d.mo14421h(this, this.f22344b);
        }
    }

    /* renamed from: b */
    public final void mo15760b(View view) {
        if (!this.f22348f) {
            C7009ih.m20724b(view, "AdView is null");
            if (mo16005j() != view) {
                m20650l(view);
                this.f22346d.mo14424k();
                Collection<C7001i> e = C7190p.m21443a().mo16267e();
                if (e != null && e.size() > 0) {
                    for (C7001i iVar : e) {
                        if (iVar != this && iVar.mo16005j() == view) {
                            iVar.f22350h.clear();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo15761c() {
        if (!this.f22348f) {
            this.f22350h.clear();
            mo15763e();
            this.f22348f = true;
            C7352v.m22064a().mo16601d(this.f22346d.mo14417d());
            C7190p.m21443a().mo16266d(this);
            this.f22346d.mo14415b();
            this.f22346d = null;
        }
    }

    /* renamed from: d */
    public final void mo15762d(View view, C7055k kVar, String str) {
        C7271s sVar;
        if (this.f22348f) {
            return;
        }
        if (view == null) {
            throw new IllegalArgumentException("FriendlyObstruction is null");
        } else if (str == null || (str.length() <= 50 && f22343a.matcher(str).matches())) {
            Iterator it = this.f22345c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    sVar = null;
                    break;
                }
                sVar = (C7271s) it.next();
                if (sVar.mo16423d().get() == view) {
                    break;
                }
            }
            if (sVar == null) {
                this.f22345c.add(new C7271s(view, kVar, str));
            }
        } else {
            throw new IllegalArgumentException("FriendlyObstruction has improperly formatted detailed reason");
        }
    }

    /* renamed from: e */
    public final void mo15763e() {
        if (!this.f22348f) {
            this.f22345c.clear();
        }
    }

    /* renamed from: g */
    public final List mo16002g() {
        return this.f22345c;
    }

    /* renamed from: h */
    public final C6782ac mo16003h() {
        return this.f22346d;
    }

    /* renamed from: i */
    public final String mo16004i() {
        return this.f22349g;
    }

    /* renamed from: j */
    public final View mo16005j() {
        return (View) this.f22350h.get();
    }

    /* renamed from: k */
    public final boolean mo16006k() {
        return this.f22347e && !this.f22348f;
    }
}
