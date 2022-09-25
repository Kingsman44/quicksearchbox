package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import android.content.Context;
import android.util.Pair;
import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19045c;
import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19046d;
import com.google.android.libraries.assistant.portable.p1584a.p1585a.C19050h;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x;
import com.google.assistant.p3897e.p3902c.p3907c.C50929aa;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C51169z;
import com.google.assistant.p3897e.p3917i.p3918a.C51373fh;
import com.google.assistant.p3897e.p3921j.C52091ex;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52506ug;
import com.google.assistant.p3897e.p3921j.C52507uh;
import com.google.assistant.p3897e.p3921j.p3926e.C51927eg;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.base.C58833ax;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.knowledge.p4661a.p4662a.C61746h;
import com.google.knowledge.p4661a.p4662a.C61752n;
import com.google.p5277z.p5282c.C68013c;
import com.google.p5277z.p5282c.C68014d;
import com.google.p5277z.p5282c.C68015e;
import com.google.p5277z.p5282c.C68022l;
import com.google.protobuf.C62934bn;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import com.google.protobuf.p4746a.C62883b;
import java.util.Collections;
import java.util.List;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5463a.C69540x;
import p5462h.p5463a.p5464a.C69469c;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69648ae;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.fluidactions.fulfillment.impl.features.productivity.AlarmFeatureFormInputProcessor$progressCreateAlarmDialog$progressDialogResponse$1", mo61344c = "AlarmFeatureFormInputProcessor.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.k */
/* compiled from: PG */
final class C33089k extends C69572j implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C33080b f88599a;

    /* renamed from: b */
    final /* synthetic */ C33092n f88600b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33089k(C33080b bVar, C33092n nVar, C69577g gVar) {
        super(1, gVar);
        this.f88599a = bVar;
        this.f88600b = nVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33089k(this.f88599a, this.f88600b, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C51953ff ffVar;
        C50936ah ahVar;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C33080b bVar = this.f88599a;
        Context context = bVar.f88562d;
        C52091ex exVar = bVar.f88563e;
        C51953ff ffVar2 = bVar.f88560b;
        C52506ug ugVar = (C52506ug) C52507uh.f137838b.createBuilder();
        C69664n.m101060f(ugVar, "newBuilder()");
        C69664n.m101061g(ugVar, "builder");
        List unmodifiableList = Collections.unmodifiableList(((C52507uh) ugVar.instance).f137840a);
        C69664n.m101060f(unmodifiableList, "_builder.getFormFieldContentList()");
        new C62883b(unmodifiableList);
        C52490tr trVar = bVar.f88559a;
        C69664n.m101061g(trVar, "value");
        ugVar.mo53877a(trVar);
        C62942bv build = ugVar.build();
        C69664n.m101060f(build, "_builder.build()");
        C52091ex b = C19050h.m36505b(context, exVar, ffVar2, (C52507uh) build);
        C33080b bVar2 = this.f88599a;
        C69664n.m101060f(b, "conversationParamsResult");
        C33080b h = C33092n.m61386h(bVar2, b);
        C69648ae aeVar = new C69648ae();
        aeVar.f186027a = h.f88560b;
        C19045c cVar = new C19045c(h.f88563e);
        if (((C51373fh) cVar.f53448a.instance).f133804a.size() == 0 || cVar.mo24280l() == 0) {
            C59052c cVar2 = (C59052c) C33092n.f88604a.mo56225c();
            cVar2.mo56379ah(new C59094n(50869));
            cVar2.mo56386p("progressDialog: Empty DIS is not expected.");
            return null;
        }
        C51953ff ffVar3 = (C51953ff) aeVar.f186027a;
        if ((ffVar3.f136317a & 8) != 0) {
            Pair a = cVar.mo24269a(ffVar3.f136321e);
            if (!((C58833ax) a.first).mo56113h() || !((C58833ax) a.second).mo56113h()) {
                C59052c cVar3 = (C59052c) C33092n.f88604a.mo56225c();
                cVar3.mo56379ah(new C59094n(50870));
                cVar3.mo56386p("Didn't find matching intent state.");
                return null;
            }
            Object c = ((C58833ax) a.first).mo56107c();
            C69664n.m101060f(c, "pair.first.get()");
            int intValue = ((Number) c).intValue();
            Object c2 = ((C58833ax) a.second).mo56107c();
            C69664n.m101060f(c2, "pair.second.get()");
            int intValue2 = ((Number) c2).intValue();
            C62934bn builder = cVar.mo24272d(intValue, intValue2).toBuilder();
            C69664n.m101060f(builder, "dialogIntentStateAccesso…tIdx, disIdx).toBuilder()");
            C68013c cVar4 = (C68013c) builder;
            C61752n nVar = ((C68014d) cVar4.instance).f184280c;
            if (nVar == null) {
                nVar = C61752n.f166808f;
            }
            C69664n.m101060f(nVar, "intentStateBuilder.intent");
            C68022l lVar = ((C68014d) cVar4.instance).f184281d;
            if (lVar == null) {
                lVar = C68022l.f184294b;
            }
            C62934bn builder2 = lVar.toBuilder();
            C69664n.m101060f(builder2, "intentStateBuilder.signals.toBuilder()");
            C68015e eVar = (C68015e) builder2;
            C62971cq<C61746h> cqVar = nVar.f166812c;
            C69664n.m101060f(cqVar, "intent.argumentList");
            boolean z = false;
            for (C61746h hVar : cqVar) {
                String str = hVar.f166796d;
                int hashCode = str.hashCode();
                if (hashCode != 102727412) {
                    if (hashCode != 1778391856) {
                        if (hashCode == 1793702779 && str.equals("datetime")) {
                            int i = hVar.f166793a & 4;
                            z = i != 0;
                            eVar.mo60077b("datetime", C19046d.m36501g(i != 0 ? 2 : 3));
                        }
                    } else if (!str.equals("recurrence")) {
                    }
                } else if (!str.equals("label")) {
                }
                eVar.mo60077b(hVar.f166796d, C19046d.m36501g(2));
            }
            cVar4.copyOnWrite();
            C68014d dVar = (C68014d) cVar4.instance;
            C68022l lVar2 = (C68022l) eVar.build();
            lVar2.getClass();
            dVar.f184281d = lVar2;
            dVar.f184278a |= 4;
            cVar.mo24278j(intValue, intValue2, cVar4);
            C52091ex b2 = cVar.mo24270b(h.f88563e);
            C51953ff ffVar4 = (C51953ff) aeVar.f186027a;
            Optional g = C33136x.m61490g("datetime", ffVar4);
            if (g.isPresent()) {
                Object obj2 = g.get();
                C69664n.m101060f(obj2, "timeSelectionFieldOptional.get()");
                C62934bn builder3 = ((C51941eu) obj2).toBuilder();
                C69664n.m101060f(builder3, "this.toBuilder()");
                C51927eg a2 = C69664n.m101061g((C51937eq) builder3, "builder");
                C51937eq eqVar = a2.f136207a;
                eqVar.copyOnWrite();
                C51941eu euVar = (C51941eu) eqVar.instance;
                euVar.f136273a |= 64;
                euVar.f136282j = !z;
                ffVar = C33136x.m61489f(a2.mo53748a(), ffVar4, Optional.empty());
                C69664n.m101060f(ffVar, "updateShowNativeFormArgs…ativeFormArgs\n          )");
            } else {
                ffVar = ffVar4;
            }
            Optional g2 = C33136x.m61490g("confirm_field", ffVar4);
            if (g2.isPresent()) {
                Object obj3 = g2.get();
                C69664n.m101060f(obj3, "confirmButtonOptional.get()");
                C62934bn builder4 = ((C51941eu) obj3).toBuilder();
                C69664n.m101060f(builder4, "this.toBuilder()");
                C51927eg a3 = C69664n.m101061g((C51937eq) builder4, "builder");
                C51941eu euVar2 = (C51941eu) g2.get();
                if (euVar2.f136277e == 17) {
                    ahVar = (C50936ah) euVar2.f136278f;
                } else {
                    ahVar = C50936ah.f132593m;
                }
                C69664n.m101060f(ahVar, "confirmButtonOptional.get().button");
                C62934bn builder5 = ahVar.toBuilder();
                C69664n.m101060f(builder5, "this.toBuilder()");
                C51169z a4 = C69664n.m101061g((C50929aa) builder5, "builder");
                C50929aa aaVar = a4.f133202a;
                aaVar.copyOnWrite();
                C50936ah ahVar2 = (C50936ah) aaVar.instance;
                ahVar2.f132595a |= 4;
                ahVar2.f132600f = z;
                a3.mo53749b(a4.mo53524a());
                ffVar = C33136x.m61489f(a3.mo53748a(), ffVar, Optional.empty());
                C69664n.m101060f(ffVar, "updateShowNativeFormArgs…ativeFormArgs\n          )");
            }
            aeVar.f186027a = ffVar;
            C52490tr trVar2 = h.f88559a;
            C69469c cVar5 = new C69469c(10);
            if (trVar2.f137798b == 3) {
                C33136x.m61490g("label", (C51953ff) aeVar.f186027a).ifPresent(new C33055a(cVar5, aeVar));
            } else {
                cVar5.add(C33116d.m61451j((C51953ff) aeVar.f186027a));
            }
            return C33118f.m61461b(C69540x.m100943a(cVar5), C58733pz.f156496a, b2);
        }
        C59052c cVar6 = (C59052c) C33092n.f88604a.mo56225c();
        cVar6.mo56379ah(new C59094n(50871));
        cVar6.mo56386p("Id field in ShowNativeFormArgs is unspecified.");
        return null;
    }
}
