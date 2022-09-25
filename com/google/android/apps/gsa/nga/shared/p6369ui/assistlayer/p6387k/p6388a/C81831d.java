package com.google.android.apps.gsa.nga.shared.p6369ui.assistlayer.p6387k.p6388a;

import android.graphics.Color;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.nga.shared.p6315aj.p6316a.p6317a.C80671b;
import com.google.android.apps.gsa.shared.util.p7159c.C90873ag;
import com.google.android.apps.gsa.shared.util.p7159c.C90919bp;
import com.google.android.libraries.lens.sdk.avs.data.AppFlowEvent;
import com.google.common.p4522b.C58485gu;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.nga.shared.ui.assistlayer.k.a.d */
/* compiled from: PG */
public final /* synthetic */ class C81831d implements C90919bp {

    /* renamed from: a */
    public final /* synthetic */ C81836i f223795a;

    public /* synthetic */ C81831d(C81836i iVar) {
        this.f223795a = iVar;
    }

    /* renamed from: a */
    public final void mo17870a(Object obj) {
        C81836i iVar = this.f223795a;
        C80671b bVar = (C80671b) obj;
        if (bVar.mo74416e().booleanValue()) {
            new C90873ag(iVar.f223803c.mo28201a("[NGA] compute thumbnails", new C81833f(bVar)), iVar.f223802b, "[NGA] set content", new C81834g(iVar, bVar)).mo85223a(C81835h.f223800a);
        } else {
            iVar.f223804d.mo75367b(bVar.mo74415d(), bVar.mo74413a(), Optional.empty());
        }
        C58485gu c = bVar.mo74414c();
        if (!c.isEmpty()) {
            StringBuilder sb = new StringBuilder();
            int size = c.size();
            for (int i = 0; i < size; i++) {
                AppFlowEvent appFlowEvent = (AppFlowEvent) c.get(i);
                if (C81842o.f223837a.containsKey(Integer.valueOf(appFlowEvent.f67920b.f67969b))) {
                    sb.append("\n");
                    sb.append((String) C81842o.f223837a.get(Integer.valueOf(appFlowEvent.f67920b.f67969b)));
                } else {
                    sb.append("\n Unknown event: ");
                    sb.append(appFlowEvent.f67920b.f67969b);
                }
            }
            C81841n nVar = iVar.f223804d;
            String sb2 = sb.toString();
            TextView textView = new TextView(nVar.getContext());
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
            layoutParams.leftMargin = nVar.mo75366a(12.0f);
            layoutParams.topMargin = nVar.mo75366a(12.0f);
            textView.setLayoutParams(layoutParams);
            textView.setBackgroundColor(Color.argb(25, 0, 0, 0));
            textView.setTextColor(-16711936);
            textView.setText(sb2);
            nVar.addView(textView);
        }
    }
}
