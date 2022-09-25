package com.google.android.apps.gsa.nga.engine.education.pie.p6019a;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.education.C75688am;
import com.google.android.apps.gsa.nga.engine.education.pie.C75862d;
import com.google.android.apps.gsa.nga.engine.education.pie.p6020b.C75855v;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75879ag;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75880ah;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75886g;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75888i;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75890k;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75897r;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75898s;
import com.google.android.apps.gsa.nga.engine.p5964av.C75050a;
import com.google.android.apps.gsa.nga.engine.p5964av.C75158f;
import com.google.android.apps.gsa.nga.engine.p6029g.C76092h;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.apps.gsa.nga.shared.p6368u.C81515c;
import com.google.android.apps.gsa.shared.p7066m.C90126fx;
import com.google.android.apps.gsa.shared.util.p7188v.C91142g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.a.e */
/* compiled from: PG */
public final class C75776e extends C75770ag {

    /* renamed from: a */
    private static final C58974d f210294a = C58974d.m91136j();

    /* renamed from: b */
    private final C75880ah f210295b;

    /* renamed from: c */
    private final C75888i f210296c;

    /* renamed from: h */
    private final C75898s f210297h;

    /* renamed from: i */
    private final C75886g f210298i;

    /* renamed from: j */
    private final C75890k f210299j;

    /* renamed from: k */
    private final C91142g f210300k;

    public C75776e(Bundle bundle, C75880ah ahVar, C75888i iVar, C75898s sVar, C75886g gVar, C75890k kVar, C91142g gVar2) {
        super(bundle, C80267v.APP_OPEN);
        this.f210295b = ahVar;
        this.f210296c = iVar;
        this.f210297h = sVar;
        this.f210298i = gVar;
        this.f210299j = kVar;
        this.f210300k = gVar2;
    }

    /* renamed from: e */
    public static void m122138e(Bundle bundle, String str, String str2, int i) {
        bundle.putString("APP_NAME", str);
        bundle.putString("APP_PACKAGE", str2);
        bundle.putInt("INVOCATION_MODE", i - 1);
    }

    /* renamed from: a */
    public final C75862d mo71872a() {
        return C75862d.EMPTY;
    }

    /* renamed from: c */
    public final C58485gu mo71874c() {
        String string = this.f210267e.getString("APP_NAME", BuildConfig.FLAVOR);
        if (string.isEmpty()) {
            ((C58970a) ((C58970a) f210294a.mo56225c()).mo56372aa(3344)).mo56386p("App name not provided");
            return C58485gu.m89845m();
        }
        String string2 = this.f210267e.getString("APP_PACKAGE", BuildConfig.FLAVOR);
        if (string2.isEmpty()) {
            ((C58970a) ((C58970a) f210294a.mo56225c()).mo56372aa(3343)).mo56386p("App package not provided");
            return C58485gu.m89845m();
        }
        int i = C75780i.m122146a()[this.f210267e.getInt("INVOCATION_MODE", 0)];
        C75898s sVar = this.f210297h;
        string.getClass();
        string2.getClass();
        C75688am amVar = (C75688am) sVar.f210593a.mo17428b();
        amVar.getClass();
        C75855v vVar = (C75855v) sVar.f210594b.mo17428b();
        vVar.getClass();
        C75050a aVar = (C75050a) sVar.f210595c.mo17428b();
        aVar.getClass();
        C75158f fVar = (C75158f) sVar.f210596d.mo17428b();
        fVar.getClass();
        C76092h hVar = (C76092h) sVar.f210597e.mo17428b();
        hVar.getClass();
        C91142g gVar = (C91142g) sVar.f210598f.mo17428b();
        gVar.getClass();
        C81515c cVar = (C81515c) sVar.f210599g.mo17428b();
        cVar.getClass();
        C75897r rVar = new C75897r(this, string, string2, amVar, vVar, aVar, fVar, hVar, gVar, cVar);
        int i2 = i - 1;
        Object obj = null;
        if (i != 0) {
            if (i2 == 0) {
                obj = this.f210296c.mo71946a(this);
            } else if (i2 == 1) {
                obj = this.f210299j.mo71948a(this);
            } else if (i2 == 2) {
                obj = this.f210298i.mo71945a(this, rVar.mo71952l());
                rVar.f210601b = true;
            }
            C75879ag a = this.f210295b.mo71943a(this);
            obj.getClass();
            return C58485gu.m89848p(a, obj, rVar);
        }
        throw null;
    }

    /* renamed from: d */
    public final int mo71888d() {
        int d = (int) this.f210300k.mo85399d(C90126fx.f251620mJ);
        if (d >= 0) {
            C75787p.m122158a();
            if (d < 3) {
                return C75787p.m122158a()[d];
            }
        }
        ((C58970a) ((C58970a) f210294a.mo56225c()).mo56372aa(3342)).mo56387q("Invalid failureMode flag value %d", d);
        return 2;
    }
}
