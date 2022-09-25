package com.google.android.libraries.onegoogle.account.policyfooter;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.widget.C1756o;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.p097i.C1978m;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.onegoogle.account.p2345a.C30156a;
import com.google.android.libraries.onegoogle.common.C30901aa;
import com.google.android.libraries.onegoogle.common.C30906af;
import com.google.android.libraries.onegoogle.common.C30922i;
import com.google.android.libraries.onegoogle.common.C30938y;
import com.google.android.libraries.onegoogle.p2380c.C30860b;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30872ae;
import com.google.android.libraries.onegoogle.p2380c.p2382b.C30897z;
import com.google.android.material.button.MaterialButton;
import com.google.common.base.C58838bb;
import com.google.protos.p4868ao.p4869a.p4870a.C63644b;
import java.util.ArrayList;

/* compiled from: PG */
public final class PolicyFooterView extends ConstraintLayout implements C30872ae {

    /* renamed from: a */
    public final MaterialButton f81743a;

    /* renamed from: b */
    public final MaterialButton f81744b;

    /* renamed from: c */
    public final MaterialButton f81745c;

    /* renamed from: d */
    public final ImageView f81746d;

    /* renamed from: e */
    public final ImageView f81747e;

    /* renamed from: f */
    public final int f81748f;

    /* renamed from: g */
    public C30860b f81749g;

    /* renamed from: h */
    public C63644b f81750h;

    /* renamed from: i */
    public C1978m f81751i;

    /* renamed from: j */
    public C30897z f81752j;

    /* renamed from: k */
    private final ArrayList f81753k;

    /* renamed from: l */
    private C30248h f81754l;

    /* renamed from: m */
    private C30922i f81755m;

    public PolicyFooterView(Context context) {
        this(context, (AttributeSet) null);
    }

    /* renamed from: g */
    public static void m56209g(MaterialButton materialButton) {
        materialButton.setMaxLines(3);
        materialButton.setEllipsize((TextUtils.TruncateAt) null);
    }

    /* renamed from: h */
    public static void m56210h(MaterialButton materialButton) {
        materialButton.setMaxLines(1);
        materialButton.setEllipsize(TextUtils.TruncateAt.END);
    }

    /* renamed from: i */
    public static void m56211i(ImageView imageView, int i) {
        ((ViewGroup.MarginLayoutParams) imageView.getLayoutParams()).setMargins(i, 0, i, 0);
    }

    /* renamed from: j */
    private final View.OnClickListener m56212j(C30156a aVar, int i) {
        C30901aa aaVar = new C30901aa(new C30247g(this, i, aVar));
        aaVar.f83316d = this.f81755m.mo35755b();
        aaVar.f83317e = this.f81755m.mo35754a();
        return new C30938y(aaVar);
    }

    /* renamed from: a */
    public final void mo35728a(int[][] iArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int[][] iArr2 = iArr;
        C1756o oVar = new C1756o();
        oVar.mo4889i(this);
        int i5 = 0;
        while (true) {
            if (i5 >= r11) {
                break;
            }
            if (i5 == 0) {
                i3 = 0;
            } else {
                i3 = iArr2[i5 - 1][0];
            }
            if (i5 == r11 - 1) {
                i4 = 0;
            } else {
                i4 = iArr2[i5 + 1][0];
            }
            int i6 = iArr2[i5][0];
            oVar.mo4892l(i6, 3, i3, i3 == 0 ? 3 : 4, 0);
            oVar.mo4892l(i6, 4, i4, i4 == 0 ? 4 : 3, 0);
            if (i3 != 0) {
                oVar.mo4892l(i3, 4, i6, 3, 0);
            }
            if (i4 != 0) {
                oVar.mo4892l(i4, 3, i6, 4, 0);
            }
            i5++;
        }
        for (int[] iArr3 : iArr2) {
            int i7 = 0;
            while (true) {
                int length = iArr3.length;
                if (i7 >= length) {
                    break;
                }
                if (i7 == 0) {
                    i = 0;
                } else {
                    i = iArr3[i7 - 1];
                }
                if (i7 == length - 1) {
                    i2 = 0;
                } else {
                    i2 = iArr3[i7 + 1];
                }
                int i8 = iArr3[i7];
                oVar.mo4892l(i8, 6, i, i == 0 ? 6 : 7, 0);
                oVar.mo4892l(i8, 7, i2, i2 == 0 ? 7 : 6, 0);
                if (i != 0) {
                    oVar.mo4892l(i, 7, i8, 6, 0);
                }
                if (i2 != 0) {
                    oVar.mo4892l(i2, 6, i8, 7, 0);
                }
                if (i7 > 0) {
                    oVar.mo4891k(iArr3[i7], 3, iArr3[0], 3);
                    oVar.mo4891k(iArr3[i7], 4, iArr3[0], 4);
                }
                i7++;
            }
        }
        oVar.mo4888h(this);
    }

    /* renamed from: b */
    public final void mo35630b(C30897z zVar) {
        zVar.mo35823c(this.f81743a, 90532);
        zVar.mo35823c(this.f81744b, 90533);
        zVar.mo35823c(this.f81745c, 90534);
    }

    /* renamed from: c */
    public final void mo35729c(C30246f fVar) {
        this.f81749g = fVar.mo35744e();
        this.f81750h = fVar.mo35750i();
        this.f81752j = fVar.mo35746f();
        this.f81751i = fVar.mo35740a();
        this.f81755m = fVar.mo35743d();
        this.f81753k.clear();
        this.f81743a.setOnClickListener(m56212j(fVar.mo35741b(), 18));
        this.f81744b.setOnClickListener(m56212j(fVar.mo35742c(), 19));
        if (fVar.mo35747g().mo56113h()) {
            C58838bb.m90868c(fVar.mo35748h().mo56113h());
            this.f81745c.setText(((Integer) fVar.mo35748h().mo56107c()).intValue());
            this.f81745c.setOnClickListener(m56212j((C30156a) fVar.mo35747g().mo56107c(), 22));
            this.f81747e.setVisibility(0);
            this.f81745c.setVisibility(0);
            m56211i(this.f81746d, 0);
            mo35731f(8388613, 1, 8388611);
            this.f81753k.add(new C30250j(this));
            this.f81753k.add(new C30249i(this));
        }
        this.f81753k.add(new C30251k(this));
        this.f81754l = new C30248h(this);
        mo35630b(this.f81752j);
    }

    /* renamed from: e */
    public final void mo35730e(int i) {
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(0, 0), i);
    }

    /* renamed from: f */
    public final void mo35731f(int i, int i2, int i3) {
        this.f81743a.setGravity(i | 16);
        this.f81744b.setGravity(i2 | 16);
        this.f81745c.setGravity(i3 | 16);
    }

    /* renamed from: lk */
    public final void mo35632lk(C30897z zVar) {
        zVar.mo35825e(this.f81743a);
        zVar.mo35825e(this.f81744b);
        zVar.mo35825e(this.f81745c);
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: protected */
    public final void onMeasure(int i, int i2) {
        try {
            if (this.f81754l != null) {
                while (true) {
                    if (this.f81753k.isEmpty()) {
                        break;
                    }
                    this.f81754l.mo35759b(i2);
                    if (getMeasuredWidth() <= View.MeasureSpec.getSize(i)) {
                        break;
                    }
                    C30248h hVar = (C30248h) this.f81753k.remove(0);
                    this.f81754l = hVar;
                    hVar.mo35758a();
                }
                C30248h hVar2 = this.f81754l;
                if (hVar2 != null) {
                    hVar2.mo35758a();
                }
                super.onMeasure(i, i2);
                return;
            }
            super.onMeasure(i, i2);
        } catch (Throwable th) {
            C30248h hVar3 = this.f81754l;
            if (hVar3 != null) {
                hVar3.mo35758a();
            }
            super.onMeasure(i, i2);
            throw th;
        }
    }

    /* JADX INFO: finally extract failed */
    public PolicyFooterView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f81753k = new ArrayList();
        LayoutInflater.from(context).inflate(R.layout.policy_footer, this);
        MaterialButton materialButton = (MaterialButton) findViewById(R.id.og_privacy_policy_button);
        this.f81743a = materialButton;
        MaterialButton materialButton2 = (MaterialButton) findViewById(R.id.og_tos_button);
        this.f81744b = materialButton2;
        MaterialButton materialButton3 = (MaterialButton) findViewById(R.id.og_custom_button);
        this.f81745c = materialButton3;
        this.f81746d = (ImageView) findViewById(R.id.og_separator1);
        this.f81747e = (ImageView) findViewById(R.id.og_separator2);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C30252l.f81782a, R.attr.ogPolicyFooterStyle, 2132149630);
        try {
            ColorStateList a = C30906af.m57697a(context, obtainStyledAttributes, 0);
            materialButton.mo47554k(a);
            materialButton2.mo47554k(a);
            materialButton3.mo47554k(a);
            obtainStyledAttributes.recycle();
            this.f81748f = getResources().getDimensionPixelSize(R.dimen.og_footer_added_separator_margin);
        } catch (Throwable th) {
            obtainStyledAttributes.recycle();
            throw th;
        }
    }
}
