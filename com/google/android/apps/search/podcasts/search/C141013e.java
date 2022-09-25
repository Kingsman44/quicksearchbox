package com.google.android.apps.search.podcasts.search;

import android.text.Editable;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
import com.google.android.apps.search.podcasts.searchresults.C141042f;
import com.google.android.apps.search.podcasts.searchresults.C141043g;
import com.google.android.apps.search.podcasts.searchresults.C141044h;
import com.google.android.apps.search.podcasts.searchresults.C141045i;
import com.google.android.googlequicksearchbox.R;
import com.google.apps.tiktok.contrib.p3629c.C46490k;
import com.google.apps.tiktok.contrib.p3629c.C46496q;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.podcasts.search.e */
/* compiled from: PG */
final class C141013e implements TextView.OnEditorActionListener {

    /* renamed from: a */
    final /* synthetic */ EditText f382829a;

    /* renamed from: b */
    final /* synthetic */ C141001b f382830b;

    public C141013e(EditText editText, C141001b bVar) {
        this.f382829a = editText;
        this.f382830b = bVar;
    }

    public final boolean onEditorAction(TextView textView, int i, KeyEvent keyEvent) {
        Editable text = this.f382829a.getText();
        C69664n.m101060f(text, "searchFieldEditText.text");
        if (text.length() <= 0) {
            return false;
        }
        if (i != 3 && (keyEvent == null || keyEvent.getKeyCode() != 66)) {
            return false;
        }
        C141001b bVar = this.f382830b;
        C46496q c = bVar.f382809h.mo50482c(bVar.f382804c);
        C141044h hVar = (C141044h) C141045i.f382906c.createBuilder();
        C141042f fVar = (C141042f) C141043g.f382903b.createBuilder();
        String obj = this.f382829a.getText().toString();
        fVar.copyOnWrite();
        obj.getClass();
        ((C141043g) fVar.instance).f382905a = obj;
        hVar.copyOnWrite();
        C141045i iVar = (C141045i) hVar.instance;
        C141043g gVar = (C141043g) fVar.build();
        gVar.getClass();
        iVar.f382909b = gVar;
        iVar.f382908a = 1;
        c.mo50508d(R.id.podcasts_action_to_search_results, C46490k.m82868a(hVar.build()).mo50504d());
        this.f382830b.f382806e.mo116073b();
        return true;
    }
}
