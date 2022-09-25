package com.google.android.apps.search.pronunciationlearning.p10638ui.p10639a.p10640a;

import android.content.Context;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.search.pronunciationlearning.p10638ui.shared.C141513f;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.p3674l.p3679c.C47388b;
import com.google.apps.tiktok.p3674l.p3679c.C47391d;
import com.google.apps.tiktok.p3674l.p3679c.C47392e;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;
import p5462h.p5483m.C69764m;

/* renamed from: com.google.android.apps.search.pronunciationlearning.ui.a.a.d */
/* compiled from: PG */
final class C141434d implements C47391d {

    /* renamed from: a */
    final /* synthetic */ C141432c f383904a;

    public C141434d(C141432c cVar) {
        this.f383904a = cVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C47392e mo18069a(C47388b bVar) {
        TextView textView;
        C141513f.C141516c cVar = (C141513f.C141516c) bVar;
        C141432c cVar2 = this.f383904a;
        C69664n.m101061g(cVar, "updateSentenceWithWordEvent");
        C59052c cVar3 = (C59052c) C141432c.f383895a.mo56224b();
        String str = cVar.f384136a;
        String str2 = cVar.f384137b;
        cVar3.mo56379ah(new C59094n(41697));
        cVar3.mo56354G("Update word choice from %s to %s", str, str2);
        View view = cVar2.f383896b.getView();
        if (!(view == null || (textView = (TextView) view.findViewById(R.id.pronunciationlearning_learning_sentence)) == null)) {
            String j = C69764m.m101231j(textView.getText().toString(), cVar.f384136a, cVar.f384137b);
            C59052c cVar4 = (C59052c) C141432c.f383895a.mo56224b();
            cVar4.mo56379ah(new C59094n(41698));
            cVar4.mo56389s("Update sentence string to say '%s'", j);
            int C = C69764m.m101186C(j, cVar.f384137b, 0, false, 6);
            int length = cVar.f384137b.length() + C;
            C59052c cVar5 = (C59052c) C141432c.f383895a.mo56224b();
            cVar5.mo56379ah(new C59094n(41699));
            cVar5.mo56393w("Update sentence string index %s to %s", C, length);
            SpannableString spannableString = new SpannableString(j);
            if (C != -1) {
                Context context = cVar2.f383896b.getContext();
                C69664n.m101058d(context);
                spannableString.setSpan(new ForegroundColorSpan(C1878d.m5128a(context, R.color.pronunciationlearning_text_blue)), C, length, 33);
                textView.setText(spannableString, TextView.BufferType.SPANNABLE);
            }
        }
        return C47392e.f123115a;
    }
}
