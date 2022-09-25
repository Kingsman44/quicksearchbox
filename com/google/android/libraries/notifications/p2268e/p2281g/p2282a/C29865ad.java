package com.google.android.libraries.notifications.p2268e.p2281g.p2282a;

import android.content.Context;
import android.os.Process;
import android.os.UserManager;
import android.text.TextUtils;
import com.google.android.libraries.notifications.data.C29820k;
import com.google.android.libraries.notifications.p2268e.p2281g.C29896g;
import com.google.android.libraries.notifications.platform.p2307a.C30058b;
import com.google.android.libraries.notifications.platform.p2309c.C30075e;
import com.google.android.libraries.notifications.platform.p2318f.p2328d.C30131a;
import com.google.android.p10905k.C146606e;
import com.google.p4160bf.p4161a.p4163b.C55442af;
import com.google.p4160bf.p4161a.p4163b.C55443ag;
import com.google.p4160bf.p4161a.p4163b.C55480bq;
import com.google.p4160bf.p4161a.p4163b.C55481br;
import com.google.p4160bf.p4161a.p4163b.C55482bs;
import com.google.p4160bf.p4161a.p4163b.C55483bt;
import com.google.p4160bf.p4161a.p4163b.C55514v;
import com.google.p4160bf.p4161a.p4163b.C55515w;
import com.google.p4160bf.p4164b.p4165a.C55656cl;
import com.google.p4160bf.p4164b.p4165a.C55657cm;
import com.google.p4160bf.p4164b.p4165a.C55658cn;
import com.google.p4160bf.p4164b.p4165a.C55659co;
import com.google.p4160bf.p4164b.p4165a.C55677q;
import com.google.p4160bf.p4164b.p4165a.C55678r;
import com.google.p4160bf.p4164b.p4165a.C55684x;
import com.google.p4160bf.p4164b.p4165a.C55685y;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import java.util.List;
import p5304e.p5305a.p5306a.p5409o.p5410a.C68958v;

/* renamed from: com.google.android.libraries.notifications.e.g.a.ad */
/* compiled from: PG */
public final class C29865ad implements C29896g {

    /* renamed from: a */
    private final Context f80967a;

    /* renamed from: b */
    private final C30075e f80968b;

    /* renamed from: c */
    private final C30131a f80969c;

    /* renamed from: d */
    private final C29889y f80970d;

    public C29865ad(Context context, C30075e eVar, C30131a aVar, C29889y yVar) {
        this.f80967a = context;
        this.f80968b = eVar;
        this.f80969c = aVar;
        this.f80970d = yVar;
    }

    /* renamed from: d */
    private static long m55288d(Context context) {
        long j = -1;
        try {
            long g = C146606e.m238845g(context.getContentResolver(), -1);
            if (g != -1) {
                return g;
            }
            try {
                C30058b.m55791c("TargetCreatorHelperImpl", "Failed to get android ID.", new Object[0]);
                return g;
            } catch (SecurityException e) {
                e = e;
                j = g;
            }
        } catch (SecurityException e2) {
            e = e2;
            C30058b.m55792d("TargetCreatorHelperImpl", e, "Exception reading GServices key.", new Object[0]);
            return j;
        }
    }

    /* renamed from: e */
    private static long m55289e(Context context) {
        return ((UserManager) context.getSystemService("user")).getSerialNumberForUser(Process.myUserHandle());
    }

    /* renamed from: a */
    public final C55483bt mo35183a(C29820k kVar) {
        C55482bs bsVar = (C55482bs) C55483bt.f146371f.createBuilder();
        String packageName = this.f80967a.getApplicationContext().getPackageName();
        bsVar.copyOnWrite();
        C55483bt btVar = (C55483bt) bsVar.instance;
        packageName.getClass();
        btVar.f146373a |= 4;
        btVar.f146376d = packageName;
        C55442af afVar = (C55442af) C55443ag.f146275f.createBuilder();
        String packageName2 = this.f80967a.getApplicationContext().getPackageName();
        afVar.copyOnWrite();
        C55443ag agVar = (C55443ag) afVar.instance;
        packageName2.getClass();
        agVar.f146277a |= 8;
        agVar.f146280d = packageName2;
        long e = m55289e(this.f80967a);
        if (e != -1) {
            afVar.copyOnWrite();
            C55443ag agVar2 = (C55443ag) afVar.instance;
            agVar2.f146277a |= 16;
            agVar2.f146281e = e;
        }
        if (C68958v.f185250a.mo6453a().mo60816a() || kVar == null) {
            String b = this.f80969c.mo35525b();
            if (!TextUtils.isEmpty(b)) {
                afVar.copyOnWrite();
                C55443ag agVar3 = (C55443ag) afVar.instance;
                b.getClass();
                agVar3.f146277a |= 1;
                agVar3.f146278b = b;
            }
            long d = m55288d(this.f80967a);
            if (d != -1) {
                afVar.copyOnWrite();
                C55443ag agVar4 = (C55443ag) afVar.instance;
                agVar4.f146277a |= 4;
                agVar4.f146279c = d;
            }
        }
        C55480bq bqVar = (C55480bq) C55481br.f146365e.createBuilder();
        bqVar.copyOnWrite();
        C55481br brVar = (C55481br) bqVar.instance;
        brVar.f146368b = 3;
        brVar.f146367a |= 1;
        C55514v vVar = (C55514v) C55515w.f146494c.createBuilder();
        C55443ag agVar5 = (C55443ag) afVar.build();
        vVar.copyOnWrite();
        C55515w wVar = (C55515w) vVar.instance;
        agVar5.getClass();
        wVar.f146497b = agVar5;
        wVar.f146496a = 2;
        C55515w wVar2 = (C55515w) vVar.build();
        bqVar.copyOnWrite();
        C55481br brVar2 = (C55481br) bqVar.instance;
        wVar2.getClass();
        brVar2.f146369c = wVar2;
        brVar2.f146367a = 2 | brVar2.f146367a;
        if (C68958v.f185250a.mo6453a().mo60818c() && kVar != null) {
            String k = kVar.mo35013k();
            bqVar.copyOnWrite();
            C55481br brVar3 = (C55481br) bqVar.instance;
            k.getClass();
            brVar3.f146367a |= 8;
            brVar3.f146370d = k;
        }
        C55481br brVar4 = (C55481br) bqVar.build();
        bsVar.copyOnWrite();
        C55483bt btVar2 = (C55483bt) bsVar.instance;
        brVar4.getClass();
        btVar2.f146375c = brVar4;
        btVar2.f146374b = 1;
        return (C55483bt) bsVar.build();
    }

    /* renamed from: b */
    public final C55657cm mo35184b(C29820k kVar) {
        C55684x xVar = (C55684x) C55685y.f146912f.createBuilder();
        String packageName = this.f80967a.getApplicationContext().getPackageName();
        xVar.copyOnWrite();
        C55685y yVar = (C55685y) xVar.instance;
        packageName.getClass();
        yVar.f146914a |= 8;
        yVar.f146917d = packageName;
        String c = this.f80969c.mo35526c();
        xVar.copyOnWrite();
        C55685y yVar2 = (C55685y) xVar.instance;
        c.getClass();
        yVar2.f146914a |= 1;
        yVar2.f146915b = c;
        long d = m55288d(this.f80967a);
        if (d != -1) {
            xVar.copyOnWrite();
            C55685y yVar3 = (C55685y) xVar.instance;
            yVar3.f146914a |= 4;
            yVar3.f146916c = d;
        }
        long e = m55289e(this.f80967a);
        if (e != -1) {
            xVar.copyOnWrite();
            C55685y yVar4 = (C55685y) xVar.instance;
            yVar4.f146914a |= 16;
            yVar4.f146918e = e;
        }
        C55656cl clVar = (C55656cl) C55657cm.f146855e.createBuilder();
        clVar.copyOnWrite();
        C55657cm cmVar = (C55657cm) clVar.instance;
        cmVar.f146858b = 3;
        cmVar.f146857a |= 1;
        C55677q qVar = (C55677q) C55678r.f146900c.createBuilder();
        C55685y yVar5 = (C55685y) xVar.build();
        qVar.copyOnWrite();
        C55678r rVar = (C55678r) qVar.instance;
        yVar5.getClass();
        rVar.f146903b = yVar5;
        rVar.f146902a = 1;
        C55678r rVar2 = (C55678r) qVar.build();
        clVar.copyOnWrite();
        C55657cm cmVar2 = (C55657cm) clVar.instance;
        rVar2.getClass();
        cmVar2.f146859c = rVar2;
        cmVar2.f146857a |= 2;
        if (C68958v.m100021d() && kVar != null) {
            String k = kVar.mo35013k();
            clVar.copyOnWrite();
            C55657cm cmVar3 = (C55657cm) clVar.instance;
            k.getClass();
            cmVar3.f146857a |= 4;
            cmVar3.f146860d = k;
        }
        return (C55657cm) clVar.build();
    }

    /* renamed from: c */
    public final C55659co mo35185c(C29820k kVar) {
        C55658cn cnVar = (C55658cn) C55659co.f146861f.createBuilder();
        String packageName = this.f80967a.getApplicationContext().getPackageName();
        cnVar.copyOnWrite();
        C55659co coVar = (C55659co) cnVar.instance;
        packageName.getClass();
        coVar.f146863a |= 4;
        coVar.f146866d = packageName;
        C55657cm b = mo35184b(kVar);
        cnVar.copyOnWrite();
        C55659co coVar2 = (C55659co) cnVar.instance;
        b.getClass();
        coVar2.f146865c = b;
        coVar2.f146864b = 1;
        List a = this.f80970d.mo35197a();
        if (a != null && !a.isEmpty()) {
            cnVar.copyOnWrite();
            C55659co coVar3 = (C55659co) cnVar.instance;
            C62971cq cqVar = coVar3.f146867e;
            if (!cqVar.mo58948c()) {
                coVar3.f146867e = C62942bv.mutableCopy(cqVar);
            }
            C62947c.addAll((Iterable) a, (List) coVar3.f146867e);
        }
        return (C55659co) cnVar.build();
    }
}
