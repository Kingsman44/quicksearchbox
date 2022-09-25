package com.google.android.apps.gsa.search.core;

import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.IBinder;
import android.os.PowerManager;
import com.google.android.apps.gsa.p5846e.C74507e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88230tz;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88232ua;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88233ub;
import com.google.android.apps.gsa.search.shared.service.p6940d.C88483e;
import com.google.android.apps.gsa.shared.p7007ay.C89331a;
import com.google.android.apps.gsa.shared.p7066m.C89996bb;
import com.google.android.apps.gsa.shared.p7066m.p7068b.C89994f;
import com.google.android.apps.gsa.shared.util.C91070p;
import com.google.android.apps.gsa.shared.util.p7180q.C91083b;
import com.google.android.apps.gsa.shared.util.p7180q.C91084c;
import com.google.android.apps.gsa.speech.hotword.C92343a;
import com.google.android.apps.gsa.speech.hotword.C92354c;
import com.google.android.apps.gsa.speech.microdetection.C92486a;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.C62940bt;
import dagger.C68214a;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/* compiled from: PG */
public class BroadcastListenerService extends C84604al {

    /* renamed from: a */
    boolean f229527a;

    /* renamed from: b */
    final BroadcastReceiver f229528b = new C85770g(this);

    /* renamed from: c */
    public C68214a f229529c;

    /* renamed from: d */
    KeyguardManager f229530d;

    /* renamed from: e */
    public C89331a f229531e;

    /* renamed from: f */
    public C68214a f229532f;

    /* renamed from: g */
    public C68214a f229533g;

    /* renamed from: h */
    private PowerManager f229534h;

    /* renamed from: i */
    private boolean f229535i;

    /* renamed from: j */
    private List f229536j = new ArrayList();

    /* renamed from: k */
    private boolean f229537k;

    public BroadcastListenerService() {
        C91083b.m148803a(C91084c.SEARCH);
    }

    /* renamed from: a */
    public final void mo77870a(Context context, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        if (!z) {
            synchronized (this.f229531e.f242191a) {
            }
            ((C92486a) this.f229533g.mo27525b()).mo87232f();
        }
        C91070p.m148777b(context, new Intent("com.google.android.search.core.action.DEVICE_LOCKED_STATE_CHANGE").setClassName(context, "com.google.android.apps.gsa.search.core.service.SearchService").putExtra("com.google.android.search.core.extra.IS_LOCKED", z));
    }

    /* renamed from: b */
    public final void mo77871b(Context context, boolean z) {
        C58976aa aaVar = C58975e.f156826a;
        this.f229537k = z;
        C88489j jVar = new C88489j(C87739bu.SCREEN_STATE_CHANGE);
        C62940bt btVar = C88230tz.f238473a;
        C88232ua uaVar = (C88232ua) C88233ub.f238478c.createBuilder();
        uaVar.copyOnWrite();
        C88233ub ubVar = (C88233ub) uaVar.instance;
        ubVar.f238480a |= 1;
        ubVar.f238481b = z;
        jVar.mo82014b(btVar, (C88233ub) uaVar.build());
        C88483e.m142828c(context, jVar.mo82013a());
    }

    /* access modifiers changed from: protected */
    public final void dump(FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
        String valueOf = String.valueOf(this.f229536j);
        boolean z = this.f229537k;
        printWriter.println("BroadcastListenerService[Registered actions: " + valueOf + ", IsScreenOn:" + z + "]");
    }

    public final IBinder onBind(Intent intent) {
        return null;
    }

    public final void onCreate() {
        C74507e.m120466b(16);
        C58976aa aaVar = C58975e.f156826a;
        super.onCreate();
        this.f229527a = C92354c.m151655a(this) == C92343a.f257443a;
        this.f229534h = (PowerManager) getSystemService("power");
        this.f229530d = (KeyguardManager) getSystemService("keyguard");
    }

    public final void onDestroy() {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f229535i) {
            unregisterReceiver(this.f229528b);
            this.f229535i = false;
        }
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        C58976aa aaVar = C58975e.f156826a;
        if (this.f229527a && !((C89994f) this.f229532f.mo27525b()).mo83816e() && ((C92486a) this.f229533g.mo27525b()).mo87251y()) {
            if (!this.f229535i) {
                ArrayList arrayList = new ArrayList();
                this.f229536j = arrayList;
                arrayList.add("android.intent.action.USER_PRESENT");
                IntentFilter intentFilter = new IntentFilter();
                for (String addAction : this.f229536j) {
                    intentFilter.addAction(addAction);
                }
                registerReceiver(this.f229528b, intentFilter);
                this.f229535i = true;
                boolean z = false;
                for (String str : this.f229536j) {
                    if ("android.intent.action.SCREEN_OFF".equals(str) || "android.intent.action.SCREEN_ON".equals(str)) {
                        if (!z) {
                            mo77871b(this, this.f229534h.isScreenOn());
                            z = true;
                        }
                    }
                    if ("android.intent.action.USER_PRESENT".equals(str)) {
                        mo77870a(this, this.f229530d.isKeyguardLocked());
                    }
                }
            }
            if (((C86124t) this.f229529c.mo27525b()).mo79746e(C89996bb.f246774d)) {
                return 2;
            }
            return 1;
        }
        stopSelf();
        return 2;
    }
}
