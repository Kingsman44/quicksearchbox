package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60757n;
import com.google.p427am.p432b.p433a.C8659bk;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.p427am.p432b.p433a.C8679i;
import com.google.p427am.p432b.p433a.C8680j;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62947c;
import com.google.protos.p4816ai.p4820d.p4822b.p4823a.C63223c;
import com.google.protos.p4816ai.p4820d.p4822b.p4823a.C63224d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p3186j$.util.Collection;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.m */
/* compiled from: PG */
public final class C132347m {

    /* renamed from: a */
    public static final C59071e f361269a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.m");

    /* renamed from: b */
    public final ChildSelectionFragment f361270b;

    /* renamed from: c */
    public final Bundle f361271c;

    /* renamed from: d */
    public final C46485f f361272d;

    /* renamed from: e */
    public final C46801dp f361273e;

    /* renamed from: f */
    public final C132140a f361274f;

    /* renamed from: g */
    public final C132276e f361275g;

    /* renamed from: h */
    public final C46792di f361276h;

    /* renamed from: i */
    public final boolean f361277i;

    /* renamed from: j */
    public final boolean f361278j;

    /* renamed from: k */
    public final C37215b f361279k;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.m$a */
    /* compiled from: PG */
    final class C132348a implements C46792di {
        public C132348a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132347m.f361269a.mo56225c()).mo56382g(th)).mo56372aa(39508)).mo56386p("Failed to fetch required child information!");
            C132347m mVar = C132347m.this;
            mVar.f361279k.mo19974a(C37176a.f97023di);
            mVar.f361272d.mo50482c(mVar.f361270b).mo50508d(R.id.assistant_child_selection_fragment_to_dialog, C132287ei.m214954a(mVar.f361270b.getString(R.string.assistant_custodio_fatal_error_title), mVar.f361270b.getString(R.string.assistant_custodio_fatal_error_body), mVar.f361270b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar;
            C8660bl blVar2 = (C8660bl) obj;
            View findViewById = C132347m.this.f361270b.requireView().findViewById(R.id.assistant_custodio_child_selection_main_root);
            View findViewById2 = C132347m.this.f361270b.requireView().findViewById(R.id.assistant_custodio_child_selection_empty_root);
            boolean z = C132347m.this.f361271c.getBoolean("should_filter_set_up_children", false);
            if (z) {
                ArrayList arrayList = new ArrayList(blVar2.f29964b);
                Objects.requireNonNull(C132346l.f361268a);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    if (((C8675e) it.next()).f29995d) {
                        it.remove();
                    }
                }
                C8659bk bkVar = (C8659bk) C8660bl.f29961c.createBuilder(blVar2);
                bkVar.copyOnWrite();
                ((C8660bl) bkVar.instance).f29964b = C8660bl.emptyProtobufList();
                bkVar.copyOnWrite();
                C8660bl blVar3 = (C8660bl) bkVar.instance;
                blVar3.mo17210a();
                C62947c.addAll((Iterable) arrayList, (List) blVar3.f29964b);
                blVar = (C8660bl) bkVar.build();
            } else {
                blVar = blVar2;
            }
            int i = 1;
            if (blVar.f29964b.size() > 0) {
                C132276e eVar = C132347m.this.f361275g;
                eVar.f361042b = blVar;
                eVar.mObservable.mo2879a();
                C132347m.this.f361270b.requireView().findViewById(R.id.assistant_custodio_child_selection_main_subtitle_link).setVisibility(true != C132347m.this.f361277i ? 0 : 8);
                findViewById.setVisibility(0);
                findViewById2.setVisibility(8);
            } else {
                TextView textView = (TextView) C132347m.this.f361270b.requireView().findViewById(R.id.assistant_custodio_child_selection_empty_title);
                TextView textView2 = (TextView) C132347m.this.f361270b.requireView().findViewById(R.id.assistant_custodio_child_selection_empty_subtitle);
                TextView textView3 = (TextView) C132347m.this.f361270b.requireView().findViewById(R.id.assistant_custodio_child_selection_empty_subtitle_link);
                View findViewById3 = C132347m.this.f361270b.requireView().findViewById(R.id.assistant_custodio_child_selection_empty_hoh_action_button);
                if (!C132347m.this.f361277i) {
                    textView.setText(R.string.assistant_custodio_child_selection_empty_ulp_disabled_title);
                    textView2.setText(R.string.assistant_custodio_child_selection_empty_ulp_disabled_subtitle);
                    findViewById3.setVisibility(8);
                    textView3.setVisibility(0);
                    textView3.setText(R.string.assistant_custodio_child_selection_ulp_disabled_subtitle_link);
                    textView3.setOnClickListener(new C132344j(this));
                } else {
                    C8680j jVar = blVar2.f29963a;
                    if (jVar == null) {
                        jVar = C8680j.f30003b;
                    }
                    int a = C8679i.m23367a(jVar.f30005a);
                    if (a != 0 && a == 3) {
                        textView.setText(R.string.assistant_custodio_child_selection_empty_hoh_title);
                        textView2.setText(R.string.assistant_custodio_child_selection_empty_hoh_subtitle);
                        textView3.setVisibility(8);
                        findViewById3.setVisibility(0);
                    } else {
                        textView.setText(R.string.assistant_custodio_child_selection_empty_non_hoh_title);
                        textView2.setText(R.string.assistant_custodio_child_selection_empty_non_hoh_subtitle);
                        findViewById3.setVisibility(8);
                        textView3.setVisibility(0);
                        textView3.setText(R.string.assistant_custodio_child_selection_empty_non_hoh_subtitle_link);
                        textView3.setOnClickListener(new C132345k(this));
                    }
                }
                findViewById.setVisibility(8);
                findViewById2.setVisibility(0);
            }
            C132347m.this.f361270b.requireView().findViewById(R.id.assistant_custodio_child_selection_progress_bar).setVisibility(8);
            C37215b bVar = C132347m.this.f361279k;
            C37258g gVar = C37176a.f97034dt;
            C62940bt btVar = C63224d.f170804o;
            C63223c cVar = (C63223c) C63224d.f170803n.createBuilder();
            cVar.copyOnWrite();
            C63224d dVar = (C63224d) cVar.instance;
            dVar.f170806a |= 256;
            dVar.f170815j = z;
            int size = blVar2.f29964b.size();
            cVar.copyOnWrite();
            C63224d dVar2 = (C63224d) cVar.instance;
            dVar2.f170806a |= 64;
            dVar2.f170813h = size;
            long count = Collection.EL.stream(blVar2.f29964b).filter(C132346l.f361268a).count();
            cVar.copyOnWrite();
            C63224d dVar3 = (C63224d) cVar.instance;
            dVar3.f170806a |= 128;
            dVar3.f170814i = C60757n.m92748i(count);
            C8680j jVar2 = blVar2.f29963a;
            if (jVar2 == null) {
                jVar2 = C8680j.f30003b;
            }
            int a2 = C8679i.m23367a(jVar2.f30005a);
            if (a2 != 0) {
                i = a2;
            }
            cVar.copyOnWrite();
            C63224d dVar4 = (C63224d) cVar.instance;
            dVar4.f170812g = C132191bs.m214843a(i) - 1;
            dVar4.f170806a |= 32;
            bVar.mo19974a(gVar.mo40812e(btVar, (C63224d) cVar.build()));
        }

        /* renamed from: c */
        public final void mo18079c() {
            C132347m.this.f361270b.requireView().findViewById(R.id.assistant_custodio_child_selection_main_root).setVisibility(8);
            C132347m.this.f361270b.requireView().findViewById(R.id.assistant_custodio_child_selection_empty_root).setVisibility(8);
            C132347m.this.f361270b.requireView().findViewById(R.id.assistant_custodio_child_selection_progress_bar).setVisibility(0);
        }
    }

    public C132347m(ChildSelectionFragment childSelectionFragment, C46485f fVar, C132140a aVar, C46801dp dpVar, C132276e eVar, boolean z, boolean z2, C37215b bVar) {
        this.f361270b = childSelectionFragment;
        this.f361272d = fVar;
        this.f361274f = aVar;
        this.f361273e = dpVar;
        this.f361275g = eVar;
        Bundle arguments = childSelectionFragment.getArguments();
        this.f361271c = arguments == null ? new Bundle() : arguments;
        this.f361276h = new C132348a();
        this.f361277i = z2;
        this.f361278j = z;
        this.f361279k = bVar;
    }
}
