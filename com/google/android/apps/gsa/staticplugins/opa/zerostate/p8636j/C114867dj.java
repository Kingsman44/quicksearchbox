package com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.apps.gsa.shared.util.p7162d.C90962a;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.snackbar.C44890u;
import com.google.android.material.snackbar.Snackbar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.zerostate.j.dj */
/* compiled from: PG */
public class C114867dj {

    /* renamed from: f */
    private static final int f318702f = ((int) TimeUnit.SECONDS.toMillis(5));

    /* renamed from: a */
    public String f318703a;

    /* renamed from: b */
    public int f318704b = f318702f;

    /* renamed from: c */
    public String f318705c;

    /* renamed from: d */
    public View.OnClickListener f318706d;

    /* renamed from: e */
    protected Snackbar f318707e;

    /* renamed from: g */
    private final Context f318708g;

    /* renamed from: h */
    private final Activity f318709h;

    public C114867dj(Context context, Activity activity) {
        this.f318708g = context;
        this.f318709h = activity;
        this.f318703a = activity.getResources().getString(R.string.zero_state_generic_error_toast_message);
    }

    /* renamed from: a */
    public final Button mo101663a() {
        Snackbar snackbar = this.f318707e;
        if (snackbar == null) {
            return null;
        }
        return (Button) snackbar.f117089j.findViewById(R.id.snackbar_action);
    }

    /* renamed from: b */
    public final void mo101664b() {
        View.OnClickListener onClickListener;
        View findViewById = this.f318709h.findViewById(R.id.zero_state_speed_dial_container);
        if (findViewById == null) {
            findViewById = this.f318709h.findViewById(R.id.zero_state_main_view);
        }
        View view = null;
        Snackbar q = Snackbar.m79661q((Context) null, findViewById, this.f318703a, this.f318704b);
        this.f318707e = q;
        C44890u uVar = q.f117089j;
        View childAt = uVar.getChildAt(0);
        if (childAt != null) {
            boolean a = C90962a.m148577a(this.f318708g);
            if (a) {
                childAt.setForceDarkAllowed(false);
            }
            uVar.setBackground(this.f318709h.getResources().getDrawable(R.drawable.zero_state_snackbar_container_background, (Resources.Theme) null));
            uVar.setPadding(this.f318709h.getResources().getDimensionPixelSize(R.dimen.zero_state_snackbar_container_padding), this.f318709h.getResources().getDimensionPixelSize(R.dimen.zero_state_snackbar_container_padding), this.f318709h.getResources().getDimensionPixelSize(R.dimen.zero_state_snackbar_container_padding), this.f318709h.getResources().getDimensionPixelSize(R.dimen.zero_state_snackbar_container_padding));
            if (a) {
                childAt.setBackground(this.f318709h.getResources().getDrawable(R.drawable.zero_state_snackbar_background_dark_theme, (Resources.Theme) null));
            } else {
                childAt.setBackground(this.f318709h.getResources().getDrawable(R.drawable.zero_state_snackbar_background_light_theme, (Resources.Theme) null));
            }
            Snackbar snackbar = this.f318707e;
            if (snackbar != null) {
                view = snackbar.f117089j.findViewById(R.id.snackbar_text);
            }
            TextView textView = (TextView) view;
            if (textView != null) {
                textView.setTextSize(0, this.f318709h.getResources().getDimension(R.dimen.zero_state_snackbar_text_size));
                textView.setPadding(this.f318709h.getResources().getDimensionPixelSize(R.dimen.zero_state_snackbar_text_padding_left), this.f318709h.getResources().getDimensionPixelSize(R.dimen.zero_state_snackbar_padding_top), 0, this.f318709h.getResources().getDimensionPixelSize(R.dimen.zero_state_snackbar_padding_bottom));
                q.mo48351r().f117107a.setTextColor(this.f318709h.getResources().getColor(a ? R.color.zero_state_snackbar_text_color_dark_theme : R.color.zero_state_snackbar_text_color_light_theme));
            }
            Button a2 = mo101663a();
            if (a2 != null) {
                a2.setTextSize(0, this.f318709h.getResources().getDimension(R.dimen.zero_state_snackbar_action_button_text_size));
                a2.setTypeface(Typeface.create("google-sans-medium", 0));
                a2.setAllCaps(false);
                a2.setPadding(this.f318709h.getResources().getDimensionPixelSize(R.dimen.zero_state_snackbar_action_button_padding_left), this.f318709h.getResources().getDimensionPixelSize(R.dimen.zero_state_snackbar_padding_top), this.f318709h.getResources().getDimensionPixelSize(R.dimen.zero_state_snackbar_action_button_padding_right), this.f318709h.getResources().getDimensionPixelSize(R.dimen.zero_state_snackbar_padding_bottom));
                q.mo48351r().f117108b.setTextColor(this.f318709h.getResources().getColor(a ? R.color.zero_state_snackbar_action_button_color_dark_theme : R.color.zero_state_snackbar_action_button_color_light_theme));
            }
        }
        String str = this.f318705c;
        if (!(str == null || (onClickListener = this.f318706d) == null)) {
            this.f318707e.mo48352s(str, onClickListener);
        }
        this.f318707e.mo48348m(new C114866di());
    }

    /* renamed from: c */
    public final void mo101665c() {
        Snackbar snackbar = this.f318707e;
        if (snackbar != null) {
            snackbar.mo48343h();
        }
    }

    /* renamed from: d */
    public final void mo101666d() {
        this.f318703a = this.f318709h.getResources().getString(R.string.zero_state_generic_error_toast_message);
    }
}
