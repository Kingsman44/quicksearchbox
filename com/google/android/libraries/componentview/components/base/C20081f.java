package com.google.android.libraries.componentview.components.base;

import android.view.View;
import android.view.ViewParent;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.p4271bq.C56423b;
import com.google.p4271bq.C56425d;
import com.google.p4463ce.p4464a.p4470b.p4471a.C58054a;
import com.google.p4463ce.p4464a.p4470b.p4472b.p4473a.p4474a.C58055a;
import java.util.ArrayList;

/* renamed from: com.google.android.libraries.componentview.components.base.f */
/* compiled from: PG */
public final class C20081f {
    /* renamed from: a */
    public static C58054a m37969a(View view) {
        Object tag = view.getTag(R.id.cml_callback_registry_tag);
        if (tag != null) {
            return (C58054a) tag;
        }
        ViewParent parent = view.getParent();
        if (!(parent instanceof View)) {
            return null;
        }
        return m37969a((View) parent);
    }

    /* renamed from: b */
    public static void m37970b(C58055a aVar, String str, View view, Object... objArr) {
        if (m37969a(view) == null) {
            C20520h.m38497b(6, "CmlActions", (Throwable) null, "Called invokeAction('%s') without CallbackRegistry set up.", str);
            return;
        }
        int length = objArr.length;
        Object[] objArr2 = new Object[(length + 1)];
        objArr2[0] = view;
        System.arraycopy(objArr, 0, objArr2, 1, length);
        ArrayList arrayList = new ArrayList(aVar.f155195a);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            for (C56423b bVar : ((C56425d) arrayList.get(i)).f150543e) {
                if (bVar.f150534a.equals(str)) {
                    int i2 = bVar.f150535b;
                    throw null;
                }
            }
        }
    }
}
