package com.google.android.apps.gsa.staticplugins.images.viewer.p8017ui;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.widget.PopupMenu;
import com.google.android.apps.gsa.shared.p7129r.C90461c;
import com.google.android.apps.gsa.shared.util.DummyParcelable;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102288a;
import com.google.android.apps.gsa.staticplugins.images.viewer.p8016b.C102289b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.monet.shared.LazyParcelable;

/* renamed from: com.google.android.apps.gsa.staticplugins.images.viewer.ui.f */
/* compiled from: PG */
public final /* synthetic */ class C102364f implements PopupMenu.OnMenuItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ DetailsView f285664a;

    public /* synthetic */ C102364f(DetailsView detailsView) {
        this.f285664a = detailsView;
    }

    public final boolean onMenuItemClick(MenuItem menuItem) {
        DetailsView detailsView = this.f285664a;
        int itemId = menuItem.getItemId();
        if (itemId == R.id.image_viewer_menu_view_saved) {
            C102374p pVar = detailsView.f285431k;
            if (!pVar.mo93176g()) {
                return true;
            }
            C102288a aVar = pVar.f285679a;
            ((C102289b) aVar).f285407a.mo28345s("viewSaved", "ImagePageEventsDispatcher", new Bundle());
            return true;
        } else if (itemId == R.id.image_viewer_menu_get_help) {
            detailsView.f285431k.mo93173d("https://support.google.com/websearch/?p=m_ws_serp_gethelp");
            return true;
        } else if (itemId != R.id.image_viewer_menu_send_feedback) {
            return false;
        } else {
            C102374p pVar2 = detailsView.f285431k;
            if (!pVar2.mo93176g()) {
                return true;
            }
            C102288a aVar2 = pVar2.f285679a;
            C90461c cVar = new C90461c();
            cVar.f252689a = pVar2.f285682d;
            DummyParcelable dummyParcelable = new DummyParcelable(cVar);
            Bundle bundle = new Bundle();
            bundle.putParcelable("feedbackDataParcel", new LazyParcelable((Parcelable) dummyParcelable));
            ((C102289b) aVar2).f285407a.mo28345s("sendFeedback_com.google.android.apps.gsa.shared.util.DummyParcelable<com.google.android.apps.gsa.shared.feedback.FeedbackDataBuilder>", "ImagePageEventsDispatcher", bundle);
            return true;
        }
    }
}
