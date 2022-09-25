package com.google.android.apps.gsa.staticplugins.opa.valyrian.p8601ui;

import android.animation.ValueAnimator;
import android.content.Context;
import android.support.p033v7.widget.LinearLayoutManager;
import android.support.p033v7.widget.RecyclerView;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.p109f.p110a.C2249w;
import androidx.p109f.p110a.C2251y;
import androidx.p109f.p110a.C2252z;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.logger.p7051b.C89849ae;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7066m.C90029ch;
import com.google.android.apps.gsa.shared.p7066m.C90063do;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.opa.tapas.p8572q.C113197da;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.C114071eg;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113982a;
import com.google.android.apps.gsa.staticplugins.opa.valyrian.p8598c.C113989h;
import com.google.android.googlequicksearchbox.R;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import dagger.C68214a;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.valyrian.ui.t */
/* compiled from: PG */
public final class C114150t {

    /* renamed from: a */
    public static final C2249w f316434a = new C114149s();

    /* renamed from: b */
    public final ValyrianDynamicResponseLayerView f316435b;

    /* renamed from: c */
    public final View f316436c;

    /* renamed from: d */
    public final View f316437d;

    /* renamed from: e */
    public View f316438e;

    /* renamed from: f */
    public RecyclerView f316439f;

    /* renamed from: g */
    public final C86124t f316440g;

    /* renamed from: h */
    public final View f316441h;

    /* renamed from: i */
    public final C113989h f316442i;

    /* renamed from: j */
    public final int f316443j;

    /* renamed from: k */
    final C2251y f316444k;

    /* renamed from: l */
    ValueAnimator f316445l;

    /* renamed from: m */
    public boolean f316446m = true;

    /* renamed from: n */
    public int f316447n;

    /* renamed from: o */
    public int f316448o;

    /* renamed from: p */
    public boolean f316449p = false;

    /* renamed from: q */
    public int f316450q = 0;

    /* renamed from: r */
    public final int f316451r;

    /* renamed from: s */
    public boolean f316452s;

    /* renamed from: t */
    public boolean f316453t;

    /* renamed from: u */
    public boolean f316454u = false;

    /* renamed from: v */
    public final C68214a f316455v;

    /* renamed from: w */
    private final View f316456w;

    /* renamed from: x */
    private int f316457x = -1;

    /* renamed from: y */
    private final int f316458y;

    /* renamed from: z */
    private final C113982a f316459z;

    public C114150t(View view, View view2, C113989h hVar, int i, Context context, C86124t tVar, C113982a aVar, C68214a aVar2) {
        this.f316440g = tVar;
        this.f316459z = aVar;
        this.f316447n = i;
        this.f316456w = view;
        this.f316441h = view2;
        ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView = (ValyrianDynamicResponseLayerView) view2.findViewById(R.id.valyrian_chat_ui_root);
        this.f316435b = valyrianDynamicResponseLayerView;
        this.f316437d = view2.findViewById(R.id.opa_search_plate_container);
        this.f316442i = hVar;
        this.f316455v = aVar2;
        this.f316443j = ViewConfiguration.get(valyrianDynamicResponseLayerView.getContext()).getScaledTouchSlop();
        valyrianDynamicResponseLayerView.getClass();
        this.f316436c = valyrianDynamicResponseLayerView.findViewById(R.id.dynamic_response_container);
        this.f316451r = context.getResources().getDimensionPixelSize(R.dimen.drl_finger_tracking_scroll_up_threshold);
        context.getResources().getDimensionPixelSize(R.dimen.drl_finger_tracking_drag_bar_hit_extend_height);
        this.f316458y = (int) (C91115n.m148870b((float) tVar.mo79743a(C90029ch.f248268bb), view2.getContext()) + 0.5f);
        if (tVar.mo79746e(C90014bt.f247787nj)) {
            C2251y yVar = new C2251y(this, f316434a);
            C2252z zVar = new C2252z();
            zVar.mo5596b(0.75f);
            zVar.mo5597c(200.0f);
            yVar.f6330o = zVar;
            yVar.mo5587f(new C114147q(this));
            this.f316444k = yVar;
        } else {
            this.f316444k = null;
        }
        valyrianDynamicResponseLayerView.f316107h = new C114146p(this);
    }

    /* renamed from: k */
    public static boolean m189358k(MotionEvent motionEvent, View view) {
        return view != null && C91115n.m148877i(view, motionEvent);
    }

    /* renamed from: b */
    public final void mo101192b() {
        if (!this.f316453t) {
            this.f316453t = true;
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: c */
    public final /* synthetic */ void mo101193c() {
        C58976aa aaVar = C58975e.f156826a;
        mo101197g();
        ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView = this.f316435b;
        valyrianDynamicResponseLayerView.getClass();
        valyrianDynamicResponseLayerView.f316101b = false;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final /* synthetic */ void mo101194d() {
        C2251y yVar = this.f316444k;
        if (yVar != null && yVar.f6319l) {
            yVar.mo5583b();
        }
        ValueAnimator valueAnimator = this.f316445l;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f316445l.cancel();
        }
    }

    /* renamed from: e */
    public final void mo101195e() {
        ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView;
        if (!this.f316440g.mo79746e(C90014bt.f247785nh)) {
            this.f316448o = this.f316447n;
        } else if (this.f316450q != 2 && (valyrianDynamicResponseLayerView = this.f316435b) != null) {
            this.f316448o = valyrianDynamicResponseLayerView.getHeight();
            C58976aa aaVar = C58975e.f156826a;
        }
    }

    /* renamed from: f */
    public final void mo101196f() {
        if (this.f316435b != null && this.f316436c != null) {
            C58976aa aaVar = C58975e.f156826a;
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView = this.f316435b;
            valyrianDynamicResponseLayerView.getClass();
            valyrianDynamicResponseLayerView.mo101053a(1);
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView2 = this.f316435b;
            valyrianDynamicResponseLayerView2.getClass();
            valyrianDynamicResponseLayerView2.getLayoutParams().height = -2;
            View view = this.f316436c;
            view.getClass();
            view.getLayoutParams().height = -2;
            int i = this.f316458y;
            if (i > 0) {
                this.f316441h.setMinimumHeight(i);
            }
            this.f316441h.getLayoutParams().height = -2;
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView3 = this.f316435b;
            valyrianDynamicResponseLayerView3.getClass();
            valyrianDynamicResponseLayerView3.requestLayout();
        }
    }

    /* renamed from: g */
    public final void mo101197g() {
        int i;
        ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView = this.f316435b;
        valyrianDynamicResponseLayerView.getClass();
        int height = valyrianDynamicResponseLayerView.getHeight();
        double d = (double) (this.f316440g.mo79746e(C90029ch.f248202P) ? this.f316447n : this.f316448o);
        double m = this.f316440g.mo79747m(C90014bt.f247722mX);
        Double.isNaN(d);
        if (height <= ((int) (d * m))) {
            C58976aa aaVar = C58975e.f156826a;
            this.f316459z.mo95167z(C89849ae.OPA_ACTIVITY_DISMISS_DRAG);
            return;
        }
        if (this.f316442i.mo100906dc()) {
            int f = ((C114071eg) this.f316442i).f315859aq.mo101123f();
            if (this.f316442i.mo100909dl()) {
                int i2 = this.f316448o;
                this.f316457x = i2;
                this.f316448o = i2 + f;
            }
            if (!this.f316442i.mo100909dl() && (i = this.f316457x) != -1) {
                this.f316448o = i;
            }
        }
        int min = Math.min(this.f316448o, this.f316447n);
        C58976aa aaVar2 = C58975e.f156826a;
        if (height != min) {
            C2251y yVar = this.f316444k;
            if (yVar != null) {
                yVar.mo5589h((float) height);
                this.f316444k.mo5593i((float) min);
                this.f316444k.mo5585d();
                return;
            }
            this.f316445l = ValueAnimator.ofInt(new int[]{height, min});
            this.f316445l.setDuration((long) ((Math.abs(min - height) * 190) / this.f316447n));
            this.f316445l.addUpdateListener(new C114144n(this));
            this.f316445l.addListener(new C114148r(this));
            this.f316445l.start();
        }
    }

    /* renamed from: h */
    public final void mo101198h(int i) {
        if (this.f316435b != null && this.f316436c != null) {
            C58976aa aaVar = C58975e.f156826a;
            if (i > 0 && this.f316458y > 0) {
                int height = this.f316441h.getHeight() + (i - this.f316435b.getHeight());
                if (height > 0 && height <= this.f316458y) {
                    this.f316441h.setMinimumHeight(height);
                }
                this.f316441h.getLayoutParams().height = height;
            }
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView = this.f316435b;
            valyrianDynamicResponseLayerView.getClass();
            valyrianDynamicResponseLayerView.getLayoutParams().height = i;
            View view = this.f316436c;
            view.getClass();
            view.getLayoutParams().height = i;
            if (mo101201l()) {
                RecyclerView recyclerView = this.f316439f;
                recyclerView.getClass();
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.mLayout;
                linearLayoutManager.getClass();
                linearLayoutManager.setStackFromEnd(true);
            }
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView2 = this.f316435b;
            valyrianDynamicResponseLayerView2.getClass();
            valyrianDynamicResponseLayerView2.requestLayout();
        }
    }

    /* renamed from: i */
    public final boolean mo101199i() {
        return this.f316453t && this.f316450q != 0;
    }

    /* renamed from: j */
    public final boolean mo101200j() {
        ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView = this.f316435b;
        return valyrianDynamicResponseLayerView != null && valyrianDynamicResponseLayerView.mo101054b();
    }

    /* renamed from: l */
    public final boolean mo101201l() {
        if (!this.f316440g.mo79746e(C90063do.f249383cW) || !((C113197da) this.f316455v.mo27525b()).mo99910a()) {
            return false;
        }
        if (this.f316439f == null) {
            this.f316439f = (RecyclerView) this.f316456w.findViewById(R.id.suggestions_container);
        }
        return this.f316439f != null;
    }

    public final String toString() {
        return "maxHeight=" + this.f316447n + " wrapContentHeight=" + this.f316448o + " cancelFingerTracking=" + this.f316449p;
    }

    /* renamed from: a */
    public final void mo101191a(boolean z) {
        this.f316452s = z;
        if (z) {
            ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView = this.f316435b;
            valyrianDynamicResponseLayerView.getClass();
            if (valyrianDynamicResponseLayerView.f316106g == null) {
                valyrianDynamicResponseLayerView.f316106g = new C114145o(this);
                return;
            }
            return;
        }
        ValyrianDynamicResponseLayerView valyrianDynamicResponseLayerView2 = this.f316435b;
        valyrianDynamicResponseLayerView2.getClass();
        if (valyrianDynamicResponseLayerView2.f316106g != null) {
            valyrianDynamicResponseLayerView2.f316106g = null;
            C58976aa aaVar = C58975e.f156826a;
        }
    }
}
