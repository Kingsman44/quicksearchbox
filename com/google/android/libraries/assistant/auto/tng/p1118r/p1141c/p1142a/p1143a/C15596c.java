package com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.p1143a;

import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.auto.ondevice.p705a.C11836c;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1142a.C15593a;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15658j;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15666r;
import com.google.android.libraries.assistant.auto.tng.p1118r.p1141c.p1152b.C15668t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.text.DateFormat;
import java.util.Calendar;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.r.c.a.a.c */
/* compiled from: PG */
public final class C15596c implements C15593a {

    /* renamed from: a */
    public static final C59071e f46638a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.r.c.a.a.c");

    /* renamed from: b */
    public final C69464a f46639b;

    /* renamed from: c */
    private final Executor f46640c;

    /* renamed from: d */
    private final C11836c f46641d;

    public C15596c(C69464a aVar, C11836c cVar, Executor executor) {
        this.f46639b = aVar;
        this.f46641d = cVar;
        this.f46640c = executor;
    }

    /* renamed from: a */
    public final C15668t mo22414a(C15666r rVar) {
        C15595b bVar = new C15595b(this, rVar);
        C60870cx n = C60856cj.m92905n(C47810es.m84965e(bVar), this.f46640c);
        C15658j jVar = new C15658j();
        jVar.f46787a = n;
        return jVar.mo22491a();
    }

    /* renamed from: b */
    public final C60870cx mo22415b() {
        String format = DateFormat.getTimeInstance(3).format(Calendar.getInstance().getTime());
        C60870cx b = this.f46641d.mo20178b(R.string.offline_time_answer, format);
        C15594a aVar = C15594a.f46635a;
        return C60922j.m93044g(b, C47810es.m84963c(aVar), this.f46640c);
    }
}
