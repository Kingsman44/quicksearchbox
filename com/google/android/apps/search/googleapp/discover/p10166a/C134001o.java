package com.google.android.apps.search.googleapp.discover.p10166a;

import com.google.android.apps.search.googleapp.discover.p10244v.C135182c;
import com.google.android.apps.search.googleapp.discover.p10244v.C135200t;
import com.google.android.apps.search.googleapp.discover.p10248y.C135255f;
import com.google.android.apps.search.googleapp.discover.streamui.p10232h.C134755f;
import com.google.android.libraries.elements.interfaces.C21311r;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.common.util.concurrent.C60856cj;
import com.google.protos.youtube.elements.CommandOuterClass$Command;
import java.util.List;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;

@C69567e(mo61343b = "com.google.android.apps.search.googleapp.discover.actions.DismissActionApi$dismissWithUndo$1", mo61344c = "DismissActionApi.kt", mo61345d = "invokeSuspend", mo61346e = {87})
/* renamed from: com.google.android.apps.search.googleapp.discover.a.o */
/* compiled from: PG */
public final class C134001o extends C69572j implements C69630p {

    /* renamed from: a */
    int f365007a;

    /* renamed from: b */
    final /* synthetic */ C134002p f365008b;

    /* renamed from: c */
    final /* synthetic */ String f365009c;

    /* renamed from: d */
    final /* synthetic */ List f365010d;

    /* renamed from: e */
    final /* synthetic */ CommandOuterClass$Command f365011e;

    /* renamed from: f */
    final /* synthetic */ C21311r f365012f;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C134001o(C134002p pVar, String str, List list, CommandOuterClass$Command commandOuterClass$Command, C21311r rVar, C69577g gVar) {
        super(2, gVar);
        this.f365008b = pVar;
        this.f365009c = str;
        this.f365010d = list;
        this.f365011e = commandOuterClass$Command;
        this.f365012f = rVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C134001o) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f365007a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C134002p pVar = this.f365008b;
            C135200t tVar = pVar.f365017e;
            C134755f fVar = pVar.f365018f.f366954c;
            String str = this.f365009c;
            List b = pVar.f365015c.mo112081b(this.f365010d);
            this.f365007a = 1;
            obj = tVar.mo112154b(fVar, str, b, this);
            if (obj == aVar) {
                return aVar;
            }
        }
        C135182c cVar = (C135182c) obj;
        if (cVar == null) {
            return null;
        }
        C134002p pVar2 = this.f365008b;
        CommandOuterClass$Command commandOuterClass$Command = this.f365011e;
        C21311r rVar = this.f365012f;
        C134003q qVar = pVar2.f365014b;
        if (qVar.f365021b.f185946a > 1) {
            C59052c cVar2 = (C59052c) C134003q.f365020a.mo56226d();
            cVar2.mo56379ah(new C59094n(40200));
            cVar2.mo56386p("Populating the changes when one already exists.");
        }
        qVar.f365021b.mo61321j(cVar);
        ((C40305b) pVar2.f365013a.mo27525b()).mo32544c().mo26124a(commandOuterClass$Command, rVar).mo61453k();
        pVar2.f365016d.mo50787a(C60856cj.m92900i(cVar), C135255f.f368471a);
        return C69788q.f186170a;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C134001o(this.f365008b, this.f365009c, this.f365010d, this.f365011e, this.f365012f, gVar);
    }
}
