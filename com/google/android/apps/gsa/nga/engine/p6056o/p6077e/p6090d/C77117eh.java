package com.google.android.apps.gsa.nga.engine.p6056o.p6077e.p6090d;

import android.content.Intent;
import android.location.Location;
import androidx.core.p089c.C1844b;
import com.google.android.apps.gsa.nga.engine.am.q.d;
import com.google.android.apps.gsa.nga.engine.am.t;
import com.google.android.apps.gsa.nga.engine.p5913am.p5938t.C74956m;
import com.google.android.apps.gsa.nga.engine.p5913am.p5939u.C74965n;
import com.google.android.apps.gsa.nga.engine.p6144ui.answer.C78059be;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80399l;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.C80401n;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80293ao;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80295aq;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80303ay;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80307bb;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6281e.p6282a.C80338cf;
import com.google.android.apps.gsa.nga.shared.p6307af.C80595f;
import com.google.android.apps.gsa.nga.shared.p6307af.C80600k;
import com.google.android.apps.gsa.nga.shared.p6307af.p6308a.C80590x;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80904as;
import com.google.android.apps.gsa.nga.shared.p6321am.p6322a.C80905at;
import com.google.android.apps.gsa.nga.shared.p6358n.C81442m;
import com.google.android.apps.gsa.nga.shared.p6407v.C83044e;
import com.google.android.apps.gsa.nga.shared.p6407v.p6411d.C82835ce;
import com.google.android.apps.gsa.nga.shared.permissions.PermissionsRequestActivity;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22864c;
import com.google.common.p4522b.C58485gu;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.Locale;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.engine.o.e.d.eh */
/* compiled from: PG */
public final /* synthetic */ class C77117eh implements C22864c {

    /* renamed from: a */
    public final /* synthetic */ C77123en f212825a;

    /* renamed from: b */
    public final /* synthetic */ C74965n f212826b;

    /* renamed from: c */
    public final /* synthetic */ C77122em f212827c;

    /* renamed from: d */
    public final /* synthetic */ C77088df f212828d;

    /* renamed from: e */
    public final /* synthetic */ C74956m f212829e;

    public /* synthetic */ C77117eh(C77123en enVar, C74965n nVar, C77122em emVar, C77088df dfVar, C74956m mVar) {
        this.f212825a = enVar;
        this.f212826b = nVar;
        this.f212827c = emVar;
        this.f212828d = dfVar;
        this.f212829e = mVar;
    }

    /* renamed from: a */
    public final Object mo17879a(Object obj) {
        C60870cx cxVar;
        C77123en enVar = this.f212825a;
        C74965n nVar = this.f212826b;
        C77122em emVar = this.f212827c;
        C77088df dfVar = this.f212828d;
        C74956m mVar = this.f212829e;
        if (!((Boolean) obj).booleanValue()) {
            enVar.f212858o.mo76648a(nVar.mo71336k(), C82835ce.ACCESS_TO_COMMUNICATIONS_NOT_ALLOWED, C83044e.f226656a);
            return C81442m.f222851a;
        }
        C77122em emVar2 = C77122em.SCREENSHOT;
        int ordinal = emVar.ordinal();
        if (ordinal == 0) {
            return C60922j.m93044g(enVar.mo72431h(dfVar, mVar), C77093dk.f212760a, C60826bg.f164896a);
        }
        if (ordinal != 1) {
            boolean booleanValue = ((Boolean) dfVar.mo72405a().mo71340o().map(C77106dx.f212803a).orElse(true)).booleanValue();
            return enVar.f212853j.mo28209i(C80905at.m128760d(enVar.f212853j, "[NGA] ShareFulfiller.shareForeground", C58485gu.m89844l(new C80904as[]{new C77107dy(enVar, dfVar), new C77108dz(enVar, dfVar), new C77110ea(enVar, dfVar), new C77111eb(enVar, dfVar), new C77112ec(enVar, booleanValue, dfVar, mVar)})), "[NGA] SharingResponse to SystemResponse", C77114ee.f212821a);
        }
        if (!enVar.f212860q.b()) {
            Locale q = dfVar.mo72405a().mo71342q();
            C80399l lVar = (C80399l) C80401n.f220656k.createBuilder();
            C78059be beVar = enVar.f212850g;
            String[] strArr = C77123en.f212846d;
            C81442m.m129557s(lVar, t.r(beVar.f215020b.mo75121a(q).getString(R.string.nga_missing_location_permission, new Object[0])));
            C81442m.m129557s(lVar, t.n(beVar.mo73039a(PermissionsRequestActivity.m129561b(beVar.f215019a, strArr), q)));
            cxVar = C60856cj.m92900i(Optional.m71637of((C80401n) lVar.build()));
        } else if (!C1844b.m5056a(enVar.f212860q.a)) {
            Locale q2 = dfVar.mo72405a().mo71342q();
            C80399l lVar2 = (C80399l) C80401n.f220656k.createBuilder();
            C81442m.m129557s(lVar2, t.r(enVar.f212859p.mo75121a(q2).getString(R.string.nga_location_services_are_off, new Object[0])));
            C80595f f = C80595f.m128216f(C80590x.CLIENT_OP_SUGGESTION_ON_DEVICE, enVar.f212859p.mo75121a(q2).getString(R.string.nga_comms_share_open_location_settings_suggestion, new Object[0]));
            f.mo74361h(27105);
            C81442m.m129557s(lVar2, t.n(C80600k.m128226a(f.mo74357a(new Intent("android.settings.LOCATION_SOURCE_SETTINGS")).mo74356a())));
            cxVar = C60856cj.m92900i(Optional.m71637of((C80401n) lVar2.build()));
        } else {
            Optional c = enVar.f212860q.c(d.c);
            if (!c.isPresent()) {
                enVar.f212858o.mo76648a(dfVar.mo72405a().mo71336k(), C82835ce.SHARE_LOCATION_NOT_AVAILABLE, C83044e.f226656a);
                cxVar = C60856cj.m92900i(Optional.empty());
            } else {
                Location location = (Location) c.get();
                String format = String.format(Locale.US, "https://maps.google.com/maps?q=%f,%f", new Object[]{Double.valueOf(location.getLatitude()), Double.valueOf(location.getLongitude())});
                Object[] objArr = {format};
                String string = enVar.f212859p.mo75121a(dfVar.mo72405a().mo71342q()).getString(R.string.nga_processors_share_location_message, objArr);
                C80399l lVar3 = (C80399l) C80401n.f220656k.createBuilder();
                C80293ao aoVar = (C80293ao) C80295aq.f220357c.createBuilder();
                C80338cf cfVar = C80338cf.f220449a;
                aoVar.copyOnWrite();
                C80295aq aqVar = (C80295aq) aoVar.instance;
                cfVar.getClass();
                aqVar.f220360b = cfVar;
                aqVar.f220359a = 7;
                C81442m.m129555q(lVar3, aoVar);
                C80303ay ayVar = (C80303ay) C80307bb.f220382e.createBuilder();
                cxVar = enVar.f212853j.mo28210j(enVar.f212848e.mo72416b(dfVar, ayVar), "[NGA] ShareFulfiller.shareLocation", new C77113ed(enVar, string, lVar3, ayVar));
            }
        }
        return C60922j.m93044g(cxVar, C77094dl.f212761a, C60826bg.f164896a);
    }
}
