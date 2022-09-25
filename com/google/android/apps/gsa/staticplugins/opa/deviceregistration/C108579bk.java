package com.google.android.apps.gsa.staticplugins.opa.deviceregistration;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3861at.C50094ki;
import com.google.assistant.p3861at.C50100ko;
import com.google.assistant.p3861at.C50102kq;
import com.google.assistant.p3861at.C50119lg;
import com.google.assistant.p3861at.C50121li;
import com.google.assistant.p3861at.C50123lk;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.deviceregistration.bk */
/* compiled from: PG */
public final class C108579bk {

    /* renamed from: a */
    private static final C58495hd f302049a;

    /* renamed from: b */
    private static final C58495hd f302050b;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h("GET_ANSWER", Integer.valueOf(R.string.setup_complete_get_answer_category_name));
        gzVar.mo55429h("HOME_CONTROL", Integer.valueOf(R.string.setup_complete_home_control_category_name));
        gzVar.mo55429h("MANAGE_TASK", Integer.valueOf(R.string.setup_complete_manage_task_category_name));
        f302049a = gzVar.mo55427f(false);
        C58490gz gzVar2 = new C58490gz(4);
        gzVar2.mo55429h("GET_ANSWER", Integer.valueOf(R.drawable.quantum_ic_search_googblue_24));
        gzVar2.mo55429h("HOME_CONTROL", Integer.valueOf(R.drawable.quantum_ic_home_googblue_24));
        gzVar2.mo55429h("MANAGE_TASK", Integer.valueOf(R.drawable.quantum_ic_playlist_add_check_googblue_24));
        f302050b = gzVar2.mo55427f(false);
    }

    /* renamed from: a */
    public static C50121li m180528a(C108741i iVar, C50123lk lkVar) {
        if (lkVar == null) {
            return null;
        }
        for (C50121li liVar : lkVar.f130308a) {
            if (TextUtils.equals(iVar.mo97110n(), liVar.f130303b) && (liVar.f130302a & 2) != 0) {
                String g = iVar.mo97104g();
                C50094ki kiVar = liVar.f130304c;
                if (kiVar == null) {
                    kiVar = C50094ki.f130230i;
                }
                if (TextUtils.equals(g, kiVar.f130233b)) {
                    return liVar;
                }
            }
        }
        return null;
    }

    /* renamed from: b */
    public static boolean m180529b(C50121li liVar) {
        C50119lg lgVar = liVar.f130305d;
        if (lgVar == null) {
            lgVar = C50119lg.f130295d;
        }
        if ((lgVar.f130297a & 1) == 0) {
            return true;
        }
        C50119lg lgVar2 = liVar.f130305d;
        if (lgVar2 == null) {
            lgVar2 = C50119lg.f130295d;
        }
        return lgVar2.f130298b;
    }

    /* renamed from: c */
    public static List m180530c(C50121li liVar, Context context) {
        String str;
        ArrayList arrayList = new ArrayList();
        if (!(liVar == null || (liVar.f130302a & 2) == 0)) {
            C50094ki kiVar = liVar.f130304c;
            if (kiVar == null) {
                kiVar = C50094ki.f130230i;
            }
            C50102kq kqVar = kiVar.f130238g;
            if (kqVar == null) {
                kqVar = C50102kq.f130252b;
            }
            for (C50100ko koVar : kqVar.f130254a) {
                C58495hd hdVar = f302049a;
                if (hdVar.containsKey(koVar.f130249a)) {
                    str = context.getResources().getString(((Integer) hdVar.get(koVar.f130249a)).intValue());
                } else {
                    str = koVar.f130249a;
                }
                C58495hd hdVar2 = f302050b;
                arrayList.add(new C108744l(C108727gs.m180835c(hdVar2.containsKey(koVar.f130249a) ? ((Integer) hdVar2.get(koVar.f130249a)).intValue() : R.drawable.quantum_ic_search_googblue_24, str), C58485gu.m89842j(koVar.f130250b)));
            }
        }
        return arrayList;
    }
}
