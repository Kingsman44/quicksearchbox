package com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared;

import android.content.ContentProviderClient;
import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.apps.gsa.assistant.shared.u;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110403c;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1356b.p1357a.C16917a;
import com.google.common.base.C58881cr;
import com.google.common.base.C58886cw;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.shared.b */
/* compiled from: PG */
public final class C110116b implements u {

    /* renamed from: a */
    private final Context f306855a;

    /* renamed from: b */
    private final C58881cr f306856b;

    /* renamed from: c */
    private final C110403c f306857c;

    /* renamed from: d */
    private final C86124t f306858d;

    public C110116b(Context context, C110403c cVar, C86124t tVar) {
        this.f306855a = context;
        this.f306857c = cVar;
        this.f306858d = tVar;
        this.f306856b = C58886cw.m90973a(new C110115a(context));
    }

    /* renamed from: a */
    public final String mo98395a(String str) {
        if (!this.f306858d.mo79746e(C90014bt.f247075aM)) {
            return this.f306855a.getString(R.string.enable_device_integration_string);
        }
        Context context = this.f306855a;
        C59071e eVar = C16917a.f49471a;
        ContentResolver contentResolver = context.getContentResolver();
        Uri build = new Uri.Builder().scheme("content").authority("com.google.android.googlequicksearchbox.AmbDeviceIntegrationStatusProvider").appendPath("gsa_amb_dev_integ_oobe_str").appendPath(str).build();
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(build);
        String str2 = null;
        if (acquireUnstableContentProviderClient == null) {
            C59104x d = C16917a.f49471a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AsstAmbDevInteg");
            ((C59052c) ((C59052c) d).mo56372aa(42560)).mo56386p("getAmbientModeOobeString() ContentProviderClient is null");
        } else {
            try {
                Cursor query = acquireUnstableContentProviderClient.query(build, C16917a.f49472b, (String) null, (String[]) null, (String) null);
                if (query != null && query.moveToFirst()) {
                    str2 = query.getString(query.getColumnIndex("value"));
                }
            } catch (RemoteException e) {
                C59104x c = C16917a.f49471a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AsstAmbDevInteg");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(42559)).mo56386p("getAmbientModeOobeString() ContentProviderClient error");
            } catch (Throwable th) {
                acquireUnstableContentProviderClient.close();
                throw th;
            }
            acquireUnstableContentProviderClient.close();
        }
        return str2;
    }

    /* renamed from: b */
    public final boolean mo98396b() {
        Context context = this.f306855a;
        C59071e eVar = C16917a.f49471a;
        ContentResolver contentResolver = context.getContentResolver();
        Uri build = new Uri.Builder().scheme("content").authority("com.google.android.googlequicksearchbox.AmbDeviceIntegrationStatusProvider").appendPath("gsa_amb_dev_integ_amb_mode_enabled").build();
        ContentProviderClient acquireUnstableContentProviderClient = contentResolver.acquireUnstableContentProviderClient(build);
        boolean z = false;
        if (acquireUnstableContentProviderClient == null) {
            C59104x d = C16917a.f49471a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "AsstAmbDevInteg");
            ((C59052c) ((C59052c) d).mo56372aa(42562)).mo56386p("shouldShowAmbientMode() ContentProviderClient is null");
        } else {
            try {
                Cursor query = acquireUnstableContentProviderClient.query(build, C16917a.f49472b, (String) null, (String[]) null, (String) null);
                if (query != null && query.moveToFirst() && query.getInt(query.getColumnIndex("value")) == 1) {
                    z = true;
                }
            } catch (RemoteException e) {
                C59104x c = C16917a.f49471a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "AsstAmbDevInteg");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(42561)).mo56386p("shouldShowAmbientMode() ContentProviderClient error");
            } catch (Throwable th) {
                acquireUnstableContentProviderClient.close();
                throw th;
            }
            acquireUnstableContentProviderClient.close();
        }
        return z;
    }

    /* renamed from: c */
    public final boolean mo98397c(String str) {
        return mo98398d() && str != null && this.f306857c.mo98633d(str);
    }

    /* renamed from: d */
    public final boolean mo98398d() {
        return ((Boolean) this.f306856b.mo6453a()).booleanValue() || this.f306858d.mo79746e(C90014bt.f247106ar);
    }
}
