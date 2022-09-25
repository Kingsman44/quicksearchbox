package com.google.android.libraries.lens.view.main;

import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Trace;
import com.google.android.libraries.lens.p2014e.C24181a;
import com.google.android.libraries.lens.p2014e.C24225q;
import com.google.android.libraries.lens.p2014e.C24226r;
import com.google.android.libraries.lens.p2014e.C24227s;
import com.google.android.libraries.lens.view.p2081au.C25559i;
import com.google.android.libraries.lens.view.p2081au.C25560j;
import com.google.android.libraries.lens.view.p2087ay.C25652m;
import com.google.android.libraries.lens.view.p2087ay.C25653n;
import com.google.android.libraries.lens.view.p2087ay.C25664y;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26733ab;
import com.google.android.libraries.lens.view.p2113h.p2121d.C26750b;
import com.google.android.libraries.lens.view.p2153o.C27459a;
import com.google.android.libraries.lens.view.sensors.orientation.C27727d;
import com.google.android.libraries.p1623at.p1632e.C19559g;
import com.google.common.base.C58817ah;
import com.google.common.base.C58833ax;
import com.google.common.base.C58836b;
import com.google.common.base.C58838bb;
import com.google.common.p4522b.C58370cn;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.aae;
import com.google.common.util.concurrent.C60856cj;
import com.google.lens.p4707j.C62496ds;
import com.google.p4242bp.p4257f.p4260b.p4261a.C56220aa;
import java.util.Map;
import p3186j$.util.Collection;

/* renamed from: com.google.android.libraries.lens.view.main.bf */
/* compiled from: PG */
public final /* synthetic */ class C27316bf implements C58817ah {

    /* renamed from: a */
    public final /* synthetic */ C27321bk f74732a;

    /* renamed from: b */
    public final /* synthetic */ C26750b f74733b;

    /* renamed from: c */
    public final /* synthetic */ Bitmap f74734c;

    /* renamed from: d */
    public final /* synthetic */ RectF f74735d;

    /* renamed from: e */
    public final /* synthetic */ C26733ab f74736e;

    /* renamed from: f */
    public final /* synthetic */ aae f74737f;

    /* renamed from: g */
    public final /* synthetic */ C58833ax f74738g;

    public /* synthetic */ C27316bf(C27321bk bkVar, C26750b bVar, Bitmap bitmap, RectF rectF, C26733ab abVar, aae aae, C58833ax axVar) {
        this.f74732a = bkVar;
        this.f74733b = bVar;
        this.f74734c = bitmap;
        this.f74735d = rectF;
        this.f74736e = abVar;
        this.f74737f = aae;
        this.f74738g = axVar;
    }

    public final Object apply(Object obj) {
        C27321bk bkVar = this.f74732a;
        C26750b bVar = this.f74733b;
        Bitmap bitmap = this.f74734c;
        RectF rectF = this.f74735d;
        C26733ab abVar = this.f74736e;
        aae aae = this.f74737f;
        C58833ax axVar = this.f74738g;
        Map map = (Map) obj;
        C27327bq bqVar = bkVar.f74748a;
        if (!bqVar.f74765K || !bqVar.f74770P.mo30526c()) {
            return false;
        }
        C58838bb.m90866a(map, "Each frame sent for prefetch has to get results from tracker.");
        C25664y yVar = bkVar.f74748a.f74808m;
        long a = bVar.mo32082a();
        Trace.beginSection("GM:getObjectPredictions");
        C58833ax a2 = yVar.f69798n.mo30741a(a, map, (C58485gu) Collection.EL.stream(yVar.mo30772f()).filter(C25652m.f69772a).filter(C25653n.f69773a).collect(C58370cn.f155946a));
        Trace.endSection();
        C56220aa aaVar = (C56220aa) a2.mo56109e(C56220aa.f149748b);
        C27327bq bqVar2 = bkVar.f74748a;
        C58833ax axVar2 = bqVar2.f74792al;
        bqVar2.f74792al = C58836b.f156633a;
        C24225q o = C24227s.m45178o();
        o.mo29649b(bitmap);
        C24181a aVar = (C24181a) o;
        aVar.f66092c = rectF;
        aVar.f66097h = 3;
        o.mo29652e(C24226r.CAMERA);
        aVar.f66098i = 3;
        o.mo29653f(bVar.mo32082a());
        C27727d dVar = bkVar.f74748a.f74783ac;
        int i = -1;
        if (dVar.f75702f != -1) {
            i = (dVar.f75702f + dVar.f75699c.mo33218a().mo33214a()) % 360;
        }
        o.mo29651d(i);
        aVar.f66093d = abVar;
        aVar.f66094e = aae;
        aVar.f66095f = C58833ax.m90833j((Float) axVar.mo56111f());
        aVar.f66096g = C58833ax.m90833j((RectF) axVar2.mo56111f());
        C25559i e = C25560j.m47126e(o.mo29648a());
        e.mo30612b(aaVar);
        C25560j a3 = e.mo30611a();
        C27288ae aeVar = bkVar.f74748a.f74816u;
        C19559g.m37304c();
        C58838bb.m90873h(C24226r.CAMERA.equals(a3.mo30614a().mo29709e()), "Expected CAMERA image, not %s", a3.mo30614a().mo29709e());
        if (aeVar.f74680m != null) {
            ((C58970a) ((C58970a) C27288ae.f74662a.mo56225c()).mo56372aa(49694)).mo56386p("Received new CAMERA image when already frozen");
        } else {
            if (aeVar.f74684q != null) {
                aeVar.mo32827d();
                aeVar.mo32828e();
            }
            C27440t tVar = aeVar.f74685r;
            aeVar.f74685r = null;
            if (tVar != null) {
                C27288ae aeVar2 = tVar.f75086a;
                C62496ds dsVar = tVar.f75087b;
                Runnable runnable = tVar.f75088c;
                C19559g.m37304c();
                aeVar2.f74681n = dsVar;
                aeVar2.mo32841r(C60856cj.m92900i(a3));
                runnable.run();
            } else {
                aeVar.mo32841r(C60856cj.m92900i(a3));
            }
            C27459a aVar2 = aeVar.f74677j;
            if (aVar2 != null) {
                a3.mo30614a().mo29705a();
                aVar2.mo33000d();
            }
        }
        return true;
    }
}
