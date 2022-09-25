package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.app.Notification;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90382p;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90389w;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90429j;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60242lp;
import com.google.common.p4552o.C60244lr;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.d */
/* compiled from: PG */
public class C90397d extends C90398e {
    /* renamed from: h */
    static String m147010h(Context context, int i, CharSequence charSequence, Set set, C60242lp lpVar, boolean z) {
        String trim = m147012m(charSequence)[0].split(", ")[0].trim();
        if (!trim.isEmpty()) {
            return C90366ae.m146967f(context, trim, z);
        }
        if (set.size() == 1) {
            return C90366ae.m146968g(context, (String) set.iterator().next());
        }
        C90366ae.m146974m(lpVar, i, Collections.singletonList(C60244lr.GET_NAME_FROM_CONTACT_URIS));
        return null;
    }

    /* renamed from: l */
    private static boolean m147011l(CharSequence charSequence) {
        return charSequence.toString().contains(": ") || charSequence.toString().contains("  ");
    }

    /* renamed from: m */
    private static String[] m147012m(CharSequence charSequence) {
        if (charSequence.toString().contains(": ")) {
            return charSequence.toString().split(": ", 2);
        }
        if (charSequence.toString().contains("  ")) {
            return charSequence.toString().split("  ", 2);
        }
        return new String[]{charSequence.toString()};
    }

    /* renamed from: a */
    public CharSequence mo84095a(Context context, C90396c cVar, boolean z) {
        return context.getString(R.string.unnamed_group_name);
    }

    /* renamed from: b */
    public String mo84096b(Notification notification) {
        return "msg";
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final String mo84097c(Context context, C90396c cVar, C60242lp lpVar, boolean z) {
        CharSequence charSequence = cVar.f252476f;
        if (charSequence == null) {
            return null;
        }
        return m147010h(context, mo84100g(), charSequence, cVar.f252475e, lpVar, z);
    }

    /* renamed from: d */
    public final List mo84092d(Context context, C89656k kVar, C21370a aVar, C90367af afVar, C90381o oVar, C60242lp lpVar, boolean z) {
        StatusBarNotification statusBarNotification;
        String str;
        C90396c cVar;
        String str2;
        CharSequence charSequence;
        String str3;
        Context context2 = context;
        C90367af afVar2 = afVar;
        C90381o oVar2 = oVar;
        C60242lp lpVar2 = lpVar;
        boolean z2 = z;
        StatusBarNotification statusBarNotification2 = afVar2.f252393a;
        Notification notification = statusBarNotification2.getNotification();
        C90396c cVar2 = new C90396c(notification);
        CharSequence charSequence2 = statusBarNotification2.getNotification().tickerText;
        if (charSequence2 == null || !m147011l(charSequence2)) {
            if (oVar2 == null || (charSequence2 = oVar2.mo84081a(statusBarNotification2.getPostTime())) == null || !m147011l(charSequence2) || !oVar2.mo84082b(statusBarNotification2.getPostTime())) {
                charSequence2 = null;
            } else {
                C59071e eVar = C90382p.f252430a;
                C58976aa aaVar = C58975e.f156826a;
                oVar2.f252426f = true;
            }
        }
        cVar2.f252476f = charSequence2;
        if (!z2) {
            String d = C90366ae.m146965d(statusBarNotification2.getNotification(), oVar2);
            List arrayList = new ArrayList();
            if (mo84098e(context2, cVar2, false) || (d != null && !"msg".equals(d))) {
                str = "msg";
                statusBarNotification = statusBarNotification2;
                cVar = cVar2;
            } else {
                str = "msg";
                statusBarNotification = statusBarNotification2;
                cVar = cVar2;
                arrayList = super.mo84103k(context, kVar, aVar, afVar, oVar, (CharSequence) null, false);
            }
            if (!arrayList.isEmpty()) {
                return C58485gu.m89842j(arrayList);
            }
        } else {
            str = "msg";
            statusBarNotification = statusBarNotification2;
            cVar = cVar2;
        }
        if (cVar.f252476f != null) {
            String c = mo84097c(context2, cVar, lpVar2, z2);
            if (c == null) {
                return super.mo84092d(context, kVar, aVar, afVar, oVar, lpVar, z);
            }
            String str4 = str;
            if (!str4.equals(mo84096b(notification))) {
                return super.mo84092d(context, kVar, aVar, afVar, oVar, lpVar, z);
            }
            C90429j jVar = new C90429j(aVar);
            C90366ae.m146971j(context2, kVar, afVar2, oVar2, jVar);
            jVar.f252615D = c;
            if (mo84098e(context2, cVar, z2)) {
                jVar.f252620q = mo84095a(context2, cVar, z2);
                jVar.f252621r = mo84099f(cVar);
            }
            CharSequence charSequence3 = cVar.f252476f;
            if (charSequence3 != null) {
                String[] m = m147012m(charSequence3);
                str2 = (m.length == 1 || m[1].trim().isEmpty()) ? context2.getString(R.string.blank_message_content) : m[1];
            } else {
                str2 = null;
            }
            if (str2 != null) {
                C90389w i = mo84101i(context2, notification, str2);
                jVar.f252626w = str2;
                if (i == null) {
                    charSequence = null;
                } else {
                    charSequence = i.f252448a;
                }
                jVar.f252622s = charSequence;
                if (i == null) {
                    str3 = null;
                } else {
                    str3 = i.f252449b;
                }
                jVar.f252623t = str3;
            }
            jVar.f252568e = str4;
            jVar.mo84160c(C90366ae.m146964c(notification));
            jVar.mo84159b(C90366ae.m146963b(notification));
            jVar.f252614C = notification;
            CharSequence charSequence4 = jVar.f252615D;
            if (charSequence4 != null) {
                jVar.mo84143a(C90366ae.m146966e(statusBarNotification), charSequence4.toString());
            }
            return C58485gu.m89846n(new MessageNotification(jVar));
        }
        C89656k kVar2 = kVar;
        C21370a aVar2 = aVar;
        C90366ae.m146974m(lpVar2, mo84100g(), Collections.singletonList(C60244lr.NO_TICKER_TEXT));
        return super.mo84092d(context, kVar, aVar, afVar, oVar, lpVar, z);
    }

    /* renamed from: e */
    public boolean mo84098e(Context context, C90396c cVar, boolean z) {
        if (cVar.f252475e.size() > 1) {
            return true;
        }
        CharSequence charSequence = cVar.f252476f;
        if (charSequence == null) {
            return false;
        }
        return m147012m(charSequence)[0].contains(", ");
    }

    /* renamed from: f */
    public Iterable mo84099f(C90396c cVar) {
        return null;
    }

    /* renamed from: g */
    public int mo84100g() {
        return 3;
    }
}
