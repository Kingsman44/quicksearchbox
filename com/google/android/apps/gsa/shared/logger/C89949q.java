package com.google.android.apps.gsa.shared.logger;

import android.content.Context;
import android.content.Intent;
import android.databinding.C0118a;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import com.google.android.apps.gsa.p8885y.C118837d;
import com.google.android.apps.gsa.p8885y.p8886a.C118831d;
import com.google.android.apps.gsa.shared.logger.p7051b.C89851ag;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7130s.p7135c.p7136a.C90481a;
import com.google.android.apps.gsa.shared.util.debug.p7163a.C90991b;
import com.google.android.apps.gsa.staticplugins.p7648ce.C97560as;
import com.google.android.apps.gsa.staticplugins.p7648ce.C97565ax;
import com.google.android.libraries.assistant.portable.p1586b.C19088t;
import com.google.android.libraries.logging.C28285c;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.libraries.p1730f.p1731a.C21374d;
import com.google.android.libraries.p1730f.p1731a.C21375e;
import com.google.android.libraries.search.logging.p3039b.C38829a;
import com.google.android.libraries.search.logging.p3043f.C39191a;
import com.google.common.base.C58832aw;
import com.google.common.p4522b.C58425eo;
import com.google.common.p4522b.C58781rt;
import com.google.common.p4526f.C58979ad;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58970a;
import com.google.common.p4552o.C59698cm;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amo;
import com.google.protos.p4816ai.p4818b.C63196b;
import java.util.HashSet;
import java.util.Queue;
import java.util.Set;

/* renamed from: com.google.android.apps.gsa.shared.logger.q */
/* compiled from: PG */
public final class C89949q {

    /* renamed from: a */
    public static final Object f246450a = new Object();

    /* renamed from: m */
    private static final C59071e f246451m = C59071e.m91332i("com.google.android.apps.gsa.shared.logger.q");

    /* renamed from: b */
    public C90476a f246452b;

    /* renamed from: c */
    public volatile boolean f246453c;

    /* renamed from: d */
    public volatile C89950r f246454d;

    /* renamed from: e */
    public volatile C89950r f246455e;

    /* renamed from: f */
    public String f246456f;

    /* renamed from: g */
    public final Queue f246457g = new C58781rt(new C58425eo(200));

    /* renamed from: h */
    public final C90991b f246458h = C89942k.f246435a;

    /* renamed from: i */
    public final Set f246459i = new HashSet();

    /* renamed from: j */
    public final C21370a f246460j = new C21375e();

    /* renamed from: k */
    public C90481a f246461k;

    /* renamed from: l */
    public C118831d f246462l;

    /* renamed from: a */
    public static amo m146517a(amo amo) {
        return amo == null ? amo.UNKNOWN : amo;
    }

    /* renamed from: c */
    public static void m146519c(C60548tz tzVar, C89956x xVar) {
        long j = xVar.f246471a;
        if (j != 0) {
            String b = C39191a.m68623b(j);
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            C60555uf ufVar2 = C60555uf.f164065cO;
            b.getClass();
            ufVar.f164093a |= 4;
            ufVar.f164259n = b;
        }
        long j2 = xVar.f246472b;
        if (j2 != 0) {
            tzVar.copyOnWrite();
            C60555uf ufVar3 = (C60555uf) tzVar.instance;
            C60555uf ufVar4 = C60555uf.f164065cO;
            ufVar3.f164093a |= 16;
            ufVar3.f164261p = j2;
        }
    }

    /* renamed from: d */
    public static void m146520d(C60321oe oeVar, long j) {
        if (oeVar != null) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar = (C60555uf) tzVar.instance;
            ufVar.f164093a |= 2;
            ufVar.f164258m = 472;
            C89947o.f246445a.mo83802h((C60555uf) tzVar.build(), (String) null, oeVar, (C63196b) null, (C19088t) null, (String) null, j);
        }
    }

    /* renamed from: e */
    public static void m146521e(C60321oe oeVar, boolean z) {
        C60555uf ufVar;
        if (oeVar != null) {
            if (z) {
                C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
                tzVar.copyOnWrite();
                C60555uf ufVar2 = (C60555uf) tzVar.instance;
                ufVar2.f164093a |= 2;
                ufVar2.f164258m = 647;
                ufVar = (C60555uf) tzVar.build();
            } else {
                ufVar = null;
            }
            m146525j(ufVar, oeVar, (C63196b) null, (String) null);
        }
    }

    @Deprecated
    /* renamed from: f */
    public static void m146522f(View view) {
        m146521e(C28285c.m52874a(view, 472), false);
    }

    /* renamed from: g */
    public static void m146523g(int i) {
        C89949q qVar = C89947o.f246445a;
        if (qVar.f246461k != null) {
            C90476a aVar = C89947o.f246445a.f246452b;
        }
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = i;
        qVar.mo83802h((C60555uf) tzVar.build(), (String) null, (C60321oe) null, (C63196b) null, (C19088t) null, (String) null, 0);
    }

    /* renamed from: i */
    public static void m146524i(Context context, C60555uf ufVar, boolean z) {
        Intent putExtra = new Intent("com.google.android.apps.gsa.ACTION_RECORD_GSA_CLIENT_EVENT").setPackage("com.google.android.googlequicksearchbox").putExtra("com.google.android.apps.gsa.EXTRA_GSA_CLIENT_EVENT", ufVar.toByteArray());
        if (z) {
            putExtra.putExtra("com.google.android.apps.gsa.EXTRA_FLUSH_LOGS_NOW", true);
        }
        try {
            context.startService(putExtra);
        } catch (IllegalStateException e) {
            ((C59052c) ((C59052c) ((C59052c) f246451m.mo56226d()).mo56382g(e)).mo56372aa(10686)).mo56389s("%s", "Attempting to start service when the app is in background is not allowed on Android O+. Intent: ".concat(String.valueOf(String.valueOf(putExtra))));
            C90476a aVar = C89947o.f246445a.f246452b;
        }
    }

    /* renamed from: j */
    public static void m146525j(C60555uf ufVar, C60321oe oeVar, C63196b bVar, String str) {
        if (ufVar == null) {
            C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
            tzVar.copyOnWrite();
            C60555uf ufVar2 = (C60555uf) tzVar.instance;
            ufVar2.f164093a |= 2;
            ufVar2.f164258m = 472;
            ufVar = (C60555uf) tzVar.build();
        }
        C89947o.f246445a.mo83802h(ufVar, (String) null, oeVar, bVar, (C19088t) null, str, 0);
    }

    /* renamed from: k */
    public static void m146526k(C89957y yVar) {
        if (C89947o.f246445a.f246454d == null) {
            C0118a.m96d(f246451m.mo56226d(), "No EventLoggerStore set on EventLogger, event will be ignored.Initialize EventLogger in your Application#onCreate method", 10687, C58979ad.SMALL);
            return;
        }
        C89947o.f246445a.f246457g.add(new C89948p(C89947o.f246445a.f246454d.mo83804c(yVar), yVar.f246473a, (String) null, (C89851ag) null));
    }

    /* renamed from: l */
    public static void m146527l(C89834a aVar) {
        boolean z;
        synchronized (f246450a) {
            C89949q qVar = C89947o.f246445a;
            if (!C58832aw.m90831a(qVar.f246456f, aVar.f243159a)) {
                qVar.f246456f = aVar.f243159a;
                z = true;
            } else {
                z = false;
            }
        }
        if (z) {
            m146526k(new C89957y(-4, false, (String) null, (Integer) null, aVar, (C89954v) null, false, (String) null));
        }
    }

    /* renamed from: m */
    public static void m146528m(C89950r rVar) {
        C89949q qVar = C89947o.f246445a;
        rVar.getClass();
        qVar.f246454d = rVar;
    }

    /* renamed from: h */
    public final void mo83802h(C60555uf ufVar, String str, C60321oe oeVar, C63196b bVar, C19088t tVar, String str2, long j) {
        C89851ag agVar;
        HashSet<C97560as> hashSet;
        if (this.f246454d != null) {
            long a = C21374d.m40426a();
            C60548tz tzVar = (C60548tz) ufVar.toBuilder();
            C38829a.m68180a(tzVar, j, this.f246460j);
            synchronized (this.f246459i) {
                agVar = null;
                hashSet = !this.f246459i.isEmpty() ? new HashSet<>(this.f246459i) : null;
            }
            C60555uf ufVar2 = (C60555uf) tzVar.build();
            if (hashSet != null) {
                for (C97560as asVar : hashSet) {
                    try {
                        C89955w wVar = asVar.f272496a;
                        int i = ufVar2.f164258m;
                        long j2 = ufVar2.f164257l;
                        Parcel gA = wVar.mo17260gA();
                        gA.writeInt(i);
                        gA.writeLong(j2);
                        wVar.mo17262he(2, gA);
                    } catch (RemoteException e) {
                        try {
                            ((C58970a) ((C58970a) ((C58970a) C97565ax.f272500a.mo56225c()).mo56382g(e)).mo56372aa(22126)).mo56386p("Exception in IEventLoggedTestCallback.");
                        } catch (RuntimeException e2) {
                            ((C59052c) ((C59052c) ((C59052c) f246451m.mo56225c()).mo56382g(e2)).mo56372aa(10684)).mo56386p("Something went wrong in EventLoggedCallback.");
                        }
                    }
                }
            }
            C89929j b = this.f246454d.mo83803b(ufVar2, oeVar, bVar, tVar, str2);
            Queue queue = this.f246457g;
            long j3 = ufVar2.f164094aA;
            if ((ufVar2.f164252g & 65536) != 0) {
                C59698cm cmVar = ufVar2.f164184bl;
                if (cmVar == null) {
                    cmVar = C59698cm.f160165g;
                }
                agVar = C89851ag.m146284a(cmVar.f160170d);
                if (agVar == null) {
                    agVar = C89851ag.UNKNOWN;
                }
            }
            queue.add(new C89948p(b, j3, str, agVar));
            C118831d dVar = this.f246462l;
            if (dVar != null) {
                C118837d.m197249c(dVar, a);
                return;
            }
            return;
        }
        C0118a.m96d(f246451m.mo56226d(), "No EventLoggerStore set on EventLogger, event will be ignored.Initialize EventLogger in your Application#onCreate method", 10685, C58979ad.SMALL);
    }

    /* renamed from: b */
    public static amo m146518b(amo amo, boolean z, boolean z2, boolean z3) {
        if (!z || z2) {
            return m146517a(amo);
        }
        if (z3) {
            return amo.GMM;
        }
        return amo.BISTO.equals(amo) ? amo.BISTO : amo.EYESFREE_SCREENLESS;
    }
}
