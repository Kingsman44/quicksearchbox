package com.google.android.apps.gsa.staticplugins.bubble;

import android.provider.Settings;
import com.google.android.apps.gsa.search.shared.service.p6936c.p6938b.C88474x;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.monet.p7070b.p7087f.C90235a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90332a;
import com.google.android.apps.gsa.shared.monet.p7116h.C90334c;
import com.google.android.apps.gsa.shared.util.permissions.ProxyIntentStarter;
import com.google.android.apps.gsa.staticplugins.bubble.p7581e.C96966a;
import com.google.android.apps.gsa.staticplugins.bubble.p7581e.C96967b;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.p1876k.C22869e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.c */
/* compiled from: PG */
public final /* synthetic */ class C96952c implements C22869e {

    /* renamed from: a */
    public final /* synthetic */ C96968f f270973a;

    /* renamed from: b */
    public final /* synthetic */ C88474x f270974b;

    /* renamed from: c */
    public final /* synthetic */ int f270975c;

    public /* synthetic */ C96952c(C96968f fVar, C88474x xVar, int i) {
        this.f270973a = fVar;
        this.f270974b = xVar;
        this.f270975c = i;
    }

    public final void run() {
        C96968f fVar = this.f270973a;
        C88474x xVar = this.f270974b;
        int i = this.f270975c;
        if (Settings.canDrawOverlays(fVar.f271005c.f271001a)) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1220;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            fVar.mo90388c(xVar, i);
            return;
        }
        C96967b bVar = fVar.f271005c;
        C96965e eVar = new C96965e(fVar, xVar, i);
        new ProxyIntentStarter(bVar.f271001a).mo65090b(C90334c.m146886a(C90332a.DIALOG.f252281i, C90235a.f252079a, ProtoParcelable.f63423a), new C96966a(bVar, eVar));
    }
}
