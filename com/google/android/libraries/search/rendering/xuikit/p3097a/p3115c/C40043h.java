package com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c;

import android.view.View;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.interfaces.C21242al;
import com.google.android.libraries.elements.interfaces.C21247aq;
import com.google.android.libraries.elements.interfaces.C21319z;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40364q;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3137f.C40365r;
import com.google.common.p4526f.C59052c;
import com.google.common.p4552o.p4566l.C60214n;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57696b;
import com.google.protos.p4895aw.p4903c.p4904a.p4929b.p4930a.C64253b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.libraries.search.rendering.xuikit.a.c.h */
/* compiled from: PG */
final class C40043h implements C21247aq, C21242al {

    /* renamed from: a */
    final /* synthetic */ C40044i f105211a;

    /* renamed from: b */
    private final C40028ai f105212b;

    /* renamed from: c */
    private final C57696b f105213c;

    /* renamed from: d */
    private final C21319z f105214d;

    public C40043h(C40044i iVar, C40028ai aiVar, C57696b bVar, C21319z zVar) {
        this.f105211a = iVar;
        this.f105212b = aiVar;
        this.f105213c = bVar;
        this.f105214d = zVar;
    }

    /* renamed from: c */
    private static final Map m69552c(View view) {
        Map map = (Map) view.getTag(R.id.tag_visibility_tracking_map);
        if (map != null) {
            return map;
        }
        HashMap hashMap = new HashMap();
        view.setTag(R.id.tag_visibility_tracking_map, hashMap);
        return hashMap;
    }

    /* renamed from: a */
    public final void mo25924a(View view, View view2) {
        if (view2 != null) {
            m69552c(view).put(this.f105213c, view2);
            this.f105212b.mo42135b(view2, this.f105213c);
            return;
        }
        C64253b a = C40365r.m70032a(this.f105211a.f105217c.mo42422a(), this.f105214d);
        C59052c cVar = (C59052c) C40044i.f105215a.mo56226d();
        cVar.mo56378ag(C40364q.f106014a, a);
        C59052c cVar2 = (C59052c) cVar.mo56372aa(53302);
        C60214n nVar = this.f105213c.f154142c;
        if (nVar == null) {
            nVar = C60214n.f162914g;
        }
        cVar2.mo56387q("VE with ve type %d has attention tracking enabled, but there is no corresponding Elements view.", nVar.f162918c);
    }

    /* renamed from: b */
    public final void mo25925b(View view) {
        Map c = m69552c(view);
        View view2 = (View) c.get(this.f105213c);
        if (view2 != null) {
            this.f105212b.mo42134a(view2);
            c.remove(this.f105213c);
        }
    }
}
