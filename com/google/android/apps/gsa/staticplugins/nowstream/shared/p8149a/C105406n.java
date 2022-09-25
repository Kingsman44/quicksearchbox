package com.google.android.apps.gsa.staticplugins.nowstream.shared.p8149a;

import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.libraries.gsa.monet.shared.C23113i;
import com.google.android.libraries.gsa.monet.shared.C23120p;
import com.google.android.libraries.gsa.monet.shared.ProtoParcelable;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.C23269n;
import com.google.android.libraries.gsa.monet.tools.model.shared.types.ImmutableListUtils;
import com.google.common.p4522b.C58485gu;

/* renamed from: com.google.android.apps.gsa.staticplugins.nowstream.shared.a.n */
/* compiled from: PG */
public final class C105406n implements C23113i {

    /* renamed from: a */
    private final C105403k f294027a;

    public C105406n(C105403k kVar) {
        this.f294027a = kVar;
    }

    /* renamed from: a */
    public final void mo28561a(String str, String str2, Parcelable parcelable) {
        if ("MainFeedRecyclerViewEventsDispatcher".equals(str2) && (parcelable instanceof Bundle)) {
            C23120p pVar = new C23120p((Bundle) parcelable);
            if (str.equals("onNewContentButtonClickedEvent")) {
                this.f294027a.mo94662o();
            } else if (str.equals("onPullToRefreshEntries")) {
                this.f294027a.mo94582a();
            } else if (str.equals("onRenderComplete_boolean")) {
                this.f294027a.mo94583b(Boolean.valueOf(pVar.f63472a.getBoolean("scrolledToTarget")).booleanValue());
            } else if (str.equals("onScrollPositionUpdated_int_int_boolean")) {
                this.f294027a.mo94584c(Integer.valueOf(pVar.f63472a.getInt("streamPosition")).intValue(), Integer.valueOf(pVar.f63472a.getInt("streamOffset")).intValue(), Boolean.valueOf(pVar.f63472a.getBoolean("jumpToTop")).booleanValue());
            } else if (str.equals("reportViewHorizontallyScrolled_com.google.android.libraries.gsa.monet.shared.ProtoParcelable_int_long")) {
                int intValue = Integer.valueOf(pVar.f63472a.getInt("scrollAmount")).intValue();
                long longValue = Long.valueOf(pVar.f63472a.getLong("timestamp")).longValue();
                this.f294027a.mo94585d((ProtoParcelable) new C23269n().mo28733b("veInfo", pVar), intValue, longValue);
            } else if (str.equals("reportViewport_android.graphics.Rect_long")) {
                long longValue2 = Long.valueOf(pVar.f63472a.getLong("timestamp")).longValue();
                this.f294027a.mo94587je((Rect) new C23269n().mo28733b("bounds", pVar), longValue2);
            } else if (str.equals("reportViewportHidden_long")) {
                this.f294027a.mo94588jf(Long.valueOf(pVar.f63472a.getLong("timestamp")).longValue());
            } else if (str.equals("reportViews_long_com.google.common.collect.ImmutableList<com.google.android.apps.gsa.sidekick.shared.monet.visualelementslogger.VisualElementBoundsParcelable>")) {
                this.f294027a.mo94586g(Long.valueOf(pVar.f63472a.getLong("timestamp")).longValue(), (C58485gu) new ImmutableListUtils(C105405m.f294026a).mo28733b("visualElementBounds", pVar));
            }
        }
    }
}
