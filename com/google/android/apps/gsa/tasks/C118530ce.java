package com.google.android.apps.gsa.tasks;

import com.google.android.libraries.p1730f.C21370a;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60870cx;
import java.util.EnumMap;

/* renamed from: com.google.android.apps.gsa.tasks.ce */
/* compiled from: PG */
public final class C118530ce extends C118529cd {

    /* renamed from: a */
    private static final C59071e f329113a = C59071e.m91332i("com.google.android.apps.gsa.tasks.ce");

    /* renamed from: b */
    private final C118565x f329114b;

    /* renamed from: c */
    private final C118558q f329115c;

    /* renamed from: d */
    private final C118533ch f329116d;

    /* renamed from: e */
    private final C21370a f329117e;

    /* renamed from: f */
    private final C118527cb f329118f;

    /* renamed from: g */
    private final int f329119g;

    /* renamed from: h */
    private final EnumMap f329120h = new EnumMap(C118522by.class);

    /* renamed from: i */
    private final long f329121i;

    public C118530ce(C118565x xVar, C118558q qVar, C118533ch chVar, C21370a aVar, C118527cb cbVar, int i) {
        this.f329114b = xVar;
        this.f329115c = qVar;
        this.f329116d = chVar;
        this.f329117e = aVar;
        this.f329118f = cbVar;
        this.f329119g = i;
        this.f329121i = C118567z.f329183a / 2;
    }

    /* renamed from: c */
    private final void m196774c(int i) {
        if (C118523bz.m196762c(i) == C118466aa.PERIODIC) {
            this.f329114b.mo103756g(i);
        }
    }

    /* renamed from: b */
    public final C60870cx mo103736b(Class cls, C118485at atVar) {
        C118526ca caVar;
        int i = atVar.f328864b;
        C118522by b = C118522by.m196758b(atVar.f328865c);
        if (b == null) {
            b = C118522by.UNKNOWN;
        }
        if (b == C118522by.UNKNOWN) {
            C59104x c = f329113a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "TaskServiceHelper");
            ((C59052c) ((C59052c) c).mo56372aa(34006)).mo56386p("Cannot execute TaskName.UNKNOWN (or data got corrupted).");
            m196774c(i);
            return null;
        }
        C118466aa c2 = C118523bz.m196762c(i);
        C118526ca f = this.f329114b.mo6453a();
        if (c2 == C118466aa.PERIODIC && f.mo103719c() != cls) {
            C59104x d = f329113a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "TaskServiceHelper");
            ((C59052c) ((C59052c) d).mo56372aa(34005)).mo56389s("Aborting because %s does not match the current engine type.", cls);
            C118527cb cbVar = this.f329118f;
            if (!cbVar.f329111c || !cls.equals(C118542cq.class)) {
                caVar = cls.equals(C118491az.class) ? (C118526ca) cbVar.f329109a.mo27525b() : null;
            } else {
                caVar = (C118526ca) cbVar.f329110b.mo27525b();
            }
            if (caVar != null) {
                caVar.mo103723g(i);
            }
            return null;
        } else if (this.f329119g != atVar.f328867e) {
            C59104x d2 = f329113a.mo56226d();
            d2.mo56378ag(C58975e.f156826a, "TaskServiceHelper");
            ((C59052c) ((C59052c) d2).mo56372aa(34004)).mo56393w("Aborting because scheduled on APK version %d, current APK version %d.", atVar.f328867e, this.f329119g);
            m196774c(i);
            return null;
        } else if (!C118523bz.m196763d(i, b) || !this.f329114b.mo103757h(b)) {
            m196774c(i);
            return null;
        } else {
            if (c2 == C118466aa.PERIODIC) {
                long b2 = this.f329117e.mo26870b();
                synchronized (this.f329120h) {
                    Long l = (Long) this.f329120h.get(b);
                    if (l == null || b2 - l.longValue() >= this.f329121i) {
                        this.f329120h.put(b, Long.valueOf(b2));
                    } else {
                        C59104x d3 = f329113a.mo56226d();
                        d3.mo56378ag(C58975e.f156826a, "TaskServiceHelper");
                        ((C59052c) ((C59052c) d3).mo56372aa(34003)).mo56389s("Not enough time has passed between starts of two %s periodic tasks.", b);
                        return null;
                    }
                }
            }
            if ((atVar.f328863a & 16) != 0) {
                this.f329116d.mo103741e(f.mo103718b(), atVar.f328868f);
            }
            C118558q qVar = this.f329115c;
            C118476ak akVar = atVar.f328866d;
            if (akVar == null) {
                akVar = C118476ak.f328838a;
            }
            return qVar.mo103750b(b, akVar, c2);
        }
    }
}
