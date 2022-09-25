package com.google.android.apps.search.podcasts.p10588n;

import com.google.android.apps.search.podcasts.p10549a.C139958c;
import com.google.android.apps.search.podcasts.p10585m.p10586a.C140641b;
import com.google.android.apps.search.podcasts.p10601r.C140989k;
import com.google.android.apps.search.podcasts.p10601r.C140993o;
import com.google.common.util.concurrent.C60856cj;
import com.google.p4017at.p4082j.p4083a.C54400cz;
import com.google.p4017at.p4082j.p4083a.C54402da;
import com.google.protobuf.C62942bv;
import com.google.protos.p4757ac.p4758a.C63110i;
import com.google.protos.p4757ac.p4758a.C63111j;
import com.google.protos.p4757ac.p4758a.C63113l;
import java.util.Collections;
import java.util.Map;
import p5462h.p5463a.C69505av;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5473f.p5475b.C69665o;

/* renamed from: com.google.android.apps.search.podcasts.n.d */
/* compiled from: PG */
final class C140675d extends C69665o implements C69626l {

    /* renamed from: a */
    final /* synthetic */ String f382071a;

    /* renamed from: b */
    final /* synthetic */ String f382072b;

    /* renamed from: c */
    final /* synthetic */ C140676e f382073c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C140675d(String str, String str2, C140676e eVar) {
        super(1);
        this.f382071a = str;
        this.f382072b = str2;
        this.f382073c = eVar;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo5761a(Object obj) {
        C140993o oVar;
        int b;
        Map map = (Map) obj;
        C69664n.m101061g(map, "showResultResult");
        C54402da daVar = (C54402da) map.get(this.f382071a);
        if (daVar == null || daVar.f142891b == null || !daVar.mo54116b(this.f382072b)) {
            if (daVar == null || (b = C54400cz.m87377b(daVar.f142890a)) == 0 || b != 7) {
                oVar = C140993o.NOT_FOUND;
            } else {
                oVar = C140993o.EXPLICIT;
            }
            return C60856cj.m92900i(new C140673b(oVar, (C140641b) null));
        }
        C63113l lVar = daVar.f142891b;
        if (lVar == null) {
            lVar = C63113l.f170365p;
        }
        C69664n.m101060f(lVar, "showResult.show");
        Map unmodifiableMap = Collections.unmodifiableMap(daVar.f142892c);
        C69664n.m101060f(unmodifiableMap, "showResult.episodesMap");
        C139958c cVar = this.f382073c.f382074a;
        C63110i iVar = (C63110i) ((C63111j) C69505av.m100865g(unmodifiableMap, this.f382072b)).toBuilder();
        iVar.copyOnWrite();
        C63111j jVar = (C63111j) iVar.instance;
        lVar.getClass();
        jVar.f170360k = lVar;
        jVar.f170350a |= 512;
        C62942bv build = iVar.build();
        C69664n.m101060f(build, "episodeMetadata.toBuilde…ata(showMetadata).build()");
        return C140989k.m228948f(cVar.mo115361a((C63111j) build), C140674c.f382070a);
    }
}
