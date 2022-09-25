package com.google.android.libraries.accountlinking.activity;

import android.accounts.Account;
import android.app.Application;
import androidx.lifecycle.C2332ag;
import androidx.lifecycle.C2352b;
import com.google.android.gms.clearcut.C143623ad;
import com.google.android.gms.clearcut.C143657j;
import com.google.android.gms.clearcut.C143658k;
import com.google.android.libraries.accountlinking.C147432j;
import com.google.android.libraries.accountlinking.p10974a.C147366d;
import com.google.android.libraries.accountlinking.p10979b.C147399c;
import com.google.android.libraries.accountlinking.p10979b.C147403g;
import com.google.android.libraries.accountlinking.p10979b.C147412p;
import com.google.android.libraries.accountlinking.p10980c.C147416a;
import com.google.android.libraries.accountlinking.p10980c.C147417b;
import com.google.android.libraries.accountlinking.p10981d.C147423c;
import com.google.android.libraries.accountlinking.p10981d.C147426f;
import com.google.android.libraries.p1975k.p1980e.C24006d;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58490gz;
import com.google.common.p4522b.C58495hd;
import com.google.common.p4526f.p4527a.C58974d;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.p3562ao.p3563a.p3568d.C45550au;
import com.google.p3562ao.p3563a.p3568d.C45551av;
import com.google.p3562ao.p3563a.p3568d.C45552aw;
import com.google.p3562ao.p3563a.p3568d.C45553ax;
import com.google.p3562ao.p3563a.p3568d.C45558bb;
import com.google.p3562ao.p3563a.p3568d.C45566d;
import com.google.p3562ao.p3563a.p3568d.C45567e;
import com.google.p3562ao.p3563a.p3568d.C45576n;
import com.google.p3562ao.p3563a.p3568d.C45577o;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58149a;
import com.google.p4500cm.p4501a.p4508c.p4509a.p4510a.C58150b;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62947c;
import com.google.protobuf.C62971cq;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65878b;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65879c;
import com.google.protos.p5133r.p5134a.p5135a.p5136a.C65881e;
import com.google.protos.p5170z.p5171a.p5172a.C66269a;
import com.google.protos.p5170z.p5171a.p5172a.C66270b;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import p5535j.p5536a.p5559f.C71175a;

/* renamed from: com.google.android.libraries.accountlinking.activity.p */
/* compiled from: PG */
public final class C147388p extends C2352b {

    /* renamed from: b */
    public static final C58974d f397851b = C58974d.m91134h("GAL");

    /* renamed from: n */
    private static final C58495hd f397852n = C58495hd.m89903q("accountlinking-pa.googleapis.com", C65878b.ENVIRONMENT_PROD, "staging-accountlinking-pa.sandbox.googleapis.com", C65878b.ENVIRONMENT_STAGING, "stagingqual-accountlinking-pa.sandbox.googleapis.com", C65878b.ENVIRONMENT_TEST_STAGING, "autopush-accountlinking-pa.googleapis.com", C65878b.ENVIRONMENT_AUTOPUSH);

    /* renamed from: o */
    private static final C58495hd f397853o;

    /* renamed from: c */
    public final C147395w f397854c;

    /* renamed from: d */
    public final C147426f f397855d;

    /* renamed from: e */
    public final C147426f f397856e;

    /* renamed from: f */
    public final C147426f f397857f;

    /* renamed from: g */
    public final C2332ag f397858g;

    /* renamed from: h */
    public final C147412p f397859h;

    /* renamed from: i */
    public C65881e f397860i = C65881e.STATE_START;

    /* renamed from: j */
    public boolean f397861j = false;

    /* renamed from: k */
    public int f397862k = 0;

    /* renamed from: l */
    public boolean f397863l = false;

    /* renamed from: m */
    public String f397864m;

    /* renamed from: p */
    private final Set f397865p = new HashSet();

    /* renamed from: q */
    private final C143658k f397866q;

    /* renamed from: r */
    private C143623ad f397867r;

    static {
        C58490gz gzVar = new C58490gz(4);
        gzVar.mo55429h(C65881e.STATE_ACCOUNT_SELECTION, C65879c.EVENT_ACCOUNT_SELECTION_CANCEL);
        gzVar.mo55429h(C65881e.STATE_PROVIDER_CONSENT, C65879c.EVENT_PROVIDER_CONSENT_CANCEL);
        gzVar.mo55429h(C65881e.STATE_ACCOUNT_CREATION, C65879c.EVENT_ACCOUNT_CREATION_CANCEL);
        gzVar.mo55429h(C65881e.STATE_LINKING_INFO, C65879c.EVENT_LINKING_INFO_CANCEL_LINKING);
        gzVar.mo55429h(C65881e.STATE_USAGE_NOTICE, C65879c.EVENT_USAGE_NOTICE_CANCEL_LINKING);
        f397853o = gzVar.mo55427f(true);
    }

    public C147388p(Application application, C147395w wVar, C147417b bVar) {
        super(application);
        this.f397854c = wVar;
        this.f397857f = new C147426f();
        this.f397858g = new C2332ag();
        this.f397855d = new C147426f();
        this.f397856e = new C147426f();
        this.f397864m = wVar.f397906o;
        C147416a aVar = (C147416a) bVar;
        this.f397859h = new C147412p(application, aVar.f397939a, aVar.f397940b, C58833ax.m90833j(wVar.f397896e), C58833ax.m90833j(wVar.f397907p));
        this.f397866q = new C143658k(application.getApplicationContext(), "OAUTH_INTEGRATIONS", wVar.f397893b.name);
    }

    /* renamed from: k */
    private final C143623ad m240305k() {
        if (this.f397867r == null) {
            this.f397867r = C24006d.m44596b(this.f6558a.getApplicationContext(), new C71175a());
        }
        return this.f397867r;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b4, code lost:
        if ((r9.f6558a.getResources().getConfiguration().uiMode & 48) == 32) goto L_0x00b8;
     */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.protos.p5170z.p5171a.p5172a.C66269a m240306l() {
        /*
            r9 = this;
            com.google.protos.z.a.a.b r0 = com.google.protos.p5170z.p5171a.p5172a.C66270b.f180218j
            com.google.protobuf.bn r0 = r0.createBuilder()
            com.google.protos.z.a.a.a r0 = (com.google.protos.p5170z.p5171a.p5172a.C66269a) r0
            android.app.Application r1 = r9.f6558a
            java.lang.String r1 = r1.getPackageName()
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.protos.z.a.a.b r2 = (com.google.protos.p5170z.p5171a.p5172a.C66270b) r2
            r1.getClass()
            int r3 = r2.f180220a
            r3 = r3 | 64
            r2.f180220a = r3
            r2.f180226g = r1
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.protos.z.a.a.b r1 = (com.google.protos.p5170z.p5171a.p5172a.C66270b) r1
            int r2 = r1.f180220a
            r2 = r2 | 8
            r1.f180220a = r2
            java.lang.String r2 = "100"
            r1.f180223d = r2
            com.google.android.libraries.accountlinking.activity.w r1 = r9.f397854c
            java.lang.String r1 = r1.f397899h
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.protos.z.a.a.b r2 = (com.google.protos.p5170z.p5171a.p5172a.C66270b) r2
            r1.getClass()
            int r3 = r2.f180220a
            r4 = 32
            r3 = r3 | r4
            r2.f180220a = r3
            r2.f180225f = r1
            com.google.common.b.hd r1 = f397852n
            com.google.android.libraries.accountlinking.activity.w r2 = r9.f397854c
            java.lang.String r2 = r2.f397897f
            com.google.protos.r.a.a.a.b r3 = com.google.protos.p5133r.p5134a.p5135a.p5136a.C65878b.ENVIRONMENT_UNKNOWN
            java.lang.Object r1 = r1.getOrDefault(r2, r3)
            com.google.protos.r.a.a.a.b r1 = (com.google.protos.p5133r.p5134a.p5135a.p5136a.C65878b) r1
            r0.copyOnWrite()
            com.google.protobuf.bv r2 = r0.instance
            com.google.protos.z.a.a.b r2 = (com.google.protos.p5170z.p5171a.p5172a.C66270b) r2
            int r1 = r1.getNumber()
            r2.f180224e = r1
            int r1 = r2.f180220a
            r1 = r1 | 16
            r2.f180220a = r1
            com.google.android.libraries.accountlinking.l r1 = com.google.android.libraries.accountlinking.C147434l.APP_FLIP
            com.google.android.libraries.accountlinking.activity.w r1 = r9.f397854c
            int r1 = r1.f397908q
            int r2 = r1 + -1
            r3 = 0
            if (r1 == 0) goto L_0x00cb
            r1 = 1
            r5 = 4
            r6 = 3
            r7 = 2
            if (r2 == 0) goto L_0x0084
            if (r2 == r1) goto L_0x0082
            if (r2 == r7) goto L_0x0080
            r2 = 2
            goto L_0x0085
        L_0x0080:
            r2 = 5
            goto L_0x0085
        L_0x0082:
            r2 = 4
            goto L_0x0085
        L_0x0084:
            r2 = 3
        L_0x0085:
            r0.copyOnWrite()
            com.google.protobuf.bv r8 = r0.instance
            com.google.protos.z.a.a.b r8 = (com.google.protos.p5170z.p5171a.p5172a.C66270b) r8
            int r2 = r2 + -2
            r8.f180227h = r2
            int r2 = r8.f180220a
            r2 = r2 | 512(0x200, float:7.175E-43)
            r8.f180220a = r2
            com.google.android.libraries.accountlinking.activity.w r2 = r9.f397854c
            int r2 = r2.f397908q
            int r8 = r2 + -1
            if (r2 == 0) goto L_0x00ca
            if (r8 == 0) goto L_0x00b7
            if (r8 == r1) goto L_0x00b8
            if (r8 == r7) goto L_0x00a6
            r5 = 2
            goto L_0x00b8
        L_0x00a6:
            android.app.Application r1 = r9.f6558a
            android.content.res.Resources r1 = r1.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.uiMode
            r1 = r1 & 48
            if (r1 != r4) goto L_0x00b7
            goto L_0x00b8
        L_0x00b7:
            r5 = 3
        L_0x00b8:
            r0.copyOnWrite()
            com.google.protobuf.bv r1 = r0.instance
            com.google.protos.z.a.a.b r1 = (com.google.protos.p5170z.p5171a.p5172a.C66270b) r1
            int r5 = r5 + -2
            r1.f180228i = r5
            int r2 = r1.f180220a
            r2 = r2 | 1024(0x400, float:1.435E-42)
            r1.f180220a = r2
            return r0
        L_0x00ca:
            throw r3
        L_0x00cb:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.libraries.accountlinking.activity.C147388p.m240306l():com.google.protos.z.a.a.a");
    }

    /* renamed from: a */
    public final void mo124144a(String str) {
        C147412p pVar = this.f397859h;
        C147395w wVar = this.f397854c;
        int i = wVar.f397895d;
        Account account = wVar.f397893b;
        String str2 = wVar.f397899h;
        ArrayList arrayList = new ArrayList(wVar.f397902k);
        C45576n nVar = (C45576n) C45577o.f119113e.createBuilder();
        C45558bb d = pVar.mo124158d(i);
        nVar.copyOnWrite();
        d.getClass();
        ((C45577o) nVar.instance).f119115a = d;
        nVar.copyOnWrite();
        str2.getClass();
        ((C45577o) nVar.instance).f119116b = str2;
        nVar.copyOnWrite();
        C45577o oVar = (C45577o) nVar.instance;
        C62971cq cqVar = oVar.f119117c;
        if (!cqVar.mo58948c()) {
            oVar.f119117c = C62942bv.mutableCopy(cqVar);
        }
        C62947c.addAll((Iterable) arrayList, (List) oVar.f119117c);
        C45550au auVar = (C45550au) C45551av.f119046c.createBuilder();
        auVar.copyOnWrite();
        ((C45551av) auVar.instance).f119048a = 3;
        auVar.copyOnWrite();
        str.getClass();
        ((C45551av) auVar.instance).f119049b = str;
        C45551av avVar = (C45551av) auVar.build();
        nVar.copyOnWrite();
        avVar.getClass();
        ((C45577o) nVar.instance).f119118d = avVar;
        C60856cj.m92911t(pVar.mo124156b(account, new C147399c((C45577o) nVar.build())), new C147385m(this, str), C60826bg.f164896a);
    }

    /* renamed from: b */
    public final void mo124145b(C65879c cVar) {
        C66269a l = m240306l();
        C65881e eVar = C65881e.STATE_ERROR;
        l.copyOnWrite();
        C66270b bVar = (C66270b) l.instance;
        C66270b bVar2 = C66270b.f180218j;
        bVar.f180221b = eVar.getNumber();
        bVar.f180220a |= 1;
        C143657j d = this.f397866q.mo118999d((C66270b) l.build());
        d.f389472n = m240305k();
        int number = cVar.getNumber();
        C58149a aVar = d.f389461c;
        aVar.copyOnWrite();
        C58150b bVar3 = (C58150b) aVar.instance;
        C58150b bVar4 = C58150b.f155459k;
        bVar3.f155461a |= 16;
        bVar3.f155464d = number;
        int i = this.f397854c.f397895d;
        C58149a aVar2 = d.f389461c;
        aVar2.copyOnWrite();
        C58150b bVar5 = (C58150b) aVar2.instance;
        bVar5.f155461a |= 64;
        bVar5.f155465e = (long) i;
        d.mo118992a();
    }

    /* renamed from: c */
    public final void mo124146c() {
        C66269a l = m240306l();
        C65881e eVar = this.f397860i;
        l.copyOnWrite();
        C66270b bVar = (C66270b) l.instance;
        C66270b bVar2 = C66270b.f180218j;
        bVar.f180221b = eVar.getNumber();
        bVar.f180220a |= 1;
        C143657j d = this.f397866q.mo118999d((C66270b) l.build());
        d.f389472n = m240305k();
        int number = ((C65879c) f397853o.getOrDefault(this.f397860i, C65879c.EVENT_ACCOUNT_SELECTION_CANCEL)).getNumber();
        C58149a aVar = d.f389461c;
        aVar.copyOnWrite();
        C58150b bVar3 = (C58150b) aVar.instance;
        C58150b bVar4 = C58150b.f155459k;
        bVar3.f155461a |= 16;
        bVar3.f155464d = number;
        int i = this.f397854c.f397895d;
        C58149a aVar2 = d.f389461c;
        aVar2.copyOnWrite();
        C58150b bVar5 = (C58150b) aVar2.instance;
        bVar5.f155461a |= 64;
        bVar5.f155465e = (long) i;
        d.mo118992a();
    }

    /* renamed from: e */
    public final void mo124147e(C65879c cVar) {
        C66269a l = m240306l();
        C65881e eVar = this.f397860i;
        l.copyOnWrite();
        C66270b bVar = (C66270b) l.instance;
        C66270b bVar2 = C66270b.f180218j;
        bVar.f180221b = eVar.getNumber();
        bVar.f180220a |= 1;
        C143657j d = this.f397866q.mo118999d((C66270b) l.build());
        d.f389472n = m240305k();
        int number = cVar.getNumber();
        C58149a aVar = d.f389461c;
        aVar.copyOnWrite();
        C58150b bVar3 = (C58150b) aVar.instance;
        C58150b bVar4 = C58150b.f155459k;
        bVar3.f155461a |= 16;
        bVar3.f155464d = number;
        int i = this.f397854c.f397895d;
        C58149a aVar2 = d.f389461c;
        aVar2.copyOnWrite();
        C58150b bVar5 = (C58150b) aVar2.instance;
        bVar5.f155461a |= 64;
        bVar5.f155465e = (long) i;
        d.mo118992a();
    }

    /* renamed from: f */
    public final void mo124148f(C65881e eVar) {
        C66269a l = m240306l();
        l.copyOnWrite();
        C66270b bVar = (C66270b) l.instance;
        C66270b bVar2 = C66270b.f180218j;
        bVar.f180221b = eVar.getNumber();
        bVar.f180220a |= 1;
        C65881e eVar2 = this.f397860i;
        l.copyOnWrite();
        C66270b bVar3 = (C66270b) l.instance;
        bVar3.f180222c = eVar2.getNumber();
        bVar3.f180220a |= 2;
        this.f397860i = eVar;
        C143657j d = this.f397866q.mo118999d((C66270b) l.build());
        d.f389472n = m240305k();
        C58149a aVar = d.f389461c;
        aVar.copyOnWrite();
        C58150b bVar4 = (C58150b) aVar.instance;
        C58150b bVar5 = C58150b.f155459k;
        bVar4.f155461a |= 16;
        bVar4.f155464d = 1;
        int i = this.f397854c.f397895d;
        C58149a aVar2 = d.f389461c;
        aVar2.copyOnWrite();
        C58150b bVar6 = (C58150b) aVar2.instance;
        bVar6.f155461a |= 64;
        bVar6.f155465e = (long) i;
        d.mo118992a();
    }

    /* renamed from: g */
    public final void mo124149g(C147366d dVar, String str) {
        C147389q qVar;
        if (C147366d.f397804a.contains(Integer.valueOf(dVar.f397807d))) {
            qVar = C147381i.m240294a(3, "Linking denied by user.");
        } else if (C147366d.f397805b.contains(Integer.valueOf(dVar.f397807d))) {
            qVar = C147381i.m240294a(4, "Linking cancelled by user.");
        } else {
            qVar = C147381i.m240294a(1, str);
        }
        mo124150h(qVar);
    }

    /* renamed from: h */
    public final void mo124150h(C147389q qVar) {
        C60856cj.m92906o(this.f397865p).mo4106b(new C147382j(this, qVar), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final void mo124151i(int i, int i2, int i3, String str, String str2) {
        Set set = this.f397865p;
        C147412p pVar = this.f397859h;
        C147395w wVar = this.f397854c;
        int i4 = wVar.f397895d;
        Account account = wVar.f397893b;
        String str3 = wVar.f397899h;
        Integer valueOf = Integer.valueOf(i3);
        C45566d dVar = (C45566d) C45567e.f119088f.createBuilder();
        dVar.copyOnWrite();
        ((C45567e) dVar.instance).f119090a = i - 2;
        if (i2 != 0) {
            dVar.copyOnWrite();
            C45567e eVar = (C45567e) dVar.instance;
            if (i2 != 1) {
                eVar.f119091b = i2 - 2;
            } else {
                throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
            }
        }
        int intValue = valueOf.intValue();
        dVar.copyOnWrite();
        ((C45567e) dVar.instance).f119092c = intValue;
        if (str != null) {
            dVar.copyOnWrite();
            ((C45567e) dVar.instance).f119093d = str;
        }
        if (str2 != null) {
            dVar.copyOnWrite();
            ((C45567e) dVar.instance).f119094e = str2;
        }
        C45552aw awVar = (C45552aw) C45553ax.f119050d.createBuilder();
        C45558bb d = pVar.mo124158d(i4);
        awVar.copyOnWrite();
        d.getClass();
        ((C45553ax) awVar.instance).f119052a = d;
        awVar.copyOnWrite();
        str3.getClass();
        ((C45553ax) awVar.instance).f119053b = str3;
        awVar.copyOnWrite();
        C45567e eVar2 = (C45567e) dVar.build();
        eVar2.getClass();
        ((C45553ax) awVar.instance).f119054c = eVar2;
        set.add(pVar.mo124156b(account, new C147403g((C45553ax) awVar.build())));
    }

    /* renamed from: j */
    public final void mo124152j(Throwable th) {
        C147432j a = C147423c.m240342a(th);
        if (a.f397975a == 2) {
            mo124145b(C65879c.EVENT_NETWORK_ERROR);
        }
        mo124150h(C147381i.m240294a(a.f397975a, a.getMessage()));
    }
}
