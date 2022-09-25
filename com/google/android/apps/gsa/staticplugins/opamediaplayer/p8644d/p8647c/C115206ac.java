package com.google.android.apps.gsa.staticplugins.opamediaplayer.p8644d.p8647c;

import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p5285d.p5290b.p5291a.p5292a.C68185bu;
import p5535j.p5536a.p5561h.C71177a;
import p5535j.p5536a.p5561h.C71179c;

/* renamed from: com.google.android.apps.gsa.staticplugins.opamediaplayer.d.c.ac */
/* compiled from: PG */
public final /* synthetic */ class C115206ac implements Callable {

    /* renamed from: a */
    public final /* synthetic */ C60870cx f319710a;

    /* renamed from: b */
    public final /* synthetic */ C71177a f319711b;

    /* renamed from: c */
    public final /* synthetic */ C60870cx f319712c;

    public /* synthetic */ C115206ac(C60870cx cxVar, C71177a aVar, C60870cx cxVar2) {
        this.f319710a = cxVar;
        this.f319711b = aVar;
        this.f319712c = cxVar2;
    }

    public final Object call() {
        C60870cx cxVar = this.f319710a;
        C71177a aVar = this.f319711b;
        C60870cx cxVar2 = this.f319712c;
        try {
            String str = ((C68185bu) ((C58833ax) C60856cj.m92909r(cxVar)).mo56109e(C68185bu.f184497d)).f184499a;
            aVar.copyOnWrite();
            C71179c cVar = (C71179c) aVar.instance;
            C71179c cVar2 = C71179c.f189893s;
            str.getClass();
            cVar.f189896a |= 16384;
            cVar.f189910o = str;
        } catch (ExecutionException e) {
            ((C59052c) ((C59052c) ((C59052c) C115210ag.f319721a.mo56226d()).mo56382g(e)).mo56372aa(29774)).mo56386p("Unable to get narration voice.");
        }
        try {
            String str2 = (String) C60856cj.m92909r(cxVar2);
            aVar.copyOnWrite();
            C71179c cVar3 = (C71179c) aVar.instance;
            C71179c cVar4 = C71179c.f189893s;
            str2.getClass();
            cVar3.f189896a |= 32768;
            cVar3.f189911p = str2;
        } catch (ExecutionException e2) {
            ((C59052c) ((C59052c) ((C59052c) C115210ag.f319721a.mo56226d()).mo56382g(e2)).mo56372aa(29773)).mo56386p("Unable to get narration language.");
        }
        return aVar;
    }
}
