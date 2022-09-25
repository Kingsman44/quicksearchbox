package com.google.android.libraries.assistant.auto.tng.p1028l;

import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2875c.C37179a;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.p4526f.C59071e;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60888db;
import com.google.common.util.concurrent.C60904dr;
import com.google.speech.recognizer.p5233a.C67437af;
import com.google.speech.recognizer.p5233a.C67438ag;
import com.google.speech.recognizer.p5233a.C67442ak;
import com.google.speech.recognizer.p5233a.C67476x;
import java.util.ArrayDeque;
import java.util.concurrent.Executor;
import p5460g.p5461a.C69464a;

/* renamed from: com.google.android.libraries.assistant.auto.tng.l.dr */
/* compiled from: PG */
public final class C13866dr {

    /* renamed from: a */
    public static final C59071e f42227a = C59071e.m91332i("com.google.android.libraries.assistant.auto.tng.l.dr");

    /* renamed from: b */
    public final long f42228b;

    /* renamed from: c */
    public final long f42229c;

    /* renamed from: d */
    public final long f42230d;

    /* renamed from: e */
    public final long f42231e;

    /* renamed from: f */
    public final double f42232f;

    /* renamed from: g */
    public final double f42233g;

    /* renamed from: h */
    public final ArrayDeque f42234h;

    /* renamed from: i */
    public final ArrayDeque f42235i;

    /* renamed from: j */
    public final C13871dw f42236j;

    /* renamed from: k */
    public final C21370a f42237k;

    /* renamed from: l */
    public final C13870dv f42238l;

    /* renamed from: m */
    public long f42239m;

    /* renamed from: n */
    public long f42240n;

    /* renamed from: o */
    public C13869du f42241o;

    /* renamed from: p */
    public long f42242p;

    /* renamed from: q */
    public long f42243q;

    /* renamed from: r */
    public boolean f42244r;

    /* renamed from: s */
    public boolean f42245s;

    /* renamed from: t */
    private final C37215b f42246t;

    /* renamed from: u */
    private final Executor f42247u;

    /* renamed from: v */
    private boolean f42248v;

    public C13866dr(long j, long j2, C13871dw dwVar, C13870dv dvVar, C21370a aVar, C69464a aVar2, C69464a aVar3, C69464a aVar4, C69464a aVar5, C69464a aVar6, C60888db dbVar, C37215b bVar) {
        this.f42228b = j;
        this.f42236j = dwVar;
        this.f42238l = dvVar;
        this.f42237k = aVar;
        this.f42229c = ((Long) aVar2.mo17428b()).longValue();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f42235i = arrayDeque;
        if (dwVar == C13871dw.EMBEDDED) {
            this.f42230d = ((Long) aVar3.mo17428b()).longValue() + j2;
            this.f42243q = aVar.mo26871c() + j2;
            arrayDeque.addLast(Long.valueOf(aVar.mo26871c() + j2));
        } else {
            this.f42230d = ((Long) aVar3.mo17428b()).longValue();
            this.f42243q = aVar.mo26871c();
            arrayDeque.addLast(Long.valueOf(aVar.mo26871c()));
        }
        this.f42231e = ((Long) aVar4.mo17428b()).longValue();
        this.f42232f = ((Double) aVar5.mo17428b()).doubleValue();
        this.f42233g = ((Double) aVar6.mo17428b()).doubleValue();
        this.f42247u = new C60904dr(dbVar);
        this.f42246t = bVar;
        this.f42239m = 0;
        this.f42240n = 0;
        this.f42242p = 0;
        this.f42241o = C13869du.UNKNOWN;
        ArrayDeque arrayDeque2 = new ArrayDeque();
        this.f42234h = arrayDeque2;
        arrayDeque2.addLast(Float.valueOf(1.0f));
        this.f42244r = false;
        this.f42245s = false;
        this.f42248v = false;
    }

    /* renamed from: a */
    public final void mo21318a() {
        if ((this.f42241o == C13869du.SLOW || this.f42241o == C13869du.NO_PROGRESS) && !this.f42248v) {
            if (this.f42236j == C13871dw.NETWORK) {
                this.f42246t.mo19974a(C37179a.f97412K);
            } else {
                this.f42246t.mo19974a(C37179a.f97413L);
            }
            this.f42248v = true;
        }
    }

    /* renamed from: b */
    public final void mo21319b(C67438ag agVar) {
        long j;
        int a;
        int a2 = C67437af.m97466a(agVar.f183259b);
        if (a2 == 0 || a2 == 1 || ((a = C67437af.m97466a(agVar.f183259b)) != 0 && a == 2)) {
            this.f42240n = this.f42239m;
            this.f42242p = this.f42243q;
            this.f42243q = this.f42237k.mo26871c();
            int a3 = C67437af.m97466a(agVar.f183259b);
            if (a3 == 0) {
                a3 = 1;
            }
            int i = a3 - 1;
            if (i == 0) {
                int i2 = agVar.f183258a;
                if (!((i2 & 8) == 0 && (i2 & 16) == 0)) {
                    if ((i2 & 16) != 0) {
                        C67442ak akVar = agVar.f183263f;
                        if (akVar == null) {
                            akVar = C67442ak.f183276i;
                        }
                        j = akVar.f183280c / 1000;
                    } else {
                        C67476x xVar = agVar.f183262e;
                        if (xVar == null) {
                            xVar = C67476x.f183390i;
                        }
                        j = xVar.f183395d / 1000;
                    }
                    this.f42239m = j;
                }
                if (!this.f42244r) {
                    this.f42244r = true;
                }
            } else if (i == 1) {
                if ((agVar.f183258a & 4) != 0) {
                    C67442ak akVar2 = agVar.f183261d;
                    if (akVar2 == null) {
                        akVar2 = C67442ak.f183276i;
                    }
                    this.f42239m = akVar2.f183280c / 1000;
                }
                this.f42245s = true;
            }
            this.f42237k.mo26871c();
            this.f42237k.mo26871c();
            mo21320c();
        }
    }

    /* renamed from: c */
    public final void mo21320c() {
        C13865dq dqVar = new C13865dq(this);
        C60856cj.m92903l(C47810es.m84977q(dqVar), this.f42247u);
    }
}
