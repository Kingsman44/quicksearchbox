package com.google.android.apps.gsa.assistant.settings.features.calls;

import androidx.preference.C4024t;
import androidx.preference.Preference;
import com.google.android.apps.gsa.shared.p7066m.C90059dk;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50031i;
import com.google.assistant.p3861at.C50058j;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.calls.bd */
/* compiled from: PG */
public final /* synthetic */ class C73016bd implements C4024t {

    /* renamed from: a */
    public final /* synthetic */ bw f193657a;

    public /* synthetic */ C73016bd(bw bwVar) {
        this.f193657a = bwVar;
    }

    /* renamed from: b */
    public final boolean mo8421b(Preference preference) {
        bw bwVar = this.f193657a;
        if (bwVar.n.mo79746e(C90059dk.f249106bP)) {
            bwVar.H();
            return true;
        }
        C50031i iVar = (C50031i) C50058j.f130146f.createBuilder();
        String g = bwVar.mo17795g(R.string.assistant_settings_duo_consent_title);
        iVar.copyOnWrite();
        C50058j jVar = (C50058j) iVar.instance;
        g.getClass();
        jVar.f130148a |= 4;
        jVar.f130150c = g;
        String g2 = bwVar.mo17795g(R.string.assistant_settings_duo_consent_summary);
        iVar.copyOnWrite();
        C50058j jVar2 = (C50058j) iVar.instance;
        g2.getClass();
        jVar2.f130148a |= 8;
        jVar2.f130151d = g2;
        z.a(bwVar.s, bwVar.l, (C50058j) iVar.build(), bwVar);
        return true;
    }
}
