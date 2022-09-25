package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10640a;

import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141513f;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.concurrent.futuresmixin.C46438d;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.a.f */
/* compiled from: PG */
final class C141436f implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C141432c f383906a;

    public C141436f(C141432c cVar) {
        this.f383906a = cVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        String str;
        C141513f.C141514a aVar = (C141513f.C141514a) bVar;
        C141432c cVar = this.f383906a;
        C69664n.m101061g(aVar, "checkedAnswerEvent");
        cVar.f383900f = aVar.f384134a;
        cVar.f383899e.incrementAndGet();
        C141431b bVar2 = cVar.f383896b;
        if (cVar.f383900f) {
            str = bVar2.getString(R.string.pronunciationlearning_correct_hint_text);
        } else {
            str = bVar2.getString(cVar.f383899e.get() == 2 ? R.string.pronunciationlearning_incorrect_hint_text : R.string.pronunciationlearning_try_again_button_text);
        }
        C69664n.m101060f(str, "with(fragment) {\n       …      )\n        }\n      }");
        C59052c cVar2 = (C59052c) C141432c.f383895a.mo56224b();
        cVar2.mo56379ah(new C59094n(41695));
        cVar2.mo56389s("Next message should say %s", str);
        View view = cVar.f383896b.getView();
        TextView textView = view != null ? (TextView) view.findViewById(R.id.pronunciationlearning_fillinblank_hint_message) : null;
        if (textView != null) {
            textView.setText(str);
        }
        if (cVar.f383900f || cVar.f383899e.get() == 2) {
            String string = cVar.f383896b.getString(R.string.pronunciationlearning_learning_sentence_sample_text_correct);
            C69664n.m101060f(string, "fragment.getString(R.str…ence_sample_text_correct)");
            str = str + " " + string;
        }
        cVar.f383898d.mo50428h(C46438d.m82810b(cVar.f383897c.mo116408a(str)).f121541a, (Object) null, cVar.f383902h);
        return C47392e.f123115a;
    }
}
