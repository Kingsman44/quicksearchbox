package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8632f;

import android.content.Intent;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.logger.p7051b.C89856f;
import com.google.android.apps.gsa.shared.logger.p7051b.C89857g;
import com.google.android.apps.gsa.shared.logger.p7051b.C89859i;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.util.C90719ac;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.assistant.p3994s.p3995a.C53282ic;
import com.google.assistant.p3994s.p3995a.C53286ig;
import com.google.assistant.p3994s.p3995a.C53287ih;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C59582aj;
import com.google.common.p4552o.C59687cb;
import dagger.C68214a;
import java.util.Timer;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.f.e */
/* compiled from: PG */
public final class C114735e {

    /* renamed from: a */
    public static final C59071e f318395a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.zerostate.f.e");

    /* renamed from: b */
    public final C86124t f318396b;

    /* renamed from: c */
    public final AtomicBoolean f318397c = new AtomicBoolean(true);

    /* renamed from: d */
    public final AtomicLong f318398d = new AtomicLong();

    /* renamed from: e */
    public final AtomicBoolean f318399e = new AtomicBoolean();

    /* renamed from: f */
    final AtomicBoolean f318400f = new AtomicBoolean();

    /* renamed from: g */
    public Timer f318401g;

    /* renamed from: h */
    private final C68214a f318402h;

    /* renamed from: i */
    private final AtomicBoolean f318403i = new AtomicBoolean();

    /* renamed from: j */
    private Timer f318404j;

    public C114735e(C68214a aVar, C86124t tVar) {
        this.f318402h = aVar;
        this.f318396b = tVar;
    }

    /* renamed from: a */
    public final void mo101553a(C89849ae aeVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f318398d.get();
        ((C89859i) this.f318402h.mo27525b()).mo83702b(aeVar);
    }

    /* renamed from: b */
    public final void mo101554b(C89849ae aeVar) {
        this.f318403i.set(true);
        C58976aa aaVar = C58975e.f156826a;
        this.f318398d.set(C90719ac.f253778a.f253779b.nextLong());
        this.f318399e.set(true);
        this.f318400f.set(true);
        mo101553a(aeVar);
    }

    /* renamed from: c */
    public final void mo101555c(C89849ae aeVar) {
        Timer timer = this.f318404j;
        if (timer == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        timer.cancel();
        mo101553a(aeVar);
        this.f318404j = null;
    }

    /* renamed from: d */
    public final void mo101556d(C89849ae aeVar) {
        C89857g gVar;
        C58976aa aaVar = C58975e.f156826a;
        if (this.f318403i.get()) {
            C89856f fVar = new C89856f();
            fVar.f246201a = aeVar;
            if (!this.f318400f.getAndSet(false)) {
                gVar = fVar.mo83699a();
            } else {
                C59582aj ajVar = (C59582aj) C59687cb.f160034bf.createBuilder();
                String b = C39191a.m68623b(this.f318398d.get());
                ajVar.copyOnWrite();
                C59687cb cbVar = (C59687cb) ajVar.instance;
                b.getClass();
                cbVar.f160062a |= 4;
                cbVar.f160127h = b;
                fVar.f246203c = (C59687cb) ajVar.build();
                gVar = fVar.mo83699a();
            }
            ((C89859i) this.f318402h.mo27525b()).mo74236a(gVar);
            this.f318403i.set(false);
        }
    }

    /* renamed from: e */
    public final void mo101557e(C89849ae aeVar) {
        Timer timer = this.f318401g;
        if (timer == null) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        timer.cancel();
        mo101553a(aeVar);
        this.f318401g = null;
    }

    /* renamed from: f */
    public final void mo101558f(Intent intent) {
        int intExtra = intent.getIntExtra("com.google.opa.ZERO_STATE_APP_FLOW_EVENT", -1);
        if (intExtra == -1) {
            C58976aa aaVar = C58975e.f156826a;
            return;
        }
        mo101555c(C89849ae.OPA_ZERO_STATE_CONVERSATION_CANCELED_BY_CLIENT_INPUT);
        Timer timer = new Timer();
        this.f318404j = timer;
        timer.schedule(new C114734d(this), Duration.ofSeconds(this.f318396b.mo79743a(C90014bt.f247831or)).toMillis());
        mo101553a(C89849ae.m146281a(intExtra));
    }

    /* renamed from: g */
    public final void mo101559g() {
        C58976aa aaVar = C58975e.f156826a;
        this.f318397c.set(false);
        mo101554b(C89849ae.OPA_ANDROID_ZERO_STATE_CREATE_ACTIVITY);
    }

    /* renamed from: h */
    public final void mo101560h(int i, C53287ih ihVar) {
        int i2;
        int i3;
        if (ihVar == null || (i2 = C53282ic.m86805a(ihVar.f139702h)) == 0) {
            i2 = 1;
        }
        if (ihVar == null || (i3 = C53286ig.m86808b(ihVar.f139703i)) == 0) {
            i3 = 1;
        }
        int i4 = i - 1;
        if (i4 == 0) {
            mo101553a(C89849ae.OPA_ZERO_STATE_DEEP_LINK_TARGET_FOUND);
            if (i2 == 3) {
                mo101553a(C89849ae.OPA_ZERO_STATE_DEEP_LINK_FROM_NOTIFICATION_TARGET_FOUND);
            } else if (i2 == 2) {
                mo101555c(C89849ae.OPA_ZERO_STATE_DEEP_LINK_FROM_CHAT_UI_TARGET_FOUND);
            } else if (i3 == 28) {
                mo101557e(C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_DEEP_LINK_TARGET_FOUND);
            }
        } else if (i4 == 1) {
            mo101553a(C89849ae.OPA_ZERO_STATE_DEEP_LINK_FALLBACK_INTENT_TRIGGERED);
            if (i2 == 3) {
                mo101553a(C89849ae.OPA_ZERO_STATE_DEEP_LINK_FROM_NOTIFICATION_FALLBACK_TRIGGERED);
            } else if (i2 == 2) {
                mo101555c(C89849ae.OPA_ZERO_STATE_DEEP_LINK_FROM_CHAT_UI_FALLBACK_TRIGGERED);
            }
        } else if (i4 != 2) {
            mo101553a(C89849ae.OPA_ZERO_STATE_DEEP_LINK_TARGET_NOT_FOUND_AND_NO_FALLBACK);
            if (i2 == 3) {
                mo101553a(C89849ae.OPA_ZERO_STATE_DEEP_LINK_FROM_NOTIFICATION_TARGET_NOT_FOUND_AND_NO_FALLBACK);
            } else if (i2 == 2) {
                mo101555c(C89849ae.OPA_ZERO_STATE_DEEP_LINK_FROM_CHAT_UI_TARGET_NOT_FOUND_AND_NO_FALLBACK);
            } else if (i3 == 28) {
                mo101557e(C89849ae.OPA_ZERO_STATE_FAB_V2_FLOW_DEEP_LINK_TARGET_NOT_FOUND_AND_NO_FALLBACK);
            }
        } else {
            mo101553a(C89849ae.OPA_ZERO_STATE_DEEP_LINK_FALLBACK_TOAST_MESSAGE_TRIGGERED);
            if (i2 == 3) {
                mo101553a(C89849ae.OPA_ZERO_STATE_DEEP_LINK_FROM_NOTIFICATION_FALLBACK_TRIGGERED);
            } else if (i2 == 2) {
                mo101555c(C89849ae.OPA_ZERO_STATE_DEEP_LINK_FROM_CHAT_UI_FALLBACK_TRIGGERED);
            }
        }
    }
}
