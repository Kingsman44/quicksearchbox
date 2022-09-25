package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.content.Context;
import android.view.View;
import android.widget.LinearLayout;
import androidx.lifecycle.LiveData;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.connectivity.LensConnectivityManager;
import com.google.android.libraries.lens.view.filters.translation.C26059ax;
import com.google.android.libraries.lens.view.filters.translation.C26217r;
import com.google.android.libraries.lens.view.filters.translation.p2106a.C26030f;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.android.libraries.lens.view.utils.C28098a;
import com.google.android.libraries.lens.view.utils.C28134w;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.apps.tiktok.dataservice.p3638c.C46755l;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.tracing.C47521ag;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.base.C58831av;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58890d;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import java.util.ArrayList;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Objects;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.x */
/* compiled from: PG */
final class C26197x {

    /* renamed from: a */
    public final Context f71177a;

    /* renamed from: b */
    public final C26196w f71178b;

    /* renamed from: c */
    public final C26059ax f71179c;

    /* renamed from: d */
    public final C37215b f71180d;

    /* renamed from: e */
    public final C47770dh f71181e;

    /* renamed from: f */
    public final C47521ag f71182f;

    /* renamed from: g */
    public C46755l f71183g;

    /* renamed from: h */
    public C46756m f71184h;

    /* renamed from: i */
    public C46756m f71185i;

    /* renamed from: j */
    public C46756m f71186j;

    /* renamed from: k */
    public C58485gu f71187k;

    /* renamed from: l */
    public Locale f71188l;

    /* renamed from: m */
    public C58833ax f71189m = C58836b.f156633a;

    /* renamed from: n */
    public final C26164bf f71190n;

    /* renamed from: o */
    private final LiveData f71191o;

    /* renamed from: p */
    private final LiveData f71192p;

    /* renamed from: q */
    private final LiveData f71193q;

    /* renamed from: r */
    private final C58485gu f71194r;

    /* renamed from: s */
    private final boolean f71195s;

    /* renamed from: t */
    private final C26146ao f71196t;

    public C26197x(Locale locale, boolean z, C26196w wVar, C26164bf bfVar, C26059ax axVar, Context context, C26146ao aoVar, LensConnectivityManager lensConnectivityManager, C37215b bVar, C47770dh dhVar, C47521ag agVar, C26030f fVar) {
        this.f71188l = locale;
        this.f71195s = z;
        this.f71178b = wVar;
        this.f71190n = bfVar;
        this.f71177a = context;
        this.f71196t = aoVar;
        this.f71179c = axVar;
        this.f71181e = dhVar;
        this.f71182f = agVar;
        this.f71180d = bVar;
        this.f71194r = fVar.mo31238a();
        axVar.mo31256k();
        this.f71187k = (C58485gu) C58831av.m90830c((C58485gu) axVar.f70828r.mo3842a(), C58485gu.m89845m());
        this.f71192p = axVar.f70830t;
        this.f71193q = axVar.f70831u;
        this.f71191o = lensConnectivityManager.mo30903g();
    }

    /* renamed from: a */
    public static int m48358a(CharSequence charSequence, C58833ax axVar) {
        if (axVar.mo56113h()) {
            return C58890d.m90987b(charSequence).indexOf((String) axVar.mo56107c());
        }
        return -1;
    }

    /* renamed from: e */
    private final C58495hd m48359e() {
        return (C58495hd) C58831av.m90830c((C58495hd) this.f71193q.mo3842a(), C58729pv.f156485a);
    }

    /* renamed from: f */
    private final C58495hd m48360f() {
        C58495hd hdVar = (C58495hd) this.f71192p.mo3842a();
        return hdVar == null ? C58729pv.f156485a : hdVar;
    }

    /* renamed from: g */
    private final boolean m48361g() {
        Boolean bool = (Boolean) this.f71191o.mo3842a();
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* renamed from: b */
    public final void mo31419b(C58833ax axVar) {
        this.f71189m = axVar.mo56106b(C26187n.f71165a);
        mo31421d();
    }

    /* renamed from: c */
    public final void mo31420c(View view, int i) {
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = (int) C28134w.m52424a((float) i, this.f71177a);
        view.setLayoutParams(layoutParams);
    }

    /* renamed from: d */
    public final void mo31421d() {
        boolean z;
        C58485gu guVar;
        C58485gu guVar2;
        if (this.f71183g != null) {
            if (this.f71189m.mo56113h()) {
                C46755l lVar = this.f71183g;
                C26146ao aoVar = this.f71196t;
                C58485gu guVar3 = this.f71194r;
                if (guVar3 != null) {
                    String str = (String) this.f71189m.mo56107c();
                    if (str != null) {
                        Locale locale = this.f71188l;
                        if (locale != null) {
                            C26180g gVar = new C26180g(guVar3, str, locale, m48360f(), m48359e(), m48361g());
                            if (gVar.f71133b.isEmpty()) {
                                guVar2 = C58485gu.m89845m();
                            } else {
                                C58485gu guVar4 = (C58485gu) Collection.EL.stream(gVar.f71132a).map(new C26139ah(aoVar, gVar)).filter(new C26140ai(gVar)).sorted(new C26145an(aoVar, gVar.f71133b)).collect(C58370cn.f155946a);
                                guVar2 = guVar4.isEmpty() ? C58485gu.m89846n(new C26179f(gVar.f71133b)) : guVar4;
                            }
                            lVar.mo50772a(guVar2);
                            return;
                        }
                        throw new NullPointerException("Null selectedLocale");
                    }
                    throw new NullPointerException("Null searchQuery");
                }
                throw new NullPointerException("Null locales");
            }
            C46755l lVar2 = this.f71183g;
            C26146ao aoVar2 = this.f71196t;
            boolean z2 = this.f71195s;
            C58485gu guVar5 = this.f71187k;
            if (guVar5 != null) {
                C58485gu guVar6 = this.f71194r;
                if (guVar6 != null) {
                    C26059ax axVar = this.f71179c;
                    axVar.mo31256k();
                    C58833ax axVar2 = axVar.f70792F;
                    if (axVar2 != null) {
                        Locale locale2 = this.f71188l;
                        if (locale2 != null) {
                            C58495hd f = m48360f();
                            C58495hd e = m48359e();
                            boolean g = m48361g();
                            C26059ax axVar3 = this.f71179c;
                            axVar3.mo31256k();
                            int i = 0;
                            C26131a aVar = new C26131a(z2, guVar5, guVar6, axVar2, locale2, f, e, g, axVar3.f70793G && m48361g() && !C28098a.m52377a(this.f71177a));
                            C58480gp e2 = C58485gu.m89837e();
                            if (aVar.f71032a) {
                                C26135ad b = aoVar2.mo31381b(C26217r.f71251a);
                                C58833ax axVar4 = aVar.f71035d;
                                C26217r rVar = aoVar2.f71051a;
                                Objects.requireNonNull(rVar);
                                C58833ax b2 = axVar4.mo56106b(new C26141aj(rVar));
                                if (b2 != null) {
                                    C26177d dVar = (C26177d) b;
                                    dVar.f71112e = b2;
                                    b.mo31359e(aVar.f71036e.equals(C26217r.f71251a));
                                    C25327c cVar = C25327c.UNKNOWN;
                                    if (cVar != null) {
                                        dVar.f71108a = cVar;
                                        e2.mo55395g(b.mo31355a());
                                    } else {
                                        throw new NullPointerException("Null downloadState");
                                    }
                                } else {
                                    throw new NullPointerException("Null secondaryText");
                                }
                            }
                            C58495hd hdVar = (C58495hd) Collection.EL.stream(aVar.f71034c).collect(C58370cn.m89403c(C26142ak.f71045a, new C26143al(aoVar2, aVar), C26144am.f71048a));
                            if (!aVar.f71033b.isEmpty()) {
                                e2.mo55395g(new C26176c(R.string.lens_translate_language_picker_recents, true));
                                C58485gu guVar7 = aVar.f71033b;
                                int size = guVar7.size();
                                for (int i2 = 0; i2 < size; i2++) {
                                    C26136ae aeVar = (C26136ae) hdVar.get((Locale) guVar7.get(i2));
                                    aeVar.getClass();
                                    C26135ad a = aeVar.mo31361a();
                                    a.mo31358d(true);
                                    e2.mo55395g(a.mo31355a());
                                }
                                z = false;
                            } else {
                                z = true;
                            }
                            e2.mo55395g(new C26176c(R.string.lens_translate_language_picker_all_languages, z));
                            e2.mo55396h(C58485gu.m89836F(new C26145an(aoVar2), hdVar.values()));
                            if (aVar.f71040i) {
                                ArrayList arrayList = new ArrayList(e2.mo55394f());
                                while (true) {
                                    if (i >= arrayList.size()) {
                                        break;
                                    }
                                    C26133ab abVar = (C26133ab) arrayList.get(i);
                                    if (abVar instanceof C26136ae) {
                                        C26136ae aeVar2 = (C26136ae) abVar;
                                        if (aeVar2.mo31362b() == C25327c.DOWNLOADABLE) {
                                            C26135ad a2 = aeVar2.mo31361a();
                                            a2.mo31360f(true);
                                            arrayList.set(i, a2.mo31355a());
                                            break;
                                        }
                                    }
                                    i++;
                                }
                                guVar = C58485gu.m89842j(arrayList);
                            } else {
                                guVar = e2.mo55394f();
                            }
                            lVar2.mo50772a(guVar);
                            return;
                        }
                        throw new NullPointerException("Null selectedLocale");
                    }
                    throw new NullPointerException("Null detectedLocale");
                }
                throw new NullPointerException("Null locales");
            }
            throw new NullPointerException("Null recentLocales");
        }
    }
}
