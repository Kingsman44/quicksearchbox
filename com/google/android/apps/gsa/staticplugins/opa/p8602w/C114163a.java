package com.google.android.apps.gsa.staticplugins.opa.p8602w;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.os.Binder;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.p6930h.C87565h;
import com.google.android.apps.gsa.search.shared.p6930h.C87568k;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.opa.util.C113761ad;
import com.google.android.libraries.gcoreclient.p1763h.p1769c.C21560e;
import com.google.common.base.C58833ax;
import java.lang.ref.WeakReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.w.a */
/* compiled from: PG */
final class C114163a extends Handler {

    /* renamed from: a */
    private final WeakReference f316483a;

    public C114163a(C114164b bVar) {
        super(Looper.getMainLooper());
        this.f316483a = new WeakReference(bVar);
    }

    public final void handleMessage(Message message) {
        C114164b bVar = (C114164b) this.f316483a.get();
        if (bVar == null) {
            super.handleMessage(message);
            return;
        }
        Bundle data = message.getData();
        C87565h hVar = new C87565h();
        String string = message.getData().getString("calling_package_name");
        if (string != null || (!data.containsKey("query_string") && !data.containsKey("value_prop_id"))) {
            if (((C86124t) bVar.f316486b.mo27525b()).mo79758x(C90014bt.f247052Q).equals(string)) {
                hVar.f236556b = e.bB;
                hVar.f236558d = 1;
                hVar.f236523a = "and.opa.shellapp";
            }
            C86124t tVar = (C86124t) bVar.f316486b.mo27525b();
            int i = true != C113761ad.m188326a((SharedPreferences) bVar.f316488d.mo27525b()).equals("typing") ? 2 : 1;
            if (data.containsKey("assistant_launch_mode")) {
                int i2 = data.getInt("assistant_launch_mode");
                if (i2 == 3) {
                    i = 5;
                } else if (i2 == 4) {
                    i = 6;
                }
            }
            hVar.f236560f = i;
            if (data.containsKey("assistant_launch_mode")) {
                hVar.f236518V = data.getInt("assistant_launch_mode");
            }
            if (data.containsKey("query_string")) {
                hVar.f236560f = 4;
                hVar.f236568n = data.getString("query_string");
            }
            if (data.containsKey("value_prop_id")) {
                hVar.f236514R = data.getInt("value_prop_id");
            }
            C87568k kVar = (C87568k) ((C58833ax) bVar.f316487c.mo27525b()).mo56107c();
            Context context = (Context) bVar.f316489e.mo27525b();
            Bundle a = hVar.mo81685a();
            int i3 = 268468224;
            if (data.containsKey("assistant_launch_mode") && data.getInt("assistant_launch_mode") == 4) {
                i3 = 268435456;
            }
            kVar.mo81689c(context, a, i3);
            C114164b.m189384b(message.replyTo, true);
            return;
        }
        C114164b.m189384b(message.replyTo, false);
        super.handleMessage(message);
    }

    public final boolean sendMessageAtTime(Message message, long j) {
        C114164b bVar = (C114164b) this.f316483a.get();
        if (bVar == null) {
            message.getData().remove("calling_package_name");
        } else {
            String nameForUid = ((PackageManager) bVar.f316490f.mo27525b()).getNameForUid(Binder.getCallingUid());
            if (nameForUid != null && ((C86124t) bVar.f316486b.mo27525b()).mo79745c(C90014bt.f247821oh).contains(nameForUid)) {
                PackageManager packageManager = (PackageManager) bVar.f316490f.mo27525b();
                if (((C21560e) bVar.f316485a.mo17428b()).f59951a.mo119084c(nameForUid)) {
                    message.getData().putString("calling_package_name", nameForUid);
                }
            }
            message.getData().remove("calling_package_name");
        }
        return super.sendMessageAtTime(message, j);
    }
}
