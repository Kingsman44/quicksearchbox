package com.google.android.libraries.lens.view.p2078at;

import android.app.Activity;
import androidx.core.app.C1820g;
import androidx.p060c.C0979i;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2090ba.C25686g;
import com.google.android.libraries.lens.view.p2093d.C25752a;
import com.google.android.libraries.lens.view.p2093d.C25758g;
import com.google.android.libraries.logging.p2185ve.C28441k;
import com.google.android.libraries.logging.p2185ve.C28446p;
import com.google.android.libraries.logging.p2185ve.C28447q;
import com.google.android.libraries.logging.p2185ve.C28448r;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.android.libraries.p1730f.C21370a;
import com.google.apps.tiktok.account.p3603a.C45954d;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4522b.C58800sl;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.p4552o.p4563i.C59899bh;
import com.google.common.p4552o.p4563i.C59900bi;
import com.google.common.p4552o.p4563i.C59926ch;
import com.google.common.p4552o.p4563i.C59927ci;
import java.util.Arrays;
import java.util.Collections;
import java.util.Set;

/* renamed from: com.google.android.libraries.lens.view.at.ao */
/* compiled from: PG */
public final class C25509ao implements C25504aj {

    /* renamed from: a */
    public static final C58974d f69461a = C58974d.m91135i("PermissionsRequester");

    /* renamed from: b */
    public final Set f69462b = new C0979i(0);

    /* renamed from: c */
    public final C25513as f69463c;

    /* renamed from: d */
    public final C21370a f69464d;

    /* renamed from: e */
    public final C28448r f69465e;

    /* renamed from: f */
    public final C25684e f69466f;

    /* renamed from: g */
    public final C58495hd f69467g;

    /* renamed from: h */
    public final C25758g f69468h = new C25758g(C58733pz.f156496a);

    /* renamed from: i */
    public C25507am f69469i;

    /* renamed from: j */
    private final Set f69470j = new C0979i(0);

    /* renamed from: k */
    private final Activity f69471k;

    /* renamed from: l */
    private final String[] f69472l;

    public C25509ao(Activity activity, C25513as asVar, C21370a aVar, C28448r rVar, C25684e eVar, boolean z) {
        this.f69471k = activity;
        this.f69463c = asVar;
        this.f69464d = aVar;
        this.f69465e = rVar;
        this.f69466f = eVar;
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("android.permission.ACCESS_COARSE_LOCATION", new C25508an(-1, -1, -1));
        gzVar.mo55429h("android.permission.ACCESS_FINE_LOCATION", new C25508an(-1, -1, -1));
        gzVar.mo55429h("android.permission.CAMERA", new C25508an(136783, 132965, 132966));
        gzVar.mo55429h(C25501ag.m46966a(activity), new C25508an(136784, 132915, 132916));
        this.f69467g = gzVar.mo55427f(false);
        this.f69472l = z ? new String[]{"android.permission.ACCESS_FINE_LOCATION", "android.permission.ACCESS_COARSE_LOCATION"} : new String[]{"android.permission.ACCESS_FINE_LOCATION"};
    }

    /* renamed from: i */
    public static C59927ci m46982i(int i) {
        C59926ch chVar = (C59926ch) C59927ci.f161969c.createBuilder();
        chVar.copyOnWrite();
        C59927ci ciVar = (C59927ci) chVar.instance;
        ciVar.f161971a |= 1;
        ciVar.f161972b = i;
        return (C59927ci) chVar.build();
    }

    /* renamed from: a */
    public final C25752a mo30531a() {
        return this.f69468h;
    }

    /* renamed from: b */
    public final String mo30532b() {
        return C25501ag.m46966a(this.f69471k);
    }

    /* renamed from: c */
    public final void mo30533c(String str, C25502ah ahVar, int i) {
        mo30534d(new String[]{str}, new C25506al(ahVar), i);
    }

    /* renamed from: d */
    public final void mo30534d(String[] strArr, C25503ai aiVar, int i) {
        int i2;
        C19559g.m37304c();
        C25507am amVar = this.f69469i;
        if (amVar != null) {
            ((C58970a) ((C58970a) f69461a.mo56225c()).mo56372aa(50136)).mo56354G("Failed to request permissions %s: There's already a request in progress: %s", Arrays.toString(strArr), amVar);
            return;
        }
        this.f69469i = new C25525h(aiVar, C58485gu.m89844l(strArr), i, this.f69464d.mo26870b());
        Collections.addAll(this.f69470j, strArr);
        C1820g.m4991a(this.f69471k, strArr, 1234);
        for (String str : strArr) {
            C25508an anVar = (C25508an) this.f69467g.get(str);
            if (!(anVar == null || (i2 = anVar.f69458a) == -1)) {
                C28448r rVar = this.f69465e;
                C28446p a = C28447q.m53152a(i2);
                a.mo33898b(C45954d.m82060a(this.f69466f.f69824a));
                C59899bh bhVar = (C59899bh) C59900bi.f161890j.createBuilder();
                C59927ci i3 = m46982i(i);
                bhVar.copyOnWrite();
                C59900bi biVar = (C59900bi) bhVar.instance;
                i3.getClass();
                biVar.f161900h = i3;
                biVar.f161893a |= 65536;
                a.f77232a.mo33895b(new C28441k(C25686g.f69826b, (C59900bi) bhVar.build()));
                rVar.mo33855a(a.mo33897a());
            }
        }
    }

    /* renamed from: e */
    public final void mo30535e() {
        C19559g.m37304c();
        C0979i iVar = new C0979i(0);
        C58800sl lA = this.f69467g.keySet().iterator();
        while (lA.hasNext()) {
            String str = (String) lA.next();
            if (this.f69463c.mo30543a(str)) {
                iVar.add(str);
            }
        }
        if (!((C58528ij) this.f69468h.mo3842a()).equals(iVar)) {
            C25758g gVar = this.f69468h;
            C58528ij F = C58528ij.m90006F(iVar);
            F.getClass();
            gVar.mo5708l(F);
        }
    }

    /* renamed from: f */
    public final boolean mo30536f(String str) {
        return this.f69463c.mo30543a(str);
    }

    /* renamed from: g */
    public final boolean mo30537g(String str) {
        return this.f69470j.contains(str);
    }

    /* renamed from: h */
    public final String[] mo30538h() {
        return this.f69472l;
    }
}
