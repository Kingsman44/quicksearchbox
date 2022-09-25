package com.google.android.apps.gsa.staticplugins.bisto.p7488f;

import android.content.Context;
import android.content.pm.PackageManager;
import android.support.p033v7.widget.LinearLayoutManager;
import android.util.LruCache;
import com.google.android.apps.gsa.search.core.p6513aj.C84516aa;
import com.google.android.apps.gsa.shared.bisto.C89654i;
import com.google.android.apps.gsa.shared.bisto.C89655j;
import com.google.android.apps.gsa.shared.bisto.C89656k;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89486by;
import com.google.android.apps.gsa.shared.bisto.p7028a.C89496ch;
import com.google.android.apps.gsa.shared.logger.C89949q;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.staticplugins.bisto.p7516r.C95851b;
import com.google.android.apps.gsa.staticplugins.bisto.p7518t.p7519a.C95873a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124636bb;
import com.google.android.libraries.p1730f.C21370a;
import com.google.android.p10712d.C142424ev;
import com.google.android.p10712d.C142425ew;
import com.google.android.p10712d.C142427ey;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.common.p4552o.C60073jv;
import com.google.common.p4552o.C60075jx;
import com.google.common.p4552o.C60076jy;
import com.google.common.p4552o.C60077jz;
import com.google.common.p4552o.C60291nd;
import com.google.common.p4552o.C60292ne;
import com.google.common.p4552o.C60298nk;
import com.google.common.p4552o.C60300nm;
import com.google.common.p4552o.C60301nn;
import com.google.common.p4552o.C60302no;
import com.google.common.p4552o.C60321oe;
import com.google.common.p4552o.C60548tz;
import com.google.common.p4552o.C60555uf;
import com.google.common.p4552o.amo;
import com.google.common.util.concurrent.C60826bg;
import com.google.common.util.concurrent.C60856cj;
import com.google.protobuf.C62942bv;
import com.google.protos.p4816ai.p4818b.C63196b;
import dagger.C68214a;
import java.io.IOException;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: com.google.android.apps.gsa.staticplugins.bisto.f.m */
/* compiled from: PG */
public final class C95307m implements C89654i {

    /* renamed from: e */
    private static final C59071e f266679e = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.bisto.f.m");

    /* renamed from: a */
    public final C21370a f266680a;

    /* renamed from: b */
    final AtomicReference f266681b = new AtomicReference();

    /* renamed from: c */
    public final C95851b f266682c;

    /* renamed from: d */
    public final C68214a f266683d;

    /* renamed from: f */
    private final int f266684f;

    /* renamed from: g */
    private final Executor f266685g;

    /* renamed from: h */
    private final C89656k f266686h;

    /* renamed from: i */
    private final C84516aa f266687i;

    /* renamed from: j */
    private final C68214a f266688j;

    static {
        new LruCache(1024);
    }

    public C95307m(Context context, C95851b bVar, Executor executor, C68214a aVar, C89656k kVar, C84516aa aaVar, C68214a aVar2, C21370a aVar3) {
        this.f266682c = bVar;
        this.f266685g = executor;
        this.f266683d = aVar;
        this.f266686h = kVar;
        this.f266687i = aaVar;
        this.f266688j = aVar2;
        this.f266680a = aVar3;
        int i = 0;
        try {
            i = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException e) {
            C59104x c = f266679e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ClearcutBistoLogger");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(14866)).mo56386p("Could not get current versionCode");
        }
        this.f266684f = i;
    }

    /* renamed from: f */
    public static C60073jv m157551f(byte[] bArr) {
        C60073jv jvVar = (C60073jv) C60075jx.f162403o.createBuilder();
        try {
            C142425ew ewVar = (C142425ew) C62942bv.parseFrom((C62942bv) C142425ew.f386461t, bArr);
            if ((ewVar.f386463a & 1) != 0) {
                int a = C142424ev.m231081a(ewVar.f386464b);
                if (a == 0) {
                    a = 1;
                }
                int i = a - 1;
                if (i == 0) {
                    jvVar.copyOnWrite();
                    C60075jx jxVar = (C60075jx) jvVar.instance;
                    jxVar.f162406b = 0;
                    jxVar.f162405a |= 1;
                } else if (i == 1) {
                    jvVar.copyOnWrite();
                    C60075jx jxVar2 = (C60075jx) jvVar.instance;
                    jxVar2.f162406b = 1;
                    jxVar2.f162405a |= 1;
                } else if (i != 2) {
                    jvVar.copyOnWrite();
                    C60075jx jxVar3 = (C60075jx) jvVar.instance;
                    jxVar3.f162406b = 3;
                    jxVar3.f162405a |= 1;
                } else {
                    jvVar.copyOnWrite();
                    C60075jx jxVar4 = (C60075jx) jvVar.instance;
                    jxVar4.f162406b = 2;
                    jxVar4.f162405a |= 1;
                }
            }
            if ((ewVar.f386463a & 2048) != 0) {
                int i2 = ewVar.f386475m;
                jvVar.copyOnWrite();
                C60075jx jxVar5 = (C60075jx) jvVar.instance;
                jxVar5.f162405a |= 2;
                jxVar5.f162407c = i2;
            }
            if ((ewVar.f386463a & 4096) != 0) {
                int i3 = ewVar.f386476n;
                jvVar.copyOnWrite();
                C60075jx jxVar6 = (C60075jx) jvVar.instance;
                jxVar6.f162405a |= 8;
                jxVar6.f162409e = i3;
            }
            if ((ewVar.f386463a & 8192) != 0) {
                int i4 = ewVar.f386477o;
                jvVar.copyOnWrite();
                C60075jx jxVar7 = (C60075jx) jvVar.instance;
                jxVar7.f162405a |= 32;
                jxVar7.f162411g = i4;
            }
            if ((ewVar.f386463a & 16384) != 0) {
                int i5 = ewVar.f386478p;
                jvVar.copyOnWrite();
                C60075jx jxVar8 = (C60075jx) jvVar.instance;
                jxVar8.f162405a |= 128;
                jxVar8.f162413i = i5;
            }
            if ((ewVar.f386463a & 32768) != 0) {
                int i6 = ewVar.f386479q;
                jvVar.copyOnWrite();
                C60075jx jxVar9 = (C60075jx) jvVar.instance;
                jxVar9.f162405a |= 256;
                jxVar9.f162414j = i6;
            }
            if ((ewVar.f386463a & C89885b.S3REQUEST_VALUE) != 0) {
                int i7 = ewVar.f386481s;
                jvVar.copyOnWrite();
                C60075jx jxVar10 = (C60075jx) jvVar.instance;
                jxVar10.f162405a |= 1024;
                jxVar10.f162416l = i7;
            }
            C60076jy jyVar = (C60076jy) C60077jz.f162419m.createBuilder();
            if ((ewVar.f386463a & 2) != 0) {
                int i8 = ewVar.f386465c;
                jyVar.copyOnWrite();
                C60077jz jzVar = (C60077jz) jyVar.instance;
                jzVar.f162421a = 1 | jzVar.f162421a;
                jzVar.f162422b = i8;
            }
            if ((ewVar.f386463a & 4) != 0) {
                int i9 = ewVar.f386466d;
                jyVar.copyOnWrite();
                C60077jz jzVar2 = (C60077jz) jyVar.instance;
                jzVar2.f162421a = 2 | jzVar2.f162421a;
                jzVar2.f162423c = i9;
            }
            if ((ewVar.f386463a & 8) != 0) {
                int i10 = ewVar.f386467e;
                jyVar.copyOnWrite();
                C60077jz jzVar3 = (C60077jz) jyVar.instance;
                jzVar3.f162421a |= 4;
                jzVar3.f162424d = i10;
            }
            if ((ewVar.f386463a & 16) != 0) {
                int i11 = ewVar.f386468f;
                jyVar.copyOnWrite();
                C60077jz jzVar4 = (C60077jz) jyVar.instance;
                jzVar4.f162421a |= 8;
                jzVar4.f162425e = i11;
            }
            if ((ewVar.f386463a & 32) != 0) {
                int i12 = ewVar.f386469g;
                jyVar.copyOnWrite();
                C60077jz jzVar5 = (C60077jz) jyVar.instance;
                jzVar5.f162421a |= 16;
                jzVar5.f162426f = i12;
            }
            if ((ewVar.f386463a & 64) != 0) {
                int i13 = ewVar.f386470h;
                jyVar.copyOnWrite();
                C60077jz jzVar6 = (C60077jz) jyVar.instance;
                jzVar6.f162421a |= 32;
                jzVar6.f162427g = i13;
            }
            if ((ewVar.f386463a & 128) != 0) {
                int i14 = ewVar.f386471i;
                jyVar.copyOnWrite();
                C60077jz jzVar7 = (C60077jz) jyVar.instance;
                jzVar7.f162421a |= 64;
                jzVar7.f162428h = i14;
            }
            if ((ewVar.f386463a & 256) != 0) {
                int i15 = ewVar.f386472j;
                jyVar.copyOnWrite();
                C60077jz jzVar8 = (C60077jz) jyVar.instance;
                jzVar8.f162421a |= 128;
                jzVar8.f162429i = i15;
            }
            if ((ewVar.f386463a & 512) != 0) {
                int i16 = ewVar.f386473k;
                jyVar.copyOnWrite();
                C60077jz jzVar9 = (C60077jz) jyVar.instance;
                jzVar9.f162421a |= 256;
                jzVar9.f162430j = i16;
            }
            if ((ewVar.f386463a & 1024) != 0) {
                int i17 = ewVar.f386474l;
                jyVar.copyOnWrite();
                C60077jz jzVar10 = (C60077jz) jyVar.instance;
                jzVar10.f162421a |= 512;
                jzVar10.f162431k = i17;
            }
            if ((ewVar.f386463a & 65536) != 0) {
                int i18 = ewVar.f386480r;
                jyVar.copyOnWrite();
                C60077jz jzVar11 = (C60077jz) jyVar.instance;
                jzVar11.f162421a |= 1024;
                jzVar11.f162432l = i18;
            }
            jvVar.copyOnWrite();
            C60075jx jxVar11 = (C60075jx) jvVar.instance;
            C60077jz jzVar12 = (C60077jz) jyVar.build();
            jzVar12.getClass();
            jxVar11.f162418n = jzVar12;
            jxVar11.f162405a |= 8192;
            return jvVar;
        } catch (IOException unused) {
            C59104x c = f266679e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ClearcutBistoLogger");
            ((C59052c) ((C59052c) c).mo56372aa(14867)).mo56386p("Error parsing received health packet proto");
            return jvVar;
        }
    }

    /* renamed from: g */
    public static C60073jv m157552g(byte[] bArr) {
        C60073jv jvVar = (C60073jv) C60075jx.f162403o.createBuilder();
        try {
            C142427ey eyVar = (C142427ey) C62942bv.parseFrom((C62942bv) C142427ey.f386482g, bArr);
            if ((eyVar.f386484a & 1) != 0) {
                String str = eyVar.f386485b;
                jvVar.copyOnWrite();
                C60075jx jxVar = (C60075jx) jvVar.instance;
                str.getClass();
                jxVar.f162405a |= 512;
                jxVar.f162415k = str;
            }
            if ((eyVar.f386484a & 2) != 0) {
                int i = eyVar.f386486c;
                jvVar.copyOnWrite();
                C60075jx jxVar2 = (C60075jx) jvVar.instance;
                jxVar2.f162405a |= 4;
                jxVar2.f162408d = i;
            }
            if ((eyVar.f386484a & 8) != 0) {
                int i2 = eyVar.f386488e;
                jvVar.copyOnWrite();
                C60075jx jxVar3 = (C60075jx) jvVar.instance;
                jxVar3.f162405a |= 64;
                jxVar3.f162412h = i2;
            }
            if ((eyVar.f386484a & 16) != 0) {
                int i3 = eyVar.f386489f;
                jvVar.copyOnWrite();
                C60075jx jxVar4 = (C60075jx) jvVar.instance;
                jxVar4.f162405a |= 16;
                jxVar4.f162410f = i3;
            }
            if ((eyVar.f386484a & 4) != 0) {
                int i4 = eyVar.f386487d;
                jvVar.copyOnWrite();
                C60075jx jxVar5 = (C60075jx) jvVar.instance;
                jxVar5.f162405a |= 2048;
                jxVar5.f162417m = i4;
            }
            return jvVar;
        } catch (IOException unused) {
            C59104x c = f266679e.mo56225c();
            c.mo56378ag(C58975e.f156826a, "ClearcutBistoLogger");
            ((C59052c) ((C59052c) c).mo56372aa(14868)).mo56386p("Error parsing received health packet on connect proto");
            return jvVar;
        }
    }

    /* renamed from: j */
    public static void m157553j(C60300nm nmVar) {
        C58976aa aaVar = C58975e.f156826a;
        C60548tz tzVar = (C60548tz) C60555uf.f164065cO.createBuilder();
        tzVar.copyOnWrite();
        C60555uf ufVar = (C60555uf) tzVar.instance;
        ufVar.f164093a |= 2;
        ufVar.f164258m = 1029;
        amo amo = amo.BISTO;
        tzVar.copyOnWrite();
        C60555uf ufVar2 = (C60555uf) tzVar.instance;
        ufVar2.f164070D = amo.f159234au;
        ufVar2.f164146b |= 8;
        tzVar.copyOnWrite();
        C60555uf ufVar3 = (C60555uf) tzVar.instance;
        nmVar.getClass();
        ufVar3.f164131al = nmVar;
        ufVar3.f164199c |= LinearLayoutManager.INVALID_OFFSET;
        C89949q.m146525j((C60555uf) tzVar.build(), (C60321oe) null, (C63196b) null, (String) null);
    }

    /* renamed from: a */
    public final void mo83543a(String str, String str2) {
        C90476a aVar = (C90476a) this.f266688j.mo27525b();
        C60298nk nkVar = (C60298nk) C60300nm.f163138H.createBuilder();
        C60301nn nnVar = (C60301nn) C60302no.f163173d.createBuilder();
        nnVar.copyOnWrite();
        C60302no noVar = (C60302no) nnVar.instance;
        str2.getClass();
        noVar.f163175a |= 2;
        noVar.f163177c = str2;
        nnVar.copyOnWrite();
        C60302no noVar2 = (C60302no) nnVar.instance;
        noVar2.f163175a |= 1;
        noVar2.f163176b = str;
        nkVar.copyOnWrite();
        C60300nm nmVar = (C60300nm) nkVar.instance;
        C60302no noVar3 = (C60302no) nnVar.build();
        noVar3.getClass();
        nmVar.f163160n = noVar3;
        nmVar.f163147a |= 8388608;
        mo83545c(nkVar);
    }

    /* renamed from: b */
    public final void mo83544b(String str) {
        C59104x d = f266679e.mo56226d();
        d.mo56378ag(C58975e.f156826a, "ClearcutBistoLogger");
        ((C59052c) ((C59052c) d).mo56372aa(14872)).mo56389s("%s", str);
        C90476a aVar = (C90476a) this.f266688j.mo27525b();
        mo83543a("CRASH", str);
    }

    /* renamed from: c */
    public final void mo83545c(C60298nk nkVar) {
        mo89244i(nkVar, (C95305k) this.f266681b.get());
    }

    /* renamed from: d */
    public final C95309o mo89241d() {
        return new C95308n(this.f266680a);
    }

    /* renamed from: e */
    public final C95309o mo89242e() {
        return new C95310p(this.f266680a);
    }

    /* renamed from: h */
    public final void mo89243h(C89496ch chVar) {
        C89655j.f242764a.f242765b = this;
        C60856cj.m92911t(C89486by.m145643a(this.f266685g, chVar), new C95304j(this), C60826bg.f164896a);
    }

    /* renamed from: i */
    public final void mo89244i(C60298nk nkVar, C95305k kVar) {
        int i = C95873a.f268446a;
        String c = this.f266686h.mo83548c("user_group_name");
        if (c != null) {
            nkVar.copyOnWrite();
            C60300nm nmVar = (C60300nm) nkVar.instance;
            C60300nm nmVar2 = C60300nm.f163138H;
            nmVar.f163147a |= 1048576;
            nmVar.f163157k = c;
        }
        C60291nd ndVar = (C60291nd) C60292ne.f163113l.createBuilder();
        int i2 = this.f266684f;
        ndVar.copyOnWrite();
        C60292ne neVar = (C60292ne) ndVar.instance;
        neVar.f163115a |= 4;
        neVar.f163116b = i2;
        if (kVar != null) {
            String str = kVar.f266673a;
            if (str != null) {
                ndVar.copyOnWrite();
                C60292ne neVar2 = (C60292ne) ndVar.instance;
                neVar2.f163115a |= 16;
                neVar2.f163117c = str;
            }
            int i3 = kVar.f266675c;
            if (i3 != 0) {
                ndVar.copyOnWrite();
                C60292ne neVar3 = (C60292ne) ndVar.instance;
                neVar3.f163115a |= 32;
                neVar3.f163118d = i3;
            }
            String str2 = kVar.f266676d;
            if (str2 != null) {
                ndVar.copyOnWrite();
                C60292ne neVar4 = (C60292ne) ndVar.instance;
                neVar4.f163115a |= 128;
                neVar4.f163120f = str2;
            }
            String str3 = kVar.f266678f;
            if (str3 != null) {
                ndVar.copyOnWrite();
                C60292ne neVar5 = (C60292ne) ndVar.instance;
                neVar5.f163115a |= 64;
                neVar5.f163119e = str3;
            }
        }
        C95311q.m157571e(this.f266687i, this.f266686h, ndVar);
        nkVar.copyOnWrite();
        C60300nm nmVar3 = (C60300nm) nkVar.instance;
        C60292ne neVar6 = (C60292ne) ndVar.build();
        C60300nm nmVar4 = C60300nm.f163138H;
        neVar6.getClass();
        nmVar3.f163151e = neVar6;
        nmVar3.f163147a |= 512;
        C58976aa aaVar = C58975e.f156826a;
        this.f266685g.execute(new C95303i(this, nkVar));
    }

    /* renamed from: k */
    public final void mo89245k(String str, String str2, C124636bb bbVar, int i, String str3, String str4) {
        boolean z;
        C95305k kVar = (C95305k) this.f266681b.get();
        if (C124636bb.UNKNOWN_ENABLED_STATE.equals(bbVar)) {
            z = kVar != null && kVar.f266677e;
        } else {
            z = C124636bb.OPA_ENABLED.equals(bbVar);
        }
        this.f266681b.set(new C95305k(str, str2, i, str3, z, str4));
    }

    /* renamed from: l */
    public final void mo89246l(String str, C124636bb bbVar) {
        C58976aa aaVar = C58975e.f156826a;
        C95305k kVar = (C95305k) this.f266681b.get();
        if (kVar != null && str.equals(kVar.f266674b) && !C124636bb.UNKNOWN_ENABLED_STATE.equals(bbVar)) {
            kVar.f266677e = C124636bb.OPA_ENABLED.equals(bbVar);
        }
    }
}
