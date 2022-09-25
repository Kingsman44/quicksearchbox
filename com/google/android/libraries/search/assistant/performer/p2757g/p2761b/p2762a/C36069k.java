package com.google.android.libraries.search.assistant.performer.p2757g.p2761b.p2762a;

import android.os.SystemClock;
import android.support.p031v4.media.session.C0298ao;
import android.support.p031v4.media.session.C0320v;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60931s;
import java.util.concurrent.TimeoutException;
import p3186j$.util.Optional;

/* renamed from: com.google.android.libraries.search.assistant.performer.g.b.a.k */
/* compiled from: PG */
public final /* synthetic */ class C36069k implements C60931s {

    /* renamed from: a */
    public final /* synthetic */ C36075q f94351a;

    /* renamed from: b */
    public final /* synthetic */ String f94352b;

    /* renamed from: c */
    public final /* synthetic */ C0320v f94353c;

    /* renamed from: d */
    public final /* synthetic */ Optional f94354d;

    public /* synthetic */ C36069k(C36075q qVar, String str, C0320v vVar, Optional optional) {
        this.f94351a = qVar;
        this.f94352b = str;
        this.f94353c = vVar;
        this.f94354d = optional;
    }

    public final C60870cx apply(Object obj) {
        C36075q qVar = this.f94351a;
        String str = this.f94352b;
        C0320v vVar = this.f94353c;
        Optional optional = this.f94354d;
        TimeoutException timeoutException = (TimeoutException) obj;
        if (!qVar.f94376g || !qVar.f94378i.mo60456a() || (!"media.PLAY_MEDIA".equals(str) && !"media.RESUME".equals(str))) {
            C59104x b = C36075q.f94370a.mo56224b();
            b.mo56378ag(C58975e.f156826a, "MediaPerformerExecutor");
            ((C59052c) ((C59052c) b).mo56372aa(52172)).mo56386p("Failed to get updated playback state from provider, returns success as media session is still active and playback change might happen later.");
            return qVar.mo39963d(vVar, optional, str);
        }
        C59104x b2 = C36075q.f94370a.mo56224b();
        b2.mo56378ag(C58975e.f156826a, "MediaPerformerExecutor");
        ((C59052c) ((C59052c) b2).mo56372aa(52173)).mo56386p("Failed to get updated playback state from provider, execution timed out with signal that media session has been destroyed.");
        C0298ao aoVar = new C0298ao();
        aoVar.mo984c(7, 0, 0.0f, SystemClock.elapsedRealtime());
        return C60856cj.m92900i(qVar.mo39962c(vVar, optional, aoVar.mo982a(), str));
    }
}
