package com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1321e;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.UserHandle;
import android.util.SizeF;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.FrameLayout;
import com.evernote.android.state.BuildConfig;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.tng.assistant.p877d.p878a.p879a.C12991i;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16777c;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.C16782d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16753c;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1318b.C16754d;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16788f;
import com.google.android.libraries.assistant.auto.tng.p1309ui.voiceplate.p1320d.C16789g;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.material.p3505b.C44534d;
import com.google.assistant.p3931f.p3939c.C52817ag;
import com.google.assistant.p3931f.p3939c.C52818ah;
import com.google.assistant.p3931f.p3939c.C52842s;
import com.google.assistant.p3931f.p3939c.C52845v;
import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62971cq;
import java.util.Iterator;
import p3186j$.util.Optional;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.a */
/* compiled from: PG */
public final class C16791a {

    /* renamed from: b */
    private static final C59071e f49133b = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.ui.voiceplate.e.a");

    /* renamed from: a */
    public C16801aj f49134a;

    /* renamed from: c */
    private final View f49135c;

    /* renamed from: d */
    private final C16802ak f49136d;

    /* renamed from: e */
    private final Optional f49137e;

    public C16791a(View view, Optional optional, C16802ak akVar) {
        this.f49135c = view;
        this.f49137e = optional;
        this.f49136d = akVar;
    }

    /* renamed from: a */
    public final void mo23017a(C16754d dVar, C12991i iVar) {
        boolean z;
        int i;
        int i2;
        int i3;
        int i4;
        AppWidgetProviderInfo next;
        C16754d dVar2 = dVar;
        if (!dVar2.f49026b) {
            return;
        }
        if ((dVar2.f49025a & 8) != 0) {
            if (this.f49134a == null) {
                C16802ak akVar = this.f49136d;
                View view = this.f49135c;
                Optional optional = this.f49137e;
                C16782d dVar3 = (C16782d) akVar.f49203a.mo17428b();
                dVar3.getClass();
                AppWidgetManager appWidgetManager = (AppWidgetManager) akVar.f49204b.mo17428b();
                appWidgetManager.getClass();
                view.getClass();
                optional.getClass();
                this.f49134a = new C16801aj(dVar3, appWidgetManager, view, optional);
            }
            C16801aj ajVar = this.f49134a;
            if (ajVar.f49197g == null) {
                ajVar.f49197g = (ViewGroup) ((ViewStub) ajVar.f49192b.findViewById(R.id.app_actions_view_stub)).inflate().findViewById(R.id.app_actions_view);
            }
            if (ajVar.f49198h == null) {
                ajVar.f49198h = new C16799ah(ajVar.f49192b.getContext());
            }
            ajVar.mo23027b();
            Context context = ajVar.f49192b.getContext();
            int i5 = 1;
            if (!ajVar.f49200j) {
                ajVar.f49198h.startListening();
                ajVar.f49200j = true;
            }
            int allocateAppWidgetId = ajVar.f49198h.allocateAppWidgetId();
            ajVar.f49199i = allocateAppWidgetId;
            AppWidgetManager appWidgetManager2 = ajVar.f49194d;
            C16753c cVar = dVar2.f49027c;
            if (cVar == null) {
                cVar = C16753c.f49018d;
            }
            if (cVar.f49022c.isEmpty()) {
                C16753c cVar2 = dVar2.f49027c;
                if (cVar2 == null) {
                    cVar2 = C16753c.f49018d;
                }
                String str = cVar2.f49021b;
                Iterator<AppWidgetProviderInfo> it = appWidgetManager2.getInstalledProvidersForPackage(str, (UserHandle) null).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        ((C59052c) ((C59052c) C16801aj.f49191a.mo56226d()).mo56372aa(46916)).mo56389s("No widget providers found without a configuration activity for %s", str);
                        z = false;
                        break;
                    }
                    next = it.next();
                    int i6 = next.widgetFeatures;
                    int i7 = i6 & 1;
                    if (Build.VERSION.SDK_INT >= 31) {
                        i7 = (i7 == 0 && (i6 & 4) == 0) ? 0 : 1;
                    }
                    if (next.configure != null) {
                        if (i7 != 0) {
                            break;
                        }
                    } else {
                        break;
                    }
                }
                z = appWidgetManager2.bindAppWidgetIdIfAllowed(allocateAppWidgetId, next.provider, ajVar.mo23026a());
            } else {
                C16753c cVar3 = dVar2.f49027c;
                String str2 = (cVar3 == null ? C16753c.f49018d : cVar3).f49021b;
                if (cVar3 == null) {
                    cVar3 = C16753c.f49018d;
                }
                ComponentName componentName = new ComponentName(str2, cVar3.f49022c);
                Bundle a = ajVar.mo23026a();
                C52846w wVar = dVar2.f49028d;
                if (wVar == null) {
                    wVar = C52846w.f138653b;
                }
                if (!wVar.f138655a.isEmpty()) {
                    C52845v vVar = (C52845v) wVar.f138655a.get(0);
                    a.putString("com.google.assistant.appactions.widgets.APP_ACTIONS_BII", vVar.f138650a);
                    a.putString("com.google.assistant.appactions.widgets.APP_ACTIONS_IDENTIFIER", vVar.f138651b);
                    C62971cq cqVar = vVar.f138652c;
                    Bundle bundle = new Bundle();
                    Iterator it2 = cqVar.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        C52842s sVar = (C52842s) it2.next();
                        String str3 = sVar.f138642a;
                        if (!sVar.f138643b.isEmpty()) {
                            C52818ah ahVar = (C52818ah) sVar.f138643b.get(0);
                            if ((ahVar.f138578a & i5) != 0) {
                                bundle.putString(str3, ahVar.f138581d);
                                break;
                            }
                            int i8 = ahVar.f138579b;
                            int a2 = C52817ag.m86714a(i8);
                            int i9 = a2 - 1;
                            if (a2 == 0) {
                                throw null;
                            } else if (i9 == 0) {
                                bundle.putString(str3, i8 == 2 ? (String) ahVar.f138580c : BuildConfig.FLAVOR);
                            } else if (i9 != 5) {
                                ((C59052c) ((C59052c) C16801aj.f49191a.mo56226d()).mo56372aa(46911)).mo56389s("Received a param with not supported value %s", str3);
                            } else {
                                ((C59052c) ((C59052c) C16801aj.f49191a.mo56226d()).mo56372aa(46912)).mo56389s("Received a param with no value for name %s", str3);
                            }
                        }
                        i5 = 1;
                    }
                    a.putBundle("com.google.assistant.appactions.widgets.APP_ACTIONS_PARAMS", bundle);
                }
                z = appWidgetManager2.bindAppWidgetIdIfAllowed(allocateAppWidgetId, componentName, a);
            }
            if (!z) {
                C59052c cVar4 = (C59052c) ((C59052c) C16801aj.f49191a.mo56225c()).mo56372aa(46914);
                C16753c cVar5 = dVar2.f49027c;
                String str4 = (cVar5 == null ? C16753c.f49018d : cVar5).f49021b;
                if (cVar5 == null) {
                    cVar5 = C16753c.f49018d;
                }
                cVar4.mo56354G("no permission to bind to widget: package=%s, class=%s", str4, cVar5.f49022c);
                return;
            }
            AppWidgetProviderInfo appWidgetInfo = AppWidgetManager.getInstance(context).getAppWidgetInfo(ajVar.f49199i);
            C16799ah ahVar2 = ajVar.f49198h;
            Context context2 = ajVar.f49192b.getContext();
            Context createConfigurationContext = context2.createConfigurationContext(context2.getResources().getConfiguration());
            C69664n.m101061g(createConfigurationContext, "<this>");
            Context c = C44534d.m78716c(new ContextThemeWrapper(createConfigurationContext, 2132150622));
            C69664n.m101060f(c, "wrapContextIfAvailable(C…le.Theme_Assistant_Next))");
            C16800ai aiVar = (C16800ai) ahVar2.createView(c, ajVar.f49199i, appWidgetInfo);
            aiVar.f49190a = new C16797af(ajVar, dVar2, iVar);
            aiVar.setPadding(0, 0, 0, 0);
            ViewGroup viewGroup = ajVar.f49197g;
            C16789g gVar = ajVar.f49195e;
            int b = gVar.mo23013b();
            int a3 = ajVar.f49195e.mo23012a();
            int i10 = appWidgetInfo.minWidth;
            int i11 = appWidgetInfo.minHeight;
            int i12 = appWidgetInfo.resizeMode;
            int i13 = appWidgetInfo.minResizeWidth;
            int i14 = appWidgetInfo.minResizeHeight;
            if (Build.VERSION.SDK_INT >= 31) {
                int i15 = appWidgetInfo.maxResizeWidth;
                int i16 = appWidgetInfo.maxResizeHeight;
            }
            if ((appWidgetInfo.resizeMode & 1) == 0) {
                i = appWidgetInfo.minWidth;
            } else {
                i = Math.min(appWidgetInfo.minResizeWidth, appWidgetInfo.minWidth);
            }
            int c2 = i + gVar.mo23014c(30.0f);
            if ((appWidgetInfo.resizeMode & 1) == 0) {
                i2 = appWidgetInfo.minWidth;
            } else if (Build.VERSION.SDK_INT < 31) {
                i2 = appWidgetInfo.minWidth;
            } else {
                i2 = Math.max(appWidgetInfo.maxResizeWidth, appWidgetInfo.minWidth);
            }
            int c3 = i2 + gVar.mo23014c(30.0f);
            if ((appWidgetInfo.resizeMode & 2) == 0) {
                i3 = appWidgetInfo.minHeight;
            } else {
                i3 = Math.min(appWidgetInfo.minResizeHeight, appWidgetInfo.minHeight);
            }
            int c4 = i3 + gVar.mo23014c(30.0f);
            if ((2 & appWidgetInfo.resizeMode) == 0) {
                i4 = appWidgetInfo.minHeight;
            } else if (Build.VERSION.SDK_INT < 31) {
                i4 = appWidgetInfo.minHeight;
            } else {
                i4 = Math.max(appWidgetInfo.maxResizeHeight, appWidgetInfo.minHeight);
            }
            int c5 = gVar.mo23014c(30.0f);
            int max = Math.max(C16789g.m33820e(b, c2, c3), gVar.mo23014c(200.0f));
            int max2 = Math.max(C16789g.m33820e(a3, c4, i4 + c5), gVar.mo23014c(100.0f));
            double d = (double) b;
            double d2 = (double) max;
            Double.isNaN(d);
            Double.isNaN(d2);
            double d3 = d / d2;
            double d4 = (double) a3;
            double d5 = (double) max2;
            Double.isNaN(d4);
            Double.isNaN(d5);
            C16788f fVar = new C16788f(Math.min(2.0d, Math.min(d3, d4 / d5)), max, max2);
            if (Build.VERSION.SDK_INT >= 31) {
                aiVar.updateAppWidgetSize(new Bundle(), C58485gu.m89846n(new SizeF((float) fVar.f49124b, (float) fVar.f49125c)));
            } else {
                Bundle bundle2 = new Bundle();
                int i17 = fVar.f49124b;
                int i18 = fVar.f49125c;
                aiVar.updateAppWidgetSize(bundle2, i17, i18, i17, i18);
            }
            int b2 = ajVar.f49195e.mo23013b();
            double d6 = (double) fVar.f49125c;
            double d7 = fVar.f49123a;
            Double.isNaN(d6);
            int i19 = (int) (d6 * d7);
            ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
            if (layoutParams == null) {
                ((C59052c) ((C59052c) C16801aj.f49191a.mo56225c()).mo56372aa(46915)).mo56386p("unexpected case: this view is not attached to a parent ViewGroup");
            } else {
                layoutParams.width = b2;
                layoutParams.height = i19;
                viewGroup.setLayoutParams(layoutParams);
            }
            float f = (float) fVar.f49123a;
            aiVar.setScaleX(f);
            aiVar.setScaleY(f);
            viewGroup.addView(aiVar, new FrameLayout.LayoutParams(fVar.f49124b, fVar.f49125c, 17));
            if (ajVar.f49196f.isPresent()) {
                ((C16777c) ajVar.f49196f.get()).mo22959c().mo33801b(viewGroup, ((C16777c) ajVar.f49196f.get()).mo22960d().mo33805a(C28427h.m53115a(150266)));
            }
            ajVar.f49197g.setVisibility(0);
            return;
        }
        ((C59052c) ((C59052c) f49133b.mo56225c()).mo56372aa(46858)).mo56386p("component missing for widget");
    }
}
