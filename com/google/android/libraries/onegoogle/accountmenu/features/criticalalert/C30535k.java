package com.google.android.libraries.onegoogle.accountmenu.features.criticalalert;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.C1878d;
import com.google.android.gms.p10815k.C144415o;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.C30173aa;
import com.google.android.libraries.onegoogle.account.disc.C30209i;
import com.google.android.libraries.onegoogle.account.disc.C30226z;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.account.p2347c.C30167a;
import com.google.android.libraries.onegoogle.account.particle.C30238l;
import com.google.android.libraries.onegoogle.account.particle.C30240n;
import com.google.android.libraries.onegoogle.accountmenu.features.p2363d.C30543a;
import com.google.android.libraries.onegoogle.accountmenu.p2357e.C30486a;
import com.google.android.libraries.onegoogle.common.C30899a;
import com.google.android.libraries.onegoogle.common.C30904ad;
import com.google.android.libraries.onegoogle.common.C30915b;
import com.google.android.libraries.onegoogle.common.C30916c;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.common.C30925l;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.common.base.C58833ax;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58557jl;
import com.google.common.p4522b.C58729pv;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.criticalalert.k */
/* compiled from: PG */
public abstract class C30535k extends C30238l {

    /* renamed from: h */
    public C58495hd f82477h = C58729pv.f156485a;

    /* renamed from: i */
    private final C30158c f82478i;

    public C30535k(C30158c cVar) {
        this.f82478i = cVar;
    }

    /* renamed from: u */
    private final C58485gu m57007u(Object obj) {
        C58485gu guVar = (C58485gu) C30543a.m57048a(this.f82478i, obj, this.f82477h, (Object) null);
        return guVar == null ? C58485gu.m89845m() : guVar;
    }

    /* renamed from: b */
    public final C144415o mo35723b(Object obj) {
        return (C144415o) C58833ax.m90833j(mo36192r(obj)).mo56106b(C30534j.f82476a).mo56111f();
    }

    /* renamed from: n */
    public final C30226z mo35724n(Context context) {
        C30925l b = C30925l.m57719b(context);
        C30915b bVar = (C30915b) b;
        return new C30209i(C30486a.m56847a(b, C1878d.m5128a(bVar.f83342a, true != ((C30916c) C30904ad.m57690e(context)).f83343a ? R.color.google_grey900 : R.color.google_white), C30899a.m57682a(context, R.attr.ogRedColorOnSurface)), bVar.f83342a.getString(R.string.og_critical_security_alert_badge_label_a11y), C30173aa.RED_ALERT);
    }

    /* renamed from: o */
    public final void mo35725o(Context context, Object obj, ViewGroup viewGroup, C30922i iVar, View view, C30897z zVar, boolean z) {
        C30541q qVar;
        Object obj2 = obj;
        ViewGroup viewGroup2 = viewGroup;
        View view2 = view;
        C30897z zVar2 = zVar;
        C58838bb.m90884s(viewGroup.getChildCount() <= 1, "Critical alert container can contain one child at most.");
        View childAt = viewGroup2.getChildAt(0);
        C58838bb.m90884s(childAt == null || (childAt instanceof C30541q), "Critical alert container can only contain children of type CriticalAlertView.");
        C144415o b = mo35723b(obj2);
        if (b == null) {
            if (childAt != null) {
                ((C30541q) childAt).mo35632lk(zVar2);
                viewGroup.removeAllViews();
            }
            viewGroup2.setVisibility(8);
            viewGroup.removeAllViews();
            view2.setContentDescription((CharSequence) null);
            view2.setFocusable(false);
            view2.setOnClickListener((View.OnClickListener) null);
            view2.setClickable(false);
            return;
        }
        if (childAt == null) {
            qVar = new C30541q(context, z);
            viewGroup2.addView(qVar);
            qVar.mo35630b(zVar2);
        } else {
            boolean z2 = z;
            qVar = (C30541q) childAt;
        }
        C30541q qVar2 = qVar;
        C30158c cVar = this.f82478i;
        qVar2.f82489a.setText(b.f391007b);
        qVar2.f82490b.setText(b.f391008c);
        qVar2.f82491c.mo36593a(C58485gu.m89847o(b.f391009d, b.f391010e));
        String string = qVar2.getContext().getString(R.string.og_account_critical_alert_view_label_a11y, new Object[]{b.f391007b, C30167a.m56043a(obj2, cVar)});
        String str = b.f391008c;
        String str2 = b.f391009d;
        qVar2.setContentDescription(string + "\n" + str + "\n" + str2);
        String d = this.f82478i.mo35553d(obj2);
        C58485gu u = m57007u(obj2);
        int size = u.size();
        for (int i = 0; i < size; i++) {
            C144415o a = ((C30240n) u.get(i)).mo35714a();
            if (!a.f391012g) {
                mo36193s(d, a);
            }
        }
        qVar2.setOnClickListener(new C30529e(this, zVar, iVar, obj, z));
        viewGroup2.setVisibility(0);
        view2.setContentDescription(qVar2.getContentDescription());
        view2.setFocusable(true);
        view2.setOnClickListener(new C30530f(qVar2));
    }

    /* renamed from: p */
    public final boolean mo35726p(C58485gu guVar) {
        return C58557jl.m90138s(guVar, new C30531g(this));
    }

    /* renamed from: q */
    public final boolean mo35727q(Object obj) {
        return C58557jl.m90138s(m57007u(obj), C30532h.f82471a);
    }

    /* renamed from: r */
    public final C30240n mo36192r(Object obj) {
        C58485gu u = m57007u(obj);
        if (!u.isEmpty()) {
            return (C30240n) u.get(0);
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public abstract void mo36193s(String str, C144415o oVar);

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public abstract void mo36194t(C30240n nVar, Activity activity, boolean z);
}
