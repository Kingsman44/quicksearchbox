package com.google.android.libraries.gsa.monet.internal.p1887a;

import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.google.android.libraries.gsa.monet.internal.shared.p1889a.C23032a;
import com.google.android.libraries.gsa.monet.p1886a.C22939d;
import com.google.android.libraries.gsa.monet.p1886a.C22945j;
import com.google.android.libraries.gsa.monet.p1886a.C22952q;
import com.google.android.libraries.gsa.monet.shared.C23078ai;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.p1892b.C23093g;

/* renamed from: com.google.android.libraries.gsa.monet.internal.a.f */
/* compiled from: PG */
public final class C22982f extends C22939d {

    /* renamed from: a */
    C22984h f63204a;

    /* renamed from: b */
    private final C23032a f63205b;

    /* renamed from: c */
    private final Context f63206c;

    /* renamed from: d */
    private final C22963af f63207d;

    /* renamed from: e */
    private final C22995s f63208e;

    /* renamed from: f */
    private C23078ai f63209f;

    /* renamed from: g */
    private C22939d f63210g;

    /* renamed from: h */
    private String f63211h;

    public C22982f(C22945j jVar, C23032a aVar, Context context, C22963af afVar, C22995s sVar) {
        super(jVar);
        this.f63205b = aVar;
        this.f63206c = context;
        this.f63207d = afVar;
        this.f63208e = sVar;
    }

    /* renamed from: j */
    private final void m43042j() {
        mo28368e();
        C23078ai aiVar = this.f63209f;
        if (aiVar != null) {
            this.f63126Q.mo28344p(aiVar);
            this.f63209f = null;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final void mo28368e() {
        this.f63204a.removeAllViews();
        C22939d dVar = this.f63210g;
        if (dVar != null) {
            if (this.f63126Q.mo28309A(dVar)) {
                this.f63126Q.mo28308v(dVar);
            }
            this.f63126Q.mo28307r(dVar);
            this.f63210g = null;
        }
    }

    /* renamed from: g */
    public final void mo28369g() {
        C23078ai aiVar;
        if (this.f63126Q.mo28316z() && this.f63126Q.mo28333D("root") && (aiVar = this.f63209f) != null && aiVar.f63429c) {
            C23129y f = this.f63126Q.mo28337f("root");
            String k = this.f63126Q.mo28341k("root");
            C22939d dVar = this.f63210g;
            if (dVar != null && !this.f63126Q.mo28311c(dVar).equals(f)) {
                mo28368e();
            }
            if (this.f63210g == null) {
                this.f63210g = this.f63126Q.mo28305i(f);
            }
            C22939d dVar2 = this.f63210g;
            C22977at a = this.f63208e.mo28386a(k);
            a.getClass();
            if ((a.mo28362f() || dVar2.mo28302n() != null) && !this.f63126Q.mo28309A(dVar2)) {
                this.f63126Q.mo28306q(dVar2, k);
                this.f63204a.removeAllViews();
                this.f63204a.addView(dVar2.mo28297il(), new ViewGroup.LayoutParams(-1, -1));
                for (C22952q a2 : this.f63207d.f63168a) {
                    a2.mo28325a();
                }
            }
        }
    }

    /* renamed from: h */
    public final void mo28370h(C23093g gVar) {
        if (gVar.mo28554c()) {
            String str = (String) gVar.mo28552a();
            if (!TextUtils.equals(this.f63211h, str) || "SCOPE_ROOT_CLEARED".equals(str)) {
                m43042j();
            }
            if (!"SCOPE_ROOT_CLEARED".equals(str) && this.f63209f == null) {
                this.f63211h = str;
                C23078ai h = this.f63126Q.mo28339h(str);
                this.f63209f = h;
                h.mo28525b(new C22981e(this));
            }
        }
    }

    /* renamed from: im */
    public final void mo28298im() {
        m43042j();
    }

    /* renamed from: iw */
    public final void mo28299iw() {
        C22984h hVar = new C22984h(this.f63206c);
        this.f63204a = hVar;
        mo28295iC(hVar);
        ((C22999w) this.f63205b).f63264b.mo28726b(new C22979c(this));
        ((C22999w) this.f63205b).f63263a.mo28726b(new C22980d(this));
    }

    /* renamed from: ix */
    public final void mo28300ix() {
        if (((C23093g) ((C22999w) this.f63205b).f63264b.f63720e).mo28554c() && this.f63209f == null) {
            mo28370h((C23093g) ((C22999w) this.f63205b).f63264b.f63720e);
        }
    }
}
