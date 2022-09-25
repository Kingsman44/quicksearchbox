package com.google.android.apps.gsa.nga.engine.education.pie.p6019a;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.education.pie.C75862d;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75879ag;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75880ah;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75886g;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75888i;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75890k;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75895p;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75896q;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.a.g */
/* compiled from: PG */
public final class C75778g extends C75770ag {

    /* renamed from: a */
    private static final C58974d f210307a = C58974d.m91136j();

    /* renamed from: b */
    private final C75880ah f210308b;

    /* renamed from: c */
    private final C75888i f210309c;

    /* renamed from: h */
    private final C75886g f210310h;

    /* renamed from: i */
    private final C75896q f210311i;

    /* renamed from: j */
    private final C75890k f210312j;

    public C75778g(Bundle bundle, C75880ah ahVar, C75888i iVar, C75886g gVar, C75896q qVar, C75890k kVar) {
        super(bundle, C80267v.GENERIC_TRY_SAYING);
        this.f210308b = ahVar;
        this.f210309c = iVar;
        this.f210310h = gVar;
        this.f210311i = qVar;
        this.f210312j = kVar;
    }

    /* renamed from: e */
    public static void m122142e(Bundle bundle, String str, int i) {
        bundle.putString("RECOMMENDED_QUERY", str);
        bundle.putInt("INVOCATION_MODE", i - 1);
    }

    /* renamed from: a */
    public final C75862d mo71872a() {
        return C75862d.EMPTY;
    }

    /* renamed from: c */
    public final C58485gu mo71874c() {
        String string = this.f210267e.getString("RECOMMENDED_QUERY", BuildConfig.FLAVOR);
        if (string.isEmpty()) {
            ((C58970a) ((C58970a) f210307a.mo56225c()).mo56372aa(3345)).mo56386p("Recommended query not provided");
            return C58485gu.m89845m();
        }
        C75895p a = this.f210311i.mo71954a(this, string, false);
        int i = C75780i.m122146a()[this.f210267e.getInt("INVOCATION_MODE", 0)];
        int i2 = i - 1;
        Object obj = null;
        if (i != 0) {
            if (i2 == 0) {
                obj = this.f210309c.mo71946a(this);
            } else if (i2 == 1) {
                obj = this.f210312j.mo71948a(this);
            } else if (i2 == 2) {
                obj = this.f210310h.mo71945a(this, a.f210580a);
                a.f210601b = true;
            }
            C75879ag a2 = this.f210308b.mo71943a(this);
            obj.getClass();
            return C58485gu.m89848p(a2, obj, a);
        }
        throw null;
    }

    /* renamed from: d */
    public final int mo71888d() {
        return 3;
    }
}
