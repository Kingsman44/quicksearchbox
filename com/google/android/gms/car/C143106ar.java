package com.google.android.gms.car;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p031v4.app.C0172ar;
import android.support.p031v4.app.Fragment;
import android.support.p031v4.app.FragmentManager;
import android.util.AttributeSet;
import android.view.View;
import androidx.lifecycle.C2382m;
import androidx.lifecycle.C2383n;
import androidx.lifecycle.C2393x;

/* renamed from: com.google.android.gms.car.ar */
/* compiled from: PG */
public class C143106ar extends CarComponentActivity {

    /* renamed from: i */
    final C2393x f388173i = new C2393x(this);

    /* renamed from: j */
    public C0172ar f388174j;

    /* renamed from: k */
    boolean f388175k;

    /* renamed from: l */
    boolean f388176l;

    /* renamed from: m */
    boolean f388177m = true;

    /* renamed from: j */
    private static String mo17288j(View view) {
        String str;
        StringBuilder sb = new StringBuilder(128);
        sb.append(view.getClass().getName());
        sb.append('{');
        sb.append(Integer.toHexString(System.identityHashCode(view)));
        sb.append(' ');
        int visibility = view.getVisibility();
        char c = 'V';
        char c2 = '.';
        if (visibility == 0) {
            sb.append('V');
        } else if (visibility == 4) {
            sb.append('I');
        } else if (visibility != 8) {
            sb.append('.');
        } else {
            sb.append('G');
        }
        char c3 = 'F';
        sb.append(true != view.isFocusable() ? '.' : 'F');
        sb.append(true != view.isEnabled() ? '.' : 'E');
        sb.append(true != view.willNotDraw() ? 'D' : '.');
        sb.append(true != view.isHorizontalScrollBarEnabled() ? '.' : 'H');
        if (true != view.isVerticalScrollBarEnabled()) {
            c = '.';
        }
        sb.append(c);
        sb.append(true != view.isClickable() ? '.' : 'C');
        sb.append(true != view.isLongClickable() ? '.' : 'L');
        sb.append(' ');
        if (true != view.isFocused()) {
            c3 = '.';
        }
        sb.append(c3);
        sb.append(true != view.isSelected() ? '.' : 'S');
        if (true == view.isPressed()) {
            c2 = 'P';
        }
        sb.append(c2);
        sb.append(' ');
        sb.append(view.getLeft());
        sb.append(',');
        sb.append(view.getTop());
        sb.append('-');
        sb.append(view.getRight());
        sb.append(',');
        sb.append(view.getBottom());
        int id = view.getId();
        if (id != -1) {
            sb.append(" #");
            sb.append(Integer.toHexString(id));
            Resources resources = view.getResources();
            if (!(id == 0 || resources == null)) {
                int i = -16777216 & id;
                if (i == 16777216) {
                    str = "android";
                } else if (i != 2130706432) {
                    try {
                        str = resources.getResourcePackageName(id);
                    } catch (Resources.NotFoundException unused) {
                    }
                } else {
                    str = "app";
                }
                String resourceTypeName = resources.getResourceTypeName(id);
                String resourceEntryName = resources.getResourceEntryName(id);
                sb.append(" ");
                sb.append(str);
                sb.append(":");
                sb.append(resourceTypeName);
                sb.append("/");
                sb.append(resourceEntryName);
            }
        }
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: l */
    private final void mo17290l() {
        do {
        } while (m232150q(this.f388174j.f739a.f744e, C2383n.CREATED));
    }

    /* renamed from: q */
    private static boolean m232150q(FragmentManager fragmentManager, C2383n nVar) {
        boolean z = false;
        for (Fragment fragment : fragmentManager.f634a.mo677i()) {
            if (fragment != null) {
                if (fragment.getHost() != null) {
                    z |= m232150q(fragment.getChildFragmentManager(), nVar);
                }
                if (fragment.getLifecycle().mo5789a().mo5788a(C2383n.STARTED)) {
                    ((C2393x) fragment.getLifecycle()).mo5795g(nVar);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: C */
    public final void mo118013C() {
        this.f388174j.mo578i();
    }

    /* renamed from: D */
    public final void mo118014D() {
        this.f388173i.mo5793e(C2382m.ON_RESUME);
        this.f388174j.mo580k();
    }

    /* renamed from: E */
    public final void mo118015E(Context context) {
        attachBaseContext(context);
        this.f388174j = C0172ar.m374b(new C143105aq(this, this));
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0017, code lost:
        r6 = (android.view.ViewGroup) r6;
     */
    /* renamed from: M */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo118045M(java.lang.String r4, java.io.PrintWriter r5, android.view.View r6) {
        /*
            r3 = this;
            r5.print(r4)
            if (r6 != 0) goto L_0x000b
            java.lang.String r4 = "null"
            r5.println(r4)
            return
        L_0x000b:
            java.lang.String r0 = mo17288j(r6)
            r5.println(r0)
            boolean r0 = r6 instanceof android.view.ViewGroup
            if (r0 != 0) goto L_0x0017
            return
        L_0x0017:
            android.view.ViewGroup r6 = (android.view.ViewGroup) r6
            int r0 = r6.getChildCount()
            if (r0 > 0) goto L_0x0020
            return
        L_0x0020:
            java.lang.String r1 = "  "
            java.lang.String r4 = r4.concat(r1)
            r1 = 0
        L_0x0027:
            if (r1 >= r0) goto L_0x0033
            android.view.View r2 = r6.getChildAt(r1)
            r3.mo118045M(r4, r5, r2)
            int r1 = r1 + 1
            goto L_0x0027
        L_0x0033:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.car.C143106ar.mo118045M(java.lang.String, java.io.PrintWriter, android.view.View):void");
    }

    /* renamed from: b */
    public void mo17281b(Configuration configuration) {
        this.f388174j.mo583n();
        this.f388174j.mo575f(configuration);
    }

    /* renamed from: c */
    public void mo17282c(Bundle bundle) {
        if (getBaseContext() != null) {
            this.f388174j.mo573d((Fragment) null);
            if (mo118024t().getFactory() == null) {
                mo118024t().setFactory(this);
            }
            if (bundle != null) {
                this.f388174j.mo584o(bundle.getParcelable("android:support:fragments"));
            }
            super.mo17282c(bundle);
            this.f388173i.mo5793e(C2382m.ON_CREATE);
            this.f388174j.mo576g();
            return;
        }
        throw new IllegalStateException("Context not attached to CarActivity");
    }

    /* renamed from: f */
    public void mo17284f(Bundle bundle) {
        super.mo17284f(bundle);
        mo17290l();
        this.f388173i.mo5793e(C2382m.ON_STOP);
        Parcelable a = this.f388174j.mo571a();
        if (a != null) {
            bundle.putParcelable("android:support:fragments", a);
        }
    }

    /* renamed from: g */
    public void mo17285g() {
        super.mo117888L(C2382m.ON_START);
        this.f388177m = false;
        if (!this.f388175k) {
            this.f388175k = true;
            this.f388174j.mo574e();
        }
        this.f388174j.mo583n();
        this.f388174j.mo585p();
        this.f388173i.mo5793e(C2382m.ON_START);
        this.f388174j.mo581l();
    }

    /* renamed from: h */
    public void mo17286h() {
        super.mo117888L(C2382m.ON_STOP);
        this.f388177m = true;
        mo17290l();
        this.f388174j.mo582m();
        this.f388173i.mo5793e(C2382m.ON_STOP);
    }

    /* renamed from: m */
    public void mo19990m() {
        super.mo117888L(C2382m.ON_DESTROY);
        this.f388174j.mo577h();
        this.f388173i.mo5793e(C2382m.ON_DESTROY);
    }

    /* renamed from: n */
    public void mo19991n(Intent intent) {
        this.f388174j.mo583n();
    }

    /* renamed from: o */
    public void mo19992o() {
        super.mo117888L(C2382m.ON_PAUSE);
        this.f388176l = false;
        this.f388174j.mo579j();
        this.f388173i.mo5793e(C2382m.ON_PAUSE);
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View c = this.f388174j.mo572c((View) null, str, context, attributeSet);
        if (c == null) {
            return null;
        }
        return c;
    }

    /* renamed from: p */
    public void mo19993p() {
        super.mo117888L(C2382m.ON_RESUME);
        this.f388176l = true;
        this.f388174j.mo583n();
        this.f388174j.mo585p();
    }
}
