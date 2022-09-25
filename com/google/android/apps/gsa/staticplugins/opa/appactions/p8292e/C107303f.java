package com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e;

import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProviderInfo;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.UserHandle;
import com.google.android.apps.search.assistant.platform.p9139g.p9140a.C120924at;
import com.google.assistant.p3931f.p3942e.p3943a.C52922b;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.p4526f.C59052c;
import com.google.protos.p4985f.p5042u.C65358t;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.e.f */
/* compiled from: PG */
final class C107303f implements ServiceConnection {

    /* renamed from: a */
    final /* synthetic */ C65358t f298629a;

    /* renamed from: b */
    final /* synthetic */ String f298630b;

    /* renamed from: c */
    final /* synthetic */ C107304g f298631c;

    /* renamed from: d */
    private C52922b f298632d;

    public C107303f(C107304g gVar, C65358t tVar, String str) {
        this.f298631c = gVar;
        this.f298629a = tVar;
        this.f298630b = str;
    }

    public final void onBindingDied(ComponentName componentName) {
        this.f298631c.f298634b.unbindService(this);
    }

    public final void onNullBinding(ComponentName componentName) {
        ((C59052c) ((C59052c) C107304g.f298633a.mo56226d()).mo56372aa(23564)).mo56386p("Service returned null");
        this.f298631c.mo95904a();
        this.f298631c.f298634b.unbindService(this);
    }

    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        C52922b bVar;
        C58833ax axVar;
        AppWidgetProviderInfo appWidgetProviderInfo = null;
        if (iBinder == null) {
            bVar = null;
        } else {
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.assistant.appactions.widgets.pinappwidget.IPinAppWidgetProxy");
            bVar = queryLocalInterface instanceof C52922b ? (C52922b) queryLocalInterface : new C52922b(iBinder);
        }
        this.f298632d = bVar;
        C107304g gVar = this.f298631c;
        C65358t tVar = this.f298629a;
        String str = this.f298630b;
        AppWidgetManager instance = AppWidgetManager.getInstance(gVar.f298634b);
        C120924at atVar = new C120924at(gVar.f298634b);
        if (!tVar.f177750b.isEmpty()) {
            gVar.mo95905b(new ComponentName(str, tVar.f177750b), Bundle.EMPTY, bVar);
        } else {
            int length = atVar.getAppWidgetIds().length;
            if (length == 0) {
                List<AppWidgetProviderInfo> installedProvidersForPackage = instance.getInstalledProvidersForPackage(str, (UserHandle) null);
                if (installedProvidersForPackage.isEmpty()) {
                    axVar = C58836b.f156633a;
                } else {
                    Iterator<AppWidgetProviderInfo> it = installedProvidersForPackage.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        AppWidgetProviderInfo next = it.next();
                        if (next.configure == null) {
                            appWidgetProviderInfo = next;
                            break;
                        }
                    }
                    if (appWidgetProviderInfo == null) {
                        axVar = C58836b.f156633a;
                    } else {
                        axVar = C58833ax.m90834k(appWidgetProviderInfo.provider);
                    }
                }
                if (axVar.mo56113h()) {
                    gVar.mo95905b((ComponentName) axVar.mo56107c(), Bundle.EMPTY, bVar);
                } else {
                    gVar.mo95904a();
                }
            } else {
                gVar.mo95905b(instance.getAppWidgetInfo(atVar.getAppWidgetIds()[length - 1]).provider, Bundle.EMPTY, bVar);
            }
        }
        this.f298631c.f298634b.unbindService(this);
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        this.f298631c.f298634b.unbindService(this);
    }
}
