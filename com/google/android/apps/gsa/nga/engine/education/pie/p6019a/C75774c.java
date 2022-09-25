package com.google.android.apps.gsa.nga.engine.education.pie.p6019a;

import android.os.Bundle;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.nga.engine.ag.c;
import com.google.android.apps.gsa.nga.engine.education.pie.C75862d;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75879ag;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75880ah;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75888i;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75890k;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75895p;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75896q;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75903x;
import com.google.android.apps.gsa.nga.engine.education.pie.p6025f.C75904y;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80243cj;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80244ck;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80246cm;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80267v;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80268w;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80269x;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80270y;
import com.google.android.apps.gsa.nga.shared.p6275aa.p6279d.p6280a.C80271z;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4526f.p4527a.C58974d;
import java.util.ArrayList;
import java.util.Collection;
import p3186j$.util.Collection;
import p3186j$.util.stream.Collectors;

/* renamed from: com.google.android.apps.gsa.nga.engine.education.pie.a.c */
/* compiled from: PG */
public final class C75774c extends C75770ag {

    /* renamed from: a */
    private static final C58974d f210279a = C58974d.m91136j();

    /* renamed from: b */
    private final C75880ah f210280b;

    /* renamed from: c */
    private final C75888i f210281c;

    /* renamed from: h */
    private final C75896q f210282h;

    /* renamed from: i */
    private final C75904y f210283i;

    /* renamed from: j */
    private final C75890k f210284j;

    /* renamed from: k */
    private final String f210285k;

    /* renamed from: l */
    private final String f210286l;

    /* renamed from: m */
    private final C80269x f210287m;

    /* renamed from: n */
    private final boolean f210288n;

    public C75774c(Bundle bundle, C75880ah ahVar, C75888i iVar, C75896q qVar, C75904y yVar, C75890k kVar) {
        super(bundle, C80267v.APP_EDUCATION);
        this.f210280b = ahVar;
        this.f210281c = iVar;
        this.f210282h = qVar;
        this.f210283i = yVar;
        this.f210284j = kVar;
        this.f210285k = bundle.getString("APP_PACKAGE", BuildConfig.FLAVOR);
        this.f210286l = bundle.getString("QUERY", BuildConfig.FLAVOR);
        C58485gu g = m122133g(bundle, "FOLLOWUP_QUERY_TITLES");
        C58485gu g2 = m122133g(bundle, "FOLLOWUP_QUERY_QUERIES");
        if (g.size() != g2.size()) {
            ((C58970a) ((C58970a) f210279a.mo56225c()).mo56372aa(3341)).mo56386p("Mismatched size of followup queries");
        }
        C80268w wVar = (C80268w) C80269x.f220270b.createBuilder();
        for (int i = 0; i < Math.min(g2.size(), g.size()); i++) {
            C80270y yVar2 = (C80270y) C80271z.f220273d.createBuilder();
            String str = (String) g.get(i);
            yVar2.copyOnWrite();
            C80271z zVar = (C80271z) yVar2.instance;
            str.getClass();
            zVar.f220275a |= 1;
            zVar.f220276b = str;
            String str2 = (String) g2.get(i);
            yVar2.copyOnWrite();
            C80271z zVar2 = (C80271z) yVar2.instance;
            str2.getClass();
            zVar2.f220275a |= 2;
            zVar2.f220277c = str2;
            wVar.mo74298a(yVar2);
        }
        this.f210287m = (C80269x) wVar.build();
        this.f210288n = bundle.getBoolean("SKIP_INVOCATION", false);
    }

    /* renamed from: e */
    public static void m122132e(Bundle bundle, String str, C80269x xVar, boolean z) {
        bundle.putString("APP_PACKAGE", "com.google.android.apps.maps");
        bundle.putString("QUERY", str);
        bundle.putStringArrayList("FOLLOWUP_QUERY_TITLES", new ArrayList((Collection) Collection.EL.stream(xVar.f220272a).map(C75763a.f210255a).collect(Collectors.toList())));
        bundle.putStringArrayList("FOLLOWUP_QUERY_QUERIES", new ArrayList((java.util.Collection) Collection.EL.stream(xVar.f220272a).map(C75773b.f210278a).collect(Collectors.toList())));
        bundle.putBoolean("SKIP_INVOCATION", z);
    }

    /* renamed from: g */
    private static C58485gu m122133g(Bundle bundle, String str) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
        if (stringArrayList == null) {
            return C58485gu.m89845m();
        }
        return C58485gu.m89842j(stringArrayList);
    }

    /* renamed from: a */
    public final C75862d mo71872a() {
        return C75862d.EMPTY;
    }

    /* renamed from: b */
    public final C80244ck mo71873b() {
        C80243cj cjVar = (C80243cj) C80244ck.f220137i.createBuilder();
        C80246cm cmVar = C80246cm.ASSIST_SHELF;
        cjVar.copyOnWrite();
        C80244ck ckVar = (C80244ck) cjVar.instance;
        ckVar.f220140b = cmVar.f220162n;
        ckVar.f220139a |= 1;
        C80269x xVar = this.f210287m;
        cjVar.copyOnWrite();
        C80244ck ckVar2 = (C80244ck) cjVar.instance;
        xVar.getClass();
        ckVar2.f220144f = xVar;
        ckVar2.f220139a |= 16;
        return (C80244ck) cjVar.build();
    }

    /* renamed from: c */
    public final C58485gu mo71874c() {
        Object obj;
        if (this.f210285k.isEmpty()) {
            ((C58970a) ((C58970a) f210279a.mo56225c()).mo56372aa(3340)).mo56386p("App package not provided");
            return C58485gu.m89845m();
        } else if (this.f210286l.isEmpty()) {
            ((C58970a) ((C58970a) f210279a.mo56225c()).mo56372aa(3339)).mo56386p("Query not provided");
            return C58485gu.m89845m();
        } else {
            C75879ag a = this.f210280b.mo71943a(this);
            if (this.f210288n) {
                obj = this.f210284j.mo71948a(this);
            } else {
                obj = this.f210281c.mo71946a(this);
            }
            C75895p a2 = this.f210282h.mo71954a(this, this.f210286l, true);
            C75904y yVar = this.f210283i;
            String str = this.f210285k;
            str.getClass();
            c cVar = (c) yVar.f210618a.mo17428b();
            cVar.getClass();
            C22871g gVar = (C22871g) yVar.f210619b.mo17428b();
            gVar.getClass();
            return C58485gu.m89849q(a, obj, a2, new C75903x(this, str, cVar, gVar));
        }
    }

    /* renamed from: d */
    public final int mo71888d() {
        return 3;
    }
}
