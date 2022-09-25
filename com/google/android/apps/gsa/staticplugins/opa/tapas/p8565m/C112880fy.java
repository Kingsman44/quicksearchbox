package com.google.android.apps.gsa.staticplugins.opa.tapas.p8565m;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.core.content.C1878d;
import com.google.android.apps.gsa.assistant.shared.p.l;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.search.shared.service.C88489j;
import com.google.android.apps.gsa.search.shared.service.p6935b.C87739bu;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88348yi;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88349yj;
import com.google.android.apps.gsa.search.shared.service.p6935b.C88350yk;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.opa.p8315az.C107698i;
import com.google.android.apps.gsa.staticplugins.opa.tapas.logging.C112694be;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8540g.C112037ao;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113545b;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113560c;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.C113561d;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8589ui.MaxHeightRecyclerView;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113374do;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113375dp;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113408es;
import com.google.android.apps.gsa.staticplugins.opa.tapas.shared.C113415ez;
import com.google.android.googlequicksearchbox.R;
import com.google.common.base.C58833ax;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4552o.p4553a.C59450aa;
import com.google.common.p4552o.p4553a.C59529cz;
import com.google.common.p4552o.p4553a.C59568x;
import com.google.common.p4552o.p4553a.C59569y;
import com.google.protobuf.C62940bt;
import dagger.C68214a;
import p3186j$.util.Optional;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.tapas.m.fy */
/* compiled from: PG */
final class C112880fy {

    /* renamed from: a */
    public static final C59071e f312856a = C59071e.m91332i("com.google.android.apps.gsa.staticplugins.opa.tapas.m.fy");

    /* renamed from: b */
    public final Context f312857b;

    /* renamed from: c */
    public final C107698i f312858c;

    /* renamed from: d */
    public final l f312859d;

    /* renamed from: e */
    public final C113375dp f312860e;

    /* renamed from: f */
    public final C86124t f312861f;

    /* renamed from: g */
    public final C112037ao f312862g;

    /* renamed from: h */
    public final C68214a f312863h;

    /* renamed from: i */
    private final C112794ct f312864i;

    /* renamed from: j */
    private final C112694be f312865j;

    public C112880fy(Context context, l lVar, C112794ct ctVar, C107698i iVar, C112694be beVar, C113375dp dpVar, C86124t tVar, C112037ao aoVar, C68214a aVar) {
        this.f312857b = context;
        this.f312859d = lVar;
        this.f312864i = ctVar;
        this.f312858c = iVar;
        this.f312865j = beVar;
        this.f312860e = dpVar;
        this.f312861f = tVar;
        this.f312862g = aoVar;
        this.f312863h = aVar;
    }

    /* renamed from: d */
    private static int m186799d(C113415ez ezVar) {
        return ((Boolean) ezVar.mo100195H().map(C112872fq.f312841a).orElse(false)).booleanValue() ? R.string.tapas_history_query_explanation : R.string.tapas_query_explanation;
    }

    /* renamed from: a */
    public final void mo99773a(C113415ez ezVar) {
        C107698i iVar = this.f312858c;
        C88489j jVar = new C88489j(C87739bu.TAPAS_SUBMIT_FEEDBACK);
        C62940bt btVar = C88348yi.f238929a;
        C88349yj yjVar = (C88349yj) C88350yk.f238930e.createBuilder();
        String L = ezVar.mo100199L();
        yjVar.copyOnWrite();
        C88350yk ykVar = (C88350yk) yjVar.instance;
        L.getClass();
        ykVar.f238932a |= 1;
        ykVar.f238933b = L;
        int f = ezVar.mo100206f();
        yjVar.copyOnWrite();
        C88350yk ykVar2 = (C88350yk) yjVar.instance;
        ykVar2.f238932a |= 2;
        ykVar2.f238934c = f;
        int e = ezVar.mo100205e();
        yjVar.copyOnWrite();
        C88350yk ykVar3 = (C88350yk) yjVar.instance;
        ykVar3.f238932a |= 4;
        ykVar3.f238935d = e;
        jVar.mo82014b(btVar, (C88350yk) yjVar.build());
        iVar.mo96219b(jVar.mo82013a());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo99774b(C113415ez ezVar, View view) {
        if (this.f312861f.mo79746e(C90063do.f249529fJ)) {
            View inflate = LayoutInflater.from(this.f312857b).inflate(R.layout.suggestion_extra_options, (ViewGroup) null);
            ((TextView) inflate.findViewById(R.id.message)).setText(m186799d(ezVar));
            MaxHeightRecyclerView maxHeightRecyclerView = (MaxHeightRecyclerView) inflate.findViewById(R.id.buttons);
            maxHeightRecyclerView.setAdapter(new C112878fw(this, ezVar));
            maxHeightRecyclerView.setLayoutManager(new LinearLayoutManager(this.f312857b));
            maxHeightRecyclerView.addItemDecoration$ar$ds(new C113561d(C1878d.m5128a(this.f312857b, R.color.tapas_extra_options_separator)));
            maxHeightRecyclerView.f314284a = (int) this.f312857b.getResources().getDimension(R.dimen.extra_options_max_height);
            int i = 0;
            inflate.measure(0, 0);
            int i2 = 1;
            int measuredHeight = C91115n.m148878j(view)[1] - inflate.getMeasuredHeight();
            int identifier = this.f312857b.getResources().getIdentifier("status_bar_height", "dimen", "android");
            boolean z = measuredHeight < (identifier > 0 ? this.f312857b.getResources().getDimensionPixelSize(identifier) : 0);
            if (z) {
                inflate.setPadding(inflate.getPaddingStart(), (int) this.f312857b.getResources().getDimension(R.dimen.extra_options_pointer_height), inflate.getPaddingEnd(), 0);
            }
            inflate.measure(0, 0);
            inflate.layout(0, 0, 0, 0);
            float dimension = this.f312857b.getResources().getDimension(R.dimen.extra_options_pointer_offset);
            float width = (float) (C91115n.m148878j(view)[0] + (view.getWidth() / 2));
            float dimension2 = ((float) Resources.getSystem().getDisplayMetrics().widthPixels) - this.f312857b.getResources().getDimension(R.dimen.extra_options_width);
            if (width > dimension2 + dimension) {
                dimension = width - dimension2;
            }
            inflate.setBackground(new C113560c(this.f312857b, new C113545b(((float) inflate.getMeasuredHeight()) - this.f312857b.getResources().getDimension(R.dimen.extra_options_pointer_height), (float) inflate.findViewById(R.id.message).getBottom(), dimension, true != z ? 2 : 1)));
            C113375dp dpVar = this.f312860e;
            if (true == z) {
                i2 = 2;
            }
            int width2 = (int) (((float) (view.getWidth() / 2)) - dimension);
            if (!z) {
                i = -inflate.getMeasuredHeight();
            }
            dpVar.mo99377jE(inflate, view, (FrameLayout.LayoutParams) null, new C113374do(i2, width2, i, this.f312857b.getResources().getColor(R.color.tapas_extra_options_overlay)));
            return;
        }
        new AlertDialog.Builder(this.f312857b).setMessage(m186799d(ezVar)).setPositiveButton(R.string.tapas_report_this_ok, (DialogInterface.OnClickListener) null).setNegativeButton(R.string.tapas_report_this, new C112871fp(this, ezVar)).show();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final void mo99775c(String str, C113408es esVar, C113415ez ezVar, int i) {
        ((C59052c) ((C59052c) f312856a.mo56224b()).mo56372aa(27821)).mo56386p("Submitting query from Tapas");
        if (!TextUtils.isEmpty(str)) {
            C59529cz a = this.f312864i.mo99739a(i, ezVar, esVar, Optional.empty());
            C59568x xVar = (C59568x) C59569y.f158066g.createBuilder();
            int length = esVar.mo100118a().mo100033p().length();
            xVar.copyOnWrite();
            C59569y yVar = (C59569y) xVar.instance;
            yVar.f158068a |= 1;
            yVar.f158069b = length;
            String num = Integer.toString(ezVar.mo100211k().f125915O);
            xVar.copyOnWrite();
            C59569y yVar2 = (C59569y) xVar.instance;
            num.getClass();
            yVar2.f158068a |= 2;
            yVar2.f158070c = num;
            C59450aa aaVar = (C59450aa) esVar.mo100125g().orElse(C59450aa.f157704d);
            xVar.copyOnWrite();
            C59569y yVar3 = (C59569y) xVar.instance;
            aaVar.getClass();
            yVar3.f158072e = aaVar;
            yVar3.f158068a |= 32;
            this.f312859d.b(str, C58833ax.m90833j(this.f312865j.mo99650a().orElse(null)), C58833ax.m90833j(Optional.m71637of((C59569y) xVar.build()).orElse(null)), C58833ax.m90833j(Optional.m71637of(a).orElse(null)));
        }
    }
}
