package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import com.google.common.base.C58890d;
import java.util.Locale;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.ah */
/* compiled from: PG */
public final /* synthetic */ class C26139ah implements Function {

    /* renamed from: a */
    public final /* synthetic */ C26146ao f71041a;

    /* renamed from: b */
    public final /* synthetic */ C26138ag f71042b;

    public /* synthetic */ C26139ah(C26146ao aoVar, C26138ag agVar) {
        this.f71041a = aoVar;
        this.f71042b = agVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final Object apply(Object obj) {
        C26146ao aoVar = this.f71041a;
        C26180g gVar = (C26180g) this.f71042b;
        C26136ae c = aoVar.mo31382c((Locale) obj, gVar.f71134c, gVar.f71135d, gVar.f71136e, gVar.f71137f);
        String str = gVar.f71133b;
        int indexOf = C58890d.m90987b(c.mo31366f()).indexOf(str);
        if (indexOf == -1) {
            return c;
        }
        C26135ad a = c.mo31361a();
        a.mo31356b(new C26158b(indexOf, str.length()));
        return a.mo31355a();
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
