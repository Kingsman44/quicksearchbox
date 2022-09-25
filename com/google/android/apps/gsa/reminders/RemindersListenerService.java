package com.google.android.apps.gsa.reminders;

import android.content.ComponentName;
import android.content.Intent;
import com.google.android.apps.gsa.opa.smartspace.C83793i;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.apps.gsa.shared.logger.C89838ab;
import com.google.android.gms.common.data.C143864d;
import com.google.android.gms.reminders.model.C145851w;
import com.google.android.gms.reminders.model.C145852x;
import com.google.android.gms.reminders.model.Task;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;
import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: PG */
public class RemindersListenerService extends C84255b {

    /* renamed from: f */
    private static final C59071e f229287f = C59071e.m91332i("com.google.android.apps.gsa.reminders.RemindersListenerService");

    /* renamed from: a */
    public C68214a f229288a;

    /* renamed from: b */
    public C83793i f229289b;

    /* renamed from: g */
    private final ComponentName f229290g = new ComponentName("com.google.android.googlequicksearchbox", RemindersListenerService.class.getName());

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77737b(C145851w wVar) {
        Task i;
        C58976aa aaVar = C58975e.f156826a;
        if (wVar.mo121966j().equals(((C86054o) this.f229288a.mo27525b()).mo79659F()) && (i = wVar.mo121965i()) != null) {
            sendBroadcast(new Intent("com.google.android.apps.gsa.sidekick.main.reminders.ACTION_REMINDER_FIRED").setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.reminders.RemindersBroadcastReceiver").putExtra("com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_TASK", i));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo77738d(C145852x xVar) {
        String F;
        C58976aa aaVar = C58975e.f156826a;
        if (xVar.mo119324c() > 0 && (F = ((C86054o) this.f229288a.mo27525b()).mo79659F()) != null) {
            HashSet hashSet = new HashSet();
            C143864d dVar = new C143864d(xVar);
            boolean z = false;
            boolean z2 = false;
            while (dVar.hasNext()) {
                C145851w wVar = (C145851w) dVar.next();
                if (F.equals(wVar.mo121966j())) {
                    Task i = wVar.mo121965i();
                    if (i.mo122076m() == null || Boolean.TRUE.equals(i.mo122076m().mo122041j()) || Boolean.TRUE.equals(i.mo122076m().mo122040i())) {
                        if (wVar.mo121964h() != 2 && !Boolean.TRUE.equals(i.mo122078o()) && !Boolean.TRUE.equals(i.mo122079p())) {
                            z = true;
                        } else if (i.mo122077n() != null) {
                            hashSet.add(i.mo122077n().mo122058h());
                        }
                        z2 |= !(i.mo122074k() == null);
                    }
                }
            }
            xVar.mo119102b();
            if (z || !hashSet.isEmpty()) {
                sendBroadcast(new Intent("com.google.android.apps.gsa.sidekick.main.reminders.ACTION_REMINDERS_CHANGED").setClassName("com.google.android.googlequicksearchbox", "com.google.android.apps.gsa.reminders.RemindersBroadcastReceiver").putExtra("com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_HAS_ACTIVE_REMINDERS", z).putExtra("com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_HAS_LOCATION_REMINDERS", z2).putStringArrayListExtra("com.google.android.apps.gsa.sidekick.shared.reminders.EXTRA_INACTIVE_REMINDER_IDS", new ArrayList(hashSet)));
                this.f229289b.mo77150f();
            }
        }
    }

    public final void onCreate() {
        C74507e.m120466b(15);
        C89838ab.m146265i();
        super.onCreate();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        stopSelf(i2);
        return 2;
    }

    public final ComponentName startService(Intent intent) {
        if (!this.f229290g.equals(intent.getComponent())) {
            C59104x d = f229287f.mo56226d();
            d.mo56378ag(C58975e.f156826a, "GmsRemindersListener");
            ((C59052c) ((C59052c) d).mo56372aa(7135)).mo56386p("Calling startService on this service for other component names.");
            try {
                return super.startService(intent);
            } catch (IllegalStateException e) {
                C59104x d2 = f229287f.mo56226d();
                d2.mo56378ag(C58975e.f156826a, "GmsRemindersListener");
                ((C59052c) ((C59052c) ((C59052c) d2).mo56382g(e)).mo56372aa(7136)).mo56389s("Attempting to start service when the app is in background is notallowed on Android O+. Intent: %s", intent);
                return null;
            }
        } else {
            mo122104f(intent);
            return null;
        }
    }
}
