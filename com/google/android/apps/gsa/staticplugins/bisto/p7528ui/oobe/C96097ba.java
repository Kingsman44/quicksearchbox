package com.google.android.apps.gsa.staticplugins.bisto.p7528ui.oobe;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.C90730an;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96498r;
import com.google.android.apps.gsa.staticplugins.bisto.util.C96506z;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142320az;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142328bg;
import com.google.android.p10712d.C142338bq;
import com.google.android.p10712d.C142340bs;
import com.google.android.p10712d.C142346by;
import com.google.android.p10712d.C142351cc;
import com.google.android.p10712d.C142355cg;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58837ba;
import com.google.common.p4522b.C58557jl;
import com.google.protobuf.C62971cq;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.ui.oobe.ba */
/* compiled from: PG */
public final class C96097ba {

    /* renamed from: a */
    protected final Context f269046a;

    /* renamed from: b */
    public final C142324bc f269047b;

    public C96097ba(Context context, C142324bc bcVar) {
        this.f269046a = context;
        this.f269047b = bcVar;
    }

    /* renamed from: b */
    public static C58833ax m159386b(String str) {
        if (C58837ba.m90859h(str)) {
            return C58836b.f156633a;
        }
        return C58833ax.m90834k(str);
    }

    /* renamed from: d */
    public static C58833ax m159387d(Iterable iterable) {
        return C58833ax.m90833j((String) C58557jl.m90130k(iterable, (Object) null));
    }

    /* renamed from: a */
    public final C96095az mo89952a(String str) {
        C142340bs bsVar = this.f269047b.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        for (C142338bq bqVar : bsVar.f386192o) {
            if (str.equals(bqVar.f386173f)) {
                return new C96095az(bqVar);
            }
        }
        return null;
    }

    /* renamed from: c */
    public final C58833ax mo89953c() {
        C142346by byVar = this.f269047b.f386120f;
        if (byVar == null) {
            byVar = C142346by.f386219m;
        }
        C142320az azVar = byVar.f386226f;
        if (azVar == null) {
            azVar = C142320az.f386099j;
        }
        return C58833ax.m90834k(azVar);
    }

    /* renamed from: e */
    public final C58833ax mo89954e() {
        C142355cg cgVar;
        C142340bs bsVar = this.f269047b.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        if (bsVar.f386179b == 2) {
            cgVar = (C142355cg) bsVar.f386180c;
        } else {
            cgVar = C142355cg.f386263b;
        }
        return m159386b(C124525f.m203990f(cgVar.f386265a));
    }

    /* renamed from: f */
    public final C58833ax mo89955f() {
        C142340bs bsVar = this.f269047b.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        C142328bg bgVar = bsVar.f386181d;
        if (bgVar == null) {
            bgVar = C142328bg.f386139f;
        }
        if (!C96498r.m159875b(this.f269046a)) {
            return m159387d(bgVar.f386142b);
        }
        return C90730an.m148189b(m159387d(bgVar.f386144d), m159387d(bgVar.f386142b));
    }

    /* renamed from: g */
    public final C58833ax mo89956g() {
        C142340bs bsVar = this.f269047b.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        C142328bg bgVar = bsVar.f386181d;
        if (bgVar == null) {
            bgVar = C142328bg.f386139f;
        }
        C142355cg cgVar = bgVar.f386143c;
        if (cgVar == null) {
            cgVar = C142355cg.f386263b;
        }
        return m159386b(C124525f.m203990f(cgVar.f386265a));
    }

    /* renamed from: h */
    public final String mo89957h() {
        C142340bs bsVar = this.f269047b.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        C142338bq bqVar = bsVar.f386194q;
        if (bqVar == null) {
            bqVar = C142338bq.f386166g;
        }
        C142328bg bgVar = bqVar.f386170c;
        if (bgVar == null) {
            bgVar = C142328bg.f386139f;
        }
        return (String) C96506z.m159889a(bgVar, C96498r.m159875b(this.f269046a)).mo56109e("https://www.gstatic.com/bisto/oobe/hear_notifs/index.html");
    }

    /* renamed from: i */
    public final String mo89958i() {
        C142340bs bsVar = this.f269047b.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        C142351cc ccVar = bsVar.f386198u;
        if (ccVar == null) {
            ccVar = C142351cc.f386238i;
        }
        C142355cg cgVar = ccVar.f386241b;
        if (cgVar == null) {
            cgVar = C142355cg.f386263b;
        }
        String e = C124525f.m203989e(cgVar);
        return C58837ba.m90859h(e) ? this.f269046a.getResources().getString(R.string.assistant_tos_warm_subtitle) : e;
    }

    /* renamed from: j */
    public final List mo89959j() {
        C142340bs bsVar = this.f269047b.f386119e;
        if (bsVar == null) {
            bsVar = C142340bs.f386174C;
        }
        C62971cq<C142338bq> cqVar = bsVar.f386190m;
        ArrayList arrayList = new ArrayList();
        for (C142338bq azVar : cqVar) {
            C96095az azVar2 = new C96095az(azVar);
            if (azVar2.mo89950a()) {
                arrayList.add(azVar2);
            }
        }
        return arrayList;
    }
}
