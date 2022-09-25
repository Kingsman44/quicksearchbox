package com.google.android.apps.search.assistant.surfaces.voice.p9785ui.p9811e;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.voice.p9590e.C127406c;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.C129337y;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129304h;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129306j;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129308l;
import com.google.android.apps.search.assistant.surfaces.voice.p9785ui.common.uielements.suggestion.p9809a.C129312p;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9730b.p9731a.C128560a;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips.AssistantChipsView;
import com.google.android.apps.search.assistant.surfaces.voice.shared.p9733ui.chips.C128605f;
import com.google.android.googlequicksearchbox.R;
import com.google.assistant.p3897e.p3921j.p3926e.C51983gi;
import com.google.assistant.p3897e.p3921j.p3926e.C51986gl;
import com.google.common.p4522b.C58485gu;
import com.google.protobuf.C62971cq;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65492a;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65493b;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65494c;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65495d;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65496e;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65497f;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65499h;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65501j;
import com.google.protos.p5068j.p5069a.p5070a.p5071a.p5076b.p5077a.p5093b.p5094a.p5095a.p5096a.p5097a.p5098a.C65503l;
import p3186j$.time.Duration;
import p3186j$.util.function.Function;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.ui.e.g */
/* compiled from: PG */
final class C129392g implements Function {

    /* renamed from: a */
    final /* synthetic */ C129389e f355321a;

    public C129392g(C129389e eVar) {
        this.f355321a = eVar;
    }

    public final /* synthetic */ Function andThen(Function function) {
        return Function.CC.$default$andThen(this, function);
    }

    public final /* bridge */ /* synthetic */ Object apply(Object obj) {
        C51986gl glVar = (C51986gl) obj;
        if ((glVar.f136423a & 2) == 0) {
            return C127406c.f350821b;
        }
        C129389e eVar = this.f355321a;
        C58485gu a = C129337y.f355222a.mo108976a(glVar, this.f355321a.f355313g.mo51121p().getPackageManager());
        C69664n.m101060f(a, "INSTANCE.toSuggestionChi…geManager\n              )");
        eVar.f355318l = a;
        C129389e eVar2 = this.f355321a;
        C58485gu<C129304h> guVar = eVar2.f355318l;
        C69664n.m101061g(guVar, "suggestionChips");
        C65492a aVar = (C65492a) C65497f.f178057b.createBuilder();
        C69664n.m101060f(aVar, "newBuilder()");
        C65503l a2 = C69664n.m101061g(aVar, "builder");
        for (C129304h hVar : guVar) {
            a2.mo59393c();
            C65493b bVar = (C65493b) C65496e.f178050f.createBuilder();
            C69664n.m101060f(bVar, "newBuilder()");
            C65499h a3 = C69664n.m101061g(bVar, "builder");
            C129312p pVar = hVar.f355144c;
            if (pVar != null) {
                int i = pVar.f355164a;
                C65493b bVar2 = a3.f178060a;
                bVar2.copyOnWrite();
                C65496e eVar3 = (C65496e) bVar2.instance;
                eVar3.f178052a |= 8;
                eVar3.f178056e = i;
            }
            C129308l lVar = hVar.f355142a;
            if (lVar != null) {
                String str = lVar.f355153b;
                C69664n.m101060f(str, "it.view.id");
                a3.mo59387c(str);
                C129308l lVar2 = hVar.f355142a;
                if (lVar2 == null) {
                    lVar2 = C129308l.f355150g;
                }
                String str2 = lVar2.f355154c;
                C69664n.m101060f(str2, "it.view.displayText");
                a3.mo59388d(str2);
                C129308l lVar3 = hVar.f355142a;
                if (lVar3 == null) {
                    lVar3 = C129308l.f355150g;
                }
                C129306j jVar = lVar3.f355156e;
                if (jVar == null) {
                    jVar = C129306j.f355146c;
                }
                if ((jVar.f355148a & 1) != 0) {
                    C65494c cVar = (C65494c) C65495d.f178044e.createBuilder();
                    C69664n.m101060f(cVar, "newBuilder()");
                    C65501j a4 = C69664n.m101061g(cVar, "builder");
                    C129308l lVar4 = hVar.f355142a;
                    if (lVar4 == null) {
                        lVar4 = C129308l.f355150g;
                    }
                    C129306j jVar2 = lVar4.f355156e;
                    if (jVar2 == null) {
                        jVar2 = C129306j.f355146c;
                    }
                    String str3 = jVar2.f355149b;
                    C69664n.m101060f(str3, "it.view.icon.uri");
                    a4.mo59390b(str3);
                    a3.mo59386b(a4.mo59389a());
                }
            }
            a2.mo59392b(a3.mo59385a());
        }
        C65497f a5 = a2.mo59391a();
        AssistantChipsView assistantChipsView = (AssistantChipsView) eVar2.f355314h.requireView().findViewById(R.id.assistant_suggestion_escape_hatch_view);
        if (assistantChipsView != null) {
            C128605f a6 = assistantChipsView.mo17754z();
            a6.mo108549a(a5);
            C62971cq<C65496e> cqVar = a5.f178059a;
            C69664n.m101060f(cqVar, "assistantChips.chipsList");
            for (C65496e eVar4 : cqVar) {
                C69664n.m101060f(eVar4, "chip");
                a6.mo108550b(eVar4, new C129396k(eVar2));
            }
        }
        C129389e eVar5 = this.f355321a;
        C69664n.m101060f(glVar, "suggestions");
        C51983gi giVar = glVar.f136427e;
        if (giVar == null) {
            giVar = C51983gi.f136411b;
        }
        String str4 = giVar.f136413a;
        C69664n.m101060f(str4, "suggestions.ngaInputPlateData.headerText");
        if (str4.length() != 0) {
            View requireView = eVar5.f355314h.requireView();
            TextView textView = (TextView) requireView.findViewById(R.id.assistant_header_text);
            textView.setVisibility(0);
            textView.setText(str4);
            requireView.findViewById(R.id.assistant_logo).setVisibility(0);
        }
        C128560a aVar2 = this.f355321a.f355316j;
        Duration ofSeconds = Duration.ofSeconds(5);
        C69664n.m101060f(ofSeconds, "ofSeconds(5)");
        aVar2.mo108518b(ofSeconds);
        return C127406c.f350820a;
    }

    public final /* synthetic */ Function compose(Function function) {
        return Function.CC.$default$compose(this, function);
    }
}
