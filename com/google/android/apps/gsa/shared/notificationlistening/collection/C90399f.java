package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.app.Notification;
import android.content.Context;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90389w;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90429j;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60242lp;
import com.google.common.p4552o.C60244lr;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.f */
/* compiled from: PG */
public class C90399f extends C90398e {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public String mo84104a(Context context, C90396c cVar, C60242lp lpVar, boolean z) {
        CharSequence charSequence = cVar.f252472b;
        if (charSequence == null) {
            C90366ae.m146974m(lpVar, mo84105b(), Collections.singletonList(C60244lr.NO_EXTRA_TITLE_OR_EXTRA_TEXT));
            return null;
        }
        return C90397d.m147010h(context, mo84105b(), charSequence, cVar.f252475e, lpVar, z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public int mo84105b() {
        return 10;
    }

    /* renamed from: d */
    public List mo84092d(Context context, C89656k kVar, C21370a aVar, C90367af afVar, C90381o oVar, C60242lp lpVar, boolean z) {
        CharSequence charSequence;
        Notification notification = afVar.f252393a.getNotification();
        C90396c cVar = new C90396c(notification);
        String a = mo84104a(context, cVar, lpVar, z);
        if (a == null) {
            C58976aa aaVar = C58975e.f156826a;
            return super.mo84092d(context, kVar, aVar, afVar, oVar, lpVar, z);
        }
        C58976aa aaVar2 = C58975e.f156826a;
        C90429j jVar = new C90429j(aVar);
        C90366ae.m146971j(context, kVar, afVar, oVar, jVar);
        jVar.f252615D = a;
        CharSequence charSequence2 = cVar.f252473c;
        String str = null;
        if (charSequence2 == null) {
            charSequence2 = null;
        }
        if (charSequence2 != null) {
            C90389w i = mo84101i(context, notification, charSequence2);
            jVar.f252626w = charSequence2;
            if (i == null) {
                charSequence = null;
            } else {
                charSequence = i.f252448a;
            }
            jVar.f252622s = charSequence;
            if (i != null) {
                str = i.f252449b;
            }
            jVar.f252623t = str;
        }
        jVar.f252568e = "msg";
        jVar.mo84160c(C90366ae.m146964c(notification));
        jVar.mo84159b(C90366ae.m146963b(notification));
        jVar.f252614C = notification;
        jVar.mo84143a(C90366ae.m146966e(afVar.f252393a), a);
        return Collections.singletonList(new MessageNotification(jVar));
    }
}
