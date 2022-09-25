package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6378f.p6379a;

import android.view.View;
import com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.shelfbackground.impl.C82068aw;
import com.google.android.googlequicksearchbox.R;
import p3186j$.util.function.Consumer;
import p3186j$.util.function.Supplier;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.f.a.d */
/* compiled from: PG */
public final /* synthetic */ class C81577d implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C81596w f223153a;

    /* renamed from: b */
    public final /* synthetic */ Supplier f223154b;

    /* renamed from: c */
    public final /* synthetic */ int f223155c;

    public /* synthetic */ C81577d(C81596w wVar, int i, Supplier supplier) {
        this.f223153a = wVar;
        this.f223155c = i;
        this.f223154b = supplier;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final void accept(Object obj) {
        View view;
        Integer num;
        int i;
        C81596w wVar = this.f223153a;
        int i2 = this.f223155c;
        Supplier supplier = this.f223154b;
        View view2 = (View) obj;
        if (i2 == 0) {
            throw null;
        } else if (i2 != 8) {
            int i3 = i2 - 1;
            if (i3 == 3) {
                view = view2.findViewById(R.id.nga_assist_privacy_chip_text);
            } else if (i3 != 5) {
                view = view2.findViewById(R.id.nga_assist_hero_chip_text);
            } else {
                view = view2.findViewById(R.id.nga_assist_promo_chip_container);
            }
            switch (i3) {
                case 1:
                    i = 117613;
                    break;
                case 2:
                    i = 117965;
                    break;
                case 3:
                    i = 142373;
                    break;
                case 4:
                    i = 121514;
                    break;
                case 5:
                    i = 127572;
                    break;
                case 6:
                    i = 157175;
                    break;
                default:
                    num = 104590;
                    break;
            }
            num = Integer.valueOf(i);
            wVar.f223193h.mo75435f(view, num.intValue(), false);
            wVar.f223193h.mo75431b(((C82068aw) supplier).f224303a.mo75492a());
        } else {
            wVar.f223193h.mo75434e(view2);
        }
    }
}
