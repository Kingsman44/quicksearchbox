package com.google.android.libraries.lens.view.gleam;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.SpannableString;
import android.text.style.LocaleSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.core.p098j.p099a.C1981aa;
import androidx.core.p098j.p099a.C1988h;
import androidx.core.p098j.p099a.C1991k;
import androidx.customview.p103b.C2144b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.lens.view.gleam.C26559ej;
import com.google.android.libraries.lens.view.p2069am.C25307ao;
import com.google.android.libraries.lens.view.p2069am.C25308ap;
import com.google.android.libraries.lens.view.p2069am.C25349y;
import com.google.apps.tiktok.p3674l.p3679c.C47393f;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4522b.C58724pq;
import com.google.lens.p4699e.C62195ah;
import com.google.lens.p4699e.C62202ao;
import com.google.lens.p4699e.C62203ap;
import com.google.lens.p4699e.C62214b;
import com.google.lens.p4699e.C62219be;
import com.google.lens.p4699e.C62227h;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import p3186j$.util.Collection;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.lens.view.gleam.cl */
/* compiled from: PG */
public final class C26507cl extends C2144b {

    /* renamed from: c */
    public static final /* synthetic */ int f72234c = 0;

    /* renamed from: a */
    public final C26559ej f72235a;

    /* renamed from: b */
    protected final SparseArray f72236b = new SparseArray();

    /* renamed from: d */
    private final GleamingView f72237d;

    /* renamed from: e */
    private final Context f72238e;

    /* renamed from: f */
    private final Rect f72239f = new Rect();

    public C26507cl(View view, GleamingView gleamingView) {
        super(view);
        this.f72238e = gleamingView.getContext();
        this.f72235a = gleamingView.mo17754z();
        this.f72237d = gleamingView;
    }

    /* renamed from: b */
    public static final boolean m48963b(C25349y yVar) {
        return C58528ij.m90012L(C25349y.GLEAM, C25349y.BARCODE_GLEAM, C25349y.OUTDOOR_GLEAM).contains(yVar);
    }

    /* renamed from: c */
    private final CharSequence m48964c(int i) {
        C62203ap apVar;
        C58833ax axVar;
        C62227h hVar;
        C62219be beVar;
        C26447af afVar = (C26447af) this.f72236b.get(i);
        if (afVar == null) {
            return this.f72238e.getResources().getString(R.string.lens_gleam_accessibility_fallback);
        }
        C25308ap apVar2 = afVar.f71963a;
        C25349y a = C25349y.m46667a(afVar.f71963a.f68848i);
        if (a == null) {
            a = C25349y.UNRECOGNIZED;
        }
        if (a == C25349y.TEXT_GLEAM && apVar2.f68841b == 16 && (beVar = ((C25307ao) apVar2.f68842c).f68835a) != null) {
            SpannableString spannableString = new SpannableString(beVar.f167992e);
            spannableString.setSpan(new LocaleSpan(Locale.forLanguageTag(beVar.f167990c)), 0, spannableString.length(), 33);
            return spannableString;
        }
        int i2 = afVar.f71963a.f68848i;
        C25349y a2 = C25349y.m46667a(i2);
        if (a2 == null) {
            a2 = C25349y.UNRECOGNIZED;
        }
        if (a2 == C25349y.BARCODE_GLEAM) {
            Resources resources = this.f72238e.getResources();
            if (apVar2.f68843d == 19) {
                hVar = (C62227h) apVar2.f68844e;
            } else {
                hVar = C62227h.f168014f;
            }
            int a3 = C62214b.m94758a(hVar.f168020e);
            if (a3 != 0 && a3 == 2) {
                if (!hVar.f168018c.isEmpty()) {
                    return resources.getString(R.string.lens_gleam_accessibility_qr_code_labelled, new Object[]{hVar.f168018c});
                } else if (apVar2.f68849j.isEmpty()) {
                    return resources.getString(R.string.lens_gleam_accessibility_qr_code_unlabelled);
                } else {
                    return resources.getString(R.string.lens_gleam_accessibility_qr_code_labelled, new Object[]{apVar2.f68849j});
                }
            } else if (apVar2.f68849j.isEmpty()) {
                return resources.getString(R.string.lens_gleam_accessibility_bar_code_unlabelled);
            } else {
                return resources.getString(R.string.lens_gleam_accessibility_bar_code_labelled, new Object[]{apVar2.f68849j});
            }
        } else {
            C25349y a4 = C25349y.m46667a(i2);
            if (a4 == null) {
                a4 = C25349y.UNRECOGNIZED;
            }
            if (a4 == C25349y.OUTDOOR_GLEAM) {
                Resources resources2 = this.f72238e.getResources();
                ArrayList arrayList = new ArrayList();
                arrayList.add(apVar2.f68849j);
                Optional findFirst = Collection.EL.stream(apVar2.f68862w).filter(C26506ck.f72233a).findFirst();
                if (findFirst.isPresent()) {
                    C62195ah ahVar = (C62195ah) findFirst.get();
                    if (ahVar.f167933a == 3) {
                        apVar = (C62203ap) ahVar.f167934b;
                    } else {
                        apVar = C62203ap.f167949d;
                    }
                    C62202ao aoVar = apVar.f167953c;
                    if (aoVar == null) {
                        aoVar = C62202ao.f167942f;
                    }
                    if ((aoVar.f167944a & 1) != 0) {
                        arrayList.add(resources2.getString(R.string.lens_gleam_accessibility_place_rating, new Object[]{Float.valueOf(aoVar.f167945b)}));
                    }
                    if ((aoVar.f167944a & 2) != 0) {
                        int i3 = aoVar.f167946c;
                        if (i3 <= 0 || i3 > 4) {
                            axVar = C58836b.f156633a;
                        } else {
                            axVar = C58833ax.m90834k(this.f72238e.getResources().getStringArray(R.array.lens_gleam_accessibility_place_price_values)[i3 - 1]);
                        }
                        if (axVar.mo56113h()) {
                            arrayList.add(resources2.getString(R.string.lens_gleam_accessibility_place_price, new Object[]{axVar.mo56107c()}));
                        }
                    }
                    if ((aoVar.f167944a & 4) != 0) {
                        if (arrayList.size() == 1) {
                            arrayList.add(aoVar.f167947d);
                        } else {
                            arrayList.add(resources2.getString(R.string.lens_gleam_accessibility_place_location_type, new Object[]{aoVar.f167947d}));
                        }
                    }
                }
                String str = (String) arrayList.get(0);
                for (int i4 = 1; i4 < arrayList.size(); i4++) {
                    str = this.f72238e.getResources().getString(R.string.lens_gleam_accessibility_separator, new Object[]{str, arrayList.get(i4)});
                }
                return str;
            } else if (!apVar2.f68849j.isEmpty()) {
                return apVar2.f68849j;
            } else {
                return this.f72238e.getResources().getString(R.string.lens_gleam_accessibility_fallback);
            }
        }
    }

    /* renamed from: a */
    public final boolean mo31778a(C25349y yVar) {
        return m48963b(yVar) || C25349y.TEXT_GLEAM == yVar;
    }

    /* access modifiers changed from: protected */
    public final int getVirtualViewAt(float f, float f2) {
        C58833ax e = this.f72235a.mo31826e(f, f2);
        if (!e.mo56113h()) {
            return LinearLayoutManager.INVALID_OFFSET;
        }
        C26441a aVar = (C26441a) e.mo56107c();
        C25349y a = C25349y.m46667a(aVar.f71963a.f68848i);
        if (a == null) {
            a = C25349y.UNRECOGNIZED;
        }
        return mo31778a(a) ? aVar.f71963a.f68845f : LinearLayoutManager.INVALID_OFFSET;
    }

    /* access modifiers changed from: protected */
    public final void getVisibleVirtualViews(List list) {
        C58485gu guVar = this.f72235a.f72398d.f72053b;
        int i = ((C58724pq) guVar).f156474d;
        for (int i2 = 0; i2 < i; i2++) {
            C26447af afVar = (C26447af) guVar.get(i2);
            C25349y a = C25349y.m46667a(afVar.f71963a.f68848i);
            if (a == null) {
                a = C25349y.UNRECOGNIZED;
            }
            if (mo31778a(a)) {
                list.add(Integer.valueOf(afVar.f71963a.f68845f));
            }
        }
    }

    /* access modifiers changed from: protected */
    public final boolean onPerformActionForVirtualView$ar$ds(int i, int i2) {
        if (i2 != 16) {
            return false;
        }
        if (this.f72236b.get(i) == null) {
            return true;
        }
        C26447af afVar = (C26447af) this.f72236b.get(i);
        C25349y a = C25349y.m46667a(afVar.f71963a.f68848i);
        if (a == null) {
            a = C25349y.UNRECOGNIZED;
        }
        if (!m48963b(a)) {
            return true;
        }
        C47393f.m84237h(new C26559ej.C26563d(afVar), this.f72237d);
        return true;
    }

    /* access modifiers changed from: protected */
    public final void onPopulateEventForVirtualView(int i, AccessibilityEvent accessibilityEvent) {
        accessibilityEvent.setContentDescription(m48964c(i));
    }

    /* access modifiers changed from: protected */
    public final void onPopulateNodeForHost(C1991k kVar) {
        kVar.f5921a.setVisibleToUser(false);
    }

    /* access modifiers changed from: protected */
    public final void onPopulateNodeForVirtualView(int i, C1991k kVar) {
        C58833ax axVar;
        kVar.f5921a.setContentDescription(m48964c(i));
        String string = this.f72238e.getResources().getString(R.string.lens_gleam_accessibility_search_gleam);
        if (this.f72236b.get(i) != null) {
            C25349y a = C25349y.m46667a(((C26447af) this.f72236b.get(i)).f71963a.f68848i);
            if (a == null) {
                a = C25349y.UNRECOGNIZED;
            }
            if (m48963b(a)) {
                kVar.mo5153b(new C1988h((Object) null, 16, string, (C1981aa) null, (Class) null));
            }
        }
        kVar.f5921a.setFocusable(true);
        float a2 = this.f72235a.mo31819a();
        if (this.f72236b.get(i) != null) {
            Rect d = ((C26447af) this.f72236b.get(i)).mo31654d((float) this.f72238e.getResources().getDimensionPixelSize(R.dimen.lens_gleam_a11y_padding));
            axVar = C58833ax.m90834k(new Rect((int) (((float) d.left) * a2), (int) (((float) d.top) * a2), (int) (((float) d.right) * a2), (int) (((float) d.bottom) * a2)));
        } else {
            axVar = C58836b.f156633a;
        }
        if (axVar.mo56113h()) {
            this.f72239f.set((Rect) axVar.mo56107c());
        }
        setBoundsInScreenFromBoundsInParent(kVar, this.f72239f);
    }
}
