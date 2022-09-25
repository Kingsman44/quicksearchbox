package com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9726b;

import android.view.ViewGroup;
import com.google.android.apps.gsa.nga.engine.warmactions.p6255g.C79570b;
import com.google.android.apps.search.assistant.surfaces.voice.p9721o.p9724c.p9728d.C128543h;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.social.populous.android.C42181t;
import com.google.android.material.textview.MaterialTextView;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59094n;
import p5462h.p5473f.p5475b.C69664n;

/* renamed from: com.google.android.apps.search.assistant.surfaces.voice.o.c.b.av */
/* compiled from: PG */
public final class C128490av implements C46792di {

    /* renamed from: a */
    final /* synthetic */ C128491aw f353366a;

    /* renamed from: b */
    final /* synthetic */ MaterialTextView f353367b;

    /* renamed from: c */
    final /* synthetic */ ViewGroup f353368c;

    public C128490av(C128491aw awVar, MaterialTextView materialTextView, ViewGroup viewGroup) {
        this.f353366a = awVar;
        this.f353367b = materialTextView;
        this.f353368c = viewGroup;
    }

    /* renamed from: a */
    public final void mo18077a(Throwable th) {
        C69664n.m101061g(th, C42181t.f110467a);
        C59052c cVar = (C59052c) ((C59052c) C128491aw.f353369a.mo56225c()).mo56382g(th);
        cVar.mo56379ah(new C59094n(38875));
        cVar.mo56386p("#MWW Failed to update text UI state.");
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
        C79570b bVar;
        C128543h hVar = (C128543h) obj;
        C69664n.m101061g(hVar, "data");
        if (C128495b.m209692a(this.f353366a.f353377i)) {
            bVar = C79570b.m127648a(this.f353366a.f353377i.f353468c);
            if (bVar == null) {
                bVar = C79570b.CONTEXT_TYPE_UNSPECIFIED;
            }
        } else {
            bVar = C79570b.CONTEXT_TYPE_UNSPECIFIED;
        }
        C69664n.m101060f(bVar, "if (lastDescriptor.isVis…UNSPECIFIED\n            }");
        this.f353366a.f353377i = hVar;
        if (C128495b.m209692a(hVar)) {
            C79570b a = C79570b.m127648a(hVar.f353468c);
            if (a == null) {
                a = C79570b.CONTEXT_TYPE_UNSPECIFIED;
            }
            if (bVar != a) {
                MaterialTextView materialTextView = this.f353367b;
                ViewGroup viewGroup = this.f353368c;
                if (viewGroup != null) {
                    materialTextView.setText(hVar.f353469d);
                    viewGroup.setContentDescription(materialTextView.getResources().getString(R.string.assistant_guacamole_closed_popup_pill_content_description, new Object[]{hVar.f353469d}));
                    return;
                }
                throw new IllegalArgumentException("Required value was null.");
            }
        }
    }

    /* renamed from: c */
    public final /* synthetic */ void mo18079c() {
    }
}
