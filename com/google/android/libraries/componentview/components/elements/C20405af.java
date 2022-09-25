package com.google.android.libraries.componentview.components.elements;

import android.content.Context;
import android.text.format.DateUtils;
import android.util.Log;
import android.view.View;
import com.google.android.libraries.componentview.components.base.C20068bz;
import com.google.android.libraries.componentview.components.base.p1687a.C19981da;
import com.google.android.libraries.componentview.components.base.p1687a.C19998u;
import com.google.android.libraries.componentview.components.base.p1687a.C19999v;
import com.google.android.libraries.componentview.components.base.p1688b.C20035e;
import com.google.android.libraries.componentview.components.elements.p1696a.C20389n;
import com.google.android.libraries.componentview.services.application.C20566at;
import com.google.android.libraries.componentview.services.application.C20601ca;
import com.google.android.libraries.componentview.services.p1701a.C20537f;
import com.google.android.libraries.p1730f.C21385h;
import com.google.android.libraries.p1730f.p1731a.C21378h;
import com.google.p4271bq.C56425d;
import com.google.protobuf.C62940bt;
import com.google.protobuf.C62942bv;
import java.util.Formatter;
import java.util.Locale;
import java.util.TimeZone;
import p3186j$.util.DesugarTimeZone;

/* renamed from: com.google.android.libraries.componentview.components.elements.af */
/* compiled from: PG */
public class C20405af extends C20068bz implements C21385h {

    /* renamed from: a */
    private int f57397a;

    /* renamed from: b */
    private String f57398b;

    /* renamed from: c */
    private final StringBuilder f57399c;

    /* renamed from: d */
    private final Formatter f57400d;

    /* renamed from: e */
    private final C21378h f57401e;

    public C20405af(Context context, C56425d dVar, C20537f fVar, C21378h hVar, C20601ca caVar, C20566at atVar) {
        super(context, dVar, fVar, caVar, atVar);
        StringBuilder sb = new StringBuilder();
        this.f57399c = sb;
        this.f57400d = new Formatter(sb);
        this.f57401e = hVar;
    }

    /* renamed from: a */
    public final void mo25386a() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f57399c.setLength(0);
        ((C20035e) this.f56305p).setText(DateUtils.formatDateRange(this.f56304o, this.f57400d, currentTimeMillis, currentTimeMillis, this.f57397a, this.f57398b).toString());
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo25111g(C56425d dVar) {
        Object obj;
        C62940bt r0 = C62942bv.checkIsLite(C20389n.f57335f);
        dVar.mo58887l(r0);
        Object l = dVar.f169962ag.mo58854l(r0.f169971d);
        if (l == null) {
            obj = r0.f169969b;
        } else {
            obj = r0.mo58889c(l);
        }
        C20389n nVar = (C20389n) obj;
        if ((nVar.f57337a & 1) != 0) {
            C19981da daVar = nVar.f57338b;
            if (daVar == null) {
                daVar = C19981da.f55977v;
            }
            mo25241m(daVar);
        }
        if ((nVar.f57337a & 4) != 0) {
            C19999v vVar = nVar.f57340d;
            if (vVar == null) {
                vVar = C19999v.f56041b;
            }
            int i = 0;
            for (int i2 = 0; i2 < vVar.f56043a.size(); i2++) {
                int a = C19998u.m37791a(vVar.f56043a.mo58914d(i2));
                i = (a == 0 || a == 1) ? i | 1 : i | 2;
            }
            this.f57397a = i;
        } else {
            this.f57397a = 3;
        }
        if (!nVar.f57339c.isEmpty()) {
            String str = nVar.f57339c;
            if (str != null && ((str.startsWith("GMT+") || str.startsWith("GMT-")) && str.indexOf(46) > 0)) {
                try {
                    char charAt = str.charAt(3);
                    float abs = Math.abs(Float.parseFloat(str.substring(4))) % 24.0f;
                    str = String.format(Locale.US, "GMT%c%d:%d", new Object[]{Character.valueOf(charAt), Integer.valueOf((int) abs), Integer.valueOf((int) ((abs * 60.0f) % 60.0f))});
                } catch (NumberFormatException unused) {
                    Log.w("ClockUtils", "Invalid time zone: ".concat(str));
                }
            }
            this.f57398b = DesugarTimeZone.getTimeZone(str).getID();
            return;
        }
        this.f57398b = TimeZone.getDefault().getID();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f57401e.mo26881h(this);
        mo25386a();
    }

    public final void onViewDetachedFromWindow(View view) {
        this.f57401e.mo26883j(this);
    }
}
