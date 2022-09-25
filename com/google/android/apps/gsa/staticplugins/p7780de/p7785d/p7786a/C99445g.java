package com.google.android.apps.gsa.staticplugins.p7780de.p7785d.p7786a;

import android.graphics.drawable.GradientDrawable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0673gh;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.logging.p2185ve.C28310af;
import com.google.android.libraries.logging.p2185ve.C28313c;
import com.google.android.libraries.logging.p2185ve.C28427h;
import com.google.android.libraries.logging.p2185ve.C28443m;
import com.google.android.libraries.logging.p2185ve.C28449s;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import p3186j$.util.Map;
import p3186j$.util.function.Consumer;

/* renamed from: com.google.android.apps.gsa.staticplugins.de.d.a.g */
/* compiled from: PG */
public final class C99445g extends C0640fb {

    /* renamed from: d */
    private static final C59071e f278271d = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.de.d.a.g");

    /* renamed from: a */
    public final Consumer f278272a;

    /* renamed from: b */
    public final C28443m f278273b;

    /* renamed from: c */
    public boolean f278274c = true;

    /* renamed from: e */
    private final List f278275e;

    /* renamed from: f */
    private final C28310af f278276f;

    /* renamed from: g */
    private final Map f278277g;

    public C99445g(List list, Consumer consumer, Map map, C28310af afVar, C28443m mVar) {
        this.f278275e = list;
        this.f278272a = consumer;
        this.f278277g = map;
        this.f278276f = afVar;
        this.f278273b = mVar;
    }

    public final int getItemCount() {
        return this.f278275e.size();
    }

    public final void onBindViewHolder(C0673gh ghVar, int i) {
        if (i < 0 || i >= this.f278275e.size()) {
            ((C59052c) ((C59052c) f278271d.mo56226d()).mo56372aa(32624)).mo56393w("#onBindViewHolder(): Invalid position specified: %d. item list size: %d.", i, this.f278275e.size());
            this.f278274c = false;
            return;
        }
        C99446h hVar = (C99446h) this.f278275e.get(i);
        int parseInt = Integer.parseInt((String) Map.EL.getOrDefault(this.f278277g, hVar.mo91452c(), "-1"));
        if (parseInt == -1) {
            ((C59052c) ((C59052c) f278271d.mo56226d()).mo56372aa(32625)).mo56389s("#onBindViewHolder(): language %s not present in languageIndexMap.", hVar.mo91452c());
            this.f278274c = false;
            return;
        }
        C99444f fVar = (C99444f) ghVar;
        Locale forLanguageTag = Locale.forLanguageTag(hVar.mo91452c());
        fVar.f278268a.setText(forLanguageTag.getDisplayLanguage(forLanguageTag));
        fVar.f278268a.setTextColor(hVar.mo91451b().intValue());
        if (!TextUtils.equals(forLanguageTag.getLanguage(), "en")) {
            fVar.f278269b.setText(forLanguageTag.getDisplayLanguage(Locale.ENGLISH));
            fVar.f278269b.setTextColor(hVar.mo91451b().intValue());
            fVar.f278269b.setVisibility(0);
        } else {
            fVar.f278269b.setVisibility(8);
        }
        ((GradientDrawable) fVar.f278270c.getBackground()).setColor(hVar.mo91450a().intValue());
        C28313c a = this.f278276f.f76997b.mo33800a(C28427h.m53115a(108943));
        a.mo33858f(C28449s.m53155a(parseInt));
        a.mo33809b(fVar.f278270c);
        fVar.f278270c.setContentDescription(String.valueOf(String.valueOf(fVar.f278269b.getText())).concat(" Button"));
        fVar.f278270c.setOnClickListener(new C89943l(new C99443e(this, hVar)));
    }

    public final C0673gh onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new C99444f(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.language_picker_view_item, viewGroup, false));
    }
}
