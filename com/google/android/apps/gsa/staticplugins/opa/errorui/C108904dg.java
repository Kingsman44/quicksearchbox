package com.google.android.apps.gsa.staticplugins.opa.errorui;

import android.content.Context;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.bm;
import com.google.android.apps.gsa.opaonboarding.C83891ay;
import com.google.android.apps.gsa.opaonboarding.C83907bm;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.searchplate.SearchPlate;
import com.google.android.apps.gsa.shared.logger.C89943l;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.staticplugins.nga.p8092ui.p8095b.C104149a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.assistant.p1614t.C19391a;
import com.google.android.material.p3505b.C44534d;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.errorui.dg */
/* compiled from: PG */
public final class C108904dg extends C83907bm {

    /* renamed from: b */
    public bm f302787b;

    /* renamed from: c */
    public C86124t f302788c;

    /* renamed from: d */
    TextView f302789d;

    /* renamed from: e */
    Button f302790e;

    /* renamed from: f */
    ImageView f302791f;

    /* renamed from: g */
    ImageView f302792g;

    /* renamed from: h */
    public C104149a f302793h;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo77314b() {
        C83891ay.m133615a(this);
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.opa_off_state, (ViewGroup) null);
        this.f302792g = (ImageView) inflate.findViewById(R.id.opa_logo);
        this.f302789d = (TextView) inflate.findViewById(R.id.opa_disabled_error_summary);
        this.f302790e = (Button) inflate.findViewById(R.id.opa_disabled_error_yes);
        this.f302791f = (ImageView) inflate.findViewById(R.id.opa_disabled_error_empty_space);
        if (this.f302788c.mo79746e(C90014bt.f247153bl)) {
            this.f302789d.setText(R.string.opa_off_summary_explicitly_disabled_by_google);
            this.f302790e.setText(R.string.opa_off_yes_button_explicitly_disabled_by_google);
            this.f302790e.setOnClickListener(new C89943l(new C108900dc(this)));
        } else {
            this.f302790e.setOnClickListener(new C89943l(new C108901dd(this)));
        }
        this.f302791f.setClickable(true);
        this.f302791f.setOnClickListener(new C108902de(this));
        Context context = layoutInflater.getContext();
        if (this.f302793h.mo93971b()) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, 2132149689);
            if (C44534d.m78715b()) {
                contextThemeWrapper.getTheme().applyStyle(2132150627, true);
            }
            this.f302792g.setImageTintList(ColorStateList.valueOf(C19391a.m36980a(contextThemeWrapper, R.attr.colorOnBackground)));
            this.f302790e.setTextColor(C19391a.m36980a(context, R.attr.colorPrimary));
        }
        View findViewById = inflate.findViewById(R.id.opa_disabled_error_fake_searchbox_container);
        findViewById.setVisibility(0);
        SearchPlate searchPlate = (SearchPlate) findViewById.findViewById(R.id.search_plate);
        searchPlate.f240737j.mo82657a();
        searchPlate.mo82676i(new C108903df(this));
        searchPlate.mo82680m(1, 0, true, true);
        getActivity().overridePendingTransition(17432576, 17432577);
        return inflate;
    }
}
