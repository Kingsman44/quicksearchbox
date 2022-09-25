package com.google.android.apps.gsa.search.shared.actions.util;

import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58485gu;
import com.google.p4152bb.p4153a.C54944ab;
import com.google.p4152bb.p4153a.C55263lx;
import com.google.p5277z.p5282c.C68032v;
import com.google.p5277z.p5282c.C68033w;
import com.google.p5277z.p5282c.C68036z;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.search.shared.actions.util.b */
/* compiled from: PG */
public final class C87480b {

    /* renamed from: a */
    public boolean f236288a = false;

    /* renamed from: b */
    public boolean f236289b = false;

    /* renamed from: c */
    public C54944ab f236290c = C54944ab.UNKNOWN;

    /* renamed from: d */
    public List f236291d = C58485gu.m89846n(-1);

    /* renamed from: e */
    public C55263lx f236292e;

    /* renamed from: f */
    public List f236293f;

    /* renamed from: g */
    public boolean f236294g = false;

    /* renamed from: h */
    public boolean f236295h;

    /* renamed from: i */
    private String f236296i = null;

    /* renamed from: j */
    private TtsRequest f236297j = null;

    /* renamed from: k */
    private boolean f236298k = false;

    /* renamed from: l */
    private boolean f236299l = false;

    /* renamed from: m */
    private boolean f236300m = false;

    /* renamed from: n */
    private boolean f236301n = false;

    /* renamed from: o */
    private long f236302o = 0;

    /* renamed from: p */
    private C54944ab f236303p = C54944ab.UNKNOWN;

    /* renamed from: q */
    private C68036z f236304q;

    /* renamed from: r */
    private List f236305r;

    /* renamed from: a */
    public final CardDecision mo81459a() {
        return new CardDecision(this.f236296i, this.f236297j, this.f236293f, this.f236298k, this.f236288a, this.f236299l, this.f236289b, this.f236300m, this.f236301n, this.f236302o, this.f236303p, this.f236290c, this.f236291d, this.f236304q, this.f236292e, this.f236294g, this.f236305r, this.f236295h, false, false);
    }

    /* renamed from: b */
    public final void mo81460b(C68032v vVar, long j, boolean z, boolean z2) {
        C68033w wVar = (C68033w) C68036z.f184326f.createBuilder();
        wVar.copyOnWrite();
        C68036z zVar = (C68036z) wVar.instance;
        vVar.getClass();
        zVar.f184329b = vVar;
        zVar.f184328a |= 1;
        wVar.copyOnWrite();
        C68036z zVar2 = (C68036z) wVar.instance;
        zVar2.f184328a |= 4;
        zVar2.f184330c = j;
        wVar.copyOnWrite();
        C68036z zVar3 = (C68036z) wVar.instance;
        zVar3.f184332e = 1;
        zVar3.f184328a |= 8;
        if (z2) {
            wVar.mo60080a(3);
        }
        if (z) {
            wVar.mo60080a(2);
        }
        this.f236304q = (C68036z) wVar.build();
    }

    /* renamed from: c */
    public final void mo81461c(PromptSegment promptSegment) {
        if (this.f236305r == null) {
            this.f236305r = new ArrayList();
        }
        this.f236305r.add(promptSegment);
        this.f236290c = C54944ab.UNKNOWN;
        if (promptSegment.f236272b != null) {
            this.f236298k = true;
        }
    }

    /* renamed from: d */
    public final void mo81462d(long j) {
        C58838bb.m90883r(!this.f236301n);
        this.f236300m = true;
        this.f236302o = j;
    }

    /* renamed from: e */
    public final void mo81463e() {
        C58838bb.m90883r(!this.f236300m);
        C58838bb.m90883r(!this.f236299l);
        this.f236301n = true;
    }

    /* renamed from: f */
    public final void mo81464f() {
        boolean z = true;
        this.f236298k = true;
        if (this.f236297j != null) {
            z = false;
        }
        C58838bb.m90883r(z);
    }

    /* renamed from: g */
    public final void mo81465g() {
        C58838bb.m90883r(!this.f236301n);
        this.f236299l = true;
    }

    /* renamed from: i */
    public final void mo81467i(TtsRequest ttsRequest, C54944ab abVar) {
        this.f236297j = ttsRequest;
        this.f236303p = abVar;
        this.f236290c = C54944ab.UNKNOWN;
        this.f236298k = true;
    }

    /* renamed from: h */
    public final void mo81466h(String str, C54944ab abVar) {
        str.getClass();
        this.f236296i = str;
        this.f236303p = abVar;
        this.f236290c = C54944ab.UNKNOWN;
    }
}
