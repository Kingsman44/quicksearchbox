package com.google.android.apps.gsa.nga.engine.p6044n.p6049c.p6050a;

import android.net.Uri;
import com.google.android.apps.gsa.nga.engine.aj.af;
import com.google.android.apps.gsa.nga.engine.p5907aj.C74851z;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80321bp;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80326bu;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80336cd;
import com.google.android.apps.gsa.p8883x.C118826c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5072a.p5073a.p5074a.p5075a.C65475b;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.n.c.a.at */
/* compiled from: PG */
public final /* synthetic */ class C76309at implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C76311av f211358a;

    /* renamed from: b */
    public final /* synthetic */ C65475b f211359b;

    /* renamed from: c */
    public final /* synthetic */ C80336cd f211360c;

    /* renamed from: d */
    public final /* synthetic */ af f211361d;

    public /* synthetic */ C76309at(C76311av avVar, C65475b bVar, C80336cd cdVar, af afVar) {
        this.f211358a = avVar;
        this.f211359b = bVar;
        this.f211360c = cdVar;
        this.f211361d = afVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C80326bu buVar;
        C76311av avVar = this.f211358a;
        C65475b bVar = this.f211359b;
        C80336cd cdVar = this.f211360c;
        af afVar = this.f211361d;
        Optional optional = (Optional) obj;
        if (optional.isEmpty()) {
            Locale forLanguageTag = Locale.forLanguageTag(bVar.f177982c);
            avVar.f211366a.mo72162b(avVar.f211367b.mo75121a(forLanguageTag).getString(R.string.nga_screenshot_saving_failed, new Object[0]), C76298ai.f211336a);
            avVar.mo72166f(bVar);
            return C118826c.f331423b;
        }
        if (cdVar.f220444a == 8) {
            buVar = (C80326bu) cdVar.f220445b;
        } else {
            buVar = C80326bu.f220419b;
        }
        C22871g gVar = avVar.f211368c;
        C80321bp bpVar = buVar.f220421a;
        if (bpVar == null) {
            bpVar = C80321bp.f220412c;
        }
        return gVar.mo28210j(afVar.k(C74851z.m121022d(bpVar), (Uri) optional.get(), "image/png"), "[NGA] handleSendScreenshot.sendImage", new C76310au(avVar, cdVar, bVar));
    }
}
