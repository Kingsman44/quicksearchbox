package com.google.android.libraries.mdi.download.p2236d;

import android.content.Context;
import android.net.Uri;
import android.os.Build;
import com.google.android.libraries.mdi.download.C28736bn;
import com.google.android.libraries.mdi.download.C28737bo;
import com.google.android.libraries.mdi.download.C28787cb;
import com.google.android.libraries.mdi.download.C29318dd;
import com.google.android.libraries.mdi.download.C29328dl;
import com.google.android.libraries.mdi.download.C29337du;
import com.google.android.libraries.mdi.download.C29338dv;
import com.google.android.libraries.mdi.download.C29380ed;
import com.google.android.libraries.mdi.download.C29392ep;
import com.google.android.libraries.mdi.download.C29397eu;
import com.google.android.libraries.mdi.download.C29398ev;
import com.google.android.libraries.mdi.download.C29658ia;
import com.google.android.libraries.mdi.download.delta.vcdiff.C29321a;
import com.google.android.libraries.mdi.download.p2236d.p2239c.C28933u;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29037d;
import com.google.android.libraries.mdi.download.p2236d.p2241e.C29045l;
import com.google.android.libraries.mdi.download.p2236d.p2242f.C29090d;
import com.google.android.libraries.mdi.download.p2247g.C29441e;
import com.google.android.libraries.storage.p3304a.C42813k;
import com.google.android.libraries.storage.p3304a.p3305a.C42724k;
import com.google.android.libraries.storage.p3304a.p3305a.C42725l;
import com.google.android.libraries.storage.p3304a.p3307c.C42768u;
import com.google.apps.tiktok.tracing.C47810es;
import com.google.common.base.C58833ax;
import com.google.common.util.concurrent.C60856cj;
import com.google.common.util.concurrent.C60866ct;
import com.google.common.util.concurrent.C60870cx;
import com.google.common.util.concurrent.C60922j;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: com.google.android.libraries.mdi.download.d.lp */
/* compiled from: PG */
public final class C29290lp {

    /* renamed from: a */
    public final Context f79385a;

    /* renamed from: b */
    public final C29658ia f79386b;

    /* renamed from: c */
    public final C29293ls f79387c;

    /* renamed from: d */
    public final C28933u f79388d;

    /* renamed from: e */
    public final C42813k f79389e;

    /* renamed from: f */
    public final C58833ax f79390f;

    /* renamed from: g */
    public final C58833ax f79391g;

    /* renamed from: h */
    public final C29037d f79392h;

    /* renamed from: i */
    public final C28787cb f79393i;

    /* renamed from: j */
    public final C58833ax f79394j;

    /* renamed from: k */
    public final Executor f79395k;

    /* renamed from: l */
    private final C29118ff f79396l;

    public C29290lp(Context context, C29658ia iaVar, C29293ls lsVar, C42813k kVar, C28933u uVar, C58833ax axVar, C58833ax axVar2, C29037d dVar, C28787cb cbVar, C29118ff ffVar, C58833ax axVar3, Executor executor) {
        this.f79385a = context;
        this.f79386b = iaVar;
        this.f79387c = lsVar;
        this.f79389e = kVar;
        this.f79388d = uVar;
        this.f79390f = axVar;
        this.f79391g = axVar2;
        this.f79392h = dVar;
        this.f79393i = cbVar;
        this.f79396l = ffVar;
        this.f79394j = axVar3;
        this.f79395k = executor;
    }

    /* renamed from: a */
    public final C60870cx mo34637a(C29398ev evVar) {
        C60870cx e = this.f79387c.mo34620e(evVar);
        C29260km kmVar = new C29260km(this, evVar);
        return C60922j.m93045h(e, C47810es.m84966f(kmVar), this.f79395k);
    }

    /* renamed from: b */
    public final C60870cx mo34638b() {
        if (Build.VERSION.SDK_INT >= 30) {
            try {
                Context context = this.f79385a;
                int i = C42725l.f111984a;
                this.f79389e.mo45892f(C42724k.m75484a("*.lease", context.getPackageName(), 0));
                this.f79392h.mo34543h(1077);
            } catch (C42768u unused) {
                C29045l.m53939k();
            } catch (IOException e) {
                C29045l.m53938j(e, "%s: Failed to release the leases in the android shared storage", "SharedFileManager");
                this.f79392h.mo34543h(1078);
            }
        }
        try {
            this.f79389e.mo45896j(C29090d.m53980a(this.f79385a, this.f79394j));
        } catch (IOException e2) {
            this.f79386b.mo34497a(e2, "Failure while deleting mdd storage during clear", new Object[0]);
        }
        return C60866ct.f164955a;
    }

    /* renamed from: c */
    public final C60870cx mo34639c(C29392ep epVar) {
        C60870cx g = this.f79396l.mo34602g(epVar);
        C29277lc lcVar = C29277lc.f79336a;
        return C60922j.m93045h(g, C47810es.m84966f(lcVar), this.f79395k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C60870cx mo34640d(C29398ev evVar) {
        C60870cx f = mo34642f(evVar);
        C29269kv kvVar = C29269kv.f79315a;
        return C60922j.m93045h(f, C47810es.m84966f(kvVar), this.f79395k);
    }

    /* renamed from: e */
    public final C60870cx mo34641e(C29398ev evVar) {
        C60870cx e = this.f79387c.mo34620e(evVar);
        C29262ko koVar = new C29262ko(this, evVar);
        return C60922j.m93045h(e, C47810es.m84966f(koVar), this.f79395k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C60870cx mo34642f(C29398ev evVar) {
        C60870cx e = this.f79387c.mo34620e(evVar);
        C29280lf lfVar = new C29280lf(evVar);
        return C60922j.m93045h(e, C47810es.m84966f(lfVar), this.f79395k);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public final C60870cx mo34643g(C29392ep epVar, C29328dl dlVar, C29398ev evVar, C29380ed edVar, int i, List list) {
        if (dlVar.f79474c.startsWith("inlinefile")) {
            C28736bn bnVar = new C28736bn();
            bnVar.f78062a = C28737bo.INVALID_INLINE_FILE_URL_SCHEME;
            bnVar.f78063b = "downloading a file with an inlinefile scheme is not supported, use importFiles instead.";
            return C60856cj.m92899h(bnVar.mo34334a());
        }
        C60870cx e = this.f79387c.mo34620e(evVar);
        C29272ky kyVar = new C29272ky(this, evVar, epVar, dlVar, edVar, i, list);
        return C60922j.m93045h(e, C47810es.m84966f(kyVar), this.f79395k);
    }

    /* renamed from: h */
    public final void mo34644h(C29392ep epVar, Uri uri) {
        if (this.f79391g.mo56113h()) {
            try {
                long a = this.f79389e.mo45887a(uri);
                if (a > 0) {
                    ((C29441e) this.f79391g.mo56107c()).mo34740j(epVar.f79682b, a);
                }
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: i */
    public final C60870cx mo34645i(List list, int i, int i2) {
        if (i == list.size()) {
            return C60866ct.f164955a;
        }
        C29338dv dvVar = (C29338dv) list.get(i);
        int a = C29337du.m54219a(dvVar.f79528e);
        if (a == 0) {
            a = 1;
        }
        C29321a aVar = (C29321a) this.f79390f.mo56107c();
        if (a != 2) {
            return mo34645i(list, i + 1, i2);
        }
        C29397eu euVar = (C29397eu) C29398ev.f79698g.createBuilder();
        C29318dd ddVar = dvVar.f79529f;
        if (ddVar == null) {
            ddVar = C29318dd.f79461c;
        }
        String str = ddVar.f79464b;
        euVar.copyOnWrite();
        C29398ev evVar = (C29398ev) euVar.instance;
        str.getClass();
        evVar.f79700a |= 4;
        evVar.f79703d = str;
        euVar.copyOnWrite();
        C29398ev evVar2 = (C29398ev) euVar.instance;
        evVar2.f79704e = i2 - 1;
        evVar2.f79700a |= 8;
        C29398ev evVar3 = (C29398ev) euVar.build();
        return C60922j.m93045h(this.f79387c.mo34620e(evVar3), C47810es.m84966f(new C29275la(this, evVar3, dvVar, list, i, i2)), this.f79395k);
    }

    /* renamed from: j */
    public final C60870cx mo34646j(int i, String str, String str2) {
        Uri e = C29090d.m53984e(this.f79385a, i, str, str2, this.f79386b, this.f79394j, false);
        if (e != null) {
            return C60856cj.m92900i(e);
        }
        C29045l.m53935g("%s: Failed to get file uri!", "SharedFileManager");
        C28736bn bnVar = new C28736bn();
        bnVar.f78062a = C28737bo.UNABLE_TO_CREATE_FILE_URI_ERROR;
        return C60856cj.m92899h(bnVar.mo34334a());
    }
}
