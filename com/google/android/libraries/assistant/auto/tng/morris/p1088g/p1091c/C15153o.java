package com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c;

import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import com.google.android.libraries.assistant.auto.tng.morris.framework.C14986h;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14369gr;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14370gs;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14371gt;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14490ld;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14491le;
import com.google.android.libraries.assistant.auto.tng.morris.p1071e.C14492lf;
import com.google.android.libraries.assistant.auto.tng.morris.p1088g.p1091c.p1092a.C15133c;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;

/* renamed from: com.google.android.libraries.assistant.auto.tng.morris.g.c.o */
/* compiled from: PG */
public final /* synthetic */ class C15153o implements View.OnTouchListener {

    /* renamed from: a */
    public final /* synthetic */ C15154p f45466a;

    public /* synthetic */ C15153o(C15154p pVar) {
        this.f45466a = pVar;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        C15154p pVar = this.f45466a;
        view.performClick();
        int action = motionEvent.getAction();
        if (action == 0) {
            pVar.f45472f.set(motionEvent.getRawX(), motionEvent.getRawY());
            pVar.f45471e.mo22007d(motionEvent);
            return true;
        } else if (action != 1) {
            if (action == 2) {
                if (pVar.f45474h) {
                    pVar.f45471e.mo22008e();
                    pVar.f45471e.mo22007d(motionEvent);
                    pVar.f45470d.mo22026e(C15152n.f45458c, new C15133c(motionEvent.getRawX(), motionEvent.getRawY()));
                }
                if (pVar.f45474h || Math.hypot((double) (motionEvent.getRawX() - pVar.f45472f.x), (double) (motionEvent.getRawY() - pVar.f45472f.y)) <= ((double) TypedValue.applyDimension(1, 5.0f, pVar.f45469c.getResources().getDisplayMetrics()))) {
                    return true;
                }
                C59104x b = C15154p.f45467a.mo56224b();
                b.mo56378ag(C58975e.f156826a, "Morris.TouchHandler");
                ((C59052c) ((C59052c) b).mo56372aa(45985)).mo56386p("Bubble dragging movement started.");
                pVar.f45474h = true;
                C14371gt gtVar = (C14371gt) C14492lf.f43796e.createBuilder();
                C14369gr grVar = (C14369gr) C14370gs.f43489c.createBuilder();
                grVar.copyOnWrite();
                ((C14370gs) grVar.instance).f43491a = 2;
                gtVar.copyOnWrite();
                C14492lf lfVar = (C14492lf) gtVar.instance;
                C14370gs gsVar = (C14370gs) grVar.build();
                gsVar.getClass();
                lfVar.f43801d = gsVar;
                lfVar.f43800c = 24;
                ((C14986h) pVar.f45468b.mo17428b()).mo21875g((C14492lf) gtVar.build());
                return true;
            } else if (action != 3 && action != 4) {
                pVar.mo22029a(0.0f, 0.0f, (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                return false;
            } else if (!pVar.f45474h) {
                return true;
            } else {
                pVar.f45471e.mo22007d(motionEvent);
                pVar.mo22029a(pVar.f45471e.mo22004a(), pVar.f45471e.mo22005b(), (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
                return true;
            }
        } else if (pVar.f45474h) {
            pVar.f45471e.mo22007d(motionEvent);
            pVar.mo22029a(pVar.f45471e.mo22004a(), pVar.f45471e.mo22005b(), (int) motionEvent.getRawX(), (int) motionEvent.getRawY());
            return true;
        } else {
            C14371gt gtVar2 = (C14371gt) C14492lf.f43796e.createBuilder();
            C14490ld ldVar = (C14490ld) C14491le.f43793b.createBuilder();
            ldVar.copyOnWrite();
            ((C14491le) ldVar.instance).f43795a = 15;
            gtVar2.copyOnWrite();
            C14492lf lfVar2 = (C14492lf) gtVar2.instance;
            C14491le leVar = (C14491le) ldVar.build();
            leVar.getClass();
            lfVar2.f43799b = leVar;
            lfVar2.f43798a = 2;
            ((C14986h) pVar.f45468b.mo17428b()).mo21875g((C14492lf) gtVar2.build());
            return true;
        }
    }
}
