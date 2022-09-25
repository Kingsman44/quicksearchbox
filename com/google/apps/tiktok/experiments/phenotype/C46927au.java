package com.google.apps.tiktok.experiments.phenotype;

import android.net.Uri;
import com.google.apps.tiktok.p3648i.p3649a.C47151b;
import com.google.apps.tiktok.p3648i.p3649a.C47153d;
import java.io.File;
import java.util.Set;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.apps.tiktok.experiments.phenotype.au */
/* compiled from: PG */
final class C46927au extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ Set f122410a;

    /* renamed from: b */
    final /* synthetic */ C47151b f122411b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C46927au(Set set, C47151b bVar) {
        super(1);
        this.f122410a = set;
        this.f122411b = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        C47153d dVar;
        String str = (String) obj;
        C69664n.m101061g(str, "mendelPackage");
        if (this.f122410a.contains(str)) {
            dVar = C47153d.m83865d();
        } else {
            dVar = C47153d.m83864c(1);
        }
        C47151b bVar = this.f122411b;
        String str2 = File.separator;
        String str3 = File.separator;
        Uri d = bVar.mo51052d(dVar, str2 + "phenotype" + str3 + str);
        C69664n.m101060f(d, "pathFactory.getMobStoreU…THE_FRAMEWORK\n          )");
        return d;
    }
}
