package com.google.android.libraries.lens.view.p2133i;

import android.view.View;
import android.view.ViewTreeObserver;
import com.google.android.libraries.lens.common.p2000c.C24105b;
import com.google.android.libraries.lens.p2014e.C24231w;
import com.google.android.libraries.lens.view.main.C27315be;
import com.google.android.libraries.lens.view.main.C27327bq;
import com.google.android.libraries.lens.view.main.C27390dy;
import com.google.android.libraries.lens.view.p2090ba.C25684e;
import com.google.android.libraries.lens.view.p2133i.p2134a.C26898c;
import com.google.android.libraries.lens.view.p2133i.p2136c.C26912h;
import com.google.android.libraries.lens.view.p2133i.p2136c.C26913i;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28442l;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28485y;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.p2872a.p2880h.C37194a;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.apps.tiktok.tracing.contrib.p3685a.p3687b.p3688a.p3689a.C47594b;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import com.google.lens.p4707j.C62576j;
import com.google.lens.p4707j.C62586t;
import com.google.p4017at.p4056g.p4057a.p4058a.C54013bu;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56306df;
import dagger.hilt.android.internal.managers.C68324h;

/* renamed from: com.google.android.libraries.lens.view.i.q */
/* compiled from: PG */
public final class C26932q {

    /* renamed from: r */
    public static final /* synthetic */ int f73384r = 0;

    /* renamed from: s */
    private static final C58974d f73385s = C58974d.m91135i("DevicePickerFragment");

    /* renamed from: a */
    public final C26902b f73386a;

    /* renamed from: b */
    public final String f73387b;

    /* renamed from: c */
    public final C47594b f73388c;

    /* renamed from: d */
    public final C26917d f73389d;

    /* renamed from: e */
    public final C21370a f73390e;

    /* renamed from: f */
    public final C26913i f73391f;

    /* renamed from: g */
    public final C60888db f73392g;

    /* renamed from: h */
    public final C28310af f73393h;

    /* renamed from: i */
    public final C25684e f73394i;

    /* renamed from: j */
    public final C28306ab f73395j;

    /* renamed from: k */
    public final C47770dh f73396k;

    /* renamed from: l */
    public C26935t f73397l;

    /* renamed from: m */
    public ViewTreeObserver.OnGlobalLayoutListener f73398m;

    /* renamed from: n */
    C26931p f73399n;

    /* renamed from: o */
    public C60870cx f73400o = C60856cj.m92898g();

    /* renamed from: p */
    C26912h f73401p;

    /* renamed from: q */
    public C27390dy f73402q;

    /* renamed from: t */
    private final C28443m f73403t;

    public C26932q(C26902b bVar, C58833ax axVar, C47594b bVar2, C26917d dVar, C21370a aVar, C26913i iVar, C60888db dbVar, C28310af afVar, C25684e eVar, C28443m mVar, C28306ab abVar, C47770dh dhVar) {
        this.f73386a = bVar;
        this.f73387b = (String) axVar.mo56107c();
        this.f73388c = bVar2;
        this.f73389d = dVar;
        this.f73390e = aVar;
        this.f73391f = iVar;
        this.f73392g = dbVar;
        this.f73393h = afVar;
        this.f73394i = eVar;
        this.f73403t = mVar;
        this.f73395j = abVar;
        this.f73396k = dhVar;
    }

    /* renamed from: e */
    public static C26917d m49879e(AccountId accountId, C62576j jVar) {
        C62586t tVar = jVar.f168939a;
        if (tVar == null) {
            tVar = C62586t.f168973d;
        }
        C26895a aVar = (C26895a) C26902b.f73332c.createBuilder();
        aVar.copyOnWrite();
        tVar.getClass();
        ((C26902b) aVar.instance).f73334a = tVar;
        boolean z = jVar.f168942d;
        aVar.copyOnWrite();
        ((C26902b) aVar.instance).f73335b = z;
        C26917d dVar = new C26917d();
        C68324h.m98669f(dVar);
        C47247a.m84047b(dVar, accountId);
        C47243l.m84039a(dVar, (C26902b) aVar.build());
        return dVar;
    }

    /* renamed from: a */
    public final void mo32316a() {
        this.f73400o.cancel(false);
        mo32318c(5);
    }

    /* renamed from: b */
    public final void mo32317b(View view) {
        this.f73403t.mo33853c(C28442l.m53142h().mo33894a(), C28485y.m53234a(view));
    }

    /* renamed from: c */
    public final void mo32318c(int i) {
        if (this.f73389d.getView() != null) {
            BottomSheetBehavior.m78767C(this.f73399n.f73373b).mo47519v(i);
        } else {
            ((C58970a) ((C58970a) f73385s.mo56226d()).mo56372aa(49268)).mo56386p("Setting bottom sheet failed.");
        }
    }

    /* renamed from: d */
    public final void mo32319d(int i) {
        C27390dy dyVar;
        C26913i iVar = this.f73391f;
        if (iVar == null) {
            return;
        }
        if ((i == 2 || i == 5 || iVar.mo32273d()) && (dyVar = this.f73402q) != null) {
            C27327bq bqVar = dyVar.f75012b.f74881C;
            if (bqVar.f74781aa.mo32275f(i)) {
                C56306df dfVar = C56306df.UNKNOWN_FILTER_TYPE;
                C26898c cVar = C26898c.INTERNAL;
                C24231w wVar = C24231w.UNKNOWN;
                int i2 = i - 1;
                if (i2 == 1) {
                    bqVar.f74809n.mo19974a(C37194a.f98462aY);
                } else if (i2 == 2) {
                    bqVar.f74809n.mo19974a(C37194a.f98461aX);
                } else if (i2 == 4) {
                    bqVar.f74809n.mo19974a(C37194a.f98463aZ);
                }
                C60856cj.m92911t(((C24105b) bqVar.f74780Z.mo17428b()).mo29498a(C54013bu.f141724a), C47810es.m84974n(new C27315be(bqVar)), bqVar.f74799d);
                return;
            }
            ((C59052c) ((C59052c) C27327bq.f74753a.mo56224b()).mo56372aa(49732)).mo56386p("Skipped requesting device list as there's on-going request.");
        }
    }
}
