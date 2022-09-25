package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.support.p031v4.app.C0260w;
import android.support.p033v7.widget.C0678gm;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.C2061c;
import androidx.core.p098j.C2069cc;
import androidx.core.p098j.C2088cv;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.datepicker.CalendarConstraints;
import com.google.android.material.internal.C44750j;
import com.google.android.material.internal.CheckableImageButton;
import com.google.android.material.p3505b.C44535e;
import com.google.android.material.p3506c.C44580a;
import com.google.android.material.p3512i.C44693c;
import com.google.android.material.p3515l.C44779j;
import java.util.Iterator;
import java.util.LinkedHashSet;

/* renamed from: com.google.android.material.datepicker.ad */
/* compiled from: PG */
public final class C44608ad extends C0260w {

    /* renamed from: a */
    public final LinkedHashSet f116213a = new LinkedHashSet();

    /* renamed from: b */
    public final LinkedHashSet f116214b = new LinkedHashSet();

    /* renamed from: c */
    public CheckableImageButton f116215c;

    /* renamed from: d */
    public Button f116216d;

    /* renamed from: e */
    private final LinkedHashSet f116217e = new LinkedHashSet();

    /* renamed from: f */
    private final LinkedHashSet f116218f = new LinkedHashSet();

    /* renamed from: g */
    private int f116219g;

    /* renamed from: h */
    private DateSelector f116220h;

    /* renamed from: i */
    private C44618an f116221i;

    /* renamed from: j */
    private CalendarConstraints f116222j;

    /* renamed from: k */
    private DayViewDecorator f116223k;

    /* renamed from: l */
    private C44649v f116224l;

    /* renamed from: m */
    private int f116225m;

    /* renamed from: n */
    private CharSequence f116226n;

    /* renamed from: o */
    private boolean f116227o;

    /* renamed from: p */
    private int f116228p;

    /* renamed from: q */
    private int f116229q;

    /* renamed from: r */
    private CharSequence f116230r;

    /* renamed from: s */
    private int f116231s;

    /* renamed from: t */
    private CharSequence f116232t;

    /* renamed from: u */
    private TextView f116233u;

    /* renamed from: v */
    private TextView f116234v;

    /* renamed from: w */
    private C44779j f116235w;

    /* renamed from: x */
    private boolean f116236x;

    /* renamed from: y */
    private CharSequence f116237y;

    /* renamed from: z */
    private CharSequence f116238z;

    /* renamed from: e */
    static boolean m79056e(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C44693c.m79227c(context, R.attr.materialCalendarStyle, C44649v.class.getCanonicalName()).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: f */
    private static int m79057f(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        int i = Month.m79036f().f116201d;
        return dimensionPixelOffset + dimensionPixelOffset + (resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * i) + ((i - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding));
    }

    /* renamed from: g */
    private final int m79058g(Context context) {
        int i = this.f116219g;
        return i != 0 ? i : mo47840a().mo47799a(context);
    }

    /* renamed from: a */
    public final DateSelector mo47840a() {
        if (this.f116220h == null) {
            this.f116220h = (DateSelector) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f116220h;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: com.google.android.material.datepicker.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: com.google.android.material.datepicker.ag} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v4, resolved type: com.google.android.material.datepicker.v} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v5, resolved type: com.google.android.material.datepicker.v} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo47841b() {
        /*
            r8 = this;
            android.content.Context r0 = r8.requireContext()
            int r0 = r8.m79058g(r0)
            com.google.android.material.datepicker.DateSelector r1 = r8.mo47840a()
            com.google.android.material.datepicker.CalendarConstraints r2 = r8.f116222j
            com.google.android.material.datepicker.DayViewDecorator r3 = r8.f116223k
            com.google.android.material.datepicker.v r4 = new com.google.android.material.datepicker.v
            r4.<init>()
            android.os.Bundle r5 = new android.os.Bundle
            r5.<init>()
            java.lang.String r6 = "THEME_RES_ID_KEY"
            r5.putInt(r6, r0)
            java.lang.String r7 = "GRID_SELECTOR_KEY"
            r5.putParcelable(r7, r1)
            java.lang.String r1 = "CALENDAR_CONSTRAINTS_KEY"
            r5.putParcelable(r1, r2)
            java.lang.String r7 = "DAY_VIEW_DECORATOR_KEY"
            r5.putParcelable(r7, r3)
            java.lang.String r3 = "CURRENT_MONTH_KEY"
            com.google.android.material.datepicker.Month r2 = r2.f116191d
            r5.putParcelable(r3, r2)
            r4.setArguments(r5)
            r8.f116224l = r4
            com.google.android.material.internal.CheckableImageButton r2 = r8.f116215c
            boolean r2 = r2.f116510a
            if (r2 == 0) goto L_0x005f
            com.google.android.material.datepicker.DateSelector r3 = r8.mo47840a()
            com.google.android.material.datepicker.CalendarConstraints r4 = r8.f116222j
            com.google.android.material.datepicker.ag r5 = new com.google.android.material.datepicker.ag
            r5.<init>()
            android.os.Bundle r7 = new android.os.Bundle
            r7.<init>()
            r7.putInt(r6, r0)
            java.lang.String r0 = "DATE_SELECTOR_KEY"
            r7.putParcelable(r0, r3)
            r7.putParcelable(r1, r4)
            r5.setArguments(r7)
            goto L_0x0061
        L_0x005f:
            com.google.android.material.datepicker.v r5 = r8.f116224l
        L_0x0061:
            r8.f116221i = r5
            android.widget.TextView r0 = r8.f116233u
            if (r2 == 0) goto L_0x0077
            android.content.res.Resources r1 = r8.getResources()
            android.content.res.Configuration r1 = r1.getConfiguration()
            int r1 = r1.orientation
            r2 = 2
            if (r1 != r2) goto L_0x0077
            java.lang.CharSequence r1 = r8.f116238z
            goto L_0x0079
        L_0x0077:
            java.lang.CharSequence r1 = r8.f116237y
        L_0x0079:
            r0.setText(r1)
            r8.mo47842c()
            android.support.v4.app.FragmentManager r0 = r8.getChildFragmentManager()
            android.support.v4.app.a r1 = new android.support.v4.app.a
            r1.<init>((android.support.p031v4.app.FragmentManager) r0)
            com.google.android.material.datepicker.an r0 = r8.f116221i
            r2 = 0
            r3 = 2131433438(0x7f0b17de, float:1.8488662E38)
            r1.mo689v(r3, r0, r2)
            r1.mo509f()
            com.google.android.material.datepicker.an r0 = r8.f116221i
            com.google.android.material.datepicker.aa r1 = new com.google.android.material.datepicker.aa
            r1.<init>(r8)
            r0.mo47859e(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.datepicker.C44608ad.mo47841b():void");
    }

    /* renamed from: c */
    public final void mo47842c() {
        String c = mo47840a().mo47801c(getContext());
        this.f116234v.setContentDescription(String.format(getString(R.string.mtrl_picker_announce_current_selection), new Object[]{c}));
        this.f116234v.setText(c);
    }

    /* renamed from: d */
    public final void mo47843d(CheckableImageButton checkableImageButton) {
        String str;
        if (this.f116215c.f116510a) {
            str = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_calendar_input_mode);
        } else {
            str = checkableImageButton.getContext().getString(R.string.mtrl_picker_toggle_to_text_input_mode);
        }
        this.f116215c.setContentDescription(str);
    }

    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.f116217e.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f116219g = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f116220h = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f116222j = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f116223k = (DayViewDecorator) bundle.getParcelable("DAY_VIEW_DECORATOR_KEY");
        this.f116225m = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f116226n = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f116228p = bundle.getInt("INPUT_MODE_KEY");
        this.f116229q = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f116230r = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f116231s = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f116232t = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        CharSequence charSequence = this.f116226n;
        if (charSequence == null) {
            charSequence = requireContext().getResources().getText(this.f116225m);
        }
        this.f116237y = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(charSequence.toString(), "\n");
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.f116238z = charSequence;
    }

    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m79058g(requireContext()));
        Context context = dialog.getContext();
        this.f116227o = m79056e(context, 16843277);
        int i = C44693c.m79227c(context, R.attr.colorSurface, C44608ad.class.getCanonicalName()).data;
        C44779j jVar = new C44779j(context, (AttributeSet) null, R.attr.materialCalendarStyle, 2132151773);
        this.f116235w = jVar;
        jVar.mo48121S(context);
        this.f116235w.mo48124V(ColorStateList.valueOf(i));
        this.f116235w.mo48123U(C2043bi.m5533a(dialog.getWindow().getDecorView()));
        return dialog;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(true != this.f116227o ? R.layout.mtrl_picker_dialog : R.layout.mtrl_picker_fullscreen, viewGroup);
        Context context = inflate.getContext();
        if (this.f116223k == null) {
            if (this.f116227o) {
                inflate.findViewById(R.id.mtrl_calendar_frame).setLayoutParams(new LinearLayout.LayoutParams(m79057f(context), -2));
            } else {
                inflate.findViewById(R.id.mtrl_calendar_main_pane).setLayoutParams(new LinearLayout.LayoutParams(m79057f(context), -1));
            }
            TextView textView = (TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text);
            this.f116234v = textView;
            C2043bi.m5527U(textView, 1);
            this.f116215c = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
            this.f116233u = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
            this.f116215c.setTag("TOGGLE_BUTTON_TAG");
            CheckableImageButton checkableImageButton = this.f116215c;
            StateListDrawable stateListDrawable = new StateListDrawable();
            stateListDrawable.addState(new int[]{16842912}, C0678gm.m2375e().mo3100c(context, R.drawable.material_ic_calendar_black_24dp));
            stateListDrawable.addState(new int[0], C0678gm.m2375e().mo3100c(context, R.drawable.material_ic_edit_black_24dp));
            checkableImageButton.setImageDrawable(stateListDrawable);
            this.f116215c.setChecked(this.f116228p != 0);
            C2043bi.m5526T(this.f116215c, (C2061c) null);
            mo47843d(this.f116215c);
            this.f116215c.setOnClickListener(new C44606ab(this));
            this.f116216d = (Button) inflate.findViewById(R.id.confirm_button);
            if (mo47840a().mo47805g()) {
                this.f116216d.setEnabled(true);
            } else {
                this.f116216d.setEnabled(false);
            }
            this.f116216d.setTag("CONFIRM_BUTTON_TAG");
            CharSequence charSequence = this.f116230r;
            if (charSequence != null) {
                this.f116216d.setText(charSequence);
            } else {
                int i = this.f116229q;
                if (i != 0) {
                    this.f116216d.setText(i);
                }
            }
            this.f116216d.setOnClickListener(new C44651x(this));
            Button button = (Button) inflate.findViewById(R.id.cancel_button);
            button.setTag("CANCEL_BUTTON_TAG");
            CharSequence charSequence2 = this.f116232t;
            if (charSequence2 != null) {
                button.setText(charSequence2);
            } else {
                int i2 = this.f116231s;
                if (i2 != 0) {
                    button.setText(i2);
                }
            }
            button.setOnClickListener(new C44652y(this));
            return inflate;
        }
        throw null;
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.f116218f.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f116219g);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f116220h);
        int i = C44629b.f116272c;
        CalendarConstraints calendarConstraints = this.f116222j;
        long j = calendarConstraints.f116188a.f116203f;
        long j2 = calendarConstraints.f116189b.f116203f;
        Long valueOf = Long.valueOf(calendarConstraints.f116191d.f116203f);
        int i2 = calendarConstraints.f116192e;
        CalendarConstraints.DateValidator dateValidator = calendarConstraints.f116190c;
        Month month = this.f116224l.f116320c;
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", C44629b.m79088a(j, j2, month != null ? Long.valueOf(month.f116203f) : valueOf, i2, dateValidator));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", this.f116223k);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f116225m);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f116226n);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f116229q);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f116230r);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f116231s);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f116232t);
    }

    public final void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f116227o) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f116235w);
            if (!this.f116236x) {
                View findViewById = requireView().findViewById(R.id.fullscreen_header);
                Integer valueOf = findViewById.getBackground() instanceof ColorDrawable ? Integer.valueOf(((ColorDrawable) findViewById.getBackground()).getColor()) : null;
                boolean z = valueOf == null || valueOf.intValue() == 0;
                int c = C44535e.m78720c(window.getContext(), 16842801, -16777216);
                if (z) {
                    valueOf = Integer.valueOf(c);
                }
                Integer valueOf2 = Integer.valueOf(c);
                C2069cc.m5650a(window, false);
                window.getContext();
                window.getContext();
                window.setStatusBarColor(0);
                window.setNavigationBarColor(0);
                C44750j.m79355a(window, C44750j.m79356b(C44535e.m78723f(valueOf.intValue())));
                new C2088cv(window, window.getDecorView()).f5998a.mo5255g(C44750j.m79356b(C44535e.m78723f(valueOf2.intValue())));
                C2043bi.m5555ai(findViewById, new C44653z(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
                this.f116236x = true;
            }
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable(this.f116235w, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new C44580a(requireDialog(), rect));
        }
        mo47841b();
    }

    public final void onStop() {
        this.f116221i.f116260i.clear();
        super.onStop();
    }
}
