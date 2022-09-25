package com.google.android.apps.gsa.sidekick.main.entry;

import android.content.Intent;
import android.os.PowerManager;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.proactive.p6475b.C84160c;
import com.google.android.apps.gsa.proactive.p6475b.C84162e;
import com.google.android.apps.gsa.proactive.p6475b.C84163f;
import com.google.android.apps.gsa.proactive.p6475b.C84164g;
import com.google.android.apps.gsa.search.core.C85651bb;
import com.google.android.apps.gsa.shared.util.p7159c.C90877ak;
import com.google.android.apps.gsa.sidekick.main.p7219n.C91480f;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60922j;
import com.google.p375ai.p378b.C7642eo;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
public class EntriesRefreshIntentService extends C91332bj {

    /* renamed from: g */
    private static final C59071e f254794g = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.entry.EntriesRefreshIntentService");

    /* renamed from: h */
    private static final long f254795h = TimeUnit.MINUTES.toMillis(2);

    /* renamed from: a */
    public C84160c f254796a;

    /* renamed from: b */
    public C91320ay f254797b;

    /* renamed from: c */
    public C84163f f254798c;

    /* renamed from: d */
    public C85651bb f254799d;

    /* renamed from: e */
    public C91480f f254800e;

    /* renamed from: f */
    public C84164g f254801f;

    public EntriesRefreshIntentService() {
        setIntentRedelivery(false);
    }

    public final void onCreate() {
        C74507e.m120466b(19);
        super.onCreate();
        this.f254800e.mo85823b();
    }

    /* access modifiers changed from: protected */
    public final void onHandleIntent(Intent intent) {
        C58976aa aaVar = C58975e.f156826a;
        if (intent != null) {
            PowerManager.WakeLock newWakeLock = ((PowerManager) getSystemService("power")).newWakeLock(1, "EntriesRefresh_wakelock");
            newWakeLock.setReferenceCounted(false);
            try {
                newWakeLock.acquire(f254795h);
                if ("com.google.android.apps.gsa.sidekick.ENTRY_SYNC_USER_REFRESH".equals(intent.getAction())) {
                    if (!intent.getBooleanExtra("com.google.android.apps.sidekick.SKIP_IF_OPTED_OUT", false) || this.f254799d.mo79134G()) {
                        C7642eo a = C7642eo.m22791a(intent.getIntExtra("com.google.android.apps.sidekick.TRACE", 0));
                        boolean booleanExtra = intent.getBooleanExtra("com.google.android.apps.sidekick.SAVE_CALL_LOG", false);
                        if (intent.getBooleanExtra("com.google.android.apps.sidekick.PAGINATION", false)) {
                            C84162e eVar = (C84162e) C90877ak.m148472f(C60922j.m93045h(this.f254797b.mo85619i(), new C91352h(this, booleanExtra), C60826bg.f164896a));
                        }
                        try {
                            C84160c cVar = this.f254796a;
                            if (a == null) {
                                a = C7642eo.OTHER;
                            }
                            C90877ak.m148472f(cVar.mo77602c(a, booleanExtra));
                        } catch (InterruptedException | ExecutionException e) {
                            C59104x c = f254794g.mo56225c();
                            c.mo56378ag(C58975e.f156826a, "EntriesRefreshIntentSer");
                            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(11544)).mo56386p("Failed to queue request");
                        }
                    } else {
                        newWakeLock.release();
                        return;
                    }
                } else if ("com.google.android.apps.sidekick.REFRESH".equals(intent.getAction())) {
                    try {
                        C90877ak.m148472f(this.f254801f.mo77613a());
                    } catch (InterruptedException | ExecutionException e2) {
                        C59104x c2 = f254794g.mo56225c();
                        c2.mo56378ag(C58975e.f156826a, "EntriesRefreshIntentSer");
                        ((C59052c) ((C59052c) ((C59052c) c2).mo56382g(e2)).mo56372aa(11543)).mo56386p("Faled to send queued requests");
                    }
                }
            } catch (InterruptedException | ExecutionException e3) {
                C59104x c3 = f254794g.mo56225c();
                c3.mo56378ag(C58975e.f156826a, "EntriesRefreshIntentSer");
                ((C59052c) ((C59052c) ((C59052c) c3).mo56382g(e3)).mo56372aa(11546)).mo56386p("Failed to send pagination request");
            } catch (Throwable th) {
                newWakeLock.release();
                throw th;
            }
            newWakeLock.release();
        }
    }
}
