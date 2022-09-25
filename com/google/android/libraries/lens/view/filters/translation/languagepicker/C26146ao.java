package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.content.Context;
import com.google.android.libraries.lens.view.filters.translation.C26217r;
import com.google.android.libraries.lens.view.p2069am.C25319b;
import com.google.android.libraries.lens.view.p2069am.C25327c;
import com.google.android.libraries.lens.view.utils.C28122k;
import com.google.common.base.C58831av;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58890d;
import java.text.Collator;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Map;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.ao */
/* compiled from: PG */
public final class C26146ao {

    /* renamed from: a */
    public final C26217r f71051a;

    /* renamed from: b */
    public final Collator f71052b;

    public C26146ao(Context context, C26217r rVar) {
        this.f71051a = rVar;
        Collator instance = Collator.getInstance(C28122k.m52406f(context));
        this.f71052b = instance;
        instance.setStrength(0);
        instance.setDecomposition(1);
    }

    /* renamed from: a */
    public static int m48285a(C26136ae aeVar, String str) {
        int indexOf = C58890d.m90987b(aeVar.mo31366f()).indexOf(str);
        if (indexOf >= 0) {
            return indexOf;
        }
        return C58890d.m90987b(aeVar.mo31367g()).indexOf(str);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final C26135ad mo31381b(Locale locale) {
        C26177d dVar = new C26177d();
        dVar.f71112e = C58836b.f156633a;
        dVar.mo31360f(false);
        dVar.mo31357c(true);
        dVar.mo31358d(false);
        if (locale != null) {
            dVar.f71110c = locale;
            String b = this.f71051a.mo31432b(locale);
            if (b != null) {
                dVar.f71111d = b;
                String c = this.f71051a.mo31433c(locale);
                if (c != null) {
                    dVar.f71113f = c;
                    return dVar;
                }
                throw new NullPointerException("Null endonym");
            }
            throw new NullPointerException("Null displayName");
        }
        throw new NullPointerException("Null locale");
    }

    /* renamed from: c */
    public final C26136ae mo31382c(Locale locale, Locale locale2, Map map, Map map2, boolean z) {
        C25327c cVar = (C25327c) C58831av.m90830c((C25327c) Map.EL.getOrDefault(map, locale, C25327c.UNKNOWN), C25327c.UNKNOWN);
        C26135ad b = mo31381b(locale);
        b.mo31359e(locale2.equals(locale));
        boolean z2 = true;
        if (!z && !cVar.equals(C25327c.PERMANENT) && !cVar.equals(C25327c.DOWNLOADED)) {
            z2 = false;
        }
        b.mo31357c(z2);
        C26177d dVar = (C26177d) b;
        dVar.f71108a = cVar;
        if (map2.containsKey(locale)) {
            dVar.f71109b = C58833ax.m90834k((C25319b) map2.get(locale));
        }
        return b.mo31355a();
    }
}
