package com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.personalresults.p9417a;

import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124524e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9384a.p9386b.C124525f;
import com.google.android.apps.search.assistant.surfaces.bisto.p9403d.C124669ch;
import com.google.android.apps.search.assistant.surfaces.bisto.p9404e.p9405a.C124729a;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.oobe.C124849bt;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.C125009e;
import com.google.android.apps.search.assistant.surfaces.bisto.p9412ui.template.ScreenStateView;
import com.google.android.googlequicksearchbox.R;
import com.google.android.p10712d.C142324bc;
import com.google.android.p10712d.C142335bn;
import com.google.android.p10712d.C142336bo;
import com.google.android.p10712d.C142340bs;
import com.google.android.p10712d.C142355cg;
import com.google.android.setupcompat.template.C45275b;
import com.google.android.setupcompat.template.C45276c;
import com.google.android.setupcompat.template.C45277d;
import com.google.android.setupdesign.GlifLayout;
import com.google.apps.tiktok.concurrent.futuresmixin.C46439e;
import com.google.apps.tiktok.concurrent.futuresmixin.C46440f;
import com.google.apps.tiktok.dataservice.C46792di;
import com.google.apps.tiktok.dataservice.C46801dp;
import com.google.apps.tiktok.tracing.C47591co;
import com.google.apps.tiktok.tracing.C47770dh;
import com.google.common.p4522b.C58597ky;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.C59104x;
import com.google.common.p4526f.p4527a.C58975e;
import com.google.protobuf.contrib.android.ProtoParsers;
import p3186j$.util.Objects;

/* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.personalresults.a.i */
/* compiled from: PG */
public final class C124993i {

    /* renamed from: a */
    public static final C59071e f344883a = C59071e.m91332i("com.google.android.apps.search.assistant.surfaces.bisto.ui.personalresults.a.i");

    /* renamed from: b */
    public final String f344884b;

    /* renamed from: c */
    public final C124986b f344885c;

    /* renamed from: d */
    public final C124729a f344886d;

    /* renamed from: e */
    public final C46801dp f344887e;

    /* renamed from: f */
    public final C124669ch f344888f;

    /* renamed from: g */
    public final C46439e f344889g;

    /* renamed from: h */
    public final C47770dh f344890h;

    /* renamed from: i */
    public final C124995b f344891i = new C124995b();

    /* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.personalresults.a.i$a */
    /* compiled from: PG */
    final class C124994a implements C46792di {
        public C124994a() {
        }

        /* renamed from: a */
        public final void mo18077a(Throwable th) {
            C59104x d = C124993i.f344883a.mo56226d();
            d.mo56378ag(C58975e.f156826a, "PREFragment");
            ((C59052c) ((C59052c) ((C59052c) d).mo56382g(th)).mo56372aa(36409)).mo56386p("Error retrieving BDI");
            GlifLayout glifLayout = (GlifLayout) C124993i.this.mo106767a().mo106775a(C125009e.ERROR, R.layout.assistant_oobe_default_error_content);
            glifLayout.mo49196r(R.string.assistant_error_header_default_title);
            glifLayout.mo49194p(R.string.assistant_error_header_default_message);
        }

        /* renamed from: b */
        public final /* bridge */ /* synthetic */ void mo18078b(Object obj) {
            C142324bc bcVar = (C142324bc) obj;
            GlifLayout glifLayout = (GlifLayout) C124993i.this.mo106767a().mo106775a(C125009e.MAIN, R.layout.assistant_pr_enrollment_main_content);
            C124993i iVar = C124993i.this;
            C142340bs bsVar = bcVar.f386119e;
            if (bsVar == null) {
                bsVar = C142340bs.f386174C;
            }
            C142355cg cgVar = bsVar.f386196s;
            if (cgVar == null) {
                cgVar = C142355cg.f386263b;
            }
            C124524e a = C124525f.m203985a(cgVar);
            a.mo106449b(iVar.f344885c.requireContext(), R.string.assistant_personal_results_enrollment_default_header);
            Objects.requireNonNull(glifLayout);
            a.mo106448a(new C124988d(glifLayout));
            TextView textView = (TextView) glifLayout.findViewById(R.id.assistant_pr_description);
            C124986b bVar = iVar.f344885c;
            Object[] objArr = new Object[1];
            C142355cg cgVar2 = bcVar.f386116b;
            if (cgVar2 == null) {
                cgVar2 = C142355cg.f386263b;
            }
            objArr[0] = C124525f.m203989e(cgVar2);
            textView.setText(bVar.getString(R.string.assistant_personal_results_description, objArr));
            Spanned fromHtml = Html.fromHtml(iVar.f344885c.getString(R.string.assistant_personal_results_disclaimer, iVar.f344885c.getString(R.string.assistant_personal_results_learn_more_address)));
            TextView textView2 = (TextView) glifLayout.findViewById(R.id.assistant_pr_disclaimer);
            textView2.setMovementMethod(LinkMovementMethod.getInstance());
            textView2.setText(fromHtml);
            C45275b bVar2 = (C45275b) glifLayout.mo49129j(C45275b.class);
            bVar2.mo49175f(iVar.mo106768b(R.string.assistant_turn_on, new C47591co(iVar.f344890h, "PR Turn On button click", new C124989e(iVar)), 6));
            bVar2.mo49176g(iVar.mo106768b(R.string.assistant_no_thanks, new C47591co(iVar.f344890h, "PR No thanks button click", new C124990f(iVar)), 2), false);
            LinearLayout linearLayout = (LinearLayout) iVar.f344885c.requireView().findViewById(R.id.assistant_pr_body);
            LayoutInflater from = LayoutInflater.from(iVar.f344885c.getContext());
            C142340bs bsVar2 = bcVar.f386119e;
            if (bsVar2 == null) {
                bsVar2 = C142340bs.f386174C;
            }
            for (C142336bo boVar : C58597ky.m90216g(bsVar2.f386201x)) {
                View inflate = from.inflate(R.layout.assistant_pr_page_list_item, linearLayout, false);
                ImageView imageView = (ImageView) inflate.findViewById(R.id.assistant_icon);
                int a2 = C142335bn.m231062a(boVar.f386162b);
                if (a2 == 0) {
                    a2 = 1;
                }
                C142355cg cgVar3 = boVar.f386163c;
                if (cgVar3 == null) {
                    cgVar3 = C142355cg.f386263b;
                }
                C124524e a3 = C124525f.m203985a(cgVar3);
                Objects.requireNonNull(imageView);
                a3.mo106448a(new C124987c(imageView));
                int i = a2 - 1;
                if (i == 1) {
                    imageView.setImageResource(R.drawable.product_logo_calendar_2020q4_color_36);
                } else if (i == 2) {
                    imageView.setImageResource(R.drawable.product_logo_contacts_color_36);
                } else if (i == 3) {
                    imageView.setImageResource(R.drawable.product_logo_messages_color_36);
                } else if (i != 4) {
                    C59104x d = C124993i.f344883a.mo56226d();
                    d.mo56378ag(C58975e.f156826a, "PREFragment");
                    ((C59052c) ((C59052c) d).mo56372aa(36413)).mo56386p("Unknown icon identifier encountered");
                    imageView.setVisibility(8);
                } else {
                    imageView.setImageResource(R.drawable.product_logo_gfit_color_36);
                }
                C142355cg cgVar4 = boVar.f386164d;
                if (cgVar4 == null) {
                    cgVar4 = C142355cg.f386263b;
                }
                C124525f.m203985a(cgVar4).mo106448a(new C124991g(inflate));
                C142355cg cgVar5 = boVar.f386165e;
                if (cgVar5 == null) {
                    cgVar5 = C142355cg.f386263b;
                }
                C124525f.m203985a(cgVar5).mo106448a(new C124992h(inflate));
                linearLayout.addView(inflate, 1);
            }
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18079c() {
        }
    }

    /* renamed from: com.google.android.apps.search.assistant.surfaces.bisto.ui.personalresults.a.i$b */
    /* compiled from: PG */
    final class C124995b implements C46440f {
        public C124995b() {
        }

        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo18066a(Object obj, Throwable th) {
            Void voidR = (Void) obj;
            C59104x c = C124993i.f344883a.mo56225c();
            c.mo56378ag(C58975e.f156826a, "PREFragment");
            ((C59052c) ((C59052c) ((C59052c) c).mo56382g(th)).mo56372aa(36410)).mo56389s("PR status not updated for deviceId: %s", C124993i.this.f344884b);
            C124993i.this.f344885c.requireActivity().setResult(0);
            C124993i.this.f344885c.requireActivity().finish();
        }

        /* renamed from: c */
        public final /* synthetic */ void mo18067c(Object obj, Object obj2) {
            Void voidR = (Void) obj;
            ProtoParsers.ParcelableProto parcelableProto = (ProtoParsers.ParcelableProto) obj2;
            C58976aa aaVar = C58975e.f156826a;
            C124993i.this.f344885c.requireActivity().setResult(-1);
            C124993i.this.f344885c.requireActivity().finish();
        }

        /* renamed from: i */
        public final /* synthetic */ void mo18068i(Object obj) {
        }
    }

    public C124993i(String str, C124986b bVar, C124729a aVar, C46801dp dpVar, C124669ch chVar, C46439e eVar, C47770dh dhVar) {
        this.f344884b = str;
        this.f344885c = bVar;
        this.f344886d = aVar;
        this.f344887e = dpVar;
        this.f344888f = chVar;
        this.f344889g = eVar;
        this.f344890h = dhVar;
    }

    /* renamed from: a */
    public final ScreenStateView mo106767a() {
        return (ScreenStateView) this.f344885c.requireView().findViewById(R.id.assistant_oobe_template_screen_root);
    }

    /* renamed from: b */
    public final C45277d mo106768b(int i, View.OnClickListener onClickListener, int i2) {
        if (i2 == 2) {
            C45276c cVar = new C45276c(this.f344885c.requireContext());
            cVar.mo49181b(i);
            cVar.f118281b = onClickListener;
            cVar.f118282c = 2;
            return cVar.mo49180a();
        }
        C45276c c = C124849bt.m204632c(this.f344885c.requireContext());
        c.mo49181b(i);
        c.f118281b = onClickListener;
        c.f118282c = i2;
        return c.mo49180a();
    }
}
