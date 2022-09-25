package com.google.android.apps.search.assistant.platform.p9139g.p9140a;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;
import android.view.ViewGroup;
import androidx.core.p094f.C1888a;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3931f.p3939c.C52817ag;
import com.google.assistant.p3931f.p3939c.C52818ah;
import com.google.assistant.p3931f.p3939c.C52842s;
import com.google.assistant.p3931f.p3939c.C52845v;
import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;

/* renamed from: com.google.android.apps.search.assistant.platform.g.a.aw */
/* compiled from: PG */
public final class C120927aw {

    /* renamed from: a */
    public static final C59071e f336217a = C59071e.m91332i("com.google.android.apps.search.assistant.platform.g.a.aw");

    /* renamed from: a */
    public static C120923as m200159a(AppWidgetManager appWidgetManager, C120921aq aqVar, ViewGroup viewGroup, C120919ao aoVar, AppWidgetProviderInfo appWidgetProviderInfo) {
        Bundle bundle;
        float f;
        C120919ao aoVar2 = aoVar;
        AppWidgetProviderInfo appWidgetProviderInfo2 = appWidgetProviderInfo;
        C120924at e = aqVar.mo104983e();
        Context b = aqVar.mo104981b();
        int allocateAppWidgetId = e.allocateAppWidgetId();
        C52846w f2 = aqVar.mo104984f();
        if (f2 == null || f2.f138655a.isEmpty()) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle();
            C52845v vVar = (C52845v) f2.f138655a.get(0);
            bundle.putString("com.google.assistant.appactions.widgets.APP_ACTIONS_BII", vVar.f138650a);
            bundle.putString("com.google.assistant.appactions.widgets.APP_ACTIONS_IDENTIFIER", vVar.f138651b);
            Bundle bundle2 = new Bundle();
            for (C52842s sVar : vVar.f138652c) {
                String str = sVar.f138642a;
                if (!sVar.f138643b.isEmpty()) {
                    C52818ah ahVar = (C52818ah) sVar.f138643b.get(0);
                    if ((ahVar.f138578a & 1) != 0) {
                        bundle2.putString(str, ahVar.f138581d);
                    } else {
                        int i = ahVar.f138579b;
                        int a = C52817ag.m86714a(i);
                        int i2 = a - 1;
                        if (a == 0) {
                            throw null;
                        } else if (i2 == 0) {
                            bundle2.putString(str, i == 2 ? (String) ahVar.f138580c : BuildConfig.FLAVOR);
                        } else if (i2 != 5) {
                            ((C59052c) ((C59052c) f336217a.mo56226d()).mo56372aa(35654)).mo56389s("Received a param with not supported value %s", str);
                        } else {
                            ((C59052c) ((C59052c) f336217a.mo56226d()).mo56372aa(35655)).mo56389s("Received a param with no value for name %s", str);
                        }
                    }
                }
            }
            bundle.putBundle("com.google.assistant.appactions.widgets.APP_ACTIONS_PARAMS", bundle2);
        }
        SizeF c = aoVar.mo104964c(appWidgetProviderInfo);
        Rect rect = aoVar2.f336203a;
        int i3 = rect.left + rect.right;
        float height = c.getHeight() - ((float) (rect.top + rect.bottom));
        float f3 = 0.0f;
        int max = (int) Math.max(0.0f, height);
        if ((appWidgetProviderInfo2.resizeMode & 1) == 0) {
            f = Math.max(0.0f, c.getWidth() - ((float) i3));
        } else {
            f = Math.max(0.0f, aoVar2.f336204b - ((float) i3));
        }
        int i4 = (int) f;
        bundle.putInt("appWidgetMaxHeight", max);
        bundle.putInt("appWidgetMinHeight", max);
        bundle.putInt("appWidgetMaxWidth", i4);
        bundle.putInt("appWidgetMinWidth", i4);
        if (Build.VERSION.SDK_INT >= 31) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new SizeF((float) i4, (float) max));
            bundle.putParcelableArrayList("appWidgetSizes", arrayList);
        }
        C120922ar b2 = C120923as.m200152b();
        ComponentName a2 = aqVar.mo104980a();
        if (a2 == null) {
            ((C120930az) b2).f336241c = 3;
            return b2.mo104991a();
        }
        if (!aqVar.mo104989k()) {
            C120946bo boVar = new C120946bo(aqVar);
            bundle.putBinder("appActionsWidgetExtensionSender", boVar);
            ((C120930az) b2).f336240b = boVar;
        } else {
            C120921aq aqVar2 = aqVar;
        }
        if (appWidgetManager.bindAppWidgetIdIfAllowed(allocateAppWidgetId, a2, bundle)) {
            C120926av avVar = (C120926av) e.createView(b, allocateAppWidgetId, appWidgetProviderInfo2);
            if (Build.VERSION.SDK_INT >= 31 || aqVar.mo104988j()) {
                if (!C1888a.m5149c()) {
                    avVar.f336213a = C120937bf.m200199a(b);
                } else {
                    if (C1888a.m5149c()) {
                        f3 = Math.min(C120937bf.m200199a(b), b.getResources().getDimension(17104904));
                    }
                    avVar.f336213a = f3;
                }
            }
            viewGroup.removeAllViews();
            AppWidgetProviderInfo appWidgetInfo = avVar.getAppWidgetInfo();
            SizeF c2 = aoVar2.mo104964c(appWidgetInfo);
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, (int) C120919ao.m200120a(b, c2.getHeight()));
            if ((appWidgetInfo.resizeMode & 1) == 0) {
                layoutParams.width = (int) C120919ao.m200120a(b, c2.getWidth());
            }
            viewGroup.addView(avVar, layoutParams);
            e.startListening();
            b2.mo104992b(allocateAppWidgetId);
            C120930az azVar = (C120930az) b2;
            azVar.f336239a = e;
            azVar.f336241c = 1;
            return b2.mo104991a();
        }
        ((C59052c) ((C59052c) f336217a.mo56226d()).mo56372aa(35660)).mo56354G("Could not bind widget for component %s from %s", a2.getClassName(), a2.getPackageName());
        C120930az azVar2 = (C120930az) b2;
        azVar2.f336239a = e;
        b2.mo104992b(allocateAppWidgetId);
        azVar2.f336241c = 5;
        C120923as a3 = b2.mo104991a();
        a3.mo104996e();
        return a3;
    }
}
