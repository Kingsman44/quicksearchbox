package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Intent;
import android.os.Bundle;
import com.google.android.apps.gsa.assistant.p510b.p511a.C9439b;
import com.google.android.apps.gsa.h.s.aa;
import com.google.android.apps.gsa.h.s.ac;
import com.google.android.apps.gsa.h.s.af;
import com.google.android.apps.gsa.h.s.m;
import com.google.android.apps.gsa.h.s.s;
import com.google.android.apps.gsa.opaonboarding.C83880an;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.opaonboarding.C83909c;
import com.google.android.apps.gsa.opaonboarding.p6462d.C83935v;
import com.google.android.apps.gsa.p5855h.p5861s.C74542ab;
import com.google.android.apps.gsa.p5855h.p5861s.C74543ad;
import com.google.android.apps.gsa.p5855h.p5861s.C74544ae;
import com.google.android.apps.gsa.p5855h.p5861s.C74545ah;
import com.google.android.apps.gsa.p5855h.p5861s.C74554t;
import com.google.android.apps.gsa.p5855h.p5861s.C74555u;
import com.google.android.setupcompat.p3550b.C45250g;
import com.google.common.base.C58831av;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62974ct;
import com.google.protobuf.contrib.android.ProtoParsers;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.bf */
/* compiled from: PG */
public final class C108849bf extends C83907bm {

    /* renamed from: d */
    private static final C59071e f302660d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.errorui.bf");

    /* renamed from: b */
    public C83880an f302661b;

    /* renamed from: c */
    public int f302662c = 1;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1000) {
            this.f302662c = i2;
            if (i2 == 0) {
                getActivity().finish();
                i2 = 0;
            }
            C83909c.m133669a(getActivity());
            if (i2 == -1 || i2 == 1 || i2 == 2) {
                mo77318iT().mo77312a();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        Intent intent;
        super.onCreate(bundle);
        C9439b a = C9439b.m23955a(((Bundle) C58831av.m90830c(getArguments(), Bundle.EMPTY)).getInt("enrollment_entry_id", 0));
        C74554t i = C74555u.m120572i();
        i.mo70869c(a);
        i.mo70868b(s.a);
        C59071e eVar = f302660d;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(24391)).mo56389s("startEnrollmentActivity: enrollmentEntryId = %s", a);
        int ordinal = a.ordinal();
        if (!(ordinal == 5 || ordinal == 22)) {
            if (ordinal == 67) {
                ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(24393)).mo56386p("Creating intent for blocking opt-in flow.");
                C74543ad d = C74544ae.m120523d();
                d.mo70851c(af.e);
                i.mo70872f(d.mo70849a());
                aa c = C74542ab.m120516c();
                c.c(ac.b);
                i.mo70871e(c.a());
                intent = i.mo70882h();
            } else if (ordinal != 15) {
                if (ordinal != 16) {
                    C74543ad d2 = C74544ae.m120523d();
                    d2.mo70851c(af.a);
                    i.mo70872f(d2.mo70849a());
                    intent = i.mo70882h();
                } else {
                    ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(24394)).mo56386p("Creating intent for blocking opa launch.");
                    C74543ad d3 = C74544ae.m120523d();
                    d3.mo70851c(af.b);
                    i.mo70872f(d3.mo70849a());
                    aa c2 = C74542ab.m120516c();
                    c2.c(ac.b);
                    i.mo70871e(c2.a());
                    intent = i.mo70882h();
                }
            }
            startActivityForResult(intent, 1000);
            C83909c.m133669a(getActivity());
        }
        C83935v vVar = null;
        if (getArguments().keySet().contains("phone-unicorn-info")) {
            try {
                vVar = (C83935v) ProtoParsers.m95520c(getArguments(), "phone-unicorn-info", C83935v.f228590f, C62921ba.m95368a());
            } catch (C62974ct e) {
                ((C59052c) ((C59052c) ((C59052c) f302660d.mo56225c()).mo56382g(e)).mo56372aa(24392)).mo56386p("Failed to parse UnicornInfo");
            }
        }
        C74543ad d4 = C74544ae.m120523d();
        d4.mo70851c(af.d);
        m d5 = C74545ah.m120530d();
        d5.a = vVar;
        d5.b(this.f302661b.mo77229c());
        d5.c(getArguments().getBoolean("use-neutral-buttons"));
        d4.mo70852d(d5.a());
        i.mo70872f(d4.mo70849a());
        aa c3 = C74542ab.m120516c();
        c3.c(ac.c);
        i.mo70871e(c3.a());
        intent = i.mo70882h();
        C45250g.m80605a(getActivity().getIntent(), intent);
        startActivityForResult(intent, 1000);
        C83909c.m133669a(getActivity());
    }
}
