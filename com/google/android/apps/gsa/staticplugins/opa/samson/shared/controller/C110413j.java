package com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller;

import android.app.NotificationChannel;
import android.graphics.PorterDuff;
import android.service.notification.StatusBarNotification;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.core.app.C1794ak;
import androidx.core.app.C1800aq;
import androidx.lifecycle.C2333ah;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110422i;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.shared.controller.j */
/* compiled from: PG */
public final /* synthetic */ class C110413j implements C2333ah {

    /* renamed from: a */
    public final /* synthetic */ C110415l f307747a;

    public /* synthetic */ C110413j(C110415l lVar) {
        this.f307747a = lVar;
    }

    /* renamed from: hX */
    public final void mo774hX(Object obj) {
        C110415l lVar = this.f307747a;
        C58485gu<StatusBarNotification> guVar = (C58485gu) obj;
        if (guVar != null) {
            if (lVar.f307756h <= 0) {
                C59104x c = C110415l.f307749a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OpaSysNotifCtrl");
                ((C59052c) ((C59052c) c).mo56372aa(25925)).mo56386p("maxNotificationCount should not be smaller than 1. Potential Server flag sync issue.");
                return;
            }
            lVar.f307753e.removeAllViewsInLayout();
            if (!guVar.isEmpty()) {
                ArrayList arrayList = new ArrayList();
                C1800aq aqVar = new C1800aq(lVar.f307751c);
                for (StatusBarNotification statusBarNotification : guVar) {
                    NotificationChannel a = C1794ak.m4938a(aqVar.f5622a, statusBarNotification.getNotification().getChannelId());
                    if (a == null) {
                        arrayList.add(statusBarNotification);
                    } else if (a.getImportance() != 1) {
                        arrayList.add(statusBarNotification);
                    } else {
                        C58976aa aaVar = C58975e.f156826a;
                        statusBarNotification.getGroupKey();
                    }
                }
                int size = arrayList.size();
                int i = 0;
                while (true) {
                    if (i >= size) {
                        break;
                    }
                    C58976aa aaVar2 = C58975e.f156826a;
                    ((StatusBarNotification) arrayList.get(i)).getGroupKey();
                    if (i == lVar.f307756h - 1) {
                        int i2 = lVar.f307754f;
                        C110422i iVar = new C110422i(lVar.f307750b, lVar.f307757i);
                        iVar.setLayoutParams(new ViewGroup.LayoutParams(i2, i2));
                        lVar.f307753e.addView(iVar);
                        break;
                    }
                    StatusBarNotification statusBarNotification2 = (StatusBarNotification) arrayList.get(i);
                    ImageView imageView = null;
                    if (!(statusBarNotification2 == null || statusBarNotification2.getNotification() == null || statusBarNotification2.getNotification().getSmallIcon() == null)) {
                        imageView = new ImageView(lVar.f307750b);
                        imageView.setImageIcon(statusBarNotification2.getNotification().getSmallIcon().setTintMode(PorterDuff.Mode.SRC_IN).setTint(lVar.f307757i));
                        imageView.setContentDescription(statusBarNotification2.getNotification().tickerText);
                        int i3 = lVar.f307754f;
                        imageView.setLayoutParams(new ViewGroup.LayoutParams(new ViewGroup.LayoutParams(i3, i3)));
                    }
                    if (imageView != null) {
                        lVar.f307753e.addView(imageView);
                        if (i < size - 1) {
                            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) imageView.getLayoutParams();
                            marginLayoutParams.setMargins(0, 0, lVar.f307755g, 0);
                            imageView.setLayoutParams(marginLayoutParams);
                        }
                    }
                    i++;
                }
                C110415l.m183877c(lVar.f307753e);
                return;
            }
            C110415l.m183876a(lVar.f307753e);
        }
    }
}
