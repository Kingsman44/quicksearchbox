package com.google.android.apps.gsa.sidekick.main.optin;

import android.accounts.Account;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.ViewFlipper;
import com.evernote.android.state.BuildConfig;
import com.google.android.apps.gsa.search.core.C84413ad;
import com.google.android.apps.gsa.shared.p7130s.p7131a.C90476a;
import com.google.android.apps.gsa.shared.p7146u.p7147a.C90617a;
import com.google.android.apps.gsa.shared.util.p7158b.C90755l;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.C44565p;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;

/* renamed from: com.google.android.apps.gsa.sidekick.main.optin.s */
/* compiled from: PG */
public final class C91574s extends C44565p {

    /* renamed from: c */
    private static final C59071e f255417c = C59071e.m91332i("com.google.android.apps.gsa.sidekick.main.optin.s");

    /* renamed from: a */
    public final OptInActivity f255418a;

    /* renamed from: d */
    private final C84413ad f255419d;

    /* renamed from: e */
    private final int f255420e;

    /* renamed from: f */
    private final List f255421f;

    /* renamed from: g */
    private ViewFlipper f255422g;

    /* renamed from: h */
    private TextView f255423h;

    /* renamed from: i */
    private TextView f255424i;

    /* renamed from: j */
    private TextView f255425j;

    /* renamed from: k */
    private LinearLayout f255426k;

    /* renamed from: l */
    private TextView f255427l;

    /* renamed from: m */
    private ImageView f255428m;

    /* renamed from: t */
    private LinearLayout f255429t;

    /* renamed from: u */
    private TextView f255430u;

    /* renamed from: v */
    private final View.OnClickListener f255431v = new C91569n(this);

    /* renamed from: w */
    private final View.OnClickListener f255432w = new C91570o(this);

    /* renamed from: x */
    private final View.OnClickListener f255433x = new C91571p(this);

    public C91574s(Context context, C84413ad adVar, int i, List list) {
        super(context);
        this.f255418a = (OptInActivity) context;
        this.f255420e = i;
        this.f255419d = adVar;
        this.f255421f = list;
    }

    /* renamed from: a */
    public final void mo85952a(int i) {
        int i2;
        OptInActivity optInActivity = this.f255418a;
        optInActivity.f255373N = i;
        if (optInActivity.f255392x.mo79668a() != null && ((i2 = optInActivity.f255372M) == 1 || i2 == 4)) {
            C58976aa aaVar = C58975e.f156826a;
            optInActivity.mo85942z(30);
            optInActivity.mo85934B();
        } else {
            optInActivity.f255393z.mo79158u();
            optInActivity.mo85935C(2);
        }
        dismiss();
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.opt_in_uos);
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        Window window = getWindow();
        layoutParams.copyFrom(window.getAttributes());
        layoutParams.width = -1;
        layoutParams.height = -2;
        window.setAttributes(layoutParams);
        View e = mo1197b().mo1177e(R.id.view_flipper);
        if (e != null) {
            this.f255422g = (ViewFlipper) e;
        }
        View e2 = mo1197b().mo1177e(R.id.uos_intro);
        if (e2 != null) {
            this.f255423h = (TextView) e2;
        }
        View e3 = mo1197b().mo1177e(R.id.uos_details);
        if (e3 != null) {
            this.f255424i = (TextView) e3;
        }
        View e4 = mo1197b().mo1177e(R.id.close_uos);
        if (e4 != null) {
            this.f255425j = (TextView) e4;
        }
        View e5 = mo1197b().mo1177e(R.id.current_account_container);
        if (e5 != null) {
            this.f255426k = (LinearLayout) e5;
        }
        View e6 = mo1197b().mo1177e(R.id.uos_button);
        if (e6 != null) {
            this.f255427l = (TextView) e6;
        }
        View e7 = mo1197b().mo1177e(R.id.uos_image);
        if (e7 != null) {
            this.f255428m = (ImageView) e7;
        }
        View e8 = mo1197b().mo1177e(R.id.account_list);
        if (e8 != null) {
            this.f255429t = (LinearLayout) e8;
        }
        View e9 = mo1197b().mo1177e(R.id.account_add_button);
        if (e9 != null) {
            this.f255430u = (TextView) e9;
        }
        int i = this.f255420e;
        if (i == 0) {
            this.f255423h.setText(R.string.uos_sign_in_intro);
            this.f255424i.setText(R.string.uos_sign_in_description);
            this.f255427l.setText(R.string.uos_sign_in_button_text);
            this.f255427l.setOnClickListener(this.f255431v);
            this.f255425j.setOnClickListener(this.f255432w);
            this.f255425j.setVisibility(0);
            this.f255422g.setDisplayedChild(0);
            this.f255428m.setVisibility(0);
            this.f255426k.setVisibility(8);
        } else if (i == 1) {
            for (Account account : this.f255421f) {
                View inflate = LayoutInflater.from(this.f255418a).inflate(R.layout.account_list_view, (ViewGroup) null);
                ((TextView) inflate.findViewById(R.id.display_name)).setText(account.name);
                inflate.setOnClickListener(new C91567l(this, account));
                LinearLayout linearLayout = this.f255429t;
                linearLayout.addView(inflate, linearLayout.getChildCount() - 1);
            }
            this.f255430u.setOnClickListener(this.f255431v);
            this.f255422g.setDisplayedChild(1);
        } else if (i != 2) {
            ((C59052c) ((C59052c) f255417c.mo56226d()).mo56372aa(11727)).mo56387q("Illegal UOS dialog type: %d", this.f255420e);
            int i2 = C90755l.f253831a;
        } else {
            TextView textView = this.f255423h;
            C84413ad adVar = this.f255419d;
            Resources resources = this.f255418a.getResources();
            int i3 = this.f255418a.f255387s;
            C90476a aVar = adVar.f229682c;
            textView.setText(C90617a.m147869b(resources, i3));
            this.f255424i.setText(BuildConfig.FLAVOR);
            this.f255427l.setText(C90617a.m147868a(this.f255418a.getResources(), this.f255418a.f255387s));
            this.f255427l.setOnClickListener(this.f255433x);
            this.f255425j.setOnClickListener(this.f255432w);
            this.f255425j.setVisibility(0);
            this.f255422g.setDisplayedChild(0);
            this.f255428m.setVisibility(0);
            this.f255426k.setVisibility(8);
        }
        C91572q qVar = new C91572q(this);
        FrameLayout frameLayout = (FrameLayout) mo1197b().mo1177e(R.id.design_bottom_sheet);
        BottomSheetBehavior.m78767C(frameLayout).mo47506D(qVar);
        setOnShowListener(new C91568m(frameLayout));
        setOnCancelListener(new C91573r(this));
    }

    public final void onStart() {
        super.onStart();
    }

    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        if (i != 4) {
            return super.onKeyUp(i, keyEvent);
        }
        this.f255418a.onBackPressed();
        dismiss();
        return true;
    }
}
