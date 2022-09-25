package com.google.android.apps.gsa.sidekick.shared.cards;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import com.google.android.apps.gsa.sidekick.shared.p7241j.C91748d;
import com.google.android.apps.p489g.p494d.C9141ad;
import com.google.android.apps.p489g.p494d.C9192ca;
import com.google.android.apps.p489g.p494d.C9194cc;
import com.google.android.apps.p489g.p494d.C9195cd;
import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.sidekick.shared.cards.ag */
/* compiled from: PG */
public final class C91678ag implements C91680ai {

    /* renamed from: a */
    private static final C59071e f255672a = C59071e.m91332i("com.google.android.apps.gsa.sidekick.shared.cards.ag");

    /* renamed from: b */
    private final C91748d f255673b;

    /* renamed from: c */
    private final Context f255674c;

    public C91678ag(C91748d dVar, Context context) {
        this.f255673b = dVar;
        this.f255674c = context;
    }

    /* renamed from: b */
    public final void mo86157b(C9141ad adVar) {
        Bundle bundle;
        int a;
        C58838bb.m90869d((adVar.f31535a & 16) != 0, "ClientAction must have an OpenUrlAction to invoke handler.");
        C9195cd cdVar = adVar.f31541g;
        if (cdVar == null) {
            cdVar = C9195cd.f31746j;
        }
        boolean z = adVar.f31551q;
        if ((cdVar.f31748a & 1) == 0 || (a = C9194cc.m23685a(cdVar.f31749b)) == 0 || a != 2) {
            C9195cd cdVar2 = adVar.f31541g;
            if (cdVar2 == null) {
                cdVar2 = C9195cd.f31746j;
            }
            if (!cdVar2.f31756i || z) {
                String str = adVar.f31532J;
                String str2 = null;
                if (!cdVar.f31754g.isEmpty()) {
                    Bundle bundle2 = new Bundle();
                    for (C9192ca caVar : cdVar.f31754g) {
                        if (!caVar.f31744c.isEmpty()) {
                            bundle2.putStringArrayList(caVar.f31743b, new ArrayList(caVar.f31744c));
                        }
                    }
                    bundle = bundle2;
                } else {
                    bundle = null;
                }
                C59071e eVar = f255672a;
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(11870)).mo56386p("Opening deep link.");
                if ((cdVar.f31748a & 4) != 0) {
                    str2 = cdVar.f31751d;
                }
                String str3 = str2;
                if (this.f255673b.mo86238b(this.f255674c, Uri.parse(cdVar.f31750c), bundle, z, true, cdVar.f31753f, str3, str)) {
                    return;
                }
                if ((cdVar.f31748a & 8) != 0) {
                    this.f255673b.mo86241e(this.f255674c, Uri.parse(cdVar.f31752e), z, true);
                } else if (str3 != null) {
                    this.f255673b.mo86241e(this.f255674c, Uri.parse("market://details?id=".concat(str3)), z, true);
                } else {
                    ((C59052c) ((C59052c) eVar.mo56226d()).mo56372aa(11871)).mo56389s("No handler for: %s", z ? " (work)" : cdVar.f31750c);
                }
            } else {
                this.f255673b.mo86237a(this.f255674c, adVar);
            }
        } else {
            ((C59052c) ((C59052c) f255672a.mo56224b()).mo56372aa(11869)).mo56386p("Opening url broadcast.");
            this.f255673b.mo86239c(this.f255674c, cdVar.f31750c, z);
        }
    }
}
