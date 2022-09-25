package com.google.android.apps.gsa.staticplugins.opa.appactions.p8292e;

import android.content.ComponentName;
import android.content.Context;
import android.content.ServiceConnection;
import android.os.Bundle;
import android.os.RemoteException;
import android.widget.Toast;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3931f.p3942e.p3943a.C52921a;
import com.google.assistant.p3931f.p3942e.p3943a.C52922b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.appactions.e.g */
/* compiled from: PG */
public final class C107304g {

    /* renamed from: a */
    public static final C59071e f298633a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.appactions.e.g");

    /* renamed from: b */
    public final Context f298634b;

    /* renamed from: c */
    public ServiceConnection f298635c = null;

    /* renamed from: d */
    private final C52921a f298636d = new C107302e();

    public C107304g(Context context) {
        this.f298634b = context;
    }

    /* renamed from: a */
    public final void mo95904a() {
        Context context = this.f298634b;
        Toast.makeText(context, context.getResources().getString(R.string.opa_suggestion_pin_widget_failed), 0).show();
    }

    /* renamed from: b */
    public final void mo95905b(ComponentName componentName, Bundle bundle, C52922b bVar) {
        try {
            bVar.mo53947e(componentName, bundle, this.f298636d);
        } catch (RemoteException e) {
            ((C59052c) ((C59052c) ((C59052c) f298633a.mo56226d()).mo56382g(e)).mo56372aa(23570)).mo56386p("Unable to call #requestPinAppWidgetWithOptions.");
            mo95904a();
        }
    }
}
