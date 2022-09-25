package com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2549d;

import com.evernote.android.state.BuildConfig;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33116d;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33118f;
import com.google.android.libraries.search.assistant.fluidactions.p2542d.p2544b.p2545a.p2552g.C33136x;
import com.google.assistant.p3897e.p3902c.p3907c.C50936ah;
import com.google.assistant.p3897e.p3902c.p3907c.C51012dc;
import com.google.assistant.p3897e.p3902c.p3907c.C51027dr;
import com.google.assistant.p3897e.p3902c.p3907c.C51030du;
import com.google.assistant.p3897e.p3921j.C52490tr;
import com.google.assistant.p3897e.p3921j.C52494tv;
import com.google.assistant.p3897e.p3921j.C52513un;
import com.google.assistant.p3897e.p3921j.p3926e.C51927eg;
import com.google.assistant.p3897e.p3921j.p3926e.C51937eq;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.assistant.p3897e.p3921j.p3926e.C51953ff;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4522b.C58733pz;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import com.google.protobuf.C62934bn;
import p3186j$.util.Optional;
import p5462h.C69714l;
import p5462h.C69788q;
import p5462h.p5466c.C69577g;
import p5462h.p5466c.p5467a.C69554a;
import p5462h.p5466c.p5468b.p5469a.C69567e;
import p5462h.p5466c.p5468b.p5469a.C69572j;
import p5462h.p5473f.p5474a.C69626l;
import p5462h.p5473f.p5475b.C69664n;

@C69567e(mo61343b = "com.google.android.libraries.search.assistant.fluidactions.fulfillment.impl.features.productivity.AlarmFeatureFormInputProcessor$progressCreateAlarmDialog$updateFormFieldsVisibilityResponse$1", mo61344c = "AlarmFeatureFormInputProcessor.kt", mo61345d = "invokeSuspend", mo61346e = {})
/* renamed from: com.google.android.libraries.search.assistant.fluidactions.d.b.a.d.l */
/* compiled from: PG */
final class C33090l extends C69572j implements C69626l {

    /* renamed from: a */
    final /* synthetic */ C33092n f88601a;

    /* renamed from: b */
    final /* synthetic */ Optional f88602b;

    /* renamed from: c */
    final /* synthetic */ C33080b f88603c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C33090l(C33092n nVar, Optional optional, C33080b bVar, C69577g gVar) {
        super(1, gVar);
        this.f88601a = nVar;
        this.f88602b = optional;
        this.f88603c = bVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo5761a(Object obj) {
        return new C33090l(this.f88601a, this.f88602b, this.f88603c, (C69577g) obj).mo5193b(C69788q.f186170a);
    }

    /* renamed from: b */
    public final Object mo5193b(Object obj) {
        C52494tv tvVar;
        C52494tv tvVar2;
        C50936ah ahVar;
        C51030du duVar;
        C51030du duVar2;
        C69554a aVar = C69554a.COROUTINE_SUSPENDED;
        C69714l.m101134b(obj);
        C33092n nVar = this.f88601a;
        Optional optional = this.f88602b;
        C33080b bVar = this.f88603c;
        if (!optional.isPresent()) {
            return null;
        }
        Object obj2 = optional.get();
        C69664n.m101060f(obj2, "updateFormFieldVisibilityOptional.get()");
        C51953ff d = C33136x.m61487d((C52513un) obj2, bVar.f88560b);
        C52490tr trVar = bVar.f88559a;
        int i = trVar.f137798b;
        if (i == 9) {
            return C33118f.m61461b(C58597ky.m90212c(C33116d.m61451j(d)), C58733pz.f156496a, bVar.f88563e);
        }
        if (i == 4) {
            tvVar = (C52494tv) trVar.f137799c;
        } else {
            tvVar = C52494tv.f137809c;
        }
        if ((tvVar.f137811a & 1) != 0) {
            C69664n.m101060f(d, "showNativeFormArgs");
            C52490tr trVar2 = bVar.f88559a;
            if (trVar2.f137798b == 4) {
                tvVar2 = (C52494tv) trVar2.f137799c;
            } else {
                tvVar2 = C52494tv.f137809c;
            }
            int i2 = (int) tvVar2.f137812b;
            Optional g = C33136x.m61490g("providers", d);
            boolean isPresent = g.isPresent();
            String str = BuildConfig.FLAVOR;
            if (!isPresent) {
                C59052c cVar = (C59052c) C33092n.f88604a.mo56225c();
                cVar.mo56379ah(new C59094n(50874));
                cVar.mo56386p("getSelectedAppIconIdentifierFromProvidersField, providers field is missing.");
            } else {
                Object obj3 = g.get();
                C69664n.m101060f(obj3, "providersFieldOptional.get()");
                C51941eu euVar = (C51941eu) obj3;
                if (i2 >= 0) {
                    if (euVar.f136277e == 6) {
                        duVar = (C51030du) euVar.f136278f;
                    } else {
                        duVar = C51030du.f132868g;
                    }
                    if (i2 < duVar.f132875f.size()) {
                        if (euVar.f136277e == 6) {
                            duVar2 = (C51030du) euVar.f136278f;
                        } else {
                            duVar2 = C51030du.f132868g;
                        }
                        C51012dc dcVar = ((C51027dr) duVar2.f132875f.get(i2)).f132864k;
                        if (dcVar == null) {
                            dcVar = C51012dc.f132813k;
                        }
                        str = dcVar.f132821g;
                        C69664n.m101060f(str, "providersField.list.getL…).image.appIconIdentifier");
                    }
                }
                C59052c cVar2 = (C59052c) C33092n.f88604a.mo56225c();
                cVar2.mo56379ah(new C59094n(50873));
                cVar2.mo56386p("getSelectedAppIconIdentifierFromProvidersField, invalid item index.");
            }
            if (str.length() == 0) {
                C59052c cVar3 = (C59052c) C33092n.f88604a.mo56225c();
                cVar3.mo56379ah(new C59094n(50881));
                cVar3.mo56386p("maybeUpdateFormFieldsVisibility, fail to get user selected app icon identifier.");
                return null;
            }
            nVar.mo38520g(str);
            C69664n.m101060f(d, "showNativeFormArgs");
            C51953ff f = C33136x.m61489f(C33136x.m61485b((C51941eu) C33136x.m61490g("providers", d).get()), d, Optional.empty());
            C69664n.m101060f(f, "updateShowNativeFormArgs…ders, showNativeFormArgs)");
            C69664n.m101060f(f, "showNativeFormArgs");
            Optional g2 = C33136x.m61490g("clock_app_picker_field", f);
            if (!g2.isPresent()) {
                C59052c cVar4 = (C59052c) C33092n.f88604a.mo56225c();
                cVar4.mo56379ah(new C59094n(50872));
                cVar4.mo56386p("updateClockAppPickerFieldWithSelectedAppIconIdentifier, clockAppPickerField is missing.");
            } else {
                Object obj4 = g2.get();
                C69664n.m101060f(obj4, "clockAppPickerFieldOptional.get()");
                C62934bn builder = ((C51941eu) obj4).toBuilder();
                C69664n.m101060f(builder, "this.toBuilder()");
                C51927eg a = C69664n.m101061g((C51937eq) builder, "builder");
                C51941eu euVar2 = (C51941eu) g2.get();
                if (euVar2.f136277e == 17) {
                    ahVar = (C50936ah) euVar2.f136278f;
                } else {
                    ahVar = C50936ah.f132593m;
                }
                C50936ah a2 = C33136x.m61484a(ahVar, str);
                C69664n.m101060f(a2, "updateButtonImageWithNew…nIdentifier\n            )");
                a.mo53749b(a2);
                f = C33136x.m61489f(a.mo53748a(), f, Optional.empty());
                C69664n.m101060f(f, "updateShowNativeFormArgs…ield, showNativeFormArgs)");
            }
            return C33118f.m61461b(C58597ky.m90212c(C33116d.m61451j(f)), C58733pz.f156496a, bVar.f88563e);
        }
        C59052c cVar5 = (C59052c) C33092n.f88604a.mo56225c();
        cVar5.mo56379ah(new C59094n(50882));
        cVar5.mo56386p("maybeUpdateFormFieldsVisibility, unknown field is tapped.");
        return null;
    }
}
