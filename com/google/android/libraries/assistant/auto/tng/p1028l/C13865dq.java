package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.common.base.C58838bb;
import com.google.common.p4526f.C59052c;
import java.util.Iterator;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.dq */
/* compiled from: PG */
public final /* synthetic */ class C13865dq implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C13866dr f42226a;

    public /* synthetic */ C13865dq(C13866dr drVar) {
        this.f42226a = drVar;
    }

    public final void run() {
        boolean z;
        C13866dr drVar = this.f42226a;
        C13869du duVar = drVar.f42241o;
        long c = drVar.f42237k.mo26871c();
        long j = c - drVar.f42228b;
        long j2 = c - drVar.f42243q;
        if (drVar.f42241o == C13869du.NO_PROGRESS || j2 <= drVar.f42231e) {
            long j3 = j - drVar.f42239m;
            if (drVar.f42241o == C13869du.UNKNOWN && j3 > drVar.f42230d) {
                drVar.f42241o = C13869du.SLOW;
                ((C59052c) ((C59052c) C13866dr.f42227a.mo56224b()).mo56372aa(45096)).mo56354G("%s Recognition is not started but recognitionProgressLag > progressLagThreshold -> latestRecognitionSpeed: %s", drVar.f42236j, drVar.f42241o);
                drVar.mo21318a();
                drVar.f42238l.mo21260a(drVar.f42236j, drVar.f42241o);
            } else if (drVar.f42244r && !drVar.f42245s) {
                while (true) {
                    z = true;
                    if (c - ((Long) drVar.f42235i.getFirst()).longValue() <= drVar.f42229c || drVar.f42234h.size() <= 1) {
                        long j4 = drVar.f42239m - drVar.f42240n;
                    } else {
                        drVar.f42234h.removeFirst();
                        drVar.f42235i.removeFirst();
                    }
                }
                long j42 = drVar.f42239m - drVar.f42240n;
                if (j42 < 0) {
                    z = false;
                }
                C58838bb.m90884s(z, "recognitionProgressDelta should not be negative!");
                drVar.f42234h.addLast(Float.valueOf(((float) j42) / ((float) Math.max(c - drVar.f42242p, 1))));
                drVar.f42235i.addLast(Long.valueOf(c));
                Iterator it = drVar.f42234h.iterator();
                float f = 0.0f;
                while (it.hasNext()) {
                    f += ((Float) it.next()).floatValue();
                }
                float size = f / ((float) drVar.f42234h.size());
                if (j3 > drVar.f42230d) {
                    drVar.f42241o = C13869du.SLOW;
                    ((C59052c) ((C59052c) C13866dr.f42227a.mo56224b()).mo56372aa(45095)).mo56389s("%s recognitionProgressLag > progressLagThreshold -> RecognitionSpeed.SLOW", drVar.f42236j);
                } else {
                    double d = (double) size;
                    drVar.f42241o = d < drVar.f42232f ? C13869du.SLOW : d > drVar.f42233g ? C13869du.FAST : C13869du.NORMAL;
                }
                if (drVar.f42241o != duVar) {
                    ((C59052c) ((C59052c) C13866dr.f42227a.mo56224b()).mo56372aa(45094)).mo56359L("%s, recognition speed changed. previous speed: %s, new speed: %s", drVar.f42236j, duVar, drVar.f42241o);
                    drVar.mo21318a();
                    drVar.f42238l.mo21260a(drVar.f42236j, drVar.f42241o);
                }
                drVar.f42237k.mo26871c();
            }
        } else {
            drVar.f42241o = C13869du.NO_PROGRESS;
            ((C59052c) ((C59052c) C13866dr.f42227a.mo56224b()).mo56372aa(45097)).mo56354G("%s noProgressPeriod > noProgressThreshold -> latestRecognitionSpeed: %s", drVar.f42236j, drVar.f42241o);
            drVar.mo21318a();
            drVar.f42238l.mo21260a(drVar.f42236j, drVar.f42241o);
        }
    }
}
