package com.google.android.apps.gsa.staticplugins.searchwidget.p8750a.p8754d;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.p033v7.app.C0391l;
import android.view.View;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import com.google.android.googlequicksearchbox.R;

/* renamed from: com.google.android.apps.gsa.staticplugins.searchwidget.a.d.aj */
/* compiled from: PG */
public final /* synthetic */ class C117109aj implements AdapterView.OnItemClickListener {

    /* renamed from: a */
    public final /* synthetic */ C117114ao f325119a;

    public /* synthetic */ C117109aj(C117114ao aoVar) {
        this.f325119a = aoVar;
    }

    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C117114ao aoVar = this.f325119a;
        C117112am a = aoVar.f325135d.getItem(i);
        if (a == C117112am.CUSTOMIZE) {
            Bundle bundle = new Bundle();
            bundle.putInt("WIDGET_BOUNDS_TOP", aoVar.f325133b.top);
            bundle.putInt("WIDGET_BOUNDS_BOTTOM", aoVar.f325133b.bottom);
            bundle.putInt("WIDGET_BOUNDS_LEFT", aoVar.f325133b.left);
            bundle.putInt("WIDGET_BOUNDS_RIGHT", aoVar.f325133b.right);
            aoVar.f63126Q.mo28345s("CUSTOMIZE", "CUSTOMIZE", bundle);
        } else if (a == C117112am.RESET_TO_DEFAULT_STYLE) {
            PopupWindow popupWindow = aoVar.f325136e;
            if (popupWindow != null) {
                popupWindow.setOnDismissListener((PopupWindow.OnDismissListener) null);
            }
            C0391l lVar = new C0391l(aoVar.f325132a);
            lVar.mo1307l(R.string.reset_to_default_style_alert_title_text);
            lVar.mo1300f(R.string.reset_to_default_style_alert_content_text);
            lVar.setPositiveButton(R.string.reset_to_default_style_alert_affirmative_action_text, new C117107ah(aoVar));
            C0391l negativeButton = lVar.setNegativeButton(R.string.reset_to_default_style_alert_dismiss_action_text, (DialogInterface.OnClickListener) null);
            negativeButton.mo1305j(new C117108ai(aoVar));
            aoVar.f325137f = negativeButton.create();
            Window window = aoVar.f325137f.getWindow();
            window.getClass();
            window.addFlags(2);
            window.setDimAmount(0.5f);
            aoVar.f325137f.show();
        } else if (a == C117112am.SEND_FEEDBACK) {
            aoVar.f63126Q.mo28345s("FEEDBACK", "FEEDBACK", new Bundle());
        }
        PopupWindow popupWindow2 = aoVar.f325136e;
        if (popupWindow2 != null) {
            popupWindow2.dismiss();
        }
    }
}
