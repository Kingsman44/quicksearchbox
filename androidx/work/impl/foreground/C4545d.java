package androidx.work.impl.foreground;

import android.app.Notification;
import android.content.Context;
import android.content.Intent;
import androidx.work.C4380ad;
import androidx.work.C4635p;
import androidx.work.impl.C4452ag;
import androidx.work.impl.C4539d;
import androidx.work.impl.C4620v;
import androidx.work.impl.p204a.C4442c;
import androidx.work.impl.p204a.C4443d;
import androidx.work.impl.p204a.C4444e;
import androidx.work.impl.p207b.C4470ae;
import androidx.work.impl.p207b.C4486au;
import androidx.work.impl.p207b.C4509r;
import androidx.work.impl.utils.C4580aa;
import androidx.work.impl.utils.p210b.C4595b;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* renamed from: androidx.work.impl.foreground.d */
/* compiled from: PG */
public final class C4545d implements C4442c, C4539d {

    /* renamed from: a */
    static final String f14360a = C4380ad.m12561i("SystemFgDispatcher");

    /* renamed from: b */
    public final C4452ag f14361b;

    /* renamed from: c */
    final Object f14362c = new Object();

    /* renamed from: d */
    C4509r f14363d;

    /* renamed from: e */
    final Map f14364e;

    /* renamed from: f */
    final Map f14365f;

    /* renamed from: g */
    final Set f14366g;

    /* renamed from: h */
    final C4443d f14367h;

    /* renamed from: i */
    public C4544c f14368i;

    /* renamed from: j */
    public final C4595b f14369j;

    /* renamed from: k */
    private final Context f14370k;

    public C4545d(Context context) {
        this.f14370k = context;
        C4452ag j = C4452ag.m12686j(context);
        this.f14361b = j;
        this.f14369j = j.f14151m;
        this.f14363d = null;
        this.f14364e = new LinkedHashMap();
        this.f14366g = new HashSet();
        this.f14365f = new HashMap();
        this.f14367h = new C4444e(j.f14150l, this);
        j.f14145g.mo9514b(this);
    }

    /* renamed from: b */
    public static Intent m12920b(Context context, C4509r rVar, C4635p pVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_NOTIFY");
        intent.putExtra("KEY_NOTIFICATION_ID", pVar.f14559a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", pVar.f14560b);
        intent.putExtra("KEY_NOTIFICATION", pVar.f14561c);
        intent.putExtra("KEY_WORKSPEC_ID", rVar.f14269a);
        intent.putExtra("KEY_GENERATION", rVar.f14270b);
        return intent;
    }

    /* renamed from: c */
    public static Intent m12921c(Context context, C4509r rVar, C4635p pVar) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_START_FOREGROUND");
        intent.putExtra("KEY_WORKSPEC_ID", rVar.f14269a);
        intent.putExtra("KEY_GENERATION", rVar.f14270b);
        intent.putExtra("KEY_NOTIFICATION_ID", pVar.f14559a);
        intent.putExtra("KEY_FOREGROUND_SERVICE_TYPE", pVar.f14560b);
        intent.putExtra("KEY_NOTIFICATION", pVar.f14561c);
        return intent;
    }

    /* renamed from: d */
    public static Intent m12922d(Context context) {
        Intent intent = new Intent(context, SystemForegroundService.class);
        intent.setAction("ACTION_STOP_FOREGROUND");
        return intent;
    }

    /* renamed from: a */
    public final void mo9473a(C4509r rVar, boolean z) {
        Map.Entry entry;
        synchronized (this.f14362c) {
            C4470ae aeVar = (C4470ae) this.f14365f.remove(rVar);
            if (aeVar != null && this.f14366g.remove(aeVar)) {
                this.f14367h.mo9389a(this.f14366g);
            }
        }
        C4635p pVar = (C4635p) this.f14364e.remove(rVar);
        if (rVar.equals(this.f14363d) && this.f14364e.size() > 0) {
            Iterator it = this.f14364e.entrySet().iterator();
            Object next = it.next();
            while (true) {
                entry = (Map.Entry) next;
                if (!it.hasNext()) {
                    break;
                }
                next = it.next();
            }
            this.f14363d = (C4509r) entry.getKey();
            if (this.f14368i != null) {
                C4635p pVar2 = (C4635p) entry.getValue();
                this.f14368i.mo9501c(pVar2.f14559a, pVar2.f14560b, pVar2.f14561c);
                this.f14368i.mo9499a(pVar2.f14559a);
            }
        }
        C4544c cVar = this.f14368i;
        if (pVar != null && cVar != null) {
            C4380ad h = C4380ad.m12560h();
            String str = f14360a;
            h.mo9309a(str, "Removing Notification (id: " + pVar.f14559a + ", workSpecId: " + rVar + ", notificationType: " + pVar.f14560b);
            cVar.mo9499a(pVar.f14559a);
        }
    }

    /* renamed from: e */
    public final void mo9387e(List list) {
    }

    /* renamed from: f */
    public final void mo9388f(List list) {
        if (!list.isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C4470ae aeVar = (C4470ae) it.next();
                C4380ad.m12560h().mo9309a(f14360a, "Constraints unmet for WorkSpec ".concat(String.valueOf(aeVar.f14217b)));
                C4452ag agVar = this.f14361b;
                C4509r a = C4486au.m12791a(aeVar);
                C4595b bVar = agVar.f14151m;
                bVar.f14486a.execute(new C4580aa(agVar, new C4620v(a), true));
            }
        }
    }

    /* renamed from: g */
    public final void mo9505g(Intent intent) {
        int i = 0;
        int intExtra = intent.getIntExtra("KEY_NOTIFICATION_ID", 0);
        int intExtra2 = intent.getIntExtra("KEY_FOREGROUND_SERVICE_TYPE", 0);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        C4509r rVar = new C4509r(stringExtra, intent.getIntExtra("KEY_GENERATION", 0));
        Notification notification = (Notification) intent.getParcelableExtra("KEY_NOTIFICATION");
        C4380ad h = C4380ad.m12560h();
        String str = f14360a;
        h.mo9309a(str, "Notifying with (id:" + intExtra + ", workSpecId: " + stringExtra + ", notificationType :" + intExtra2 + ")");
        if (notification != null && this.f14368i != null) {
            this.f14364e.put(rVar, new C4635p(intExtra, notification, intExtra2));
            if (this.f14363d == null) {
                this.f14363d = rVar;
                this.f14368i.mo9501c(intExtra, intExtra2, notification);
                return;
            }
            this.f14368i.mo9500b(intExtra, notification);
            if (intExtra2 != 0) {
                for (Map.Entry value : this.f14364e.entrySet()) {
                    i |= ((C4635p) value.getValue()).f14560b;
                }
                C4635p pVar = (C4635p) this.f14364e.get(this.f14363d);
                if (pVar != null) {
                    this.f14368i.mo9501c(pVar.f14559a, i, pVar.f14561c);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: h */
    public final void mo9506h() {
        this.f14368i = null;
        synchronized (this.f14362c) {
            this.f14367h.mo9390b();
        }
        this.f14361b.f14145g.mo9515c(this);
    }
}
