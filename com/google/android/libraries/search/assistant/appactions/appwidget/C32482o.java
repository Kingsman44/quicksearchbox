package com.google.android.libraries.search.assistant.appactions.appwidget;

import android.appwidget.AppWidgetHost;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.util.SizeF;
import com.evernote.android.state.BuildConfig;
import com.google.assistant.p3931f.p3939c.C52817ag;
import com.google.assistant.p3931f.p3939c.C52818ah;
import com.google.assistant.p3931f.p3939c.C52842s;
import com.google.assistant.p3931f.p3939c.C52845v;
import com.google.assistant.p3931f.p3939c.C52846w;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.ArrayList;
import p3186j$.util.function.Function;

/* renamed from: com.google.android.libraries.search.assistant.appactions.appwidget.o */
/* compiled from: PG */
public final class C32482o implements C32481n {

    /* renamed from: b */
    private static final C59071e f87045b = C59071e.m91332i("com.google.android.libraries.search.assistant.appactions.appwidget.o");

    /* renamed from: a */
    public final Function f87046a;

    /* renamed from: c */
    private final Context f87047c;

    /* renamed from: d */
    private final AppWidgetManager f87048d;

    public C32482o(Context context, Function function, AppWidgetManager appWidgetManager) {
        this.f87047c = context;
        this.f87048d = appWidgetManager;
        this.f87046a = function;
    }

    /* renamed from: d */
    private final C32468a m60283d(AppWidgetHost appWidgetHost, int i, C32473f fVar, C32470c cVar, AppWidgetProviderInfo appWidgetProviderInfo) {
        Bundle bundle;
        C52846w c = fVar.mo38095c();
        if (c == null || c.f138655a.isEmpty()) {
            bundle = new Bundle();
        } else {
            bundle = new Bundle();
            C52845v vVar = (C52845v) c.f138655a.get(0);
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
                        int i2 = ahVar.f138579b;
                        int a = C52817ag.m86714a(i2);
                        int i3 = a - 1;
                        if (a == 0) {
                            throw null;
                        } else if (i3 == 0) {
                            bundle2.putString(str, i2 == 2 ? (String) ahVar.f138580c : BuildConfig.FLAVOR);
                        }
                    }
                }
            }
            bundle.putBundle("com.google.assistant.appactions.widgets.APP_ACTIONS_PARAMS", bundle2);
        }
        m60284e(bundle, cVar, appWidgetProviderInfo);
        ComponentName a2 = fVar.mo38093a();
        if (a2 == null) {
            return new C32468a(3, (C32474g) null);
        }
        if (fVar.mo38096d() != null) {
            bundle.putBinder("appActionsWidgetExtensionSender", new C32471d(fVar));
        }
        if (this.f87048d.bindAppWidgetIdIfAllowed(i, a2, bundle)) {
            return C32468a.m60260a(new C32474g(appWidgetHost, i, appWidgetProviderInfo, cVar));
        }
        ((C59052c) ((C59052c) f87045b.mo56226d()).mo56372aa(50553)).mo56359L("Bind appWidgetId %d not allowed for %s:%s", Integer.valueOf(i), a2.getPackageName(), a2.getClassName());
        return new C32468a(5, (C32474g) null);
    }

    /* renamed from: e */
    private static void m60284e(Bundle bundle, C32470c cVar, AppWidgetProviderInfo appWidgetProviderInfo) {
        float f;
        SizeF a = cVar.mo38086a(appWidgetProviderInfo);
        Rect rect = cVar.f87012a;
        int i = rect.left + rect.right;
        int max = (int) Math.max(0.0f, a.getHeight() - ((float) (rect.top + rect.bottom)));
        if ((appWidgetProviderInfo.resizeMode & 1) == 0) {
            f = Math.max(0.0f, a.getWidth() - ((float) i));
        } else {
            f = Math.max(0.0f, cVar.f87013b - ((float) i));
        }
        int i2 = (int) f;
        bundle.putInt("appWidgetMaxHeight", max);
        bundle.putInt("appWidgetMinHeight", max);
        bundle.putInt("appWidgetMaxWidth", i2);
        bundle.putInt("appWidgetMinWidth", i2);
        if (Build.VERSION.SDK_INT >= 31) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(new SizeF((float) i2, (float) max));
            bundle.putParcelableArrayList("appWidgetSizes", arrayList);
        }
    }

    /* renamed from: a */
    public final String mo38105a(String str) {
        ApplicationInfo applicationInfo;
        PackageManager packageManager = this.f87047c.getPackageManager();
        try {
            applicationInfo = packageManager.getApplicationInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            ((C59052c) ((C59052c) ((C59052c) f87045b.mo56226d()).mo56382g(e)).mo56372aa(50554)).mo56389s("Could not find application label for widget provider package %s", str);
            applicationInfo = null;
        }
        if (applicationInfo != null) {
            return packageManager.getApplicationLabel(applicationInfo).toString();
        }
        return null;
    }

    /* renamed from: b */
    public final C32468a mo38106b(AppWidgetHost appWidgetHost, int i, C32470c cVar) {
        AppWidgetProviderInfo appWidgetInfo = this.f87048d.getAppWidgetInfo(i);
        if (appWidgetInfo == null) {
            return new C32468a(6, (C32474g) null);
        }
        Bundle appWidgetOptions = this.f87048d.getAppWidgetOptions(i);
        m60284e(appWidgetOptions, cVar, appWidgetInfo);
        this.f87048d.updateAppWidgetOptions(i, appWidgetOptions);
        return C32468a.m60260a(new C32474g(appWidgetHost, i, this.f87048d.getAppWidgetInfo(i), cVar));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0096, code lost:
        r5 = r1;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.libraries.search.assistant.appactions.appwidget.C32468a mo38107c(android.appwidget.AppWidgetHost r8, int r9, com.google.android.libraries.search.assistant.appactions.appwidget.C32473f r10, com.google.android.libraries.search.assistant.appactions.appwidget.C32470c r11) {
        /*
            r7 = this;
            android.content.ComponentName r0 = r10.mo38093a()
            r1 = 3
            r2 = 0
            if (r0 == 0) goto L_0x003f
            android.appwidget.AppWidgetManager r0 = r7.f87048d
            java.lang.String r3 = r10.mo38097e()
            java.util.List r0 = r0.getInstalledProvidersForPackage(r3, r2)
            java.util.Iterator r0 = r0.iterator()
        L_0x0016:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x0039
            java.lang.Object r3 = r0.next()
            r5 = r3
            android.appwidget.AppWidgetProviderInfo r5 = (android.appwidget.AppWidgetProviderInfo) r5
            android.content.ComponentName r3 = r5.provider
            android.content.ComponentName r4 = r10.mo38093a()
            boolean r3 = r3.equals(r4)
            if (r3 == 0) goto L_0x0016
            r0 = r7
            r1 = r8
            r2 = r9
            r3 = r10
            r4 = r11
            com.google.android.libraries.search.assistant.appactions.appwidget.a r0 = r0.m60283d(r1, r2, r3, r4, r5)
            goto L_0x003e
        L_0x0039:
            com.google.android.libraries.search.assistant.appactions.appwidget.a r0 = new com.google.android.libraries.search.assistant.appactions.appwidget.a
            r0.<init>(r1, r2)
        L_0x003e:
            return r0
        L_0x003f:
            java.lang.String r0 = r10.mo38097e()
            if (r0 == 0) goto L_0x00ca
            android.appwidget.AppWidgetManager r0 = r7.f87048d
            java.lang.String r3 = r10.mo38097e()
            java.util.List r0 = r0.getInstalledProvidersForPackage(r3, r2)
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L_0x006d
            com.google.common.f.e r0 = f87045b
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r3 = r10.mo38097e()
            r4 = 50552(0xc578, float:7.0838E-41)
            java.lang.String r5 = "No widget providers found for %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r4)).mo56389s(r5, r3)
            com.google.android.libraries.search.assistant.appactions.appwidget.a r0 = new com.google.android.libraries.search.assistant.appactions.appwidget.a
            r0.<init>(r1, r2)
            goto L_0x00c9
        L_0x006d:
            java.util.Iterator r0 = r0.iterator()
        L_0x0071:
            boolean r1 = r0.hasNext()
            if (r1 == 0) goto L_0x0098
            java.lang.Object r1 = r0.next()
            android.appwidget.AppWidgetProviderInfo r1 = (android.appwidget.AppWidgetProviderInfo) r1
            int r3 = r1.widgetFeatures
            int r4 = android.os.Build.VERSION.SDK_INT
            r5 = 31
            r6 = 1
            if (r4 < r5) goto L_0x008a
            r4 = r3 & 4
            if (r4 != 0) goto L_0x0090
        L_0x008a:
            r3 = r3 & 1
            if (r3 == 0) goto L_0x008f
            goto L_0x0090
        L_0x008f:
            r6 = 0
        L_0x0090:
            android.content.ComponentName r3 = r1.configure
            if (r3 == 0) goto L_0x0096
            if (r6 == 0) goto L_0x0071
        L_0x0096:
            r5 = r1
            goto L_0x0099
        L_0x0098:
            r5 = r2
        L_0x0099:
            if (r5 != 0) goto L_0x00b4
            com.google.common.f.e r0 = f87045b
            com.google.common.f.x r0 = r0.mo56226d()
            java.lang.String r1 = r10.mo38097e()
            r3 = 50551(0xc577, float:7.0837E-41)
            java.lang.String r4 = "No widget providers found without a configuration activity for %s"
            ((com.google.common.p4526f.C59052c) ((com.google.common.p4526f.C59052c) r0).mo56372aa(r3)).mo56389s(r4, r1)
            com.google.android.libraries.search.assistant.appactions.appwidget.a r0 = new com.google.android.libraries.search.assistant.appactions.appwidget.a
            r1 = 4
            r0.<init>(r1, r2)
            goto L_0x00c9
        L_0x00b4:
            com.google.android.libraries.search.assistant.appactions.appwidget.e r0 = r10.mo38094b()
            android.content.ComponentName r1 = r5.provider
            r0.mo38091e(r1)
            com.google.android.libraries.search.assistant.appactions.appwidget.f r3 = r0.mo38088b()
            r0 = r7
            r1 = r8
            r2 = r9
            r4 = r11
            com.google.android.libraries.search.assistant.appactions.appwidget.a r0 = r0.m60283d(r1, r2, r3, r4, r5)
        L_0x00c9:
            return r0
        L_0x00ca:
            com.google.android.libraries.search.assistant.appactions.appwidget.a r0 = new com.google.android.libraries.search.assistant.appactions.appwidget.a
            r0.<init>(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.search.assistant.appactions.appwidget.C32482o.mo38107c(android.appwidget.AppWidgetHost, int, com.google.android.libraries.search.assistant.appactions.appwidget.f, com.google.android.libraries.search.assistant.appactions.appwidget.c):com.google.android.libraries.search.assistant.appactions.appwidget.a");
    }
}
