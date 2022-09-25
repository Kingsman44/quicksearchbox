package com.google.apps.tiktok.experiments.phenotype;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.phenotype.client.p2420a.C31639g;
import com.google.apps.tiktok.account.data.C46108a;
import com.google.apps.tiktok.account.data.C46215j;
import com.google.common.util.concurrent.C60870cx;
import p5462h.p5473f.p5474a.C69632r;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.es */
/* compiled from: PG */
final class C47034es extends C69665o implements C69632r {

    /* renamed from: a */
    final /* synthetic */ C47038ew f122604a;

    /* renamed from: b */
    final /* synthetic */ C46108a f122605b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C47034es(C47038ew ewVar, C46108a aVar) {
        super(4);
        this.f122604a = ewVar;
        this.f122605b = aVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo8479a(Object obj, Object obj2, Object obj3, Object obj4) {
        String str = (String) obj;
        int intValue = ((Number) obj2).intValue();
        String[] strArr = (String[]) obj3;
        byte[] bArr = (byte[]) obj4;
        C69664n.m101061g(str, "mendelPkg");
        C69664n.m101061g(strArr, "logSources");
        C47038ew ewVar = this.f122604a;
        C31639g gVar = ewVar.f122615c;
        C46215j b = this.f122605b.mo50210b();
        C69664n.m101060f(b, "account.info()");
        String e = ewVar.f122617e.mo50217e(b);
        if (e == null) {
            e = BuildConfig.FLAVOR;
        }
        C60870cx g = gVar.mo37293g(str, intValue, strArr, bArr, e);
        C69664n.m101060f(g, "phenotypeApi.registerSyn…       null\n            )");
        return g;
    }
}
