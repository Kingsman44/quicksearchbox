package com.google.android.libraries.componentview.components.base;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.view.View;
import androidx.core.p098j.C2043bi;
import com.google.android.apps.gsa.shared.logger.p7054d.C89885b;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19920au;
import com.google.android.libraries.componentview.components.base.p1687a.C19979cz;
import com.google.android.libraries.componentview.components.base.p1687a.C19981da;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.libraries.componentview.components.base.p1688b.C20033c;
import com.google.android.libraries.componentview.components.base.p1688b.C20035e;
import com.google.android.libraries.componentview.p1675a.p1677b.C19742a;
import com.google.android.libraries.componentview.p1697d.C20470a;
import com.google.android.libraries.componentview.p1697d.C20475f;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20598by;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.common.p4522b.C58480gp;
import com.google.common.p4522b.C58485gu;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import com.google.protobuf.C62971cq;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.base.bz */
/* compiled from: PG */
public class C20068bz extends C20061bs implements C20475f {

    /* renamed from: a */
    private final C20537f f56277a;

    /* renamed from: b */
    private C19981da f56278b;

    /* renamed from: c */
    private C58485gu f56279c;

    /* renamed from: d */
    private boolean f56280d = false;

    public C20068bz(Context context, C56425d dVar, C20537f fVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
        this.f56277a = fVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ View mo25110e(Context context) {
        return new C20035e(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C19981da.f55978w);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        this.f56278b = (C19981da) obj;
        ((C20035e) this.f56305p).setMaxLines(1);
        ((C20035e) this.f56305p).setTextColor(-1);
        mo25241m(this.f56278b);
    }

    /* renamed from: kA */
    public final /* synthetic */ List mo25239kA() {
        return this.f56279c;
    }

    /* renamed from: kB */
    public final void mo25240kB() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo25241m(C19981da daVar) {
        int i;
        MovementMethod movementMethod;
        if ((daVar.f55980a & 64) != 0) {
            C19916aq aqVar = daVar.f55987h;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            mo25249w(aqVar);
        }
        if (!C20482m.m38447o(daVar.f55981b)) {
            C20035e eVar = (C20035e) this.f56305p;
            eVar.f56161a.clear();
            eVar.f56164d.clear();
            eVar.f56162b = false;
            ((C20035e) this.f56305p).setText(daVar.f55981b);
        }
        if ((daVar.f55980a & C89885b.HTTP_VALUE) != 0) {
            ((C20035e) this.f56305p).setHint(daVar.f56000u);
            ((C20035e) this.f56305p).setHintTextColor(-3355444);
        }
        if ((daVar.f55980a & 2) != 0) {
            C20035e eVar2 = (C20035e) this.f56305p;
            C19995r rVar = daVar.f55982c;
            if (rVar == null) {
                rVar = C19995r.f56032g;
            }
            eVar2.setTextColor(C20566at.m38590a(rVar));
        }
        float f = daVar.f55984e;
        if (f != 0.0f) {
            ((C20035e) this.f56305p).setTextSize(f);
        }
        boolean z = daVar.f55991l;
        if (daVar.f55992m) {
            z |= true;
        }
        if (!C20482m.m38447o(daVar.f55983d)) {
            ((C20035e) this.f56305p).setTypeface(Typeface.create(daVar.f55983d, z));
        } else if (z) {
            ((C20035e) this.f56305p).setTypeface(Typeface.create(Typeface.DEFAULT, z ? 1 : 0));
        }
        if (daVar.f55997r) {
            ((C20035e) this.f56305p).setAllCaps(true);
        }
        int i2 = daVar.f55985f;
        if (i2 != 0) {
            ((C20035e) this.f56305p).setMaxLines(i2);
        } else {
            ((C20035e) this.f56305p).setMaxLines(Integer.MAX_VALUE);
        }
        if (daVar.f55993n) {
            ((C20035e) this.f56305p).f56166f = true;
        }
        if (daVar.f55998s) {
            this.f56280d = true;
        }
        C19920au auVar = daVar.f55996q;
        if (auVar == null) {
            auVar = C19920au.f55724b;
        }
        if (C20482m.m38445m(auVar)) {
            C19920au auVar2 = daVar.f55996q;
            if (auVar2 == null) {
                auVar2 = C19920au.f55724b;
            }
            i = C20482m.m38436d(auVar2);
        } else {
            int a = C19979cz.m37785a(daVar.f55986g);
            if (a == 0) {
                a = 1;
            }
            int i3 = a - 1;
            i = i3 != 1 ? i3 != 2 ? 8388611 : 8388613 : 17;
        }
        ((C20035e) this.f56305p).setGravity(i);
        if (!daVar.f55994o) {
            ((C20035e) this.f56305p).setIncludeFontPadding(false);
        }
        float f2 = daVar.f55989j;
        if (!(f2 == 0.0f && daVar.f55990k == 0.0f)) {
            int a2 = (int) (C20482m.m38433a(this.f56304o) * f2);
            float f3 = daVar.f55990k;
            if (f3 == 0.0f) {
                f3 = 1.0f;
            }
            ((C20035e) this.f56305p).setLineSpacing((float) a2, f3);
        }
        View view = this.f56305p;
        C2043bi.m5556aj(view, ((C20035e) view).getPaddingLeft(), ((C20035e) this.f56305p).getPaddingTop() + (((((C20035e) this.f56305p).getLineHeight() - ((C20035e) this.f56305p).getPaint().getFontMetricsInt((Paint.FontMetricsInt) null)) + 1) / 2), ((C20035e) this.f56305p).getPaddingRight(), ((C20035e) this.f56305p).getPaddingBottom() + ((((C20035e) this.f56305p).getLineHeight() - ((C20035e) this.f56305p).getPaint().getFontMetricsInt((Paint.FontMetricsInt) null)) / 2));
        if (daVar.f55995p) {
            ((C20035e) this.f56305p).setTextIsSelectable(true);
        }
        if (daVar.f55999t) {
            ((C20035e) this.f56305p).f56163c = true;
        }
        C62971cq<C56425d> cqVar = daVar.f55988i;
        C58480gp e = C58485gu.m89837e();
        boolean z2 = false;
        for (C56425d a3 : cqVar) {
            C20470a a4 = this.f56277a.mo25450a(this, a3);
            if (a4 == null || !(a4 instanceof C20058bp)) {
                C20598by G = mo25418G();
                G.mo25535e(C19742a.INVALID_CHILD);
                G.mo25536f("TextView has a null span or non-span child");
                G.mo25534d("TextView Component with text : ".concat(String.valueOf(this.f56278b.f55981b)));
                C20520h.m38498c("TextViewComponent", G.mo25531a(), this.f56308s, new Object[0]);
            } else {
                e.mo55395g(a4);
                C20058bp bpVar = (C20058bp) a4;
                SpannableString spannableString = bpVar.f56239f;
                if (bpVar.f56242i) {
                    ((C20035e) this.f56305p).f56165e = spannableString;
                } else {
                    ((C20035e) this.f56305p).mo25208a(spannableString, bpVar.f56241h, bpVar.f56243j);
                }
                if (bpVar.f56240g && !z2) {
                    C20035e eVar3 = (C20035e) this.f56305p;
                    if (this.f56280d) {
                        movementMethod = C20033c.getInstance();
                    } else {
                        movementMethod = LinkMovementMethod.getInstance();
                    }
                    eVar3.setMovementMethod(movementMethod);
                    z2 = true;
                }
            }
        }
        ((C20035e) this.f56305p).mo25209b();
        this.f56279c = e.mo55394f();
    }

    /* renamed from: n */
    public final void mo25242n(String str) {
        ((C20035e) this.f56305p).setText(str);
    }

    /* renamed from: o */
    public final void mo25243o(int i) {
        ((C20035e) this.f56305p).setTextColor(i);
    }
}
