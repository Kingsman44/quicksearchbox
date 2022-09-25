package com.google.android.apps.search.googleapp.launcher.minusone;

import android.os.Build;
import android.view.View;
import androidx.core.graphics.C1926c;
import androidx.core.p098j.C2010ad;
import androidx.core.p098j.C2071ce;
import androidx.core.p098j.C2072cf;
import androidx.core.p098j.C2073cg;
import androidx.core.p098j.C2082cp;
import androidx.core.p098j.C2097l;
import androidx.core.p098j.C2098m;
import com.google.common.p4522b.C58528ij;
import com.google.common.p4526f.C59052c;
import com.google.common.p4526f.C59071e;
import java.util.Arrays;

/* renamed from: com.google.android.apps.search.googleapp.launcher.minusone.bp */
/* compiled from: PG */
public final class C136609bp implements C2010ad {

    /* renamed from: a */
    private static final C59071e f371877a = C59071e.m91332i("com.google.android.apps.search.googleapp.launcher.minusone.bp");

    /* renamed from: b */
    private final boolean f371878b;

    /* renamed from: c */
    private final boolean f371879c;

    /* renamed from: d */
    private final C58528ij f371880d;

    /* renamed from: e */
    private final int f371881e;

    /* renamed from: f */
    private final int f371882f;

    /* renamed from: g */
    private final int f371883g;

    /* renamed from: h */
    private final int f371884h;

    public C136609bp(View view, boolean z, boolean z2, C136608bo... boVarArr) {
        this.f371881e = view.getPaddingLeft();
        this.f371882f = view.getPaddingTop();
        this.f371883g = view.getPaddingRight();
        this.f371884h = view.getPaddingBottom();
        this.f371878b = z;
        this.f371879c = z2;
        this.f371880d = C58528ij.m90006F(Arrays.asList(boVarArr));
    }

    /* renamed from: a */
    public final C2082cp mo1337a(View view, C2082cp cpVar) {
        int i;
        int i2;
        int i3;
        C2073cg cgVar;
        C2082cp cpVar2 = cpVar;
        int i4 = this.f371881e;
        int i5 = this.f371882f;
        int i6 = this.f371883g;
        int i7 = this.f371884h;
        int i8 = 0;
        int b = this.f371880d.contains(C136608bo.LEFT) ? cpVar.mo5240b() : 0;
        int d = this.f371880d.contains(C136608bo.TOP) ? cpVar.mo5242d() : 0;
        int c = this.f371880d.contains(C136608bo.RIGHT) ? cpVar.mo5241c() : 0;
        int a = this.f371880d.contains(C136608bo.BOTTOM) ? cpVar.mo5239a() : 0;
        C59071e eVar = f371877a;
        ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(40728)).mo56389s("onApplyWindowInsets: systemWindowInsets=%s", cpVar2.f5994b.mo5219d());
        C2098m q = cpVar2.f5994b.mo5234q();
        if (!this.f371879c || q == null) {
            i3 = i4 + b;
            i2 = i5 + d;
            i = i6 + c;
        } else {
            ((C59052c) ((C59052c) eVar.mo56224b()).mo56372aa(40729)).mo56360M("onApplyWindowInsets: Adjusting for display cutouts. Safe insets: left=%d, top=%d, right=%d, bottom=%d", Integer.valueOf(C2097l.m5778b(q.f6013a)), Integer.valueOf(C2097l.m5780d(q.f6013a)), Integer.valueOf(C2097l.m5779c(q.f6013a)), Integer.valueOf(C2097l.m5777a(q.f6013a)));
            int b2 = this.f371880d.contains(C136608bo.LEFT) ? C2097l.m5778b(q.f6013a) : 0;
            int c2 = this.f371880d.contains(C136608bo.RIGHT) ? C2097l.m5779c(q.f6013a) : 0;
            i3 = i4 + Math.max(b, b2);
            i2 = i5 + d;
            i = i6 + Math.max(c, c2);
        }
        view.setPadding(i3, i2, i, i7 + a);
        if (!this.f371878b) {
            return cpVar2;
        }
        if (Build.VERSION.SDK_INT >= 30) {
            cgVar = new C2072cf(cpVar2);
        } else {
            cgVar = new C2071ce(cpVar2);
        }
        int b3 = this.f371880d.contains(C136608bo.LEFT) ? 0 : cpVar.mo5240b();
        int d2 = this.f371880d.contains(C136608bo.TOP) ? 0 : cpVar.mo5242d();
        int c3 = this.f371880d.contains(C136608bo.RIGHT) ? 0 : cpVar.mo5241c();
        if (!this.f371880d.contains(C136608bo.BOTTOM)) {
            i8 = cpVar.mo5239a();
        }
        cgVar.mo5212e(C1926c.m5198d(b3, d2, c3, i8));
        return cgVar.mo5208a();
    }
}
