package com.google.android.material.navigation;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.support.p033v7.view.menu.C0454ah;
import android.support.p033v7.view.menu.C0477q;
import android.support.p033v7.view.menu.C0480t;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.core.content.C1882h;
import androidx.core.p097i.C1971f;
import androidx.core.p097i.C1973h;
import androidx.core.p098j.C2043bi;
import androidx.core.p098j.p099a.C1989i;
import androidx.core.p098j.p099a.C1991k;
import androidx.p197u.C4202am;
import androidx.p197u.C4216b;
import com.google.android.googlequicksearchbox.R;
import com.google.android.material.badge.C44536a;
import com.google.android.material.internal.C44731bc;
import com.google.android.material.p3504a.C44497b;
import com.google.android.material.p3510g.C44688a;
import com.google.android.material.p3512i.C44693c;
import com.google.android.material.p3515l.C44779j;
import com.google.android.material.p3515l.C44785p;
import java.util.HashSet;

/* renamed from: com.google.android.material.navigation.i */
/* compiled from: PG */
public abstract class C44822i extends ViewGroup implements C0454ah {

    /* renamed from: a */
    private static final int[] f116927a = {16842912};

    /* renamed from: y */
    private static final int[] f116928y = {-16842910};

    /* renamed from: A */
    private final C1971f f116929A = new C1973h(5);

    /* renamed from: B */
    private final SparseArray f116930B = new SparseArray(5);

    /* renamed from: C */
    private ColorStateList f116931C;

    /* renamed from: D */
    private final ColorStateList f116932D = mo48234g();

    /* renamed from: b */
    public final C4202am f116933b;

    /* renamed from: c */
    public int f116934c;

    /* renamed from: d */
    public C44819f[] f116935d;

    /* renamed from: e */
    public int f116936e = 0;

    /* renamed from: f */
    public int f116937f = 0;

    /* renamed from: g */
    public int f116938g;

    /* renamed from: h */
    public ColorStateList f116939h;

    /* renamed from: i */
    public int f116940i;

    /* renamed from: j */
    public int f116941j;

    /* renamed from: k */
    public ColorStateList f116942k;

    /* renamed from: l */
    public int f116943l;

    /* renamed from: m */
    public final SparseArray f116944m = new SparseArray(5);

    /* renamed from: n */
    public int f116945n = -1;

    /* renamed from: o */
    public int f116946o = -1;

    /* renamed from: p */
    public boolean f116947p;

    /* renamed from: q */
    public int f116948q;

    /* renamed from: r */
    public int f116949r;

    /* renamed from: s */
    public int f116950s;

    /* renamed from: t */
    public C44785p f116951t;

    /* renamed from: u */
    public boolean f116952u = false;

    /* renamed from: v */
    public ColorStateList f116953v;

    /* renamed from: w */
    public NavigationBarPresenter f116954w;

    /* renamed from: x */
    public C0477q f116955x;

    /* renamed from: z */
    private final View.OnClickListener f116956z;

    public C44822i(Context context) {
        super(context);
        if (isInEditMode()) {
            this.f116933b = null;
        } else {
            C4216b bVar = new C4216b();
            this.f116933b = bVar;
            bVar.mo8905I(0);
            bVar.mo8872D((long) C44693c.m79225a(getContext(), R.attr.motionDurationLong1, getResources().getInteger(R.integer.material_motion_duration_long_1)));
            bVar.mo8873E(C44688a.m79217a(getContext(), R.attr.motionEasingStandard, C44497b.f115651b));
            bVar.mo8908f(new C44731bc());
        }
        this.f116956z = new C44821h(this);
        C2043bi.m5551ae(this, 1);
    }

    /* renamed from: a */
    public final void mo1454a(C0477q qVar) {
        this.f116955x = qVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract C44819f mo47501b(Context context);

    /* renamed from: c */
    public final Drawable mo48230c() {
        if (this.f116951t == null || this.f116953v == null) {
            return null;
        }
        C44779j jVar = new C44779j(this.f116951t);
        jVar.mo48124V(this.f116953v);
        return jVar;
    }

    /* renamed from: d */
    public final void mo48231d() {
        C44536a aVar;
        removeAllViews();
        C44819f[] fVarArr = this.f116935d;
        if (fVarArr != null) {
            for (C44819f fVar : fVarArr) {
                if (fVar != null) {
                    this.f116929A.mo5127b(fVar);
                    fVar.mo48228z(fVar.f116904d);
                    fVar.f116905e = null;
                    fVar.f116906f = 0.0f;
                    fVar.f116901a = false;
                }
            }
        }
        if (this.f116955x.f1652c.size() != 0) {
            HashSet hashSet = new HashSet();
            for (int i = 0; i < this.f116955x.f1652c.size(); i++) {
                hashSet.add(Integer.valueOf(this.f116955x.getItem(i).getItemId()));
            }
            for (int i2 = 0; i2 < this.f116944m.size(); i2++) {
                int keyAt = this.f116944m.keyAt(i2);
                if (!hashSet.contains(Integer.valueOf(keyAt))) {
                    this.f116944m.delete(keyAt);
                }
            }
            this.f116935d = new C44819f[this.f116955x.f1652c.size()];
            boolean f = mo48233f(this.f116934c, this.f116955x.mo1654e().size());
            for (int i3 = 0; i3 < this.f116955x.f1652c.size(); i3++) {
                this.f116954w.f116859b = true;
                this.f116955x.getItem(i3).setCheckable(true);
                this.f116954w.f116859b = false;
                C44819f fVar2 = (C44819f) this.f116929A.mo5126a();
                if (fVar2 == null) {
                    fVar2 = mo47501b(getContext());
                }
                this.f116935d[i3] = fVar2;
                fVar2.mo48218q(this.f116931C);
                fVar2.mo48217p(this.f116938g);
                fVar2.mo48227y(this.f116932D);
                fVar2.mo48226x(this.f116940i);
                fVar2.mo48225w(this.f116941j);
                fVar2.mo48227y(this.f116939h);
                int i4 = this.f116945n;
                if (i4 != -1) {
                    fVar2.mo48222t(i4);
                }
                int i5 = this.f116946o;
                if (i5 != -1) {
                    fVar2.mo48220s(i5);
                }
                fVar2.mo48211m(this.f116948q);
                fVar2.mo48208j(this.f116949r);
                fVar2.mo48209k(this.f116950s);
                fVar2.mo48206h(mo48230c());
                fVar2.f116907g = this.f116952u;
                fVar2.mo48207i(this.f116947p);
                fVar2.mo48219r(this.f116943l);
                fVar2.f116902b = this.f116942k;
                fVar2.mo48203g();
                fVar2.mo48224v(f);
                fVar2.mo48223u(this.f116934c);
                C0480t tVar = (C0480t) this.f116955x.getItem(i3);
                fVar2.mo1446f(tVar);
                int i6 = tVar.f1682a;
                fVar2.setOnTouchListener((View.OnTouchListener) this.f116930B.get(i6));
                fVar2.setOnClickListener(this.f116956z);
                int i7 = this.f116936e;
                if (i7 != 0 && i6 == i7) {
                    this.f116937f = i3;
                }
                int id = fVar2.getId();
                if (!(id == -1 || (aVar = (C44536a) this.f116944m.get(id)) == null)) {
                    fVar2.mo48212n(aVar);
                }
                addView(fVar2);
            }
            int min = Math.min(this.f116955x.f1652c.size() - 1, this.f116937f);
            this.f116937f = min;
            this.f116955x.getItem(min).setChecked(true);
            return;
        }
        this.f116936e = 0;
        this.f116937f = 0;
        this.f116935d = null;
    }

    /* renamed from: e */
    public final void mo48232e(ColorStateList colorStateList) {
        this.f116931C = colorStateList;
        C44819f[] fVarArr = this.f116935d;
        if (fVarArr != null) {
            for (C44819f q : fVarArr) {
                q.mo48218q(colorStateList);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final boolean mo48233f(int i, int i2) {
        return i == -1 ? i2 > 3 : i == 0;
    }

    /* renamed from: g */
    public final ColorStateList mo48234g() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(16842808, typedValue, true)) {
            return null;
        }
        ColorStateList d = C1882h.m5138d(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = d.getDefaultColor();
        int[] iArr = f116928y;
        return new ColorStateList(new int[][]{iArr, f116927a, EMPTY_STATE_SET}, new int[]{d.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        new C1991k(accessibilityNodeInfo).mo5154c(C1989i.m5331a(1, this.f116955x.mo1654e().size(), false, 1));
    }
}
