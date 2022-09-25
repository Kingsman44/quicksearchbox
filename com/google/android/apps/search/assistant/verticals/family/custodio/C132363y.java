package com.google.android.apps.search.assistant.verticals.family.custodio;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bumptech.glide.C6007z;
import com.bumptech.glide.load.p299c.p300a.C5825ad;
import com.google.android.apps.search.assistant.verticals.family.custodio.p10055b.p10056a.C132140a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.search.p2871b.C37215b;
import com.google.android.libraries.search.p2871b.p2872a.p2874b.C37176a;
import com.google.android.libraries.search.p2871b.p2895i.C37258g;
import com.google.android.material.snackbar.Snackbar;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.contrib.p3629c.C46485f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.media.C47449e;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4575r.C60757n;
import com.google.p427am.p432b.p433a.C8628ag;
import com.google.p427am.p432b.p433a.C8647az;
import com.google.p427am.p432b.p433a.C8649ba;
import com.google.p427am.p432b.p433a.C8660bl;
import com.google.p427am.p432b.p433a.C8675e;
import com.google.protobuf.C62940bt;
import com.google.protos.p4816ai.p4820d.p4822b.p4823a.C63223c;
import com.google.protos.p4816ai.p4820d.p4822b.p4823a.C63224d;
import java.util.ArrayList;
import p3186j$.util.Collection;

/* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.y */
/* compiled from: PG */
public final class C132363y {

    /* renamed from: a */
    public static final C59071e f361307a = C59071e.m91332i("com.google.android.apps.search.assistant.verticals.family.custodio.y");

    /* renamed from: b */
    public final CustodioDeviceListFragment f361308b;

    /* renamed from: c */
    public final Bundle f361309c;

    /* renamed from: d */
    public final C132140a f361310d;

    /* renamed from: e */
    public final C46801dp f361311e;

    /* renamed from: f */
    public final C47449e f361312f;

    /* renamed from: g */
    public final C46485f f361313g;

    /* renamed from: h */
    public final C47770dh f361314h;

    /* renamed from: i */
    public final C132365a f361315i;

    /* renamed from: j */
    public final C37215b f361316j;

    /* renamed from: k */
    public final C46439e f361317k;

    /* renamed from: l */
    public final C46440f f361318l;

    /* renamed from: com.google.android.apps.search.assistant.verticals.family.custodio.y$a */
    /* compiled from: PG */
    final class C132365a implements C46792di {
        public C132365a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            ((C59052c) ((C59052c) ((C59052c) C132363y.f361307a.mo56225c()).mo56382g(th)).mo56372aa(39519)).mo56386p("Failed to fetch required information!");
            C132363y.this.mo110668a();
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C8660bl blVar = (C8660bl) obj;
            if (blVar.f29964b.size() == 1) {
                C8675e eVar = (C8675e) blVar.f29964b.get(0);
                TextView textView = (TextView) C132363y.this.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_fragment_subtitle);
                CustodioDeviceListFragment custodioDeviceListFragment = C132363y.this.f361308b;
                Object[] objArr = new Object[1];
                C8628ag agVar = eVar.f29994c;
                if (agVar == null) {
                    agVar = C8628ag.f29890g;
                }
                objArr[0] = agVar.f29893b;
                textView.setText(custodioDeviceListFragment.getString(R.string.assistant_custodio_device_list_fragment_subtitle, objArr));
                if (eVar.f29997f.size() <= 0) {
                    TextView textView2 = (TextView) C132363y.this.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_fragment_subtitle_empty);
                    CustodioDeviceListFragment custodioDeviceListFragment2 = C132363y.this.f361308b;
                    Object[] objArr2 = new Object[1];
                    C8628ag agVar2 = eVar.f29994c;
                    if (agVar2 == null) {
                        agVar2 = C8628ag.f29890g;
                    }
                    objArr2[0] = agVar2.f29893b;
                    textView2.setText(custodioDeviceListFragment2.getString(R.string.assistant_custodio_device_list_fragment_subtitle_empty, objArr2));
                    ((Button) C132363y.this.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_gha_button)).setOnClickListener(new C47591co(C132363y.this.f361314h, "assistant_custodio_device_list_gha_button clicked", new C132112ac(this)));
                    C132363y yVar = C132363y.this;
                    yVar.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_fragment_progress_bar).setVisibility(8);
                    yVar.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_fragment_scroll_view).setVisibility(0);
                    yVar.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_fragment_main_root).setVisibility(8);
                    yVar.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_fragment_empty_root).setVisibility(0);
                } else {
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (C8649ba baVar : eVar.f29997f) {
                        int a = C8647az.m23361a(baVar.f29940g);
                        if (a != 0 && a == 3) {
                            arrayList.add(baVar);
                        } else {
                            arrayList2.add(baVar);
                        }
                    }
                    View findViewById = C132363y.this.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_unassigned_devices_section_container);
                    LinearLayout linearLayout = (LinearLayout) C132363y.this.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_unassigned_devices_section).findViewById(R.id.assistant_custodio_device_list_unassigned_devices_section_list);
                    linearLayout.removeAllViews();
                    int size = arrayList.size();
                    for (int i = 0; i < size; i++) {
                        C8649ba baVar2 = (C8649ba) arrayList.get(i);
                        View inflate = LayoutInflater.from(C132363y.this.f361308b.requireContext()).inflate(R.layout.assistant_custodio_device_list_kebab_button_line_item, linearLayout, false);
                        C47449e eVar2 = C132363y.this.f361312f;
                        ((C6007z) ((C6007z) eVar2.mo51286a().mo11873k(baVar2.f29936c).mo11952E(R.drawable.quantum_gm_ic_speaker_gm_blue_24)).mo11970W(new C132366z(C132363y.this.f361308b.getResources().getColor(R.color.google_blue600)), new C5825ad())).mo12454r((ImageView) inflate.findViewById(R.id.assistant_custodio_device_list_kebab_button_line_item_icon));
                        ((TextView) inflate.findViewById(R.id.assistant_custodio_device_list_kebab_button_line_item_text)).setText(baVar2.f29937d);
                        Button button = (Button) inflate.findViewById(R.id.assistant_custodio_device_list_kebab_button_line_item_button);
                        button.setOnClickListener(new C47591co(C132363y.this.f361314h, "assistant_custodio_device_list_kebab_button_line_item_button clicked", new C132113ad(this, button, eVar, baVar2)));
                        linearLayout.addView(inflate);
                    }
                    if (arrayList.isEmpty()) {
                        findViewById.setVisibility(8);
                    } else {
                        findViewById.setVisibility(0);
                    }
                    View findViewById2 = C132363y.this.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_linking_section_container);
                    LinearLayout linearLayout2 = (LinearLayout) C132363y.this.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_linking_section).findViewById(R.id.assistant_custodio_device_list_linking_section_list);
                    linearLayout2.removeAllViews();
                    if (arrayList2.isEmpty()) {
                        findViewById2.setVisibility(8);
                    } else {
                        View inflate2 = LayoutInflater.from(C132363y.this.f361308b.requireContext()).inflate(R.layout.assistant_custodio_device_list_hairline_button_line_item, linearLayout, false);
                        C47449e eVar3 = C132363y.this.f361312f;
                        ((C6007z) ((C6007z) eVar3.mo51286a().mo11873k(((C8649ba) arrayList2.get(0)).f29936c).mo11952E(R.drawable.quantum_gm_ic_speaker_gm_blue_24)).mo11970W(new C132366z(C132363y.this.f361308b.getResources().getColor(R.color.google_blue600)), new C5825ad())).mo12454r((ImageView) inflate2.findViewById(R.id.assistant_custodio_device_list_hairline_button_line_item_icon));
                        ((TextView) inflate2.findViewById(R.id.assistant_custodio_device_list_hairline_button_line_item_text)).setText(C132363y.this.f361308b.getResources().getQuantityString(R.plurals.assistant_custodio_device_list_fragment_legacy_linking_item_text, arrayList2.size(), new Object[]{Integer.valueOf(arrayList2.size())}));
                        inflate2.findViewById(R.id.assistant_custodio_device_list_hairline_button_line_item_button).setOnClickListener(new C47591co(C132363y.this.f361314h, "assistant_custodio_device_list_hairline_button_line_item_button clicked", new C132114ae(this)));
                        linearLayout2.addView(inflate2);
                        findViewById2.setVisibility(0);
                    }
                    C132363y yVar2 = C132363y.this;
                    yVar2.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_fragment_progress_bar).setVisibility(8);
                    yVar2.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_fragment_scroll_view).setVisibility(0);
                    yVar2.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_fragment_main_root).setVisibility(0);
                    yVar2.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_fragment_empty_root).setVisibility(8);
                }
                C37215b bVar = C132363y.this.f361316j;
                C37258g gVar = C37176a.f97034dt;
                C62940bt btVar = C63224d.f170804o;
                C63223c cVar = (C63223c) C63224d.f170803n.createBuilder();
                long count = Collection.EL.stream(eVar.f29997f).filter(C132115af.f360634a).count();
                cVar.copyOnWrite();
                C63224d dVar = (C63224d) cVar.instance;
                dVar.f170806a |= 1024;
                dVar.f170818m = C60757n.m92748i(count);
                bVar.mo19974a(gVar.mo40812e(btVar, (C63224d) cVar.build()));
                return;
            }
            ((C59052c) ((C59052c) C132363y.f361307a.mo56225c()).mo56372aa(39520)).mo56387q("One child's data was expected, found %d", blVar.f29964b.size());
            C132363y.this.mo110668a();
        }

        /* renamed from: c */
        public final void mo18079c() {
            C132363y.this.mo110669b();
        }
    }

    public C132363y(final CustodioDeviceListFragment custodioDeviceListFragment, C132140a aVar, C46801dp dpVar, C47449e eVar, C46485f fVar, C47770dh dhVar, final C37215b bVar, C46439e eVar2) {
        this.f361308b = custodioDeviceListFragment;
        Bundle arguments = custodioDeviceListFragment.getArguments();
        this.f361309c = arguments == null ? new Bundle() : arguments;
        this.f361310d = aVar;
        this.f361311e = dpVar;
        this.f361312f = eVar;
        this.f361313g = fVar;
        this.f361314h = dhVar;
        this.f361316j = bVar;
        this.f361317k = eVar2;
        this.f361315i = new C132365a();
        this.f361318l = new C46440f() {
            /* renamed from: a */
            public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
                Bundle bundle = (Bundle) obj;
                ((C59052c) ((C59052c) ((C59052c) C132363y.f361307a.mo56225c()).mo56382g(th)).mo56372aa(39515)).mo56386p("Device unlinking operation failed!");
                C132363y.this.mo110668a();
            }

            /* renamed from: c */
            public final /* bridge */ /* synthetic */ void mo18067c(Object obj, Object obj2) {
                Bundle bundle = (Bundle) obj;
                Void voidR = (Void) obj2;
                String string = bundle.getString("UPDATE_CALLBACK_CHILD_NAME_KEY");
                String string2 = bundle.getString("UPDATE_CALLBACK_DEVICE_OR_HOME_NAME_KEY");
                if (string == null || string2 == null) {
                    ((C59052c) ((C59052c) C132363y.f361307a.mo56225c()).mo56372aa(39516)).mo56386p("Required information missing from bundle passed to updateCallback's onSuccess!");
                    C132363y.this.mo110668a();
                    return;
                }
                Snackbar.m79661q((Context) null, custodioDeviceListFragment.requireView(), custodioDeviceListFragment.getString(R.string.assistant_custodio_device_list_unlink_operation_success, string, string2), -1).mo48343h();
                bVar.mo19974a(C37176a.f97212hL);
            }

            /* renamed from: i */
            public final /* synthetic */ void mo18068i(Object obj) {
                Bundle bundle = (Bundle) obj;
                C132363y.this.mo110669b();
            }
        };
    }

    /* renamed from: a */
    public final void mo110668a() {
        this.f361316j.mo19974a(C37176a.f97023di);
        this.f361313g.mo50482c(this.f361308b).mo50508d(R.id.assistant_custodio_device_list_fragment_to_dialog, C132287ei.m214954a(this.f361308b.getString(R.string.assistant_custodio_fatal_error_title), this.f361308b.getString(R.string.assistant_custodio_fatal_error_body), this.f361308b.getString(R.string.assistant_custodio_fatal_error_button_text), "action_finish_activity", (String) null, (String) null));
    }

    /* renamed from: b */
    public final void mo110669b() {
        this.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_fragment_progress_bar).setVisibility(0);
        this.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_fragment_scroll_view).setVisibility(8);
        this.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_fragment_main_root).setVisibility(8);
        this.f361308b.requireView().findViewById(R.id.assistant_custodio_device_list_fragment_empty_root).setVisibility(8);
    }
}
