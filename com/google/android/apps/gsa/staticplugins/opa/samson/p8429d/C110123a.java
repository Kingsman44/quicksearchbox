package com.google.android.apps.gsa.staticplugins.opa.samson.p8429d;

import android.accounts.Account;
import android.content.SharedPreferences;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.google.android.apps.gsa.opaonboarding.C83887au;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8435j.C110192ac;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8435j.C110212j;
import com.google.android.apps.gsa.staticplugins.opa.samson.p8443o.C110308s;
import com.google.android.apps.gsa.staticplugins.opa.samson.photos.C110361bt;
import com.google.android.libraries.p1646ay.C19602d;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.d.a */
/* compiled from: PG */
public final class C110123a extends C19602d {

    /* renamed from: a */
    private static final String[] f306869a = {"onboarding_status", "photo_status"};

    /* renamed from: b */
    private final C68214a f306870b;

    /* renamed from: c */
    private final C68214a f306871c;

    /* renamed from: d */
    private final C68214a f306872d;

    /* renamed from: e */
    private final C68214a f306873e;

    /* renamed from: f */
    private final C110212j f306874f;

    /* renamed from: g */
    private final C110192ac f306875g;

    public C110123a(C68214a aVar, C68214a aVar2, C68214a aVar3, C68214a aVar4, C110212j jVar, C110192ac acVar) {
        this.f306870b = aVar;
        this.f306871c = aVar2;
        this.f306872d = aVar3;
        this.f306873e = aVar4;
        this.f306874f = jVar;
        this.f306875g = acVar;
    }

    /* renamed from: a */
    public final String mo24914a(Uri uri) {
        return "text/plain";
    }

    /* renamed from: b */
    public final Cursor mo24915b(Uri uri, String[] strArr) {
        boolean z;
        C58833ax axVar;
        C74507e.m120471g(21);
        C58976aa aaVar = C58975e.f156826a;
        if (strArr.length == 0) {
            return null;
        }
        int i = 0;
        String str = strArr[0];
        MatrixCursor matrixCursor = new MatrixCursor(f306869a);
        Account a = ((C86054o) this.f306871c.mo27525b()).mo79668a();
        boolean h = a != null ? ((C110308s) this.f306870b.mo27525b()).mo98560h(a, str) : false;
        Account a2 = ((C86054o) this.f306871c.mo27525b()).mo79668a();
        boolean z2 = a2 != null && ((C83887au) this.f306872d.mo27525b()).mo77275e(a2);
        boolean z3 = !this.f306874f.mo98473a(false);
        boolean z4 = !this.f306875g.mo98466a();
        if (a != null) {
            C110361bt btVar = (C110361bt) this.f306873e.mo27525b();
            String str2 = a.name;
            if (!((SharedPreferences) btVar.f307591a.mo27525b()).contains(C110361bt.m183756c(str2))) {
                axVar = C58836b.f156633a;
            } else {
                axVar = C58833ax.m90834k(Boolean.valueOf(((SharedPreferences) btVar.f307591a.mo27525b()).getBoolean(C110361bt.m183756c(str2), false)));
            }
            boolean booleanValue = ((Boolean) axVar.mo56109e(false)).booleanValue();
            if (!((C110361bt) this.f306873e.mo27525b()).mo98592i(a.name, str) && !((C110361bt) this.f306873e.mo27525b()).mo98594k(a.name, str) && booleanValue) {
                z = false;
                Integer valueOf = Integer.valueOf((h || !z2 || !z3 || !z4 || !z) ? 0 : 1);
                Account a3 = ((C86054o) this.f306871c.mo27525b()).mo79668a();
                if (a3 != null && ((C110361bt) this.f306873e.mo27525b()).mo98594k(a3.name, str) && ((C110361bt) this.f306873e.mo27525b()).mo98591h(a3.name, str)) {
                    i = 1;
                }
                matrixCursor.addRow(C58485gu.m89847o(valueOf, Integer.valueOf(i)));
                return matrixCursor;
            }
        }
        z = true;
        Integer valueOf2 = Integer.valueOf((h || !z2 || !z3 || !z4 || !z) ? 0 : 1);
        Account a32 = ((C86054o) this.f306871c.mo27525b()).mo79668a();
        i = 1;
        matrixCursor.addRow(C58485gu.m89847o(valueOf2, Integer.valueOf(i)));
        return matrixCursor;
    }
}
