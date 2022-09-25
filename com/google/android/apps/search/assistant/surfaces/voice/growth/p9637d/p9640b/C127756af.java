package com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b;

import android.text.TextUtils;
import com.google.android.apps.search.assistant.surfaces.voice.growth.p9637d.p9640b.p9641a.C127743d;
import com.google.common.p4522b.C58495hd;
import java.util.Locale;
import p3186j$.util.function.Predicate;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.d.b.af */
/* compiled from: PG */
public final /* synthetic */ class C127756af implements Predicate {

    /* renamed from: a */
    public final /* synthetic */ Locale f351672a;

    public /* synthetic */ C127756af(Locale locale) {
        this.f351672a = locale;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        return Predicate.CC.$default$and(this, predicate);
    }

    public final /* synthetic */ Predicate negate() {
        return Predicate.CC.$default$negate(this);
    }

    /* renamed from: or */
    public final /* synthetic */ Predicate mo17950or(Predicate predicate) {
        return Predicate.CC.$default$or(this, predicate);
    }

    public final boolean test(Object obj) {
        Locale locale = this.f351672a;
        C58495hd hdVar = C127760aj.f351677a;
        String str = ((C127743d) obj).f351639d;
        if (str.equals(Locale.ROOT.toLanguageTag())) {
            return true;
        }
        Locale forLanguageTag = Locale.forLanguageTag(str);
        if (TextUtils.isEmpty(forLanguageTag.getCountry())) {
            return locale.getLanguage().equals(forLanguageTag.getLanguage());
        }
        return locale.equals(forLanguageTag);
    }
}
