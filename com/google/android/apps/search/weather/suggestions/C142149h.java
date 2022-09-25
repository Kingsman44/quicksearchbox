package com.google.android.apps.search.weather.suggestions;

import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28306ab;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.p2193e.p2195b.C28375ak;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.p5269w.p5270a.C67961c;
import com.google.p5269w.p5270a.C67962d;

/* renamed from: com.google.android.apps.search.weather.suggestions.h */
/* compiled from: PG */
final class C142149h extends C46756m {

    /* renamed from: a */
    final /* synthetic */ C142150i f385612a;

    public C142149h(C142150i iVar) {
        this.f385612a = iVar;
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ View mo18113a(ViewGroup viewGroup) {
        return (SuggestionView) this.f385612a.f385614b.getLayoutInflater().inflate(R.layout.weather_suggestions_list_item, viewGroup, false);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18114b(View view, Object obj) {
        C67962d dVar = (C67962d) obj;
        C142132b a = ((SuggestionView) view).mo17754z();
        C28306ab abVar = a.f385588c;
        TextView textView = a.f385586a;
        C28313c a2 = a.f385589d.mo33805a(C28427h.m53115a(121831));
        C67961c cVar = dVar.f184179e;
        if (cVar == null) {
            cVar = C67961c.f184168d;
        }
        a2.mo33858f(C28375ak.m53059a(cVar.f184172c));
        abVar.mo33802c(textView, a2);
        a.f385586a.setText(dVar.f184176b);
        a.f385586a.setOnClickListener(new C47591co(a.f385587b, "SuggestionTextView onClick", new C142123a(a, dVar)));
    }

    /* renamed from: c */
    public final /* synthetic */ void mo50773c(View view) {
        C142132b a = ((SuggestionView) view).mo17754z();
        a.f385586a.setOnClickListener((View.OnClickListener) null);
        a.f385586a.setText((CharSequence) null);
        C28306ab.m52929e(a.f385586a);
    }
}
