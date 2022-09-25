package com.google.android.libraries.gsa.monet.tools.children.p1912a;

import android.text.TextUtils;
import com.google.android.libraries.gsa.monet.internal.service.C23028x;
import com.google.android.libraries.gsa.monet.service.C23052c;
import com.google.android.libraries.gsa.monet.service.C23056g;
import com.google.android.libraries.gsa.monet.service.FeatureSubtreeSnapshot;
import com.google.android.libraries.gsa.monet.shared.C23078ai;
import com.google.android.libraries.gsa.monet.shared.C23129y;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.shared.p1891a.C23067b;
import com.google.android.libraries.gsa.monet.shared.p1895e.C23109a;
import com.google.android.libraries.gsa.monet.tools.children.shared.C23241j;
import com.google.android.libraries.gsa.monet.tools.children.shared.C23242k;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.libraries.gsa.monet.tools.children.a.f */
/* compiled from: PG */
public final class C23186f implements C23241j {

    /* renamed from: a */
    public final C23052c f63574a;

    /* renamed from: b */
    public final String f63575b;

    /* renamed from: c */
    public final String f63576c;

    /* renamed from: d */
    public boolean f63577d = true;

    /* renamed from: e */
    private final boolean f63578e;

    /* renamed from: f */
    private C23078ai f63579f;

    /* renamed from: g */
    private C23181a f63580g;

    /* renamed from: h */
    private C23129y f63581h;

    /* renamed from: i */
    private final List f63582i = new ArrayList();

    public C23186f(String str, C23052c cVar, boolean z) {
        this.f63574a = cVar;
        this.f63575b = str;
        this.f63576c = C23242k.m43542b(str);
        this.f63578e = z;
        cVar.mo28427o(new C23184d(this, z));
    }

    /* renamed from: q */
    private final void m43381q() {
        C23067b.m43233f(!this.f63578e, "This manager is auto-restoring its child; calls to restore methods are not allowed.");
    }

    /* renamed from: r */
    private final void m43382r() {
        C23067b.m43234g(!this.f63574a.mo28333D(this.f63575b), "Child %s has already been requested.", this.f63575b);
    }

    /* renamed from: s */
    private final void m43383s() {
        mo28622c();
        this.f63581h = null;
        mo28629j();
    }

    /* renamed from: t */
    private final void m43384t() {
        C23129y yVar = this.f63581h;
        yVar.getClass();
        String str = yVar.f63476a;
        C23183c cVar = new C23183c(this);
        if (TextUtils.isEmpty(str)) {
            mo28622c();
            cVar.f63570a.mo28625f();
            return;
        }
        C23078ai a = C23078ai.m43249a(this.f63579f, this.f63574a, str);
        this.f63579f = a;
        a.mo28525b(new C23185e(cVar));
    }

    @Deprecated
    /* renamed from: a */
    public final C23056g mo28620a() {
        if (mo28632m()) {
            return this.f63574a.mo28421a(this.f63575b);
        }
        return null;
    }

    /* renamed from: b */
    public final FeatureSubtreeSnapshot mo28621b() {
        C23067b.m43232e(this.f63574a.mo28333D(this.f63575b));
        FeatureSubtreeSnapshot c = this.f63574a.mo28423c(this.f63575b);
        m43383s();
        return c;
    }

    /* renamed from: c */
    public final void mo28622c() {
        C23078ai aiVar = this.f63579f;
        if (aiVar != null) {
            this.f63574a.mo28344p(aiVar);
            this.f63579f = null;
        }
    }

    /* renamed from: d */
    public final void mo28623d(C23129y yVar, ProtoParcelable protoParcelable) {
        m43382r();
        this.f63581h = yVar;
        mo28629j();
        this.f63574a.mo28364q(this.f63575b, yVar, protoParcelable);
        m43384t();
    }

    /* renamed from: e */
    public final void mo28624e(String str, ProtoParcelable protoParcelable) {
        mo28623d(this.f63574a.mo28338g().mo28576b(str), protoParcelable);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final /* synthetic */ void mo28625f() {
        C23056g a = this.f63574a.mo28421a(this.f63575b);
        C23181a aVar = this.f63580g;
        if (aVar != null) {
            aVar.mo28618a(a);
        }
        for (C23109a a2 : this.f63582i) {
            a2.mo28347a(a);
        }
        this.f63582i.clear();
        mo28629j();
    }

    /* renamed from: g */
    public final void mo28626g(C23109a aVar) {
        C23067b.m43232e(mo28631l());
        if (mo28632m()) {
            aVar.mo28347a(this.f63574a.mo28421a(this.f63575b));
        } else {
            this.f63582i.add(new C23182b(aVar));
        }
    }

    /* renamed from: h */
    public final void mo28627h() {
        C23067b.m43232e(this.f63574a.mo28333D(this.f63575b));
        this.f63582i.clear();
        this.f63574a.mo28365x(this.f63575b);
        m43383s();
    }

    /* renamed from: i */
    public final void mo28628i(FeatureSubtreeSnapshot featureSubtreeSnapshot) {
        featureSubtreeSnapshot.mo28402a(this.f63574a, this.f63575b);
        this.f63581h = this.f63574a.mo28337f(this.f63575b);
        mo28629j();
        m43384t();
    }

    /* renamed from: j */
    public final void mo28629j() {
        this.f63574a.mo28332B(C23242k.m43541a(this.f63576c, this.f63577d));
    }

    @Deprecated
    /* renamed from: k */
    public final void mo28630k(C23181a aVar) {
        this.f63580g = aVar;
        if (mo28632m() && aVar != null) {
            aVar.mo28618a(this.f63574a.mo28421a(this.f63575b));
        }
    }

    /* renamed from: l */
    public final boolean mo28631l() {
        return this.f63574a.mo28333D(this.f63575b);
    }

    /* renamed from: m */
    public final boolean mo28632m() {
        if (!this.f63574a.mo28333D(this.f63575b)) {
            return false;
        }
        C23078ai aiVar = this.f63579f;
        return aiVar == null || aiVar.f63429c;
    }

    /* renamed from: n */
    public final void mo28633n(C23028x xVar) {
        if (xVar.f63351a.f63353a.containsKey(this.f63575b)) {
            xVar.mo28449a(this.f63575b);
            this.f63581h = this.f63574a.mo28337f(this.f63575b);
            mo28629j();
            m43384t();
        }
    }

    /* renamed from: o */
    public final void mo28634o(C23028x xVar) {
        m43381q();
        m43382r();
        mo28633n(xVar);
    }

    /* renamed from: p */
    public final boolean mo28635p(C23028x xVar) {
        m43381q();
        if (this.f63581h != null) {
            return false;
        }
        return xVar.f63351a.f63353a.containsKey(this.f63575b);
    }
}
