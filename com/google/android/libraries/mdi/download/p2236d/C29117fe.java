package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.text.TextUtils;
import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28738bp;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C29324dh;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29329dm;
import com.google.android.libraries.mdi.download.C29330dn;
import com.google.android.libraries.mdi.download.C29332dp;
import com.google.android.libraries.mdi.download.C29333dq;
import com.google.android.libraries.mdi.download.C29334dr;
import com.google.android.libraries.mdi.download.C29380ed;
import com.google.android.libraries.mdi.download.C29390en;
import com.google.android.libraries.mdi.download.C29391eo;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29401ey;
import com.google.android.libraries.mdi.download.C29402ez;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.C29662ie;
import com.google.android.libraries.mdi.download.p2236d.p2240d.C28963a;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29035b;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29088b;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29099m;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29112z;
import com.google.android.libraries.mdi.download.p2256k.C29667b;
import com.google.android.libraries.mdi.download.p2257l.C29669a;
import com.google.android.libraries.mdi.download.p2257l.C29670b;
import com.google.android.libraries.mdi.download.p2257l.C29672d;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3305a.C42724k;
import com.google.android.libraries.storage.p3304a.p3305a.C42725l;
import com.google.android.libraries.storage.p3304a.p3307c.C42758k;
import com.google.android.libraries.storage.p3304a.p3307c.C42764q;
import com.google.android.libraries.storage.p3304a.p3307c.C42768u;
import com.google.android.libraries.storage.p3304a.p3312f.C42796t;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58526ih;
import com.google.common.p4552o.p4566l.C60125aq;
import com.google.common.p4552o.p4566l.C60126ar;
import com.google.common.p4552o.p4566l.C60131aw;
import com.google.common.p4552o.p4566l.C60132ax;
import com.google.common.p4552o.p4566l.C60182ct;
import com.google.common.util.concurrent.C60846c;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import com.google.common.util.concurrent.C60931s;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;
import p5570k.p5571a.C71337f;

/* renamed from: com.google.android.libraries.mdi.download.d.fe */
/* compiled from: PG */
public final class C29117fe {

    /* renamed from: a */
    public final Context f78972a;

    /* renamed from: b */
    public final C29037d f78973b;

    /* renamed from: c */
    public final C29658ia f78974c;

    /* renamed from: d */
    public final C29118ff f78975d;

    /* renamed from: e */
    public final C29290lp f78976e;

    /* renamed from: f */
    public final C29662ie f78977f;

    /* renamed from: g */
    public final C42813k f78978g;

    /* renamed from: h */
    public final C58833ax f78979h;

    /* renamed from: i */
    public final Executor f78980i;

    /* renamed from: j */
    public final C58833ax f78981j;

    /* renamed from: k */
    public final C58833ax f78982k;

    /* renamed from: l */
    public final C28963a f78983l;

    /* renamed from: m */
    public final C28787cb f78984m;

    /* renamed from: n */
    public final C29669a f78985n = new C29669a();

    public C29117fe(Context context, C29037d dVar, C29658ia iaVar, C29118ff ffVar, C29290lp lpVar, C29662ie ieVar, C58833ax axVar, Executor executor, C58833ax axVar2, C42813k kVar, C58833ax axVar3, C28963a aVar, C28787cb cbVar) {
        this.f78972a = context;
        this.f78973b = dVar;
        this.f78974c = iaVar;
        this.f78975d = ffVar;
        this.f78976e = lpVar;
        this.f78977f = ieVar;
        this.f78979h = axVar;
        this.f78980i = executor;
        this.f78981j = axVar2;
        this.f78978g = kVar;
        this.f78982k = axVar3;
        this.f78983l = aVar;
        this.f78984m = cbVar;
    }

    /* renamed from: q */
    public static boolean m54050q(C29334dr drVar, C29334dr drVar2) {
        if (drVar2.f79516r == drVar.f79516r && drVar2.f79517s.equals(drVar.f79517s) && drVar2.f79503e == drVar.f79503e && m54051r(drVar, drVar2) && drVar2.f79508j == drVar.f79508j && drVar2.f79509k == drVar.f79509k) {
            C29380ed edVar = drVar2.f79510l;
            if (edVar == null) {
                edVar = C29380ed.f79641f;
            }
            C29380ed edVar2 = drVar.f79510l;
            if (edVar2 == null) {
                edVar2 = C29380ed.f79641f;
            }
            if (edVar.equals(edVar2)) {
                int a = C29332dp.m54217a(drVar2.f79507i);
                if (a == 0) {
                    a = 1;
                }
                int a2 = C29332dp.m54217a(drVar.f79507i);
                if (a2 == 0) {
                    a2 = 1;
                }
                if (a == a2) {
                    int a3 = C29667b.m54713a(drVar2.f79515q);
                    if (a3 == 0) {
                        a3 = 1;
                    }
                    int a4 = C29667b.m54713a(drVar.f79515q);
                    if (a4 == 0) {
                        a4 = 1;
                    }
                    if (a3 == a4) {
                        C71337f fVar = drVar2.f79519u;
                        if (fVar == null) {
                            fVar = C71337f.f190517c;
                        }
                        C71337f fVar2 = drVar.f79519u;
                        if (fVar2 == null) {
                            fVar2 = C71337f.f190517c;
                        }
                        if (!fVar.equals(fVar2)) {
                            return false;
                        }
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: r */
    public static boolean m54051r(C29334dr drVar, C29334dr drVar2) {
        return drVar.f79512n.equals(drVar2.f79512n);
    }

    /* renamed from: t */
    public static boolean m54052t(C29402ez ezVar, long j) {
        return j > ezVar.f79717e;
    }

    /* renamed from: v */
    public static void m54053v(int i, C29037d dVar, C29334dr drVar) {
        dVar.mo34544i(i, drVar.f79501c, drVar.f79503e, drVar.f79516r, drVar.f79517s);
    }

    /* renamed from: w */
    public static void m54054w(C29037d dVar, C29334dr drVar, C29328dl dlVar, int i) {
        C60131aw awVar = (C60131aw) C60132ax.f162652j.createBuilder();
        awVar.copyOnWrite();
        C60132ax axVar = (C60132ax) awVar.instance;
        axVar.f162655b = C60182ct.m92532a(i);
        axVar.f162654a |= 1;
        String str = drVar.f79501c;
        awVar.copyOnWrite();
        C60132ax axVar2 = (C60132ax) awVar.instance;
        str.getClass();
        axVar2.f162654a |= 2;
        axVar2.f162656c = str;
        int i2 = drVar.f79503e;
        awVar.copyOnWrite();
        C60132ax axVar3 = (C60132ax) awVar.instance;
        axVar3.f162654a |= 4;
        axVar3.f162657d = i2;
        long j = drVar.f79516r;
        awVar.copyOnWrite();
        C60132ax axVar4 = (C60132ax) awVar.instance;
        axVar4.f162654a |= 128;
        axVar4.f162661h = j;
        String str2 = drVar.f79517s;
        awVar.copyOnWrite();
        C60132ax axVar5 = (C60132ax) awVar.instance;
        str2.getClass();
        axVar5.f162654a |= 256;
        axVar5.f162662i = str2;
        String str3 = dlVar.f79473b;
        awVar.copyOnWrite();
        C60132ax axVar6 = (C60132ax) awVar.instance;
        str3.getClass();
        axVar6.f162654a |= 8;
        axVar6.f162658e = str3;
        dVar.mo34539d((C60132ax) awVar.build());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final Uri mo34578a(Uri uri, C29328dl dlVar, C29334dr drVar, boolean z) {
        Uri b = C29099m.m54006b(this.f78972a, this.f78981j, dlVar, drVar);
        if (z) {
            Uri a = C29112z.m54046a(this.f78972a, b);
            if (!this.f78978g.mo45894h(b) || !a.toString().equals(uri.toString())) {
                throw new IOException("Isolated file uri does not exist or points to an unexpected target");
            }
        }
        return b;
    }

    /* renamed from: b */
    public final Uri mo34579b(C29328dl dlVar, C29398ev evVar, C29402ez ezVar) {
        Context context = this.f78972a;
        int a = C29332dp.m54217a(evVar.f79704e);
        Uri e = C29090d.m53984e(context, a == 0 ? 1 : a, ezVar.f79714b, dlVar.f79477f, this.f78974c, this.f78981j, false);
        if (e != null) {
            return e;
        }
        C29045l.m53935g("%s: Failed to get file uri!", "FileGroupManager");
        throw new C29088b(28, "Failed to get local file uri");
    }

    /* renamed from: c */
    public final C60870cx mo34580c(C29334dr drVar) {
        if (!drVar.f79511m) {
            return C60866ct.f164955a;
        }
        try {
            C29099m.m54010f(this.f78972a, this.f78981j, drVar, this.f78978g);
            ArrayList arrayList = new ArrayList(drVar.f79512n.size());
            Iterator it = drVar.f79512n.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                C29328dl dlVar = (C29328dl) it.next();
                int a = C29324dh.m54215a(dlVar.f79483l);
                if (a != 0 && a == 2) {
                    arrayList.add(C60856cj.m92899h(new UnsupportedOperationException("Preserve File Paths is invalid with Android Blob Sharing")));
                    break;
                }
                C60870cx i = mo34586i(dlVar, drVar);
                C28826ai aiVar = new C28826ai(this, dlVar, drVar);
                arrayList.add(C60922j.m93045h(i, C47810es.m84966f(aiVar), this.f78980i));
            }
            C60870cx a2 = C29672d.m54728c(arrayList).mo34823a(C28827aj.f78311a, this.f78980i);
            C29115fc fcVar = new C29115fc(this, drVar);
            C60856cj.m92911t(a2, C47810es.m84974n(fcVar), this.f78980i);
            return a2;
        } catch (IOException e) {
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.UNABLE_TO_REMOVE_SYMLINK_STRUCTURE;
            bnVar.f78063b = "Unable to cleanup symlink structure";
            bnVar.f78064c = e;
            return C60856cj.m92899h(bnVar.mo34334a());
        }
    }

    /* renamed from: d */
    public final C60870cx mo34581d(C29392ep epVar, C29380ed edVar, C60931s sVar) {
        AtomicReference atomicReference = new AtomicReference();
        C60870cx e = mo34582e(epVar, false);
        C28889bd bdVar = new C28889bd(this, epVar, atomicReference, edVar, sVar);
        C60870cx h = C60922j.m93045h(e, C47810es.m84966f(bdVar), this.f78980i);
        C28890be beVar = new C28890be(this, atomicReference, epVar);
        return C60846c.m92879h(h, Exception.class, C47810es.m84966f(beVar), this.f78980i);
    }

    /* renamed from: e */
    public final C60870cx mo34582e(C29392ep epVar, boolean z) {
        C29391eo eoVar = (C29391eo) epVar.toBuilder();
        eoVar.copyOnWrite();
        C29392ep epVar2 = (C29392ep) eoVar.instance;
        epVar2.f79681a |= 8;
        epVar2.f79685e = z;
        return this.f78975d.mo34602g((C29392ep) eoVar.build());
    }

    /* renamed from: f */
    public final C60870cx mo34583f(C29334dr drVar) {
        return mo34584g(drVar, false, false, 0, drVar.f79512n.size());
    }

    /* renamed from: g */
    public final C60870cx mo34584g(C29334dr drVar, boolean z, boolean z2, int i, int i2) {
        if (i < i2) {
            C29328dl dlVar = (C29328dl) drVar.f79512n.get(i);
            int i3 = 1;
            if (!C29099m.m54015k(dlVar)) {
                int a = C29332dp.m54217a(drVar.f79507i);
                if (a != 0) {
                    i3 = a;
                }
                return C29670b.m54719g(this.f78976e.mo34640d(C29292lr.m54176a(dlVar, i3))).mo34820f(C29291lq.class, new C28947cl(this, drVar), this.f78980i).mo34822i(new C28948cm(this, dlVar, drVar, z, z2, i, i2), this.f78980i);
            }
            return mo34584g(drVar, z, z2, i + 1, i2);
        } else if (z) {
            return C60856cj.m92900i(C29116fd.FAILED);
        } else {
            if (z2) {
                return C60856cj.m92900i(C29116fd.PENDING);
            }
            return C60856cj.m92900i(C29116fd.DOWNLOADED);
        }
    }

    /* renamed from: h */
    public final C60870cx mo34585h() {
        C58526ih ihVar = new C58526ih();
        C60870cx c = this.f78975d.mo34598c();
        C29063ed edVar = new C29063ed(ihVar);
        return C60922j.m93044g(c, C47810es.m84963c(edVar), this.f78980i);
    }

    /* renamed from: i */
    public final C60870cx mo34586i(C29328dl dlVar, C29334dr drVar) {
        if (C29099m.m54015k(dlVar)) {
            return C60856cj.m92900i(Uri.parse(dlVar.f79474c));
        }
        int a = C29332dp.m54217a(drVar.f79507i);
        if (a == 0) {
            a = 1;
        }
        return this.f78976e.mo34641e(C29292lr.m54176a(dlVar, a));
    }

    /* renamed from: j */
    public final C60870cx mo34587j(C60931s sVar) {
        ArrayList arrayList = new ArrayList();
        C60870cx d = this.f78975d.mo34599d();
        C28987dd ddVar = new C28987dd(this, arrayList, sVar);
        return C60922j.m93045h(d, C47810es.m84966f(ddVar), this.f78980i);
    }

    /* renamed from: k */
    public final C60870cx mo34588k(C29392ep epVar, C28738bp bpVar, long j, String str) {
        C60125aq aqVar = (C60125aq) C60126ar.f162612j.createBuilder();
        String str2 = epVar.f79682b;
        aqVar.copyOnWrite();
        C60126ar arVar = (C60126ar) aqVar.instance;
        str2.getClass();
        arVar.f162614a |= 1;
        arVar.f162615b = str2;
        String str3 = epVar.f79683c;
        aqVar.copyOnWrite();
        C60126ar arVar2 = (C60126ar) aqVar.instance;
        str3.getClass();
        arVar2.f162614a |= 4;
        arVar2.f162617d = str3;
        aqVar.copyOnWrite();
        C60126ar arVar3 = (C60126ar) aqVar.instance;
        arVar3.f162614a |= 64;
        arVar3.f162621h = j;
        aqVar.copyOnWrite();
        C60126ar arVar4 = (C60126ar) aqVar.instance;
        str.getClass();
        arVar4.f162614a |= 128;
        arVar4.f162622i = str;
        C29118ff ffVar = this.f78975d;
        C29391eo eoVar = (C29391eo) epVar.toBuilder();
        eoVar.copyOnWrite();
        C29392ep epVar2 = (C29392ep) eoVar.instance;
        epVar2.f79681a |= 8;
        epVar2.f79685e = false;
        return C60922j.m93045h(ffVar.mo34602g((C29392ep) eoVar.build()), C47810es.m84966f(new C28951cp(this, aqVar, bpVar)), this.f78980i);
    }

    /* renamed from: l */
    public final C60870cx mo34589l(C29334dr drVar) {
        return mo34590m(drVar, 0, drVar.f79512n.size());
    }

    /* renamed from: m */
    public final C60870cx mo34590m(C29334dr drVar, int i, int i2) {
        int i3 = 1;
        if (i >= i2) {
            return C60856cj.m92900i(true);
        }
        C29328dl dlVar = (C29328dl) drVar.f79512n.get(i);
        if (C29099m.m54015k(dlVar)) {
            return mo34590m(drVar, i + 1, i2);
        }
        int a = C29332dp.m54217a(drVar.f79507i);
        if (a != 0) {
            i3 = a;
        }
        C29398ev a2 = C29292lr.m54176a(dlVar, i3);
        C29290lp lpVar = this.f78976e;
        C60870cx e = lpVar.f79387c.mo34620e(a2);
        C29288ln lnVar = new C29288ln(lpVar, a2);
        C60870cx h = C60922j.m93045h(e, C47810es.m84966f(lnVar), lpVar.f79395k);
        C28944ci ciVar = new C28944ci(this, drVar, i, i2);
        return C60922j.m93045h(h, C47810es.m84966f(ciVar), this.f78980i);
    }

    /* renamed from: n */
    public final C60870cx mo34591n(C29334dr drVar, C29328dl dlVar, C29398ev evVar, long j) {
        C29290lp lpVar = this.f78976e;
        C60870cx f = lpVar.mo34642f(evVar);
        C29283li liVar = new C29283li(lpVar, j, evVar);
        C60870cx h = C60922j.m93045h(f, C47810es.m84966f(liVar), lpVar.f79395k);
        C28908bw bwVar = new C28908bw(this, dlVar, drVar);
        return C60922j.m93045h(h, C47810es.m84966f(bwVar), this.f78980i);
    }

    /* renamed from: o */
    public final C60870cx mo34592o(C29392ep epVar, C29334dr drVar, boolean z, C60931s sVar, C29035b bVar) {
        C29334dr drVar2 = drVar;
        C29045l.m53932d("%s: Verify group: %s, remove pending version: %s", "FileGroupManager", drVar2.f79501c, Boolean.valueOf(z));
        C29391eo eoVar = (C29391eo) epVar.toBuilder();
        eoVar.copyOnWrite();
        C29392ep epVar2 = (C29392ep) eoVar.instance;
        epVar2.f79681a |= 8;
        epVar2.f79685e = true;
        C29392ep epVar3 = (C29392ep) eoVar.build();
        C29391eo eoVar2 = (C29391eo) epVar.toBuilder();
        eoVar2.copyOnWrite();
        C29392ep epVar4 = (C29392ep) eoVar2.instance;
        epVar4.f79681a |= 8;
        epVar4.f79685e = false;
        C29392ep epVar5 = (C29392ep) eoVar2.build();
        long a = this.f78977f.mo34498a();
        C29330dn dnVar = drVar2.f79500b;
        if (dnVar == null) {
            dnVar = C29330dn.f79488g;
        }
        C29329dm dmVar = (C29329dm) dnVar.toBuilder();
        dmVar.copyOnWrite();
        C29330dn dnVar2 = (C29330dn) dmVar.instance;
        dnVar2.f79490a |= 4;
        dnVar2.f79493d = a;
        C29330dn dnVar3 = (C29330dn) dmVar.build();
        C29333dq dqVar = (C29333dq) drVar.toBuilder();
        dqVar.copyOnWrite();
        C29334dr drVar3 = (C29334dr) dqVar.instance;
        dnVar3.getClass();
        drVar3.f79500b = dnVar3;
        drVar3.f79499a |= 1;
        return C29670b.m54719g(mo34583f(drVar)).mo34822i(new C28996dm(this, bVar, drVar, epVar5, z, sVar, epVar3, (C29334dr) dqVar.build()), this.f78980i).mo34822i(new C28997dn(this, drVar), this.f78980i);
    }

    /* renamed from: p */
    public final C60870cx mo34593p(C29392ep epVar, C29334dr drVar, C60931s sVar) {
        return mo34592o(epVar, drVar, true, sVar, C29035b.m53908a(this.f78973b));
    }

    /* renamed from: s */
    public final boolean mo34594s(String str) {
        try {
            this.f78972a.getPackageManager().getApplicationInfo(str, 0);
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u */
    public final C60870cx mo34595u(C29334dr drVar, C29328dl dlVar, C29402ez ezVar, C29398ev evVar, String str, long j, int i) {
        C29334dr drVar2 = drVar;
        C29328dl dlVar2 = dlVar;
        C29402ez ezVar2 = ezVar;
        long j2 = j;
        String str2 = BuildConfig.FLAVOR;
        if (!ezVar2.f79716d || m54052t(ezVar2, j2)) {
            int i2 = i;
            long max = Math.max(j2, ezVar2.f79717e);
            Context context = this.f78972a;
            C42813k kVar = this.f78978g;
            int i3 = 0;
            try {
                int i4 = C42725l.f111984a;
                OutputStream outputStream = (OutputStream) kVar.mo45889c(C42724k.m75484a(String.valueOf(str).concat(".lease"), context.getPackageName(), max), new C42796t());
                if (outputStream != null) {
                    outputStream.close();
                }
            } catch (C42768u e) {
                if (!TextUtils.isEmpty(e.getMessage())) {
                    str2 = e.getMessage();
                }
                C29045l.m53941m("%s: Failed to share file %s, file group %s. UnsupportedFileStorageOperation was thrown with message \"%s\"", "AndroidSharingUtil", dlVar2.f79473b, drVar2.f79501c, str2);
                str2 = "UnsupportedFileStorageOperation was thrown: ".concat(String.valueOf(str2));
                i3 = 24;
            } catch (C42764q unused) {
                C29045l.m53937i("%s: Malformed lease uri file %s, file group %s", "AndroidSharingUtil", dlVar2.f79473b, drVar2.f79501c);
                str2 = String.format("Malformed lease Uri for file %s, group %s", new Object[]{dlVar2.f79473b, drVar2.f79501c});
                i3 = 18;
            } catch (C42758k unused2) {
                C29045l.m53937i("%s: Failed to share after download for file %s, file group %s due to LimitExceededException", "AndroidSharingUtil", dlVar2.f79473b, drVar2.f79501c);
                str2 = String.format("System limit exceeded for file %s, group %s", new Object[]{dlVar2.f79473b, drVar2.f79501c});
                i3 = 25;
            } catch (IOException unused3) {
                C29045l.m53937i("%s: Failed to acquire lease for file %s, file group %s", "AndroidSharingUtil", dlVar2.f79473b, drVar2.f79501c);
                str2 = String.format("Error while acquiring lease for file %s, group %s", new Object[]{dlVar2.f79473b, drVar2.f79501c});
                i3 = 20;
            }
            if (i3 == 0) {
                C29290lp lpVar = this.f78976e;
                C29401ey eyVar = (C29401ey) C29402ez.f79711h.createBuilder();
                C29390en enVar = C29390en.DOWNLOAD_COMPLETE;
                eyVar.copyOnWrite();
                C29402ez ezVar3 = (C29402ez) eyVar.instance;
                ezVar3.f79715c = enVar.f79678h;
                ezVar3.f79713a |= 2;
                eyVar.copyOnWrite();
                C29402ez ezVar4 = (C29402ez) eyVar.instance;
                ezVar4.f79713a |= 1;
                ezVar4.f79714b = "android_shared_".concat(String.valueOf(str));
                eyVar.copyOnWrite();
                C29402ez ezVar5 = (C29402ez) eyVar.instance;
                ezVar5.f79713a |= 4;
                ezVar5.f79716d = true;
                eyVar.copyOnWrite();
                C29402ez ezVar6 = (C29402ez) eyVar.instance;
                ezVar6.f79713a |= 8;
                ezVar6.f79717e = max;
                eyVar.copyOnWrite();
                C29402ez ezVar7 = (C29402ez) eyVar.instance;
                str.getClass();
                ezVar7.f79713a |= 16;
                ezVar7.f79718f = str;
                return C60922j.m93045h(lpVar.f79387c.mo34622g(evVar, (C29402ez) eyVar.build()), C47810es.m84966f(new C29114fb(this, dlVar, drVar, i, max)), this.f78980i);
            }
            throw new C29088b(i3, str2);
        }
        m54054w(this.f78973b, drVar2, dlVar2, i);
        return C60856cj.m92900i(true);
    }
}
