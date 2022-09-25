package com.google.android.libraries.componentview.services.application;

import com.evernote.android.state.BuildConfig;
import com.google.common.base.C58825ap;
import com.google.common.base.C58827ar;
import com.google.common.p4522b.C58485gu;
import com.google.p4271bq.C56429h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.services.application.bl */
/* compiled from: PG */
public final class C20585bl {

    /* renamed from: b */
    private static final C58827ar f57784b = C58827ar.m90818c('.');

    /* renamed from: c */
    private static final C58827ar f57785c = C58827ar.m90818c(';');

    /* renamed from: a */
    public final C56429h f57786a;

    /* renamed from: d */
    private final C20584bk f57787d;

    public C20585bl(C56429h hVar, C20584bk bkVar) {
        this.f57786a = hVar;
        this.f57787d = bkVar;
    }

    /* renamed from: a */
    public static String m38624a(List list) {
        if (list.isEmpty()) {
            return null;
        }
        StringBuilder sb = new StringBuilder("1");
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C20585bl blVar = (C20585bl) it.next();
            C56429h hVar = blVar.f57786a;
            if (hVar != null) {
                C58827ar arVar = f57784b;
                String str = hVar.f150556h;
                arrayList.add(arVar.mo56097d(new C58825ap(new Object[]{blVar.f57787d.f57783d}, str, BuildConfig.FLAVOR)));
            }
        }
        sb.append(f57785c.mo56097d(arrayList));
        return sb.toString();
    }

    /* renamed from: b */
    public static String m38625b(C20585bl... blVarArr) {
        return m38624a(C58485gu.m89844l(blVarArr));
    }
}
