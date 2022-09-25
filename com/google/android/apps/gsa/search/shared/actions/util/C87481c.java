package com.google.android.apps.gsa.search.shared.actions.util;

import android.content.Context;
import com.google.android.apps.gsa.shared.util.C90769bm;
import com.google.android.apps.gsa.shared.util.p7187ui.C91109h;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58597ky;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.util.c */
/* compiled from: PG */
public final class C87481c {

    /* renamed from: a */
    public static final C87498t[] f236306a = {C87498t.MORNING, C87498t.AFTERNOON, C87498t.EVENING, C87498t.NIGHT, C87498t.TIME_UNSPECIFIED};

    /* renamed from: b */
    public final Map f236307b;

    /* renamed from: c */
    public final C91109h f236308c;

    /* renamed from: d */
    public final C91109h f236309d;

    /* renamed from: e */
    public final C91109h f236310e;

    /* renamed from: f */
    private final C91109h f236311f;

    public C87481c(Context context) {
        String[] stringArray = context.getResources().getStringArray(R.array.edit_reminder_time);
        HashMap hashMap = new HashMap();
        int i = 0;
        while (true) {
            C87498t[] tVarArr = f236306a;
            int length = tVarArr.length;
            if (i < 5) {
                C87498t tVar = tVarArr[i];
                hashMap.put(tVar, new C91109h(stringArray[i], tVar, false));
                i++;
            } else {
                this.f236307b = hashMap;
                this.f236308c = new C91109h(stringArray[5], (Object) null, true);
                String[] stringArray2 = context.getResources().getStringArray(R.array.edit_reminder_day);
                this.f236309d = new C91109h(stringArray2[0], 0, false);
                this.f236310e = new C91109h(stringArray2[1], 1, false);
                this.f236311f = new C91109h(stringArray2[3], (Object) null, true);
                return;
            }
        }
    }

    /* renamed from: b */
    public static List m141991b(long j) {
        long currentTimeMillis = System.currentTimeMillis();
        if (!C90769bm.m148270b(currentTimeMillis, j)) {
            return C58597ky.m90212c(f236306a);
        }
        C87498t[] tVarArr = f236306a;
        int length = tVarArr.length;
        ArrayList d = C58597ky.m90213d(5);
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(currentTimeMillis);
        int i = instance.get(11);
        int length2 = tVarArr.length;
        for (int i2 = 0; i2 < 5; i2++) {
            C87498t tVar = tVarArr[i2];
            if (tVar.f236329f > i + 1 || tVar == C87498t.TIME_UNSPECIFIED) {
                d.add(tVar);
            }
        }
        return d;
    }

    /* renamed from: c */
    public static boolean m141992c(long j) {
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(j);
        return instance.get(11) < 23;
    }

    /* renamed from: d */
    public static C91109h[] m141993d(List list) {
        return (C91109h[]) list.toArray(new C91109h[list.size()]);
    }

    /* renamed from: a */
    public final List mo81468a(long j) {
        ArrayList arrayList = new ArrayList();
        if (m141992c(j)) {
            arrayList.add(this.f236309d);
        }
        arrayList.add(this.f236310e);
        arrayList.add(this.f236311f);
        return arrayList;
    }
}
