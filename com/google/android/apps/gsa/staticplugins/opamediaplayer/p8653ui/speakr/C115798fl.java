package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8653ui.speakr;

import com.google.android.apps.gsa.search.core.p6519al.p6694dd.p6696b.C85333k;
import com.google.android.libraries.gsa.monet.shared.C23123s;
import p5285d.p5290b.p5291a.p5292a.C68184bt;
import p5285d.p5290b.p5291a.p5292a.C68185bu;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.ui.speakr.fl */
/* compiled from: PG */
public final /* synthetic */ class C115798fl implements C23123s {

    /* renamed from: a */
    public final /* synthetic */ C115801fo f321126a;

    public /* synthetic */ C115798fl(C115801fo foVar) {
        this.f321126a = foVar;
    }

    /* renamed from: a */
    public final void mo28366a(Object obj) {
        C115801fo foVar = this.f321126a;
        C68185bu buVar = (C68185bu) obj;
        foVar.mo102269g();
        if (buVar.equals(C68185bu.f184497d) && !foVar.f321132g.isEmpty()) {
            C68184bt btVar = (C68184bt) C68185bu.f184497d.createBuilder();
            String str = ((C85333k) foVar.f321132g.get(0)).f231107b;
            btVar.copyOnWrite();
            str.getClass();
            ((C68185bu) btVar.instance).f184499a = str;
            buVar = (C68185bu) btVar.build();
        }
        foVar.f321139n.mo101995f(buVar);
    }
}
