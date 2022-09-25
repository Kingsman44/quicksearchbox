package com.google.android.material.timepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.p3512i.C44693c;
import com.google.android.material.p3515l.C44779j;
import java.util.LinkedHashSet;
import java.util.Set;

/* renamed from: com.google.android.material.timepicker.m */
/* compiled from: PG */
public final class C44989m extends C0260w implements C44975ai {

    /* renamed from: a */
    public final Set f117554a = new LinkedHashSet();

    /* renamed from: b */
    public final Set f117555b = new LinkedHashSet();

    /* renamed from: c */
    public C44970ad f117556c;

    /* renamed from: d */
    public MaterialButton f117557d;

    /* renamed from: e */
    public int f117558e = 0;

    /* renamed from: f */
    public TimeModel f117559f;

    /* renamed from: g */
    private final Set f117560g = new LinkedHashSet();

    /* renamed from: h */
    private final Set f117561h = new LinkedHashSet();

    /* renamed from: i */
    private TimePickerView f117562i;

    /* renamed from: j */
    private ViewStub f117563j;

    /* renamed from: k */
    private C44997u f117564k;

    /* renamed from: l */
    private C44998v f117565l;

    /* renamed from: m */
    private int f117566m;

    /* renamed from: n */
    private int f117567n;

    /* renamed from: o */
    private int f117568o = 0;

    /* renamed from: p */
    private CharSequence f117569p;

    /* renamed from: q */
    private int f117570q = 0;

    /* renamed from: r */
    private CharSequence f117571r;

    /* renamed from: s */
    private int f117572s = 0;

    /* renamed from: t */
    private CharSequence f117573t;

    /* renamed from: u */
    private Button f117574u;

    /* renamed from: v */
    private int f117575v = 0;

    /* renamed from: b */
    public static C44989m m79968b(C44988l lVar) {
        C44989m mVar = new C44989m();
        Bundle bundle = new Bundle();
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", lVar.f117552a);
        Integer num = lVar.f117553b;
        if (num != null) {
            bundle.putInt("TIME_PICKER_INPUT_MODE", num.intValue());
        }
        bundle.putInt("TIME_PICKER_TITLE_RES", 0);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
        mVar.setArguments(bundle);
        return mVar;
    }

    /* renamed from: e */
    private final void m79969e() {
        Button button = this.f117574u;
        if (button != null) {
            button.setVisibility(true != isCancelable() ? 8 : 0);
        }
    }

    /* renamed from: a */
    public final int mo48654a() {
        return this.f117559f.f117514d % 24;
    }

    /* renamed from: c */
    public final void mo48655c(MaterialButton materialButton) {
        C44997u uVar;
        Pair pair;
        if (materialButton != null && this.f117562i != null && this.f117563j != null) {
            C44998v vVar = this.f117565l;
            if (vVar != null) {
                vVar.mo48640b();
            }
            int i = this.f117558e;
            TimePickerView timePickerView = this.f117562i;
            ViewStub viewStub = this.f117563j;
            if (i == 0) {
                C44997u uVar2 = this.f117564k;
                C44997u uVar3 = uVar2;
                if (uVar2 == null) {
                    uVar3 = new C44997u(timePickerView, this.f117559f);
                }
                this.f117564k = uVar3;
                uVar = uVar3;
            } else {
                if (this.f117556c == null) {
                    this.f117556c = new C44970ad((LinearLayout) viewStub.inflate(), this.f117559f);
                }
                C44970ad adVar = this.f117556c;
                adVar.f117532b.setChecked(false);
                adVar.f117533c.setChecked(false);
                uVar = this.f117556c;
            }
            this.f117565l = uVar;
            uVar.mo48642f();
            this.f117565l.mo48641c();
            int i2 = this.f117558e;
            if (i2 == 0) {
                pair = new Pair(Integer.valueOf(this.f117566m), Integer.valueOf(R.string.material_timepicker_text_input_mode_description));
            } else if (i2 == 1) {
                pair = new Pair(Integer.valueOf(this.f117567n), Integer.valueOf(R.string.material_timepicker_clock_mode_description));
            } else {
                throw new IllegalArgumentException("no icon for mode: " + i2);
            }
            materialButton.mo47553j(((Integer) pair.first).intValue());
            materialButton.setContentDescription(getResources().getString(((Integer) pair.second).intValue()));
            materialButton.sendAccessibilityEvent(4);
        }
    }

    /* renamed from: d */
    public final void mo48656d(View.OnClickListener onClickListener) {
        this.f117554a.add(onClickListener);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        for (DialogInterface.OnCancelListener onCancel : this.f117560g) {
            onCancel.onCancel(dialogInterface);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        if (bundle != null) {
            TimeModel timeModel = (TimeModel) bundle.getParcelable("TIME_PICKER_TIME_MODEL");
            this.f117559f = timeModel;
            if (timeModel == null) {
                this.f117559f = new TimeModel(0);
            }
            int i = 1;
            if (this.f117559f.f117513c != 1) {
                i = 0;
            }
            this.f117558e = bundle.getInt("TIME_PICKER_INPUT_MODE", i);
            this.f117568o = bundle.getInt("TIME_PICKER_TITLE_RES", 0);
            this.f117569p = bundle.getCharSequence("TIME_PICKER_TITLE_TEXT");
            this.f117570q = bundle.getInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", 0);
            this.f117571r = bundle.getCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT");
            this.f117572s = bundle.getInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", 0);
            this.f117573t = bundle.getCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT");
            this.f117575v = bundle.getInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", 0);
        }
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Context requireContext = requireContext();
        int i = this.f117575v;
        if (i == 0) {
            TypedValue b = C44693c.m79226b(requireContext(), R.attr.materialTimePickerTheme);
            if (b == null) {
                i = 0;
            } else {
                i = b.data;
            }
        }
        Dialog dialog = new Dialog(requireContext, i);
        Context context = dialog.getContext();
        int i2 = C44693c.m79227c(context, R.attr.colorSurface, C44989m.class.getCanonicalName()).data;
        C44779j jVar = new C44779j(context, (AttributeSet) null, R.attr.materialTimePickerStyle, 2132151829);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, C44991o.f117579c, R.attr.materialTimePickerStyle, 2132151829);
        this.f117567n = obtainStyledAttributes.getResourceId(0, 0);
        this.f117566m = obtainStyledAttributes.getResourceId(1, 0);
        obtainStyledAttributes.recycle();
        jVar.mo48121S(context);
        jVar.mo48124V(ColorStateList.valueOf(i2));
        Window window = dialog.getWindow();
        window.setBackgroundDrawable(jVar);
        window.requestFeature(1);
        window.setLayout(-2, -2);
        jVar.mo48123U(C2043bi.m5533a(window.getDecorView()));
        return dialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        ViewGroup viewGroup2 = (ViewGroup) layoutInflater.inflate(R.layout.material_timepicker_dialog, viewGroup);
        TimePickerView timePickerView = (TimePickerView) viewGroup2.findViewById(R.id.material_timepicker_view);
        this.f117562i = timePickerView;
        timePickerView.f117525h = this;
        this.f117563j = (ViewStub) viewGroup2.findViewById(R.id.material_textinput_timepicker);
        this.f117557d = (MaterialButton) viewGroup2.findViewById(R.id.material_timepicker_mode_button);
        TextView textView = (TextView) viewGroup2.findViewById(R.id.header_title);
        int i = this.f117568o;
        if (i != 0) {
            textView.setText(i);
        } else if (!TextUtils.isEmpty(this.f117569p)) {
            textView.setText(this.f117569p);
        }
        mo48655c(this.f117557d);
        Button button = (Button) viewGroup2.findViewById(R.id.material_timepicker_ok_button);
        button.setOnClickListener(new C44985i(this));
        int i2 = this.f117570q;
        if (i2 != 0) {
            button.setText(i2);
        } else if (!TextUtils.isEmpty(this.f117571r)) {
            button.setText(this.f117571r);
        }
        Button button2 = (Button) viewGroup2.findViewById(R.id.material_timepicker_cancel_button);
        this.f117574u = button2;
        button2.setOnClickListener(new C44986j(this));
        int i3 = this.f117572s;
        if (i3 != 0) {
            this.f117574u.setText(i3);
        } else if (!TextUtils.isEmpty(this.f117573t)) {
            this.f117574u.setText(this.f117573t);
        }
        m79969e();
        this.f117557d.setOnClickListener(new C44987k(this));
        return viewGroup2;
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f117565l = null;
        this.f117564k = null;
        this.f117556c = null;
        TimePickerView timePickerView = this.f117562i;
        if (timePickerView != null) {
            timePickerView.f117525h = null;
            this.f117562i = null;
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        for (DialogInterface.OnDismissListener onDismiss : this.f117561h) {
            onDismiss.onDismiss(dialogInterface);
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("TIME_PICKER_TIME_MODEL", this.f117559f);
        bundle.putInt("TIME_PICKER_INPUT_MODE", this.f117558e);
        bundle.putInt("TIME_PICKER_TITLE_RES", this.f117568o);
        bundle.putCharSequence("TIME_PICKER_TITLE_TEXT", this.f117569p);
        bundle.putInt("TIME_PICKER_POSITIVE_BUTTON_TEXT_RES", this.f117570q);
        bundle.putCharSequence("TIME_PICKER_POSITIVE_BUTTON_TEXT", this.f117571r);
        bundle.putInt("TIME_PICKER_NEGATIVE_BUTTON_TEXT_RES", this.f117572s);
        bundle.putCharSequence("TIME_PICKER_NEGATIVE_BUTTON_TEXT", this.f117573t);
        bundle.putInt("TIME_PICKER_OVERRIDE_THEME_RES_ID", this.f117575v);
    }

    public final void setCancelable(boolean z) {
        super.setCancelable(z);
        m79969e();
    }
}
