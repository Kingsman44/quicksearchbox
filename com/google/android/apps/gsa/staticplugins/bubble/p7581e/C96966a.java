package com.google.android.apps.gsa.staticplugins.bubble.p7581e;

import android.content.Context;
import android.content.Intent;
import android.provider.Settings;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.util.p7184t.C91096f;
import com.google.android.apps.gsa.staticplugins.bubble.C96954d;
import com.google.android.apps.gsa.staticplugins.bubble.C96965e;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.protos.p4816ai.p4818b.C63196b;

/* renamed from: com.google.android.apps.gsa.staticplugins.bubble.e.a */
/* compiled from: PG */
public final /* synthetic */ class C96966a implements C91096f {

    /* renamed from: a */
    public final /* synthetic */ C96967b f270999a;

    /* renamed from: b */
    public final /* synthetic */ C96965e f271000b;

    public /* synthetic */ C96966a(C96967b bVar, C96965e eVar) {
        this.f270999a = bVar;
        this.f271000b = eVar;
    }

    /* renamed from: hg */
    public final boolean mo17703hg(int i, Intent intent, Context context) {
        C96967b bVar = this.f270999a;
        C96965e eVar = this.f271000b;
        if (Settings.canDrawOverlays(bVar.f271001a)) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 1218;
            C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
            eVar.f270998c.f271003a.mo28212l("showBubbleInner", new C96954d(eVar, eVar.f270996a, eVar.f270997b));
            return true;
        }
        C60548tz tzVar2 = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar2.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar2.instance;
        ufVar2.f164093a |= 2;
        ufVar2.f164258m = 1217;
        C89949q.m146525j((C60555uf) tzVar2.build(), (C60321oe) null, (C63196b) null, (String) null);
        return true;
    }
}
