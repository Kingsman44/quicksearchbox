package com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.elements.C21196h;
import com.google.android.libraries.elements.interfaces.C21255ay;
import com.google.android.libraries.logging.p2185ve.C28423g;
import com.google.android.libraries.logging.p2185ve.C28439i;
import com.google.android.libraries.search.rendering.xuikit.p3097a.C39991aa;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40058w;
import com.google.android.libraries.search.rendering.xuikit.p3097a.p3115c.C40060y;
import com.google.android.libraries.search.rendering.xuikit.p3131d.p3132a.C40305b;
import com.google.apps.tiktok.dataservice.p3638c.C46756m;
import com.google.assistant.p4008y.p4009a.C53617z;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.p4017at.p4060h.p4068b.p4069a.C54192i;
import com.google.p4017at.p4060h.p4068b.p4069a.C54201r;
import com.google.p4283bv.p4380j.p4385b.p4386a.C57784p;
import com.google.protobuf.C62921ba;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62974ct;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.u */
/* compiled from: PG */
public final class C127866u extends C46756m {

    /* renamed from: a */
    private static final C59071e f351922a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.voice.growth.learningcenter.u");

    /* renamed from: b */
    private final C40305b f351923b;

    /* renamed from: c */
    private final C21196h f351924c;

    public C127866u(Context context, C40305b bVar, C28439i iVar, C28423g gVar, C40060y yVar) {
        C58976aa aaVar = C58975e.f156826a;
        this.f351923b = bVar;
        C40058w a = yVar.mo42163a(iVar, gVar);
        bVar.mo32553l();
        C21255ay g = bVar.mo32548g();
        g.mo26714b(a);
        this.f351924c = new C21196h(context, g.mo26713a());
    }

    /* renamed from: a */
    public final View mo18113a(ViewGroup viewGroup) {
        C58976aa aaVar = C58975e.f156826a;
        ViewGroup viewGroup2 = (ViewGroup) LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.assistant_learning_center_card_container, viewGroup, false);
        if (this.f351924c.getParent() != null) {
            ViewGroup viewGroup3 = (ViewGroup) this.f351924c.getParent();
            if (viewGroup3 == viewGroup2) {
                return viewGroup2;
            }
            viewGroup3.removeView(this.f351924c);
        }
        viewGroup2.addView(this.f351924c);
        return viewGroup2;
    }

    /* renamed from: b */
    public final /* synthetic */ void mo18114b(View view, Object obj) {
        Object obj2;
        C53617z zVar = (C53617z) obj;
        if ((zVar.f140730a & 1) != 0) {
            C58976aa aaVar = C58975e.f156826a;
            try {
                C39991aa l = this.f351923b.mo32553l();
                C21196h hVar = this.f351924c;
                C54201r rVar = (C54201r) C62942bv.parseFrom((C62942bv) C54201r.f142243f, zVar.f140731b, C62921ba.m95368a());
                C62940bt r1 = C62942bv.checkIsLite(C54192i.f142222b);
                rVar.mo58887l(r1);
                Object l2 = rVar.f169962ag.mo58854l(r1.f169971d);
                if (l2 == null) {
                    obj2 = r1.f169969b;
                } else {
                    obj2 = r1.mo58889c(l2);
                }
                l.mo42108a(hVar, (C57784p) obj2);
            } catch (C62974ct e) {
                C59104x c = f351922a.mo56225c();
                c.mo56378ag(C58975e.f156826a, "OlcCardViewBinder");
                ((C59052c) ((C59052c) ((C59052c) c).mo56382g(e)).mo56372aa(37634)).mo56386p("Cannot render Elements card.");
            }
        }
    }

    /* renamed from: c */
    public final void mo50773c(View view) {
        C58976aa aaVar = C58975e.f156826a;
        this.f351923b.mo32553l();
        this.f351924c.mo26215b((byte[]) null);
        C40058w wVar = (C40058w) this.f351924c.f59458a.mo26722c();
        if (wVar != null) {
            wVar.mo42158f();
        }
    }
}
