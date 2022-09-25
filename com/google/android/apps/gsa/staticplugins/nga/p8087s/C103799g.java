package com.google.android.apps.gsa.staticplugins.nga.p8087s;

import com.google.android.apps.gsa.assistant.settings.features.p532aa.C9785c;
import com.google.android.apps.gsa.assistant.settings.shared.ae;
import com.google.android.apps.gsa.nga.shared.p6407v.C82267b;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.p7066m.C90021c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.staticplugins.nga.p8068k.C103382f;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import dagger.C68214a;
import java.util.Locale;

/* renamed from: com.google.android.apps.gsa.staticplugins.nga.s.g */
/* compiled from: PG */
public final class C103799g implements C103382f {

    /* renamed from: a */
    private final C86054o f289020a;

    /* renamed from: b */
    private final ae f289021b;

    /* renamed from: c */
    private final C82267b f289022c;

    /* renamed from: d */
    private final C68214a f289023d;

    /* renamed from: e */
    private final C68214a f289024e;

    public C103799g(C86054o oVar, ae aeVar, C82267b bVar, C68214a aVar, C68214a aVar2) {
        this.f289020a = oVar;
        this.f289021b = aeVar;
        this.f289022c = bVar;
        this.f289023d = aVar;
        this.f289024e = aVar2;
    }

    /* renamed from: a */
    public final C58485gu mo93858a() {
        String F = this.f289020a.mo79659F();
        if (!C58837ba.m90859h(F)) {
            C58485gu b = this.f289021b.b(F);
            if (((C90021c) this.f289023d.mo27525b()).mo79746e(C90126fx.f250961N) && !((C9785c) this.f289024e.mo27525b()).mo18034a().isEmpty()) {
                Locale forLanguageTag = Locale.forLanguageTag(((C9785c) this.f289024e.mo27525b()).mo18034a());
                if (!b.contains(forLanguageTag)) {
                    C58480gp e = C58485gu.m89837e();
                    e.mo55396h(b);
                    e.mo55395g(forLanguageTag);
                    b = e.mo55394f();
                }
            }
            if (!b.isEmpty()) {
                return b;
            }
        }
        return C58485gu.m89846n(Locale.getDefault());
    }

    /* renamed from: b */
    public final Locale mo93859b() {
        String F = this.f289020a.mo79659F();
        if (!C58837ba.m90859h(F)) {
            return this.f289021b.d(F);
        }
        return Locale.getDefault();
    }

    /* renamed from: c */
    public final void mo93774c() {
        this.f289022c.mo75572a(new C103798f(this));
    }

    /* renamed from: e */
    public final /* synthetic */ void mo93775e() {
    }
}
