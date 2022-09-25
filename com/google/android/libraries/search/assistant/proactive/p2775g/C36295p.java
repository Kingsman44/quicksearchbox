package com.google.android.libraries.search.assistant.proactive.p2775g;

import android.content.Context;
import android.net.Uri;
import com.google.android.libraries.storage.p3304a.p3305a.C42718e;
import com.google.android.libraries.storage.p3304a.p3305a.C42719f;
import com.google.android.libraries.storage.protostore.C42876ab;
import com.google.android.libraries.storage.protostore.C42877ac;
import com.google.android.libraries.storage.protostore.C42878ad;
import com.google.android.libraries.storage.protostore.C42880af;
import com.google.assistant.p3803ag.p3809c.C49058ex;
import com.google.assistant.p3803ag.p3809c.C49060ez;
import com.google.assistant.p3803ag.p3809c.C49062fa;
import com.google.assistant.p3803ag.p3809c.C49065fd;
import com.google.assistant.p3897e.p3921j.aar;
import com.google.assistant.p3897e.p3921j.aas;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.util.concurrent.C60838bs;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.util.concurrent.Executor;
import p3186j$.time.Duration;

/* renamed from: com.google.android.libraries.search.assistant.proactive.g.p */
/* compiled from: PG */
public final class C36295p implements C36281b {

    /* renamed from: a */
    public static final C59071e f94779a = C59071e.m91332i("com.google.android.libraries.search.assistant.proactive.g.p");

    /* renamed from: b */
    static final Duration f94780b = Duration.ofDays(3);

    /* renamed from: c */
    private final Uri f94781c;

    /* renamed from: d */
    private final C42880af f94782d;

    /* renamed from: e */
    private final Executor f94783e;

    public C36295p(Context context, C42880af afVar, Executor executor) {
        C42718e a = C42719f.m75461a(context);
        C42719f.m75463c("opa");
        a.f111968c = "opa";
        a.mo45821b("NotificationActions.pb");
        this.f94781c = a.mo45820a();
        this.f94782d = afVar;
        this.f94783e = executor;
    }

    /* renamed from: f */
    private final C42876ab m64767f() {
        C42880af afVar = this.f94782d;
        C42877ac i = C42878ad.m75739i();
        i.mo45968e(this.f94781c);
        i.mo45967d(C49065fd.f126914b);
        return afVar.mo45979a(i.mo45964a());
    }

    /* renamed from: g */
    private final void m64768g(String str, C49062fa faVar) {
        C60846c.m92878g(m64767f().mo46039a(new C36288i(str, faVar), this.f94783e), Throwable.class, C36289j.f94773a, this.f94783e);
    }

    /* renamed from: a */
    public final C60870cx mo40089a() {
        return m64767f().mo46042d();
    }

    /* renamed from: b */
    public final C60870cx mo40090b(aas aas) {
        if ((aas.f134663a & 65536) != 0) {
            return C60846c.m92878g(C60922j.m93044g(C60838bs.m92859i(m64767f().mo46042d()), new C36282c(aas), this.f94783e), Throwable.class, C36286g.f94768a, this.f94783e);
        }
        return C60856cj.m92900i(C49060ez.UNKNOWN);
    }

    /* renamed from: c */
    public final void mo40091c(aas aas) {
        C49060ez ezVar;
        if (aas.f134670h.isEmpty()) {
            C59104x c = f94779a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "NotificationActions");
            ((C59052c) ((C59052c) c).mo56372aa(52284)).mo56386p("Missing grouping key.");
        } else if ((aas.f134663a & 65536) != 0) {
            String str = aas.f134670h;
            C49058ex exVar = (C49058ex) C49062fa.f126907e.createBuilder();
            int a = aar.m86269a(aas.f134664b);
            if (a != 0 && a == 4) {
                ezVar = C49060ez.DISMISSED;
            } else {
                ezVar = C49060ez.DELIVERED;
            }
            exVar.copyOnWrite();
            C49062fa faVar = (C49062fa) exVar.instance;
            faVar.f126910b = ezVar.f126905e;
            faVar.f126909a |= 1;
            long j = aas.f134678p;
            exVar.copyOnWrite();
            C49062fa faVar2 = (C49062fa) exVar.instance;
            faVar2.f126909a |= 4;
            faVar2.f126912d = j;
            C60846c.m92878g(m64767f().mo46039a(new C36287h(str, (C49062fa) exVar.build()), this.f94783e), Throwable.class, C36283d.f94765a, this.f94783e);
        } else {
            C59104x c2 = f94779a.mo56225c();
            c2.mo56378ag(C58975e.f156826a, "NotificationActions");
            ((C59052c) ((C59052c) c2).mo56372aa(52283)).mo56386p("Missing push time.");
        }
    }

    /* renamed from: d */
    public final void mo40092d(String str) {
        C49058ex exVar = (C49058ex) C49062fa.f126907e.createBuilder();
        C49060ez ezVar = C49060ez.DISMISSED;
        exVar.copyOnWrite();
        C49062fa faVar = (C49062fa) exVar.instance;
        faVar.f126910b = ezVar.f126905e;
        faVar.f126909a |= 1;
        m64768g(str, (C49062fa) exVar.build());
    }

    /* renamed from: e */
    public final void mo40093e(String str, int i) {
        C49058ex exVar = (C49058ex) C49062fa.f126907e.createBuilder();
        C49060ez ezVar = C49060ez.TAPPED;
        exVar.copyOnWrite();
        C49062fa faVar = (C49062fa) exVar.instance;
        faVar.f126910b = ezVar.f126905e;
        faVar.f126909a |= 1;
        exVar.copyOnWrite();
        C49062fa faVar2 = (C49062fa) exVar.instance;
        faVar2.f126909a |= 2;
        faVar2.f126911c = i;
        m64768g(str, (C49062fa) exVar.build());
    }
}
