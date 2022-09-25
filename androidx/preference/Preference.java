package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p033v7.widget.C0640fb;
import android.support.p033v7.widget.C0678gm;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.AbsSavedState;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.p091b.C1875x;
import com.google.android.apps.gsa.staticplugins.settings.C117309af;
import com.google.android.apps.gsa.staticplugins.settings.C117329t;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4522b.C58724pq;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

/* compiled from: PG */
public class Preference implements Comparable {

    /* renamed from: A */
    public boolean f12715A;

    /* renamed from: B */
    public boolean f12716B;

    /* renamed from: C */
    public boolean f12717C;

    /* renamed from: D */
    public int f12718D;

    /* renamed from: E */
    public int f12719E;

    /* renamed from: F */
    public C4022r f12720F;

    /* renamed from: G */
    public PreferenceGroup f12721G;

    /* renamed from: H */
    public C4026v f12722H;

    /* renamed from: I */
    private boolean f12723I;

    /* renamed from: J */
    private boolean f12724J;

    /* renamed from: K */
    private List f12725K;

    /* renamed from: L */
    private boolean f12726L;

    /* renamed from: M */
    private C4025u f12727M;

    /* renamed from: N */
    private final View.OnClickListener f12728N;

    /* renamed from: Ze */
    private boolean f12729Ze;

    /* renamed from: Zf */
    private boolean f12730Zf;

    /* renamed from: Zg */
    private boolean f12731Zg;

    /* renamed from: a */
    private CharSequence f12732a;

    /* renamed from: b */
    private Bundle f12733b;

    /* renamed from: f */
    private boolean f12734f;

    /* renamed from: g */
    private boolean f12735g;

    /* renamed from: h */
    private boolean f12736h;

    /* renamed from: i */
    private boolean f12737i;

    /* renamed from: j */
    public final Context f12738j;

    /* renamed from: k */
    public C3995au f12739k;

    /* renamed from: l */
    public long f12740l;

    /* renamed from: m */
    public boolean f12741m;

    /* renamed from: n */
    public C4023s f12742n;

    /* renamed from: o */
    public C4024t f12743o;

    /* renamed from: p */
    public int f12744p;

    /* renamed from: q */
    public CharSequence f12745q;

    /* renamed from: r */
    public int f12746r;

    /* renamed from: s */
    public Drawable f12747s;

    /* renamed from: t */
    public String f12748t;

    /* renamed from: u */
    public Intent f12749u;

    /* renamed from: v */
    public String f12750v;

    /* renamed from: w */
    public boolean f12751w;

    /* renamed from: x */
    public String f12752x;

    /* renamed from: y */
    public Object f12753y;

    /* renamed from: z */
    public boolean f12754z;

    /* compiled from: PG */
    public class BaseSavedState extends AbsSavedState {
        public static final Parcelable.Creator CREATOR = new C4021q();

        public BaseSavedState(Parcel parcel) {
            super(parcel);
        }

        public BaseSavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Preference(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: j */
    private final void m11375j(View view, boolean z) {
        view.setEnabled(z);
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            while (true) {
                childCount--;
                if (childCount >= 0) {
                    m11375j(viewGroup.getChildAt(childCount), z);
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: A */
    public void mo8334A() {
        mo8338E();
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public final void mo8335B(C3995au auVar) {
        this.f12739k = auVar;
        if (!this.f12741m) {
            this.f12740l = auVar.mo8428a();
        }
        if (mo8367s() != null) {
            mo8358Y(this.f12753y);
            return;
        }
        if (mo8355V()) {
            C3995au auVar2 = this.f12739k;
            if (((auVar2 == null || mo8367s() != null) ? null : auVar2.mo8430c()).contains(this.f12748t)) {
                mo8358Y((Object) null);
                return;
            }
        }
        Object obj = this.f12753y;
        if (obj != null) {
            mo8358Y(obj);
        }
    }

    /* renamed from: C */
    public void mo8336C() {
        mo8350Q();
    }

    /* renamed from: D */
    public final void mo8337D() {
        Intent intent;
        C3994at atVar;
        if (mo8354U() && this.f12730Zf) {
            mo8315c();
            C4024t tVar = this.f12743o;
            if (tVar == null || !tVar.mo8421b(this)) {
                C3995au auVar = this.f12739k;
                if ((auVar == null || (atVar = auVar.f12835g) == null || !atVar.mo8414k(this)) && (intent = this.f12749u) != null) {
                    this.f12738j.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: E */
    public final void mo8338E() {
        if (!TextUtils.isEmpty(this.f12752x)) {
            Preference r = mo8366r(this.f12752x);
            if (r != null) {
                if (r.f12725K == null) {
                    r.f12725K = new ArrayList();
                }
                r.f12725K.add(this);
                mo8356W(r.mo8324k());
                return;
            }
            throw new IllegalStateException("Dependency \"" + this.f12752x + "\" not found for preference \"" + this.f12748t + "\" (title: \"" + this.f12745q + "\"");
        }
    }

    /* renamed from: F */
    public final void mo8339F(boolean z) {
        if (this.f12729Ze != z) {
            this.f12729Ze = z;
            mo8374y(mo8324k());
            mo8317e();
        }
    }

    /* renamed from: G */
    public final void mo8340G(int i) {
        mo8341H(C0678gm.m2375e().mo3100c(this.f12738j, i));
        this.f12746r = i;
    }

    /* renamed from: H */
    public final void mo8341H(Drawable drawable) {
        if (this.f12747s != drawable) {
            this.f12747s = drawable;
            this.f12746r = 0;
            mo8317e();
        }
    }

    /* renamed from: I */
    public final void mo8342I(boolean z) {
        if (this.f12723I != z) {
            this.f12723I = z;
            mo8317e();
        }
    }

    /* renamed from: J */
    public final void mo8343J(String str) {
        this.f12748t = str;
        if (this.f12731Zg && !mo8353T()) {
            if (!TextUtils.isEmpty(this.f12748t)) {
                this.f12731Zg = true;
                return;
            }
            throw new IllegalStateException("Preference does not have a key assigned.");
        }
    }

    /* renamed from: K */
    public final void mo8344K(int i) {
        if (i != this.f12744p) {
            this.f12744p = i;
            mo8375z();
        }
    }

    /* renamed from: L */
    public void mo8345L(int i) {
        mo8329n(this.f12738j.getString(i));
    }

    /* renamed from: M */
    public final void mo8346M(int i) {
        mo8347N(this.f12738j.getString(i));
    }

    /* renamed from: N */
    public final void mo8347N(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f12745q)) {
            this.f12745q = charSequence;
            mo8317e();
        }
    }

    /* renamed from: O */
    public final void mo8348O(boolean z) {
        if (this.f12754z != z) {
            this.f12754z = z;
            C4022r rVar = this.f12720F;
            if (rVar != null) {
                ((C3990ap) rVar).mo8424a();
            }
        }
    }

    /* renamed from: P */
    public final void mo8349P(SharedPreferences.Editor editor) {
        if (!this.f12739k.f12832d) {
            editor.apply();
        }
    }

    /* renamed from: Q */
    public final void mo8350Q() {
        Preference r;
        List list;
        String str = this.f12752x;
        if (str != null && (r = mo8366r(str)) != null && (list = r.f12725K) != null) {
            list.remove(this);
        }
    }

    /* renamed from: R */
    public boolean mo8351R(Object obj) {
        C4023s sVar = this.f12742n;
        return sVar == null || sVar.mo8472a(this, obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: S */
    public final boolean mo8352S(boolean z) {
        if (!mo8355V()) {
            return z;
        }
        C4028x s = mo8367s();
        if (s == null) {
            return this.f12739k.mo8430c().getBoolean(this.f12748t, z);
        }
        String str = this.f12748t;
        C117309af afVar = (C117309af) s;
        SharedPreferences sharedPreferences = afVar.f325645a;
        C58485gu guVar = afVar.f325646b.f325667a;
        int i = ((C58724pq) guVar).f156474d;
        int i2 = 0;
        while (true) {
            if (i2 >= i) {
                break;
            }
            C117329t tVar = (C117329t) guVar.get(i2);
            i2++;
            if (tVar.f325686a.equals(str)) {
                z = tVar.mo103261a();
                break;
            }
        }
        return sharedPreferences.getBoolean(str, z);
    }

    /* renamed from: T */
    public final boolean mo8353T() {
        return !TextUtils.isEmpty(this.f12748t);
    }

    /* renamed from: U */
    public boolean mo8354U() {
        return this.f12729Ze && this.f12734f && this.f12735g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: V */
    public final boolean mo8355V() {
        return this.f12739k != null && this.f12751w && mo8353T();
    }

    /* renamed from: W */
    public final void mo8356W(boolean z) {
        if (this.f12734f == z) {
            this.f12734f = !z;
            mo8374y(mo8324k());
            mo8317e();
        }
    }

    /* renamed from: X */
    public final void mo8357X(boolean z) {
        if (this.f12735g == z) {
            this.f12735g = !z;
            mo8374y(mo8324k());
            mo8317e();
        }
    }

    /* access modifiers changed from: protected */
    @Deprecated
    /* renamed from: Y */
    public void mo8358Y(Object obj) {
        mo8322i(obj);
    }

    /* access modifiers changed from: protected */
    /* renamed from: Z */
    public final void mo8359Z(String str) {
        if (mo8355V() && !TextUtils.equals(str, mo8368t((String) null))) {
            C4028x s = mo8367s();
            if (s != null) {
                ((C117309af) s).f325645a.edit().putString(this.f12748t, str).apply();
                return;
            }
            SharedPreferences.Editor b = this.f12739k.mo8429b();
            b.putString(this.f12748t, str);
            mo8349P(b);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00a0  */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00a4  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00d6  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00de  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0102  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0105  */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x0041  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo8313a(androidx.preference.C3998ax r11) {
        /*
            r10 = this;
            android.view.View r0 = r11.itemView
            android.view.View$OnClickListener r1 = r10.f12728N
            r0.setOnClickListener(r1)
            r1 = 0
            r0.setId(r1)
            r2 = 16908304(0x1020010, float:2.3877274E-38)
            android.view.View r2 = r11.mo8435a(r2)
            android.widget.TextView r2 = (android.widget.TextView) r2
            r3 = 8
            r4 = 0
            if (r2 == 0) goto L_0x0035
            java.lang.CharSequence r5 = r10.mo8328m()
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 != 0) goto L_0x0032
            r2.setText(r5)
            r2.setVisibility(r1)
            int r2 = r2.getCurrentTextColor()
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            goto L_0x0036
        L_0x0032:
            r2.setVisibility(r3)
        L_0x0035:
            r2 = r4
        L_0x0036:
            r5 = 16908310(0x1020016, float:2.387729E-38)
            android.view.View r5 = r11.mo8435a(r5)
            android.widget.TextView r5 = (android.widget.TextView) r5
            if (r5 == 0) goto L_0x006f
            java.lang.CharSequence r6 = r10.f12745q
            boolean r7 = android.text.TextUtils.isEmpty(r6)
            if (r7 != 0) goto L_0x006c
            r5.setText(r6)
            r5.setVisibility(r1)
            boolean r6 = r10.f12715A
            if (r6 == 0) goto L_0x0058
            boolean r6 = r10.f12716B
            r5.setSingleLine(r6)
        L_0x0058:
            boolean r6 = r10.f12730Zf
            if (r6 != 0) goto L_0x006f
            boolean r6 = r10.mo8354U()
            if (r6 == 0) goto L_0x006f
            if (r2 == 0) goto L_0x006f
            int r2 = r2.intValue()
            r5.setTextColor(r2)
            goto L_0x006f
        L_0x006c:
            r5.setVisibility(r3)
        L_0x006f:
            r2 = 16908294(0x1020006, float:2.3877246E-38)
            android.view.View r2 = r11.mo8435a(r2)
            android.widget.ImageView r2 = (android.widget.ImageView) r2
            r5 = 4
            r6 = 1
            if (r2 == 0) goto L_0x00af
            int r7 = r10.f12746r
            if (r7 != 0) goto L_0x0085
            android.graphics.drawable.Drawable r7 = r10.f12747s
            if (r7 == 0) goto L_0x009c
            r7 = 0
        L_0x0085:
            android.graphics.drawable.Drawable r8 = r10.f12747s
            if (r8 != 0) goto L_0x0095
            android.content.Context r8 = r10.f12738j
            android.support.v7.widget.gm r9 = android.support.p033v7.widget.C0678gm.m2375e()
            android.graphics.drawable.Drawable r7 = r9.mo3100c(r8, r7)
            r10.f12747s = r7
        L_0x0095:
            android.graphics.drawable.Drawable r7 = r10.f12747s
            if (r7 == 0) goto L_0x009c
            r2.setImageDrawable(r7)
        L_0x009c:
            android.graphics.drawable.Drawable r7 = r10.f12747s
            if (r7 == 0) goto L_0x00a4
            r2.setVisibility(r1)
            goto L_0x00af
        L_0x00a4:
            boolean r7 = r10.f12723I
            if (r6 == r7) goto L_0x00ab
            r7 = 8
            goto L_0x00ac
        L_0x00ab:
            r7 = 4
        L_0x00ac:
            r2.setVisibility(r7)
        L_0x00af:
            r2 = 2131432341(0x7f0b1395, float:1.8486437E38)
            android.view.View r2 = r11.mo8435a(r2)
            if (r2 != 0) goto L_0x00bf
            r2 = 16908350(0x102003e, float:2.3877403E-38)
            android.view.View r2 = r11.mo8435a(r2)
        L_0x00bf:
            if (r2 == 0) goto L_0x00d2
            android.graphics.drawable.Drawable r7 = r10.f12747s
            if (r7 == 0) goto L_0x00c9
            r2.setVisibility(r1)
            goto L_0x00d2
        L_0x00c9:
            boolean r1 = r10.f12723I
            if (r6 == r1) goto L_0x00ce
            goto L_0x00cf
        L_0x00ce:
            r3 = 4
        L_0x00cf:
            r2.setVisibility(r3)
        L_0x00d2:
            boolean r1 = r10.f12724J
            if (r1 == 0) goto L_0x00de
            boolean r1 = r10.mo8354U()
            r10.m11375j(r0, r1)
            goto L_0x00e1
        L_0x00de:
            r10.m11375j(r0, r6)
        L_0x00e1:
            boolean r1 = r10.f12730Zf
            r0.setFocusable(r1)
            r0.setClickable(r1)
            boolean r2 = r10.f12736h
            r11.f12846c = r2
            boolean r2 = r10.f12737i
            r11.f12847d = r2
            boolean r11 = r10.f12717C
            if (r11 == 0) goto L_0x0100
            androidx.preference.u r2 = r10.f12727M
            if (r2 != 0) goto L_0x0100
            androidx.preference.u r2 = new androidx.preference.u
            r2.<init>(r10)
            r10.f12727M = r2
        L_0x0100:
            if (r11 == 0) goto L_0x0105
            androidx.preference.u r2 = r10.f12727M
            goto L_0x0106
        L_0x0105:
            r2 = r4
        L_0x0106:
            r0.setOnCreateContextMenuListener(r2)
            r0.setLongClickable(r11)
            if (r11 == 0) goto L_0x0113
            if (r1 != 0) goto L_0x0113
            androidx.core.p098j.C2043bi.m5530X(r0, r4)
        L_0x0113:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.preference.Preference.mo8313a(androidx.preference.ax):void");
    }

    /* renamed from: aa */
    public final void mo8360aa() {
        if (this.f12730Zf) {
            this.f12730Zf = false;
            mo8317e();
        }
    }

    /* renamed from: ab */
    public final void mo8361ab() {
        if (!this.f12724J) {
            this.f12724J = true;
            mo8317e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo8314b(View view) {
        mo8337D();
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public void mo8315c() {
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        Preference preference = (Preference) obj;
        int i = this.f12744p;
        int i2 = preference.f12744p;
        if (i != i2) {
            return i - i2;
        }
        CharSequence charSequence = this.f12745q;
        CharSequence charSequence2 = preference.f12745q;
        if (charSequence == charSequence2) {
            return 0;
        }
        if (charSequence == null) {
            return 1;
        }
        if (charSequence2 == null) {
            return -1;
        }
        return charSequence.toString().compareToIgnoreCase(preference.f12745q.toString());
    }

    /* renamed from: e */
    public void mo8317e() {
        int indexOf;
        C4022r rVar = this.f12720F;
        if (rVar != null && (indexOf = ((C3990ap) rVar).f12820a.indexOf(this)) != -1) {
            ((C0640fb) rVar).notifyItemChanged(indexOf, this);
        }
    }

    /* renamed from: fn */
    public long mo8363fn() {
        return this.f12740l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: fo */
    public Parcelable mo8319fo() {
        this.f12726L = true;
        return BaseSavedState.EMPTY_STATE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public Object mo8320g(TypedArray typedArray, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo8321h(Parcelable parcelable) {
        this.f12726L = true;
        if (parcelable != BaseSavedState.EMPTY_STATE && parcelable != null) {
            throw new IllegalArgumentException("Wrong state class -- expecting Preference State");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo8322i(Object obj) {
    }

    /* renamed from: k */
    public boolean mo8324k() {
        return !mo8354U();
    }

    /* renamed from: m */
    public CharSequence mo8328m() {
        C4026v vVar = this.f12722H;
        return vVar != null ? vVar.mo8450a(this) : this.f12732a;
    }

    /* renamed from: n */
    public void mo8329n(CharSequence charSequence) {
        if (this.f12722H != null) {
            throw new IllegalStateException("Preference already has a SummaryProvider set.");
        } else if (!TextUtils.equals(this.f12732a, charSequence)) {
            this.f12732a = charSequence;
            mo8317e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final int mo8364p(int i) {
        if (!mo8355V()) {
            return i;
        }
        C4028x s = mo8367s();
        if (s == null) {
            return this.f12739k.mo8430c().getInt(this.f12748t, i);
        }
        return ((C117309af) s).f325645a.getInt(this.f12748t, i);
    }

    /* renamed from: q */
    public final Bundle mo8365q() {
        if (this.f12733b == null) {
            this.f12733b = new Bundle();
        }
        return this.f12733b;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public final Preference mo8366r(String str) {
        C3995au auVar = this.f12739k;
        if (auVar == null) {
            return null;
        }
        return auVar.mo8431d(str);
    }

    /* renamed from: s */
    public final C4028x mo8367s() {
        C3995au auVar = this.f12739k;
        if (auVar != null) {
            return auVar.f12831c;
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final String mo8368t(String str) {
        if (!mo8355V()) {
            return str;
        }
        C4028x s = mo8367s();
        if (s == null) {
            return this.f12739k.mo8430c().getString(this.f12748t, str);
        }
        return ((C117309af) s).f325645a.getString(this.f12748t, str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        CharSequence charSequence = this.f12745q;
        if (!TextUtils.isEmpty(charSequence)) {
            sb.append(charSequence);
            sb.append(' ');
        }
        CharSequence m = mo8328m();
        if (!TextUtils.isEmpty(m)) {
            sb.append(m);
            sb.append(' ');
        }
        if (sb.length() > 0) {
            sb.setLength(sb.length() - 1);
        }
        return sb.toString();
    }

    /* renamed from: u */
    public final Set mo8370u(Set set) {
        if (!mo8355V()) {
            return set;
        }
        C4028x s = mo8367s();
        if (s == null) {
            return this.f12739k.mo8430c().getStringSet(this.f12748t, set);
        }
        return ((C117309af) s).f325645a.getStringSet(this.f12748t, set);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: v */
    public final void mo8371v(PreferenceGroup preferenceGroup) {
        if (preferenceGroup == null || this.f12721G == null) {
            this.f12721G = preferenceGroup;
            return;
        }
        throw new IllegalStateException("This preference already has a parent. You must remove the existing parent before assigning a new one.");
    }

    /* renamed from: w */
    public void mo8372w(Bundle bundle) {
        Parcelable parcelable;
        if (mo8353T() && (parcelable = bundle.getParcelable(this.f12748t)) != null) {
            this.f12726L = false;
            mo8321h(parcelable);
            if (!this.f12726L) {
                throw new IllegalStateException("Derived class did not call super.onRestoreInstanceState()");
            }
        }
    }

    /* renamed from: x */
    public void mo8373x(Bundle bundle) {
        if (mo8353T()) {
            this.f12726L = false;
            Parcelable fo = mo8319fo();
            if (!this.f12726L) {
                throw new IllegalStateException("Derived class did not call super.onSaveInstanceState()");
            } else if (fo != null) {
                bundle.putParcelable(this.f12748t, fo);
            }
        }
    }

    /* renamed from: y */
    public void mo8374y(boolean z) {
        List list = this.f12725K;
        if (list != null) {
            int size = list.size();
            for (int i = 0; i < size; i++) {
                ((Preference) list.get(i)).mo8356W(z);
            }
        }
    }

    /* renamed from: z */
    public final void mo8375z() {
        C4022r rVar = this.f12720F;
        if (rVar != null) {
            rVar.mo8424a();
        }
    }

    public Preference(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C1875x.m5115b(context, R.attr.preferenceStyle, 16842894));
    }

    public Preference(Context context, AttributeSet attributeSet, int i) {
        this(context, attributeSet, i, 0);
    }

    public Preference(Context context, AttributeSet attributeSet, int i, int i2) {
        this.f12744p = Integer.MAX_VALUE;
        this.f12729Ze = true;
        this.f12730Zf = true;
        this.f12751w = true;
        this.f12734f = true;
        this.f12735g = true;
        this.f12754z = true;
        this.f12736h = true;
        this.f12737i = true;
        this.f12716B = true;
        this.f12724J = true;
        this.f12718D = R.layout.preference;
        this.f12728N = new C4020p(this);
        this.f12738j = context;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3999ay.f12855g, i, i2);
        this.f12746r = obtainStyledAttributes.getResourceId(23, obtainStyledAttributes.getResourceId(0, 0));
        this.f12748t = C1875x.m5119f(obtainStyledAttributes, 26, 6);
        this.f12745q = C1875x.m5118e(obtainStyledAttributes, 34, 4);
        this.f12732a = C1875x.m5118e(obtainStyledAttributes, 33, 7);
        this.f12744p = C1875x.m5122i(obtainStyledAttributes, 28, 8);
        this.f12750v = C1875x.m5119f(obtainStyledAttributes, 22, 13);
        this.f12718D = obtainStyledAttributes.getResourceId(27, obtainStyledAttributes.getResourceId(3, R.layout.preference));
        this.f12719E = obtainStyledAttributes.getResourceId(35, obtainStyledAttributes.getResourceId(9, 0));
        this.f12729Ze = obtainStyledAttributes.getBoolean(21, obtainStyledAttributes.getBoolean(2, true));
        this.f12730Zf = obtainStyledAttributes.getBoolean(30, obtainStyledAttributes.getBoolean(5, true));
        this.f12751w = obtainStyledAttributes.getBoolean(29, obtainStyledAttributes.getBoolean(1, true));
        this.f12752x = C1875x.m5119f(obtainStyledAttributes, 19, 10);
        this.f12736h = obtainStyledAttributes.getBoolean(16, obtainStyledAttributes.getBoolean(16, this.f12730Zf));
        this.f12737i = obtainStyledAttributes.getBoolean(17, obtainStyledAttributes.getBoolean(17, this.f12730Zf));
        if (obtainStyledAttributes.hasValue(18)) {
            this.f12753y = mo8320g(obtainStyledAttributes, 18);
        } else if (obtainStyledAttributes.hasValue(11)) {
            this.f12753y = mo8320g(obtainStyledAttributes, 11);
        }
        this.f12724J = obtainStyledAttributes.getBoolean(31, obtainStyledAttributes.getBoolean(12, true));
        boolean hasValue = obtainStyledAttributes.hasValue(32);
        this.f12715A = hasValue;
        if (hasValue) {
            this.f12716B = obtainStyledAttributes.getBoolean(32, obtainStyledAttributes.getBoolean(14, true));
        }
        this.f12723I = obtainStyledAttributes.getBoolean(24, obtainStyledAttributes.getBoolean(15, false));
        this.f12754z = obtainStyledAttributes.getBoolean(25, obtainStyledAttributes.getBoolean(25, true));
        this.f12717C = obtainStyledAttributes.getBoolean(20, obtainStyledAttributes.getBoolean(20, false));
        obtainStyledAttributes.recycle();
    }
}
