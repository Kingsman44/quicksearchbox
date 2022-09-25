package com.google.android.apps.gsa.shared.notificationlistening.collection;

import android.app.Notification;
import android.content.Context;
import android.service.notification.StatusBarNotification;
import androidx.core.app.C1787ad;
import androidx.core.app.C1788ae;
import androidx.core.app.C1791ah;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90366ae;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90367af;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90381o;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90387u;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90389w;
import com.google.android.apps.gsa.shared.notificationlistening.collection.p7121a.C90391y;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90421b;
import com.google.android.apps.gsa.shared.notificationlistening.common.C90435p;
import com.google.android.apps.gsa.shared.notificationlistening.common.MessageNotification;
import com.google.android.apps.gsa.shared.notificationlistening.common.StandardNotification;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.p1730f.C21370a;
import com.google.common.base.C58837ba;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60242lp;
import java.util.Collections;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.shared.notificationlistening.collection.y */
/* compiled from: PG */
public final class C90418y extends C90398e {

    /* renamed from: a */
    private static final String f252512a = new String(Character.toChars(128204));

    /* renamed from: b */
    private static final String f252513b = new String(Character.toChars(128100));

    /* renamed from: c */
    private static final String f252514c = new String(Character.toChars(128247));

    /* renamed from: d */
    private static final String f252515d = new String(Character.toChars(128126));

    /* renamed from: e */
    private static final String f252516e = new String(Character.toChars(127909));

    /* renamed from: f */
    private static final String f252517f = new String(Character.toChars(127925));

    /* renamed from: g */
    private static final String f252518g = new String(Character.toChars(128196));

    /* renamed from: h */
    private static final String f252519h = new String(Character.toChars(127908));

    /* renamed from: a */
    public static boolean m147064a(C90421b bVar) {
        return (bVar instanceof MessageNotification) && bVar.f252591l.equals("com.whatsapp") && ((MessageNotification) bVar).f252531A == null;
    }

    /* renamed from: d */
    public final List mo84092d(Context context, C89656k kVar, C21370a aVar, C90367af afVar, C90381o oVar, C60242lp lpVar, boolean z) {
        C90367af afVar2 = afVar;
        C90381o oVar2 = oVar;
        StatusBarNotification statusBarNotification = afVar2.f252393a;
        C90387u b = C90391y.m146995b(statusBarNotification, oVar2);
        if (b != null) {
            C58976aa aaVar = C58975e.f156826a;
            List e = C90391y.m146998e(context, kVar, aVar, afVar, oVar, b, new C90417x(this, statusBarNotification.getNotification()), z);
            if (!e.isEmpty()) {
                return e;
            }
        }
        String d = C90366ae.m146965d(statusBarNotification.getNotification(), oVar2);
        C58976aa aaVar2 = C58975e.f156826a;
        if (d == null || "msg".equals(d)) {
            List k = super.mo84103k(context, kVar, aVar, afVar, oVar, (CharSequence) null, z);
            if (!k.isEmpty()) {
                return k;
            }
        }
        CharSequence[] charSequenceArray = statusBarNotification.getNotification().extras.getCharSequenceArray("android.textLines");
        if (!C1791ah.m4935c(statusBarNotification.getNotification()) || charSequenceArray == null || charSequenceArray.length <= 1) {
            Context context2 = context;
            C89656k kVar2 = kVar;
            C21370a aVar2 = aVar;
            return C90391y.m146999f(context, kVar, aVar, afVar, oVar, 7, lpVar, z);
        }
        C21370a aVar3 = aVar;
        C90435p pVar = new C90435p(aVar);
        Context context3 = context;
        C89656k kVar3 = kVar;
        C90366ae.m146971j(context, kVar, afVar2, (C90381o) null, pVar);
        pVar.f252646r = afVar2.f252393a.getNotification().extras.getCharSequence("android.text");
        return Collections.singletonList(new StandardNotification(pVar));
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C90389w mo84101i(Context context, Notification notification, CharSequence charSequence) {
        if (charSequence == null) {
            return null;
        }
        String obj = charSequence.toString();
        if (obj.startsWith(f252512a)) {
            return new C90389w(context.getString(R.string.shared_location), "image");
        }
        if (obj.startsWith(f252513b)) {
            return new C90389w(context.getString(R.string.shared_contact), "text/plain");
        }
        if (obj.startsWith(f252514c) || obj.startsWith(f252515d)) {
            return new C90389w(context.getString(R.string.shared_photo), "image");
        }
        if (obj.startsWith(f252516e)) {
            return new C90389w(context.getString(R.string.shared_video), "video");
        }
        if (obj.startsWith(f252517f) || obj.startsWith(f252519h)) {
            return new C90389w(context.getString(R.string.shared_audio), "audio");
        }
        return obj.startsWith(f252518g) ? new C90389w(context.getString(R.string.shared_document), "text/plain") : new C90389w(charSequence, "text/plain");
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final String mo84102j(C89656k kVar, int i, C1788ae aeVar) {
        String str = null;
        if (aeVar != null && i >= 0 && i < aeVar.f5574a.size()) {
            C1787ad adVar = (C1787ad) aeVar.f5574a.get(i);
            if (adVar.mo4994b() != null) {
                C90366ae.m146975n(kVar);
                CharSequence b = adVar.mo4994b();
                b.getClass();
                str = b.toString();
            }
            if (!(!C58837ba.m90859h(str) || aeVar.f5575b.f5630a == null || aeVar.f5576c == null)) {
                C90366ae.m146975n(kVar);
                return aeVar.f5575b.f5630a.toString();
            }
        }
        return str;
    }
}
