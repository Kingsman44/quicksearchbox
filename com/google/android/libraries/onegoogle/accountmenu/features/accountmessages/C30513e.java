package com.google.android.libraries.onegoogle.accountmenu.features.accountmessages;

import android.content.Context;
import com.google.android.gms.p10815k.C144408h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.disc.C30173aa;
import com.google.android.libraries.onegoogle.account.disc.C30175ac;
import com.google.android.libraries.onegoogle.account.disc.C30176ad;
import com.google.android.libraries.onegoogle.account.disc.C30209i;
import com.google.android.libraries.onegoogle.account.disc.C30210j;
import com.google.android.libraries.onegoogle.account.p2345a.C30158c;
import com.google.android.libraries.onegoogle.accountmenu.features.p2363d.C30543a;
import com.google.android.libraries.onegoogle.accountmenu.p2357e.C30486a;
import com.google.android.libraries.onegoogle.common.C30902ab;
import com.google.android.libraries.onegoogle.common.C30904ad;
import com.google.android.libraries.onegoogle.common.C30915b;
import com.google.android.libraries.onegoogle.common.C30916c;
import com.google.android.libraries.onegoogle.common.C30925l;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4522b.C58729pv;
import com.google.p4017at.p4049f.p4050a.p4053b.p4054a.p4055a.C53943h;
import com.google.p4017at.p4049f.p4050a.p4053b.p4054a.p4055a.C53945j;
import com.google.p4017at.p4049f.p4050a.p4053b.p4054a.p4055a.C53947l;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.accountmessages.e */
/* compiled from: PG */
final class C30513e extends C30176ad {

    /* renamed from: b */
    private final C30158c f82416b;

    /* renamed from: c */
    private final C30175ac f82417c;

    /* renamed from: d */
    private C58495hd f82418d = C58729pv.f156485a;

    /* renamed from: e */
    private Object f82419e;

    public C30513e(Context context, C30158c cVar) {
        this.f82416b = cVar;
        C30210j jVar = new C30210j();
        C30925l b = C30925l.m57719b(context);
        C30904ad e = C30904ad.m57690e(context);
        C30915b bVar = (C30915b) b;
        int color = bVar.f83342a.getResources().getColor(R.color.google_grey900);
        Integer num = (Integer) ((C30916c) e).f83344b.get(C30902ab.DARK_YELLOW);
        if (num != null) {
            jVar.f81671a = C58833ax.m90834k(new C30209i(C30486a.m56847a(b, color, num.intValue()), bVar.f83342a.getString(R.string.og_important_account_alert_badge_a11y_label), C30173aa.YELLOW_ALERT));
            this.f82417c = jVar.mo35622a();
            return;
        }
        throw new IllegalArgumentException("Unsupported GoogleColors value");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo35628b(Object obj) {
        this.f82419e = obj;
        Object obj2 = C58836b.f156633a;
        C144408h hVar = (C144408h) C30543a.m57048a(this.f82416b, obj, this.f82418d, C144408h.f390991c);
        if (hVar != null) {
            C53943h hVar2 = hVar.f390994b;
            if (hVar2 == null) {
                hVar2 = C53943h.f141535c;
            }
            C53947l lVar = hVar2.f141537a;
            if (lVar == null) {
                lVar = C53947l.f141541b;
            }
            int a = C53945j.m87065a(lVar.f141543a);
            if (a != 0 && a == 3) {
                obj2 = C58833ax.m90834k(this.f82417c);
            }
        }
        this.f81607a.mo5706i(obj2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo36158c(C58495hd hdVar) {
        this.f82418d = hdVar;
        Object obj = this.f82419e;
        if (obj != null) {
            mo35628b(obj);
        }
    }
}
