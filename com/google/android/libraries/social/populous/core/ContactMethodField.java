package com.google.android.libraries.social.populous.core;

import com.google.common.base.C58903m;
import com.google.common.base.C58912v;
import com.google.common.p4522b.C58336bg;
import com.google.common.p4522b.C58701ou;
import com.google.common.p4522b.C58710pc;
import java.util.Locale;

/* compiled from: PG */
public abstract class ContactMethodField implements Comparable, Loggable, C42304cc {

    /* renamed from: Zu */
    private static final C58912v f110767Zu = new C58903m('.');

    static {
        new C58336bg(C42280bf.f110908a, C58701ou.f156429a);
    }

    /* renamed from: m */
    public static String m74310m(C42299by byVar, String str) {
        if (byVar == C42299by.EMAIL) {
            str = str.toLowerCase(Locale.ROOT).trim();
            if (str.endsWith("@gmail.com") || str.endsWith("@googlemail.com")) {
                str = String.valueOf(f110767Zu.mo56193m(str.substring(0, str.lastIndexOf(64)))).concat("@gmail.com");
            }
        }
        String byVar2 = byVar.toString();
        return str + "," + byVar2;
    }

    /* renamed from: b */
    public abstract PersonFieldMetadata mo44976b();

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Integer num;
        ContactMethodField contactMethodField = (ContactMethodField) obj;
        C58710pc b = C58701ou.f156429a.mo55782b();
        Integer num2 = null;
        if (mo44976b() == null) {
            num = null;
        } else {
            num = Integer.valueOf(mo44976b().f110787d);
        }
        if (contactMethodField.mo44976b() != null) {
            num2 = Integer.valueOf(contactMethodField.mo44976b().f110787d);
        }
        return b.compare(num, num2);
    }

    /* renamed from: g */
    public abstract CharSequence mo44982g();

    /* renamed from: j */
    public final Email mo45116j() {
        if (this instanceof Email) {
            return (Email) this;
        }
        return null;
    }

    /* renamed from: k */
    public final InAppNotificationTarget mo45117k() {
        if (this instanceof InAppNotificationTarget) {
            return (InAppNotificationTarget) this;
        }
        return null;
    }

    /* renamed from: l */
    public final Phone mo45118l() {
        if (this instanceof Phone) {
            return (Phone) this;
        }
        return null;
    }

    /* renamed from: lo */
    public abstract C42282bh mo45020lo();

    /* renamed from: n */
    public abstract String mo45119n();
}
