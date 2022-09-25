package androidx.work.impl.background.systemalarm;

import android.content.Context;
import android.content.Intent;
import androidx.work.C4380ad;
import androidx.work.impl.C4539d;
import androidx.work.impl.C4621w;
import androidx.work.impl.p207b.C4509r;
import java.util.HashMap;
import java.util.Map;

/* renamed from: androidx.work.impl.background.systemalarm.c */
/* compiled from: PG */
public final class C4523c implements C4539d {

    /* renamed from: a */
    public static final String f14298a = C4380ad.m12561i("CommandHandler");

    /* renamed from: b */
    public final Context f14299b;

    /* renamed from: c */
    public final Map f14300c = new HashMap();

    /* renamed from: d */
    public final Object f14301d = new Object();

    /* renamed from: e */
    public final C4621w f14302e;

    public C4523c(Context context, C4621w wVar) {
        this.f14299b = context;
        this.f14302e = wVar;
    }

    /* renamed from: b */
    static Intent m12874b(Context context) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_CONSTRAINTS_CHANGED");
        return intent;
    }

    /* renamed from: c */
    static Intent m12875c(Context context, C4509r rVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_DELAY_MET");
        m12880h(intent, rVar);
        return intent;
    }

    /* renamed from: d */
    static Intent m12876d(Context context, C4509r rVar, boolean z) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_EXECUTION_COMPLETED");
        intent.putExtra("KEY_NEEDS_RESCHEDULE", z);
        m12880h(intent, rVar);
        return intent;
    }

    /* renamed from: e */
    static Intent m12877e(Context context, C4509r rVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_SCHEDULE_WORK");
        m12880h(intent, rVar);
        return intent;
    }

    /* renamed from: f */
    static Intent m12878f(Context context, C4509r rVar) {
        Intent intent = new Intent(context, SystemAlarmService.class);
        intent.setAction("ACTION_STOP_WORK");
        m12880h(intent, rVar);
        return intent;
    }

    /* renamed from: g */
    static C4509r m12879g(Intent intent) {
        return new C4509r(intent.getStringExtra("KEY_WORKSPEC_ID"), intent.getIntExtra("KEY_WORKSPEC_GENERATION", 0));
    }

    /* renamed from: h */
    private static void m12880h(Intent intent, C4509r rVar) {
        intent.putExtra("KEY_WORKSPEC_ID", rVar.f14269a);
        intent.putExtra("KEY_WORKSPEC_GENERATION", rVar.f14270b);
    }

    /* renamed from: a */
    public final void mo9473a(C4509r rVar, boolean z) {
        synchronized (this.f14301d) {
            C4528h hVar = (C4528h) this.f14300c.remove(rVar);
            this.f14302e.mo9561a(rVar);
            if (hVar != null) {
                C4380ad h = C4380ad.m12560h();
                String str = C4528h.f14309a;
                h.mo9309a(str, "onExecuted " + hVar.f14312d + ", " + z);
                hVar.mo9485a();
                if (z) {
                    hVar.f14317i.execute(new C4530j(hVar.f14313e, m12877e(hVar.f14310b, hVar.f14312d), hVar.f14311c));
                }
                if (hVar.f14319k) {
                    hVar.f14317i.execute(new C4530j(hVar.f14313e, m12874b(hVar.f14310b), hVar.f14311c));
                }
            }
        }
    }
}
