package com.google.android.apps.gsa.staticplugins.opa.samson.charging.p8428d;

import android.content.Context;
import android.graphics.Point;
import android.support.constraint.C0129a;
import android.support.constraint.ConstraintLayout;
import android.support.p033v7.app.C0395p;
import android.support.p033v7.widget.LinearLayoutManager;
import android.text.format.DateFormat;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.android.apps.gsa.assistant.shared.l.e;
import com.google.android.apps.gsa.search.core.p6805i.C86124t;
import com.google.android.apps.gsa.shared.p7066m.C90014bt;
import com.google.android.apps.gsa.shared.p7148ui.p7155g.C90685b;
import com.google.android.apps.gsa.shared.util.p7187ui.C91107f;
import com.google.android.apps.gsa.shared.util.p7187ui.C91115n;
import com.google.android.apps.gsa.staticplugins.opa.samson.shared.C110424k;
import com.google.android.apps.gsa.staticplugins.opa.zerostate.p8636j.C114874f;
import com.google.android.googlequicksearchbox.R;
import com.google.android.libraries.gsa.p1876k.C22871g;
import com.google.android.libraries.logging.C28292j;
import com.google.android.libraries.logging.C28293k;
import com.google.android.libraries.logging.C28295m;
import com.google.common.base.C58869cf;
import com.google.common.base.C58903m;
import com.google.common.p4522b.C58485gu;
import com.google.common.p4526f.C58976aa;
import com.google.common.p4526f.p4527a.C58975e;
import java.util.List;
import org.p5633c.p5634a.C72210d;
import p3186j$.time.Duration;

/* renamed from: com.google.android.apps.gsa.staticplugins.opa.samson.charging.d.n */
/* compiled from: PG */
public final class C110103n implements C110100k {

    /* renamed from: a */
    public final LinearLayout f306766a;

    /* renamed from: b */
    public final DisplayMetrics f306767b;

    /* renamed from: c */
    public final Context f306768c;

    /* renamed from: d */
    final TextView f306769d;

    /* renamed from: e */
    final C110094e f306770e;

    /* renamed from: f */
    final C110424k f306771f;

    /* renamed from: g */
    public final Point f306772g;

    /* renamed from: h */
    public final Point f306773h;

    /* renamed from: i */
    public float f306774i;

    /* renamed from: j */
    public float f306775j;

    /* renamed from: k */
    private final ConstraintLayout f306776k;

    /* renamed from: l */
    private final C22871g f306777l;

    /* renamed from: m */
    private final C86124t f306778m;

    /* renamed from: n */
    private final FrameLayout f306779n;

    /* renamed from: o */
    private final C28293k f306780o;

    public C110103n(LayoutInflater layoutInflater, C22871g gVar, C86124t tVar, C110093d dVar, C0395p pVar) {
        C86124t tVar2 = tVar;
        Point point = new Point();
        this.f306772g = point;
        Point point2 = new Point();
        this.f306773h = point2;
        Context applicationContext = pVar.getApplicationContext();
        this.f306768c = applicationContext;
        this.f306777l = gVar;
        this.f306778m = tVar2;
        ConstraintLayout constraintLayout = (ConstraintLayout) layoutInflater.inflate(R.layout.amb_clock_view, (ViewGroup) null);
        this.f306776k = constraintLayout;
        DisplayMetrics displayMetrics = pVar.getResources().getDisplayMetrics();
        this.f306767b = displayMetrics;
        FrameLayout frameLayout = (FrameLayout) constraintLayout.findViewById(R.id.ambient_opa_logo_container);
        this.f306779n = frameLayout;
        LinearLayout linearLayout = (LinearLayout) constraintLayout.findViewById(R.id.amb_movable_footer);
        this.f306766a = linearLayout;
        ImageView a = dVar.mo98370a(e.an, R.layout.amb_opa_logo_view, 83116);
        frameLayout.addView(a);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams();
        int round = Math.round(C91115n.m148870b((float) ((int) tVar2.mo79743a(C90014bt.f247698m)), applicationContext));
        if (!(marginLayoutParams.leftMargin == round && marginLayoutParams.rightMargin == round)) {
            C58976aa aaVar = C58975e.f156826a;
            int i = marginLayoutParams.leftMargin;
            marginLayoutParams.leftMargin = round;
            marginLayoutParams.rightMargin = round;
            linearLayout.requestLayout();
        }
        point2.x = displayMetrics.widthPixels - linearLayout.getMeasuredWidth();
        point2.y = ((ViewGroup.MarginLayoutParams) linearLayout.getLayoutParams()).bottomMargin - round;
        TextView textView = (TextView) constraintLayout.findViewById(R.id.digital_clock_text);
        this.f306769d = textView;
        textView.setText("          ");
        textView.measure(View.MeasureSpec.makeMeasureSpec(displayMetrics.widthPixels, LinearLayoutManager.INVALID_OFFSET), View.MeasureSpec.makeMeasureSpec(0, 0));
        C110424k kVar = new C110424k((float) tVar2.mo79747m(C90014bt.f247433h), (float) tVar2.mo79747m(C90014bt.f247539j));
        this.f306771f = kVar;
        point.x = (displayMetrics.widthPixels - textView.getMeasuredWidth()) / 2;
        point.y = textView.getPaddingTop();
        C58976aa aaVar2 = C58975e.f156826a;
        kVar.f307802b = ((int) (((float) applicationContext.getResources().getDimensionPixelOffset(R.dimen.digital_clock_view_padding_top)) / displayMetrics.density)) / 2;
        float f = displayMetrics.density;
        int i2 = displayMetrics.widthPixels;
        float f2 = displayMetrics.density;
        int i3 = displayMetrics.heightPixels;
        float f3 = displayMetrics.density;
        int measuredWidth = textView.getMeasuredWidth();
        kVar.mo98662a((int) (((float) i2) / f), (int) (((float) i3) / f2), (int) (((float) measuredWidth) / f3), (int) (((float) (textView.getMeasuredHeight() - point.y)) / displayMetrics.density), C90685b.m148053a(applicationContext), 1);
        C110094e eVar = new C110094e(applicationContext, (AttributeSet) null, kVar);
        this.f306770e = eVar;
        eVar.setId(R.id.analog_clock);
        constraintLayout.addView(eVar, 0);
        linearLayout.addOnLayoutChangeListener(new C110102m(this));
        C28292j jVar = new C28292j(77882);
        jVar.mo33795i(5);
        C28295m.m52919e(constraintLayout, jVar);
        this.f306780o = C28293k.m52907d(jVar, C58485gu.m89846n(C28293k.m52908e(C28295m.m52915a(a), new C28293k[0])));
    }

    /* renamed from: a */
    public final View mo98375a() {
        return this.f306776k;
    }

    /* renamed from: b */
    public final View mo98376b() {
        return this.f306776k.findViewById(R.id.notification_permission_prompt);
    }

    /* renamed from: c */
    public final LinearLayout mo98377c() {
        return (LinearLayout) this.f306776k.findViewById(R.id.notification_container);
    }

    /* renamed from: d */
    public final C28293k mo98378d() {
        return this.f306780o;
    }

    /* renamed from: e */
    public final void mo98379e(Boolean bool) {
        float f;
        float f2;
        boolean booleanValue = bool.booleanValue();
        if (booleanValue) {
            f2 = (((((float) this.f306770e.getHeight()) / 2.0f) + this.f306774i) - ((float) ((C0129a) this.f306769d.getLayoutParams()).topMargin)) - ((float) this.f306769d.getHeight());
            f = 0.0f;
        } else {
            f2 = 0.0f;
            f = 1.0f;
        }
        this.f306769d.animate().setInterpolator(new C91107f(0.0f, 0.0f, 1.0f, 1.0f)).translationY(f2).start();
        this.f306770e.animate().setInterpolator(new C91107f(0.0f, 0.0f, 1.0f, 1.0f)).alpha(f).start();
        this.f306779n.setVisibility(true != booleanValue ? 0 : 8);
    }

    /* renamed from: f */
    public final void mo98380f(long j) {
        this.f306769d.setText(C114874f.m190405e(this.f306768c, new C72210d(j), false, false));
        C110094e eVar = this.f306770e;
        List i = C58869cf.m90936b(new C58903m(':')).mo56155i(DateFormat.format("h:mm:ss", j).toString());
        int parseInt = Integer.parseInt((String) i.get(0));
        long parseInt2 = (long) Integer.parseInt((String) i.get(1));
        long parseInt3 = (long) Integer.parseInt((String) i.get(2));
        eVar.f306739a = (((float) ((Duration.ofHours((long) parseInt).getSeconds() + Duration.ofMinutes(parseInt2).getSeconds()) + parseInt3)) / ((float) Duration.ofHours(12).getSeconds())) * 360.0f;
        eVar.f306740b = (((float) (Duration.ofMinutes(parseInt2).getSeconds() + parseInt3)) / ((float) Duration.ofHours(1).getSeconds())) * 360.0f;
        eVar.invalidate();
        this.f306777l.mo28212l("setNewLayoutPositionForClocks", new C110101l(this));
    }
}
