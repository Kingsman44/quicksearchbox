package com.google.android.apps.gsa.staticplugins.opaonboarding.p8655b;

import android.app.Activity;
import android.content.ContentResolver;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83819a;
import com.google.android.apps.gsa.opaonboarding.p6459a.C83841av;
import com.google.android.apps.gsa.search.core.google.gaia.C86054o;
import com.google.android.libraries.gcoreclient.p1755d.C21482a;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C59071e;
import com.google.p3562ao.p3570b.p3571a.p3574b.C45595b;
import com.google.p4017at.p4018a.p4019a.p4020a.C53743aa;
import com.google.p4017at.p4018a.p4019a.p4020a.C53745ac;
import com.google.p4017at.p4018a.p4019a.p4020a.C53747ae;
import com.google.p4017at.p4018a.p4019a.p4020a.C53791bv;
import com.google.p4017at.p4018a.p4019a.p4020a.C53800k;
import com.google.p4017at.p4018a.p4019a.p4020a.C53801l;
import com.google.p4017at.p4018a.p4019a.p4020a.C53806q;
import com.google.p4017at.p4018a.p4019a.p4020a.C53808s;
import com.google.p4017at.p4018a.p4019a.p4020a.C53809t;
import com.google.p4017at.p4018a.p4019a.p4020a.C53811v;
import com.google.p4017at.p4018a.p4019a.p4020a.C53812w;
import com.google.p4017at.p4018a.p4019a.p4020a.C53813x;
import java.util.Iterator;

/* renamed from: com.google.android.apps.gsa.staticplugins.opaonboarding.b.d */
/* compiled from: PG */
public final class C115856d implements C83819a {

    /* renamed from: a */
    public static final C59071e f321260a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opaonboarding.b.d");

    /* renamed from: b */
    public final C21482a f321261b;

    /* renamed from: c */
    public final C86054o f321262c;

    /* renamed from: d */
    public final ContentResolver f321263d;

    /* renamed from: e */
    private final C22871g f321264e;

    public C115856d(C21482a aVar, C86054o oVar, C22871g gVar, ContentResolver contentResolver) {
        this.f321261b = aVar;
        this.f321262c = oVar;
        this.f321264e = gVar;
        this.f321263d = contentResolver;
    }

    /* renamed from: b */
    public static C58485gu m192032b(C53811v vVar, C53811v vVar2, C53808s sVar, C45595b bVar, C53747ae aeVar, Iterable iterable) {
        C53745ac a = C115857e.m192035a(vVar, sVar);
        C53791bv a2 = C115858f.m192037a(bVar);
        C58480gp e = C58485gu.m89837e();
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            C53800k kVar = (C53800k) C53801l.f141209g.createBuilder();
            kVar.mo54016b(a);
            C53806q qVar = (C53806q) C53745ac.f141093d.createBuilder();
            qVar.copyOnWrite();
            C53745ac acVar = (C53745ac) qVar.instance;
            acVar.f141096b = 2;
            acVar.f141095a |= 1;
            C53809t tVar = (C53809t) C53743aa.f141085f.createBuilder();
            tVar.copyOnWrite();
            C53743aa aaVar = (C53743aa) tVar.instance;
            vVar2.getClass();
            aaVar.f141088b = vVar2;
            aaVar.f141087a |= 1;
            C53812w wVar = (C53812w) C53813x.f141233c.createBuilder();
            wVar.copyOnWrite();
            C53813x xVar = (C53813x) wVar.instance;
            str.getClass();
            xVar.f141235a |= 1;
            xVar.f141236b = str;
            C53813x xVar2 = (C53813x) wVar.build();
            tVar.copyOnWrite();
            C53743aa aaVar2 = (C53743aa) tVar.instance;
            xVar2.getClass();
            aaVar2.f141091e = xVar2;
            aaVar2.f141087a |= 512;
            qVar.copyOnWrite();
            C53745ac acVar2 = (C53745ac) qVar.instance;
            C53743aa aaVar3 = (C53743aa) tVar.build();
            aaVar3.getClass();
            acVar2.f141097c = aaVar3;
            acVar2.f141095a |= 2;
            kVar.mo54016b((C53745ac) qVar.build());
            kVar.copyOnWrite();
            C53801l lVar = (C53801l) kVar.instance;
            a2.getClass();
            lVar.f141216f = a2;
            lVar.f141211a |= 8;
            kVar.copyOnWrite();
            C53801l lVar2 = (C53801l) kVar.instance;
            aeVar.getClass();
            lVar2.f141215e = aeVar;
            lVar2.f141211a |= 4;
            e.mo55395g((C53801l) kVar.build());
        }
        return e.mo55394f();
    }

    /* renamed from: a */
    public final void mo77204a(Activity activity, C83841av avVar) {
        this.f321264e.mo28212l("auditInBackground", new C115855c(this, activity, avVar));
    }

    /* renamed from: c */
    public static C45595b m192033c(int i) {
        int i2 = i - 1;
        if (i2 == 1) {
            return C45595b.GOOGLE_ASSISTANT_ANDROID_VOICE_MATCH_SETTINGS;
        }
        if (i2 == 2) {
            return C45595b.GOOGLE_ASSISTANT_ANDROID_VOICE_MATCH_ONBOARDING_GOOGLE_HOME;
        }
        if (i2 != 3) {
            return C45595b.CONTEXT_ID_UNSPECIFIED;
        }
        return C45595b.GOOGLE_ASSISTANT_ANDROID_VOICE_MATCH_ONBOARDING_OPA_ANDROID;
    }
}
