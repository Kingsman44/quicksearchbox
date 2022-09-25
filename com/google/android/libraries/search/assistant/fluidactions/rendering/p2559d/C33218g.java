package com.google.android.libraries.search.assistant.fluidactions.rendering.p2559d;

import android.view.View;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2555a.C33182g;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormFieldGroupView;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormMainView;
import com.google.android.libraries.search.assistant.fluidactions.rendering.p2561ui.FormSubSectionView;
import com.google.assistant.p3897e.p3921j.p3926e.C51941eu;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.libraries.search.assistant.fluidactions.rendering.d.g */
/* compiled from: PG */
public final class C33218g {

    /* renamed from: a */
    public final FormMainView f88833a;

    /* renamed from: b */
    public C33182g f88834b;

    /* renamed from: c */
    public final List f88835c = new ArrayList();

    /* renamed from: d */
    public final List f88836d = new ArrayList();

    /* renamed from: e */
    public final List f88837e = new ArrayList();

    /* renamed from: f */
    public final Map f88838f = new LinkedHashMap();

    /* renamed from: g */
    public final Map f88839g = new LinkedHashMap();

    /* renamed from: h */
    private final Map f88840h = new LinkedHashMap();

    public C33218g(FormMainView formMainView) {
        C69664n.m101061g(formMainView, "formMainView");
        this.f88833a = formMainView;
    }

    /* renamed from: a */
    public final int mo38603a(FormFieldGroupView formFieldGroupView, int i) {
        C69664n.m101061g(formFieldGroupView, "formFieldGroupView");
        this.f88836d.add(formFieldGroupView);
        int size = this.f88836d.size() - 1;
        this.f88838f.put(Integer.valueOf(size), Integer.valueOf(i));
        return size;
    }

    /* renamed from: b */
    public final int mo38604b(FormSubSectionView formSubSectionView) {
        C69664n.m101061g(formSubSectionView, "formSubSectionView");
        this.f88835c.add(formSubSectionView);
        return this.f88835c.size() - 1;
    }

    /* renamed from: c */
    public final View mo38605c(String str) {
        C69664n.m101061g(str, "id");
        return (View) this.f88840h.get(str);
    }

    /* renamed from: d */
    public final void mo38606d(View view, C51941eu euVar, int i) {
        C69664n.m101061g(euVar, "formField");
        this.f88837e.add(view);
        this.f88839g.put(Integer.valueOf(this.f88837e.size() - 1), Integer.valueOf(i));
        if ((euVar.f136273a & 8) != 0) {
            if (this.f88840h.containsKey(euVar.f136279g)) {
                C59052c cVar = (C59052c) C33219h.f88841a.mo56226d();
                cVar.mo56379ah(new C59094n(50973));
                cVar.mo56386p("Duplicate FormField id detected.");
            }
            Map map = this.f88840h;
            String str = euVar.f136279g;
            C69664n.m101060f(str, "formField.id");
            map.put(str, view);
        }
    }
}
