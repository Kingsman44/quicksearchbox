package com.google.android.libraries.onegoogle.accountmenu.features.criticalalert;

import android.util.Log;
import com.google.android.gms.p10815k.C144402b;
import com.google.android.gms.p10815k.C144413m;
import com.google.android.gms.p10815k.C144415o;
import com.google.android.gms.p10815k.C144417q;
import com.google.android.libraries.onegoogle.account.particle.C30236j;
import com.google.android.libraries.onegoogle.account.particle.C30240n;
import com.google.android.libraries.onegoogle.common.C30931r;
import com.google.common.base.C58836b;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4574q.C60740s;
import com.google.common.p4574q.C60743v;
import java.util.Map;

/* renamed from: com.google.android.libraries.onegoogle.accountmenu.features.criticalalert.l */
/* compiled from: PG */
public final /* synthetic */ class C30536l implements C144417q {

    /* renamed from: a */
    public final /* synthetic */ C30537m f82479a;

    public /* synthetic */ C30536l(C30537m mVar) {
        this.f82479a = mVar;
    }

    /* renamed from: a */
    public final void mo36195a(Map map) {
        C58485gu guVar;
        C30537m mVar = this.f82479a;
        int i = 4;
        C58490gz gzVar = new C58490gz(4);
        for (Map.Entry entry : map.entrySet()) {
            C144402b bVar = (C144402b) entry.getValue();
            if (bVar == null || bVar.f390984b.isEmpty()) {
                guVar = C58485gu.m89845m();
            } else {
                C58480gp gpVar = new C58480gp(i);
                for (C144415o oVar : bVar.f390984b) {
                    String str = bVar.f390983a;
                    C144413m mVar2 = oVar.f391013h;
                    if (mVar2 == null) {
                        mVar2 = C144413m.f391000c;
                    }
                    int i2 = mVar2.f391002a;
                    char c = i2 != 0 ? i2 != 1 ? (char) 0 : 3 : 2;
                    C30236j jVar = null;
                    if (c != 0 && c == 3) {
                        C60743v c2 = C60740s.m92701a(mVar2.f391003b).mo57131c();
                        String f = C30240n.m56203f(c2, "rfn");
                        String f2 = C30240n.m56203f(c2, "rfnc");
                        String f3 = C30240n.m56203f(c2, "eid");
                        if (f == null || f2 == null || f3 == null) {
                            Log.e("OneGoogle", "Critical alert URL data is not valid.");
                        } else {
                            jVar = new C30236j(str, oVar, f, f2, f3);
                        }
                    } else {
                        Log.e("OneGoogle", "Target type of Critical alert data is not of type Octarine.");
                    }
                    if (jVar != null) {
                        gpVar.mo55395g(jVar);
                    }
                }
                guVar = gpVar.mo55394f();
            }
            if (!guVar.isEmpty()) {
                gzVar.mo55429h((String) entry.getKey(), guVar);
            }
            i = 4;
        }
        mVar.f82477h = gzVar.mo55427f(true);
        C30931r.m57728a(mVar, C58836b.f156633a);
    }
}
