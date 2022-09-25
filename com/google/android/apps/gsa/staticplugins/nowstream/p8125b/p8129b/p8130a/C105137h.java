package com.google.android.apps.gsa.staticplugins.nowstream.p8125b.p8129b.p8130a;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.apps.gsa.staticplugins.nowstream.p8135c.p8136a.C105305v;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ImmutableListUtils;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.b.b.a.h */
/* compiled from: PG */
public final class C105137h implements C23113i {

    /* renamed from: a */
    private final C105134e f293105a;

    public C105137h(C105134e eVar) {
        this.f293105a = eVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("SecondScreenEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onPullToRefreshEntries")) {
                this.f293105a.mo94582a();
            } else if (str.equals("onRenderComplete_boolean")) {
                Boolean.valueOf(pVar.f63472a.getBoolean("scrolledToTarget")).booleanValue();
            } else if (str.equals("onScrollPositionUpdated_int_int_boolean")) {
                this.f293105a.mo94584c(Integer.valueOf(pVar.f63472a.getInt("streamPosition")).intValue(), Integer.valueOf(pVar.f63472a.getInt("streamOffset")).intValue(), Boolean.valueOf(pVar.f63472a.getBoolean("jumpToTop")).booleanValue());
            } else if (str.equals("reportViewHorizontallyScrolled_com.google.android.libraries.gsa.monet.shared.ProtoParcelable_int_long")) {
                int intValue = Integer.valueOf(pVar.f63472a.getInt("scrollAmount")).intValue();
                long longValue = Long.valueOf(pVar.f63472a.getLong("timestamp")).longValue();
                ((C105305v) this.f293105a).f293800j.mo94776b((ProtoParcelable) new C23269n().mo28733b("veInfo", pVar), intValue, longValue);
            } else if (str.equals("reportViewport_android.graphics.Rect_long")) {
                long longValue2 = Long.valueOf(pVar.f63472a.getLong("timestamp")).longValue();
                ((C105305v) this.f293105a).f293800j.mo94777c((Rect) new C23269n().mo28733b("bounds", pVar), longValue2);
            } else if (str.equals("reportViewportHidden_long")) {
                ((C105305v) this.f293105a).f293800j.mo94778d(Long.valueOf(pVar.f63472a.getLong("timestamp")).longValue());
            } else if (str.equals("reportViews_long_com.google.common.collect.ImmutableList<com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.VisualElementBoundsParcelable>")) {
                ((C105305v) this.f293105a).f293800j.mo94775a(Long.valueOf(pVar.f63472a.getLong("timestamp")).longValue(), (C58485gu) new ImmutableListUtils(C105136g.f293104a).mo28733b("visualElementBounds", pVar));
            }
        }
    }
}
