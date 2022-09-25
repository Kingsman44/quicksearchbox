package com.google.android.apps.gsa.assistant.settings.features.appactions;

import android.content.res.Resources;
import android.support.p031v4.app.C0210cb;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10253aa;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10256ad;
import com.google.android.apps.gsa.assistant.settings.features.appactions.p567c.C10266k;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58487gw;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.assistant.settings.features.appactions.ar */
/* compiled from: PG */
final class C10212ar extends C0210cb {

    /* renamed from: c */
    public final FragmentManager f34660c;

    /* renamed from: d */
    final /* synthetic */ C10216av f34661d;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C10212ar(C10216av avVar, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.f34661d = avVar;
        C58485gu.m89845m();
        C58485gu.m89845m();
        this.f34660c = fragmentManager;
    }

    /* renamed from: b */
    public final Fragment mo668b(int i) {
        C10266k a = C10266k.m25161a(this.f34661d.f34667c.f34807d);
        if (a == null) {
            a = C10266k.UNKNOWN;
        }
        if (a == C10266k.MAIN_PAGE) {
            if (i == 0) {
                C58976aa aaVar = C58975e.f156826a;
                C10253aa aaVar2 = (C10253aa) C10256ad.f34765j.createBuilder();
                aaVar2.copyOnWrite();
                C10256ad adVar = (C10256ad) aaVar2.instance;
                adVar.f34767a |= 2;
                adVar.f34768b = true;
                aaVar2.copyOnWrite();
                C10256ad adVar2 = (C10256ad) aaVar2.instance;
                adVar2.f34769c = 1;
                adVar2.f34767a |= 4;
                aaVar2.copyOnWrite();
                C10256ad adVar3 = (C10256ad) aaVar2.instance;
                adVar3.f34770d = 2;
                adVar3.f34767a |= 8;
                aaVar2.copyOnWrite();
                C10256ad adVar4 = (C10256ad) aaVar2.instance;
                adVar4.f34767a |= 64;
                adVar4.f34772f = true;
                aaVar2.copyOnWrite();
                C10256ad adVar5 = (C10256ad) aaVar2.instance;
                adVar5.f34767a |= 128;
                adVar5.f34773g = true;
                aaVar2.copyOnWrite();
                C10256ad adVar6 = (C10256ad) aaVar2.instance;
                adVar6.f34767a |= 256;
                adVar6.f34774h = true;
                return C10304cw.m25221f((C10256ad) aaVar2.build());
            } else if (i == 1) {
                C58976aa aaVar3 = C58975e.f156826a;
                C10253aa aaVar4 = (C10253aa) C10256ad.f34765j.createBuilder();
                aaVar4.copyOnWrite();
                C10256ad adVar7 = (C10256ad) aaVar4.instance;
                adVar7.f34767a |= 2;
                adVar7.f34768b = true;
                aaVar4.copyOnWrite();
                C10256ad adVar8 = (C10256ad) aaVar4.instance;
                adVar8.f34769c = 2;
                adVar8.f34767a |= 4;
                aaVar4.copyOnWrite();
                C10256ad adVar9 = (C10256ad) aaVar4.instance;
                adVar9.f34770d = 1;
                adVar9.f34767a |= 8;
                aaVar4.copyOnWrite();
                C10256ad adVar10 = (C10256ad) aaVar4.instance;
                adVar10.f34767a |= 64;
                adVar10.f34772f = true;
                aaVar4.copyOnWrite();
                C10256ad adVar11 = (C10256ad) aaVar4.instance;
                adVar11.f34767a |= 128;
                adVar11.f34773g = true;
                aaVar4.copyOnWrite();
                C10256ad adVar12 = (C10256ad) aaVar4.instance;
                adVar12.f34767a |= 512;
                adVar12.f34775i = true;
                return C10304cw.m25221f((C10256ad) aaVar4.build());
            } else {
                throw new AssertionError("Tab index out of bound.");
            }
        } else if (i == 0) {
            C58976aa aaVar5 = C58975e.f156826a;
            C10253aa aaVar6 = (C10253aa) C10256ad.f34765j.createBuilder();
            aaVar6.copyOnWrite();
            C10256ad adVar13 = (C10256ad) aaVar6.instance;
            adVar13.f34767a |= 2;
            adVar13.f34768b = false;
            aaVar6.copyOnWrite();
            C10256ad adVar14 = (C10256ad) aaVar6.instance;
            adVar14.f34769c = 3;
            adVar14.f34767a |= 4;
            aaVar6.copyOnWrite();
            C10256ad adVar15 = (C10256ad) aaVar6.instance;
            adVar15.f34767a |= 16;
            adVar15.f34771e = true;
            aaVar6.copyOnWrite();
            C10256ad adVar16 = (C10256ad) aaVar6.instance;
            adVar16.f34767a |= 64;
            adVar16.f34772f = true;
            return C10304cw.m25221f((C10256ad) aaVar6.build());
        } else if (i == 1) {
            C58976aa aaVar7 = C58975e.f156826a;
            C10253aa aaVar8 = (C10253aa) C10256ad.f34765j.createBuilder();
            aaVar8.copyOnWrite();
            C10256ad adVar17 = (C10256ad) aaVar8.instance;
            adVar17.f34767a |= 2;
            adVar17.f34768b = false;
            aaVar8.copyOnWrite();
            C10256ad adVar18 = (C10256ad) aaVar8.instance;
            adVar18.f34769c = 2;
            adVar18.f34767a |= 4;
            aaVar8.copyOnWrite();
            C10256ad adVar19 = (C10256ad) aaVar8.instance;
            adVar19.f34767a |= 16;
            adVar19.f34771e = true;
            aaVar8.copyOnWrite();
            C10256ad adVar20 = (C10256ad) aaVar8.instance;
            adVar20.f34767a |= 64;
            adVar20.f34772f = true;
            return C10304cw.m25221f((C10256ad) aaVar8.build());
        } else {
            throw new AssertionError("Tab index out of bound.");
        }
    }

    /* renamed from: k */
    public final int mo9175k() {
        C58487gw gwVar = C10216av.f34666b;
        C10266k a = C10266k.m25161a(this.f34661d.f34667c.f34807d);
        if (a == null) {
            a = C10266k.UNKNOWN;
        }
        return gwVar.mo55277g(a).size();
    }

    /* renamed from: m */
    public final CharSequence mo9177m(int i) {
        Resources resources = this.f34661d.f34668d.getResources();
        C58487gw gwVar = C10216av.f34666b;
        C10266k a = C10266k.m25161a(this.f34661d.f34667c.f34807d);
        if (a == null) {
            a = C10266k.UNKNOWN;
        }
        return resources.getString(((Integer) gwVar.mo55277g(a).get(i)).intValue());
    }
}
