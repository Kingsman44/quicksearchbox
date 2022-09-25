package com.google.apps.tiktok.experiments.phenotype;

import com.google.android.libraries.phenotype.client.stable.C31747n;
import com.google.common.util.concurrent.C60870cx;
import com.google.protobuf.C63088z;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.as */
/* compiled from: PG */
public final class C46925as {

    /* renamed from: a */
    public final C31747n f122406a;

    /* renamed from: b */
    public final Map f122407b;

    /* renamed from: c */
    private final C47059m f122408c;

    public C46925as(C47059m mVar, C31747n nVar, Map map) {
        C69664n.m101061g(mVar, "configurationCommitter");
        C69664n.m101061g(nVar, "experimentTokenDecorator");
        C69664n.m101061g(map, "logSources");
        this.f122408c = mVar;
        this.f122406a = nVar;
        this.f122407b = map;
    }

    /* renamed from: a */
    public final C60870cx mo50924a(String str, String str2, C63088z zVar) {
        C69664n.m101061g(str, "packageName");
        return this.f122408c.mo50991a(str2, zVar, new C46924ar(this, str));
    }
}
