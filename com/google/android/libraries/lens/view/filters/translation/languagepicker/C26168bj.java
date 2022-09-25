package com.google.android.libraries.lens.view.filters.translation.languagepicker;

import android.widget.PopupWindow;
import com.google.common.p4522b.C58485gu;
import java.util.Locale;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.libraries.lens.view.filters.translation.languagepicker.bj */
/* compiled from: PG */
public final /* synthetic */ class C26168bj implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ Locale f71081a;

    /* renamed from: b */
    public final /* synthetic */ PopupWindow f71082b;

    /* renamed from: c */
    public final /* synthetic */ C26164bf f71083c;

    public /* synthetic */ C26168bj(Locale locale, C26164bf bfVar, PopupWindow popupWindow) {
        this.f71081a = locale;
        this.f71083c = bfVar;
        this.f71082b = popupWindow;
    }

    public final void accept(Object obj) {
        Locale locale = this.f71081a;
        C26164bf bfVar = this.f71083c;
        PopupWindow popupWindow = this.f71082b;
        C26172bn bnVar = C26172bn.CANCEL;
        int ordinal = ((C26172bn) obj).ordinal();
        if (ordinal == 0) {
            bfVar.f71074a.f71022s.f70834x.mo5706i(locale);
        } else if (ordinal == 1) {
            bfVar.f71074a.f71022s.mo31251f(locale, false);
            bfVar.f71074a.f71022s.mo31255j(C58485gu.m89846n(locale), false);
        } else if (ordinal == 2 || ordinal == 3) {
            bfVar.f71074a.f71022s.mo31251f(locale, false);
            bfVar.f71074a.f71022s.mo31255j(C58485gu.m89846n(locale), true);
        }
        popupWindow.dismiss();
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
