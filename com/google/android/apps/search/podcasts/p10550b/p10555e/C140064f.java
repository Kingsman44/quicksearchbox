package com.google.android.apps.search.podcasts.p10550b.p10555e;

import androidx.p060c.C0984n;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97884aj;
import com.google.android.apps.gsa.staticplugins.p7678cl.p7680b.C97885ak;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54148ac;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54149ad;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54156h;
import com.google.p4017at.p4060h.p4061a.p4062a.p4066d.C54174z;
import com.google.protos.p4757ac.p4758a.C63112k;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.Set;

/* renamed from: com.google.android.apps.search.podcasts.b.e.f */
/* compiled from: PG */
public final /* synthetic */ class C140064f implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C140084z f380650a;

    public /* synthetic */ C140064f(C140084z zVar) {
        this.f380650a = zVar;
    }

    public final C60870cx apply(Object obj) {
        C63113l lVar;
        long j;
        C140083y yVar = (C140083y) C60856cj.m92909r(this.f380650a.f380694e.mo50395b());
        C54149ad adVar = ((C54174z) obj).f142181a;
        if (adVar == null) {
            adVar = C54149ad.f142103c;
        }
        int i = yVar.f380685d.f3122d;
        if (yVar.f380689h == 0) {
            int i2 = yVar.f380682a.f380669a.f3122d;
            while (true) {
                i2--;
                if (i2 < 0) {
                    break;
                }
                C140074p pVar = (C140074p) yVar.f380682a.f380669a.mo3708h(i2);
                C63113l lVar2 = pVar.f380667b;
                if (lVar2 != null && yVar.f380685d.containsKey(lVar2.f170375i)) {
                    Set set = (Set) yVar.f380685d.get(pVar.f380667b.f170375i);
                    int i3 = pVar.f380666a.f3122d;
                    while (true) {
                        i3--;
                        if (i3 < 0) {
                            break;
                        } else if (!set.contains(pVar.f380666a.mo3702e(i3))) {
                            pVar.f380666a.mo3704f(i3);
                        }
                    }
                } else {
                    yVar.f380682a.f380669a.mo3704f(i2);
                }
            }
        }
        yVar.f380689h = adVar.f142106b;
        boolean z = false;
        boolean z2 = false;
        for (C54148ac acVar : adVar.f142105a) {
            String str = acVar.f142098b;
            if (str.isEmpty()) {
                if (acVar.f142097a.isEmpty()) {
                    C58976aa aaVar = C58975e.f156826a;
                } else {
                    C58976aa aaVar2 = C58975e.f156826a;
                    str = acVar.f142097a;
                }
            }
            if (!yVar.f380682a.f380669a.containsKey(str) || ((C140074p) yVar.f380682a.f380669a.get(str)).f380667b == null) {
                C63112k kVar = (C63112k) C63113l.f170365p.createBuilder();
                kVar.copyOnWrite();
                C63113l lVar3 = (C63113l) kVar.instance;
                str.getClass();
                lVar3.f170367a |= 512;
                lVar3.f170375i = str;
                String str2 = acVar.f142097a;
                kVar.copyOnWrite();
                C63113l lVar4 = (C63113l) kVar.instance;
                str2.getClass();
                lVar4.f170367a |= 64;
                lVar4.f170373g = str2;
                kVar.copyOnWrite();
                C63113l lVar5 = (C63113l) kVar.instance;
                lVar5.f170367a |= 1;
                lVar5.f170368b = BuildConfig.FLAVOR;
                lVar = (C63113l) kVar.build();
            } else {
                lVar = ((C140074p) yVar.f380682a.f380669a.get(str)).f380667b;
            }
            if (acVar.f142100d) {
                yVar.f380682a.f380669a.remove(str);
                if (acVar.f142099c.size() > 0) {
                    yVar.mo115430a(str, C58833ax.m90834k(lVar));
                }
                yVar.f380685d.remove(str);
                z2 = true;
            }
            if (acVar.f142099c.size() > 0) {
                C0984n nVar = yVar.mo115430a(str, C58833ax.m90834k(lVar)).f380666a;
                for (C54156h hVar : acVar.f142099c) {
                    if (!nVar.containsKey(hVar.f142121b)) {
                        j = -1;
                    } else {
                        j = ((C97885ak) nVar.get(hVar.f142121b)).f273311e;
                    }
                    long j2 = hVar.f142125f;
                    if (j < j2) {
                        C97884aj ajVar = (C97884aj) C97885ak.f273305g.createBuilder();
                        String str3 = hVar.f142121b;
                        ajVar.copyOnWrite();
                        C97885ak akVar = (C97885ak) ajVar.instance;
                        str3.getClass();
                        akVar.f273307a |= 1;
                        akVar.f273308b = str3;
                        boolean z3 = hVar.f142122c;
                        ajVar.copyOnWrite();
                        C97885ak akVar2 = (C97885ak) ajVar.instance;
                        akVar2.f273307a |= 4;
                        akVar2.f273310d = z3;
                        long j3 = hVar.f142123d;
                        ajVar.copyOnWrite();
                        C97885ak akVar3 = (C97885ak) ajVar.instance;
                        akVar3.f273307a |= 2;
                        akVar3.f273309c = j3;
                        long j4 = hVar.f142125f;
                        ajVar.copyOnWrite();
                        C97885ak akVar4 = (C97885ak) ajVar.instance;
                        akVar4.f273307a |= 16;
                        akVar4.f273311e = j4;
                        if ((hVar.f142120a & 8) != 0) {
                            float f = hVar.f142124e;
                            ajVar.copyOnWrite();
                            C97885ak akVar5 = (C97885ak) ajVar.instance;
                            akVar5.f273307a |= 32;
                            akVar5.f273312f = f;
                        }
                        C97885ak akVar6 = (C97885ak) ajVar.build();
                        nVar.put(akVar6.f273308b, akVar6);
                        if (yVar.f380685d.containsKey(str)) {
                            ((Set) yVar.f380685d.get(str)).remove(akVar6.f273308b);
                        }
                        z2 = true;
                    } else if (j == j2) {
                        if (yVar.f380685d.containsKey(str)) {
                            ((Set) yVar.f380685d.get(str)).remove(hVar.f142121b);
                        }
                    } else if (j > yVar.f380687f && yVar.f380685d.containsKey(str) && ((Set) yVar.f380685d.get(str)).contains(hVar.f142121b)) {
                        z = true;
                    }
                }
            }
            if (yVar.f380685d.containsKey(str) && ((Set) yVar.f380685d.get(str)).isEmpty()) {
                yVar.f380685d.remove(str);
            }
        }
        int i4 = yVar.f380682a.f380669a.f3122d;
        while (true) {
            i4--;
            if (i4 < 0) {
                break;
            }
            C140074p pVar2 = (C140074p) yVar.f380682a.f380669a.mo3708h(i4);
            if (pVar2.f380666a.isEmpty()) {
                C63113l lVar6 = pVar2.f380667b;
                if (!(lVar6 == null || (lVar6.f170367a & 512) == 0)) {
                    yVar.f380685d.remove(lVar6.f170375i);
                }
                yVar.f380682a.f380669a.mo3704f(i4);
            }
        }
        if (i <= 0 || i != yVar.f380685d.f3122d || z) {
            yVar.f380688g = 0;
        } else {
            yVar.f380688g++;
            C58976aa aaVar3 = C58975e.f156826a;
        }
        if (yVar.f380688g >= 3) {
            C59104x d = C140084z.f380690a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "ProgressManager");
            ((C59052c) ((C59052c) d).mo56372aa(41560)).mo56387q("All the consecutive progress sync retries fail for %d shows, removing the local pending progress", yVar.f380686e);
            while (yVar.f380686e > 0) {
                yVar.f380685d.mo3704f(0);
                yVar.f380686e--;
            }
            yVar.f380688g = 0;
        }
        if (z2) {
            yVar.f380682a.mo115427c();
        }
        return C60856cj.m92900i(new C140072n(z2, !yVar.f380685d.isEmpty()));
    }
}
