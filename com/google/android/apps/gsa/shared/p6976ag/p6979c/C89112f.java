package com.google.android.apps.gsa.shared.p6976ag.p6979c;

import android.content.Context;
import android.content.Intent;
import com.google.android.apps.gsa.search.shared.actions.util.C87484f;
import com.google.android.apps.gsa.search.shared.p6931i.C87573b;
import com.google.android.apps.gsa.shared.util.C90772bp;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.assistant.p3897e.p3921j.C52115fu;
import com.google.common.base.C58837ba;
import com.google.protos.p4850an.p4855d.p4857b.C63490p;

/* renamed from: com.google.android.apps.gsa.shared.ag.c.f */
/* compiled from: PG */
public final class C89112f {

    /* renamed from: a */
    private final Context f241565a;

    /* renamed from: b */
    private final C22871g f241566b;

    /* renamed from: c */
    private final C87484f f241567c;

    /* renamed from: d */
    private final C87573b f241568d;

    /* renamed from: e */
    private final C89116j f241569e;

    /* renamed from: f */
    private final int f241570f;

    public C89112f(int i, Context context, C22871g gVar, C87484f fVar, C87573b bVar, C89116j jVar) {
        this.f241570f = i;
        this.f241565a = context;
        this.f241566b = gVar;
        this.f241567c = fVar;
        this.f241568d = bVar;
        this.f241569e = jVar;
    }

    /* renamed from: b */
    public final boolean mo83090b(C52115fu fuVar) {
        C63490p pVar;
        C63490p pVar2;
        boolean z = false;
        if (fuVar == null || (fuVar.f136755a & 16) == 0) {
            return false;
        }
        try {
            pVar = C63490p.m96249a(fuVar.f136760f);
        } catch (IllegalArgumentException unused) {
            pVar = C63490p.UNSPECIFIED;
        }
        int i = this.f241570f;
        switch (i - 1) {
            case 1:
            case 2:
                if (C89108b.f241541a.contains(pVar)) {
                    return this.f241569e.mo83099a(this.f241570f).mo83097c(fuVar);
                }
                break;
            case 3:
                break;
            case 4:
            case 5:
            case 6:
                return this.f241569e.mo83099a(i).mo83097c(fuVar);
            default:
                return false;
        }
        int i2 = this.f241570f;
        Context context = this.f241565a;
        C87484f fVar = this.f241567c;
        C87573b bVar = this.f241568d;
        C89107a aVar = new C89107a(i2, context);
        if ((fuVar.f136755a & 16) == 0) {
            return false;
        }
        try {
            pVar2 = C63490p.m96249a(fuVar.f136760f);
        } catch (IllegalArgumentException unused2) {
            pVar2 = C63490p.UNSPECIFIED;
        }
        int ordinal = pVar2.ordinal();
        if (ordinal == 9) {
            int a = C89118l.m144972a(C90772bp.m148280G(aVar.f241539a), aVar);
            if (a == 3) {
                return false;
            }
            bVar.mo81707e(new Intent().setAction(C89108b.f241546f).addCategory(C89108b.f241545e).setPackage("com.android.settings").putExtra(C89108b.f241550j, a == 1).putExtra(C89108b.f241544d, "android-app://com.google.android.googlequicksearchbox/https/www.google.com").putExtra("IsVoiceQuery", false).putExtra("NoUiQuery", true), 0);
        } else if (ordinal == 28) {
            int a2 = C89118l.m144972a(C90772bp.m148282I(aVar.f241539a), aVar);
            if (a2 == 3) {
                return false;
            }
            bVar.mo81707e(new Intent().setAction(C89108b.f241547g).addCategory(C89108b.f241545e).setPackage("com.android.settings").putExtra(C89108b.f241549i, a2 == 1).putExtra(C89108b.f241544d, "android-app://com.google.android.googlequicksearchbox/https/www.google.com").putExtra("IsVoiceQuery", false).putExtra("NoUiQuery", true), 0);
        } else if (ordinal == 31) {
            int a3 = C89118l.m144972a(C90772bp.m148277D(aVar.f241539a), aVar);
            if (a3 == 3) {
                return false;
            }
            Context context2 = aVar.f241539a;
            if (a3 == 1) {
                z = true;
            }
            return C90772bp.m148286M(context2, z);
        } else if (ordinal == 45) {
            int a4 = C89118l.m144972a(C90772bp.m148281H(aVar.f241539a), aVar);
            if (a4 == 3) {
                return false;
            }
            bVar.mo81707e(new Intent().setAction(C89108b.f241548h).addCategory(C89108b.f241545e).setPackage("com.android.settings").putExtra(C89108b.f241551k, a4 == 1).putExtra(C89108b.f241544d, "android-app://com.google.android.googlequicksearchbox/https/www.google.com").putExtra("IsVoiceQuery", false).putExtra("NoUiQuery", true), 0);
        } else if (ordinal != 50) {
            if (ordinal == 103 && C89118l.m144972a(C90772bp.m148284K(aVar.f241539a), aVar) == 3) {
            }
            return false;
        } else {
            int a5 = C89118l.m144972a(fVar.mo81473d(), aVar);
            if (a5 == 3) {
                return false;
            }
            fVar.mo81470a(((fuVar.f136755a & 32) == 0 || fuVar.f136761g == 0) ? false : true);
            if (a5 == 1) {
                z = true;
            }
            return fVar.mo81474e(z);
        }
        return true;
    }

    /* renamed from: a */
    public final Integer mo83089a(String str) {
        if (str == null) {
            return null;
        }
        int i = this.f241570f;
        switch (i - 1) {
            case 1:
            case 2:
            case 3:
                Context context = this.f241565a;
                C87484f fVar = this.f241567c;
                C89107a aVar = new C89107a(i, context);
                if (C58837ba.m90859h(str)) {
                    return null;
                }
                if (str.equals(C63490p.AIRPLANE_MODE.name())) {
                    return Integer.valueOf(C90772bp.m148280G(aVar.f241539a) ? 1 : 0);
                }
                if (str.equals(C63490p.BATTERY_SAVER.name())) {
                    return Integer.valueOf(C90772bp.m148282I(aVar.f241539a) ? 1 : 0);
                }
                if (str.equals(C63490p.BLUETOOTH.name())) {
                    return Integer.valueOf(C90772bp.m148277D(aVar.f241539a) ? 1 : 0);
                }
                if (str.equals(C63490p.FLASHLIGHT.name())) {
                    return Integer.valueOf(fVar.mo81473d() ? 1 : 0);
                }
                if (str.equals(C63490p.WIFI.name())) {
                    return Integer.valueOf(C90772bp.m148284K(aVar.f241539a) ? 1 : 0);
                }
                if (!str.equals(C63490p.DO_NOT_DISTURB.name())) {
                    return null;
                }
                return Integer.valueOf(C90772bp.m148281H(aVar.f241539a) ? 1 : 0);
            case 4:
            case 5:
            case 6:
                return this.f241569e.mo83099a(i).mo83095a(str);
            default:
                return null;
        }
    }
}
