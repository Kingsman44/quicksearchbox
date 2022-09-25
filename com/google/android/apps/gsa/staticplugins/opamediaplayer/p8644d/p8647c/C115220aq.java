package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115436f;
import com.google.android.apps.gsa.staticplugins.opamediaplayer.p8649f.p8650a.C115437g;
import com.google.android.libraries.gsa.monet.tools.model.shared.p1924b.C23251a;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58539iu;
import java.util.Locale;
import p5285d.p5290b.p5291a.p5292a.C68162ay;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.aq */
/* compiled from: PG */
public final /* synthetic */ class C115220aq implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C115226aw f319753a;

    public /* synthetic */ C115220aq(C115226aw awVar) {
        this.f319753a = awVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C115226aw awVar = this.f319753a;
        C58485gu guVar = (C58485gu) obj;
        C58480gp e = C58485gu.m89837e();
        C115436f fVar = (C115436f) C115437g.f320275d.createBuilder();
        fVar.copyOnWrite();
        C115437g gVar = (C115437g) fVar.instance;
        gVar.f320277a |= 1;
        gVar.f320278b = BuildConfig.FLAVOR;
        e.mo55395g((C115437g) fVar.build());
        C58539iu iuVar = new C58539iu(new C115225av());
        int size = guVar.size();
        for (int i = 0; i < size; i++) {
            C68162ay ayVar = (C68162ay) guVar.get(i);
            Locale locale = new Locale(ayVar.f184451a);
            C115436f fVar2 = (C115436f) C115437g.f320275d.createBuilder();
            String str = ayVar.f184451a;
            fVar2.copyOnWrite();
            C115437g gVar2 = (C115437g) fVar2.instance;
            str.getClass();
            gVar2.f320277a |= 1;
            gVar2.f320278b = str;
            String valueOf = String.valueOf(locale.getDisplayLanguage(locale));
            fVar2.copyOnWrite();
            C115437g gVar3 = (C115437g) fVar2.instance;
            valueOf.getClass();
            gVar3.f320277a |= 2;
            gVar3.f320279c = valueOf;
            iuVar.mo55533l((C115437g) fVar2.build());
        }
        e.mo55396h(iuVar.mo55486f());
        ((C23251a) awVar.f319759b.mo101981d()).mo28730f(e.mo55394f(), false);
    }
}
