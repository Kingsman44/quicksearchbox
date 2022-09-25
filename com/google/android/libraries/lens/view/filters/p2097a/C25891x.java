package com.google.android.libraries.lens.view.filters.p2097a;

import android.content.Context;
import android.location.Location;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.p2078at.C25504aj;
import com.google.android.libraries.lens.view.p2148l.C27232l;
import com.google.android.libraries.lens.view.session.C27749al;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.material.progress.MaterialProgressBar;
import com.google.android.libraries.places.api.model.Place;
import com.google.android.libraries.places.api.p2437b.C31863s;
import com.google.android.libraries.search.location.C38693ak;
import com.google.android.material.button.MaterialButton;
import com.google.apps.tiktok.account.AccountId;
import com.google.apps.tiktok.inject.p3659d.C47243l;
import com.google.apps.tiktok.inject.p3660e.p3661a.C47247a;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58710pc;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60888db;
import dagger.hilt.android.internal.managers.C68324h;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import p3186j$.util.DesugarArrays;
import p3186j$.util.Objects;
import p3186j$.util.stream.Stream;

/* renamed from: com.google.android.libraries.lens.view.filters.a.x */
/* compiled from: PG */
public final class C25891x {

    /* renamed from: a */
    public static final C58974d f70327a = C58974d.m91135i("DiningFilter");

    /* renamed from: b */
    public static final C58528ij f70328b = C58528ij.m90013M(Place.Type.BAR, Place.Type.BAKERY, Place.Type.CAFE, Place.Type.RESTAURANT);

    /* renamed from: c */
    public static final C58485gu f70329c = C58485gu.m89850r(Place.Field.ID, Place.Field.NAME, Place.Field.ADDRESS, Place.Field.LAT_LNG, Place.Field.TYPES);

    /* renamed from: A */
    public final C28306ab f70330A;

    /* renamed from: B */
    public final C47770dh f70331B;

    /* renamed from: C */
    public final C25874g f70332C;

    /* renamed from: D */
    public final Map f70333D = new LinkedHashMap();

    /* renamed from: E */
    private final AccountId f70334E;

    /* renamed from: F */
    private final C25876i f70335F;

    /* renamed from: G */
    private final Context f70336G;

    /* renamed from: H */
    private final C27749al f70337H;

    /* renamed from: I */
    private final C25887t f70338I = new C25887t(this);

    /* renamed from: J */
    private final C25888u f70339J = new C25888u(this);

    /* renamed from: d */
    public C25865ao f70340d;

    /* renamed from: e */
    public C25865ao f70341e;

    /* renamed from: f */
    public boolean f70342f;

    /* renamed from: g */
    public boolean f70343g;

    /* renamed from: h */
    public boolean f70344h;

    /* renamed from: i */
    public boolean f70345i;

    /* renamed from: j */
    public boolean f70346j;

    /* renamed from: k */
    public boolean f70347k;

    /* renamed from: l */
    public Location f70348l;

    /* renamed from: m */
    public C60870cx f70349m;

    /* renamed from: n */
    public MaterialButton f70350n;

    /* renamed from: o */
    public MaterialProgressBar f70351o;

    /* renamed from: p */
    public int f70352p;

    /* renamed from: q */
    public int f70353q;

    /* renamed from: r */
    public RelativeLayout f70354r;

    /* renamed from: s */
    public final C28310af f70355s;

    /* renamed from: t */
    public final C28443m f70356t;

    /* renamed from: u */
    public final C31863s f70357u;

    /* renamed from: v */
    public final C38693ak f70358v;

    /* renamed from: w */
    public final C25504aj f70359w;

    /* renamed from: x */
    public final C60888db f70360x;

    /* renamed from: y */
    public final C27232l f70361y;

    /* renamed from: z */
    public final String f70362z;

    public C25891x(AccountId accountId, C25876i iVar, C28310af afVar, C28443m mVar, Context context, C31863s sVar, C38693ak akVar, C27749al alVar, C25504aj ajVar, C60888db dbVar, C27232l lVar, C28306ab abVar, C47770dh dhVar, C25874g gVar) {
        this.f70334E = accountId;
        this.f70335F = iVar;
        this.f70355s = afVar;
        this.f70356t = mVar;
        this.f70336G = context;
        this.f70357u = sVar;
        this.f70358v = akVar;
        this.f70337H = alVar;
        this.f70359w = ajVar;
        this.f70360x = dbVar;
        this.f70361y = lVar;
        this.f70330A = abVar;
        this.f70331B = dhVar;
        this.f70332C = gVar;
        this.f70362z = context.getString(R.string.lens_no_detected_restaurant);
    }

    /* renamed from: l */
    public static boolean m47753l(Place place) {
        return (place == null || place.mo37518o() == null || place.mo37519p() == null || place.mo37516m() == null || place.mo37503b() == null) ? false : true;
    }

    /* renamed from: a */
    public final C25865ao mo31052a(Place place) {
        float f;
        double d = place.mo37503b().f392012a;
        double d2 = place.mo37503b().f392013b;
        Location location = new Location("flp");
        location.setLatitude(d);
        location.setLongitude(d2);
        String o = place.mo37518o();
        String p = place.mo37519p();
        String m = place.mo37516m();
        Location location2 = this.f70348l;
        if (location2 == null) {
            ((C58970a) ((C58970a) f70327a.mo56226d()).mo56372aa(49365)).mo56386p("Must have current and restaurant locations to calculate distance.");
            f = 0.0f;
        } else {
            f = location2.distanceTo(location);
        }
        return new C25850a(o, p, m, f);
    }

    /* renamed from: b */
    public final void mo31053b() {
        Stream stream = DesugarArrays.stream((T[]) this.f70359w.mo30538h());
        C25504aj ajVar = this.f70359w;
        Objects.requireNonNull(ajVar);
        if (stream.anyMatch(new C25883p(ajVar))) {
            mo31055d();
        } else {
            mo31060i();
        }
    }

    /* renamed from: c */
    public final void mo31054c() {
        C60870cx b = this.f70337H.mo33224b();
        C25890w wVar = new C25890w(this.f70335F);
        C60856cj.m92911t(b, C47810es.m84974n(wVar), this.f70360x);
    }

    /* renamed from: d */
    public final void mo31055d() {
        this.f70342f = true;
        mo31054c();
    }

    /* renamed from: e */
    public final void mo31056e() {
        if (this.f70351o.getVisibility() == 0) {
            this.f70351o.setVisibility(8);
            this.f70350n.mo47553j(this.f70352p);
            MaterialButton materialButton = this.f70350n;
            materialButton.setPadding(this.f70353q, materialButton.getPaddingTop(), this.f70350n.getPaddingRight(), this.f70350n.getPaddingBottom());
        }
    }

    /* renamed from: f */
    public final void mo31057f(boolean z) {
        AccountId accountId = this.f70334E;
        String str = true != z ? BuildConfig.FLAVOR : "shouldShowRationaleView";
        C25851aa aaVar = new C25851aa();
        C68324h.m98669f(aaVar);
        C47247a.m84047b(aaVar, accountId);
        C47243l.m84040b(aaVar, str);
        aaVar.showNow(this.f70335F.getChildFragmentManager(), "LensDiningNearbyRestaurants");
        C25864an a = aaVar.mo17754z();
        C25887t tVar = this.f70338I;
        C25888u uVar = this.f70339J;
        Collection values = this.f70333D.values();
        C25865ao aoVar = this.f70340d;
        List k = C58710pc.m90487d(C25884q.f70320a).mo55816k(values);
        if (aoVar != null) {
            k.remove(aoVar);
            k.add(0, aoVar);
        }
        Location location = this.f70348l;
        a.f70274r = tVar;
        a.f70275s = uVar;
        C25873f fVar = new C25873f(a.f70264h, a.f70259c, a.f70267k, k, location, new C25853ac(a), a.f70273q);
        a.f70258b.setAdapter(fVar);
        a.f70263g.addTextChangedListener(new C25863am(a, fVar));
    }

    /* renamed from: g */
    public final void mo31058g(String str) {
        this.f70350n.setText(str);
        this.f70350n.setContentDescription(str);
    }

    /* renamed from: h */
    public final void mo31059h(String str) {
        this.f70350n.setText((TextUtils.isEmpty(str) || str.length() <= 20) ? str : String.valueOf(str.substring(0, 21)).concat("…"));
        this.f70350n.setContentDescription(this.f70336G.getResources().getString(R.string.lens_dining_filter_a11y_restaurant, new Object[]{str}));
    }

    /* renamed from: i */
    public final void mo31060i() {
        this.f70342f = false;
        mo31062k(0);
    }

    /* renamed from: j */
    public final void mo31061j(int i) {
        if (this.f70350n.getVisibility() != 0) {
            return;
        }
        if (i == 0) {
            this.f70350n.mo47553j(0);
            this.f70350n.setPadding(this.f70336G.getResources().getDimensionPixelSize(R.dimen.location_picker_progress_bar_padding), this.f70350n.getPaddingTop(), this.f70350n.getPaddingRight(), this.f70350n.getPaddingBottom());
            this.f70351o.setVisibility(0);
            mo31058g(this.f70336G.getString(R.string.lens_locating_restaurant));
            C60888db dbVar = this.f70360x;
            dbVar.getClass();
            this.f70349m = dbVar.mo29165e(new C25879l(this), 10000, TimeUnit.MILLISECONDS);
            return;
        }
        C60870cx cxVar = this.f70349m;
        if (cxVar != null) {
            cxVar.cancel(false);
            this.f70349m = null;
        }
        mo31056e();
    }

    /* renamed from: k */
    public final void mo31062k(int i) {
        if (this.f70350n.getVisibility() != i) {
            this.f70350n.setVisibility(i);
        }
    }
}
