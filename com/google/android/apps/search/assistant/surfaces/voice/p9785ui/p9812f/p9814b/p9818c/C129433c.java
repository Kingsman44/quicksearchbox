package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9812f.p9814b.p9818c;

import com.google.android.googlequicksearchbox.R;
import com.google.protobuf.C62942bv;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65544b;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65546d;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65548f;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65550h;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65551i;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65553k;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65554l;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65555m;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65557o;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65558p;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65562t;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5099b.p5105b.p5106a.p5107a.p5108a.C65563u;
import kotlinx.coroutines.C71422aw;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69630p;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.apps.search.assistant.surfaces.voice.ui.input.chips.read.ReadInputChipContent$chipContent$1", mo61344c = "ReadInputChipContent.kt", mo61345d = "invokeSuspend", mo61346e = {31})
/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.f.b.c.c */
/* compiled from: PG */
final class C129433c extends C69572j implements C69630p {

    /* renamed from: a */
    int f355396a;

    /* renamed from: b */
    final /* synthetic */ C129436f f355397b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C129433c(C129436f fVar, C69577g gVar) {
        super(2, gVar);
        this.f355397b = fVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5192a(Object obj, Object obj2) {
        return ((C129433c) mo5194c((C71422aw) obj, (C69577g) obj2)).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C65558p pVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        if (this.f355396a != 0) {
            C69714l.m101134b(obj);
        } else {
            C69714l.m101134b(obj);
            C129436f fVar = this.f355397b;
            this.f355396a = 1;
            obj = fVar.mo109034c(this);
            if (obj == aVar) {
                return aVar;
            }
        }
        if (!((Boolean) obj).booleanValue()) {
            int i = C129436f.f355404b;
            pVar = C65558p.f178153h;
        } else {
            int i2 = C129436f.f355404b;
            C129436f fVar2 = this.f355397b;
            C65553k kVar = (C65553k) C65558p.f178153h.createBuilder();
            C69664n.m101060f(kVar, "newBuilder()");
            C65546d a = C69664n.m101061g(kVar, "builder");
            a.mo59399e(C65557o.READ_IT);
            String string = fVar2.f355407a.getResources().getString(R.string.assistant_chip_read_label);
            C69664n.m101060f(string, "context.getResources().g…ssistant_chip_read_label)");
            a.mo59398d(string);
            C65554l lVar = (C65554l) C65555m.f178142c.createBuilder();
            C69664n.m101060f(lVar, "newBuilder()");
            C65548f a2 = C69664n.m101061g(lVar, "builder");
            C65554l lVar2 = a2.f178133a;
            lVar2.copyOnWrite();
            C65555m mVar = (C65555m) lVar2.instance;
            mVar.f178144a = 4;
            mVar.f178145b = Integer.valueOf(R.drawable.gs_record_voice_over_vd_theme_20);
            a.mo59397c(a2.mo59400a());
            C65550h hVar = (C65550h) C65551i.f178138c.createBuilder();
            C69664n.m101060f(hVar, "newBuilder()");
            C65544b a3 = C69664n.m101061g(hVar, "builder");
            C65562t tVar = (C65562t) C65563u.f178167a.createBuilder();
            C69664n.m101060f(tVar, "newBuilder()");
            C69664n.m101061g(tVar, "builder");
            C62942bv build = tVar.build();
            C69664n.m101060f(build, "_builder.build()");
            C65563u uVar = (C65563u) build;
            C69664n.m101061g(uVar, "value");
            C65550h hVar2 = a3.f178131a;
            hVar2.copyOnWrite();
            C65551i iVar = (C65551i) hVar2.instance;
            uVar.getClass();
            iVar.f178141b = uVar;
            iVar.f178140a = 2;
            a.mo59396b(a3.mo59394a());
            pVar = a.mo59395a();
        }
        C69664n.m101060f(pVar, "if (!shouldShowChip()) {…on {} }\n        }\n      }");
        return pVar;
    }

    /* renamed from: c */
    public final C69577g mo5194c(Object obj, C69577g gVar) {
        return new C129433c(this.f355397b, gVar);
    }
}
