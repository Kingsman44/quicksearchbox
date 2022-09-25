package com.google.android.apps.search.googleapp.p10338l.p10339a;

import com.google.android.apps.search.googleapp.p10338l.C136419m;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlinx.coroutines.C71422aw;
import kotlinx.coroutines.C71803m;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69505av;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.feedback.statedump.StateDumpCollector$dumpContent$1", mo61344c = "StateDumpCollector.kt", mo61345d = "invokeSuspend", mo61346e = {36})
/* renamed from: com.google.android.apps.search.googleapp.l.a.ad */
/* compiled from: PG */
public final class C136381ad extends C69572j implements C69630p {

    /* renamed from: a */
    int f371300a;

    /* renamed from: b */
    final /* synthetic */ C136378aa f371301b;

    /* renamed from: c */
    final /* synthetic */ String f371302c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C136381ad(C136378aa aaVar, String str, C69577g gVar) {
        super(2, gVar);
        this.f371301b = aaVar;
        this.f371302c = str;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C136381ad) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f371300a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C136378aa aaVar = this.f371301b;
            this.f371300a = 1;
            obj = C71803m.m105040a(aaVar.f371291a, new C136401t(aaVar, (C69577g) null), this);
            if (obj == aVar) {
                return aVar;
            }
        }
        Map map = (Map) obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap(C69505av.m100860b(map.size()));
        for (Map.Entry entry : map.entrySet()) {
            linkedHashMap.put(((C136399r) entry.getKey()).f371341a, entry.getValue());
        }
        C136396o oVar = new C136396o(String.valueOf(this.f371302c).concat("  "));
        C136419m mVar = C136382ae.f371304b;
        C69664n.m101061g(mVar, "allowLevel");
        CharSequence charSequence = ((C136389h) oVar.mo112973a(new C136393l(oVar, mVar, linkedHashMap))).f371316a;
        String str = this.f371302c;
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(str).concat(C136382ae.f371303a));
        sb.append(10);
        sb.append(charSequence);
        CharSequence charSequence2 = (CharSequence) oVar.mo112973a(new C136395n(oVar));
        if (charSequence2 != null) {
            sb.append(charSequence2);
        }
        return sb.toString();
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C136381ad(this.f371301b, this.f371302c, gVar);
    }
}
