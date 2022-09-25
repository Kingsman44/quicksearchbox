package androidx.slice.widget;

import android.app.DatePickerDialog;
import android.app.PendingIntent;
import android.app.TimePickerDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.text.TextUtils;
import android.util.ArrayMap;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RatingBar;
import android.widget.SeekBar;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.core.p098j.C2043bi;
import androidx.slice.SliceItem;
import androidx.slice.p194a.C4094a;
import androidx.slice.p194a.C4101h;
import com.google.android.googlequicksearchbox.R;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: androidx.slice.widget.x */
/* compiled from: PG */
public class C4168x extends C4129ag implements View.OnClickListener, AdapterView.OnItemSelectedListener {

    /* renamed from: A */
    private final LinearLayout f13439A;

    /* renamed from: B */
    private final LinearLayout f13440B;

    /* renamed from: C */
    private final LinearLayout f13441C;

    /* renamed from: D */
    private final LinearLayout f13442D;

    /* renamed from: E */
    private final TextView f13443E;

    /* renamed from: F */
    private final TextView f13444F;

    /* renamed from: G */
    private final TextView f13445G;

    /* renamed from: H */
    private final View f13446H;

    /* renamed from: I */
    private final View f13447I;

    /* renamed from: J */
    private final ArrayMap f13448J = new ArrayMap();

    /* renamed from: K */
    private final ArrayMap f13449K = new ArrayMap();

    /* renamed from: L */
    private final LinearLayout f13450L;

    /* renamed from: M */
    private View f13451M;

    /* renamed from: N */
    private View f13452N;

    /* renamed from: O */
    private boolean f13453O;

    /* renamed from: P */
    private final ProgressBar f13454P;

    /* renamed from: Q */
    private Spinner f13455Q;

    /* renamed from: R */
    private boolean f13456R;

    /* renamed from: S */
    private List f13457S;

    /* renamed from: T */
    private boolean f13458T;

    /* renamed from: U */
    private SliceItem f13459U;

    /* renamed from: V */
    private SliceItem f13460V;

    /* renamed from: W */
    private ArrayList f13461W;

    /* renamed from: a */
    protected Set f13462a = new HashSet();

    /* renamed from: aa */
    private ArrayList f13463aa;

    /* renamed from: ab */
    private int f13464ab = getContext().getResources().getDimensionPixelSize(R.dimen.abc_slice_small_image_size);

    /* renamed from: ac */
    private int f13465ac = getContext().getResources().getDimensionPixelSize(R.dimen.abc_slice_icon_size);

    /* renamed from: ad */
    private int f13466ad;

    /* renamed from: ae */
    private final SeekBar.OnSeekBarChangeListener f13467ae = new C4164t(this);

    /* renamed from: af */
    private final RatingBar.OnRatingBarChangeListener f13468af = new C4165u(this);

    /* renamed from: b */
    boolean f13469b;

    /* renamed from: c */
    int f13470c;

    /* renamed from: d */
    public C4160p f13471d;

    /* renamed from: e */
    public C4094a f13472e;

    /* renamed from: f */
    public SliceItem f13473f;

    /* renamed from: g */
    boolean f13474g;

    /* renamed from: h */
    boolean f13475h;

    /* renamed from: i */
    Handler f13476i;

    /* renamed from: j */
    long f13477j;

    /* renamed from: k */
    int f13478k;

    /* renamed from: l */
    int f13479l;

    /* renamed from: m */
    int f13480m;

    /* renamed from: n */
    final Runnable f13481n = new C4163s(this);

    public C4168x(Context context) {
        super(context);
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(context).inflate(R.layout.abc_slice_small_template, this, false);
        this.f13439A = linearLayout;
        addView(linearLayout);
        this.f13440B = (LinearLayout) findViewById(R.id.icon_frame);
        LinearLayout linearLayout2 = (LinearLayout) findViewById(16908290);
        this.f13441C = linearLayout2;
        this.f13442D = (LinearLayout) findViewById(R.id.subcontent);
        this.f13443E = (TextView) findViewById(16908310);
        this.f13444F = (TextView) findViewById(16908304);
        this.f13445G = (TextView) findViewById(R.id.last_updated);
        this.f13446H = findViewById(R.id.bottom_divider);
        this.f13447I = findViewById(R.id.action_divider);
        ProgressBar progressBar = (ProgressBar) findViewById(R.id.action_sent_indicator);
        this.f13454P = progressBar;
        C4144av.m11885e(getContext(), progressBar);
        this.f13450L = (LinearLayout) findViewById(16908312);
        C2043bi.m5551ae(this, 2);
        C2043bi.m5551ae(linearLayout2, 2);
    }

    /* renamed from: A */
    private static final void m11935A(View view, int i, int i2) {
        boolean z = false;
        if (i < 0 && i2 < 0) {
            z = true;
        }
        if (view != null && !z) {
            if (i < 0) {
                i = view.getPaddingStart();
            }
            int paddingTop = view.getPaddingTop();
            if (i2 < 0) {
                i2 = view.getPaddingEnd();
            }
            view.setPaddingRelative(i, paddingTop, i2, view.getPaddingBottom());
        }
    }

    /* renamed from: B */
    private static final void m11936B(View view, int i) {
        if (view != null && i >= 0) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            layoutParams.width = i;
            view.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: q */
    private final int m11937q() {
        int d = this.f13265x.mo8718d(this.f13471d, this.f13267z);
        if (this.f13452N != null && this.f13473f == null) {
            d -= this.f13265x.f13310p;
        }
        return this.f13455Q != null ? d - this.f13265x.f13311q : d;
    }

    /* renamed from: r */
    private final void m11938r(C4094a aVar, int i, ViewGroup viewGroup, boolean z) {
        C4124ab abVar = new C4124ab(getContext(), this.f13266y);
        viewGroup.addView(abVar);
        if (viewGroup.getVisibility() == 8) {
            viewGroup.setVisibility(0);
        }
        boolean d = aVar.mo8607d();
        C4147c cVar = new C4147c(mo8706fy(), !d ? 1 : 0, true != d ? 0 : 3, this.f13470c);
        if (z) {
            cVar.mo8735a(0, 0, 1);
        }
        abVar.mo8688b(aVar, cVar, this.f13256o, i, this.f13264w);
        if (this.f13462a.contains(aVar.f13113h)) {
            abVar.mo8689c();
        }
        if (d) {
            this.f13448J.put(aVar, abVar);
        } else {
            this.f13449K.put(aVar, abVar);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00b7  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0139  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x013b  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x0145  */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x0164  */
    /* renamed from: s */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m11939s(boolean r10) {
        /*
            r9 = this;
            androidx.slice.widget.p r0 = r9.f13471d
            if (r0 == 0) goto L_0x0177
            androidx.slice.SliceItem r1 = r0.f13394f
            if (r1 == 0) goto L_0x000c
            androidx.slice.SliceItem r1 = r9.f13473f
            if (r1 != 0) goto L_0x0177
        L_0x000c:
            int r1 = r9.mo8706fy()
            r2 = 1
            if (r1 != r2) goto L_0x0018
            androidx.slice.SliceItem r0 = r0.mo8751e()
            goto L_0x001a
        L_0x0018:
            androidx.slice.SliceItem r0 = r0.f13391c
        L_0x001a:
            boolean r1 = r9.f13258q
            r3 = 0
            r4 = 0
            if (r1 == 0) goto L_0x0098
            long r5 = r9.f13259r
            r7 = -1
            int r1 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0098
            long r7 = java.lang.System.currentTimeMillis()
            long r7 = r7 - r5
            r5 = 31449600000(0x7528ad000, double:1.55381669354E-313)
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x004c
            long r7 = r7 / r5
            int r1 = (int) r7
            android.content.res.Resources r5 = r9.getResources()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r6[r4] = r7
            r7 = 2131951618(0x7f130002, float:1.9539656E38)
            java.lang.String r1 = r5.getQuantityString(r7, r1, r6)
            goto L_0x0086
        L_0x004c:
            r5 = 86400000(0x5265c00, double:4.2687272E-316)
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0068
            long r7 = r7 / r5
            int r1 = (int) r7
            android.content.res.Resources r5 = r9.getResources()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r6[r4] = r7
            r7 = 2131951616(0x7f130000, float:1.9539652E38)
            java.lang.String r1 = r5.getQuantityString(r7, r1, r6)
            goto L_0x0086
        L_0x0068:
            r5 = 60000(0xea60, double:2.9644E-319)
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 <= 0) goto L_0x0085
            long r7 = r7 / r5
            int r1 = (int) r7
            android.content.res.Resources r5 = r9.getResources()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            java.lang.Integer r7 = java.lang.Integer.valueOf(r1)
            r6[r4] = r7
            r7 = 2131951617(0x7f130001, float:1.9539654E38)
            java.lang.String r1 = r5.getQuantityString(r7, r1, r6)
            goto L_0x0086
        L_0x0085:
            r1 = r3
        L_0x0086:
            if (r1 == 0) goto L_0x0098
            android.content.res.Resources r5 = r9.getResources()
            java.lang.Object[] r6 = new java.lang.Object[r2]
            r6[r4] = r1
            r1 = 2132082780(0x7f15005c, float:1.9805684E38)
            java.lang.String r1 = r5.getString(r1, r6)
            goto L_0x0099
        L_0x0098:
            r1 = r3
        L_0x0099:
            if (r0 == 0) goto L_0x009f
            java.lang.CharSequence r3 = r0.mo8597e()
        L_0x009f:
            boolean r5 = android.text.TextUtils.isEmpty(r3)
            if (r5 == 0) goto L_0x00b4
            if (r0 == 0) goto L_0x00b2
            java.lang.String[] r0 = r0.f13091a
            java.lang.String r5 = "partial"
            boolean r0 = androidx.slice.C4093a.m11737a(r0, r5)
            if (r0 == 0) goto L_0x00b2
            goto L_0x00b4
        L_0x00b2:
            r0 = 0
            goto L_0x00b5
        L_0x00b4:
            r0 = 1
        L_0x00b5:
            if (r0 == 0) goto L_0x00ec
            android.widget.TextView r5 = r9.f13444F
            r5.setText(r3)
            androidx.slice.widget.ao r5 = r9.f13265x
            if (r5 == 0) goto L_0x00ec
            android.widget.TextView r6 = r9.f13444F
            boolean r7 = r9.f13456R
            if (r7 == 0) goto L_0x00c9
            int r5 = r5.f13299e
            goto L_0x00cb
        L_0x00c9:
            int r5 = r5.f13302h
        L_0x00cb:
            float r5 = (float) r5
            r6.setTextSize(r4, r5)
            android.widget.TextView r5 = r9.f13444F
            androidx.slice.widget.q r6 = r9.f13266y
            int r6 = r6.mo8753a()
            r5.setTextColor(r6)
            boolean r5 = r9.f13456R
            if (r5 == 0) goto L_0x00e3
            androidx.slice.widget.ao r5 = r9.f13265x
            int r5 = r5.f13300f
            goto L_0x00e7
        L_0x00e3:
            androidx.slice.widget.ao r5 = r9.f13265x
            int r5 = r5.f13303i
        L_0x00e7:
            android.widget.TextView r6 = r9.f13444F
            r6.setPadding(r4, r5, r4, r4)
        L_0x00ec:
            r5 = 2
            if (r1 == 0) goto L_0x012f
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00fb
            java.lang.String r3 = " · "
            java.lang.String r1 = r3.concat(r1)
        L_0x00fb:
            android.text.SpannableString r3 = new android.text.SpannableString
            r3.<init>(r1)
            android.text.style.StyleSpan r6 = new android.text.style.StyleSpan
            r6.<init>(r5)
            int r7 = r1.length()
            r3.setSpan(r6, r4, r7, r4)
            android.widget.TextView r6 = r9.f13445G
            r6.setText(r3)
            androidx.slice.widget.ao r3 = r9.f13265x
            if (r3 == 0) goto L_0x012f
            android.widget.TextView r6 = r9.f13445G
            boolean r7 = r9.f13456R
            if (r7 == 0) goto L_0x011e
            int r3 = r3.f13299e
            goto L_0x0120
        L_0x011e:
            int r3 = r3.f13302h
        L_0x0120:
            float r3 = (float) r3
            r6.setTextSize(r4, r3)
            android.widget.TextView r3 = r9.f13445G
            androidx.slice.widget.q r6 = r9.f13266y
            int r6 = r6.mo8753a()
            r3.setTextColor(r6)
        L_0x012f:
            android.widget.TextView r3 = r9.f13445G
            boolean r6 = android.text.TextUtils.isEmpty(r1)
            r7 = 8
            if (r2 == r6) goto L_0x013b
            r6 = 0
            goto L_0x013d
        L_0x013b:
            r6 = 8
        L_0x013d:
            r3.setVisibility(r6)
            android.widget.TextView r3 = r9.f13444F
            if (r2 == r0) goto L_0x0145
            goto L_0x0146
        L_0x0145:
            r7 = 0
        L_0x0146:
            r3.setVisibility(r7)
            androidx.slice.widget.p r3 = r9.f13471d
            boolean r3 = r3.f13396h
            if (r3 == 0) goto L_0x0153
            boolean r3 = r9.f13458T
            if (r3 == 0) goto L_0x015e
        L_0x0153:
            if (r10 != 0) goto L_0x015e
            if (r0 == 0) goto L_0x015e
            boolean r10 = android.text.TextUtils.isEmpty(r1)
            if (r10 == 0) goto L_0x015e
            goto L_0x015f
        L_0x015e:
            r5 = 1
        L_0x015f:
            android.widget.TextView r10 = r9.f13444F
            if (r5 != r2) goto L_0x0164
            goto L_0x0165
        L_0x0164:
            r2 = 0
        L_0x0165:
            r10.setSingleLine(r2)
            android.widget.TextView r10 = r9.f13444F
            r10.setMaxLines(r5)
            android.widget.TextView r10 = r9.f13444F
            r10.requestLayout()
            android.widget.TextView r10 = r9.f13445G
            r10.requestLayout()
        L_0x0177:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.widget.C4168x.m11939s(boolean):void");
    }

    /* renamed from: t */
    private final void m11940t(View view, int i, int i2) {
        measureChild(view, i, View.MeasureSpec.makeMeasureSpec(i2 + this.f13261t + this.f13263v, 1073741824));
    }

    /* renamed from: u */
    private final void m11941u(boolean z) {
        if (this.f13472e != null) {
            Log.d("ASDF", "ASDF" + z + ":" + this.f13472e.f13113h);
            SliceItem d = C4101h.m11751d(this.f13472e.f13113h, "long", "millis");
            if (d != null) {
                int i = this.f13470c;
                Calendar instance = Calendar.getInstance();
                instance.setTime(new Date(d.mo8594b()));
                if (z) {
                    new DatePickerDialog(getContext(), R.style.DialogTheme, new C4166v(this, this.f13472e.f13113h, i), instance.get(1), instance.get(2), instance.get(5)).show();
                    return;
                }
                new TimePickerDialog(getContext(), R.style.DialogTheme, new C4167w(this, this.f13472e.f13113h, i), instance.get(11), instance.get(12), false).show();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:175:0x0333  */
    /* JADX WARNING: Removed duplicated region for block: B:190:0x03d2  */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x008e  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x0098  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x009b  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x00a5  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b2  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00db  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00e7  */
    /* JADX WARNING: Removed duplicated region for block: B:57:0x00ea  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0106  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x0141  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x0152  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x0167  */
    /* renamed from: v */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m11942v(boolean r11) {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            if (r11 == 0) goto L_0x000a
            boolean r11 = r10.f13474g
            if (r11 == 0) goto L_0x000a
            r11 = 1
            goto L_0x000b
        L_0x000a:
            r11 = 0
        L_0x000b:
            if (r11 != 0) goto L_0x0010
            r10.m11943w()
        L_0x0010:
            androidx.slice.widget.p r2 = r10.f13471d
            int r2 = r2.mo8712g()
            r3 = -1
            if (r2 == r3) goto L_0x0022
            androidx.slice.widget.p r2 = r10.f13471d
            int r2 = r2.mo8712g()
            r10.setLayoutDirection(r2)
        L_0x0022:
            androidx.slice.widget.p r2 = r10.f13471d
            boolean r2 = r2.mo8752f()
            r4 = 8
            if (r2 == 0) goto L_0x0068
            android.content.Context r11 = r10.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            r2 = 2131624002(0x7f0e0042, float:1.8875171E38)
            android.view.View r11 = r11.inflate(r2, r10, r1)
            android.widget.Button r11 = (android.widget.Button) r11
            androidx.slice.widget.r r1 = new androidx.slice.widget.r
            r1.<init>(r10, r11)
            r11.setOnClickListener(r1)
            int r1 = r10.f13257p
            if (r1 == r3) goto L_0x004c
            r11.setTextColor(r1)
        L_0x004c:
            r10.f13451M = r11
            android.widget.LinearLayout r1 = r10.f13439A
            r1.addView(r11)
            java.util.Set r1 = r10.f13462a
            androidx.slice.widget.p r2 = r10.f13471d
            androidx.slice.SliceItem r2 = r2.f13268m
            boolean r1 = r1.contains(r2)
            if (r1 == 0) goto L_0x0067
            r10.f13469b = r0
            r11.setVisibility(r4)
            r10.mo8765l()
        L_0x0067:
            return
        L_0x0068:
            androidx.slice.widget.p r2 = r10.f13471d
            java.lang.CharSequence r2 = r2.mo8713h()
            if (r2 == 0) goto L_0x0075
            android.widget.LinearLayout r5 = r10.f13441C
            r5.setContentDescription(r2)
        L_0x0075:
            androidx.slice.widget.p r2 = r10.f13471d
            androidx.slice.SliceItem r2 = r2.mo8750c()
            r10.f13473f = r2
            if (r2 == 0) goto L_0x008b
            androidx.slice.widget.p r5 = r10.f13471d
            boolean r6 = r5.f13396h
            if (r6 == 0) goto L_0x0089
            boolean r5 = r5.f13398j
            if (r5 == 0) goto L_0x008b
        L_0x0089:
            r5 = 1
            goto L_0x008c
        L_0x008b:
            r5 = 0
        L_0x008c:
            if (r5 == 0) goto L_0x0094
            int r5 = r10.f13257p
            boolean r5 = r10.m11946z(r2, r5, r0)
        L_0x0094:
            android.widget.LinearLayout r2 = r10.f13440B
            if (r0 == r5) goto L_0x009b
            r5 = 8
            goto L_0x009c
        L_0x009b:
            r5 = 0
        L_0x009c:
            r2.setVisibility(r5)
            androidx.slice.widget.p r2 = r10.f13471d
            androidx.slice.SliceItem r2 = r2.f13390b
            if (r2 == 0) goto L_0x00ae
            android.widget.TextView r5 = r10.f13443E
            java.lang.CharSequence r6 = r2.mo8597e()
            r5.setText(r6)
        L_0x00ae:
            androidx.slice.widget.ao r5 = r10.f13265x
            if (r5 == 0) goto L_0x00cc
            android.widget.TextView r6 = r10.f13443E
            boolean r7 = r10.f13456R
            if (r7 == 0) goto L_0x00bb
            int r5 = r5.f13298d
            goto L_0x00bd
        L_0x00bb:
            int r5 = r5.f13301g
        L_0x00bd:
            float r5 = (float) r5
            r6.setTextSize(r1, r5)
            android.widget.TextView r5 = r10.f13443E
            androidx.slice.widget.q r6 = r10.f13266y
            int r6 = r6.mo8755c()
            r5.setTextColor(r6)
        L_0x00cc:
            android.widget.TextView r5 = r10.f13443E
            if (r2 == 0) goto L_0x00d2
            r6 = 0
            goto L_0x00d4
        L_0x00d2:
            r6 = 8
        L_0x00d4:
            r5.setVisibility(r6)
            if (r2 == 0) goto L_0x00db
            r2 = 1
            goto L_0x00dc
        L_0x00db:
            r2 = 0
        L_0x00dc:
            r10.m11939s(r2)
            android.view.View r2 = r10.f13446H
            androidx.slice.widget.p r5 = r10.f13471d
            boolean r5 = r5.f13399k
            if (r0 == r5) goto L_0x00ea
            r5 = 8
            goto L_0x00eb
        L_0x00ea:
            r5 = 0
        L_0x00eb:
            r2.setVisibility(r5)
            androidx.slice.widget.p r2 = r10.f13471d
            androidx.slice.SliceItem r2 = r2.f13389a
            r5 = 2
            if (r2 == 0) goto L_0x0161
            androidx.slice.SliceItem r6 = r10.f13473f
            if (r2 == r6) goto L_0x0161
            androidx.slice.a.a r6 = new androidx.slice.a.a
            r6.<init>(r2)
            r10.f13472e = r6
            java.lang.String r2 = r6.mo8606c()
            if (r2 == 0) goto L_0x0161
            androidx.slice.a.a r2 = r10.f13472e
            java.lang.String r2 = r2.mo8606c()
            int r6 = r2.hashCode()
            r7 = -868304044(0xffffffffcc3ebb54, float:-4.9999184E7)
            if (r6 == r7) goto L_0x0134
            r7 = 759128640(0x2d3f6240, float:1.0878909E-11)
            if (r6 == r7) goto L_0x012a
            r7 = 1250407999(0x4a87b63f, float:4447007.5)
            if (r6 == r7) goto L_0x0120
            goto L_0x013e
        L_0x0120:
            java.lang.String r6 = "date_picker"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x013e
            r2 = 1
            goto L_0x013f
        L_0x012a:
            java.lang.String r6 = "time_picker"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x013e
            r2 = 2
            goto L_0x013f
        L_0x0134:
            java.lang.String r6 = "toggle"
            boolean r2 = r2.equals(r6)
            if (r2 == 0) goto L_0x013e
            r2 = 0
            goto L_0x013f
        L_0x013e:
            r2 = -1
        L_0x013f:
            if (r2 == 0) goto L_0x0152
            if (r2 == r0) goto L_0x014c
            if (r2 == r5) goto L_0x0146
            goto L_0x0161
        L_0x0146:
            android.widget.LinearLayout r11 = r10.f13439A
            r10.m11944x(r11, r0)
            return
        L_0x014c:
            android.widget.LinearLayout r11 = r10.f13439A
            r10.m11944x(r11, r0)
            return
        L_0x0152:
            androidx.slice.a.a r11 = r10.f13472e
            int r2 = r10.f13257p
            android.widget.LinearLayout r3 = r10.f13450L
            r10.m11938r(r11, r2, r3, r1)
            android.widget.LinearLayout r11 = r10.f13439A
            r10.m11944x(r11, r0)
            return
        L_0x0161:
            androidx.slice.widget.p r2 = r10.f13471d
            androidx.slice.SliceItem r2 = r2.f13394f
            if (r2 == 0) goto L_0x032d
            androidx.slice.a.a r6 = r10.f13472e
            if (r6 == 0) goto L_0x0170
            android.widget.LinearLayout r6 = r10.f13439A
            r10.m11944x(r6, r0)
        L_0x0170:
            r10.f13459U = r2
            java.lang.String r6 = "int"
            java.lang.String r7 = "range_mode"
            androidx.slice.SliceItem r2 = androidx.slice.p194a.C4101h.m11751d(r2, r6, r7)
            if (r2 == 0) goto L_0x0187
            int r2 = r2.mo8593a()
            if (r2 != r5) goto L_0x0184
            r2 = 1
            goto L_0x0185
        L_0x0184:
            r2 = 0
        L_0x0185:
            r10.f13453O = r2
        L_0x0187:
            if (r11 != 0) goto L_0x0327
            androidx.slice.SliceItem r11 = r10.f13459U
            java.lang.String r2 = "min"
            androidx.slice.SliceItem r11 = androidx.slice.p194a.C4101h.m11751d(r11, r6, r2)
            if (r11 == 0) goto L_0x0198
            int r11 = r11.mo8593a()
            goto L_0x0199
        L_0x0198:
            r11 = 0
        L_0x0199:
            r10.f13479l = r11
            androidx.slice.SliceItem r2 = r10.f13459U
            java.lang.String r8 = "max"
            androidx.slice.SliceItem r2 = androidx.slice.p194a.C4101h.m11751d(r2, r6, r8)
            boolean r8 = r10.f13453O
            if (r0 == r8) goto L_0x01aa
            r8 = 100
            goto L_0x01ab
        L_0x01aa:
            r8 = 5
        L_0x01ab:
            if (r2 == 0) goto L_0x01b1
            int r8 = r2.mo8593a()
        L_0x01b1:
            r10.f13480m = r8
            androidx.slice.SliceItem r2 = r10.f13459U
            java.lang.String r8 = "value"
            androidx.slice.SliceItem r2 = androidx.slice.p194a.C4101h.m11751d(r2, r6, r8)
            if (r2 == 0) goto L_0x01c3
            int r2 = r2.mo8593a()
            int r2 = r2 - r11
            goto L_0x01c4
        L_0x01c3:
            r2 = 0
        L_0x01c4:
            r10.f13478k = r2
            android.os.Handler r11 = r10.f13476i
            if (r11 != 0) goto L_0x01d1
            android.os.Handler r11 = new android.os.Handler
            r11.<init>()
            r10.f13476i = r11
        L_0x01d1:
            boolean r11 = r10.f13453O
            r2 = -2
            if (r11 == 0) goto L_0x022d
            android.widget.RatingBar r11 = new android.widget.RatingBar
            android.content.Context r0 = r10.getContext()
            r11.<init>(r0)
            android.graphics.drawable.Drawable r0 = r11.getProgressDrawable()
            android.graphics.drawable.LayerDrawable r0 = (android.graphics.drawable.LayerDrawable) r0
            android.graphics.drawable.Drawable r0 = r0.getDrawable(r5)
            int r4 = r10.f13257p
            android.graphics.PorterDuff$Mode r5 = android.graphics.PorterDuff.Mode.SRC_IN
            r0.setColorFilter(r4, r5)
            r0 = 1065353216(0x3f800000, float:1.0)
            r11.setStepSize(r0)
            int r0 = r10.f13480m
            r11.setNumStars(r0)
            int r0 = r10.f13478k
            float r0 = (float) r0
            r11.setRating(r0)
            r11.setVisibility(r1)
            android.widget.LinearLayout r0 = new android.widget.LinearLayout
            android.content.Context r4 = r10.getContext()
            r0.<init>(r4)
            r4 = 17
            r0.setGravity(r4)
            r0.setVisibility(r1)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r2, r2)
            r0.addView(r11, r4)
            android.widget.FrameLayout$LayoutParams r4 = new android.widget.FrameLayout$LayoutParams
            r4.<init>(r3, r2)
            r10.addView(r0, r4)
            android.widget.RatingBar$OnRatingBarChangeListener r2 = r10.f13468af
            r11.setOnRatingBarChangeListener(r2)
            r10.f13452N = r0
            goto L_0x0327
        L_0x022d:
            androidx.slice.SliceItem r11 = r10.f13459U
            androidx.slice.SliceItem r11 = androidx.slice.p194a.C4101h.m11751d(r11, r6, r7)
            if (r11 == 0) goto L_0x023d
            int r11 = r11.mo8593a()
            if (r11 != r0) goto L_0x023d
            r11 = 1
            goto L_0x023e
        L_0x023d:
            r11 = 0
        L_0x023e:
            androidx.slice.SliceItem r5 = r10.f13459U
            java.lang.String r5 = r5.f13092b
            java.lang.String r6 = "action"
            boolean r5 = r6.equals(r5)
            androidx.slice.SliceItem r6 = r10.f13473f
            if (r5 == 0) goto L_0x0273
            if (r6 != 0) goto L_0x0258
            android.widget.SeekBar r6 = new android.widget.SeekBar
            android.content.Context r7 = r10.getContext()
            r6.<init>(r7)
            goto L_0x02ab
        L_0x0258:
            android.content.Context r6 = r10.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r7 = 2131624004(0x7f0e0044, float:1.8875175E38)
            android.view.View r6 = r6.inflate(r7, r10, r1)
            android.widget.SeekBar r6 = (android.widget.SeekBar) r6
            androidx.slice.widget.q r7 = r10.f13266y
            if (r7 == 0) goto L_0x02ab
            int r7 = r7.f13416n
            m11936B(r6, r7)
            goto L_0x02ab
        L_0x0273:
            if (r6 != 0) goto L_0x0283
            android.widget.ProgressBar r6 = new android.widget.ProgressBar
            android.content.Context r7 = r10.getContext()
            r8 = 0
            r9 = 16842872(0x1010078, float:2.3693894E-38)
            r6.<init>(r7, r8, r9)
            goto L_0x02a6
        L_0x0283:
            android.content.Context r6 = r10.getContext()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r7 = 2131623996(0x7f0e003c, float:1.887516E38)
            android.view.View r6 = r6.inflate(r7, r10, r1)
            android.widget.ProgressBar r6 = (android.widget.ProgressBar) r6
            androidx.slice.widget.q r7 = r10.f13266y
            if (r7 == 0) goto L_0x02a6
            int r7 = r7.f13417o
            m11936B(r6, r7)
            androidx.slice.widget.q r7 = r10.f13266y
            int r8 = r7.f13418p
            int r7 = r7.f13419q
            m11935A(r6, r8, r7)
        L_0x02a6:
            if (r11 == 0) goto L_0x02ab
            r6.setIndeterminate(r0)
        L_0x02ab:
            if (r11 == 0) goto L_0x02b2
            android.graphics.drawable.Drawable r7 = r6.getIndeterminateDrawable()
            goto L_0x02b6
        L_0x02b2:
            android.graphics.drawable.Drawable r7 = r6.getProgressDrawable()
        L_0x02b6:
            int r8 = r10.f13257p
            if (r8 == r3) goto L_0x02c8
            if (r7 == 0) goto L_0x02c8
            androidx.core.graphics.drawable.C1929b.m5225f(r7, r8)
            if (r11 == 0) goto L_0x02c5
            r6.setIndeterminateDrawable(r7)
            goto L_0x02c8
        L_0x02c5:
            r6.setProgressDrawable(r7)
        L_0x02c8:
            int r11 = r10.f13480m
            int r7 = r10.f13479l
            int r11 = r11 - r7
            r6.setMax(r11)
            int r11 = r10.f13478k
            r6.setProgress(r11)
            r6.setVisibility(r1)
            androidx.slice.SliceItem r11 = r10.f13473f
            if (r11 != 0) goto L_0x02e5
            android.widget.FrameLayout$LayoutParams r11 = new android.widget.FrameLayout$LayoutParams
            r11.<init>(r3, r2)
            r10.addView(r6, r11)
            goto L_0x02ef
        L_0x02e5:
            android.widget.LinearLayout r11 = r10.f13442D
            r11.setVisibility(r4)
            android.widget.LinearLayout r11 = r10.f13441C
            r11.addView(r6, r0)
        L_0x02ef:
            r10.f13452N = r6
            if (r5 == 0) goto L_0x0327
            androidx.slice.widget.p r11 = r10.f13471d
            androidx.slice.SliceItem r11 = r11.mo8749b()
            android.view.View r0 = r10.f13452N
            android.widget.SeekBar r0 = (android.widget.SeekBar) r0
            if (r11 == 0) goto L_0x0312
            java.lang.Object r11 = r11.f13094d
            androidx.core.graphics.drawable.IconCompat r11 = (androidx.core.graphics.drawable.IconCompat) r11
            if (r11 == 0) goto L_0x0312
            android.content.Context r2 = r10.getContext()
            android.graphics.drawable.Drawable r11 = r11.mo5075d(r2)
            if (r11 == 0) goto L_0x0312
            r0.setThumb(r11)
        L_0x0312:
            android.graphics.drawable.Drawable r11 = r0.getThumb()
            int r2 = r10.f13257p
            if (r2 == r3) goto L_0x0322
            if (r11 == 0) goto L_0x0322
            androidx.core.graphics.drawable.C1929b.m5225f(r11, r2)
            r0.setThumb(r11)
        L_0x0322:
            android.widget.SeekBar$OnSeekBarChangeListener r11 = r10.f13467ae
            r0.setOnSeekBarChangeListener(r11)
        L_0x0327:
            androidx.slice.SliceItem r11 = r10.f13473f
            if (r11 == 0) goto L_0x032c
            goto L_0x032d
        L_0x032c:
            return
        L_0x032d:
            androidx.slice.widget.p r11 = r10.f13471d
            androidx.slice.SliceItem r11 = r11.f13395g
            if (r11 == 0) goto L_0x03d2
            r10.f13460V = r11
            android.os.Handler r0 = r10.f13476i
            if (r0 != 0) goto L_0x0340
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r10.f13476i = r0
        L_0x0340:
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f13461W = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r10.f13463aa = r0
            androidx.slice.Slice r11 = r11.mo8596d()
            androidx.slice.SliceItem[] r11 = r11.f13088d
            java.util.List r11 = java.util.Arrays.asList(r11)
            r0 = 0
        L_0x0359:
            int r2 = r11.size()
            if (r0 >= r2) goto L_0x039b
            java.lang.Object r2 = r11.get(r0)
            androidx.slice.SliceItem r2 = (androidx.slice.SliceItem) r2
            java.lang.String[] r3 = r2.f13091a
            java.lang.String r4 = "selection_option"
            boolean r3 = androidx.slice.C4093a.m11737a(r3, r4)
            if (r3 != 0) goto L_0x0370
            goto L_0x0398
        L_0x0370:
            java.lang.String r3 = "selection_option_key"
            java.lang.String r4 = "text"
            androidx.slice.SliceItem r3 = androidx.slice.p194a.C4101h.m11751d(r2, r4, r3)
            java.lang.String r5 = "selection_option_value"
            androidx.slice.SliceItem r2 = androidx.slice.p194a.C4101h.m11751d(r2, r4, r5)
            if (r3 == 0) goto L_0x0398
            if (r2 == 0) goto L_0x0398
            java.util.ArrayList r4 = r10.f13461W
            java.lang.Object r3 = r3.f13094d
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            java.lang.String r3 = r3.toString()
            r4.add(r3)
            java.util.ArrayList r3 = r10.f13463aa
            java.lang.CharSequence r2 = r2.mo8597e()
            r3.add(r2)
        L_0x0398:
            int r0 = r0 + 1
            goto L_0x0359
        L_0x039b:
            android.content.Context r11 = r10.getContext()
            android.view.LayoutInflater r11 = android.view.LayoutInflater.from(r11)
            r0 = 2131623999(0x7f0e003f, float:1.8875165E38)
            android.view.View r11 = r11.inflate(r0, r10, r1)
            android.widget.Spinner r11 = (android.widget.Spinner) r11
            r10.f13455Q = r11
            android.widget.ArrayAdapter r11 = new android.widget.ArrayAdapter
            android.content.Context r0 = r10.getContext()
            r1 = 2131624001(0x7f0e0041, float:1.887517E38)
            java.util.ArrayList r2 = r10.f13463aa
            r11.<init>(r0, r1, r2)
            r0 = 2131624000(0x7f0e0040, float:1.8875167E38)
            r11.setDropDownViewResource(r0)
            android.widget.Spinner r0 = r10.f13455Q
            r0.setAdapter(r11)
            android.widget.Spinner r11 = r10.f13455Q
            r10.addView(r11)
            android.widget.Spinner r11 = r10.f13455Q
            r11.setOnItemSelectedListener(r10)
            return
        L_0x03d2:
            r10.m11945y()
            r10.mo8765l()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.widget.C4168x.m11942v(boolean):void");
    }

    /* renamed from: w */
    private final void m11943w() {
        this.f13439A.setVisibility(0);
        setLayoutDirection(2);
        m11944x(this.f13439A, false);
        m11944x(this.f13441C, false);
        this.f13440B.removeAllViews();
        this.f13450L.removeAllViews();
        this.f13450L.setVisibility(8);
        this.f13443E.setText((CharSequence) null);
        this.f13444F.setText((CharSequence) null);
        this.f13445G.setText((CharSequence) null);
        this.f13445G.setVisibility(8);
        this.f13448J.clear();
        this.f13449K.clear();
        this.f13472e = null;
        this.f13446H.setVisibility(8);
        this.f13447I.setVisibility(8);
        View view = this.f13451M;
        if (view != null) {
            this.f13439A.removeView(view);
            this.f13451M = null;
        }
        this.f13474g = false;
        this.f13459U = null;
        this.f13479l = 0;
        this.f13480m = 0;
        this.f13478k = 0;
        this.f13477j = 0;
        this.f13476i = null;
        View view2 = this.f13452N;
        if (view2 != null) {
            if (this.f13473f == null) {
                removeView(view2);
            } else {
                this.f13441C.removeView(view2);
            }
            this.f13452N = null;
        }
        this.f13442D.setVisibility(0);
        this.f13473f = null;
        this.f13454P.setVisibility(8);
        Spinner spinner = this.f13455Q;
        if (spinner != null) {
            removeView(spinner);
            this.f13455Q = null;
        }
        this.f13460V = null;
    }

    /* renamed from: x */
    private final void m11944x(View view, boolean z) {
        Drawable drawable = null;
        view.setOnClickListener(true != z ? null : this);
        if (z) {
            drawable = C4144av.m11883c(getContext(), 16843534);
        }
        view.setBackground(drawable);
        view.setClickable(z);
    }

    /* JADX WARNING: Removed duplicated region for block: B:66:0x00d2  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x00d4  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00d9  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x00e0 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x013d  */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m11945y() {
        /*
            r12 = this;
            androidx.slice.widget.p r0 = r12.f13471d
            if (r0 == 0) goto L_0x0141
            androidx.slice.SliceItem r0 = r0.f13394f
            if (r0 == 0) goto L_0x000c
            androidx.slice.SliceItem r0 = r12.f13473f
            if (r0 == 0) goto L_0x0141
        L_0x000c:
            android.widget.LinearLayout r0 = r12.f13450L
            r0.removeAllViews()
            androidx.slice.widget.p r0 = r12.f13471d
            java.util.ArrayList r1 = r0.f13392d
            java.util.List r2 = r12.f13457S
            if (r2 == 0) goto L_0x001a
            r1 = r2
        L_0x001a:
            boolean r0 = r0.f13396h
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0035
            androidx.slice.SliceItem r0 = r12.f13473f
            if (r0 == 0) goto L_0x0035
            boolean r0 = r1.isEmpty()
            if (r0 == 0) goto L_0x0035
            androidx.slice.widget.p r0 = r12.f13471d
            boolean r0 = r0.f13398j
            if (r0 != 0) goto L_0x0035
            androidx.slice.SliceItem r0 = r12.f13473f
            r1.add(r0)
        L_0x0035:
            r6 = r2
            r0 = 0
            r4 = 0
            r5 = 0
            r7 = 0
        L_0x003a:
            int r8 = r1.size()
            java.lang.String r9 = "action"
            r10 = 1
            if (r0 >= r8) goto L_0x009f
            java.lang.Object r8 = r1.get(r0)
            boolean r8 = r8 instanceof androidx.slice.SliceItem
            if (r8 == 0) goto L_0x0052
            java.lang.Object r8 = r1.get(r0)
            androidx.slice.SliceItem r8 = (androidx.slice.SliceItem) r8
            goto L_0x005a
        L_0x0052:
            java.lang.Object r8 = r1.get(r0)
            androidx.slice.a.a r8 = (androidx.slice.p194a.C4094a) r8
            androidx.slice.SliceItem r8 = r8.f13113h
        L_0x005a:
            r11 = 3
            if (r4 >= r11) goto L_0x009c
            int r11 = r12.f13257p
            boolean r11 = r12.m11946z(r8, r11, r3)
            if (r11 == 0) goto L_0x009c
            if (r6 != 0) goto L_0x0071
            r11 = r2
            java.lang.String[] r11 = (java.lang.String[]) r11
            androidx.slice.SliceItem r11 = androidx.slice.p194a.C4101h.m11749b(r8, r9, r2, r2)
            if (r11 == 0) goto L_0x0071
            r6 = r8
        L_0x0071:
            int r4 = r4 + 1
            if (r4 != r10) goto L_0x009c
            android.util.ArrayMap r5 = r12.f13448J
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x0089
            androidx.slice.Slice r5 = r8.mo8596d()
            androidx.slice.SliceItem r5 = androidx.slice.p194a.C4101h.m11757j(r5)
            if (r5 != 0) goto L_0x0089
            r5 = 1
            goto L_0x008a
        L_0x0089:
            r5 = 0
        L_0x008a:
            int r7 = r1.size()
            if (r7 != r10) goto L_0x009b
            r7 = r2
            java.lang.String[] r7 = (java.lang.String[]) r7
            androidx.slice.SliceItem r7 = androidx.slice.p194a.C4101h.m11749b(r8, r9, r2, r2)
            if (r7 == 0) goto L_0x009b
            r7 = 1
            goto L_0x009c
        L_0x009b:
            r7 = 0
        L_0x009c:
            int r0 = r0 + 1
            goto L_0x003a
        L_0x009f:
            android.widget.LinearLayout r0 = r12.f13450L
            r1 = 8
            if (r4 <= 0) goto L_0x00a7
            r8 = 0
            goto L_0x00a9
        L_0x00a7:
            r8 = 8
        L_0x00a9:
            r0.setVisibility(r8)
            android.view.View r0 = r12.f13447I
            androidx.slice.a.a r8 = r12.f13472e
            if (r8 == 0) goto L_0x00bd
            if (r5 != 0) goto L_0x00bc
            androidx.slice.widget.p r5 = r12.f13471d
            boolean r5 = r5.f13400l
            if (r5 == 0) goto L_0x00bd
            if (r7 == 0) goto L_0x00bd
        L_0x00bc:
            r1 = 0
        L_0x00bd:
            r0.setVisibility(r1)
            androidx.slice.SliceItem r0 = r12.f13473f
            if (r0 == 0) goto L_0x00cf
            r1 = r2
            java.lang.String[] r1 = (java.lang.String[]) r1
            androidx.slice.SliceItem r0 = androidx.slice.p194a.C4101h.m11749b(r0, r9, r2, r2)
            if (r0 == 0) goto L_0x00cf
            r0 = 1
            goto L_0x00d0
        L_0x00cf:
            r0 = 0
        L_0x00d0:
            if (r6 != 0) goto L_0x00d4
            r1 = 0
            goto L_0x00d5
        L_0x00d4:
            r1 = 1
        L_0x00d5:
            androidx.slice.a.a r2 = r12.f13472e
            if (r2 == 0) goto L_0x00e0
            android.widget.LinearLayout r0 = r12.f13439A
            r12.m11944x(r0, r10)
        L_0x00de:
            r0 = 0
            goto L_0x0123
        L_0x00e0:
            if (r1 == r0) goto L_0x00de
            if (r4 == r10) goto L_0x00e6
            if (r0 == 0) goto L_0x00de
        L_0x00e6:
            android.util.ArrayMap r0 = r12.f13448J
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0101
            android.util.ArrayMap r0 = r12.f13448J
            java.util.Set r0 = r0.keySet()
            java.util.Iterator r0 = r0.iterator()
            java.lang.Object r0 = r0.next()
            androidx.slice.a.a r0 = (androidx.slice.p194a.C4094a) r0
            r12.f13472e = r0
            goto L_0x011d
        L_0x0101:
            android.util.ArrayMap r0 = r12.f13449K
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x011d
            android.util.ArrayMap r0 = r12.f13449K
            int r0 = r0.size()
            if (r0 != r10) goto L_0x011d
            android.util.ArrayMap r0 = r12.f13449K
            java.lang.Object r0 = r0.valueAt(r3)
            androidx.slice.widget.ab r0 = (androidx.slice.widget.C4124ab) r0
            androidx.slice.a.a r0 = r0.f13222b
            r12.f13472e = r0
        L_0x011d:
            android.widget.LinearLayout r0 = r12.f13439A
            r12.m11944x(r0, r10)
            r0 = 1
        L_0x0123:
            androidx.slice.a.a r1 = r12.f13472e
            if (r1 == 0) goto L_0x0135
            if (r0 != 0) goto L_0x0135
            java.util.Set r0 = r12.f13462a
            androidx.slice.SliceItem r1 = r1.f13113h
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0135
            r12.f13469b = r10
        L_0x0135:
            android.widget.LinearLayout r0 = r12.f13439A
            boolean r1 = r0.isClickable()
            if (r10 == r1) goto L_0x013e
            r3 = 2
        L_0x013e:
            androidx.core.p098j.C2043bi.m5551ae(r0, r3)
        L_0x0141:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.widget.C4168x.m11945y():void");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v3, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v4, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v5, resolved type: android.widget.TextView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: android.widget.ImageView} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v9, resolved type: android.widget.TextView} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: z */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean m11946z(androidx.slice.SliceItem r9, int r10, boolean r11) {
        /*
            r8 = this;
            if (r11 == 0) goto L_0x0005
            android.widget.LinearLayout r0 = r8.f13440B
            goto L_0x0007
        L_0x0005:
            android.widget.LinearLayout r0 = r8.f13450L
        L_0x0007:
            java.lang.String r1 = "slice"
            java.lang.String r2 = r9.f13092b
            boolean r1 = r1.equals(r2)
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x001d
            java.lang.String r1 = "action"
            java.lang.String r4 = r9.f13092b
            boolean r1 = r1.equals(r4)
            if (r1 == 0) goto L_0x0051
        L_0x001d:
            java.lang.String[] r1 = r9.f13091a
            java.lang.String r4 = "shortcut"
            boolean r1 = androidx.slice.C4093a.m11737a(r1, r4)
            if (r1 == 0) goto L_0x0030
            androidx.slice.a.a r1 = new androidx.slice.a.a
            r1.<init>(r9)
            r8.m11938r(r1, r10, r0, r11)
            return r2
        L_0x0030:
            androidx.slice.Slice r11 = r9.mo8596d()
            androidx.slice.SliceItem[] r11 = r11.f13088d
            java.util.List r11 = java.util.Arrays.asList(r11)
            int r11 = r11.size()
            if (r11 != 0) goto L_0x0041
            return r3
        L_0x0041:
            androidx.slice.Slice r9 = r9.mo8596d()
            androidx.slice.SliceItem[] r9 = r9.f13088d
            java.util.List r9 = java.util.Arrays.asList(r9)
            java.lang.Object r9 = r9.get(r3)
            androidx.slice.SliceItem r9 = (androidx.slice.SliceItem) r9
        L_0x0051:
            java.lang.String r11 = "image"
            java.lang.String r1 = r9.f13092b
            boolean r11 = r11.equals(r1)
            r1 = 0
            if (r11 == 0) goto L_0x0062
            java.lang.Object r11 = r9.f13094d
            androidx.core.graphics.drawable.IconCompat r11 = (androidx.core.graphics.drawable.IconCompat) r11
            r4 = r1
            goto L_0x0071
        L_0x0062:
            java.lang.String r11 = "long"
            java.lang.String r4 = r9.f13092b
            boolean r11 = r11.equals(r4)
            if (r11 == 0) goto L_0x006f
            r4 = r9
            r11 = r1
            goto L_0x0071
        L_0x006f:
            r11 = r1
            r4 = r11
        L_0x0071:
            if (r11 == 0) goto L_0x012f
            java.lang.String[] r1 = r9.f13091a
            java.lang.String r4 = "no_tint"
            boolean r1 = androidx.slice.C4093a.m11737a(r1, r4)
            r1 = r1 ^ r2
            java.lang.String[] r4 = r9.f13091a
            java.lang.String r5 = "raw"
            boolean r4 = androidx.slice.C4093a.m11737a(r4, r5)
            android.content.res.Resources r5 = r8.getResources()
            android.util.DisplayMetrics r5 = r5.getDisplayMetrics()
            float r5 = r5.density
            android.widget.ImageView r6 = new android.widget.ImageView
            android.content.Context r7 = r8.getContext()
            r6.<init>(r7)
            android.content.Context r7 = r8.getContext()
            android.graphics.drawable.Drawable r11 = r11.mo5075d(r7)
            androidx.slice.widget.ao r7 = r8.f13265x
            if (r7 == 0) goto L_0x00c0
            boolean r7 = r7.mo8720f()
            if (r7 == 0) goto L_0x00c0
            java.lang.String[] r9 = r9.f13091a
            java.lang.String r7 = "large"
            boolean r9 = androidx.slice.C4093a.m11737a(r9, r7)
            if (r9 == 0) goto L_0x00c0
            androidx.slice.b r9 = new androidx.slice.b
            androidx.slice.widget.ao r7 = r8.f13265x
            float r7 = r7.f13313s
            r9.<init>(r11, r7)
            r6.setImageDrawable(r9)
            goto L_0x00c3
        L_0x00c0:
            r6.setImageDrawable(r11)
        L_0x00c3:
            r9 = -1
            if (r1 == 0) goto L_0x00cb
            if (r10 == r9) goto L_0x00cb
            r6.setColorFilter(r10)
        L_0x00cb:
            boolean r10 = r8.f13474g
            if (r10 == 0) goto L_0x00d6
            r0.removeAllViews()
            r0.addView(r6)
            goto L_0x00d9
        L_0x00d6:
            r0.addView(r6)
        L_0x00d9:
            androidx.slice.widget.q r10 = r8.f13266y
            if (r10 == 0) goto L_0x00ed
            int r0 = r10.f13421s
            if (r0 > 0) goto L_0x00e3
            int r0 = r8.f13465ac
        L_0x00e3:
            r8.f13465ac = r0
            int r10 = r10.f13423u
            if (r10 > 0) goto L_0x00eb
            int r10 = r8.f13464ab
        L_0x00eb:
            r8.f13464ab = r10
        L_0x00ed:
            android.view.ViewGroup$LayoutParams r10 = r6.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r10 = (android.widget.LinearLayout.LayoutParams) r10
            if (r4 == 0) goto L_0x0100
            int r0 = r11.getIntrinsicWidth()
            float r0 = (float) r0
            float r0 = r0 / r5
            int r0 = java.lang.Math.round(r0)
            goto L_0x0102
        L_0x0100:
            int r0 = r8.f13464ab
        L_0x0102:
            r10.width = r0
            if (r4 == 0) goto L_0x0111
            int r11 = r11.getIntrinsicHeight()
            float r11 = (float) r11
            float r11 = r11 / r5
            int r11 = java.lang.Math.round(r11)
            goto L_0x0113
        L_0x0111:
            int r11 = r8.f13464ab
        L_0x0113:
            r10.height = r11
            r6.setLayoutParams(r10)
            if (r1 == 0) goto L_0x0129
            int r10 = r8.f13464ab
            if (r10 != r9) goto L_0x0123
            int r9 = r8.f13465ac
            int r9 = r9 / 2
            goto L_0x012a
        L_0x0123:
            int r9 = r8.f13465ac
            int r10 = r10 - r9
            int r9 = r10 / 2
            goto L_0x012a
        L_0x0129:
            r9 = 0
        L_0x012a:
            r6.setPadding(r9, r9, r9, r9)
            r1 = r6
            goto L_0x015f
        L_0x012f:
            if (r4 == 0) goto L_0x015f
            android.widget.TextView r1 = new android.widget.TextView
            android.content.Context r10 = r8.getContext()
            r1.<init>(r10)
            android.content.Context r10 = r8.getContext()
            long r4 = r9.mo8594b()
            java.lang.CharSequence r9 = androidx.slice.widget.C4144av.m11884d(r10, r4)
            r1.setText(r9)
            androidx.slice.widget.ao r9 = r8.f13265x
            if (r9 == 0) goto L_0x015c
            int r9 = r9.f13302h
            float r9 = (float) r9
            r1.setTextSize(r3, r9)
            androidx.slice.widget.q r9 = r8.f13266y
            int r9 = r9.mo8753a()
            r1.setTextColor(r9)
        L_0x015c:
            r0.addView(r1)
        L_0x015f:
            if (r1 == 0) goto L_0x0162
            return r2
        L_0x0162:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.widget.C4168x.m11946z(androidx.slice.SliceItem, int, boolean):boolean");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo8764a() {
        if (this.f13459U != null) {
            try {
                this.f13477j = System.currentTimeMillis();
                this.f13459U.mo8599g(getContext(), new Intent().addFlags(268435456).putExtra("android.app.slice.extra.RANGE_VALUE", this.f13478k));
                C4141as asVar = this.f13256o;
                if (asVar != null) {
                    C4147c cVar = new C4147c(mo8706fy(), 2, 4, this.f13470c);
                    cVar.f13344h = this.f13478k;
                    asVar.mo8726b(cVar, this.f13459U);
                }
            } catch (PendingIntent.CanceledException e) {
                Log.e("RowView", "PendingIntent for slice cannot be sent", e);
            }
        }
    }

    /* renamed from: f */
    public final void mo8642f() {
        this.f13471d = null;
        this.f13462a.clear();
        m11943w();
    }

    /* renamed from: fr */
    public final void mo8699fr(boolean z) {
        this.f13458T = z;
        if (this.f13471d != null) {
            m11942v(true);
        }
    }

    /* renamed from: fs */
    public final void mo8700fs(long j) {
        this.f13259r = j;
        C4160p pVar = this.f13471d;
        if (pVar != null) {
            SliceItem sliceItem = pVar.f13390b;
            boolean z = false;
            if (sliceItem != null && TextUtils.isEmpty(sliceItem.mo8597e())) {
                z = true;
            }
            m11939s(z);
        }
    }

    /* renamed from: ft */
    public final void mo8701ft(Set set) {
        if (set == null) {
            this.f13462a.clear();
            this.f13469b = false;
        } else {
            this.f13462a = set;
        }
        m11945y();
        mo8765l();
    }

    /* renamed from: fu */
    public final void mo8702fu(boolean z) {
        this.f13258q = z;
        if (this.f13471d != null) {
            m11942v(true);
        }
    }

    /* renamed from: fv */
    public final void mo8703fv(List list) {
        this.f13457S = list;
        if (this.f13471d != null) {
            m11945y();
        }
    }

    /* renamed from: fw */
    public final void mo8704fw(C4137ao aoVar, C4161q qVar) {
        C4161q qVar2;
        this.f13265x = aoVar;
        this.f13266y = qVar;
        if (this.f13265x != null && (qVar2 = this.f13266y) != null) {
            m11935A(this.f13440B, qVar2.f13403a, qVar2.f13404b);
            LinearLayout linearLayout = this.f13441C;
            C4161q qVar3 = this.f13266y;
            m11935A(linearLayout, qVar3.f13405c, qVar3.f13406d);
            TextView textView = this.f13443E;
            C4161q qVar4 = this.f13266y;
            m11935A(textView, qVar4.f13407e, qVar4.f13408f);
            LinearLayout linearLayout2 = this.f13442D;
            C4161q qVar5 = this.f13266y;
            m11935A(linearLayout2, qVar5.f13409g, qVar5.f13410h);
            LinearLayout linearLayout3 = this.f13450L;
            C4161q qVar6 = this.f13266y;
            m11935A(linearLayout3, qVar6.f13411i, qVar6.f13412j);
            View view = this.f13446H;
            C4161q qVar7 = this.f13266y;
            int i = qVar7.f13413k;
            int i2 = qVar7.f13414l;
            boolean z = false;
            if (i < 0 && i2 < 0) {
                z = true;
            }
            if (view != null && !z) {
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                if (i >= 0) {
                    marginLayoutParams.setMarginStart(i);
                }
                if (i2 >= 0) {
                    marginLayoutParams.setMarginEnd(i2);
                }
                view.setLayoutParams(marginLayoutParams);
            }
            View view2 = this.f13447I;
            int i3 = this.f13266y.f13415m;
            if (view2 != null && i3 >= 0) {
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                layoutParams.height = i3;
                view2.setLayoutParams(layoutParams);
            }
            if (this.f13266y.mo8754b() != -1) {
                mo8645i(this.f13266y.mo8754b());
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x0040, code lost:
        if (r2 != false) goto L_0x0044;
     */
    /* renamed from: fz */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8643fz(androidx.slice.widget.C4130ah r4, boolean r5, int r6, int r7, androidx.slice.widget.C4141as r8) {
        /*
            r3 = this;
            r3.mo8709p(r8)
            androidx.slice.widget.p r7 = r3.f13471d
            r8 = 0
            if (r7 == 0) goto L_0x0043
            boolean r7 = r7.mo8711d()
            if (r7 == 0) goto L_0x0043
            androidx.slice.widget.p r7 = r3.f13471d
            if (r7 == 0) goto L_0x001a
            androidx.slice.k r0 = new androidx.slice.k
            androidx.slice.SliceItem r7 = r7.f13268m
            r0.<init>((androidx.slice.SliceItem) r7)
            goto L_0x001b
        L_0x001a:
            r0 = 0
        L_0x001b:
            androidx.slice.k r7 = new androidx.slice.k
            androidx.slice.SliceItem r1 = r4.f13268m
            androidx.slice.Slice r1 = r1.mo8596d()
            r7.<init>((androidx.slice.Slice) r1)
            r1 = 1
            if (r0 == 0) goto L_0x0031
            boolean r2 = r0.equals(r7)
            if (r2 == 0) goto L_0x0031
            r2 = 1
            goto L_0x0032
        L_0x0031:
            r2 = 0
        L_0x0032:
            if (r0 == 0) goto L_0x0043
            android.net.Uri r0 = r0.f13148a
            if (r0 == 0) goto L_0x0043
            android.net.Uri r7 = r7.f13148a
            boolean r7 = r0.equals(r7)
            if (r7 == 0) goto L_0x0043
            if (r2 == 0) goto L_0x0043
            goto L_0x0044
        L_0x0043:
            r1 = 0
        L_0x0044:
            r3.f13469b = r8
            r3.f13456R = r5
            androidx.slice.widget.p r4 = (androidx.slice.widget.C4160p) r4
            r3.f13471d = r4
            r3.f13470c = r6
            r3.m11942v(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.widget.C4168x.mo8643fz(androidx.slice.widget.ah, boolean, int, int, androidx.slice.widget.as):void");
    }

    /* renamed from: g */
    public final void mo8644g(int i, int i2, int i3, int i4) {
        super.mo8644g(i, i2, i3, i4);
        setPadding(i, i2, i3, i4);
    }

    /* renamed from: i */
    public final void mo8645i(int i) {
        this.f13257p = i;
        if (this.f13471d != null) {
            m11942v(true);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public final void mo8765l() {
        this.f13454P.setVisibility(true != this.f13469b ? 8 : 0);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onClick(android.view.View r7) {
        /*
            r6 = this;
            androidx.slice.a.a r0 = r6.f13472e
            if (r0 == 0) goto L_0x00f5
            androidx.slice.SliceItem r1 = r0.f13106a
            if (r1 != 0) goto L_0x000a
            goto L_0x00f5
        L_0x000a:
            java.lang.String r0 = r0.mo8606c()
            r1 = 0
            if (r0 == 0) goto L_0x0070
            androidx.slice.a.a r0 = r6.f13472e
            java.lang.String r0 = r0.mo8606c()
            int r2 = r0.hashCode()
            r3 = -868304044(0xffffffffcc3ebb54, float:-4.9999184E7)
            r4 = 2
            r5 = 1
            if (r2 == r3) goto L_0x0041
            r3 = 759128640(0x2d3f6240, float:1.0878909E-11)
            if (r2 == r3) goto L_0x0037
            r3 = 1250407999(0x4a87b63f, float:4447007.5)
            if (r2 == r3) goto L_0x002d
            goto L_0x004b
        L_0x002d:
            java.lang.String r2 = "date_picker"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x004b
            r0 = 1
            goto L_0x004c
        L_0x0037:
            java.lang.String r2 = "time_picker"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x004b
            r0 = 2
            goto L_0x004c
        L_0x0041:
            java.lang.String r2 = "toggle"
            boolean r0 = r0.equals(r2)
            if (r0 == 0) goto L_0x004b
            r0 = 0
            goto L_0x004c
        L_0x004b:
            r0 = -1
        L_0x004c:
            if (r0 == 0) goto L_0x0065
            if (r0 == r5) goto L_0x0061
            if (r0 == r4) goto L_0x005d
            android.util.ArrayMap r0 = r6.f13449K
            androidx.slice.a.a r2 = r6.f13472e
            java.lang.Object r0 = r0.get(r2)
            androidx.slice.widget.ab r0 = (androidx.slice.widget.C4124ab) r0
            goto L_0x007a
        L_0x005d:
            r6.m11941u(r1)
            return
        L_0x0061:
            r6.m11941u(r5)
            return
        L_0x0065:
            android.util.ArrayMap r0 = r6.f13448J
            androidx.slice.a.a r2 = r6.f13472e
            java.lang.Object r0 = r0.get(r2)
            androidx.slice.widget.ab r0 = (androidx.slice.widget.C4124ab) r0
            goto L_0x007a
        L_0x0070:
            android.util.ArrayMap r0 = r6.f13449K
            androidx.slice.a.a r2 = r6.f13472e
            java.lang.Object r0 = r0.get(r2)
            androidx.slice.widget.ab r0 = (androidx.slice.widget.C4124ab) r0
        L_0x007a:
            if (r0 == 0) goto L_0x009f
            boolean r7 = r7 instanceof androidx.slice.widget.C4124ab
            if (r7 != 0) goto L_0x009f
            androidx.slice.a.a r7 = r0.f13222b
            if (r7 != 0) goto L_0x0085
            goto L_0x009a
        L_0x0085:
            boolean r1 = r7.mo8607d()
            if (r1 == 0) goto L_0x009b
            android.view.View r0 = r0.f13223c
            if (r0 == 0) goto L_0x009a
            boolean r7 = r7.mo8607d()
            if (r7 == 0) goto L_0x009a
            android.widget.Checkable r0 = (android.widget.Checkable) r0
            r0.toggle()
        L_0x009a:
            return
        L_0x009b:
            r0.mo8687a()
            return
        L_0x009f:
            androidx.slice.widget.p r7 = r6.f13471d
            boolean r7 = r7.f13396h
            if (r7 == 0) goto L_0x00a9
            r6.performClick()
            return
        L_0x00a9:
            androidx.slice.a.a r7 = r6.f13472e     // Catch:{ CanceledException -> 0x00ed }
            androidx.slice.SliceItem r7 = r7.f13106a     // Catch:{ CanceledException -> 0x00ed }
            android.content.Context r0 = r6.getContext()     // Catch:{ CanceledException -> 0x00ed }
            r2 = 0
            boolean r7 = r7.mo8599g(r0, r2)     // Catch:{ CanceledException -> 0x00ed }
            r6.f13469b = r7     // Catch:{ CanceledException -> 0x00ed }
            androidx.slice.widget.as r7 = r6.f13256o     // Catch:{ CanceledException -> 0x00ed }
            if (r7 == 0) goto L_0x00cf
            androidx.slice.widget.c r0 = new androidx.slice.widget.c     // Catch:{ CanceledException -> 0x00ed }
            int r2 = r6.mo8706fy()     // Catch:{ CanceledException -> 0x00ed }
            int r3 = r6.f13470c     // Catch:{ CanceledException -> 0x00ed }
            r4 = 3
            r0.<init>(r2, r4, r1, r3)     // Catch:{ CanceledException -> 0x00ed }
            androidx.slice.a.a r1 = r6.f13472e     // Catch:{ CanceledException -> 0x00ed }
            androidx.slice.SliceItem r1 = r1.f13113h     // Catch:{ CanceledException -> 0x00ed }
            r7.mo8726b(r0, r1)     // Catch:{ CanceledException -> 0x00ed }
        L_0x00cf:
            boolean r7 = r6.f13469b     // Catch:{ CanceledException -> 0x00ed }
            if (r7 == 0) goto L_0x00e9
            androidx.slice.widget.aa r7 = r6.f13264w     // Catch:{ CanceledException -> 0x00ed }
            if (r7 == 0) goto L_0x00e9
            androidx.slice.a.a r0 = r6.f13472e     // Catch:{ CanceledException -> 0x00ed }
            androidx.slice.SliceItem r0 = r0.f13113h     // Catch:{ CanceledException -> 0x00ed }
            int r1 = r6.f13470c     // Catch:{ CanceledException -> 0x00ed }
            r7.mo8686a(r0, r1)     // Catch:{ CanceledException -> 0x00ed }
            java.util.Set r7 = r6.f13462a     // Catch:{ CanceledException -> 0x00ed }
            androidx.slice.a.a r0 = r6.f13472e     // Catch:{ CanceledException -> 0x00ed }
            androidx.slice.SliceItem r0 = r0.f13113h     // Catch:{ CanceledException -> 0x00ed }
            r7.add(r0)     // Catch:{ CanceledException -> 0x00ed }
        L_0x00e9:
            r6.mo8765l()     // Catch:{ CanceledException -> 0x00ed }
            return
        L_0x00ed:
            r7 = move-exception
            java.lang.String r0 = "RowView"
            java.lang.String r1 = "PendingIntent for slice cannot be sent"
            android.util.Log.e(r0, r1, r7)
        L_0x00f5:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.slice.widget.C4168x.onClick(android.view.View):void");
    }

    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        if (this.f13460V != null && adapterView == this.f13455Q && i >= 0 && i < this.f13461W.size()) {
            C4141as asVar = this.f13256o;
            if (asVar != null) {
                asVar.mo8726b(new C4147c(mo8706fy(), 5, 6, this.f13470c), this.f13460V);
            }
            try {
                if (this.f13460V.mo8599g(getContext(), new Intent().addFlags(268435456).putExtra("android.app.slice.extra.SELECTION", (String) this.f13461W.get(i)))) {
                    this.f13469b = true;
                    C4123aa aaVar = this.f13264w;
                    if (aaVar != null) {
                        aaVar.mo8686a(this.f13472e.f13113h, this.f13470c);
                        this.f13462a.add(this.f13472e.f13113h);
                    }
                    mo8765l();
                }
            } catch (PendingIntent.CanceledException e) {
                Log.e("RowView", "PendingIntent for slice cannot be sent", e);
            }
        }
    }

    /* access modifiers changed from: protected */
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int paddingLeft = getPaddingLeft();
        LinearLayout linearLayout = this.f13439A;
        linearLayout.layout(paddingLeft, this.f13261t, linearLayout.getMeasuredWidth() + paddingLeft, m11937q() + this.f13261t);
        if (this.f13452N != null && this.f13473f == null) {
            int q = m11937q() + ((this.f13265x.f13310p - this.f13466ad) / 2) + this.f13261t;
            int i5 = this.f13466ad;
            View view = this.f13452N;
            view.layout(paddingLeft, q, view.getMeasuredWidth() + paddingLeft, i5 + q);
        } else if (this.f13455Q != null) {
            int q2 = m11937q() + this.f13261t;
            int measuredHeight = this.f13455Q.getMeasuredHeight();
            Spinner spinner = this.f13455Q;
            spinner.layout(paddingLeft, q2, spinner.getMeasuredWidth() + paddingLeft, measuredHeight + q2);
        }
    }

    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        int i3;
        int q = m11937q();
        if (q != 0) {
            this.f13439A.setVisibility(0);
            m11940t(this.f13439A, i, q);
            i3 = this.f13439A.getMeasuredWidth();
        } else {
            this.f13439A.setVisibility(8);
            i3 = 0;
        }
        View view = this.f13452N;
        if (view == null || this.f13473f != null) {
            Spinner spinner = this.f13455Q;
            if (spinner != null) {
                m11940t(spinner, i, this.f13265x.f13311q);
                i3 = Math.max(i3, this.f13455Q.getMeasuredWidth());
            }
        } else {
            m11940t(view, i, this.f13265x.f13310p);
            this.f13466ad = this.f13452N.getMeasuredHeight();
            i3 = Math.max(i3, this.f13452N.getMeasuredWidth());
        }
        int max = Math.max(i3 + this.f13260s + this.f13262u, getSuggestedMinimumWidth());
        C4160p pVar = this.f13471d;
        setMeasuredDimension(resolveSizeAndState(max, i, 0), (pVar != null ? this.f13265x.mo8718d(pVar, this.f13267z) : 0) + this.f13261t + this.f13263v);
    }

    public final void onNothingSelected(AdapterView adapterView) {
    }
}
