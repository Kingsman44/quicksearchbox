package com.google.android.libraries.componentview.components.p1685b;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;
import com.google.android.libraries.componentview.components.base.C20061bs;
import com.google.android.libraries.componentview.components.base.p1687a.C19904ae;
import com.google.android.libraries.componentview.components.base.p1687a.C19911al;
import com.google.android.libraries.componentview.components.base.p1687a.C19916aq;
import com.google.android.libraries.componentview.components.base.p1687a.C19985h;
import com.google.android.libraries.componentview.components.base.p1687a.C19987j;
import com.google.android.libraries.componentview.components.base.p1687a.C19995r;
import com.google.android.libraries.componentview.components.p1685b.p1686a.C19891c;
import com.google.android.libraries.componentview.components.p1685b.p1686a.C19892d;
import com.google.android.libraries.componentview.p1697d.C20482m;
import com.google.android.libraries.componentview.p1699f.C20520h;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.logging.C28285c;
import com.google.common.p4552o.C60321oe;
import com.google.p4271bq.C56424c;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* renamed from: com.google.android.libraries.componentview.components.b.b */
/* compiled from: PG */
public class C19893b extends C20061bs {

    /* renamed from: a */
    private static final int f55650a = Color.argb(Math.round(221.85f), 0, 0, 0);

    /* renamed from: b */
    private static final int f55651b = Color.argb(Math.round(137.70001f), 0, 0, 0);

    /* renamed from: c */
    private static final int f55652c = Color.argb(Math.round(96.9f), 0, 0, 0);

    /* renamed from: d */
    private final C20601ca f55653d;

    /* renamed from: e */
    private C19888a f55654e;

    public C19893b(Context context, C56425d dVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, caVar);
        this.f55653d = caVar;
    }

    /* renamed from: E */
    private static final int m37752E(C19892d dVar) {
        int a = C19891c.m37751a(dVar.f55643d);
        if (a == 0) {
            a = 1;
        }
        int i = a - 1;
        if (i == 1) {
            return f55650a;
        }
        if (i == 2) {
            return f55651b;
        }
        if (i != 3) {
            return -16777216;
        }
        return f55652c;
    }

    /* renamed from: m */
    public static C56425d m37753m(C19892d dVar) {
        C56424c cVar = (C56424c) C56425d.f150537g.createBuilder();
        cVar.mo58885m(C19892d.f55638l, dVar);
        cVar.copyOnWrite();
        C56425d dVar2 = (C56425d) cVar.instance;
        dVar2.f150539a |= 1;
        dVar2.f150540b = "android-drop-down";
        return (C56425d) cVar.build();
    }

    /* renamed from: A */
    public final void mo25166A(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        ((Spinner) this.f56305p).setOnItemSelectedListener(onItemSelectedListener);
    }

    /* renamed from: B */
    public final void mo25167B(int i) {
        ((Spinner) this.f56305p).setSelection(i);
    }

    /* renamed from: C */
    public final void mo25168C(String str) {
        int position = this.f55654e.getPosition(str);
        if (position >= 0) {
            ((Spinner) this.f56305p).setSelection(position);
        }
    }

    /* renamed from: D */
    public final void mo25169D(List list) {
        this.f55654e.clear();
        this.f55654e.addAll(list);
        this.f55654e.notifyDataSetChanged();
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* bridge */ /* synthetic */ View mo25110e(Context context) {
        if (C20482m.m38444l(context)) {
            return new Spinner(context, 0);
        }
        C20520h.m38497b(5, "DropDownComponent", (Throwable) null, "Did not receive an activity context, spinner will use dropdown instead of dialog", new Object[0]);
        return new Spinner(context, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        int i;
        String str;
        int i2;
        int i3;
        int i4;
        int i5;
        float f;
        int i6;
        C19892d dVar2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        C56425d dVar3 = dVar;
        C62940bt r1 = C62942bv.checkIsLite(C19892d.f55638l);
        dVar3.mo58887l(r1);
        Object l = dVar3.f169962ag.mo58854l(r1.f169971d);
        if (l == null) {
            obj = r1.f169969b;
        } else {
            obj = r1.mo58889c(l);
        }
        C19892d dVar4 = (C19892d) obj;
        ((Spinner) this.f56305p).setClickable(true);
        ((Spinner) this.f56305p).setFocusable(true);
        String[] strArr = new String[0];
        if (dVar4.f55641b.size() != 0) {
            strArr = (String[]) dVar4.f55641b.toArray(new String[0]);
        }
        ArrayList arrayList = new ArrayList(Arrays.asList(strArr));
        int E = m37752E(dVar4);
        if (!dVar4.f55644e) {
            int a = C19985h.m37787a(dVar4.f55645f);
            if (a == 0) {
                a = 1;
            }
            switch (a - 1) {
                case 1:
                    str = "sans-serif-thin";
                    break;
                case 2:
                    str = "sans-serif-light";
                    break;
                case 3:
                    str = "sans-serif";
                    break;
                case 4:
                    str = "sans-serif-medium";
                    break;
                case 5:
                    str = "sans-serif";
                    i = 1;
                    break;
                case 6:
                    str = "sans-serif-black";
                    break;
                default:
                    str = null;
                    break;
            }
        } else {
            int a2 = C19985h.m37787a(dVar4.f55645f);
            str = (a2 != 0 && a2 == 3) ? "sans-serif-condensed-light" : "sans-serif-condensed";
        }
        i = 0;
        Typeface create = str != null ? Typeface.create(str, i) : null;
        int a3 = C19987j.m37788a(dVar4.f55648i);
        if (a3 == 0) {
            a3 = 1;
        }
        int i12 = a3 - 1;
        int i13 = i12 != 1 ? i12 != 2 ? 8388611 : 8388613 : 17;
        if ((dVar4.f55640a & 128) != 0) {
            C19916aq aqVar = dVar4.f55649j;
            if (aqVar == null) {
                aqVar = C19916aq.f55703s;
            }
            if ((aqVar.f55705a & 32) != 0) {
                Context context = this.f56304o;
                C19916aq aqVar2 = dVar4.f55649j;
                if (aqVar2 == null) {
                    aqVar2 = C19916aq.f55703s;
                }
                C19904ae aeVar = aqVar2.f55712h;
                if (aeVar == null) {
                    aeVar = C19904ae.f55685f;
                }
                i10 = (int) (C20482m.m38433a(context) * aeVar.f55691e);
                Context context2 = this.f56304o;
                C19916aq aqVar3 = dVar4.f55649j;
                if (aqVar3 == null) {
                    aqVar3 = C19916aq.f55703s;
                }
                C19904ae aeVar2 = aqVar3.f55712h;
                if (aeVar2 == null) {
                    aeVar2 = C19904ae.f55685f;
                }
                i9 = (int) (C20482m.m38433a(context2) * aeVar2.f55688b);
                Context context3 = this.f56304o;
                C19916aq aqVar4 = dVar4.f55649j;
                if (aqVar4 == null) {
                    aqVar4 = C19916aq.f55703s;
                }
                C19904ae aeVar3 = aqVar4.f55712h;
                if (aeVar3 == null) {
                    aeVar3 = C19904ae.f55685f;
                }
                i8 = (int) (C20482m.m38433a(context3) * aeVar3.f55689c);
                Context context4 = this.f56304o;
                C19916aq aqVar5 = dVar4.f55649j;
                if (aqVar5 == null) {
                    aqVar5 = C19916aq.f55703s;
                }
                C19904ae aeVar4 = aqVar5.f55712h;
                if (aeVar4 == null) {
                    aeVar4 = C19904ae.f55685f;
                }
                i7 = (int) (C20482m.m38433a(context4) * aeVar4.f55690d);
            } else {
                i10 = 0;
                i9 = 0;
                i8 = 0;
                i7 = 0;
            }
            C19916aq aqVar6 = dVar4.f55649j;
            if (((aqVar6 == null ? C19916aq.f55703s : aqVar6).f55705a & 256) != 0) {
                View view = this.f56305p;
                if (aqVar6 == null) {
                    aqVar6 = C19916aq.f55703s;
                }
                int a4 = C19911al.m37775a(aqVar6.f55715k);
                if (a4 == 0) {
                    a4 = 1;
                }
                C20482m.m38448p(view, a4);
            }
            C19916aq aqVar7 = dVar4.f55649j;
            if (((aqVar7 == null ? C19916aq.f55703s : aqVar7).f55705a & 1) != 0) {
                if (aqVar7 == null) {
                    aqVar7 = C19916aq.f55703s;
                }
                C19995r rVar = aqVar7.f55710f;
                if (rVar == null) {
                    rVar = C19995r.f56032g;
                }
                i11 = C20566at.m38590a(rVar);
            } else {
                i11 = 0;
            }
            C19916aq aqVar8 = dVar4.f55649j;
            if (aqVar8 == null) {
                aqVar8 = C19916aq.f55703s;
            }
            if ((aqVar8.f55706b == 2 ? ((Float) aqVar8.f55707c).floatValue() : 0.0f) != 0.0f) {
                Context context5 = this.f56304o;
                C19916aq aqVar9 = dVar4.f55649j;
                if (aqVar9 == null) {
                    aqVar9 = C19916aq.f55703s;
                }
                float floatValue = aqVar9.f55706b == 2 ? ((Float) aqVar9.f55707c).floatValue() : 0.0f;
                i5 = i10;
                i4 = i9;
                i3 = i8;
                i2 = i7;
                i6 = i11;
                f = (float) ((int) (C20482m.m38433a(context5) * floatValue));
            } else {
                i5 = i10;
                i4 = i9;
                i3 = i8;
                i2 = i7;
                i6 = i11;
                f = 0.0f;
            }
        } else {
            i6 = 0;
            f = 0.0f;
            i5 = 0;
            i4 = 0;
            i3 = 0;
            i2 = 0;
        }
        Context context6 = this.f56304o;
        Spinner spinner = (Spinner) this.f56305p;
        C19888a aVar = r0;
        C19892d dVar5 = dVar4;
        C19888a aVar2 = new C19888a(this, context6, arrayList, C20482m.m38444l(context6) ^ true ? 1 : 0, E, i6, dVar4.f55646g, create, i13, dVar4.f55647h, f, i5, i4, i3, i2);
        this.f55654e = aVar;
        ((Spinner) this.f56305p).setAdapter(this.f55654e);
        if (this.f55654e.getCount() > 0) {
            dVar2 = dVar5;
            int i14 = dVar2.f55642c;
            if (i14 >= 0 && i14 < this.f55654e.getCount()) {
                ((Spinner) this.f56305p).setSelection(i14);
            }
        } else {
            dVar2 = dVar5;
        }
        ((Spinner) this.f56305p).setPadding(0, 0, 0, 0);
        ((Spinner) this.f56305p).getBackground().setColorFilter(m37752E(dVar2), PorterDuff.Mode.SRC_ATOP);
    }

    /* renamed from: i */
    public final int mo25170i() {
        return ((Spinner) this.f56305p).getSelectedItemPosition();
    }

    /* renamed from: n */
    public final String mo25171n() {
        return (String) ((Spinner) this.f56305p).getSelectedItem();
    }

    /* renamed from: o */
    public final void mo25172o() {
        C60321oe i = C28285c.m52882i(this.f56305p, 5, (Integer) null);
        if (i != null) {
            this.f55653d.mo25490e(i);
        }
    }
}
