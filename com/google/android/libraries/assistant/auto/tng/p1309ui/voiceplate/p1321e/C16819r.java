package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.appwidget.AppWidgetHostView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import androidx.core.p098j.C2050bp;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32437ad;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32438ae;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32439af;
import com.google.android.libraries.search.assistant.appactions.p2501a.C32464w;
import com.google.common.p4526f.C59052c;
import java.util.Iterator;
import p3186j$.util.function.Consumer;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.r */
/* compiled from: PG */
public final /* synthetic */ class C16819r implements Consumer {

    /* renamed from: a */
    public final /* synthetic */ C16820s f49251a;

    public /* synthetic */ C16819r(C16820s sVar) {
        this.f49251a = sVar;
    }

    public final void accept(Object obj) {
        View view;
        C32438ae aeVar = (C32438ae) obj;
        ViewGroup a = this.f49251a.mo23042a();
        if (a.getChildCount() == 0) {
            ((C59052c) ((C59052c) C16820s.f49252a.mo56226d()).mo56372aa(46891)).mo56386p("No AppWidgetHostView found for handling SimpleCollectionResponses");
            return;
        }
        AppWidgetHostView appWidgetHostView = (AppWidgetHostView) a.getChildAt(0);
        for (C32437ad adVar : aeVar.f86909a) {
            int i = adVar.f86907a;
            adVar.f86908b.size();
            int i2 = adVar.f86907a;
            C69664n.m101061g(appWidgetHostView, "<this>");
            Iterator a2 = C2050bp.m5609a(appWidgetHostView).mo5191a();
            while (true) {
                if (!a2.hasNext()) {
                    view = null;
                    break;
                }
                view = C32464w.m60249a((View) a2.next(), i2, AbsListView.class);
                if (view != null) {
                    break;
                }
            }
            AbsListView absListView = (AbsListView) view;
            if (absListView != null) {
                absListView.setAdapter(new C32439af(appWidgetHostView.getContext(), adVar.f86908b));
            }
        }
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }
}
