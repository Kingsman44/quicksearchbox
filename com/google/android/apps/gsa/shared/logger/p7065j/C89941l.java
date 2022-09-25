package com.google.android.apps.gsa.shared.logger.p7065j;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28295m;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58163o;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58164p;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.logger.j.l */
/* compiled from: PG */
public final class C89941l {

    /* renamed from: a */
    private static final C59071e f246434a = C59071e.m91332i("com.google.android.apps.gsa.shared.logger.j.l");

    /* renamed from: a */
    public static int m146510a(View view) {
        C28292j a = C28295m.m52915a(view);
        if (a == null) {
            return -1;
        }
        return ((C60214n) a.f76973a.instance).f162918c;
    }

    /* renamed from: b */
    public static void m146511b(View view) {
        if (view != null) {
            C28295m.m52919e(view, (C28292j) null);
        }
    }

    /* renamed from: c */
    public static void m146512c(View view, int i) {
        if (view != null) {
            if (i <= 0) {
                ((C59052c) ((C59052c) f246434a.mo56226d()).mo56372aa(10728)).mo56387q("Trying to set an invalid VE type id: %d", i);
                return;
            }
            C28292j jVar = new C28292j(i);
            jVar.mo33795i(5);
            C28295m.m52919e(view, jVar);
        }
    }

    /* renamed from: d */
    public static List m146513d(View view, C89934e eVar) {
        ArrayList arrayList = new ArrayList();
        C58163o oVar = (C58163o) C58164p.f155504d.createBuilder();
        oVar.copyOnWrite();
        C58164p pVar = (C58164p) oVar.instance;
        pVar.f155506a |= 1;
        pVar.f155507b = 6727;
        arrayList.add(oVar);
        m146514e(view, oVar, arrayList, eVar);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i = 0; i < arrayList.size(); i++) {
            arrayList2.add((C58164p) ((C58163o) arrayList.get(i)).build());
        }
        return arrayList2;
    }

    /* renamed from: e */
    private static void m146514e(View view, C58163o oVar, List list, C89934e eVar) {
        if (view != null && view.getVisibility() == 0) {
            if (m146510a(view) > 0) {
                int a = m146510a(view);
                C58163o oVar2 = (C58163o) C58164p.f155504d.createBuilder();
                oVar2.copyOnWrite();
                C58164p pVar = (C58164p) oVar2.instance;
                pVar.f155506a |= 1;
                pVar.f155507b = a;
                oVar.mo54678a(list.size());
                view.setTag(R.id.ve_index, Integer.valueOf(list.size()));
                list.add(oVar2);
                oVar = oVar2;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                for (int i = 0; i < viewGroup.getChildCount(); i++) {
                    m146514e(viewGroup.getChildAt(i), oVar, list, eVar);
                }
            }
        }
    }
}
